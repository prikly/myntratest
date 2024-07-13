package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.oa  reason: case insensitive filesystem */
public class C0602oa implements C0794wa {

    /* renamed from: a  reason: collision with root package name */
    private final C0290bm f6391a;

    public C0602oa(C0290bm bmVar) {
        this.f6391a = bmVar;
    }

    public long a(Z8 z8) {
        String b2 = ((Xl) this.f6391a).b();
        return z8.a(new Rd("LAST_ACTIVATION_DIAGNOSTICS_SENT_TIME_" + b2, (String) null).a(), Long.MAX_VALUE);
    }

    public void a(Z8 z8, long j) {
        String b2 = ((Xl) this.f6391a).b();
        Z8 z82 = (Z8) z8.b(new Rd("LAST_ACTIVATION_DIAGNOSTICS_SENT_TIME_" + b2, (String) null).a(), j);
    }
}
