package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.ob.Ba;
import com.yandex.metrica.impl.ob.C0254ab;
import com.yandex.metrica.impl.ob.C0279bb;
import com.yandex.metrica.impl.ob.C0304cb;
import com.yandex.metrica.impl.ob.C0329db;
import com.yandex.metrica.impl.ob.C0354eb;
import com.yandex.metrica.impl.ob.Ga;
import com.yandex.metrica.impl.ob.Pa;
import com.yandex.metrica.impl.ob.Qa;
import com.yandex.metrica.impl.ob.Ra;
import com.yandex.metrica.impl.ob.Ta;
import com.yandex.metrica.impl.ob.Ua;
import com.yandex.metrica.impl.ob.Va;
import com.yandex.metrica.impl.ob.Wa;
import com.yandex.metrica.impl.ob.Ya;

public class ECommerceEventProvider {
    public ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new Ta(4, new Ua(eCommerceCartItem), new Ba());
    }

    public ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return new Va(6, new Wa(eCommerceOrder), new Ga());
    }

    public ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return new Va(7, new Wa(eCommerceOrder), new Ga());
    }

    public ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new Ta(5, new Ua(eCommerceCartItem), new Ba());
    }

    public ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return new C0304cb(new Ya(eCommerceProduct), new C0279bb(eCommerceScreen), new Pa());
    }

    public ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        C0254ab abVar;
        Ya ya = new Ya(eCommerceProduct);
        if (eCommerceReferrer == null) {
            abVar = null;
        } else {
            abVar = new C0254ab(eCommerceReferrer);
        }
        return new C0329db(ya, abVar, new Qa());
    }

    public ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return new C0354eb(new C0279bb(eCommerceScreen), new Ra());
    }
}
