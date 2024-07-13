package io.bidmachine;

import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.TargetingInfo;

class InitializationParamsImpl implements InitializationParams {
    private final DataRestrictions dataRestrictions;
    private final TargetingInfo targetingInfo;

    InitializationParamsImpl(TargetingParams targetingParams, DataRestrictions dataRestrictions2) {
        this.targetingInfo = new TargetingInfoImpl(dataRestrictions2, targetingParams);
        this.dataRestrictions = dataRestrictions2;
    }

    public TargetingInfo getTargetingInfo() {
        return this.targetingInfo;
    }

    public DataRestrictions getDataRestrictions() {
        return this.dataRestrictions;
    }

    public boolean isTestMode() {
        return BidMachineImpl.get().isTestMode();
    }
}
