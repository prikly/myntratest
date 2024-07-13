package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.eb  reason: case insensitive filesystem */
public class C0354eb extends ECommerceEvent {

    /* renamed from: b  reason: collision with root package name */
    public final C0279bb f5730b;

    /* renamed from: c  reason: collision with root package name */
    private final Fa<C0354eb> f5731c;

    public C0354eb(C0279bb bbVar, Fa<C0354eb> fa) {
        this.f5730b = bbVar;
        this.f5731c = fa;
    }

    public String getPublicDescription() {
        return "shown screen info";
    }

    public List<Na<C0557mf, Vm>> toProto() {
        return (List) this.f5731c.fromModel(this);
    }

    public String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f5730b + ", converter=" + this.f5731c + '}';
    }
}
