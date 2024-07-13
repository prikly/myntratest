package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufStateSerializer;
import com.yandex.metrica.impl.ob.Cf;

/* renamed from: com.yandex.metrica.impl.ob.ea  reason: case insensitive filesystem */
public class C0353ea {

    /* renamed from: a  reason: collision with root package name */
    private C0782vm f5729a;

    C0353ea(C0782vm vmVar) {
        this.f5729a = vmVar;
    }

    public ProtobufStateSerializer<C0799wf> a() {
        return new C0476j9(new C0402g9(), new C0806wm("AES/CBC/PKCS5Padding", this.f5729a.b(), this.f5729a.a()));
    }

    public ProtobufStateSerializer<C0823xf> b() {
        return new C0476j9(new Z2(), new C0806wm("AES/CBC/PKCS5Padding", this.f5729a.b(), this.f5729a.a()));
    }

    public ProtobufStateSerializer<C0847yf> c() {
        return new C0476j9(new C0452i9(), new C0806wm("AES/CBC/PKCS5Padding", this.f5729a.b(), this.f5729a.a()));
    }

    public ProtobufStateSerializer<Bf> d() {
        return new C0476j9(new C0501k9(), new C0806wm("AES/CBC/PKCS5Padding", this.f5729a.b(), this.f5729a.a()));
    }

    public ProtobufStateSerializer<Cf> e() {
        return new C0476j9(new Zd(), new C0806wm("AES/CBC/PKCS5Padding", this.f5729a.b(), this.f5729a.a()));
    }

    @Deprecated
    public ProtobufStateSerializer<Cf.a> f() {
        return new C0476j9(new C0432he(), new C0806wm("AES/CBC/PKCS5Padding", this.f5729a.b(), this.f5729a.a()));
    }

    public ProtobufStateSerializer<Df> g() {
        return new C0476j9(new C0551m9(), new C0806wm("AES/CBC/PKCS5Padding", this.f5729a.b(), this.f5729a.a()));
    }

    public ProtobufStateSerializer<Ff> h() {
        return new C0476j9(new C0601o9(), new C0806wm("AES/CBC/PKCS5Padding", this.f5729a.b(), this.f5729a.a()));
    }

    public ProtobufStateSerializer<If> i() {
        return new C0476j9(new C0626p9(), new C0806wm("AES/CBC/PKCS5Padding", this.f5729a.b(), this.f5729a.a()));
    }
}
