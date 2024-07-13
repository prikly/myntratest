package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.cb  reason: case insensitive filesystem */
public class C0304cb extends ECommerceEvent {

    /* renamed from: b  reason: collision with root package name */
    public final Ya f5611b;

    /* renamed from: c  reason: collision with root package name */
    public final C0279bb f5612c;

    /* renamed from: d  reason: collision with root package name */
    private final Fa<C0304cb> f5613d;

    public C0304cb(Ya ya, C0279bb bbVar, Fa<C0304cb> fa) {
        this.f5611b = ya;
        this.f5612c = bbVar;
        this.f5613d = fa;
    }

    public String getPublicDescription() {
        return "shown product card info";
    }

    public List<Na<C0557mf, Vm>> toProto() {
        return (List) this.f5613d.fromModel(this);
    }

    public String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f5611b + ", screen=" + this.f5612c + ", converter=" + this.f5613d + '}';
    }
}
