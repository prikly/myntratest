package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

public class Va extends ECommerceEvent {

    /* renamed from: b  reason: collision with root package name */
    public final int f5223b;

    /* renamed from: c  reason: collision with root package name */
    public final Wa f5224c;

    /* renamed from: d  reason: collision with root package name */
    private final Fa<Va> f5225d;

    public Va(int i, Wa wa, Fa<Va> fa) {
        this.f5223b = i;
        this.f5224c = wa;
        this.f5225d = fa;
    }

    public String getPublicDescription() {
        return "order info";
    }

    public List<Na<C0557mf, Vm>> toProto() {
        return (List) this.f5225d.fromModel(this);
    }

    public String toString() {
        return "OrderInfoEvent{eventType=" + this.f5223b + ", order=" + this.f5224c + ", converter=" + this.f5225d + '}';
    }
}
