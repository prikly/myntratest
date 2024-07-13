package com.appsgeyser.sdk.deviceidparser;

public class DeviceIdParameters implements Cloneable {
    private String aId = null;
    private String advId = null;
    private LimitAdTrackingEnabledStates limitAdTrackingEnabledStates = null;

    DeviceIdParameters() {
    }

    public boolean isEmpty() {
        return this.aId == null && this.advId == null && this.limitAdTrackingEnabledStates == null;
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        this.advId = null;
        this.aId = null;
        this.limitAdTrackingEnabledStates = null;
    }

    public String getAdvId() {
        return this.advId;
    }

    /* access modifiers changed from: package-private */
    public void setAdvId(String str) {
        this.advId = str;
    }

    public String getaId() {
        return this.aId;
    }

    /* access modifiers changed from: package-private */
    public void setaId(String str) {
        this.aId = str;
    }

    public LimitAdTrackingEnabledStates getLimitAdTrackingEnabled() {
        return this.limitAdTrackingEnabledStates;
    }

    /* access modifiers changed from: package-private */
    public void setLimitAdTrackingEnabled(LimitAdTrackingEnabledStates limitAdTrackingEnabledStates2) {
        this.limitAdTrackingEnabledStates = limitAdTrackingEnabledStates2;
    }

    /* access modifiers changed from: protected */
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
