package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceAmount;
import com.yandex.metrica.ecommerce.ECommercePrice;
import java.util.LinkedList;
import java.util.List;

public class Xa {

    /* renamed from: a  reason: collision with root package name */
    public final Sa f5330a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Sa> f5331b;

    public Xa(ECommercePrice eCommercePrice) {
        this(new Sa(eCommercePrice.getFiat()), a(eCommercePrice.getInternalComponents()));
    }

    public static List<Sa> a(List<ECommerceAmount> list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (ECommerceAmount next : list) {
            linkedList.add(new Sa(next.getAmount(), next.getUnit()));
        }
        return linkedList;
    }

    public String toString() {
        return "PriceWrapper{fiat=" + this.f5330a + ", internalComponents=" + this.f5331b + '}';
    }

    public Xa(Sa sa, List<Sa> list) {
        this.f5330a = sa;
        this.f5331b = list;
    }
}
