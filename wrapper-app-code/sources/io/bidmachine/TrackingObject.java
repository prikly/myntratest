package io.bidmachine;

import java.util.List;

public abstract class TrackingObject {
    public abstract Object getTrackingKey();

    /* access modifiers changed from: package-private */
    public List<String> getTrackingUrls(TrackEventType trackEventType) {
        return null;
    }
}
