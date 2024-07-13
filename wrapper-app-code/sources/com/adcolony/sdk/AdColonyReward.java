package com.adcolony.sdk;

public class AdColonyReward {

    /* renamed from: a  reason: collision with root package name */
    private int f9857a;

    /* renamed from: b  reason: collision with root package name */
    private String f9858b;

    /* renamed from: c  reason: collision with root package name */
    private String f9859c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9860d;

    AdColonyReward(h0 h0Var) {
        f1 a2 = h0Var.a();
        this.f9857a = c0.d(a2, "reward_amount");
        this.f9858b = c0.h(a2, "reward_name");
        this.f9860d = c0.b(a2, "success");
        this.f9859c = c0.h(a2, "zone_id");
    }

    public int getRewardAmount() {
        return this.f9857a;
    }

    public String getRewardName() {
        return this.f9858b;
    }

    public String getZoneID() {
        return this.f9859c;
    }

    public boolean success() {
        return this.f9860d;
    }
}
