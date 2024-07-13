package com.ironsource.mediationsdk.adunit.c.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public C0085a f8494a;

    /* renamed from: b  reason: collision with root package name */
    public long f8495b;

    /* renamed from: c  reason: collision with root package name */
    public long f8496c;

    /* renamed from: com.ironsource.mediationsdk.adunit.c.b.a$a  reason: collision with other inner class name */
    public enum C0085a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public a(C0085a aVar, long j, long j2) {
        this.f8494a = aVar;
        this.f8495b = j;
        this.f8496c = j2;
    }

    public final boolean a() {
        return this.f8494a == C0085a.MANUAL || this.f8494a == C0085a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }

    public final boolean b() {
        return this.f8494a == C0085a.AUTOMATIC_LOAD_AFTER_CLOSE || this.f8494a == C0085a.AUTOMATIC_LOAD_WHILE_SHOW;
    }
}
