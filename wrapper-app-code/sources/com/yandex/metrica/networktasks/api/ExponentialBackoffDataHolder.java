package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.impl.g;
import com.yandex.metrica.networktasks.impl.h;

public class ExponentialBackoffDataHolder {

    /* renamed from: a  reason: collision with root package name */
    private final g f7294a;

    /* renamed from: b  reason: collision with root package name */
    private final h f7295b;

    /* renamed from: c  reason: collision with root package name */
    private final HostRetryInfoProvider f7296c;

    /* renamed from: d  reason: collision with root package name */
    private long f7297d;

    /* renamed from: e  reason: collision with root package name */
    private int f7298e;

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider) {
        this(hostRetryInfoProvider, new h(), new g());
    }

    ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, h hVar, g gVar) {
        this.f7296c = hostRetryInfoProvider;
        this.f7295b = hVar;
        this.f7294a = gVar;
        this.f7297d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f7298e = hostRetryInfoProvider.getNextSendAttemptNumber();
    }

    public void reset() {
        this.f7298e = 1;
        this.f7297d = 0;
        this.f7296c.saveNextSendAttemptNumber(1);
        this.f7296c.saveLastAttemptTimeSeconds(this.f7297d);
    }

    public void updateLastAttemptInfo() {
        this.f7295b.getClass();
        long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        this.f7297d = currentTimeMillis;
        this.f7298e++;
        this.f7296c.saveLastAttemptTimeSeconds(currentTimeMillis);
        this.f7296c.saveNextSendAttemptNumber(this.f7298e);
    }

    public boolean wasLastAttemptLongAgoEnough(RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j = this.f7297d;
            if (j != 0) {
                g gVar = this.f7294a;
                int i = retryPolicyConfig.exponentialMultiplier * ((1 << (this.f7298e - 1)) - 1);
                int i2 = retryPolicyConfig.maxIntervalSeconds;
                if (i > i2) {
                    i = i2;
                }
                return gVar.a(j, (long) i, "last send attempt");
            }
        }
        return true;
    }
}
