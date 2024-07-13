package com.appodeal.ads.unified;

import org.json.JSONObject;

public interface UnifiedAdCallbackClickTrackListener {
    void onTrackError();

    void onTrackSuccess(JSONObject jSONObject);
}
