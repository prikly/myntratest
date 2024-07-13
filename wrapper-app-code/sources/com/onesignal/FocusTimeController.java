package com.onesignal;

import com.onesignal.OneSignal;
import com.onesignal.OneSignalRestClient;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

class FocusTimeController {
    private OSLogger logger;
    private OSFocusTimeProcessorFactory processorFactory;
    private Long timeFocusedAtMs;

    private enum FocusEventType {
        BACKGROUND,
        END_SESSION
    }

    FocusTimeController(OSFocusTimeProcessorFactory oSFocusTimeProcessorFactory, OSLogger oSLogger) {
        this.processorFactory = oSFocusTimeProcessorFactory;
        this.logger = oSLogger;
    }

    /* access modifiers changed from: package-private */
    public void appForegrounded() {
        this.timeFocusedAtMs = Long.valueOf(OneSignal.getTime().getElapsedRealtime());
        OSLogger oSLogger = this.logger;
        oSLogger.debug("Application foregrounded focus time: " + this.timeFocusedAtMs);
    }

    /* access modifiers changed from: package-private */
    public void appStopped() {
        Long timeFocusedElapsed = getTimeFocusedElapsed();
        OSLogger oSLogger = this.logger;
        oSLogger.debug("Application stopped focus time: " + this.timeFocusedAtMs + " timeElapsed: " + timeFocusedElapsed);
        if (timeFocusedElapsed != null) {
            List<OSInfluence> sessionInfluences = OneSignal.getSessionManager().getSessionInfluences();
            this.processorFactory.getTimeProcessorWithInfluences(sessionInfluences).saveUnsentActiveData(timeFocusedElapsed.longValue(), sessionInfluences);
        }
    }

    /* access modifiers changed from: package-private */
    public void appBackgrounded() {
        OSLogger oSLogger = this.logger;
        oSLogger.debug("Application backgrounded focus time: " + this.timeFocusedAtMs);
        this.processorFactory.getTimeProcessorSaved().sendUnsentTimeNow();
        this.timeFocusedAtMs = null;
    }

    /* access modifiers changed from: package-private */
    public void doBlockingBackgroundSyncOfUnsentTime() {
        if (!OneSignal.isInForeground()) {
            this.processorFactory.getTimeProcessorSaved().syncUnsentTimeFromSyncJob();
        }
    }

    /* access modifiers changed from: package-private */
    public void onSessionEnded(List<OSInfluence> list) {
        FocusEventType focusEventType = FocusEventType.END_SESSION;
        if (!giveProcessorsValidFocusTime(list, focusEventType)) {
            this.processorFactory.getTimeProcessorWithInfluences(list).sendUnsentTimeNow(focusEventType);
        }
    }

    private boolean giveProcessorsValidFocusTime(List<OSInfluence> list, FocusEventType focusEventType) {
        Long timeFocusedElapsed = getTimeFocusedElapsed();
        if (timeFocusedElapsed == null) {
            return false;
        }
        this.processorFactory.getTimeProcessorWithInfluences(list).addTime(timeFocusedElapsed.longValue(), list, focusEventType);
        return true;
    }

    private Long getTimeFocusedElapsed() {
        if (this.timeFocusedAtMs == null) {
            return null;
        }
        long elapsedRealtime = (long) ((((double) (OneSignal.getTime().getElapsedRealtime() - this.timeFocusedAtMs.longValue())) / 1000.0d) + 0.5d);
        if (elapsedRealtime < 1 || elapsedRealtime > 86400) {
            return null;
        }
        return Long.valueOf(elapsedRealtime);
    }

    static class FocusTimeProcessorUnattributed extends FocusTimeProcessorBase {
        /* access modifiers changed from: protected */
        public void saveInfluences(List<OSInfluence> list) {
        }

        FocusTimeProcessorUnattributed() {
            this.MIN_ON_FOCUS_TIME_SEC = 60;
            this.PREF_KEY_FOR_UNSENT_TIME = OneSignalPrefs.PREFS_GT_UNSENT_ACTIVE_TIME;
        }

        /* access modifiers changed from: protected */
        public void sendTime(FocusEventType focusEventType) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.onesignalLog(log_level, getClass().getSimpleName() + " sendTime with: " + focusEventType);
            if (!focusEventType.equals(FocusEventType.END_SESSION)) {
                syncUnsentTimeOnBackgroundEvent();
            }
        }

        /* access modifiers changed from: protected */
        public List<OSInfluence> getInfluences() {
            return new ArrayList();
        }
    }

    static class FocusTimeProcessorAttributed extends FocusTimeProcessorBase {
        FocusTimeProcessorAttributed() {
            this.MIN_ON_FOCUS_TIME_SEC = 1;
            this.PREF_KEY_FOR_UNSENT_TIME = OneSignalPrefs.PREFS_OS_UNSENT_ATTRIBUTED_ACTIVE_TIME;
        }

        /* access modifiers changed from: protected */
        public List<OSInfluence> getInfluences() {
            ArrayList arrayList = new ArrayList();
            for (String oSInfluence : OneSignalPrefs.getStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_ATTRIBUTED_INFLUENCES, new HashSet())) {
                try {
                    arrayList.add(new OSInfluence(oSInfluence));
                } catch (JSONException e2) {
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                    OneSignal.Log(log_level, getClass().getSimpleName() + ": error generation OSInfluence from json object: " + e2);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: protected */
        public void saveInfluences(List<OSInfluence> list) {
            HashSet hashSet = new HashSet();
            for (OSInfluence jSONString : list) {
                try {
                    hashSet.add(jSONString.toJSONString());
                } catch (JSONException e2) {
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.ERROR;
                    OneSignal.Log(log_level, getClass().getSimpleName() + ": error generation json object OSInfluence: " + e2);
                }
            }
            OneSignalPrefs.saveStringSet(OneSignalPrefs.PREFS_ONESIGNAL, OneSignalPrefs.PREFS_OS_ATTRIBUTED_INFLUENCES, hashSet);
        }

        /* access modifiers changed from: protected */
        public void additionalFieldsToAddToOnFocusPayload(JSONObject jSONObject) {
            OneSignal.getSessionManager().addSessionIds(jSONObject, getInfluences());
        }

        /* access modifiers changed from: protected */
        public void sendTime(FocusEventType focusEventType) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.onesignalLog(log_level, getClass().getSimpleName() + " sendTime with: " + focusEventType);
            if (focusEventType.equals(FocusEventType.END_SESSION)) {
                syncOnFocusTime();
            } else {
                OSSyncService.getInstance().scheduleSyncTask(OneSignal.appContext);
            }
        }
    }

    static abstract class FocusTimeProcessorBase {
        protected long MIN_ON_FOCUS_TIME_SEC;
        protected String PREF_KEY_FOR_UNSENT_TIME;
        private final AtomicBoolean runningOnFocusTime = new AtomicBoolean();
        private Long unsentActiveTime = null;

        /* access modifiers changed from: protected */
        public void additionalFieldsToAddToOnFocusPayload(JSONObject jSONObject) {
        }

        /* access modifiers changed from: protected */
        public abstract List<OSInfluence> getInfluences();

        /* access modifiers changed from: protected */
        public abstract void saveInfluences(List<OSInfluence> list);

        /* access modifiers changed from: protected */
        public abstract void sendTime(FocusEventType focusEventType);

        FocusTimeProcessorBase() {
        }

        /* access modifiers changed from: private */
        public void saveUnsentActiveData(long j, List<OSInfluence> list) {
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.Log(log_level, getClass().getSimpleName() + ":saveUnsentActiveData with lastFocusTimeInfluences: " + list.toString());
            saveInfluences(list);
            saveUnsentActiveTime(getUnsentActiveTime() + j);
        }

        /* access modifiers changed from: private */
        public void saveUnsentActiveTime(long j) {
            this.unsentActiveTime = Long.valueOf(j);
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.Log(log_level, getClass().getSimpleName() + ":saveUnsentActiveTime: " + this.unsentActiveTime);
            OneSignalPrefs.saveLong(OneSignalPrefs.PREFS_ONESIGNAL, this.PREF_KEY_FOR_UNSENT_TIME, j);
        }

        private long getUnsentActiveTime() {
            if (this.unsentActiveTime == null) {
                this.unsentActiveTime = Long.valueOf(OneSignalPrefs.getLong(OneSignalPrefs.PREFS_ONESIGNAL, this.PREF_KEY_FOR_UNSENT_TIME, 0));
            }
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.Log(log_level, getClass().getSimpleName() + ":getUnsentActiveTime: " + this.unsentActiveTime);
            return this.unsentActiveTime.longValue();
        }

        /* access modifiers changed from: private */
        public void addTime(long j, List<OSInfluence> list, FocusEventType focusEventType) {
            saveUnsentActiveData(j, list);
            sendUnsentTimeNow(focusEventType);
        }

        /* access modifiers changed from: private */
        public void sendUnsentTimeNow() {
            List<OSInfluence> influences = getInfluences();
            long unsentActiveTime2 = getUnsentActiveTime();
            OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
            OneSignal.Log(log_level, getClass().getSimpleName() + ":sendUnsentTimeNow with time: " + unsentActiveTime2 + " and influences: " + influences.toString());
            sendUnsentTimeNow(FocusEventType.BACKGROUND);
        }

        /* access modifiers changed from: private */
        public void sendUnsentTimeNow(FocusEventType focusEventType) {
            if (!OneSignal.hasUserId()) {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.WARN;
                OneSignal.Log(log_level, getClass().getSimpleName() + ":sendUnsentTimeNow not possible due to user id null");
                return;
            }
            sendTime(focusEventType);
        }

        private boolean hasMinSyncTime() {
            return getUnsentActiveTime() >= this.MIN_ON_FOCUS_TIME_SEC;
        }

        /* access modifiers changed from: protected */
        public void syncUnsentTimeOnBackgroundEvent() {
            if (hasMinSyncTime()) {
                OSSyncService.getInstance().scheduleSyncTask(OneSignal.appContext);
            }
        }

        /* access modifiers changed from: private */
        public void syncUnsentTimeFromSyncJob() {
            if (hasMinSyncTime()) {
                syncOnFocusTime();
            }
        }

        /* access modifiers changed from: protected */
        public void syncOnFocusTime() {
            if (!this.runningOnFocusTime.get()) {
                synchronized (this.runningOnFocusTime) {
                    this.runningOnFocusTime.set(true);
                    if (hasMinSyncTime()) {
                        sendOnFocus(getUnsentActiveTime());
                    }
                    this.runningOnFocusTime.set(false);
                }
            }
        }

        private void sendOnFocusToPlayer(String str, JSONObject jSONObject) {
            AnonymousClass1 r0 = new OneSignalRestClient.ResponseHandler() {
                /* access modifiers changed from: package-private */
                public void onFailure(int i, String str, Throwable th) {
                    OneSignal.logHttpError("sending on_focus Failed", i, th, str);
                }

                /* access modifiers changed from: package-private */
                public void onSuccess(String str) {
                    FocusTimeProcessorBase.this.saveUnsentActiveTime(0);
                }
            };
            OneSignalRestClient.postSync("players/" + str + "/on_focus", jSONObject, r0);
        }

        private JSONObject generateOnFocusPayload(long j) throws JSONException {
            JSONObject put = new JSONObject().put(OSOutcomeConstants.APP_ID, OneSignal.getSavedAppId()).put("type", 1).put(AdOperationMetric.INIT_STATE, "ping").put("active_time", j).put(OSOutcomeConstants.DEVICE_TYPE, new OSUtils().getDeviceType());
            OneSignal.addNetType(put);
            return put;
        }

        private void sendOnFocus(long j) {
            try {
                OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.DEBUG;
                OneSignal.Log(log_level, getClass().getSimpleName() + ":sendOnFocus with totalTimeActive: " + j);
                JSONObject generateOnFocusPayload = generateOnFocusPayload(j);
                additionalFieldsToAddToOnFocusPayload(generateOnFocusPayload);
                sendOnFocusToPlayer(OneSignal.getUserId(), generateOnFocusPayload);
                if (OneSignal.hasEmailId()) {
                    sendOnFocusToPlayer(OneSignal.getEmailId(), generateOnFocusPayload(j));
                }
                if (OneSignal.hasSMSlId()) {
                    sendOnFocusToPlayer(OneSignal.getSMSId(), generateOnFocusPayload(j));
                }
                saveInfluences(new ArrayList());
            } catch (JSONException e2) {
                OneSignal.Log(OneSignal.LOG_LEVEL.ERROR, "Generating on_focus:JSON Failed.", e2);
            }
        }
    }
}
