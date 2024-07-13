package com.onesignal;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.banners.BannerAdRequest;
import com.onesignal.OSDynamicTriggerController;
import com.onesignal.OSInAppMessageAction;
import com.onesignal.OSInAppMessageRepository;
import com.onesignal.OSSystemConditionController;
import com.onesignal.OneSignal;
import com.onesignal.language.LanguageContext;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class OSInAppMessageController extends OSBackgroundManager implements OSDynamicTriggerController.OSDynamicTriggerControllerObserver, OSSystemConditionController.OSSystemConditionObserver {
    public static final String IN_APP_MESSAGES_JSON_KEY = "in_app_messages";
    private static final String LIQUID_TAG_SCRIPT = "\n\n<script>\n    setPlayerTags(%s);\n</script>";
    /* access modifiers changed from: private */
    public static final Object LOCK = new Object();
    private static final String OS_IAM_DB_ACCESS = "OS_IAM_DB_ACCESS";
    private static ArrayList<String> PREFERRED_VARIANT_ORDER = new ArrayList<String>() {
        {
            add(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            add("app");
            add(BannerAdRequest.TYPE_ALL);
        }
    };
    /* access modifiers changed from: private */
    public final Set<String> clickedClickIds;
    /* access modifiers changed from: private */
    public OSInAppMessagePrompt currentPrompt = null;
    private final Set<String> dismissedMessages;
    /* access modifiers changed from: private */
    public final Set<String> impressionedMessages;
    private OSInAppMessageLifecycleHandler inAppMessageLifecycleHandler;
    /* access modifiers changed from: private */
    public OSInAppMessageRepository inAppMessageRepository;
    /* access modifiers changed from: private */
    public boolean inAppMessageShowing = false;
    private boolean inAppMessagingEnabled = true;
    private final LanguageContext languageContext;
    Date lastTimeInAppDismissed = null;
    /* access modifiers changed from: private */
    public final OSLogger logger;
    private final ArrayList<OSInAppMessageInternal> messageDisplayQueue;
    private ArrayList<OSInAppMessageInternal> messages;
    /* access modifiers changed from: private */
    public OSInAppMessageContent pendingMessageContent = null;
    /* access modifiers changed from: private */
    public List<OSInAppMessageInternal> redisplayedInAppMessages = null;
    private OSSystemConditionController systemConditionController;
    private final OSTaskController taskController;
    OSTriggerController triggerController;
    /* access modifiers changed from: private */
    public String userTagsString = "";
    /* access modifiers changed from: private */
    public final Set<String> viewedPageIds;
    /* access modifiers changed from: private */
    public boolean waitForTags = false;

    protected OSInAppMessageController(OneSignalDbHelper oneSignalDbHelper, OSTaskController oSTaskController, OSLogger oSLogger, OSSharedPreferences oSSharedPreferences, LanguageContext languageContext2) {
        this.taskController = oSTaskController;
        this.messages = new ArrayList<>();
        this.dismissedMessages = OSUtils.newConcurrentSet();
        this.messageDisplayQueue = new ArrayList<>();
        this.impressionedMessages = OSUtils.newConcurrentSet();
        this.viewedPageIds = OSUtils.newConcurrentSet();
        this.clickedClickIds = OSUtils.newConcurrentSet();
        this.triggerController = new OSTriggerController(this);
        this.systemConditionController = new OSSystemConditionController(this);
        this.languageContext = languageContext2;
        this.logger = oSLogger;
        OSInAppMessageRepository inAppMessageRepository2 = getInAppMessageRepository(oneSignalDbHelper, oSLogger, oSSharedPreferences);
        this.inAppMessageRepository = inAppMessageRepository2;
        Set<String> dismissedMessagesId = inAppMessageRepository2.getDismissedMessagesId();
        if (dismissedMessagesId != null) {
            this.dismissedMessages.addAll(dismissedMessagesId);
        }
        Set<String> impressionesMessagesId = this.inAppMessageRepository.getImpressionesMessagesId();
        if (impressionesMessagesId != null) {
            this.impressionedMessages.addAll(impressionesMessagesId);
        }
        Set<String> viewPageImpressionedIds = this.inAppMessageRepository.getViewPageImpressionedIds();
        if (viewPageImpressionedIds != null) {
            this.viewedPageIds.addAll(viewPageImpressionedIds);
        }
        Set<String> clickedMessagesId = this.inAppMessageRepository.getClickedMessagesId();
        if (clickedMessagesId != null) {
            this.clickedClickIds.addAll(clickedMessagesId);
        }
        Date lastTimeInAppDismissed2 = this.inAppMessageRepository.getLastTimeInAppDismissed();
        if (lastTimeInAppDismissed2 != null) {
            this.lastTimeInAppDismissed = lastTimeInAppDismissed2;
        }
        initRedisplayData();
    }

    /* access modifiers changed from: package-private */
    public OSInAppMessageRepository getInAppMessageRepository(OneSignalDbHelper oneSignalDbHelper, OSLogger oSLogger, OSSharedPreferences oSSharedPreferences) {
        if (this.inAppMessageRepository == null) {
            this.inAppMessageRepository = new OSInAppMessageRepository(oneSignalDbHelper, oSLogger, oSSharedPreferences);
        }
        return this.inAppMessageRepository;
    }

    /* access modifiers changed from: protected */
    public void initRedisplayData() {
        this.taskController.addTaskToQueue((Runnable) new BackgroundRunnable() {
            public void run() {
                super.run();
                synchronized (OSInAppMessageController.LOCK) {
                    List unused = OSInAppMessageController.this.redisplayedInAppMessages = OSInAppMessageController.this.inAppMessageRepository.getCachedInAppMessages();
                    OSLogger access$300 = OSInAppMessageController.this.logger;
                    access$300.debug("Retrieved IAMs from DB redisplayedInAppMessages: " + OSInAppMessageController.this.redisplayedInAppMessages.toString());
                }
            }
        });
        this.taskController.startPendingTasks();
    }

    /* access modifiers changed from: package-private */
    public boolean shouldRunTaskThroughQueue() {
        boolean z;
        synchronized (LOCK) {
            z = this.redisplayedInAppMessages == null && this.taskController.shouldRunTaskThroughQueue();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void executeRedisplayIAMDataDependantTask(Runnable runnable) {
        synchronized (LOCK) {
            if (shouldRunTaskThroughQueue()) {
                this.logger.debug("Delaying task due to redisplay data not retrieved yet");
                this.taskController.addTaskToQueue(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void resetSessionLaunchTime() {
        OSDynamicTriggerController.resetSessionLaunchTime();
    }

    /* access modifiers changed from: package-private */
    public void initWithCachedInAppMessages() {
        if (!this.messages.isEmpty()) {
            OSLogger oSLogger = this.logger;
            oSLogger.debug("initWithCachedInAppMessages with already in memory messages: " + this.messages);
            return;
        }
        String savedIAMs = this.inAppMessageRepository.getSavedIAMs();
        OSLogger oSLogger2 = this.logger;
        oSLogger2.debug("initWithCachedInAppMessages: " + savedIAMs);
        if (savedIAMs != null && !savedIAMs.isEmpty()) {
            synchronized (LOCK) {
                try {
                    if (this.messages.isEmpty()) {
                        processInAppMessageJson(new JSONArray(savedIAMs));
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void receivedInAppMessageJson(final JSONArray jSONArray) throws JSONException {
        this.inAppMessageRepository.saveIAMs(jSONArray.toString());
        executeRedisplayIAMDataDependantTask(new Runnable() {
            public void run() {
                OSInAppMessageController.this.resetRedisplayMessagesBySession();
                try {
                    OSInAppMessageController.this.processInAppMessageJson(jSONArray);
                } catch (JSONException e2) {
                    OSInAppMessageController.this.logger.error("ERROR processing InAppMessageJson JSON Response.", e2);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void resetRedisplayMessagesBySession() {
        for (OSInAppMessageInternal displayedInSession : this.redisplayedInAppMessages) {
            displayedInSession.setDisplayedInSession(false);
        }
    }

    /* access modifiers changed from: private */
    public void processInAppMessageJson(JSONArray jSONArray) throws JSONException {
        synchronized (LOCK) {
            ArrayList<OSInAppMessageInternal> arrayList = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                OSInAppMessageInternal oSInAppMessageInternal = new OSInAppMessageInternal(jSONArray.getJSONObject(i));
                if (oSInAppMessageInternal.messageId != null) {
                    arrayList.add(oSInAppMessageInternal);
                }
            }
            this.messages = arrayList;
        }
        evaluateInAppMessages();
    }

    /* access modifiers changed from: private */
    public void evaluateInAppMessages() {
        this.logger.debug("Starting evaluateInAppMessages");
        if (shouldRunTaskThroughQueue()) {
            this.taskController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OSInAppMessageController.this.logger.debug("Delaying evaluateInAppMessages due to redisplay data not retrieved yet");
                    OSInAppMessageController.this.evaluateInAppMessages();
                }
            });
            return;
        }
        Iterator<OSInAppMessageInternal> it = this.messages.iterator();
        while (it.hasNext()) {
            OSInAppMessageInternal next = it.next();
            if (this.triggerController.evaluateMessageTriggers(next)) {
                setDataForRedisplay(next);
                if (!this.dismissedMessages.contains(next.messageId) && !next.isFinished()) {
                    queueMessageForDisplay(next);
                }
            }
        }
    }

    private String variantIdForMessage(OSInAppMessageInternal oSInAppMessageInternal) {
        String language = this.languageContext.getLanguage();
        Iterator<String> it = PREFERRED_VARIANT_ORDER.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (oSInAppMessageInternal.variants.containsKey(next)) {
                HashMap hashMap = oSInAppMessageInternal.variants.get(next);
                if (hashMap.containsKey(language)) {
                    return (String) hashMap.get(language);
                }
                return (String) hashMap.get(RewardedVideo.VIDEO_MODE_DEFAULT);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void onMessageWasShown(final OSInAppMessageInternal oSInAppMessageInternal) {
        onMessageDidDisplay(oSInAppMessageInternal);
        if (!oSInAppMessageInternal.isPreview && !this.impressionedMessages.contains(oSInAppMessageInternal.messageId)) {
            this.impressionedMessages.add(oSInAppMessageInternal.messageId);
            String variantIdForMessage = variantIdForMessage(oSInAppMessageInternal);
            if (variantIdForMessage != null) {
                this.inAppMessageRepository.sendIAMImpression(OneSignal.appId, OneSignal.getUserId(), variantIdForMessage, new OSUtils().getDeviceType(), oSInAppMessageInternal.messageId, this.impressionedMessages, new OSInAppMessageRepository.OSInAppMessageRequestResponse() {
                    public void onSuccess(String str) {
                    }

                    public void onFailure(String str) {
                        OSInAppMessageController.this.impressionedMessages.remove(oSInAppMessageInternal.messageId);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onPageChanged(OSInAppMessageInternal oSInAppMessageInternal, JSONObject jSONObject) {
        OSInAppMessagePage oSInAppMessagePage = new OSInAppMessagePage(jSONObject);
        if (!oSInAppMessageInternal.isPreview) {
            fireRESTCallForPageChange(oSInAppMessageInternal, oSInAppMessagePage);
        }
    }

    /* access modifiers changed from: package-private */
    public void onMessageActionOccurredOnMessage(OSInAppMessageInternal oSInAppMessageInternal, JSONObject jSONObject) throws JSONException {
        OSInAppMessageAction oSInAppMessageAction = new OSInAppMessageAction(jSONObject);
        oSInAppMessageAction.setFirstClick(oSInAppMessageInternal.takeActionAsUnique());
        firePublicClickHandler(oSInAppMessageInternal.messageId, oSInAppMessageAction);
        beginProcessingPrompts(oSInAppMessageInternal, oSInAppMessageAction.getPrompts());
        fireClickAction(oSInAppMessageAction);
        fireRESTCallForClick(oSInAppMessageInternal, oSInAppMessageAction);
        fireTagCallForClick(oSInAppMessageAction);
        fireOutcomesForClick(oSInAppMessageInternal.messageId, oSInAppMessageAction.getOutcomes());
    }

    /* access modifiers changed from: package-private */
    public void onMessageActionOccurredOnPreview(OSInAppMessageInternal oSInAppMessageInternal, JSONObject jSONObject) throws JSONException {
        OSInAppMessageAction oSInAppMessageAction = new OSInAppMessageAction(jSONObject);
        oSInAppMessageAction.setFirstClick(oSInAppMessageInternal.takeActionAsUnique());
        firePublicClickHandler(oSInAppMessageInternal.messageId, oSInAppMessageAction);
        beginProcessingPrompts(oSInAppMessageInternal, oSInAppMessageAction.getPrompts());
        fireClickAction(oSInAppMessageAction);
        logInAppMessagePreviewActions(oSInAppMessageAction);
    }

    /* access modifiers changed from: package-private */
    public void setInAppMessageLifecycleHandler(OSInAppMessageLifecycleHandler oSInAppMessageLifecycleHandler) {
        this.inAppMessageLifecycleHandler = oSInAppMessageLifecycleHandler;
    }

    /* access modifiers changed from: package-private */
    public void onMessageWillDisplay(OSInAppMessageInternal oSInAppMessageInternal) {
        OSInAppMessageLifecycleHandler oSInAppMessageLifecycleHandler = this.inAppMessageLifecycleHandler;
        if (oSInAppMessageLifecycleHandler == null) {
            this.logger.verbose("OSInAppMessageController onMessageWillDisplay: inAppMessageLifecycleHandler is null");
        } else {
            oSInAppMessageLifecycleHandler.onWillDisplayInAppMessage(oSInAppMessageInternal);
        }
    }

    /* access modifiers changed from: package-private */
    public void onMessageDidDisplay(OSInAppMessageInternal oSInAppMessageInternal) {
        OSInAppMessageLifecycleHandler oSInAppMessageLifecycleHandler = this.inAppMessageLifecycleHandler;
        if (oSInAppMessageLifecycleHandler == null) {
            this.logger.verbose("OSInAppMessageController onMessageDidDisplay: inAppMessageLifecycleHandler is null");
        } else {
            oSInAppMessageLifecycleHandler.onDidDisplayInAppMessage(oSInAppMessageInternal);
        }
    }

    /* access modifiers changed from: package-private */
    public void onMessageWillDismiss(OSInAppMessageInternal oSInAppMessageInternal) {
        OSInAppMessageLifecycleHandler oSInAppMessageLifecycleHandler = this.inAppMessageLifecycleHandler;
        if (oSInAppMessageLifecycleHandler == null) {
            this.logger.verbose("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
        } else {
            oSInAppMessageLifecycleHandler.onWillDismissInAppMessage(oSInAppMessageInternal);
        }
    }

    /* access modifiers changed from: package-private */
    public void onMessageDidDismiss(OSInAppMessageInternal oSInAppMessageInternal) {
        OSInAppMessageLifecycleHandler oSInAppMessageLifecycleHandler = this.inAppMessageLifecycleHandler;
        if (oSInAppMessageLifecycleHandler == null) {
            this.logger.verbose("OSInAppMessageController onMessageDidDismiss: inAppMessageLifecycleHandler is null");
        } else {
            oSInAppMessageLifecycleHandler.onDidDismissInAppMessage(oSInAppMessageInternal);
        }
    }

    private void logInAppMessagePreviewActions(OSInAppMessageAction oSInAppMessageAction) {
        if (oSInAppMessageAction.getTags() != null) {
            OSLogger oSLogger = this.logger;
            oSLogger.debug("Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + oSInAppMessageAction.getTags().toString());
        }
        if (oSInAppMessageAction.getOutcomes().size() > 0) {
            OSLogger oSLogger2 = this.logger;
            oSLogger2.debug("Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + oSInAppMessageAction.getOutcomes().toString());
        }
    }

    private void beginProcessingPrompts(OSInAppMessageInternal oSInAppMessageInternal, List<OSInAppMessagePrompt> list) {
        if (list.size() > 0) {
            OSLogger oSLogger = this.logger;
            oSLogger.debug("IAM showing prompts from IAM: " + oSInAppMessageInternal.toString());
            WebViewManager.dismissCurrentInAppMessage();
            showMultiplePrompts(oSInAppMessageInternal, list);
        }
    }

    /* access modifiers changed from: private */
    public void showMultiplePrompts(final OSInAppMessageInternal oSInAppMessageInternal, final List<OSInAppMessagePrompt> list) {
        Iterator<OSInAppMessagePrompt> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            OSInAppMessagePrompt next = it.next();
            if (!next.hasPrompted()) {
                this.currentPrompt = next;
                break;
            }
        }
        if (this.currentPrompt != null) {
            OSLogger oSLogger = this.logger;
            oSLogger.debug("IAM prompt to handle: " + this.currentPrompt.toString());
            this.currentPrompt.setPrompted(true);
            this.currentPrompt.handlePrompt(new OneSignal.OSPromptActionCompletionCallback() {
                public void onCompleted(OneSignal.PromptActionResult promptActionResult) {
                    OSInAppMessagePrompt unused = OSInAppMessageController.this.currentPrompt = null;
                    OSLogger access$300 = OSInAppMessageController.this.logger;
                    access$300.debug("IAM prompt to handle finished with result: " + promptActionResult);
                    if (!oSInAppMessageInternal.isPreview || promptActionResult != OneSignal.PromptActionResult.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                        OSInAppMessageController.this.showMultiplePrompts(oSInAppMessageInternal, list);
                    } else {
                        OSInAppMessageController.this.showAlertDialogMessage(oSInAppMessageInternal, list);
                    }
                }
            });
            return;
        }
        OSLogger oSLogger2 = this.logger;
        oSLogger2.debug("No IAM prompt to handle, dismiss message: " + oSInAppMessageInternal.messageId);
        messageWasDismissed(oSInAppMessageInternal);
    }

    /* access modifiers changed from: private */
    public void showAlertDialogMessage(final OSInAppMessageInternal oSInAppMessageInternal, final List<OSInAppMessagePrompt> list) {
        String string = OneSignal.appContext.getString(R.string.location_permission_missing_title);
        new AlertDialog.Builder(OneSignal.getCurrentActivity()).setTitle(string).setMessage(OneSignal.appContext.getString(R.string.location_permission_missing_message)).setPositiveButton(17039370, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                OSInAppMessageController.this.showMultiplePrompts(oSInAppMessageInternal, list);
            }
        }).show();
    }

    private void fireOutcomesForClick(String str, List<OSInAppMessageOutcome> list) {
        OneSignal.getSessionManager().onDirectInfluenceFromIAMClick(str);
        OneSignal.sendClickActionOutcomes(list);
    }

    private void fireTagCallForClick(OSInAppMessageAction oSInAppMessageAction) {
        if (oSInAppMessageAction.getTags() != null) {
            OSInAppMessageTag tags = oSInAppMessageAction.getTags();
            if (tags.getTagsToAdd() != null) {
                OneSignal.sendTags(tags.getTagsToAdd());
            }
            if (tags.getTagsToRemove() != null) {
                OneSignal.deleteTags(tags.getTagsToRemove(), (OneSignal.ChangeTagsUpdateHandler) null);
            }
        }
    }

    private void firePublicClickHandler(final String str, final OSInAppMessageAction oSInAppMessageAction) {
        if (OneSignal.inAppMessageClickHandler != null) {
            OSUtils.runOnMainUIThread(new Runnable() {
                public void run() {
                    OneSignal.getSessionManager().onDirectInfluenceFromIAMClick(str);
                    OneSignal.inAppMessageClickHandler.inAppMessageClicked(oSInAppMessageAction);
                }
            });
        }
    }

    private void fireClickAction(OSInAppMessageAction oSInAppMessageAction) {
        if (oSInAppMessageAction.getClickUrl() != null && !oSInAppMessageAction.getClickUrl().isEmpty()) {
            if (oSInAppMessageAction.getUrlTarget() == OSInAppMessageAction.OSInAppMessageActionUrlType.BROWSER) {
                OSUtils.openURLInBrowser(oSInAppMessageAction.getClickUrl());
            } else if (oSInAppMessageAction.getUrlTarget() == OSInAppMessageAction.OSInAppMessageActionUrlType.IN_APP_WEBVIEW) {
                OneSignalChromeTab.open(oSInAppMessageAction.getClickUrl(), true);
            }
        }
    }

    private void fireRESTCallForPageChange(OSInAppMessageInternal oSInAppMessageInternal, OSInAppMessagePage oSInAppMessagePage) {
        String variantIdForMessage = variantIdForMessage(oSInAppMessageInternal);
        if (variantIdForMessage != null) {
            String pageId = oSInAppMessagePage.getPageId();
            final String str = oSInAppMessageInternal.messageId + pageId;
            if (this.viewedPageIds.contains(str)) {
                this.logger.verbose("Already sent page impression for id: " + pageId);
                return;
            }
            this.viewedPageIds.add(str);
            this.inAppMessageRepository.sendIAMPageImpression(OneSignal.appId, OneSignal.getUserId(), variantIdForMessage, new OSUtils().getDeviceType(), oSInAppMessageInternal.messageId, pageId, this.viewedPageIds, new OSInAppMessageRepository.OSInAppMessageRequestResponse() {
                public void onSuccess(String str) {
                }

                public void onFailure(String str) {
                    OSInAppMessageController.this.viewedPageIds.remove(str);
                }
            });
        }
    }

    private void fireRESTCallForClick(final OSInAppMessageInternal oSInAppMessageInternal, OSInAppMessageAction oSInAppMessageAction) {
        String variantIdForMessage = variantIdForMessage(oSInAppMessageInternal);
        if (variantIdForMessage != null) {
            final String clickId = oSInAppMessageAction.getClickId();
            if ((oSInAppMessageInternal.getRedisplayStats().isRedisplayEnabled() && oSInAppMessageInternal.isClickAvailable(clickId)) || !this.clickedClickIds.contains(clickId)) {
                this.clickedClickIds.add(clickId);
                oSInAppMessageInternal.addClickId(clickId);
                this.inAppMessageRepository.sendIAMClick(OneSignal.appId, OneSignal.getUserId(), variantIdForMessage, new OSUtils().getDeviceType(), oSInAppMessageInternal.messageId, clickId, oSInAppMessageAction.isFirstClick(), this.clickedClickIds, new OSInAppMessageRepository.OSInAppMessageRequestResponse() {
                    public void onSuccess(String str) {
                    }

                    public void onFailure(String str) {
                        OSInAppMessageController.this.clickedClickIds.remove(clickId);
                        oSInAppMessageInternal.removeClickId(clickId);
                    }
                });
            }
        }
    }

    private void setDataForRedisplay(OSInAppMessageInternal oSInAppMessageInternal) {
        boolean contains = this.dismissedMessages.contains(oSInAppMessageInternal.messageId);
        int indexOf = this.redisplayedInAppMessages.indexOf(oSInAppMessageInternal);
        if (contains && indexOf != -1) {
            OSInAppMessageInternal oSInAppMessageInternal2 = this.redisplayedInAppMessages.get(indexOf);
            oSInAppMessageInternal.getRedisplayStats().setDisplayStats(oSInAppMessageInternal2.getRedisplayStats());
            oSInAppMessageInternal.setDisplayedInSession(oSInAppMessageInternal2.isDisplayedInSession());
            boolean hasMessageTriggerChanged = hasMessageTriggerChanged(oSInAppMessageInternal);
            OSLogger oSLogger = this.logger;
            oSLogger.debug("setDataForRedisplay: " + oSInAppMessageInternal.toString() + " triggerHasChanged: " + hasMessageTriggerChanged);
            if (hasMessageTriggerChanged && oSInAppMessageInternal.getRedisplayStats().isDelayTimeSatisfied() && oSInAppMessageInternal.getRedisplayStats().shouldDisplayAgain()) {
                OSLogger oSLogger2 = this.logger;
                oSLogger2.debug("setDataForRedisplay message available for redisplay: " + oSInAppMessageInternal.messageId);
                this.dismissedMessages.remove(oSInAppMessageInternal.messageId);
                this.impressionedMessages.remove(oSInAppMessageInternal.messageId);
                this.viewedPageIds.clear();
                this.inAppMessageRepository.saveViewPageImpressionedIds(this.viewedPageIds);
                oSInAppMessageInternal.clearClickIds();
            }
        }
    }

    private boolean hasMessageTriggerChanged(OSInAppMessageInternal oSInAppMessageInternal) {
        if (this.triggerController.messageHasOnlyDynamicTriggers(oSInAppMessageInternal)) {
            return !oSInAppMessageInternal.isDisplayedInSession();
        }
        boolean z = !oSInAppMessageInternal.isDisplayedInSession() && oSInAppMessageInternal.triggers.isEmpty();
        if (oSInAppMessageInternal.isTriggerChanged() || z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void queueMessageForDisplay(OSInAppMessageInternal oSInAppMessageInternal) {
        synchronized (this.messageDisplayQueue) {
            if (!this.messageDisplayQueue.contains(oSInAppMessageInternal)) {
                this.messageDisplayQueue.add(oSInAppMessageInternal);
                OSLogger oSLogger = this.logger;
                oSLogger.debug("In app message with id: " + oSInAppMessageInternal.messageId + ", added to the queue");
            }
            attemptToShowInAppMessage();
        }
    }

    private void attemptToShowInAppMessage() {
        synchronized (this.messageDisplayQueue) {
            if (!this.systemConditionController.systemConditionsAvailable()) {
                this.logger.warning("In app message not showing due to system condition not correct");
                return;
            }
            OSLogger oSLogger = this.logger;
            oSLogger.debug("displayFirstIAMOnQueue: " + this.messageDisplayQueue);
            if (this.messageDisplayQueue.size() <= 0 || isInAppMessageShowing()) {
                OSLogger oSLogger2 = this.logger;
                oSLogger2.debug("In app message is currently showing or there are no IAMs left in the queue! isInAppMessageShowing: " + isInAppMessageShowing());
                return;
            }
            this.logger.debug("No IAM showing currently, showing first item in the queue!");
            displayMessage(this.messageDisplayQueue.get(0));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isInAppMessageShowing() {
        return this.inAppMessageShowing;
    }

    /* access modifiers changed from: package-private */
    public OSInAppMessageInternal getCurrentDisplayedInAppMessage() {
        if (this.inAppMessageShowing) {
            return this.messageDisplayQueue.get(0);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void messageWasDismissed(OSInAppMessageInternal oSInAppMessageInternal) {
        messageWasDismissed(oSInAppMessageInternal, false);
    }

    /* access modifiers changed from: package-private */
    public void messageWasDismissed(OSInAppMessageInternal oSInAppMessageInternal, boolean z) {
        if (!oSInAppMessageInternal.isPreview) {
            this.dismissedMessages.add(oSInAppMessageInternal.messageId);
            if (!z) {
                this.inAppMessageRepository.saveDismissedMessagesId(this.dismissedMessages);
                this.lastTimeInAppDismissed = new Date();
                persistInAppMessage(oSInAppMessageInternal);
            }
            OSLogger oSLogger = this.logger;
            oSLogger.debug("OSInAppMessageController messageWasDismissed dismissedMessages: " + this.dismissedMessages.toString());
        }
        if (!shouldWaitForPromptsBeforeDismiss()) {
            onMessageDidDismiss(oSInAppMessageInternal);
        }
        dismissCurrentMessage(oSInAppMessageInternal);
    }

    private boolean shouldWaitForPromptsBeforeDismiss() {
        return this.currentPrompt != null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dismissCurrentMessage(com.onesignal.OSInAppMessageInternal r6) {
        /*
            r5 = this;
            com.onesignal.OSSessionManager r0 = com.onesignal.OneSignal.getSessionManager()
            r0.onDirectInfluenceFromIAMClickFinished()
            boolean r0 = r5.shouldWaitForPromptsBeforeDismiss()
            if (r0 == 0) goto L_0x0015
            com.onesignal.OSLogger r6 = r5.logger
            java.lang.String r0 = "Stop evaluateMessageDisplayQueue because prompt is currently displayed"
            r6.debug(r0)
            return
        L_0x0015:
            r0 = 0
            r5.inAppMessageShowing = r0
            java.util.ArrayList<com.onesignal.OSInAppMessageInternal> r1 = r5.messageDisplayQueue
            monitor-enter(r1)
            if (r6 == 0) goto L_0x005f
            boolean r2 = r6.isPreview     // Catch:{ all -> 0x009f }
            if (r2 != 0) goto L_0x005f
            java.util.ArrayList<com.onesignal.OSInAppMessageInternal> r2 = r5.messageDisplayQueue     // Catch:{ all -> 0x009f }
            int r2 = r2.size()     // Catch:{ all -> 0x009f }
            if (r2 <= 0) goto L_0x005f
            java.util.ArrayList<com.onesignal.OSInAppMessageInternal> r2 = r5.messageDisplayQueue     // Catch:{ all -> 0x009f }
            boolean r6 = r2.contains(r6)     // Catch:{ all -> 0x009f }
            if (r6 != 0) goto L_0x003a
            com.onesignal.OSLogger r6 = r5.logger     // Catch:{ all -> 0x009f }
            java.lang.String r0 = "Message already removed from the queue!"
            r6.debug(r0)     // Catch:{ all -> 0x009f }
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            return
        L_0x003a:
            java.util.ArrayList<com.onesignal.OSInAppMessageInternal> r6 = r5.messageDisplayQueue     // Catch:{ all -> 0x009f }
            java.lang.Object r6 = r6.remove(r0)     // Catch:{ all -> 0x009f }
            com.onesignal.OSInAppMessageInternal r6 = (com.onesignal.OSInAppMessageInternal) r6     // Catch:{ all -> 0x009f }
            java.lang.String r6 = r6.messageId     // Catch:{ all -> 0x009f }
            com.onesignal.OSLogger r2 = r5.logger     // Catch:{ all -> 0x009f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r3.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r4 = "In app message with id: "
            r3.append(r4)     // Catch:{ all -> 0x009f }
            r3.append(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = ", dismissed (removed) from the queue!"
            r3.append(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x009f }
            r2.debug(r6)     // Catch:{ all -> 0x009f }
        L_0x005f:
            java.util.ArrayList<com.onesignal.OSInAppMessageInternal> r6 = r5.messageDisplayQueue     // Catch:{ all -> 0x009f }
            int r6 = r6.size()     // Catch:{ all -> 0x009f }
            if (r6 <= 0) goto L_0x0093
            com.onesignal.OSLogger r6 = r5.logger     // Catch:{ all -> 0x009f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r2.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r3 = "In app message on queue available: "
            r2.append(r3)     // Catch:{ all -> 0x009f }
            java.util.ArrayList<com.onesignal.OSInAppMessageInternal> r3 = r5.messageDisplayQueue     // Catch:{ all -> 0x009f }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x009f }
            com.onesignal.OSInAppMessageInternal r3 = (com.onesignal.OSInAppMessageInternal) r3     // Catch:{ all -> 0x009f }
            java.lang.String r3 = r3.messageId     // Catch:{ all -> 0x009f }
            r2.append(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x009f }
            r6.debug(r2)     // Catch:{ all -> 0x009f }
            java.util.ArrayList<com.onesignal.OSInAppMessageInternal> r6 = r5.messageDisplayQueue     // Catch:{ all -> 0x009f }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ all -> 0x009f }
            com.onesignal.OSInAppMessageInternal r6 = (com.onesignal.OSInAppMessageInternal) r6     // Catch:{ all -> 0x009f }
            r5.displayMessage(r6)     // Catch:{ all -> 0x009f }
            goto L_0x009d
        L_0x0093:
            com.onesignal.OSLogger r6 = r5.logger     // Catch:{ all -> 0x009f }
            java.lang.String r0 = "In app message dismissed evaluating messages"
            r6.debug(r0)     // Catch:{ all -> 0x009f }
            r5.evaluateInAppMessages()     // Catch:{ all -> 0x009f }
        L_0x009d:
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            return
        L_0x009f:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSInAppMessageController.dismissCurrentMessage(com.onesignal.OSInAppMessageInternal):void");
    }

    private void persistInAppMessage(final OSInAppMessageInternal oSInAppMessageInternal) {
        oSInAppMessageInternal.getRedisplayStats().setLastDisplayTime(OneSignal.getTime().getCurrentTimeMillis() / 1000);
        oSInAppMessageInternal.getRedisplayStats().incrementDisplayQuantity();
        oSInAppMessageInternal.setTriggerChanged(false);
        oSInAppMessageInternal.setDisplayedInSession(true);
        runRunnableOnThread(new BackgroundRunnable() {
            public void run() {
                super.run();
                OSInAppMessageController.this.inAppMessageRepository.saveInAppMessage(oSInAppMessageInternal);
                OSInAppMessageController.this.inAppMessageRepository.saveLastTimeInAppDismissed(OSInAppMessageController.this.lastTimeInAppDismissed);
            }
        }, OS_IAM_DB_ACCESS);
        int indexOf = this.redisplayedInAppMessages.indexOf(oSInAppMessageInternal);
        if (indexOf != -1) {
            this.redisplayedInAppMessages.set(indexOf, oSInAppMessageInternal);
        } else {
            this.redisplayedInAppMessages.add(oSInAppMessageInternal);
        }
        OSLogger oSLogger = this.logger;
        oSLogger.debug("persistInAppMessageForRedisplay: " + oSInAppMessageInternal.toString() + " with msg array data: " + this.redisplayedInAppMessages.toString());
    }

    private void getTagsForLiquidTemplating(final OSInAppMessageInternal oSInAppMessageInternal, final boolean z) {
        this.waitForTags = false;
        if (z || oSInAppMessageInternal.getHasLiquid()) {
            this.waitForTags = true;
            OneSignal.getTags(new OneSignal.OSGetTagsHandler() {
                public void tagsAvailable(JSONObject jSONObject) {
                    boolean unused = OSInAppMessageController.this.waitForTags = false;
                    if (jSONObject != null) {
                        String unused2 = OSInAppMessageController.this.userTagsString = jSONObject.toString();
                    }
                    if (OSInAppMessageController.this.pendingMessageContent != null) {
                        if (!z) {
                            OneSignal.getSessionManager().onInAppMessageReceived(oSInAppMessageInternal.messageId);
                        }
                        OSInAppMessageContent access$1500 = OSInAppMessageController.this.pendingMessageContent;
                        OSInAppMessageController oSInAppMessageController = OSInAppMessageController.this;
                        access$1500.setContentHtml(oSInAppMessageController.taggedHTMLString(oSInAppMessageController.pendingMessageContent.getContentHtml()));
                        WebViewManager.showMessageContent(oSInAppMessageInternal, OSInAppMessageController.this.pendingMessageContent);
                        OSInAppMessageContent unused3 = OSInAppMessageController.this.pendingMessageContent = null;
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public OSInAppMessageContent parseMessageContentData(JSONObject jSONObject, OSInAppMessageInternal oSInAppMessageInternal) {
        OSInAppMessageContent oSInAppMessageContent = new OSInAppMessageContent(jSONObject);
        oSInAppMessageInternal.setDisplayDuration(oSInAppMessageContent.getDisplayDuration().doubleValue());
        return oSInAppMessageContent;
    }

    private void displayMessage(final OSInAppMessageInternal oSInAppMessageInternal) {
        if (!this.inAppMessagingEnabled) {
            this.logger.verbose("In app messaging is currently paused, in app messages will not be shown!");
            return;
        }
        this.inAppMessageShowing = true;
        getTagsForLiquidTemplating(oSInAppMessageInternal, false);
        this.inAppMessageRepository.getIAMData(OneSignal.appId, oSInAppMessageInternal.messageId, variantIdForMessage(oSInAppMessageInternal), new OSInAppMessageRepository.OSInAppMessageRequestResponse() {
            public void onSuccess(String str) {
                try {
                    OSInAppMessageContent access$1600 = OSInAppMessageController.this.parseMessageContentData(new JSONObject(str), oSInAppMessageInternal);
                    if (access$1600.getContentHtml() == null) {
                        OSInAppMessageController.this.logger.debug("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                    } else if (OSInAppMessageController.this.waitForTags) {
                        OSInAppMessageContent unused = OSInAppMessageController.this.pendingMessageContent = access$1600;
                    } else {
                        OneSignal.getSessionManager().onInAppMessageReceived(oSInAppMessageInternal.messageId);
                        OSInAppMessageController.this.onMessageWillDisplay(oSInAppMessageInternal);
                        access$1600.setContentHtml(OSInAppMessageController.this.taggedHTMLString(access$1600.getContentHtml()));
                        WebViewManager.showMessageContent(oSInAppMessageInternal, access$1600);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }

            public void onFailure(String str) {
                boolean unused = OSInAppMessageController.this.inAppMessageShowing = false;
                try {
                    if (new JSONObject(str).getBoolean("retry")) {
                        OSInAppMessageController.this.queueMessageForDisplay(oSInAppMessageInternal);
                    } else {
                        OSInAppMessageController.this.messageWasDismissed(oSInAppMessageInternal, true);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public String taggedHTMLString(String str) {
        String str2 = this.userTagsString;
        return str + String.format(LIQUID_TAG_SCRIPT, new Object[]{str2});
    }

    /* access modifiers changed from: package-private */
    public void displayPreviewMessage(String str) {
        this.inAppMessageShowing = true;
        final OSInAppMessageInternal oSInAppMessageInternal = new OSInAppMessageInternal(true);
        getTagsForLiquidTemplating(oSInAppMessageInternal, true);
        this.inAppMessageRepository.getIAMPreviewData(OneSignal.appId, str, new OSInAppMessageRepository.OSInAppMessageRequestResponse() {
            public void onSuccess(String str) {
                try {
                    OSInAppMessageContent access$1600 = OSInAppMessageController.this.parseMessageContentData(new JSONObject(str), oSInAppMessageInternal);
                    if (access$1600.getContentHtml() == null) {
                        OSInAppMessageController.this.logger.debug("displayPreviewMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                    } else if (OSInAppMessageController.this.waitForTags) {
                        OSInAppMessageContent unused = OSInAppMessageController.this.pendingMessageContent = access$1600;
                    } else {
                        OSInAppMessageController.this.onMessageWillDisplay(oSInAppMessageInternal);
                        access$1600.setContentHtml(OSInAppMessageController.this.taggedHTMLString(access$1600.getContentHtml()));
                        WebViewManager.showMessageContent(oSInAppMessageInternal, access$1600);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }

            public void onFailure(String str) {
                OSInAppMessageController.this.dismissCurrentMessage((OSInAppMessageInternal) null);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void cleanCachedInAppMessages() {
        runRunnableOnThread(new BackgroundRunnable() {
            public void run() {
                super.run();
                OSInAppMessageController.this.inAppMessageRepository.cleanCachedInAppMessages();
            }
        }, OS_IAM_DB_ACCESS);
    }

    public void messageDynamicTriggerCompleted(String str) {
        OSLogger oSLogger = this.logger;
        oSLogger.debug("messageDynamicTriggerCompleted called with triggerId: " + str);
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        makeRedisplayMessagesAvailableWithTriggers(hashSet);
    }

    public void messageTriggerConditionChanged() {
        this.logger.debug("messageTriggerConditionChanged called");
        evaluateInAppMessages();
    }

    public void systemConditionChanged() {
        attemptToShowInAppMessage();
    }

    private void makeRedisplayMessagesAvailableWithTriggers(Collection<String> collection) {
        Iterator<OSInAppMessageInternal> it = this.messages.iterator();
        while (it.hasNext()) {
            OSInAppMessageInternal next = it.next();
            if (!next.isTriggerChanged() && this.redisplayedInAppMessages.contains(next) && this.triggerController.isTriggerOnMessage(next, collection)) {
                OSLogger oSLogger = this.logger;
                oSLogger.debug("Trigger changed for message: " + next.toString());
                next.setTriggerChanged(true);
            }
        }
    }

    /* access modifiers changed from: private */
    public void checkRedisplayMessagesAndEvaluate(Collection<String> collection) {
        makeRedisplayMessagesAvailableWithTriggers(collection);
        evaluateInAppMessages();
    }

    /* access modifiers changed from: package-private */
    public void addTriggers(final Map<String, Object> map) {
        OSLogger oSLogger = this.logger;
        oSLogger.debug("Triggers added: " + map.toString());
        this.triggerController.addTriggers(map);
        if (shouldRunTaskThroughQueue()) {
            this.taskController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OSInAppMessageController.this.logger.debug("Delaying addTriggers due to redisplay data not retrieved yet");
                    OSInAppMessageController.this.checkRedisplayMessagesAndEvaluate(map.keySet());
                }
            });
        } else {
            checkRedisplayMessagesAndEvaluate(map.keySet());
        }
    }

    /* access modifiers changed from: package-private */
    public void removeTriggersForKeys(final Collection<String> collection) {
        OSLogger oSLogger = this.logger;
        oSLogger.debug("Triggers key to remove: " + collection.toString());
        this.triggerController.removeTriggersForKeys(collection);
        if (shouldRunTaskThroughQueue()) {
            this.taskController.addTaskToQueue((Runnable) new Runnable() {
                public void run() {
                    OSInAppMessageController.this.logger.debug("Delaying removeTriggersForKeys due to redisplay data not retrieved yet");
                    OSInAppMessageController.this.checkRedisplayMessagesAndEvaluate(collection);
                }
            });
        } else {
            checkRedisplayMessagesAndEvaluate(collection);
        }
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> getTriggers() {
        return new HashMap(this.triggerController.getTriggers());
    }

    /* access modifiers changed from: package-private */
    public boolean inAppMessagingEnabled() {
        return this.inAppMessagingEnabled;
    }

    /* access modifiers changed from: package-private */
    public void setInAppMessagingEnabled(boolean z) {
        this.inAppMessagingEnabled = z;
        if (z) {
            evaluateInAppMessages();
        }
    }

    /* access modifiers changed from: package-private */
    public Object getTriggerValue(String str) {
        return this.triggerController.getTriggerValue(str);
    }

    public ArrayList<OSInAppMessageInternal> getInAppMessageDisplayQueue() {
        return this.messageDisplayQueue;
    }

    public List<OSInAppMessageInternal> getRedisplayedInAppMessages() {
        return this.redisplayedInAppMessages;
    }
}
