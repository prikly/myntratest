package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.appnext.core.a.b;
import com.onesignal.LocationController;
import com.onesignal.OSNotificationAction;
import com.onesignal.OSNotificationDataController;
import com.onesignal.OSSessionManager;
import com.onesignal.OneSignalDbContract;
import com.onesignal.OneSignalRemoteParams;
import com.onesignal.OneSignalRestClient;
import com.onesignal.OneSignalStateSynchronizer;
import com.onesignal.PushRegistrator;
import com.onesignal.PushRegistratorFCM;
import com.onesignal.UserStateSynchronizer;
import com.onesignal.influence.data.OSTrackerFactory;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.language.LanguageContext;
import com.onesignal.language.LanguageProviderAppDefined;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.onesignal.outcomes.data.OSOutcomeEventsFactory;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OneSignal {
    static final long MIN_ON_SESSION_TIME_MILLIS = 30000;
    private static final String VERSION = "040805";
    /* access modifiers changed from: private */
    public static boolean androidParamsRequestStarted;
    private static OneSignalAPIClient apiClient = new OneSignalRestClientWrapper();
    static WeakReference<Activity> appActivity;
    static Context appContext;
    private static AppEntryAction appEntryState = AppEntryAction.APP_CLOSE;
    static String appId;
    private static OSEmailSubscriptionState currentEmailSubscriptionState;
    private static OSPermissionState currentPermissionState;
    private static OSSMSSubscriptionState currentSMSSubscriptionState;
    private static OSSubscriptionState currentSubscriptionState;
    private static DelayedConsentInitializationParameters delayedInitParams;
    private static String emailId = null;
    private static EmailUpdateHandler emailLogoutHandler;
    private static OSObservable<OSEmailSubscriptionObserver, OSEmailSubscriptionStateChanges> emailSubscriptionStateChangesObserver;
    private static EmailUpdateHandler emailUpdateHandler;
    private static List<EntryStateListener> entryStateListeners = new ArrayList();
    private static FocusTimeController focusTimeController;
    /* access modifiers changed from: private */
    public static boolean getTagsCall;
    static String googleProjectNumber;
    private static IAPUpdateJob iapUpdateJob;
    static OSInAppMessageClickHandler inAppMessageClickHandler;
    private static OSInAppMessageControllerFactory inAppMessageControllerFactory = new OSInAppMessageControllerFactory();
    private static boolean inForeground;
    private static boolean initDone;
    static LanguageContext languageContext = null;
    static OSEmailSubscriptionState lastEmailSubscriptionState;
    /* access modifiers changed from: private */
    public static LocationController.LocationPoint lastLocationPoint;
    static OSPermissionState lastPermissionState;
    /* access modifiers changed from: private */
    public static String lastRegistrationId;
    static OSSMSSubscriptionState lastSMSSubscriptionState;
    static OSSubscriptionState lastSubscriptionState;
    /* access modifiers changed from: private */
    public static boolean locationFired;
    private static LOG_LEVEL logCatLevel = LOG_LEVEL.WARN;
    /* access modifiers changed from: private */
    public static OSLogger logger = new OSLogWrapper();
    private static PushRegistrator mPushRegistrator;
    private static OSNotificationDataController notificationDataController;
    static OSNotificationOpenedHandler notificationOpenedHandler;
    static OSNotificationWillShowInForegroundHandler notificationWillShowInForegroundHandler;
    private static OSUtils osUtils = new OSUtils();
    /* access modifiers changed from: private */
    public static OSOutcomeEventsController outcomeEventsController;
    private static final Object outcomeEventsControllerSyncLock = new Object() {
    };
    private static OSOutcomeEventsFactory outcomeEventsFactory;
    /* access modifiers changed from: private */
    public static final ArrayList<OSGetTagsHandler> pendingGetTagsHandlers = new ArrayList<>();
    private static OSObservable<OSPermissionObserver, OSPermissionStateChanges> permissionStateChangesObserver;
    private static HashSet<String> postedOpenedNotifIds = new HashSet<>();
    /* access modifiers changed from: private */
    public static OSSharedPreferences preferences;
    /* access modifiers changed from: private */
    public static boolean registerForPushFired;
    static OSRemoteNotificationReceivedHandler remoteNotificationReceivedHandler;
    /* access modifiers changed from: private */
    public static OSRemoteParamController remoteParamController = new OSRemoteParamController();
    public static String sdkType = "native";
    private static OSSessionManager.SessionListener sessionListener = new OSSessionManager.SessionListener() {
        public void onSessionEnding(List<OSInfluence> list) {
            if (OneSignal.outcomeEventsController == null) {
                OneSignal.Log(LOG_LEVEL.WARN, "OneSignal onSessionEnding called before init!");
            }
            if (OneSignal.outcomeEventsController != null) {
                OneSignal.outcomeEventsController.cleanOutcomes();
            }
            OneSignal.getFocusTimeController().onSessionEnded(list);
        }
    };
    private static OSSessionManager sessionManager;
    private static String smsId = null;
    private static OSSMSUpdateHandler smsLogoutHandler;
    private static OSObservable<OSSMSSubscriptionObserver, OSSMSSubscriptionStateChanges> smsSubscriptionStateChangesObserver;
    private static OSSMSUpdateHandler smsUpdateHandler;
    /* access modifiers changed from: private */
    public static int subscribableStatus = Integer.MAX_VALUE;
    private static OSObservable<OSSubscriptionObserver, OSSubscriptionStateChanges> subscriptionStateChangesObserver;
    private static OSTaskController taskController = new OSTaskController(logger);
    private static OSTaskRemoteController taskRemoteController = new OSTaskRemoteController(remoteParamController, logger);
    private static OSTime time = new OSTimeImpl();
    private static TrackAmazonPurchase trackAmazonPurchase;
    private static TrackFirebaseAnalytics trackFirebaseAnalytics;
    private static TrackGooglePurchase trackGooglePurchase;
    /* access modifiers changed from: private */
    public static OSTrackerFactory trackerFactory;
    private static Collection<JSONArray> unprocessedOpenedNotifs = new ArrayList();
    private static String userId = null;
    private static LOG_LEVEL visualLogLevel = LOG_LEVEL.NONE;
    private static boolean waitingToPostStateSync;

    public interface ChangeTagsUpdateHandler {
        void onFailure(SendTagsError sendTagsError);

        void onSuccess(JSONObject jSONObject);
    }

    public enum EmailErrorType {
        VALIDATION,
        REQUIRES_EMAIL_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    public interface EmailUpdateHandler {
        void onFailure(EmailUpdateError emailUpdateError);

        void onSuccess();
    }

    interface EntryStateListener {
        void onEntryStateChange(AppEntryAction appEntryAction);
    }

    public enum ExternalIdErrorType {
        REQUIRES_EXTERNAL_ID_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    public enum LOG_LEVEL {
        NONE,
        FATAL,
        ERROR,
        WARN,
        INFO,
        DEBUG,
        VERBOSE
    }

    public interface OSExternalUserIdUpdateCompletionHandler {
        void onFailure(ExternalIdError externalIdError);

        void onSuccess(JSONObject jSONObject);
    }

    public interface OSGetTagsHandler {
        void tagsAvailable(JSONObject jSONObject);
    }

    public interface OSInAppMessageClickHandler {
        void inAppMessageClicked(OSInAppMessageAction oSInAppMessageAction);
    }

    interface OSInternalExternalUserIdUpdateCompletionHandler {
        void onComplete(String str, boolean z);
    }

    public interface OSNotificationOpenedHandler {
        void notificationOpened(OSNotificationOpenedResult oSNotificationOpenedResult);
    }

    public interface OSNotificationWillShowInForegroundHandler {
        void notificationWillShowInForeground(OSNotificationReceivedEvent oSNotificationReceivedEvent);
    }

    interface OSPromptActionCompletionCallback {
        void onCompleted(PromptActionResult promptActionResult);
    }

    public interface OSRemoteNotificationReceivedHandler {
        void remoteNotificationReceived(Context context, OSNotificationReceivedEvent oSNotificationReceivedEvent);
    }

    public interface OSSMSUpdateHandler {
        void onFailure(OSSMSUpdateError oSSMSUpdateError);

        void onSuccess(JSONObject jSONObject);
    }

    public interface OSSetLanguageCompletionHandler {
        void onFailure(OSLanguageError oSLanguageError);

        void onSuccess(String str);
    }

    public interface OutcomeCallback {
        void onSuccess(OSOutcomeEvent oSOutcomeEvent);
    }

    public interface PostNotificationResponseHandler {
        void onFailure(JSONObject jSONObject);

        void onSuccess(JSONObject jSONObject);
    }

    enum PromptActionResult {
        PERMISSION_GRANTED,
        PERMISSION_DENIED,
        LOCATION_PERMISSIONS_MISSING_MANIFEST,
        ERROR
    }

    public interface PromptForPushNotificationPermissionResponseHandler {
        void response(boolean z);
    }

    public enum SMSErrorType {
        VALIDATION,
        REQUIRES_SMS_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    public static String getSdkVersionRaw() {
        return VERSION;
    }

    /* access modifiers changed from: private */
    public static boolean pushStatusRuntimeError(int i) {
        return i < -6;
    }

    public enum AppEntryAction {
        NOTIFICATION_CLICK,
        APP_OPEN,
        APP_CLOSE;

        public boolean isNotificationClick() {
            return equals(NOTIFICATION_CLICK);
        }

        public boolean isAppOpen() {
            return equals(APP_OPEN);
        }

        public boolean isAppClose() {
            return equals(APP_CLOSE);
        }
    }

    public static class SendTagsError {
        private int code;
        private String message;

        SendTagsError(int i, String str) {
            this.message = str;
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }
    }

    public static class OSLanguageError {
        private int errorCode;
        private String message;

        OSLanguageError(int i, String str) {
            this.errorCode = i;
            this.message = str;
        }

        public int getCode() {
            return this.errorCode;
        }

        public String getMessage() {
            return this.message;
        }
    }

    public static class ExternalIdError {
        private String message;
        private ExternalIdErrorType type;

        ExternalIdError(ExternalIdErrorType externalIdErrorType, String str) {
            this.type = externalIdErrorType;
            this.message = str;
        }

        public ExternalIdErrorType getType() {
            return this.type;
        }

        public String getMessage() {
            return this.message;
        }
    }

    public static class OSSMSUpdateError {
        private String message;
        private SMSErrorType type;

        OSSMSUpdateError(SMSErrorType sMSErrorType, String str) {
            this.type = sMSErrorType;
            this.message = str;
        }

        public SMSErrorType getType() {
            return this.type;
        }

        public String getMessage() {
            return this.message;
        }
    }

    public static class EmailUpdateError {
        private String message;
        private EmailErrorType type;

        EmailUpdateError(EmailErrorType emailErrorType, String str) {
            this.type = emailErrorType;
            this.message = str;
        }

        public EmailErrorType getType() {
            return this.type;
        }

        public String getMessage() {
            return this.message;
        }
    }

    static {
        OSSharedPreferencesWrapper oSSharedPreferencesWrapper = new OSSharedPreferencesWrapper();
        preferences = oSSharedPreferencesWrapper;
        OSTrackerFactory oSTrackerFactory = new OSTrackerFactory(oSSharedPreferencesWrapper, logger, time);
        trackerFactory = oSTrackerFactory;
        sessionManager = new OSSessionManager(sessionListener, oSTrackerFactory, logger);
    }

    static void callEntryStateListeners(AppEntryAction appEntryAction) {
        for (EntryStateListener onEntryStateChange : new ArrayList(entryStateListeners)) {
            onEntryStateChange.onEntryStateChange(appEntryAction);
        }
    }

    static void addEntryStateListener(EntryStateListener entryStateListener, AppEntryAction appEntryAction) {
        if (!appEntryAction.equals(AppEntryAction.NOTIFICATION_CLICK)) {
            entryStateListeners.add(entryStateListener);
        }
    }

    static void removeEntryStateListener(EntryStateListener entryStateListener) {
        entryStateListeners.remove(entryStateListener);
    }

    static Activity getCurrentActivity() {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
        if (activityLifecycleHandler != null) {
            return activityLifecycleHandler.getCurActivity();
        }
        return null;
    }

    static boolean isInitDone() {
        return initDone;
    }

    static boolean isInForeground() {
        return inForeground;
    }

    static void setInForeground(boolean z) {
        inForeground = z;
    }

    static AppEntryAction getAppEntryState() {
        return appEntryState;
    }

    static OSLogger getLogger() {
        return logger;
    }

    static OSInAppMessageController getInAppMessageController() {
        return inAppMessageControllerFactory.getController(getDBHelperInstance(), taskController, getLogger(), getSharedPreferences(), languageContext);
    }

    static OSSharedPreferences getSharedPreferences() {
        return preferences;
    }

    static OSOutcomeEventsController getOutcomeEventsController() {
        if (outcomeEventsController == null) {
            synchronized (outcomeEventsControllerSyncLock) {
                if (outcomeEventsController == null) {
                    if (outcomeEventsFactory == null) {
                        outcomeEventsFactory = new OSOutcomeEventsFactory(logger, apiClient, getDBHelperInstance(), preferences);
                    }
                    outcomeEventsController = new OSOutcomeEventsController(sessionManager, outcomeEventsFactory);
                }
            }
        }
        return outcomeEventsController;
    }

    static DelayedConsentInitializationParameters getDelayedInitParams() {
        return delayedInitParams;
    }

    private static OSPermissionState getCurrentPermissionState(Context context) {
        if (context == null) {
            return null;
        }
        if (currentPermissionState == null) {
            OSPermissionState oSPermissionState = new OSPermissionState(false);
            currentPermissionState = oSPermissionState;
            oSPermissionState.getObservable().addObserverStrong(new OSPermissionChangedInternalObserver());
        }
        return currentPermissionState;
    }

    private static OSPermissionState getLastPermissionState(Context context) {
        if (context == null) {
            return null;
        }
        if (lastPermissionState == null) {
            lastPermissionState = new OSPermissionState(true);
        }
        return lastPermissionState;
    }

    static OSObservable<OSPermissionObserver, OSPermissionStateChanges> getPermissionStateChangesObserver() {
        if (permissionStateChangesObserver == null) {
            permissionStateChangesObserver = new OSObservable<>("onOSPermissionChanged", true);
        }
        return permissionStateChangesObserver;
    }

    /* access modifiers changed from: private */
    public static OSSubscriptionState getCurrentSubscriptionState(Context context) {
        if (context == null) {
            return null;
        }
        if (currentSubscriptionState == null) {
            currentSubscriptionState = new OSSubscriptionState(false, getCurrentPermissionState(context).areNotificationsEnabled());
            getCurrentPermissionState(context).getObservable().addObserver(currentSubscriptionState);
            currentSubscriptionState.getObservable().addObserverStrong(new OSSubscriptionChangedInternalObserver());
        }
        return currentSubscriptionState;
    }

    private static OSSubscriptionState getLastSubscriptionState(Context context) {
        if (context == null) {
            return null;
        }
        if (lastSubscriptionState == null) {
            lastSubscriptionState = new OSSubscriptionState(true, false);
        }
        return lastSubscriptionState;
    }

    static OSObservable<OSSubscriptionObserver, OSSubscriptionStateChanges> getSubscriptionStateChangesObserver() {
        if (subscriptionStateChangesObserver == null) {
            subscriptionStateChangesObserver = new OSObservable<>("onOSSubscriptionChanged", true);
        }
        return subscriptionStateChangesObserver;
    }

    private static OSEmailSubscriptionState getCurrentEmailSubscriptionState(Context context) {
        if (context == null) {
            return null;
        }
        if (currentEmailSubscriptionState == null) {
            OSEmailSubscriptionState oSEmailSubscriptionState = new OSEmailSubscriptionState(false);
            currentEmailSubscriptionState = oSEmailSubscriptionState;
            oSEmailSubscriptionState.getObservable().addObserverStrong(new OSEmailSubscriptionChangedInternalObserver());
        }
        return currentEmailSubscriptionState;
    }

    static OSEmailSubscriptionState getEmailSubscriptionState() {
        return getCurrentEmailSubscriptionState(appContext);
    }

    private static OSEmailSubscriptionState getLastEmailSubscriptionState(Context context) {
        if (context == null) {
            return null;
        }
        if (lastEmailSubscriptionState == null) {
            lastEmailSubscriptionState = new OSEmailSubscriptionState(true);
        }
        return lastEmailSubscriptionState;
    }

    static OSObservable<OSEmailSubscriptionObserver, OSEmailSubscriptionStateChanges> getEmailSubscriptionStateChangesObserver() {
        if (emailSubscriptionStateChangesObserver == null) {
            emailSubscriptionStateChangesObserver = new OSObservable<>("onOSEmailSubscriptionChanged", true);
        }
        return emailSubscriptionStateChangesObserver;
    }

    private static OSSMSSubscriptionState getCurrentSMSSubscriptionState(Context context) {
        if (context == null) {
            return null;
        }
        if (currentSMSSubscriptionState == null) {
            OSSMSSubscriptionState oSSMSSubscriptionState = new OSSMSSubscriptionState(false);
            currentSMSSubscriptionState = oSSMSSubscriptionState;
            oSSMSSubscriptionState.getObservable().addObserverStrong(new OSSMSSubscriptionChangedInternalObserver());
        }
        return currentSMSSubscriptionState;
    }

    static OSSMSSubscriptionState getSMSSubscriptionState() {
        return getCurrentSMSSubscriptionState(appContext);
    }

    private static OSSMSSubscriptionState getLastSMSSubscriptionState(Context context) {
        if (context == null) {
            return null;
        }
        if (lastSMSSubscriptionState == null) {
            lastSMSSubscriptionState = new OSSMSSubscriptionState(true);
        }
        return lastSMSSubscriptionState;
    }

    static OSObservable<OSSMSSubscriptionObserver, OSSMSSubscriptionStateChanges> getSMSSubscriptionStateChangesObserver() {
        if (smsSubscriptionStateChangesObserver == null) {
            smsSubscriptionStateChangesObserver = new OSObservable<>("onSMSSubscriptionChanged", true);
        }
        return smsSubscriptionStateChangesObserver;
    }

    public static OSDeviceState getDeviceState() {
        Context context = appContext;
        if (context != null) {
            return new OSDeviceState(getCurrentSubscriptionState(context), getCurrentPermissionState(appContext), getCurrentEmailSubscriptionState(appContext), getCurrentSMSSubscriptionState(appContext));
        }
        logger.error("OneSignal.initWithContext has not been called. Could not get OSDeviceState");
        return null;
    }

    private static class IAPUpdateJob {
        boolean newAsExisting;
        OneSignalRestClient.ResponseHandler restResponseHandler;
        JSONArray toReport;

        IAPUpdateJob(JSONArray jSONArray) {
            this.toReport = jSONArray;
        }
    }

    public static void unsubscribeWhenNotificationsAreDisabled(final boolean z) {
        if (taskRemoteController.shouldQueueTaskForInit("unsubscribeWhenNotificationsAreDisabled()")) {
            logger.error("Waiting for remote params. Moving unsubscribeWhenNotificationsAreDisabled() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running unsubscribeWhenNotificationsAreDisabled() operation from pending task queue.");
                    OneSignal.unsubscribeWhenNotificationsAreDisabled(z);
                }
            });
        } else if (getRemoteParamController().hasUnsubscribeNotificationKey()) {
            logger.warning("unsubscribeWhenNotificationsAreDisabled already called by remote params!, ignoring user set");
        } else {
            getRemoteParamController().saveUnsubscribeWhenNotificationsAreDisabled(z);
        }
    }

    public static void setAppId(String str) {
        if (str == null || str.isEmpty()) {
            OSLogger oSLogger = logger;
            oSLogger.warning("setAppId called with id: " + str + ", ignoring!");
            return;
        }
        if (!str.equals(appId)) {
            initDone = false;
            OSLogger oSLogger2 = logger;
            oSLogger2.verbose("setAppId called with id: " + str + " changing id from: " + appId);
        }
        appId = str;
        if (appContext == null) {
            logger.warning("appId set, but please call initWithContext(appContext) with Application context to complete OneSignal init!");
            return;
        }
        WeakReference<Activity> weakReference = appActivity;
        if (weakReference == null || weakReference.get() == null) {
            init(appContext);
        } else {
            init((Context) appActivity.get());
        }
    }

    public static void initWithContext(Context context) {
        if (context == null) {
            logger.warning("initWithContext called with null context, ignoring!");
            return;
        }
        if (context instanceof Activity) {
            appActivity = new WeakReference<>((Activity) context);
        }
        boolean z = appContext == null;
        appContext = context.getApplicationContext();
        setupContextListeners(z);
        setupPrivacyConsent(appContext);
        if (appId == null) {
            String savedAppId = getSavedAppId();
            if (savedAppId == null) {
                logger.warning("appContext set, but please call setAppId(appId) with a valid appId to complete OneSignal init!");
                return;
            }
            OSLogger oSLogger = logger;
            oSLogger.verbose("appContext set and cached app id found, calling setAppId with: " + savedAppId);
            setAppId(savedAppId);
            return;
        }
        OSLogger oSLogger2 = logger;
        oSLogger2.verbose("initWithContext called with: " + context);
        init(context);
    }

    static void setRemoteNotificationReceivedHandler(OSRemoteNotificationReceivedHandler oSRemoteNotificationReceivedHandler) {
        if (remoteNotificationReceivedHandler == null) {
            remoteNotificationReceivedHandler = oSRemoteNotificationReceivedHandler;
        }
    }

    public static void setNotificationWillShowInForegroundHandler(OSNotificationWillShowInForegroundHandler oSNotificationWillShowInForegroundHandler) {
        notificationWillShowInForegroundHandler = oSNotificationWillShowInForegroundHandler;
    }

    public static void setInAppMessageLifecycleHandler(final OSInAppMessageLifecycleHandler oSInAppMessageLifecycleHandler) {
        if (appContext == null) {
            logger.error("Waiting initWithContext. Moving setInAppMessageLifecycleHandler() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running setInAppMessageLifecycleHandler() operation from pending queue.");
                    OneSignal.setInAppMessageLifecycleHandler(OSInAppMessageLifecycleHandler.this);
                }
            });
            return;
        }
        getInAppMessageController().setInAppMessageLifecycleHandler(oSInAppMessageLifecycleHandler);
    }

    public static void setNotificationOpenedHandler(OSNotificationOpenedHandler oSNotificationOpenedHandler) {
        notificationOpenedHandler = oSNotificationOpenedHandler;
        if (initDone && oSNotificationOpenedHandler != null) {
            fireCallbackForOpenedNotifications();
        }
    }

    public static void setInAppMessageClickHandler(OSInAppMessageClickHandler oSInAppMessageClickHandler) {
        inAppMessageClickHandler = oSInAppMessageClickHandler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00de, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void init(android.content.Context r5) {
        /*
            java.lang.Class<com.onesignal.OneSignal> r0 = com.onesignal.OneSignal.class
            monitor-enter(r0)
            com.onesignal.OSLogger r1 = logger     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "Starting OneSignal initialization!"
            r1.verbose(r2)     // Catch:{ all -> 0x00df }
            android.content.Context r1 = appContext     // Catch:{ all -> 0x00df }
            com.onesignal.OSNotificationController.setupNotificationServiceExtension(r1)     // Catch:{ all -> 0x00df }
            boolean r1 = requiresUserPrivacyConsent()     // Catch:{ all -> 0x00df }
            r2 = 0
            if (r1 != 0) goto L_0x00ab
            com.onesignal.OSRemoteParamController r1 = remoteParamController     // Catch:{ all -> 0x00df }
            boolean r1 = r1.isRemoteParamsCallDone()     // Catch:{ all -> 0x00df }
            if (r1 != 0) goto L_0x0020
            goto L_0x00ab
        L_0x0020:
            int r1 = subscribableStatus     // Catch:{ all -> 0x00df }
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r3) goto L_0x002a
            int r1 = subscribableStatus     // Catch:{ all -> 0x00df }
            goto L_0x0034
        L_0x002a:
            com.onesignal.OSUtils r1 = osUtils     // Catch:{ all -> 0x00df }
            android.content.Context r3 = appContext     // Catch:{ all -> 0x00df }
            java.lang.String r4 = appId     // Catch:{ all -> 0x00df }
            int r1 = r1.initializationChecker(r3, r4)     // Catch:{ all -> 0x00df }
        L_0x0034:
            subscribableStatus = r1     // Catch:{ all -> 0x00df }
            boolean r1 = isSubscriptionStatusUninitializable()     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x003e
            monitor-exit(r0)
            return
        L_0x003e:
            boolean r1 = initDone     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x0052
            com.onesignal.OneSignal$OSNotificationOpenedHandler r5 = notificationOpenedHandler     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x0049
            fireCallbackForOpenedNotifications()     // Catch:{ all -> 0x00df }
        L_0x0049:
            com.onesignal.OSLogger r5 = logger     // Catch:{ all -> 0x00df }
            java.lang.String r1 = "OneSignal SDK initialization already completed."
            r5.debug(r1)     // Catch:{ all -> 0x00df }
            monitor-exit(r0)
            return
        L_0x0052:
            handleActivityLifecycleHandler(r5)     // Catch:{ all -> 0x00df }
            appActivity = r2     // Catch:{ all -> 0x00df }
            com.onesignal.OneSignalStateSynchronizer.initUserState()     // Catch:{ all -> 0x00df }
            handleAppIdChange()     // Catch:{ all -> 0x00df }
            handleAmazonPurchase()     // Catch:{ all -> 0x00df }
            android.content.Context r5 = appContext     // Catch:{ all -> 0x00df }
            com.onesignal.OSPermissionState r5 = getCurrentPermissionState(r5)     // Catch:{ all -> 0x00df }
            com.onesignal.OSPermissionChangedInternalObserver.handleInternalChanges(r5)     // Catch:{ all -> 0x00df }
            doSessionInit()     // Catch:{ all -> 0x00df }
            com.onesignal.OneSignal$OSNotificationOpenedHandler r5 = notificationOpenedHandler     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x0073
            fireCallbackForOpenedNotifications()     // Catch:{ all -> 0x00df }
        L_0x0073:
            android.content.Context r5 = appContext     // Catch:{ all -> 0x00df }
            boolean r5 = com.onesignal.TrackGooglePurchase.CanTrack(r5)     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x0084
            com.onesignal.TrackGooglePurchase r5 = new com.onesignal.TrackGooglePurchase     // Catch:{ all -> 0x00df }
            android.content.Context r1 = appContext     // Catch:{ all -> 0x00df }
            r5.<init>(r1)     // Catch:{ all -> 0x00df }
            trackGooglePurchase = r5     // Catch:{ all -> 0x00df }
        L_0x0084:
            boolean r5 = com.onesignal.TrackFirebaseAnalytics.CanTrack()     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x0093
            com.onesignal.TrackFirebaseAnalytics r5 = new com.onesignal.TrackFirebaseAnalytics     // Catch:{ all -> 0x00df }
            android.content.Context r1 = appContext     // Catch:{ all -> 0x00df }
            r5.<init>(r1)     // Catch:{ all -> 0x00df }
            trackFirebaseAnalytics = r5     // Catch:{ all -> 0x00df }
        L_0x0093:
            r5 = 1
            initDone = r5     // Catch:{ all -> 0x00df }
            com.onesignal.OneSignal$LOG_LEVEL r5 = com.onesignal.OneSignal.LOG_LEVEL.VERBOSE     // Catch:{ all -> 0x00df }
            java.lang.String r1 = "OneSignal SDK initialization done."
            Log(r5, r1)     // Catch:{ all -> 0x00df }
            com.onesignal.OSOutcomeEventsController r5 = getOutcomeEventsController()     // Catch:{ all -> 0x00df }
            r5.sendSavedOutcomes()     // Catch:{ all -> 0x00df }
            com.onesignal.OSTaskRemoteController r5 = taskRemoteController     // Catch:{ all -> 0x00df }
            r5.startPendingTasks()     // Catch:{ all -> 0x00df }
            monitor-exit(r0)
            return
        L_0x00ab:
            com.onesignal.OSRemoteParamController r1 = remoteParamController     // Catch:{ all -> 0x00df }
            boolean r1 = r1.isRemoteParamsCallDone()     // Catch:{ all -> 0x00df }
            if (r1 != 0) goto L_0x00bb
            com.onesignal.OSLogger r1 = logger     // Catch:{ all -> 0x00df }
            java.lang.String r3 = "OneSignal SDK initialization delayed, waiting for remote params."
            r1.verbose(r3)     // Catch:{ all -> 0x00df }
            goto L_0x00c2
        L_0x00bb:
            com.onesignal.OSLogger r1 = logger     // Catch:{ all -> 0x00df }
            java.lang.String r3 = "OneSignal SDK initialization delayed, waiting for privacy consent to be set."
            r1.verbose(r3)     // Catch:{ all -> 0x00df }
        L_0x00c2:
            com.onesignal.DelayedConsentInitializationParameters r1 = new com.onesignal.DelayedConsentInitializationParameters     // Catch:{ all -> 0x00df }
            android.content.Context r3 = appContext     // Catch:{ all -> 0x00df }
            java.lang.String r4 = appId     // Catch:{ all -> 0x00df }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x00df }
            delayedInitParams = r1     // Catch:{ all -> 0x00df }
            java.lang.String r1 = appId     // Catch:{ all -> 0x00df }
            appId = r2     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x00dd
            if (r5 == 0) goto L_0x00dd
            java.lang.String r5 = getUserId()     // Catch:{ all -> 0x00df }
            r2 = 0
            makeAndroidParamsRequest(r1, r5, r2)     // Catch:{ all -> 0x00df }
        L_0x00dd:
            monitor-exit(r0)
            return
        L_0x00df:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OneSignal.init(android.content.Context):void");
    }

    static void onRemoteParamSet() {
        if (!reassignDelayedInitParams() && inForeground) {
            onAppFocusLogic();
        }
    }

    private static void setupContextListeners(boolean z) {
        ActivityLifecycleListener.registerActivityLifecycleCallbacks((Application) appContext);
        if (z) {
            languageContext = new LanguageContext(preferences);
            OneSignalPrefs.startDelayedWrite();
            OneSignalDbHelper dBHelperInstance = getDBHelperInstance();
            OSNotificationDataController oSNotificationDataController = new OSNotificationDataController(dBHelperInstance, logger);
            notificationDataController = oSNotificationDataController;
            oSNotificationDataController.cleanOldCachedData();
            getInAppMessageController().cleanCachedInAppMessages();
            if (outcomeEventsFactory == null) {
                outcomeEventsFactory = new OSOutcomeEventsFactory(logger, apiClient, dBHelperInstance, preferences);
            }
            sessionManager.initSessionFromCache();
            getOutcomeEventsController().cleanCachedUniqueOutcomes();
        }
    }

    private static void setupPrivacyConsent(Context context) {
        try {
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("com.onesignal.PrivacyConsent");
            if (string != null) {
                setRequiresUserPrivacyConsent("ENABLE".equalsIgnoreCase(string));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void handleAppIdChange() {
        String savedAppId = getSavedAppId();
        if (savedAppId == null) {
            LOG_LEVEL log_level = LOG_LEVEL.DEBUG;
            Log(log_level, "App id set for first time:  " + appId);
            BadgeCountUpdater.updateCount(0, appContext);
            saveAppId(appId);
        } else if (!savedAppId.equals(appId)) {
            LOG_LEVEL log_level2 = LOG_LEVEL.DEBUG;
            Log(log_level2, "App id has changed:\nFrom: " + savedAppId + "\n To: " + appId + "\nClearing the user id, app state, and remoteParams as they are no longer valid");
            saveAppId(appId);
            OneSignalStateSynchronizer.resetCurrentState();
            remoteParamController.clearRemoteParams();
        }
    }

    public static boolean userProvidedPrivacyConsent() {
        return remoteParamController.getSavedUserConsentStatus();
    }

    private static boolean isSubscriptionStatusUninitializable() {
        return subscribableStatus == -999;
    }

    private static void handleActivityLifecycleHandler(Context context) {
        ActivityLifecycleHandler activityLifecycleHandler = ActivityLifecycleListener.getActivityLifecycleHandler();
        boolean z = context instanceof Activity;
        boolean z2 = getCurrentActivity() == null;
        setInForeground(!z2 || z);
        OSLogger oSLogger = logger;
        oSLogger.debug("OneSignal handleActivityLifecycleHandler inForeground: " + inForeground);
        if (inForeground) {
            if (z2 && z && activityLifecycleHandler != null) {
                activityLifecycleHandler.setCurActivity((Activity) context);
                activityLifecycleHandler.setNextResumeIsFirstActivity(true);
            }
            OSNotificationRestoreWorkManager.beginEnqueueingWork(context, false);
            getFocusTimeController().appForegrounded();
        } else if (activityLifecycleHandler != null) {
            activityLifecycleHandler.setNextResumeIsFirstActivity(true);
        }
    }

    private static void handleAmazonPurchase() {
        try {
            Class.forName("com.amazon.device.iap.PurchasingListener");
            trackAmazonPurchase = new TrackAmazonPurchase(appContext);
        } catch (ClassNotFoundException unused) {
        }
    }

    private static void doSessionInit() {
        if (shouldStartNewSession()) {
            OSLogger oSLogger = logger;
            oSLogger.debug("Starting new session with appEntryState: " + getAppEntryState());
            OneSignalStateSynchronizer.setNewSession();
            getOutcomeEventsController().cleanOutcomes();
            sessionManager.restartSessionIfNeeded(getAppEntryState());
            getInAppMessageController().resetSessionLaunchTime();
            setLastSessionTime(time.getCurrentTimeMillis());
        } else if (isInForeground()) {
            OSLogger oSLogger2 = logger;
            oSLogger2.debug("Continue on same session with appEntryState: " + getAppEntryState());
            sessionManager.attemptSessionUpgrade(getAppEntryState());
        }
        getInAppMessageController().initWithCachedInAppMessages();
        if (!inForeground && hasUserId()) {
            logger.debug("doSessionInit on background with already registered user");
        }
        startRegistrationOrOnSession();
    }

    private static void startRegistrationOrOnSession() {
        if (!waitingToPostStateSync) {
            waitingToPostStateSync = true;
            if (inForeground && OneSignalStateSynchronizer.getSyncAsNewSession()) {
                locationFired = false;
            }
            startLocationUpdate();
            registerForPushFired = false;
            if (getRemoteParams() != null) {
                registerForPushToken();
            } else {
                makeAndroidParamsRequest(appId, getUserId(), true);
            }
        }
    }

    private static void startLocationUpdate() {
        LocationController.getLocation(appContext, false, false, new LocationController.LocationHandler() {
            public LocationController.PermissionType getType() {
                return LocationController.PermissionType.STARTUP;
            }

            public void onComplete(LocationController.LocationPoint locationPoint) {
                LocationController.LocationPoint unused = OneSignal.lastLocationPoint = locationPoint;
                boolean unused2 = OneSignal.locationFired = true;
                OneSignal.registerUser();
            }
        });
    }

    private static PushRegistrator getPushRegistrator() {
        PushRegistrator pushRegistrator = mPushRegistrator;
        if (pushRegistrator != null) {
            return pushRegistrator;
        }
        if (OSUtils.isFireOSDeviceType()) {
            mPushRegistrator = new PushRegistratorADM();
        } else if (!OSUtils.isAndroidDeviceType()) {
            mPushRegistrator = new PushRegistratorHMS();
        } else if (OSUtils.hasFCMLibrary()) {
            mPushRegistrator = getPushRegistratorFCM();
        }
        return mPushRegistrator;
    }

    private static PushRegistratorFCM getPushRegistratorFCM() {
        OneSignalRemoteParams.FCMParams fCMParams = remoteParamController.getRemoteParams().fcmParams;
        return new PushRegistratorFCM(appContext, fCMParams != null ? new PushRegistratorFCM.Params(fCMParams.projectId, fCMParams.appId, fCMParams.apiKey) : null);
    }

    /* access modifiers changed from: private */
    public static void registerForPushToken() {
        getPushRegistrator().registerForPush(appContext, googleProjectNumber, new PushRegistrator.RegisteredHandler() {
            public void complete(String str, int i) {
                OSLogger access$100 = OneSignal.logger;
                access$100.debug("registerForPushToken completed with id: " + str + " status: " + i);
                if (i < 1) {
                    if (OneSignalStateSynchronizer.getRegistrationId() == null && (OneSignal.subscribableStatus == 1 || OneSignal.pushStatusRuntimeError(OneSignal.subscribableStatus))) {
                        int unused = OneSignal.subscribableStatus = i;
                    }
                } else if (OneSignal.pushStatusRuntimeError(OneSignal.subscribableStatus)) {
                    int unused2 = OneSignal.subscribableStatus = i;
                }
                String unused3 = OneSignal.lastRegistrationId = str;
                boolean unused4 = OneSignal.registerForPushFired = true;
                OneSignal.getCurrentSubscriptionState(OneSignal.appContext).setPushToken(str);
                OneSignal.registerUser();
            }
        });
    }

    private static void makeAndroidParamsRequest(String str, String str2, final boolean z) {
        if (getRemoteParams() == null && !androidParamsRequestStarted) {
            androidParamsRequestStarted = true;
            OneSignalRemoteParams.makeAndroidParamsRequest(str, str2, new OneSignalRemoteParams.Callback() {
                public void complete(OneSignalRemoteParams.Params params) {
                    boolean unused = OneSignal.androidParamsRequestStarted = false;
                    if (params.googleProjectNumber != null) {
                        OneSignal.googleProjectNumber = params.googleProjectNumber;
                    }
                    OneSignal.remoteParamController.saveRemoteParams(params, OneSignal.trackerFactory, OneSignal.preferences, OneSignal.logger);
                    OneSignal.onRemoteParamSet();
                    NotificationChannelManager.processChannelList(OneSignal.appContext, params.notificationChannels);
                    if (z) {
                        OneSignal.registerForPushToken();
                    }
                }
            });
        }
    }

    private static void fireCallbackForOpenedNotifications() {
        for (JSONArray runNotificationOpenedCallback : unprocessedOpenedNotifs) {
            runNotificationOpenedCallback(runNotificationOpenedCallback);
        }
        unprocessedOpenedNotifs.clear();
    }

    public static void onesignalLog(LOG_LEVEL log_level, String str) {
        Log(log_level, str);
    }

    public static void provideUserConsent(boolean z) {
        boolean userProvidedPrivacyConsent = userProvidedPrivacyConsent();
        remoteParamController.saveUserConsentStatus(z);
        if (!userProvidedPrivacyConsent && z && delayedInitParams != null) {
            Log(LOG_LEVEL.VERBOSE, "Privacy consent provided, reassigning all delayed init params and attempting init again...");
            reassignDelayedInitParams();
        }
    }

    private static boolean reassignDelayedInitParams() {
        Context context;
        String str;
        if (initDone) {
            return false;
        }
        DelayedConsentInitializationParameters delayedConsentInitializationParameters = delayedInitParams;
        if (delayedConsentInitializationParameters == null) {
            str = getSavedAppId();
            context = appContext;
            logger.error("Trying to continue OneSignal with null delayed params");
        } else {
            str = delayedConsentInitializationParameters.getAppId();
            context = delayedInitParams.getContext();
        }
        OSLogger oSLogger = logger;
        oSLogger.debug("reassignDelayedInitParams with appContext: " + appContext);
        delayedInitParams = null;
        setAppId(str);
        if (initDone) {
            return true;
        }
        if (context == null) {
            logger.error("Trying to continue OneSignal with null delayed params context");
            return false;
        }
        initWithContext(context);
        return true;
    }

    static OneSignalRemoteParams.Params getRemoteParams() {
        return remoteParamController.getRemoteParams();
    }

    public static boolean requiresUserPrivacyConsent() {
        return appContext == null || (isUserPrivacyConsentRequired() && !userProvidedPrivacyConsent());
    }

    public static void setRequiresUserPrivacyConsent(boolean z) {
        if (getRemoteParamController().hasPrivacyConsentKey()) {
            logger.warning("setRequiresUserPrivacyConsent already called by remote params!, ignoring user set");
        } else if (!requiresUserPrivacyConsent() || z) {
            getRemoteParamController().savePrivacyConsentRequired(z);
        } else {
            Log(LOG_LEVEL.ERROR, "Cannot change requiresUserPrivacyConsent() from TRUE to FALSE");
        }
    }

    static boolean shouldLogUserPrivacyConsentErrorMessageForMethodName(String str) {
        if (!requiresUserPrivacyConsent()) {
            return false;
        }
        if (str == null) {
            return true;
        }
        LOG_LEVEL log_level = LOG_LEVEL.WARN;
        Log(log_level, "Method " + str + " was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.userProvidedPrivacyConsent()");
        return true;
    }

    public static void setLogLevel(LOG_LEVEL log_level, LOG_LEVEL log_level2) {
        logCatLevel = log_level;
        visualLogLevel = log_level2;
    }

    public static void setLogLevel(int i, int i2) {
        setLogLevel(getLogLevel(i), getLogLevel(i2));
    }

    private static LOG_LEVEL getLogLevel(int i) {
        switch (i) {
            case 0:
                return LOG_LEVEL.NONE;
            case 1:
                return LOG_LEVEL.FATAL;
            case 2:
                return LOG_LEVEL.ERROR;
            case 3:
                return LOG_LEVEL.WARN;
            case 4:
                return LOG_LEVEL.INFO;
            case 5:
                return LOG_LEVEL.DEBUG;
            case 6:
                return LOG_LEVEL.VERBOSE;
            default:
                if (i < 0) {
                    return LOG_LEVEL.NONE;
                }
                return LOG_LEVEL.VERBOSE;
        }
    }

    static boolean atLogLevel(LOG_LEVEL log_level) {
        return log_level.compareTo(visualLogLevel) < 1 || log_level.compareTo(logCatLevel) < 1;
    }

    static void Log(LOG_LEVEL log_level, String str) {
        Log(log_level, str, (Throwable) null);
    }

    static void Log(final LOG_LEVEL log_level, String str, Throwable th) {
        if (log_level.compareTo(logCatLevel) < 1) {
            if (log_level == LOG_LEVEL.VERBOSE) {
                Log.v("OneSignal", str, th);
            } else if (log_level == LOG_LEVEL.DEBUG) {
                Log.d("OneSignal", str, th);
            } else if (log_level == LOG_LEVEL.INFO) {
                Log.i("OneSignal", str, th);
            } else if (log_level == LOG_LEVEL.WARN) {
                Log.w("OneSignal", str, th);
            } else if (log_level == LOG_LEVEL.ERROR || log_level == LOG_LEVEL.FATAL) {
                Log.e("OneSignal", str, th);
            }
        }
        if (log_level.compareTo(visualLogLevel) < 1 && getCurrentActivity() != null) {
            try {
                final String str2 = str + "\n";
                if (th != null) {
                    StringWriter stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    str2 = (str2 + th.getMessage()) + stringWriter.toString();
                }
                OSUtils.runOnMainUIThread(new Runnable() {
                    public void run() {
                        if (OneSignal.getCurrentActivity() != null) {
                            new AlertDialog.Builder(OneSignal.getCurrentActivity()).setTitle(LOG_LEVEL.this.toString()).setMessage(str2).show();
                        }
                    }
                });
            } catch (Throwable th2) {
                Log.e("OneSignal", "Error showing logging message.", th2);
            }
        }
    }

    static void logHttpError(String str, int i, Throwable th, String str2) {
        String str3;
        if (str2 == null || !atLogLevel(LOG_LEVEL.INFO)) {
            str3 = "";
        } else {
            str3 = "\n" + str2 + "\n";
        }
        Log(LOG_LEVEL.WARN, "HTTP code: " + i + " " + str + str3, th);
    }

    static void onAppLostFocus() {
        LOG_LEVEL log_level = LOG_LEVEL.DEBUG;
        Log(log_level, "Application lost focus initDone: " + initDone);
        setInForeground(false);
        appEntryState = AppEntryAction.APP_CLOSE;
        setLastSessionTime(getTime().getCurrentTimeMillis());
        LocationController.onFocusChange();
        if (initDone) {
            backgroundSyncLogic();
        } else if (taskRemoteController.shouldQueueTaskForInit("onAppLostFocus()")) {
            logger.error("Waiting for remote params. Moving onAppLostFocus() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running onAppLostFocus() operation from a pending task queue.");
                    OneSignal.backgroundSyncLogic();
                }
            });
        }
    }

    static void backgroundSyncLogic() {
        if (!inForeground) {
            TrackAmazonPurchase trackAmazonPurchase2 = trackAmazonPurchase;
            if (trackAmazonPurchase2 != null) {
                trackAmazonPurchase2.checkListener();
            }
            getFocusTimeController().appBackgrounded();
            scheduleSyncService();
        }
    }

    private static boolean scheduleSyncService() {
        boolean persist = OneSignalStateSynchronizer.persist();
        OSLogger oSLogger = logger;
        oSLogger.debug("OneSignal scheduleSyncService unsyncedChanges: " + persist);
        if (persist) {
            OSSyncService.getInstance().scheduleSyncTask(appContext);
        }
        boolean scheduleUpdate = LocationController.scheduleUpdate(appContext);
        OSLogger oSLogger2 = logger;
        oSLogger2.debug("OneSignal scheduleSyncService locationScheduled: " + scheduleUpdate);
        return scheduleUpdate || persist;
    }

    static void onAppFocus() {
        Log(LOG_LEVEL.DEBUG, "Application on focus");
        setInForeground(true);
        if (!appEntryState.equals(AppEntryAction.NOTIFICATION_CLICK)) {
            callEntryStateListeners(appEntryState);
            if (!appEntryState.equals(AppEntryAction.NOTIFICATION_CLICK)) {
                appEntryState = AppEntryAction.APP_OPEN;
            }
        }
        LocationController.onFocusChange();
        NotificationPermissionController.INSTANCE.onAppForegrounded();
        if (!OSUtils.shouldLogMissingAppIdError(appId)) {
            if (!remoteParamController.isRemoteParamsCallDone()) {
                Log(LOG_LEVEL.DEBUG, "Delay onAppFocus logic due to missing remote params");
                makeAndroidParamsRequest(appId, getUserId(), false);
                return;
            }
            onAppFocusLogic();
        }
    }

    static void onAppStartFocusLogic() {
        refreshNotificationPermissionState();
    }

    static void refreshNotificationPermissionState() {
        getCurrentPermissionState(appContext).refreshAsTo();
    }

    private static void onAppFocusLogic() {
        if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("onAppFocus")) {
            getFocusTimeController().appForegrounded();
            doSessionInit();
            TrackGooglePurchase trackGooglePurchase2 = trackGooglePurchase;
            if (trackGooglePurchase2 != null) {
                trackGooglePurchase2.trackIAP();
            }
            OSNotificationRestoreWorkManager.beginEnqueueingWork(appContext, false);
            refreshNotificationPermissionState();
            if (trackFirebaseAnalytics != null && getFirebaseAnalyticsEnabled()) {
                trackFirebaseAnalytics.trackInfluenceOpenEvent();
            }
            OSSyncService.getInstance().cancelSyncTask(appContext);
        }
    }

    static void addNetType(JSONObject jSONObject) {
        try {
            jSONObject.put("net_type", osUtils.getNetType());
        } catch (Throwable unused) {
        }
    }

    private static int getTimeZoneOffset() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / 1000;
    }

    private static String getTimeZoneId() {
        if (Build.VERSION.SDK_INT >= 26) {
            return ZoneId.systemDefault().getId();
        }
        return TimeZone.getDefault().getID();
    }

    /* access modifiers changed from: private */
    public static void registerUser() {
        OSLogger oSLogger = logger;
        oSLogger.debug("registerUser:registerForPushFired:" + registerForPushFired + ", locationFired: " + locationFired + ", remoteParams: " + getRemoteParams() + ", appId: " + appId);
        if (!registerForPushFired || !locationFired || getRemoteParams() == null || appId == null) {
            logger.debug("registerUser not possible");
        } else {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        OneSignal.registerUserTask();
                    } catch (JSONException e2) {
                        OneSignal.Log(LOG_LEVEL.FATAL, "FATAL Error registering device!", e2);
                    }
                }
            }, "OS_REG_USER").start();
        }
    }

    /* access modifiers changed from: private */
    public static void registerUserTask() throws JSONException {
        LocationController.LocationPoint locationPoint;
        String packageName = appContext.getPackageName();
        PackageManager packageManager = appContext.getPackageManager();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(OSOutcomeConstants.APP_ID, getSavedAppId());
        jSONObject.put("device_os", Build.VERSION.RELEASE);
        jSONObject.put("timezone", getTimeZoneOffset());
        jSONObject.put("timezone_id", getTimeZoneId());
        jSONObject.put("language", languageContext.getLanguage());
        jSONObject.put(ServiceProvider.NAMED_SDK, VERSION);
        jSONObject.put("sdk_type", sdkType);
        jSONObject.put("android_package", packageName);
        jSONObject.put("device_model", Build.MODEL);
        try {
            jSONObject.put("game_version", packageManager.getPackageInfo(packageName, 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("net_type", osUtils.getNetType());
        jSONObject.put("carrier", osUtils.getCarrierName());
        jSONObject.put("rooted", RootToolsInternalMethods.isRooted());
        OneSignalStateSynchronizer.updateDeviceInfo(jSONObject, (OneSignalStateSynchronizer.OSDeviceInfoCompletionHandler) null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("identifier", lastRegistrationId);
        jSONObject2.put("subscribableStatus", subscribableStatus);
        jSONObject2.put("androidPermission", areNotificationsEnabledForSubscribedState());
        jSONObject2.put(OSOutcomeConstants.DEVICE_TYPE, osUtils.getDeviceType());
        OneSignalStateSynchronizer.updatePushState(jSONObject2);
        if (isLocationShared() && (locationPoint = lastLocationPoint) != null) {
            OneSignalStateSynchronizer.updateLocation(locationPoint);
        }
        logger.debug("registerUserTask calling readyToUpdate");
        OneSignalStateSynchronizer.readyToUpdate(true);
        waitingToPostStateSync = false;
    }

    public static void setSMSNumber(String str, OSSMSUpdateHandler oSSMSUpdateHandler) {
        setSMSNumber(str, (String) null, oSSMSUpdateHandler);
    }

    public static void setSMSNumber(String str) {
        setSMSNumber(str, (String) null, (OSSMSUpdateHandler) null);
    }

    public static void setSMSNumber(String str, String str2) {
        setSMSNumber(str, str2, (OSSMSUpdateHandler) null);
    }

    public static void setSMSNumber(final String str, final String str2, final OSSMSUpdateHandler oSSMSUpdateHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("setSMSNumber()")) {
            logger.error("Waiting for remote params. Moving setSMSNumber() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running setSMSNumber() operation from a pending task queue.");
                    OneSignal.setSMSNumber(str, str2, oSSMSUpdateHandler);
                }
            });
        } else if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("setSMSNumber()")) {
            if (TextUtils.isEmpty(str)) {
                if (oSSMSUpdateHandler != null) {
                    oSSMSUpdateHandler.onFailure(new OSSMSUpdateError(SMSErrorType.VALIDATION, "SMS number is invalid"));
                }
                logger.error("SMS number is invalid");
            } else if (!getRemoteParams().useSMSAuth || !(str2 == null || str2.length() == 0)) {
                smsUpdateHandler = oSSMSUpdateHandler;
                getCurrentSMSSubscriptionState(appContext).setSMSNumber(str);
                OneSignalStateSynchronizer.setSMSNumber(str, str2);
            } else {
                if (oSSMSUpdateHandler != null) {
                    oSSMSUpdateHandler.onFailure(new OSSMSUpdateError(SMSErrorType.REQUIRES_SMS_AUTH, "SMS authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
                }
                logger.error("SMS authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            }
        }
    }

    public static void logoutSMSNumber() {
        logoutSMSNumber((OSSMSUpdateHandler) null);
    }

    public static void logoutSMSNumber(final OSSMSUpdateHandler oSSMSUpdateHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("logoutSMSNumber()")) {
            logger.error("Waiting for remote params. Moving logoutSMSNumber() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running  logoutSMSNumber() operation from pending task queue.");
                    OneSignal.logoutSMSNumber(OSSMSUpdateHandler.this);
                }
            });
        } else if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("logoutSMSNumber()")) {
            if (getSMSId() == null) {
                if (oSSMSUpdateHandler != null) {
                    oSSMSUpdateHandler.onFailure(new OSSMSUpdateError(SMSErrorType.INVALID_OPERATION, "logoutSMSNumber() not valid as sms number was not set or already logged out!"));
                }
                logger.error("logoutSMSNumber() not valid as sms number was not set or already logged out!");
                return;
            }
            smsLogoutHandler = oSSMSUpdateHandler;
            OneSignalStateSynchronizer.logoutSMS();
        }
    }

    public static void setEmail(String str, EmailUpdateHandler emailUpdateHandler2) {
        setEmail(str, (String) null, emailUpdateHandler2);
    }

    public static void setEmail(String str) {
        setEmail(str, (String) null, (EmailUpdateHandler) null);
    }

    public static void setEmail(String str, String str2) {
        setEmail(str, str2, (EmailUpdateHandler) null);
    }

    public static void setEmail(final String str, final String str2, final EmailUpdateHandler emailUpdateHandler2) {
        if (taskRemoteController.shouldQueueTaskForInit("setEmail()")) {
            logger.error("Waiting for remote params. Moving setEmail() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running setEmail() operation from a pending task queue.");
                    OneSignal.setEmail(str, str2, emailUpdateHandler2);
                }
            });
        } else if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("setEmail()")) {
            if (!OSUtils.isValidEmail(str)) {
                if (emailUpdateHandler2 != null) {
                    emailUpdateHandler2.onFailure(new EmailUpdateError(EmailErrorType.VALIDATION, "Email is invalid"));
                }
                logger.error("Email is invalid");
            } else if (!getRemoteParams().useEmailAuth || !(str2 == null || str2.length() == 0)) {
                emailUpdateHandler = emailUpdateHandler2;
                String trim = str.trim();
                if (str2 != null) {
                    str2 = str2.toLowerCase();
                }
                getCurrentEmailSubscriptionState(appContext).setEmailAddress(trim);
                OneSignalStateSynchronizer.setEmail(trim.toLowerCase(), str2);
            } else {
                if (emailUpdateHandler2 != null) {
                    emailUpdateHandler2.onFailure(new EmailUpdateError(EmailErrorType.REQUIRES_EMAIL_AUTH, "Email authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
                }
                logger.error("Email authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            }
        }
    }

    public static void logoutEmail() {
        logoutEmail((EmailUpdateHandler) null);
    }

    public static void logoutEmail(final EmailUpdateHandler emailUpdateHandler2) {
        if (taskRemoteController.shouldQueueTaskForInit("logoutEmail()")) {
            logger.error("Waiting for remote params. Moving logoutEmail() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running  logoutEmail() operation from pending task queue.");
                    OneSignal.logoutEmail(EmailUpdateHandler.this);
                }
            });
        } else if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("logoutEmail()")) {
            if (getEmailId() == null) {
                if (emailUpdateHandler2 != null) {
                    emailUpdateHandler2.onFailure(new EmailUpdateError(EmailErrorType.INVALID_OPERATION, "logoutEmail not valid as email was not set or already logged out!"));
                }
                logger.error("logoutEmail not valid as email was not set or already logged out!");
                return;
            }
            emailLogoutHandler = emailUpdateHandler2;
            OneSignalStateSynchronizer.logoutEmail();
        }
    }

    public static void setLanguage(String str) {
        setLanguage(str, (OSSetLanguageCompletionHandler) null);
    }

    public static void setLanguage(final String str, final OSSetLanguageCompletionHandler oSSetLanguageCompletionHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("setLanguage()")) {
            logger.error("Waiting for remote params. Moving setLanguage() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running setLanguage() operation from pending task queue.");
                    OneSignal.setLanguage(str, oSSetLanguageCompletionHandler);
                }
            });
            return;
        }
        AnonymousClass16 r0 = null;
        if (oSSetLanguageCompletionHandler != null) {
            r0 = new OneSignalStateSynchronizer.OSDeviceInfoCompletionHandler() {
                public void onSuccess(String str) {
                    OSSetLanguageCompletionHandler.this.onSuccess(str);
                }

                public void onFailure(OneSignalStateSynchronizer.OSDeviceInfoError oSDeviceInfoError) {
                    OSSetLanguageCompletionHandler.this.onFailure(new OSLanguageError(oSDeviceInfoError.errorCode, oSDeviceInfoError.message));
                }
            };
        }
        if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("setLanguage()")) {
            LanguageProviderAppDefined languageProviderAppDefined = new LanguageProviderAppDefined(preferences);
            languageProviderAppDefined.setLanguage(str);
            languageContext.setStrategy(languageProviderAppDefined);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("language", languageContext.getLanguage());
                OneSignalStateSynchronizer.updateDeviceInfo(jSONObject, r0);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void setExternalUserId(String str) {
        setExternalUserId(str, (String) null, (OSExternalUserIdUpdateCompletionHandler) null);
    }

    public static void setExternalUserId(String str, OSExternalUserIdUpdateCompletionHandler oSExternalUserIdUpdateCompletionHandler) {
        setExternalUserId(str, (String) null, oSExternalUserIdUpdateCompletionHandler);
    }

    public static void setExternalUserId(String str, String str2) {
        setExternalUserId(str, str2, (OSExternalUserIdUpdateCompletionHandler) null);
    }

    public static void setExternalUserId(final String str, final String str2, final OSExternalUserIdUpdateCompletionHandler oSExternalUserIdUpdateCompletionHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("setExternalUserId()")) {
            logger.error("Waiting for remote params. Moving setExternalUserId() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running setExternalUserId() operation from pending task queue.");
                    OneSignal.setExternalUserId(str, str2, oSExternalUserIdUpdateCompletionHandler);
                }
            });
        } else if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("setExternalUserId()")) {
            if (str == null) {
                logger.warning("External id can't be null, set an empty string to remove an external id");
            } else if (str.isEmpty() || getRemoteParams() == null || !getRemoteParams().useUserIdAuth || !(str2 == null || str2.length() == 0)) {
                if (str2 != null) {
                    str2 = str2.toLowerCase();
                }
                try {
                    OneSignalStateSynchronizer.setExternalUserId(str, str2, oSExternalUserIdUpdateCompletionHandler);
                } catch (JSONException e2) {
                    String str3 = str.equals("") ? "remove" : "set";
                    OSLogger oSLogger = logger;
                    oSLogger.error("Attempted to " + str3 + " external ID but encountered a JSON exception");
                    e2.printStackTrace();
                }
            } else {
                if (oSExternalUserIdUpdateCompletionHandler != null) {
                    oSExternalUserIdUpdateCompletionHandler.onFailure(new ExternalIdError(ExternalIdErrorType.REQUIRES_EXTERNAL_ID_AUTH, "External Id authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
                }
                logger.error("External Id authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            }
        }
    }

    public static void removeExternalUserId() {
        if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("removeExternalUserId()")) {
            removeExternalUserId((OSExternalUserIdUpdateCompletionHandler) null);
        }
    }

    public static void removeExternalUserId(OSExternalUserIdUpdateCompletionHandler oSExternalUserIdUpdateCompletionHandler) {
        if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("removeExternalUserId()")) {
            setExternalUserId("", oSExternalUserIdUpdateCompletionHandler);
        }
    }

    public static void sendTag(final String str, final String str2) {
        if (taskRemoteController.shouldQueueTaskForInit("sendTag()")) {
            logger.error("Waiting for remote params. Moving sendTag() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running sendTag() operation from pending task queue.");
                    OneSignal.sendTag(str, str2);
                }
            });
        } else if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("sendTag()")) {
            try {
                sendTags(new JSONObject().put(str, str2));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void sendTags(String str) {
        try {
            sendTags(new JSONObject(str));
        } catch (JSONException e2) {
            Log(LOG_LEVEL.ERROR, "Generating JSONObject for sendTags failed!", e2);
        }
    }

    public static void sendTags(JSONObject jSONObject) {
        sendTags(jSONObject, (ChangeTagsUpdateHandler) null);
    }

    public static void sendTags(final JSONObject jSONObject, final ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("sendTags()")) {
            logger.error("Waiting for remote params. Moving sendTags() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running sendTags() operation from pending task queue.");
                    OneSignal.sendTags(jSONObject, changeTagsUpdateHandler);
                }
            });
        } else if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("sendTags()")) {
            AnonymousClass20 r0 = new Runnable() {
                public void run() {
                    if (jSONObject == null) {
                        OneSignal.logger.error("Attempted to send null tags");
                        ChangeTagsUpdateHandler changeTagsUpdateHandler = changeTagsUpdateHandler;
                        if (changeTagsUpdateHandler != null) {
                            changeTagsUpdateHandler.onFailure(new SendTagsError(-1, "Attempted to send null tags"));
                            return;
                        }
                        return;
                    }
                    JSONObject jSONObject = OneSignalStateSynchronizer.getTags(false).result;
                    JSONObject jSONObject2 = new JSONObject();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        try {
                            Object opt = jSONObject.opt(next);
                            if (!(opt instanceof JSONArray)) {
                                if (!(opt instanceof JSONObject)) {
                                    if (!jSONObject.isNull(next)) {
                                        if (!"".equals(opt)) {
                                            jSONObject2.put(next, opt.toString());
                                        }
                                    }
                                    if (jSONObject != null && jSONObject.has(next)) {
                                        jSONObject2.put(next, "");
                                    }
                                }
                            }
                            LOG_LEVEL log_level = LOG_LEVEL.ERROR;
                            OneSignal.Log(log_level, "Omitting key '" + next + "'! sendTags DO NOT supported nested values!");
                        } catch (Throwable unused) {
                        }
                    }
                    if (!jSONObject2.toString().equals(JsonUtils.EMPTY_JSON)) {
                        OSLogger access$100 = OneSignal.logger;
                        access$100.debug("Available tags to send: " + jSONObject2.toString());
                        OneSignalStateSynchronizer.sendTags(jSONObject2, changeTagsUpdateHandler);
                        return;
                    }
                    OneSignal.logger.debug("Send tags ended successfully");
                    ChangeTagsUpdateHandler changeTagsUpdateHandler2 = changeTagsUpdateHandler;
                    if (changeTagsUpdateHandler2 != null) {
                        changeTagsUpdateHandler2.onSuccess(jSONObject);
                    }
                }
            };
            if (taskRemoteController.shouldRunTaskThroughQueue()) {
                logger.debug("Sending sendTags() operation to pending task queue.");
                taskRemoteController.addTaskToQueue((Runnable) r0);
                return;
            }
            r0.run();
        }
    }

    public static void postNotification(String str, PostNotificationResponseHandler postNotificationResponseHandler) {
        try {
            postNotification(new JSONObject(str), postNotificationResponseHandler);
        } catch (JSONException unused) {
            LOG_LEVEL log_level = LOG_LEVEL.ERROR;
            Log(log_level, "Invalid postNotification JSON format: " + str);
        }
    }

    public static void postNotification(JSONObject jSONObject, final PostNotificationResponseHandler postNotificationResponseHandler) {
        if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("postNotification()")) {
            try {
                if (!jSONObject.has(OSOutcomeConstants.APP_ID)) {
                    jSONObject.put(OSOutcomeConstants.APP_ID, getSavedAppId());
                }
                if (jSONObject.has(OSOutcomeConstants.APP_ID)) {
                    OneSignalRestClient.post("notifications/", jSONObject, new OneSignalRestClient.ResponseHandler() {
                        public void onSuccess(String str) {
                            OSLogger access$100 = OneSignal.logger;
                            StringBuilder sb = new StringBuilder();
                            sb.append("HTTP create notification success: ");
                            sb.append(str != null ? str : "null");
                            access$100.debug(sb.toString());
                            if (PostNotificationResponseHandler.this != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("errors")) {
                                        PostNotificationResponseHandler.this.onFailure(jSONObject);
                                    } else {
                                        PostNotificationResponseHandler.this.onSuccess(new JSONObject(str));
                                    }
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        }

                        /* access modifiers changed from: package-private */
                        /* JADX WARNING: Can't wrap try/catch for region: R(6:(1:3)|4|5|6|7|13) */
                        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
                            return;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
                            return;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
                            r2 = move-exception;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
                            r2.printStackTrace();
                         */
                        /* JADX WARNING: Failed to process nested try/catch */
                        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0018 */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void onFailure(int r2, java.lang.String r3, java.lang.Throwable r4) {
                            /*
                                r1 = this;
                                java.lang.String r0 = "create notification failed"
                                com.onesignal.OneSignal.logHttpError(r0, r2, r4, r3)
                                com.onesignal.OneSignal$PostNotificationResponseHandler r4 = com.onesignal.OneSignal.PostNotificationResponseHandler.this
                                if (r4 == 0) goto L_0x0029
                                if (r2 != 0) goto L_0x000d
                                java.lang.String r3 = "{\"error\": \"HTTP no response error\"}"
                            L_0x000d:
                                com.onesignal.OneSignal$PostNotificationResponseHandler r2 = com.onesignal.OneSignal.PostNotificationResponseHandler.this     // Catch:{ all -> 0x0018 }
                                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x0018 }
                                r4.<init>(r3)     // Catch:{ all -> 0x0018 }
                                r2.onFailure(r4)     // Catch:{ all -> 0x0018 }
                                goto L_0x0029
                            L_0x0018:
                                com.onesignal.OneSignal$PostNotificationResponseHandler r2 = com.onesignal.OneSignal.PostNotificationResponseHandler.this     // Catch:{ JSONException -> 0x0025 }
                                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0025 }
                                java.lang.String r4 = "{\"error\": \"Unknown response!\"}"
                                r3.<init>(r4)     // Catch:{ JSONException -> 0x0025 }
                                r2.onFailure(r3)     // Catch:{ JSONException -> 0x0025 }
                                goto L_0x0029
                            L_0x0025:
                                r2 = move-exception
                                r2.printStackTrace()
                            L_0x0029:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OneSignal.AnonymousClass21.onFailure(int, java.lang.String, java.lang.Throwable):void");
                        }
                    });
                } else if (postNotificationResponseHandler != null) {
                    postNotificationResponseHandler.onFailure(new JSONObject().put("error", "Missing app_id"));
                }
            } catch (JSONException e2) {
                logger.error("HTTP create notification json exception!", e2);
                if (postNotificationResponseHandler != null) {
                    try {
                        postNotificationResponseHandler.onFailure(new JSONObject("{'error': 'HTTP create notification json exception!'}"));
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }
    }

    public static void getTags(final OSGetTagsHandler oSGetTagsHandler) {
        if (taskRemoteController.shouldQueueTaskForInit("getTags()")) {
            logger.error("Waiting for remote params. Moving getTags() operation to a pending queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running getTags() operation from pending queue.");
                    OneSignal.getTags(OSGetTagsHandler.this);
                }
            });
        } else if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("getTags()")) {
            if (oSGetTagsHandler == null) {
                logger.error("getTags called with null GetTagsHandler!");
            } else {
                new Thread(new Runnable() {
                    public void run() {
                        synchronized (OneSignal.pendingGetTagsHandlers) {
                            OneSignal.pendingGetTagsHandlers.add(OSGetTagsHandler.this);
                            if (OneSignal.pendingGetTagsHandlers.size() <= 1) {
                                OneSignal.runGetTags();
                            }
                        }
                    }
                }, "OS_GETTAGS").start();
            }
        }
    }

    /* access modifiers changed from: private */
    public static void runGetTags() {
        if (getUserId() == null) {
            logger.warning("getTags called under a null user!");
        } else {
            internalFireGetTagsCallbacks();
        }
    }

    private static void internalFireGetTagsCallbacks() {
        synchronized (pendingGetTagsHandlers) {
            if (pendingGetTagsHandlers.size() != 0) {
                new Thread(new Runnable() {
                    public void run() {
                        JSONObject jSONObject;
                        UserStateSynchronizer.GetTagsResult tags = OneSignalStateSynchronizer.getTags(!OneSignal.getTagsCall);
                        if (tags.serverSuccess) {
                            boolean unused = OneSignal.getTagsCall = true;
                        }
                        synchronized (OneSignal.pendingGetTagsHandlers) {
                            Iterator it = OneSignal.pendingGetTagsHandlers.iterator();
                            while (it.hasNext()) {
                                OSGetTagsHandler oSGetTagsHandler = (OSGetTagsHandler) it.next();
                                if (tags.result != null) {
                                    if (!tags.toString().equals(JsonUtils.EMPTY_JSON)) {
                                        jSONObject = tags.result;
                                        oSGetTagsHandler.tagsAvailable(jSONObject);
                                    }
                                }
                                jSONObject = null;
                                oSGetTagsHandler.tagsAvailable(jSONObject);
                            }
                            OneSignal.pendingGetTagsHandlers.clear();
                        }
                    }
                }, "OS_GETTAGS_CALLBACK").start();
            }
        }
    }

    public static void deleteTag(String str) {
        deleteTag(str, (ChangeTagsUpdateHandler) null);
    }

    public static void deleteTag(String str, ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("deleteTag()")) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            deleteTags((Collection<String>) arrayList, changeTagsUpdateHandler);
        }
    }

    public static void deleteTags(Collection<String> collection) {
        deleteTags(collection, (ChangeTagsUpdateHandler) null);
    }

    public static void deleteTags(Collection<String> collection, ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("deleteTags()")) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (String put : collection) {
                    jSONObject.put(put, "");
                }
                sendTags(jSONObject, changeTagsUpdateHandler);
            } catch (Throwable th) {
                Log(LOG_LEVEL.ERROR, "Failed to generate JSON for deleteTags.", th);
            }
        }
    }

    public static void deleteTags(String str) {
        deleteTags(str, (ChangeTagsUpdateHandler) null);
    }

    public static void deleteTags(String str, ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        try {
            deleteTags(new JSONArray(str), changeTagsUpdateHandler);
        } catch (Throwable th) {
            Log(LOG_LEVEL.ERROR, "Failed to generate JSON for deleteTags.", th);
        }
    }

    public static void deleteTags(JSONArray jSONArray, ChangeTagsUpdateHandler changeTagsUpdateHandler) {
        if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("deleteTags()")) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    jSONObject.put(jSONArray.getString(i), "");
                }
                sendTags(jSONObject, changeTagsUpdateHandler);
            } catch (Throwable th) {
                Log(LOG_LEVEL.ERROR, "Failed to generate JSON for deleteTags.", th);
            }
        }
    }

    static void sendPurchases(JSONArray jSONArray, boolean z, OneSignalRestClient.ResponseHandler responseHandler) {
        if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("sendPurchases()")) {
            if (getUserId() == null) {
                IAPUpdateJob iAPUpdateJob = new IAPUpdateJob(jSONArray);
                iapUpdateJob = iAPUpdateJob;
                iAPUpdateJob.newAsExisting = z;
                iapUpdateJob.restResponseHandler = responseHandler;
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(OSOutcomeConstants.APP_ID, getSavedAppId());
                if (z) {
                    jSONObject.put(b.hY, true);
                }
                jSONObject.put("purchases", jSONArray);
                OneSignalStateSynchronizer.sendPurchases(jSONObject, responseHandler);
            } catch (Throwable th) {
                Log(LOG_LEVEL.ERROR, "Failed to generate JSON for sendPurchases.", th);
            }
        }
    }

    private static void runNotificationOpenedCallback(JSONArray jSONArray) {
        if (notificationOpenedHandler == null) {
            unprocessedOpenedNotifs.add(jSONArray);
            return;
        }
        OSNotificationOpenedResult generateNotificationOpenedResult = generateNotificationOpenedResult(jSONArray);
        addEntryStateListener(generateNotificationOpenedResult, appEntryState);
        fireNotificationOpenedHandler(generateNotificationOpenedResult);
    }

    private static OSNotificationOpenedResult generateNotificationOpenedResult(JSONArray jSONArray) {
        int length = jSONArray.length();
        int optInt = jSONArray.optJSONObject(0).optInt(GenerateNotification.BUNDLE_KEY_ANDROID_NOTIFICATION_ID);
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        String str = null;
        JSONObject jSONObject = null;
        for (int i = 0; i < length; i++) {
            try {
                jSONObject = jSONArray.getJSONObject(i);
                if (str == null && jSONObject.has(GenerateNotification.BUNDLE_KEY_ACTION_ID)) {
                    str = jSONObject.optString(GenerateNotification.BUNDLE_KEY_ACTION_ID, (String) null);
                }
                if (z) {
                    z = false;
                } else {
                    arrayList.add(new OSNotification(jSONObject));
                }
            } catch (Throwable th) {
                Log(LOG_LEVEL.ERROR, "Error parsing JSON item " + i + "/" + length + " for callback.", th);
            }
        }
        return new OSNotificationOpenedResult(new OSNotification(arrayList, jSONObject, optInt), new OSNotificationAction(str != null ? OSNotificationAction.ActionType.ActionTaken : OSNotificationAction.ActionType.Opened, str));
    }

    private static void fireNotificationOpenedHandler(final OSNotificationOpenedResult oSNotificationOpenedResult) {
        OSUtils.runOnMainUIThread(new Runnable() {
            public void run() {
                OneSignal.notificationOpenedHandler.notificationOpened(OSNotificationOpenedResult.this);
            }
        });
    }

    static void handleNotificationReceived(OSNotificationGenerationJob oSNotificationGenerationJob) {
        try {
            JSONObject jSONObject = new JSONObject(oSNotificationGenerationJob.getJsonPayload().toString());
            jSONObject.put(GenerateNotification.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, oSNotificationGenerationJob.getAndroidId());
            OSNotificationOpenedResult generateNotificationOpenedResult = generateNotificationOpenedResult(NotificationBundleProcessor.newJsonArray(jSONObject));
            if (trackFirebaseAnalytics != null && getFirebaseAnalyticsEnabled()) {
                trackFirebaseAnalytics.trackReceivedEvent(generateNotificationOpenedResult);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    static boolean shouldFireForegroundHandlers(OSNotificationGenerationJob oSNotificationGenerationJob) {
        if (!isInForeground()) {
            onesignalLog(LOG_LEVEL.INFO, "App is in background, show notification");
            return false;
        } else if (notificationWillShowInForegroundHandler == null) {
            onesignalLog(LOG_LEVEL.INFO, "No NotificationWillShowInForegroundHandler setup, show notification");
            return false;
        } else if (!oSNotificationGenerationJob.isRestoring()) {
            return true;
        } else {
            onesignalLog(LOG_LEVEL.INFO, "Not firing notificationWillShowInForegroundHandler for restored notifications");
            return false;
        }
    }

    static void fireForegroundHandlers(OSNotificationController oSNotificationController) {
        onesignalLog(LOG_LEVEL.INFO, "Fire notificationWillShowInForegroundHandler");
        OSNotificationReceivedEvent notificationReceivedEvent = oSNotificationController.getNotificationReceivedEvent();
        try {
            notificationWillShowInForegroundHandler.notificationWillShowInForeground(notificationReceivedEvent);
        } catch (Throwable th) {
            onesignalLog(LOG_LEVEL.ERROR, "Exception thrown while notification was being processed for display by notificationWillShowInForegroundHandler, showing notification in foreground!");
            notificationReceivedEvent.complete(notificationReceivedEvent.getNotification());
            throw th;
        }
    }

    static void handleNotificationOpen(Activity activity, JSONArray jSONArray, String str) {
        if (!shouldLogUserPrivacyConsentErrorMessageForMethodName((String) null)) {
            notificationOpenedRESTCall(activity, jSONArray);
            if (trackFirebaseAnalytics != null && getFirebaseAnalyticsEnabled()) {
                trackFirebaseAnalytics.trackOpenedEvent(generateNotificationOpenedResult(jSONArray));
            }
            if (shouldInitDirectSessionFromNotificationOpen(activity, jSONArray)) {
                applicationOpenedByNotification(str);
            }
            openDestinationActivity(activity, jSONArray);
            runNotificationOpenedCallback(jSONArray);
        }
    }

    static void openDestinationActivity(Activity activity, JSONArray jSONArray) {
        try {
            Intent intentVisible = GenerateNotificationOpenIntentFromPushPayload.INSTANCE.create(activity, jSONArray.getJSONObject(0)).getIntentVisible();
            if (intentVisible != null) {
                OSLogger oSLogger = logger;
                oSLogger.info("SDK running startActivity with Intent: " + intentVisible);
                activity.startActivity(intentVisible);
                return;
            }
            logger.info("SDK not showing an Activity automatically due to it's settings.");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private static boolean shouldInitDirectSessionFromNotificationOpen(Activity activity, JSONArray jSONArray) {
        if (inForeground) {
            return false;
        }
        try {
            return new OSNotificationOpenBehaviorFromPushPayload(activity, jSONArray.getJSONObject(0)).getShouldOpenApp();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return true;
        }
    }

    static void applicationOpenedByNotification(String str) {
        AppEntryAction appEntryAction = AppEntryAction.NOTIFICATION_CLICK;
        appEntryState = appEntryAction;
        sessionManager.onDirectInfluenceFromNotificationOpen(appEntryAction, str);
    }

    private static void notificationOpenedRESTCall(Context context, JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String optString = new JSONObject(jSONArray.getJSONObject(i).optString(OSNotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM, (String) null)).optString("i", (String) null);
                if (!postedOpenedNotifIds.contains(optString)) {
                    postedOpenedNotifIds.add(optString);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(OSOutcomeConstants.APP_ID, getSavedAppId(context));
                    jSONObject.put("player_id", getSavedUserId(context));
                    jSONObject.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_OPENED, true);
                    jSONObject.put(OSOutcomeConstants.DEVICE_TYPE, osUtils.getDeviceType());
                    OneSignalRestClient.put("notifications/" + optString, jSONObject, new OneSignalRestClient.ResponseHandler() {
                        /* access modifiers changed from: package-private */
                        public void onFailure(int i, String str, Throwable th) {
                            OneSignal.logHttpError("sending Notification Opened Failed", i, th, str);
                        }
                    });
                }
            } catch (Throwable th) {
                Log(LOG_LEVEL.ERROR, "Failed to generate JSON to send notification opened.", th);
            }
        }
    }

    private static void saveAppId(String str) {
        if (appContext != null) {
            OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_GT_APP_ID, str);
        }
    }

    static String getSavedAppId() {
        return getSavedAppId(appContext);
    }

    private static String getSavedAppId(Context context) {
        if (context == null) {
            return null;
        }
        return OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_GT_APP_ID, (String) null);
    }

    private static String getSavedUserId(Context context) {
        if (context == null) {
            return null;
        }
        return OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_GT_PLAYER_ID, (String) null);
    }

    static boolean hasUserId() {
        return getUserId() != null;
    }

    static String getUserId() {
        Context context;
        if (userId == null && (context = appContext) != null) {
            userId = getSavedUserId(context);
        }
        return userId;
    }

    static void saveUserId(String str) {
        userId = str;
        if (appContext != null) {
            OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_GT_PLAYER_ID, userId);
        }
    }

    static boolean hasEmailId() {
        return !TextUtils.isEmpty(emailId);
    }

    static String getEmailId() {
        if (emailId == null && appContext != null) {
            emailId = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_EMAIL_ID, (String) null);
        }
        if (TextUtils.isEmpty(emailId)) {
            return null;
        }
        return emailId;
    }

    static void saveEmailId(String str) {
        emailId = str;
        if (appContext != null) {
            OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_EMAIL_ID, "".equals(emailId) ? null : emailId);
        }
    }

    static boolean hasSMSlId() {
        return !TextUtils.isEmpty(smsId);
    }

    static String getSMSId() {
        if (smsId == null && appContext != null) {
            smsId = OneSignalPrefs.getString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_SMS_ID, (String) null);
        }
        if (TextUtils.isEmpty(smsId)) {
            return null;
        }
        return smsId;
    }

    static void saveSMSId(String str) {
        smsId = str;
        if (appContext != null) {
            OneSignalPrefs.saveString(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_SMS_ID, "".equals(smsId) ? null : smsId);
        }
    }

    static void updateUserIdDependents(String str) {
        saveUserId(str);
        internalFireGetTagsCallbacks();
        getCurrentSubscriptionState(appContext).setUserId(str);
        IAPUpdateJob iAPUpdateJob = iapUpdateJob;
        if (iAPUpdateJob != null) {
            sendPurchases(iAPUpdateJob.toReport, iapUpdateJob.newAsExisting, iapUpdateJob.restResponseHandler);
            iapUpdateJob = null;
        }
        OneSignalStateSynchronizer.refreshSecondaryChannelState();
    }

    static void updateEmailIdDependents(String str) {
        saveEmailId(str);
        getCurrentEmailSubscriptionState(appContext).setEmailUserId(str);
        try {
            OneSignalStateSynchronizer.updatePushState(new JSONObject().put("parent_player_id", str));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    static void updateSMSIdDependents(String str) {
        saveSMSId(str);
        getCurrentSMSSubscriptionState(appContext).setSMSUserId(str);
    }

    static boolean getFirebaseAnalyticsEnabled() {
        return remoteParamController.getFirebaseAnalyticsEnabled();
    }

    static boolean getClearGroupSummaryClick() {
        return remoteParamController.getClearGroupSummaryClick();
    }

    static boolean getDisableGMSMissingPrompt() {
        return remoteParamController.isGMSMissingPromptDisable();
    }

    public static boolean isLocationShared() {
        return remoteParamController.isLocationShared();
    }

    static boolean isUserPrivacyConsentRequired() {
        return remoteParamController.isPrivacyConsentRequired();
    }

    static void setLastSessionTime(long j) {
        OSLogger oSLogger = logger;
        oSLogger.debug("Last session time set to: " + j);
        OneSignalPrefs.saveLong(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_LAST_SESSION_TIME, j);
    }

    private static long getLastSessionTime() {
        return OneSignalPrefs.getLong(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_LAST_SESSION_TIME, -31000);
    }

    public static void disablePush(final boolean z) {
        if (taskRemoteController.shouldQueueTaskForInit("setSubscription()")) {
            logger.error("Waiting for remote params. Moving setSubscription() operation to a pending queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running setSubscription() operation from pending queue.");
                    OneSignal.disablePush(z);
                }
            });
        } else if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("setSubscription()")) {
            getCurrentSubscriptionState(appContext).setPushDisabled(z);
            OneSignalStateSynchronizer.setSubscription(!z);
        }
    }

    public static void disableGMSMissingPrompt(boolean z) {
        if (!getRemoteParamController().hasDisableGMSMissingPromptKey()) {
            getRemoteParamController().saveGMSMissingPromptDisable(z);
        }
    }

    public static void setLocationShared(final boolean z) {
        if (taskRemoteController.shouldQueueTaskForInit("setLocationShared()")) {
            logger.error("Waiting for remote params. Moving setLocationShared() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running setLocationShared() operation from pending task queue.");
                    OneSignal.setLocationShared(z);
                }
            });
        } else if (!getRemoteParamController().hasLocationKey()) {
            startLocationShared(z);
        }
    }

    static void startLocationShared(boolean z) {
        OSLogger oSLogger = logger;
        oSLogger.debug("OneSignal startLocationShared: " + z);
        getRemoteParamController().saveLocationShared(z);
        if (!z) {
            logger.debug("OneSignal is shareLocation set false, clearing last location!");
            OneSignalStateSynchronizer.clearLocation();
        }
    }

    public static void promptLocation() {
        promptLocation((OSPromptActionCompletionCallback) null, false);
    }

    static void promptLocation(final OSPromptActionCompletionCallback oSPromptActionCompletionCallback, final boolean z) {
        if (taskRemoteController.shouldQueueTaskForInit("promptLocation()")) {
            logger.error("Waiting for remote params. Moving promptLocation() operation to a pending queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running promptLocation() operation from pending queue.");
                    OneSignal.promptLocation(OSPromptActionCompletionCallback.this, z);
                }
            });
        } else if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("promptLocation()")) {
            LocationController.getLocation(appContext, true, z, new LocationController.LocationPromptCompletionHandler() {
                public LocationController.PermissionType getType() {
                    return LocationController.PermissionType.PROMPT_LOCATION;
                }

                public void onComplete(LocationController.LocationPoint locationPoint) {
                    if (!OneSignal.shouldLogUserPrivacyConsentErrorMessageForMethodName("promptLocation()") && locationPoint != null) {
                        OneSignalStateSynchronizer.updateLocation(locationPoint);
                    }
                }

                /* access modifiers changed from: package-private */
                public void onAnswered(PromptActionResult promptActionResult) {
                    super.onAnswered(promptActionResult);
                    OSPromptActionCompletionCallback oSPromptActionCompletionCallback = OSPromptActionCompletionCallback.this;
                    if (oSPromptActionCompletionCallback != null) {
                        oSPromptActionCompletionCallback.onCompleted(promptActionResult);
                    }
                }
            });
        }
    }

    public static void promptForPushNotifications() {
        promptForPushNotifications(false);
    }

    public static void promptForPushNotifications(boolean z) {
        promptForPushNotifications(z, (PromptForPushNotificationPermissionResponseHandler) null);
    }

    public static void promptForPushNotifications(boolean z, PromptForPushNotificationPermissionResponseHandler promptForPushNotificationPermissionResponseHandler) {
        NotificationPermissionController.INSTANCE.prompt(z, promptForPushNotificationPermissionResponseHandler);
    }

    public static void clearOneSignalNotifications() {
        OSNotificationDataController oSNotificationDataController;
        if (taskRemoteController.shouldQueueTaskForInit("clearOneSignalNotifications()") || (oSNotificationDataController = notificationDataController) == null) {
            logger.error("Waiting for remote params. Moving clearOneSignalNotifications() operation to a pending queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running clearOneSignalNotifications() operation from pending queue.");
                    OneSignal.clearOneSignalNotifications();
                }
            });
            return;
        }
        oSNotificationDataController.clearOneSignalNotifications(new WeakReference(appContext));
    }

    public static void removeNotification(final int i) {
        if (taskRemoteController.shouldQueueTaskForInit("removeNotification()") || notificationDataController == null) {
            logger.error("Waiting for remote params. Moving removeNotification() operation to a pending queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running removeNotification() operation from pending queue.");
                    OneSignal.removeNotification(i);
                }
            });
        } else if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("removeNotification()")) {
            notificationDataController.removeNotification(i, new WeakReference(appContext));
        }
    }

    public static void removeGroupedNotifications(final String str) {
        if (taskRemoteController.shouldQueueTaskForInit("removeGroupedNotifications()") || notificationDataController == null) {
            logger.error("Waiting for remote params. Moving removeGroupedNotifications() operation to a pending queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running removeGroupedNotifications() operation from pending queue.");
                    OneSignal.removeGroupedNotifications(str);
                }
            });
        } else if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("removeGroupedNotifications()")) {
            notificationDataController.removeGroupedNotifications(str, new WeakReference(appContext));
        }
    }

    public static void addPermissionObserver(OSPermissionObserver oSPermissionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not add permission observer");
            return;
        }
        getPermissionStateChangesObserver().addObserver(oSPermissionObserver);
        if (getCurrentPermissionState(appContext).compare(getLastPermissionState(appContext))) {
            OSPermissionChangedInternalObserver.fireChangesToPublicObserver(getCurrentPermissionState(appContext));
        }
    }

    public static void removePermissionObserver(OSPermissionObserver oSPermissionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not modify permission observer");
        } else {
            getPermissionStateChangesObserver().removeObserver(oSPermissionObserver);
        }
    }

    public static void addSubscriptionObserver(OSSubscriptionObserver oSSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not add subscription observer");
            return;
        }
        getSubscriptionStateChangesObserver().addObserver(oSSubscriptionObserver);
        if (getCurrentSubscriptionState(appContext).compare(getLastSubscriptionState(appContext))) {
            OSSubscriptionChangedInternalObserver.fireChangesToPublicObserver(getCurrentSubscriptionState(appContext));
        }
    }

    public static void removeSubscriptionObserver(OSSubscriptionObserver oSSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not modify subscription observer");
        } else {
            getSubscriptionStateChangesObserver().removeObserver(oSSubscriptionObserver);
        }
    }

    public static void addEmailSubscriptionObserver(OSEmailSubscriptionObserver oSEmailSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not add email subscription observer");
            return;
        }
        getEmailSubscriptionStateChangesObserver().addObserver(oSEmailSubscriptionObserver);
        if (getCurrentEmailSubscriptionState(appContext).compare(getLastEmailSubscriptionState(appContext))) {
            OSEmailSubscriptionChangedInternalObserver.fireChangesToPublicObserver(getCurrentEmailSubscriptionState(appContext));
        }
    }

    public static void removeEmailSubscriptionObserver(OSEmailSubscriptionObserver oSEmailSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not modify email subscription observer");
        } else {
            getEmailSubscriptionStateChangesObserver().removeObserver(oSEmailSubscriptionObserver);
        }
    }

    public static void addSMSSubscriptionObserver(OSSMSSubscriptionObserver oSSMSSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not add sms subscription observer");
            return;
        }
        getSMSSubscriptionStateChangesObserver().addObserver(oSSMSSubscriptionObserver);
        if (getCurrentSMSSubscriptionState(appContext).compare(getLastSMSSubscriptionState(appContext))) {
            OSSMSSubscriptionChangedInternalObserver.fireChangesToPublicObserver(getCurrentSMSSubscriptionState(appContext));
        }
    }

    public static void removeSMSSubscriptionObserver(OSSMSSubscriptionObserver oSSMSSubscriptionObserver) {
        if (appContext == null) {
            logger.error("OneSignal.initWithContext has not been called. Could not modify sms subscription observer");
        } else {
            getSMSSubscriptionStateChangesObserver().removeObserver(oSSMSSubscriptionObserver);
        }
    }

    public static void addTriggers(Map<String, Object> map) {
        getInAppMessageController().addTriggers(map);
    }

    public static void addTrigger(String str, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, obj);
        getInAppMessageController().addTriggers(hashMap);
    }

    public static void removeTriggersForKeys(Collection<String> collection) {
        getInAppMessageController().removeTriggersForKeys(collection);
    }

    public static void removeTriggerForKey(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        getInAppMessageController().removeTriggersForKeys(arrayList);
    }

    public static Object getTriggerValueForKey(String str) {
        if (appContext != null) {
            return getInAppMessageController().getTriggerValue(str);
        }
        logger.error("Before calling getTriggerValueForKey, Make sure OneSignal initWithContext and setAppId is called first");
        return null;
    }

    public static Map<String, Object> getTriggers() {
        if (appContext != null) {
            return getInAppMessageController().getTriggers();
        }
        logger.error("Before calling getTriggers, Make sure OneSignal initWithContext and setAppId is called first");
        return new HashMap();
    }

    public static void pauseInAppMessages(final boolean z) {
        if (appContext == null) {
            logger.error("Waiting initWithContext. Moving pauseInAppMessages() operation to a pending task queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running pauseInAppMessages() operation from pending queue.");
                    OneSignal.pauseInAppMessages(z);
                }
            });
            return;
        }
        getInAppMessageController().setInAppMessagingEnabled(!z);
    }

    public static boolean isInAppMessagingPaused() {
        if (appContext != null) {
            return !getInAppMessageController().inAppMessagingEnabled();
        }
        logger.error("Before calling isInAppMessagingPaused, Make sure OneSignal initWithContext and setAppId is called first");
        return false;
    }

    static void notValidOrDuplicated(Context context, JSONObject jSONObject, OSNotificationDataController.InvalidOrDuplicateNotificationCallback invalidOrDuplicateNotificationCallback) {
        if (notificationDataController == null) {
            notificationDataController = new OSNotificationDataController(getDBHelperInstance(context), logger);
        }
        notificationDataController.notValidOrDuplicated(jSONObject, invalidOrDuplicateNotificationCallback);
    }

    static String getNotificationIdFromFCMJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(OSNotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
            if (jSONObject2.has("i")) {
                return jSONObject2.optString("i", (String) null);
            }
            logger.debug("Not a OneSignal formatted FCM message. No 'i' field in custom.");
            return null;
        } catch (JSONException unused) {
            logger.debug("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.");
        }
    }

    static boolean isAppActive() {
        return initDone && isInForeground();
    }

    private static boolean shouldStartNewSession() {
        if (isInForeground() && isPastOnSessionTime()) {
            return true;
        }
        return false;
    }

    private static boolean isPastOnSessionTime() {
        long currentTimeMillis = getTime().getCurrentTimeMillis();
        long lastSessionTime = getLastSessionTime();
        long j = currentTimeMillis - lastSessionTime;
        OSLogger oSLogger = logger;
        oSLogger.debug("isPastOnSessionTime currentTimeMillis: " + currentTimeMillis + " lastSessionTime: " + lastSessionTime + " difference: " + j);
        return j >= MIN_ON_SESSION_TIME_MILLIS;
    }

    static boolean areNotificationsEnabledForSubscribedState() {
        if (remoteParamController.unsubscribeWhenNotificationsAreDisabled()) {
            return OSUtils.areNotificationsEnabled(appContext);
        }
        return true;
    }

    static void handleSuccessfulEmailLogout() {
        EmailUpdateHandler emailUpdateHandler2 = emailLogoutHandler;
        if (emailUpdateHandler2 != null) {
            emailUpdateHandler2.onSuccess();
            emailLogoutHandler = null;
        }
    }

    static void handleFailedEmailLogout() {
        EmailUpdateHandler emailUpdateHandler2 = emailLogoutHandler;
        if (emailUpdateHandler2 != null) {
            emailUpdateHandler2.onFailure(new EmailUpdateError(EmailErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            emailLogoutHandler = null;
        }
    }

    static void fireEmailUpdateSuccess() {
        EmailUpdateHandler emailUpdateHandler2 = emailUpdateHandler;
        if (emailUpdateHandler2 != null) {
            emailUpdateHandler2.onSuccess();
            emailUpdateHandler = null;
        }
    }

    static void fireEmailUpdateFailure() {
        EmailUpdateHandler emailUpdateHandler2 = emailUpdateHandler;
        if (emailUpdateHandler2 != null) {
            emailUpdateHandler2.onFailure(new EmailUpdateError(EmailErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            emailUpdateHandler = null;
        }
    }

    static void handleSuccessfulSMSlLogout(JSONObject jSONObject) {
        OSSMSUpdateHandler oSSMSUpdateHandler = smsLogoutHandler;
        if (oSSMSUpdateHandler != null) {
            oSSMSUpdateHandler.onSuccess(jSONObject);
            smsLogoutHandler = null;
        }
    }

    static void handleFailedSMSLogout() {
        OSSMSUpdateHandler oSSMSUpdateHandler = smsLogoutHandler;
        if (oSSMSUpdateHandler != null) {
            oSSMSUpdateHandler.onFailure(new OSSMSUpdateError(SMSErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            smsLogoutHandler = null;
        }
    }

    static void fireSMSUpdateSuccess(JSONObject jSONObject) {
        OSSMSUpdateHandler oSSMSUpdateHandler = smsUpdateHandler;
        if (oSSMSUpdateHandler != null) {
            oSSMSUpdateHandler.onSuccess(jSONObject);
            smsUpdateHandler = null;
        }
    }

    static void fireSMSUpdateFailure() {
        OSSMSUpdateHandler oSSMSUpdateHandler = smsUpdateHandler;
        if (oSSMSUpdateHandler != null) {
            oSSMSUpdateHandler.onFailure(new OSSMSUpdateError(SMSErrorType.NETWORK, "Failed due to network failure. Will retry on next sync."));
            smsUpdateHandler = null;
        }
    }

    static OSTime getTime() {
        return time;
    }

    static void setTime(OSTime oSTime) {
        time = oSTime;
    }

    static void setTrackerFactory(OSTrackerFactory oSTrackerFactory) {
        trackerFactory = oSTrackerFactory;
    }

    static void setSessionManager(OSSessionManager oSSessionManager) {
        sessionManager = oSSessionManager;
    }

    static void setSharedPreferences(OSSharedPreferences oSSharedPreferences) {
        preferences = oSSharedPreferences;
    }

    static OSSessionManager.SessionListener getSessionListener() {
        return sessionListener;
    }

    static OSRemoteParamController getRemoteParamController() {
        return remoteParamController;
    }

    static OneSignalDbHelper getDBHelperInstance() {
        return OneSignalDbHelper.getInstance(appContext);
    }

    static OneSignalDbHelper getDBHelperInstance(Context context) {
        return OneSignalDbHelper.getInstance(context);
    }

    static OSTaskController getTaskRemoteController() {
        return taskRemoteController;
    }

    static OSTaskController getTaskController() {
        return taskController;
    }

    static FocusTimeController getFocusTimeController() {
        if (focusTimeController == null) {
            focusTimeController = new FocusTimeController(new OSFocusTimeProcessorFactory(), logger);
        }
        return focusTimeController;
    }

    static OSSessionManager getSessionManager() {
        return sessionManager;
    }

    static void sendClickActionOutcomes(List<OSInAppMessageOutcome> list) {
        OSOutcomeEventsController oSOutcomeEventsController = outcomeEventsController;
        if (oSOutcomeEventsController == null || appId == null) {
            Log(LOG_LEVEL.ERROR, "Make sure OneSignal.init is called first");
        } else {
            oSOutcomeEventsController.sendClickActionOutcomes(list);
        }
    }

    public static void sendOutcome(String str) {
        sendOutcome(str, (OutcomeCallback) null);
    }

    public static void sendOutcome(final String str, final OutcomeCallback outcomeCallback) {
        if (!isValidOutcomeEntry(str)) {
            logger.error("Make sure OneSignal initWithContext and setAppId is called first");
        } else if (taskRemoteController.shouldQueueTaskForInit("sendOutcome()") || outcomeEventsController == null) {
            logger.error("Waiting for remote params. Moving sendOutcome() operation to a pending queue.");
            taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OneSignal.logger.debug("Running sendOutcome() operation from pending queue.");
                    OneSignal.sendOutcome(str, outcomeCallback);
                }
            });
        } else if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("sendOutcome()")) {
            outcomeEventsController.sendOutcomeEvent(str, outcomeCallback);
        }
    }

    public static void sendUniqueOutcome(String str) {
        sendUniqueOutcome(str, (OutcomeCallback) null);
    }

    public static void sendUniqueOutcome(final String str, final OutcomeCallback outcomeCallback) {
        if (isValidOutcomeEntry(str)) {
            if (taskRemoteController.shouldQueueTaskForInit("sendUniqueOutcome()") || outcomeEventsController == null) {
                logger.error("Waiting for remote params. Moving sendUniqueOutcome() operation to a pending queue.");
                taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                    public void run() {
                        OneSignal.logger.debug("Running sendUniqueOutcome() operation from pending queue.");
                        OneSignal.sendUniqueOutcome(str, outcomeCallback);
                    }
                });
            } else if (!shouldLogUserPrivacyConsentErrorMessageForMethodName("sendUniqueOutcome()")) {
                outcomeEventsController.sendUniqueOutcomeEvent(str, outcomeCallback);
            }
        }
    }

    public static void sendOutcomeWithValue(String str, float f2) {
        sendOutcomeWithValue(str, f2, (OutcomeCallback) null);
    }

    public static void sendOutcomeWithValue(final String str, final float f2, final OutcomeCallback outcomeCallback) {
        OSOutcomeEventsController oSOutcomeEventsController;
        if (isValidOutcomeEntry(str) && isValidOutcomeValue(f2)) {
            if (taskRemoteController.shouldQueueTaskForInit("sendOutcomeWithValue()") || (oSOutcomeEventsController = outcomeEventsController) == null) {
                logger.error("Waiting for remote params. Moving sendOutcomeWithValue() operation to a pending queue.");
                taskRemoteController.addTaskToQueue((Runnable) new Runnable() {
                    public void run() {
                        OneSignal.logger.debug("Running sendOutcomeWithValue() operation from pending queue.");
                        OneSignal.sendOutcomeWithValue(str, f2, outcomeCallback);
                    }
                });
                return;
            }
            oSOutcomeEventsController.sendOutcomeEventWithValue(str, f2, outcomeCallback);
        }
    }

    private static boolean isValidOutcomeEntry(String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        Log(LOG_LEVEL.ERROR, "Outcome name must not be empty");
        return false;
    }

    private static boolean isValidOutcomeValue(float f2) {
        if (f2 > 0.0f) {
            return true;
        }
        Log(LOG_LEVEL.ERROR, "Outcome value must be greater than 0");
        return false;
    }
}
