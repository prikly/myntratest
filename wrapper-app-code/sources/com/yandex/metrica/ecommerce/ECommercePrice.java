package com.yandex.metrica.ecommerce;

import java.util.List;

public class ECommercePrice {

    /* renamed from: a  reason: collision with root package name */
    private final ECommerceAmount f3591a;

    /* renamed from: b  reason: collision with root package name */
    private List<ECommerceAmount> f3592b;

    public ECommercePrice(ECommerceAmount eCommerceAmount) {
        this.f3591a = eCommerceAmount;
    }

    public ECommerceAmount getFiat() {
        return this.f3591a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.f3592b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.f3592b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f3591a + ", internalComponents=" + this.f3592b + '}';
    }
}
