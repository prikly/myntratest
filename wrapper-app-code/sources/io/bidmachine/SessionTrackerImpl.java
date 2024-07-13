package io.bidmachine;

import io.bidmachine.utils.BMError;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

class SessionTrackerImpl extends SessionTracker {
    final Map<Object, EnumMap<TrackEventType, TrackEventInfo>> intervalHolders = new ConcurrentHashMap();
    private final EventsHolder totalHolder = new EventsHolder((EventsHolder) null);
    final Map<AdsType, EventsHolder> trackingMap = new ConcurrentHashMap();

    SessionTrackerImpl() {
    }

    public void trackEventStart(TrackingObject trackingObject, TrackEventType trackEventType, TrackEventInfo trackEventInfo) {
        Object trackingKey;
        if (trackingObject != null && trackEventType != null && (trackingKey = trackingObject.getTrackingKey()) != null) {
            EnumMap enumMap = this.intervalHolders.get(trackingKey);
            if (enumMap == null) {
                enumMap = new EnumMap(TrackEventType.class);
                this.intervalHolders.put(trackingKey, enumMap);
            }
            if (!enumMap.containsKey(trackEventType)) {
                if (trackEventInfo == null) {
                    trackEventInfo = new TrackEventInfo();
                }
                enumMap.put(trackEventType, trackEventInfo);
            }
        }
    }

    public void trackEventFinish(TrackingObject trackingObject, TrackEventType trackEventType, AdsType adsType, BMError bMError, Map<String, Object> map) {
        if (trackingObject != null && trackEventType != null) {
            TrackEventInfo trackEventInfo = null;
            Object trackingKey = trackingObject.getTrackingKey();
            if (trackingKey != null) {
                EnumMap enumMap = this.intervalHolders.get(trackingKey);
                if (enumMap != null && enumMap.containsKey(trackEventType)) {
                    trackEventInfo = (TrackEventInfo) enumMap.get(trackEventType);
                    if (trackEventInfo != null) {
                        trackEventInfo.finishTimeMs = System.currentTimeMillis();
                    }
                    enumMap.remove(trackEventType);
                    if (enumMap.isEmpty()) {
                        clearTrackers(trackingObject);
                    }
                }
                notifyTrack(trackingObject, trackEventType, trackEventInfo, bMError, map);
                if (adsType != null && bMError == null) {
                    obtainHolder(adsType).track(trackEventType);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void clearTrackingEvent(TrackingObject trackingObject, TrackEventType trackEventType) {
        Object trackingKey;
        EnumMap enumMap;
        if (trackingObject != null && trackEventType != null && (trackingKey = trackingObject.getTrackingKey()) != null && (enumMap = this.intervalHolders.get(trackingKey)) != null) {
            enumMap.remove(trackEventType);
        }
    }

    /* access modifiers changed from: package-private */
    public void clearTrackers(TrackingObject trackingObject) {
        if (trackingObject != null) {
            this.intervalHolders.remove(trackingObject.getTrackingKey());
        }
    }

    public int getEventCount(AdsType adsType, TrackEventType trackEventType) {
        return obtainHolder(adsType).getCount(trackEventType);
    }

    public int getTotalEventCount(TrackEventType trackEventType) {
        return this.totalHolder.getCount(trackEventType);
    }

    private EventsHolder obtainHolder(AdsType adsType) {
        if (this.trackingMap.containsKey(adsType)) {
            return this.trackingMap.get(adsType);
        }
        EventsHolder eventsHolder = new EventsHolder(this.totalHolder);
        this.trackingMap.put(adsType, eventsHolder);
        return eventsHolder;
    }

    private static class EventsHolder {
        private final EventsHolder referenceHolder;
        private final EnumMap<TrackEventType, AtomicInteger> trackingMap = new EnumMap<>(TrackEventType.class);

        EventsHolder(EventsHolder eventsHolder) {
            this.referenceHolder = eventsHolder;
        }

        public void track(TrackEventType trackEventType) {
            EventsHolder eventsHolder = this.referenceHolder;
            if (eventsHolder != null) {
                eventsHolder.track(trackEventType);
            }
            AtomicInteger atomicInteger = this.trackingMap.get(trackEventType);
            if (atomicInteger == null) {
                this.trackingMap.put(trackEventType, new AtomicInteger(1));
            } else {
                atomicInteger.incrementAndGet();
            }
        }

        public int getCount(TrackEventType trackEventType) {
            AtomicInteger atomicInteger = this.trackingMap.get(trackEventType);
            if (atomicInteger != null) {
                return atomicInteger.get();
            }
            return 0;
        }
    }
}
