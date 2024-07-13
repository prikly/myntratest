package io.bidmachine;

import io.bidmachine.AdRequestParameters;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.DeviceInfo;
import io.bidmachine.models.TargetingInfo;
import io.bidmachine.unified.UnifiedAdRequestParams;

public class UnifiedAdRequestParamsImpl<AdRequestParametersType extends AdRequestParameters> implements UnifiedAdRequestParams {
    private final AdRequestParametersType adRequestParameters;
    private final DataRestrictions dataRestrictions;
    private final DeviceInfo deviceInfo;
    private final TargetingInfo targetingInfo;

    protected UnifiedAdRequestParamsImpl(AdRequestParametersType adrequestparameterstype, TargetingParams targetingParams, DataRestrictions dataRestrictions2) {
        this.adRequestParameters = adrequestparameterstype;
        this.targetingInfo = new TargetingInfoImpl(dataRestrictions2, targetingParams);
        this.deviceInfo = new DeviceInfoImpl(dataRestrictions2);
        this.dataRestrictions = dataRestrictions2;
    }

    public AdRequestParametersType getAdRequestParameters() {
        return this.adRequestParameters;
    }

    public DataRestrictions getDataRestrictions() {
        return this.dataRestrictions;
    }

    public TargetingInfo getTargetingInfo() {
        return this.targetingInfo;
    }

    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public boolean isTestMode() {
        return BidMachineImpl.get().isTestMode();
    }
}
