package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0775vf;

public class Ye extends Ne<String> {

    /* renamed from: g  reason: collision with root package name */
    private final C0391fn<String> f5380g;

    public Ye(String str, String str2, C0391fn<String> fnVar, Kn<String> kn, Ke ke) {
        super(0, str, str2, kn, ke);
        this.f5380g = fnVar;
    }

    /* access modifiers changed from: protected */
    public void a(C0775vf.a aVar) {
        String a2 = this.f5380g.a(f());
        aVar.f6994d.f6997a = a2 == null ? new byte[0] : a2.getBytes();
    }
}
