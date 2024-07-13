package com.ironsource.mediationsdk.model;

public class InterstitialPlacement {

    /* renamed from: a  reason: collision with root package name */
    private int f8707a;

    /* renamed from: b  reason: collision with root package name */
    private String f8708b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8709c;

    /* renamed from: d  reason: collision with root package name */
    private k f8710d;

    public InterstitialPlacement(int i, String str, boolean z, k kVar) {
        this.f8707a = i;
        this.f8708b = str;
        this.f8709c = z;
        this.f8710d = kVar;
    }

    public k getPlacementAvailabilitySettings() {
        return this.f8710d;
    }

    public int getPlacementId() {
        return this.f8707a;
    }

    public String getPlacementName() {
        return this.f8708b;
    }

    public boolean isDefault() {
        return this.f8709c;
    }

    public String toString() {
        return "placement name: " + this.f8708b;
    }
}
