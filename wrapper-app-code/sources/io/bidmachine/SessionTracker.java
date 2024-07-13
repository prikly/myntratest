package io.bidmachine;

import android.text.TextUtils;
import io.bidmachine.ApiRequest;
import io.bidmachine.core.Logger;
import io.bidmachine.core.NetworkRequest;
import io.bidmachine.utils.BMError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

abstract class SessionTracker {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* access modifiers changed from: package-private */
    public abstract void clearTrackers(TrackingObject trackingObject);

    /* access modifiers changed from: package-private */
    public abstract void clearTrackingEvent(TrackingObject trackingObject, TrackEventType trackEventType);

    /* access modifiers changed from: package-private */
    public abstract int getEventCount(AdsType adsType, TrackEventType trackEventType);

    /* access modifiers changed from: package-private */
    public abstract int getTotalEventCount(TrackEventType trackEventType);

    /* access modifiers changed from: package-private */
    public abstract void trackEventFinish(TrackingObject trackingObject, TrackEventType trackEventType, AdsType adsType, BMError bMError, Map<String, Object> map);

    /* access modifiers changed from: package-private */
    public abstract void trackEventStart(TrackingObject trackingObject, TrackEventType trackEventType, TrackEventInfo trackEventInfo);

    SessionTracker() {
    }

    static void notifyTrack(TrackingObject trackingObject, TrackEventType trackEventType, TrackEventInfo trackEventInfo, BMError bMError, Map<String, Object> map) {
        if (bMError != null) {
            notifyError(collectTrackingUrls(trackingObject, TrackEventType.Error), collectTrackingUrls(trackingObject, TrackEventType.TrackingError), trackEventInfo, trackEventType.getOrtbActionValue(), bMError);
        } else {
            notifyTrack(collectTrackingUrls(trackingObject, trackEventType), collectTrackingUrls(trackingObject, TrackEventType.TrackingError), trackEventInfo, trackEventType, map);
        }
    }

    private static List<String> collectTrackingUrls(TrackingObject trackingObject, TrackEventType trackEventType) {
        List<String> trackingUrls = BidMachineImpl.get().getTrackingUrls(trackEventType);
        ArrayList arrayList = trackingUrls != null ? new ArrayList(trackingUrls) : null;
        List<String> trackingUrls2 = trackingObject.getTrackingUrls(trackEventType);
        if (trackingUrls2 == null) {
            return arrayList;
        }
        if (arrayList == null) {
            return new ArrayList(trackingUrls2);
        }
        arrayList.addAll(trackingUrls2);
        return arrayList;
    }

    private static void notifyTrack(List<String> list, final List<String> list2, final TrackEventInfo trackEventInfo, final TrackEventType trackEventType, Map<String, Object> map) {
        if (list != null) {
            Logger.log(String.format("Dispatching event to server - %s", new Object[]{trackEventType}));
            for (String replaceMacros : list) {
                executeNotify(replaceMacros(replaceMacros, trackEventInfo, trackEventType.getOrtbActionValue(), -1, map), new NetworkRequest.Callback<String, BMError>() {
                    public void onSuccess(String str) {
                    }

                    public void onFail(BMError bMError) {
                        if (bMError == null) {
                            bMError = BMError.internal("Failed to track URL");
                        }
                        SessionTracker.notifyTrackingError(list2, trackEventInfo, trackEventType.getOrtbActionValue(), bMError);
                    }
                });
            }
        }
    }

    private static void notifyError(List<String> list, final List<String> list2, final TrackEventInfo trackEventInfo, int i, BMError bMError) {
        if (list != null && bMError.getCode() != -1 && bMError.isTrackError()) {
            Logger.log(String.format("Dispatching error event to server - (%s-%s) - %s", new Object[]{Integer.valueOf(i), Integer.valueOf(bMError.getCode()), bMError.getMessage()}));
            for (String replaceMacros : list) {
                executeNotify(replaceMacros(replaceMacros, trackEventInfo, i, bMError.getCode(), (Map<String, Object>) null), new NetworkRequest.Callback<String, BMError>() {
                    public void onSuccess(String str) {
                    }

                    public void onFail(BMError bMError) {
                        if (bMError == null) {
                            bMError = BMError.internal("Failed to track URL");
                        }
                        SessionTracker.notifyTrackingError(list2, trackEventInfo, TrackEventType.Error.getOrtbActionValue(), bMError);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    public static void notifyTrackingError(List<String> list, TrackEventInfo trackEventInfo, int i, BMError bMError) {
        if (list != null && bMError.getCode() != -1 && bMError.isTrackError()) {
            Logger.log(String.format("Dispatching tracking fail to server - %s", new Object[]{bMError}));
            for (String replaceMacros : list) {
                executeNotify(replaceMacros(replaceMacros, trackEventInfo, i, bMError.getCode(), (Map<String, Object>) null), (NetworkRequest.Callback<String, BMError>) null);
            }
        }
    }

    static String replaceMacros(String str, TrackEventInfo trackEventInfo, int i, int i2, Map<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String replaceMacros = replaceMacros(replaceMacros(replaceMacros(replaceMacros(str, Constants.URL_MACROS_BM_EVENT_CODE, Integer.valueOf(i)), Constants.URL_MACROS_BM_ACTION_CODE, Integer.valueOf(i)), Constants.URL_MACROS_BM_ERROR_REASON, Integer.valueOf(i2)), map);
        return trackEventInfo != null ? replaceMacros(replaceMacros(replaceMacros(replaceMacros, Constants.URL_MACROS_BM_ACTION_START, Long.valueOf(trackEventInfo.startTimeMs)), Constants.URL_MACROS_BM_ACTION_FINISH, Long.valueOf(trackEventInfo.finishTimeMs)), trackEventInfo.getEventParameters()) : replaceMacros;
    }

    private static String replaceMacros(String str, Map<String, Object> map) {
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                String str2 = (String) next.getKey();
                Object value = next.getValue();
                if (!TextUtils.isEmpty(str2) && value != null) {
                    str = replaceMacros(str, str2, value);
                }
            }
        }
        return str;
    }

    private static String replaceMacros(String str, String str2, Object obj) {
        String replace = str.replace("${" + str2 + "}", String.valueOf(obj));
        return replace.replace("%24%7B" + str2 + "%7D", String.valueOf(obj));
    }

    private static void executeNotify(String str, NetworkRequest.Callback<String, BMError> callback) {
        if (!TextUtils.isEmpty(str)) {
            new ApiRequest.Builder().url(str).setMethod(NetworkRequest.Method.Get).setDataBinder(new ApiRequest.ApiTrackerDataBinder()).setCallback(callback).request();
        }
    }
}
