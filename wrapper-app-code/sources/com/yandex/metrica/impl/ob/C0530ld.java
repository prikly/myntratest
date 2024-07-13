package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.ExponentialBackoffDataHolder;
import com.yandex.metrica.networktasks.api.ExponentialBackoffPolicy;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;

/* renamed from: com.yandex.metrica.impl.ob.ld  reason: case insensitive filesystem */
public final class C0530ld implements ExponentialBackoffPolicy {

    /* renamed from: a  reason: collision with root package name */
    private final ExponentialBackoffDataHolder f6149a;

    public C0530ld(ExponentialBackoffDataHolder exponentialBackoffDataHolder) {
        this.f6149a = exponentialBackoffDataHolder;
    }

    public boolean canBeExecuted(RetryPolicyConfig retryPolicyConfig) {
        return this.f6149a.wasLastAttemptLongAgoEnough(retryPolicyConfig);
    }

    public void onAllHostsAttemptsFinished(boolean z) {
        if (z) {
            this.f6149a.reset();
        } else {
            this.f6149a.updateLastAttemptInfo();
        }
    }

    public void onHostAttemptFinished(boolean z) {
    }
}
