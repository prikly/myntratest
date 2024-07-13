package com.ironsource.mediationsdk.model;

public class Placement {

    /* renamed from: a  reason: collision with root package name */
    private int f8719a;

    /* renamed from: b  reason: collision with root package name */
    private String f8720b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8721c;

    /* renamed from: d  reason: collision with root package name */
    private String f8722d;

    /* renamed from: e  reason: collision with root package name */
    private int f8723e;

    /* renamed from: f  reason: collision with root package name */
    private k f8724f;

    public Placement(int i, String str, boolean z, String str2, int i2, k kVar) {
        this.f8719a = i;
        this.f8720b = str;
        this.f8721c = z;
        this.f8722d = str2;
        this.f8723e = i2;
        this.f8724f = kVar;
    }

    public Placement(InterstitialPlacement interstitialPlacement) {
        this.f8719a = interstitialPlacement.getPlacementId();
        this.f8720b = interstitialPlacement.getPlacementName();
        this.f8721c = interstitialPlacement.isDefault();
        this.f8724f = interstitialPlacement.getPlacementAvailabilitySettings();
    }

    public k getPlacementAvailabilitySettings() {
        return this.f8724f;
    }

    public int getPlacementId() {
        return this.f8719a;
    }

    public String getPlacementName() {
        return this.f8720b;
    }

    public int getRewardAmount() {
        return this.f8723e;
    }

    public String getRewardName() {
        return this.f8722d;
    }

    public boolean isDefault() {
        return this.f8721c;
    }

    public String toString() {
        return "placement name: " + this.f8720b + ", reward name: " + this.f8722d + " , amount: " + this.f8723e;
    }
}
