package io.bidmachine.models;

import android.content.Context;

public interface DeviceInfo {
    String getHttpAgent(Context context);

    String getIfa(Context context);

    boolean isLimitAdTrackingEnabled();
}
