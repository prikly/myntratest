package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.HostRetryInfoProvider;

/* renamed from: com.yandex.metrica.impl.ob.pd  reason: case insensitive filesystem */
public final class C0630pd implements HostRetryInfoProvider {

    /* renamed from: a  reason: collision with root package name */
    private final C0352e9 f6439a;

    /* renamed from: b  reason: collision with root package name */
    private final C0654qd f6440b;

    public C0630pd(C0352e9 e9Var, C0654qd qdVar) {
        this.f6439a = e9Var;
        this.f6440b = qdVar;
    }

    public long getLastAttemptTimeSeconds() {
        return this.f6439a.a(this.f6440b, 0);
    }

    public int getNextSendAttemptNumber() {
        return this.f6439a.a(this.f6440b, 1);
    }

    public void saveLastAttemptTimeSeconds(long j) {
        this.f6439a.b(this.f6440b, j);
    }

    public void saveNextSendAttemptNumber(int i) {
        this.f6439a.b(this.f6440b, i);
    }
}
