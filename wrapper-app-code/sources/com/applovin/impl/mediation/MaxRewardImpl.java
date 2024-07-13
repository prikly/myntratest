package com.applovin.impl.mediation;

import com.applovin.mediation.MaxReward;

public class MaxRewardImpl implements MaxReward {

    /* renamed from: a  reason: collision with root package name */
    private final String f14380a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14381b;

    private MaxRewardImpl(int i, String str) {
        if (i >= 0) {
            this.f14380a = str;
            this.f14381b = i;
            return;
        }
        throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
    }

    public static MaxReward create(int i, String str) {
        return new MaxRewardImpl(i, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    public final int getAmount() {
        return this.f14381b;
    }

    public final String getLabel() {
        return this.f14380a;
    }

    public String toString() {
        return "MaxReward{amount=" + this.f14381b + ", label=" + this.f14380a + "}";
    }
}
