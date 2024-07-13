package com.yandex.metrica.ecommerce;

import java.util.List;
import java.util.Map;

public class ECommerceOrder {

    /* renamed from: a  reason: collision with root package name */
    private final String f3588a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ECommerceCartItem> f3589b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, String> f3590c;

    public ECommerceOrder(String str, List<ECommerceCartItem> list) {
        this.f3588a = str;
        this.f3589b = list;
    }

    public List<ECommerceCartItem> getCartItems() {
        return this.f3589b;
    }

    public String getIdentifier() {
        return this.f3588a;
    }

    public Map<String, String> getPayload() {
        return this.f3590c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.f3590c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f3588a + '\'' + ", cartItems=" + this.f3589b + ", payload=" + this.f3590c + '}';
    }
}
