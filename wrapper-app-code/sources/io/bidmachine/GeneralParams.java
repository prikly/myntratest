package io.bidmachine;

import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.TargetingInfo;

public interface GeneralParams {
    DataRestrictions getDataRestrictions();

    TargetingInfo getTargetingInfo();

    boolean isTestMode();
}
