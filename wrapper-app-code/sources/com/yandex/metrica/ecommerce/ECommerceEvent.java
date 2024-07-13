package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.ob.C0557mf;
import com.yandex.metrica.impl.ob.Na;
import com.yandex.metrica.impl.ob.Vm;
import com.yandex.metrica.impl.ob.Za;
import java.util.List;

public abstract class ECommerceEvent implements Za {

    /* renamed from: a  reason: collision with root package name */
    private static ECommerceEventProvider f3587a = new ECommerceEventProvider();

    public static ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return f3587a.addCartItemEvent(eCommerceCartItem);
    }

    public static ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return f3587a.beginCheckoutEvent(eCommerceOrder);
    }

    public static ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return f3587a.purchaseEvent(eCommerceOrder);
    }

    public static ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return f3587a.removeCartItemEvent(eCommerceCartItem);
    }

    public static ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return f3587a.showProductCardEvent(eCommerceProduct, eCommerceScreen);
    }

    public static ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        return f3587a.showProductDetailsEvent(eCommerceProduct, eCommerceReferrer);
    }

    public static ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return f3587a.showScreenEvent(eCommerceScreen);
    }

    public String getPublicDescription() {
        return "E-commerce base event";
    }

    public abstract /* synthetic */ List<Na<C0557mf, Vm>> toProto();
}
