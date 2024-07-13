package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import com.onesignal.OneSignalStateSynchronizer;
import java.util.HashMap;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

abstract class UserStateSynchronizer {
    protected static final String ANDROID_PERMISSION = "androidPermission";
    static final String APP_ID = "app_id";
    private static final String CURRENT_STATE = "CURRENT_STATE";
    protected static final String DEVICE_PLAYER_ID = "device_player_id";
    protected static final String DEVICE_TYPE = "device_type";
    static final String EMAIL_AUTH_HASH_KEY = "email_auth_hash";
    protected static final String EMAIL_KEY = "email";
    private static final String ERRORS = "errors";
    protected static final String EXTERNAL_USER_ID = "external_user_id";
    static final String EXTERNAL_USER_ID_AUTH_HASH = "external_user_id_auth_hash";
    private static final String ID = "id";
    protected static final String IDENTIFIER = "identifier";
    protected static final String LANGUAGE = "language";
    protected static final String LOGOUT_EMAIL = "logoutEmail";
    protected static final String PARENT_PLAYER_ID = "parent_player_id";
    private static final String SESSION = "session";
    static final String SMS_AUTH_HASH_KEY = "sms_auth_hash";
    protected static final String SMS_NUMBER_KEY = "sms_number";
    protected static final String SUBSCRIBABLE_STATUS = "subscribableStatus";
    protected static final String TAGS = "tags";
    private static final String TOSYNC_STATE = "TOSYNC_STATE";
    protected static final String USER_SUBSCRIBE_PREF = "userSubscribePref";
    protected final Object LOCK = new Object();
    /* access modifiers changed from: private */
    public boolean canMakeUpdates;
    /* access modifiers changed from: private */
    public OneSignalStateSynchronizer.UserStateSynchronizerType channel;
    private UserState currentUserState;
    private final Queue<OneSignalStateSynchronizer.OSDeviceInfoCompletionHandler> deviceInfoCompletionHandler = new ConcurrentLinkedQueue();
    private final Queue<OneSignal.OSInternalExternalUserIdUpdateCompletionHandler> externalUserIdUpdateHandlers = new ConcurrentLinkedQueue();
    private final Object networkHandlerSyncLock = new Object() {
    };
    HashMap<Integer, NetworkHandlerThread> networkHandlerThreads = new HashMap<>();
    /* access modifiers changed from: private */
    public AtomicBoolean runningSyncUserState = new AtomicBoolean();
    private final Queue<OneSignal.ChangeTagsUpdateHandler> sendTagsHandlers = new ConcurrentLinkedQueue();
    private UserState toSyncUserState;
    protected boolean waitingForSessionResponse = false;

    /* access modifiers changed from: protected */
    public abstract void addOnSessionOrCreateExtras(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public abstract void fireEventsForUpdateFailure(JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    public abstract String getExternalId(boolean z);

    /* access modifiers changed from: protected */
    public abstract String getId();

    /* access modifiers changed from: protected */
    public abstract OneSignal.LOG_LEVEL getLogLevel();

    /* access modifiers changed from: package-private */
    public abstract boolean getSubscribed();

    /* access modifiers changed from: package-private */
    public abstract GetTagsResult getTags(boolean z);

    public abstract boolean getUserSubscribePreference();

    /* access modifiers changed from: package-private */
    public abstract void logoutChannel();

    /* access modifiers changed from: protected */
    public abstract UserState newUserState(String str, boolean z);

    /* access modifiers changed from: protected */
    public abstract void onSuccessfulSync(JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    public abstract void saveChannelId(String str);

    /* access modifiers changed from: protected */
    public abstract void scheduleSyncToServer();

    public abstract void setPermission(boolean z);

    /* access modifiers changed from: package-private */
    public abstract void setSubscription(boolean z);

    /* access modifiers changed from: package-private */
    public abstract void updateIdDependents(String str);

    /* access modifiers changed from: package-private */
    public abstract void updateState(JSONObject jSONObject);

    UserStateSynchronizer(OneSignalStateSynchronizer.UserStateSynchronizerType userStateSynchronizerType) {
        this.channel = userStateSynchronizerType;
    }

    /* access modifiers changed from: package-private */
    public OneSignalStateSynchronizer.UserStateSynchronizerType getChannelType() {
        return this.channel;
    }

    /* access modifiers changed from: package-private */
    public String getChannelString() {
        return this.channel.name().toLowerCase();
    }

    static class GetTagsResult {
        JSONObject result;
        boolean serverSuccess;

        GetTagsResult(boolean z, JSONObject jSONObject) {
            this.serverSuccess = z;
            this.result = jSONObject;
        }
    }

    /* access modifiers changed from: package-private */
    public String getRegistrationId() {
        return getToSyncUserState().getSyncValues().optString(IDENTIFIER, (String) null);
    }

    /* access modifiers changed from: package-private */
    public boolean hasQueuedHandlers() {
        return this.externalUserIdUpdateHandlers.size() > 0;
    }

    class NetworkHandlerThread extends HandlerThread {
        static final int MAX_RETRIES = 3;
        static final int NETWORK_CALL_DELAY_TO_BUFFER_MS = 5000;
        protected static final int NETWORK_HANDLER_USERSTATE = 0;
        private static final String THREAD_NAME_PREFIX = "OSH_NetworkHandlerThread_";
        int currentRetry;
        Handler mHandler = new Handler(getLooper());
        int mType;

        NetworkHandlerThread(int i) {
            super(THREAD_NAME_PREFIX + UserStateSynchronizer.this.channel);
            this.mType = i;
            start();
        }

        /* access modifiers changed from: package-private */
        public void runNewJobDelayed() {
            if (UserStateSynchronizer.this.canMakeUpdates) {
                synchronized (this.mHandler) {
                    this.currentRetry = 0;
                    this.mHandler.removeCallbacksAndMessages((Object) null);
                    this.mHandler.postDelayed(getNewRunnable(), 5000);
                }
            }
        }

        private Runnable getNewRunnable() {
            if (this.mType != 0) {
                return null;
            }
            return new Runnable() {
                public void run() {
                    if (!UserStateSynchronizer.this.runningSyncUserState.get()) {
                        UserStateSynchronizer.this.syncUserState(false);
                    }
                }
            };
        }

        /* access modifiers changed from: package-private */
        public void stopScheduledRunnable() {
            this.mHandler.removeCallbacksAndMessages((Object) null);
        }

        /* access modifiers changed from: package-private */
        public boolean doRetry() {
            boolean hasMessages;
            synchronized (this.mHandler) {
                boolean z = this.currentRetry < 3;
                boolean hasMessages2 = this.mHandler.hasMessages(0);
                if (z && !hasMessages2) {
                    this.currentRetry++;
                    this.mHandler.postDelayed(getNewRunnable(), (long) (this.currentRetry * 15000));
                }
                hasMessages = this.mHandler.hasMessages(0);
            }
            return hasMessages;
        }
    }

    /* access modifiers changed from: protected */
    public JSONObject generateJsonDiff(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject generateJsonDiff;
        synchronized (this.LOCK) {
            generateJsonDiff = JSONUtils.generateJsonDiff(jSONObject, jSONObject2, jSONObject3, set);
        }
        return generateJsonDiff;
    }

    /* access modifiers changed from: protected */
    public UserState getCurrentUserState() {
        if (this.currentUserState == null) {
            synchronized (this.LOCK) {
                if (this.currentUserState == null) {
                    this.currentUserState = newUserState(CURRENT_STATE, true);
                }
            }
        }
        return this.currentUserState;
    }

    /* access modifiers changed from: protected */
    public UserState getToSyncUserState() {
        if (this.toSyncUserState == null) {
            synchronized (this.LOCK) {
                if (this.toSyncUserState == null) {
                    this.toSyncUserState = newUserState(TOSYNC_STATE, true);
                }
            }
        }
        return this.toSyncUserState;
    }

    /* access modifiers changed from: package-private */
    public void initUserState() {
        if (this.currentUserState == null) {
            synchronized (this.LOCK) {
                if (this.currentUserState == null) {
                    this.currentUserState = newUserState(CURRENT_STATE, true);
                }
            }
        }
        getToSyncUserState();
    }

    /* access modifiers changed from: package-private */
    public void clearLocation() {
        getToSyncUserState().clearLocation();
        getToSyncUserState().persistState();
    }

    /* access modifiers changed from: package-private */
    public boolean persist() {
        boolean z = false;
        if (this.toSyncUserState == null) {
            return false;
        }
        synchronized (this.LOCK) {
            if (getCurrentUserState().generateJsonDiff(this.toSyncUserState, isSessionCall()) != null) {
                z = true;
            }
            this.toSyncUserState.persistState();
        }
        return z;
    }

    private boolean isSessionCall() {
        return (getToSyncUserState().getDependValues().optBoolean("session") || getId() == null) && !this.waitingForSessionResponse;
    }

    private boolean syncEmailLogout() {
        return getToSyncUserState().getDependValues().optBoolean(LOGOUT_EMAIL, false);
    }

    /* access modifiers changed from: package-private */
    public void syncUserState(boolean z) {
        this.runningSyncUserState.set(true);
        internalSyncUserState(z);
        this.runningSyncUserState.set(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r9 != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        doPutSync(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        doCreateOrNewSession(r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void internalSyncUserState(boolean r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.getId()
            boolean r1 = r8.syncEmailLogout()
            if (r1 == 0) goto L_0x0010
            if (r0 == 0) goto L_0x0010
            r8.doEmailLogout(r0)
            return
        L_0x0010:
            com.onesignal.UserState r1 = r8.currentUserState
            if (r1 != 0) goto L_0x0017
            r8.initUserState()
        L_0x0017:
            if (r9 != 0) goto L_0x0021
            boolean r9 = r8.isSessionCall()
            if (r9 == 0) goto L_0x0021
            r9 = 1
            goto L_0x0022
        L_0x0021:
            r9 = 0
        L_0x0022:
            java.lang.Object r1 = r8.LOCK
            monitor-enter(r1)
            com.onesignal.UserState r2 = r8.getCurrentUserState()     // Catch:{ all -> 0x0082 }
            com.onesignal.UserState r3 = r8.getToSyncUserState()     // Catch:{ all -> 0x0082 }
            org.json.JSONObject r2 = r2.generateJsonDiff(r3, r9)     // Catch:{ all -> 0x0082 }
            com.onesignal.UserState r3 = r8.getToSyncUserState()     // Catch:{ all -> 0x0082 }
            com.onesignal.UserState r4 = r8.getCurrentUserState()     // Catch:{ all -> 0x0082 }
            r5 = 0
            org.json.JSONObject r3 = r4.generateJsonDiffFromDependValues(r3, r5)     // Catch:{ all -> 0x0082 }
            com.onesignal.OneSignal$LOG_LEVEL r4 = com.onesignal.OneSignal.LOG_LEVEL.DEBUG     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r6.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = "UserStateSynchronizer internalSyncUserState from session call: "
            r6.append(r7)     // Catch:{ all -> 0x0082 }
            r6.append(r9)     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = " jsonBody: "
            r6.append(r7)     // Catch:{ all -> 0x0082 }
            r6.append(r2)     // Catch:{ all -> 0x0082 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0082 }
            com.onesignal.OneSignal.onesignalLog(r4, r6)     // Catch:{ all -> 0x0082 }
            if (r2 != 0) goto L_0x0070
            com.onesignal.UserState r9 = r8.getCurrentUserState()     // Catch:{ all -> 0x0082 }
            r9.persistStateAfterSync(r3, r5)     // Catch:{ all -> 0x0082 }
            r8.sendTagsHandlersPerformOnSuccess()     // Catch:{ all -> 0x0082 }
            r8.externalUserIdUpdateHandlersPerformOnSuccess()     // Catch:{ all -> 0x0082 }
            r8.deviceInfoHandlersPerformOnSuccess()     // Catch:{ all -> 0x0082 }
            monitor-exit(r1)     // Catch:{ all -> 0x0082 }
            return
        L_0x0070:
            com.onesignal.UserState r4 = r8.getToSyncUserState()     // Catch:{ all -> 0x0082 }
            r4.persistState()     // Catch:{ all -> 0x0082 }
            monitor-exit(r1)     // Catch:{ all -> 0x0082 }
            if (r9 != 0) goto L_0x007e
            r8.doPutSync(r0, r2, r3)
            goto L_0x0081
        L_0x007e:
            r8.doCreateOrNewSession(r0, r2, r3)
        L_0x0081:
            return
        L_0x0082:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0082 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.UserStateSynchronizer.internalSyncUserState(boolean):void");
    }

    private void doEmailLogout(String str) {
        String str2 = "players/" + str + "/email_logout";
        JSONObject jSONObject = new JSONObject();
        try {
            ImmutableJSONObject dependValues = getCurrentUserState().getDependValues();
            if (dependValues.has(EMAIL_AUTH_HASH_KEY)) {
                jSONObject.put(EMAIL_AUTH_HASH_KEY, dependValues.optString(EMAIL_AUTH_HASH_KEY));
            }
            ImmutableJSONObject syncValues = getCurrentUserState().getSyncValues();
            if (syncValues.has(PARENT_PLAYER_ID)) {
                jSONObject.put(PARENT_PLAYER_ID, syncValues.optString(PARENT_PLAYER_ID));
            }
            jSONObject.put("app_id", syncValues.optString("app_id"));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        OneSignalRestClient.postSync(str2, jSONObject, new OneSignalRestClient.ResponseHandler() {
            /* access modifiers changed from: package-private */
            public void onFailure(int i, String str, Throwable th) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.WARN;
                OneSignal.Log(log_level, "Failed last request. statusCode: " + i + "\nresponse: " + str);
                if (UserStateSynchronizer.this.response400WithErrorsContaining(i, str, "already logged out of email")) {
                    UserStateSynchronizer.this.logoutEmailSyncSuccess();
                } else if (UserStateSynchronizer.this.response400WithErrorsContaining(i, str, "not a valid device_type")) {
                    UserStateSynchronizer.this.handlePlayerDeletedFromServer();
                } else {
                    UserStateSynchronizer.this.handleNetworkFailure(i);
                }
            }

            /* access modifiers changed from: package-private */
            public void onSuccess(String str) {
                UserStateSynchronizer.this.logoutEmailSyncSuccess();
            }
        });
    }

    /* access modifiers changed from: private */
    public void logoutEmailSyncSuccess() {
        getToSyncUserState().removeFromDependValues(LOGOUT_EMAIL);
        this.toSyncUserState.removeFromDependValues(EMAIL_AUTH_HASH_KEY);
        this.toSyncUserState.removeFromSyncValues(PARENT_PLAYER_ID);
        this.toSyncUserState.removeFromSyncValues("email");
        this.toSyncUserState.persistState();
        getCurrentUserState().removeFromDependValues(EMAIL_AUTH_HASH_KEY);
        getCurrentUserState().removeFromSyncValues(PARENT_PLAYER_ID);
        String optString = getCurrentUserState().getSyncValues().optString("email");
        getCurrentUserState().removeFromSyncValues("email");
        OneSignalStateSynchronizer.setNewSessionForEmail();
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.INFO;
        OneSignal.Log(log_level, "Device successfully logged out of email: " + optString);
        OneSignal.handleSuccessfulEmailLogout();
    }

    private void doPutSync(String str, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (str == null) {
            OneSignal.onesignalLog(getLogLevel(), "Error updating the user record because of the null user id");
            sendTagsHandlersPerformOnFailure(new OneSignal.SendTagsError(-1, "Unable to update tags: the current user is not registered with OneSignal"));
            externalUserIdUpdateHandlersPerformOnFailure();
            deviceInfoHandlersPerformOnFailure(new OneSignalStateSynchronizer.OSDeviceInfoError(-1, "Unable to set Language: the current user is not registered with OneSignal"));
            return;
        }
        OneSignalRestClient.putSync("players/" + str, jSONObject, new OneSignalRestClient.ResponseHandler() {
            /* access modifiers changed from: package-private */
            public void onFailure(int i, String str, Throwable th) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                OneSignal.Log(log_level, "Failed PUT sync request with status code: " + i + " and response: " + str);
                synchronized (UserStateSynchronizer.this.LOCK) {
                    if (UserStateSynchronizer.this.response400WithErrorsContaining(i, str, "No user with this id found")) {
                        UserStateSynchronizer.this.handlePlayerDeletedFromServer();
                    } else {
                        UserStateSynchronizer.this.handleNetworkFailure(i);
                    }
                }
                if (jSONObject.has("tags")) {
                    UserStateSynchronizer.this.sendTagsHandlersPerformOnFailure(new OneSignal.SendTagsError(i, str));
                }
                if (jSONObject.has(UserStateSynchronizer.EXTERNAL_USER_ID)) {
                    OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.ERROR;
                    OneSignal.onesignalLog(log_level2, "Error setting external user id for push with status code: " + i + " and message: " + str);
                    UserStateSynchronizer.this.externalUserIdUpdateHandlersPerformOnFailure();
                }
                if (jSONObject.has(UserStateSynchronizer.LANGUAGE)) {
                    UserStateSynchronizer.this.deviceInfoHandlersPerformOnFailure(new OneSignalStateSynchronizer.OSDeviceInfoError(i, str));
                }
            }

            /* access modifiers changed from: package-private */
            public void onSuccess(String str) {
                synchronized (UserStateSynchronizer.this.LOCK) {
                    UserStateSynchronizer.this.getCurrentUserState().persistStateAfterSync(jSONObject2, jSONObject);
                    UserStateSynchronizer.this.onSuccessfulSync(jSONObject);
                }
                if (jSONObject.has("tags")) {
                    UserStateSynchronizer.this.sendTagsHandlersPerformOnSuccess();
                }
                if (jSONObject.has(UserStateSynchronizer.EXTERNAL_USER_ID)) {
                    UserStateSynchronizer.this.externalUserIdUpdateHandlersPerformOnSuccess();
                }
                if (jSONObject.has(UserStateSynchronizer.LANGUAGE)) {
                    UserStateSynchronizer.this.deviceInfoHandlersPerformOnSuccess();
                }
            }
        });
    }

    private void doCreateOrNewSession(final String str, final JSONObject jSONObject, final JSONObject jSONObject2) {
        String str2;
        if (str == null) {
            str2 = "players";
        } else {
            str2 = "players/" + str + "/on_session";
        }
        this.waitingForSessionResponse = true;
        addOnSessionOrCreateExtras(jSONObject);
        OneSignalRestClient.postSync(str2, jSONObject, new OneSignalRestClient.ResponseHandler() {
            /* access modifiers changed from: package-private */
            public void onFailure(int i, String str, Throwable th) {
                synchronized (UserStateSynchronizer.this.LOCK) {
                    UserStateSynchronizer.this.waitingForSessionResponse = false;
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.WARN;
                    OneSignal.Log(log_level, "Failed last request. statusCode: " + i + "\nresponse: " + str);
                    if (UserStateSynchronizer.this.response400WithErrorsContaining(i, str, "not a valid device_type")) {
                        UserStateSynchronizer.this.handlePlayerDeletedFromServer();
                    } else {
                        UserStateSynchronizer.this.handleNetworkFailure(i);
                    }
                }
            }

            /* access modifiers changed from: package-private */
            public void onSuccess(String str) {
                synchronized (UserStateSynchronizer.this.LOCK) {
                    UserStateSynchronizer.this.waitingForSessionResponse = false;
                    UserStateSynchronizer.this.getCurrentUserState().persistStateAfterSync(jSONObject2, jSONObject);
                    try {
                        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                        OneSignal.onesignalLog(log_level, "doCreateOrNewSession:response: " + str);
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("id")) {
                            String optString = jSONObject.optString("id");
                            UserStateSynchronizer.this.updateIdDependents(optString);
                            OneSignal.LOG_LEVEL log_level2 = OneSignal.LOG_LEVEL.INFO;
                            OneSignal.Log(log_level2, "Device registered, UserId = " + optString);
                        } else {
                            OneSignal.LOG_LEVEL log_level3 = OneSignal.LOG_LEVEL.INFO;
                            OneSignal.Log(log_level3, "session sent, UserId = " + str);
                        }
                        UserStateSynchronizer.this.getUserStateForModification().putOnDependValues("session", false);
                        UserStateSynchronizer.this.getUserStateForModification().persistState();
                        if (jSONObject.has(OSInAppMessageController.IN_APP_MESSAGES_JSON_KEY)) {
                            OneSignal.getInAppMessageController().receivedInAppMessageJson(jSONObject.getJSONArray(OSInAppMessageController.IN_APP_MESSAGES_JSON_KEY));
                        }
                        UserStateSynchronizer.this.onSuccessfulSync(jSONObject);
                    } catch (JSONException e2) {
                        OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "ERROR parsing on_session or create JSON Response.", e2);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void handleNetworkFailure(int i) {
        if (i == 403) {
            OneSignal.Log(OneSignal.LOG_LEVEL.FATAL, "403 error updating player, omitting further retries!");
            fireNetworkFailureEvents();
        } else if (!getNetworkHandlerThread(0).doRetry()) {
            fireNetworkFailureEvents();
        }
    }

    private void fireNetworkFailureEvents() {
        JSONObject generateJsonDiff = getCurrentUserState().generateJsonDiff(this.toSyncUserState, false);
        if (generateJsonDiff != null) {
            fireEventsForUpdateFailure(generateJsonDiff);
        }
        if (getToSyncUserState().getDependValues().optBoolean(LOGOUT_EMAIL, false)) {
            OneSignal.handleFailedEmailLogout();
        }
    }

    /* access modifiers changed from: private */
    public boolean response400WithErrorsContaining(int i, String str, String str2) {
        if (i == 400 && str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has(ERRORS) || !jSONObject.optString(ERRORS).contains(str2)) {
                    return false;
                }
                return true;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public NetworkHandlerThread getNetworkHandlerThread(Integer num) {
        NetworkHandlerThread networkHandlerThread;
        synchronized (this.networkHandlerSyncLock) {
            if (!this.networkHandlerThreads.containsKey(num)) {
                this.networkHandlerThreads.put(num, new NetworkHandlerThread(num.intValue()));
            }
            networkHandlerThread = this.networkHandlerThreads.get(num);
        }
        return networkHandlerThread;
    }

    /* access modifiers changed from: protected */
    public UserState getUserStateForModification() {
        if (this.toSyncUserState == null) {
            this.toSyncUserState = getCurrentUserState().deepClone(TOSYNC_STATE);
        }
        scheduleSyncToServer();
        return this.toSyncUserState;
    }

    /* access modifiers changed from: package-private */
    public void updateDeviceInfo(JSONObject jSONObject, OneSignalStateSynchronizer.OSDeviceInfoCompletionHandler oSDeviceInfoCompletionHandler) {
        if (oSDeviceInfoCompletionHandler != null) {
            this.deviceInfoCompletionHandler.add(oSDeviceInfoCompletionHandler);
        }
        getUserStateForModification().generateJsonDiffFromIntoSyncValued(jSONObject, (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    public void setNewSession() {
        try {
            synchronized (this.LOCK) {
                getUserStateForModification().putOnDependValues("session", true);
                getUserStateForModification().persistState();
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean getSyncAsNewSession() {
        return getUserStateForModification().getDependValues().optBoolean("session");
    }

    /* access modifiers changed from: package-private */
    public void sendTags(JSONObject jSONObject, OneSignal.ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        if (changeTagsUpdateHandler != null) {
            this.sendTagsHandlers.add(changeTagsUpdateHandler);
        }
        getUserStateForModification().generateJsonDiffFromIntoSyncValued(jSONObject, (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    public void syncHashedEmail(JSONObject jSONObject) {
        getUserStateForModification().generateJsonDiffFromIntoSyncValued(jSONObject, (Set<String>) null);
    }

    /* access modifiers changed from: package-private */
    public void setExternalUserId(String str, String str2, OneSignal.OSInternalExternalUserIdUpdateCompletionHandler oSInternalExternalUserIdUpdateCompletionHandler) throws JSONException {
        if (oSInternalExternalUserIdUpdateCompletionHandler != null) {
            this.externalUserIdUpdateHandlers.add(oSInternalExternalUserIdUpdateCompletionHandler);
        }
        UserState userStateForModification = getUserStateForModification();
        userStateForModification.putOnSyncValues(EXTERNAL_USER_ID, str);
        if (str2 != null) {
            userStateForModification.putOnSyncValues(EXTERNAL_USER_ID_AUTH_HASH, str2);
        }
    }

    /* access modifiers changed from: private */
    public void handlePlayerDeletedFromServer() {
        OneSignal.Log(OneSignal.LOG_LEVEL.WARN, "Creating new player based on missing player_id noted above.");
        OneSignal.handleSuccessfulEmailLogout();
        resetCurrentState();
        updateIdDependents((String) null);
        scheduleSyncToServer();
    }

    /* access modifiers changed from: package-private */
    public void resetCurrentState() {
        getCurrentUserState().setSyncValues(new JSONObject());
        getCurrentUserState().persistState();
    }

    /* access modifiers changed from: package-private */
    public void updateLocation(LocationController.LocationPoint locationPoint) {
        getUserStateForModification().setLocation(locationPoint);
    }

    /* access modifiers changed from: package-private */
    public void sendPurchases(JSONObject jSONObject, OneSignalRestClient.ResponseHandler responseHandler) {
        OneSignalRestClient.post("players/" + getId() + "/on_purchase", jSONObject, responseHandler);
    }

    /* access modifiers changed from: package-private */
    public void readyToUpdate(boolean z) {
        boolean z2 = this.canMakeUpdates != z;
        this.canMakeUpdates = z;
        if (z2 && z) {
            scheduleSyncToServer();
        }
    }

    /* access modifiers changed from: private */
    public void sendTagsHandlersPerformOnSuccess() {
        JSONObject jSONObject = OneSignalStateSynchronizer.getTags(false).result;
        while (true) {
            OneSignal.ChangeTagsUpdateHandler poll = this.sendTagsHandlers.poll();
            if (poll != null) {
                poll.onSuccess(jSONObject);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void sendTagsHandlersPerformOnFailure(OneSignal.SendTagsError sendTagsError) {
        while (true) {
            OneSignal.ChangeTagsUpdateHandler poll = this.sendTagsHandlers.poll();
            if (poll != null) {
                poll.onFailure(sendTagsError);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void externalUserIdUpdateHandlersPerformOnSuccess() {
        while (true) {
            OneSignal.OSInternalExternalUserIdUpdateCompletionHandler poll = this.externalUserIdUpdateHandlers.poll();
            if (poll != null) {
                poll.onComplete(getChannelString(), true);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void externalUserIdUpdateHandlersPerformOnFailure() {
        while (true) {
            OneSignal.OSInternalExternalUserIdUpdateCompletionHandler poll = this.externalUserIdUpdateHandlers.poll();
            if (poll != null) {
                poll.onComplete(getChannelString(), false);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void deviceInfoHandlersPerformOnSuccess() {
        String language = OneSignalStateSynchronizer.getLanguage();
        while (true) {
            OneSignalStateSynchronizer.OSDeviceInfoCompletionHandler poll = this.deviceInfoCompletionHandler.poll();
            if (poll != null) {
                poll.onSuccess(language);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public void deviceInfoHandlersPerformOnFailure(OneSignalStateSynchronizer.OSDeviceInfoError oSDeviceInfoError) {
        while (true) {
            OneSignalStateSynchronizer.OSDeviceInfoCompletionHandler poll = this.deviceInfoCompletionHandler.poll();
            if (poll != null) {
                poll.onFailure(oSDeviceInfoError);
            } else {
                return;
            }
        }
    }
}
