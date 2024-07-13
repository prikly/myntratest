package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceCartItem;
import com.yandex.metrica.ecommerce.ECommerceOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Wa {

    /* renamed from: a  reason: collision with root package name */
    public final String f5256a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5257b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Ua> f5258c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, String> f5259d;

    public Wa(ECommerceOrder eCommerceOrder) {
        this(UUID.randomUUID().toString(), eCommerceOrder.getIdentifier(), a(eCommerceOrder.getCartItems()), A2.c(eCommerceOrder.getPayload()));
    }

    private static List<Ua> a(List<ECommerceCartItem> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ECommerceCartItem ua : list) {
            arrayList.add(new Ua(ua));
        }
        return arrayList;
    }

    public String toString() {
        return "OrderWrapper{uuid='" + this.f5256a + '\'' + ", identifier='" + this.f5257b + '\'' + ", cartItems=" + this.f5258c + ", payload=" + this.f5259d + '}';
    }

    public Wa(String str, String str2, List<Ua> list, Map<String, String> map) {
        this.f5256a = str;
        this.f5257b = str2;
        this.f5258c = list;
        this.f5259d = map;
    }
}
