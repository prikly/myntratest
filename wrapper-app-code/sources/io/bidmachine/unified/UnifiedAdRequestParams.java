package io.bidmachine.unified;

import io.bidmachine.AdRequestParameters;
import io.bidmachine.GeneralParams;
import io.bidmachine.models.DeviceInfo;

public interface UnifiedAdRequestParams extends GeneralParams {
    AdRequestParameters getAdRequestParameters();

    DeviceInfo getDeviceInfo();
}
