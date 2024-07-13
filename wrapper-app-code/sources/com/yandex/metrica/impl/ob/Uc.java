package com.yandex.metrica.impl.ob;

public abstract class Uc<T> implements Lb<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C0810x2 f5095a;

    /* renamed from: b  reason: collision with root package name */
    private final C0405gc f5096b;

    public Uc(C0405gc gcVar, C0810x2 x2Var) {
        this.f5096b = gcVar;
        this.f5095a = x2Var;
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public boolean a(long j) {
        C0810x2 x2Var = this.f5095a;
        long lastAttemptTimeSeconds = this.f5096b.getLastAttemptTimeSeconds();
        return x2Var.b(lastAttemptTimeSeconds, j, "last " + a() + " scan attempt");
    }
}
