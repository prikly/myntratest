package io.bidmachine;

import android.content.Context;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.DeviceInfo;

class DeviceInfoImpl implements DeviceInfo {
    private final DataRestrictions dataRestrictions;

    DeviceInfoImpl(DataRestrictions dataRestrictions2) {
        this.dataRestrictions = dataRestrictions2;
    }

    public String getHttpAgent(Context context) {
        if (this.dataRestrictions.canSendDeviceInfo()) {
            return UserAgentProvider.getUserAgent(context);
        }
        return null;
    }

    public String getIfa(Context context) {
        return AdvertisingPersonalData.getAdvertisingId(context, !this.dataRestrictions.canSendIfa());
    }

    public boolean isLimitAdTrackingEnabled() {
        return AdvertisingPersonalData.isLimitAdTrackingEnabled();
    }
}
