package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.db  reason: case insensitive filesystem */
public class C0329db extends ECommerceEvent {

    /* renamed from: b  reason: collision with root package name */
    public final Ya f5654b;

    /* renamed from: c  reason: collision with root package name */
    public final C0254ab f5655c;

    /* renamed from: d  reason: collision with root package name */
    private final Fa<C0329db> f5656d;

    public C0329db(Ya ya, C0254ab abVar, Fa<C0329db> fa) {
        this.f5654b = ya;
        this.f5655c = abVar;
        this.f5656d = fa;
    }

    public String getPublicDescription() {
        return "shown product details info";
    }

    public List<Na<C0557mf, Vm>> toProto() {
        return (List) this.f5656d.fromModel(this);
    }

    public String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f5654b + ", referrer=" + this.f5655c + ", converter=" + this.f5656d + '}';
    }
}
