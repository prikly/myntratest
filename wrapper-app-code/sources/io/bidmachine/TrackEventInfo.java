package io.bidmachine;

import java.util.HashMap;
import java.util.Map;

public class TrackEventInfo {
    private HashMap<String, Object> eventParameters;
    long finishTimeMs;
    final long startTimeMs = System.currentTimeMillis();

    public TrackEventInfo withParameter(String str, Object obj) {
        if (this.eventParameters == null) {
            this.eventParameters = new HashMap<>();
        }
        this.eventParameters.put(str, obj);
        return this;
    }

    public Map<String, Object> getEventParameters() {
        return this.eventParameters;
    }
}
