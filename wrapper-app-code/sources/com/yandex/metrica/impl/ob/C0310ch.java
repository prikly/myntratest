package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer;

/* renamed from: com.yandex.metrica.impl.ob.ch  reason: case insensitive filesystem */
class C0310ch implements CacheControlHttpsConnectionPerformer.Client {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0360eh f5635a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C0260ah f5636b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C0285bh f5637c;

    C0310ch(C0285bh bhVar, C0360eh ehVar, C0260ah ahVar) {
        this.f5637c = bhVar;
        this.f5635a = ehVar;
        this.f5636b = ahVar;
    }

    public String getOldETag() {
        return this.f5635a.f5754b;
    }

    public void onError() {
        this.f5636b.a();
    }

    public void onNotModified() {
        C0260ah ahVar = this.f5636b;
        C0360eh ehVar = this.f5635a;
        ahVar.a(new C0360eh(ehVar.f5753a, ehVar.f5754b, this.f5637c.f5544f.currentTimeMillis(), true, false));
    }

    public void onResponse(String str, byte[] bArr) {
        this.f5636b.a(new C0360eh(this.f5637c.f5541c.a(this.f5637c.f5542d.a(bArr, "af9202nao18gswqp")), str, this.f5637c.f5544f.currentTimeMillis(), true, false));
    }
}
