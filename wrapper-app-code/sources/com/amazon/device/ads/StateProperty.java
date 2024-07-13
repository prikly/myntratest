package com.amazon.device.ads;

import com.unity3d.services.core.request.metrics.AdOperationMetric;

/* compiled from: MraidProperty */
class StateProperty extends MraidStringProperty {
    MraidStateType stateType;

    StateProperty(MraidStateType mraidStateType) {
        super(AdOperationMetric.INIT_STATE);
        this.stateType = mraidStateType;
    }

    /* access modifiers changed from: package-private */
    public String getValue() {
        return this.stateType.toString();
    }
}
