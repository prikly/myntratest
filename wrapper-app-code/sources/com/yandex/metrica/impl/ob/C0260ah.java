package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.ob.C0335dh;

/* renamed from: com.yandex.metrica.impl.ob.ah  reason: case insensitive filesystem */
public class C0260ah {

    /* renamed from: a  reason: collision with root package name */
    private ProtobufStateStorage<C0360eh> f5482a;

    /* renamed from: b  reason: collision with root package name */
    private C0360eh f5483b;

    /* renamed from: c  reason: collision with root package name */
    private SystemTimeProvider f5484c;

    /* renamed from: d  reason: collision with root package name */
    private C0410gh f5485d;

    /* renamed from: e  reason: collision with root package name */
    private a f5486e;

    /* renamed from: com.yandex.metrica.impl.ob.ah$a */
    interface a {
    }

    public C0260ah(ProtobufStateStorage<C0360eh> protobufStateStorage, a aVar) {
        this(protobufStateStorage, aVar, new SystemTimeProvider(), new C0410gh(protobufStateStorage));
    }

    public void a(C0360eh ehVar) {
        this.f5482a.save(ehVar);
        this.f5483b = ehVar;
        this.f5485d.a();
        C0335dh.a aVar = (C0335dh.a) this.f5486e;
        C0335dh.this.b();
        boolean unused = C0335dh.this.f5680h = false;
    }

    C0260ah(ProtobufStateStorage<C0360eh> protobufStateStorage, a aVar, SystemTimeProvider systemTimeProvider, C0410gh ghVar) {
        this.f5482a = protobufStateStorage;
        this.f5483b = (C0360eh) protobufStateStorage.read();
        this.f5484c = systemTimeProvider;
        this.f5485d = ghVar;
        this.f5486e = aVar;
    }

    public void a() {
        C0360eh ehVar = this.f5483b;
        C0360eh ehVar2 = new C0360eh(ehVar.f5753a, ehVar.f5754b, this.f5484c.currentTimeMillis(), true, true);
        this.f5482a.save(ehVar2);
        this.f5483b = ehVar2;
        C0335dh.a aVar = (C0335dh.a) this.f5486e;
        C0335dh.this.b();
        boolean unused = C0335dh.this.f5680h = false;
    }
}
