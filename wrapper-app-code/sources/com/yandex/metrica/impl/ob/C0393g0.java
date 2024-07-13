package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.g0  reason: case insensitive filesystem */
class C0393g0 implements C0263ak {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0443i0 f5834a;

    C0393g0(C0443i0 i0Var) {
        this.f5834a = i0Var;
    }

    public void a(Zj zj) {
        C0755uj b2 = zj.b();
        if (b2 != null) {
            this.f5834a.f5960g.put("cellular_connection_type", b2.m());
        }
        this.f5834a.f5960g.put("call_state", Integer.valueOf(zj.a()));
    }
}
