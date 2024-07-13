package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

public class Ta extends ECommerceEvent {

    /* renamed from: b  reason: collision with root package name */
    public final int f5014b;

    /* renamed from: c  reason: collision with root package name */
    public final Ua f5015c;

    /* renamed from: d  reason: collision with root package name */
    private final Fa<Ta> f5016d;

    public Ta(int i, Ua ua, Fa<Ta> fa) {
        this.f5014b = i;
        this.f5015c = ua;
        this.f5016d = fa;
    }

    public String getPublicDescription() {
        int i = this.f5014b;
        if (i != 4) {
            return i != 5 ? "unknown cart action info" : "remove cart item info";
        }
        return "add cart item info";
    }

    public List<Na<C0557mf, Vm>> toProto() {
        return (List) this.f5016d.fromModel(this);
    }

    public String toString() {
        return "CartActionInfoEvent{eventType=" + this.f5014b + ", cartItem=" + this.f5015c + ", converter=" + this.f5016d + '}';
    }
}
