package io.bidmachine;

import io.bidmachine.utils.BMError;
import java.util.Map;

public class BidMachineEvents {
    public static void eventStart(TrackingObject trackingObject, TrackEventType trackEventType) {
        eventStart(trackingObject, trackEventType, (TrackEventInfo) null);
    }

    public static void eventStart(TrackingObject trackingObject, TrackEventType trackEventType, TrackEventInfo trackEventInfo) {
        SessionTracker sessionTracker = BidMachineImpl.get().getSessionTracker();
        if (sessionTracker != null) {
            sessionTracker.trackEventStart(trackingObject, trackEventType, trackEventInfo);
        }
    }

    public static void eventFinish(TrackingObject trackingObject, TrackEventType trackEventType, AdsType adsType, BMError bMError) {
        eventFinish(trackingObject, trackEventType, adsType, bMError, (Map<String, Object>) null);
    }

    public static void eventFinish(TrackingObject trackingObject, TrackEventType trackEventType, AdsType adsType, BMError bMError, Map<String, Object> map) {
        SessionTracker sessionTracker = BidMachineImpl.get().getSessionTracker();
        if (sessionTracker != null) {
            sessionTracker.trackEventFinish(trackingObject, trackEventType, adsType, bMError, map);
        }
    }

    public static void clearEvent(TrackingObject trackingObject, TrackEventType trackEventType) {
        SessionTracker sessionTracker = BidMachineImpl.get().getSessionTracker();
        if (sessionTracker != null) {
            sessionTracker.clearTrackingEvent(trackingObject, trackEventType);
        }
    }

    public static void clear(TrackingObject trackingObject) {
        SessionTracker sessionTracker = BidMachineImpl.get().getSessionTracker();
        if (sessionTracker != null) {
            sessionTracker.clearTrackers(trackingObject);
        }
    }
}
