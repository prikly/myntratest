package com.yandex.metrica.ecommerce;

import java.util.List;
import java.util.Map;

public class ECommerceProduct {

    /* renamed from: a  reason: collision with root package name */
    private final String f3593a;

    /* renamed from: b  reason: collision with root package name */
    private String f3594b;

    /* renamed from: c  reason: collision with root package name */
    private List<String> f3595c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, String> f3596d;

    /* renamed from: e  reason: collision with root package name */
    private ECommercePrice f3597e;

    /* renamed from: f  reason: collision with root package name */
    private ECommercePrice f3598f;

    /* renamed from: g  reason: collision with root package name */
    private List<String> f3599g;

    public ECommerceProduct(String str) {
        this.f3593a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f3597e;
    }

    public List<String> getCategoriesPath() {
        return this.f3595c;
    }

    public String getName() {
        return this.f3594b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f3598f;
    }

    public Map<String, String> getPayload() {
        return this.f3596d;
    }

    public List<String> getPromocodes() {
        return this.f3599g;
    }

    public String getSku() {
        return this.f3593a;
    }

    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f3597e = eCommercePrice;
        return this;
    }

    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f3595c = list;
        return this;
    }

    public ECommerceProduct setName(String str) {
        this.f3594b = str;
        return this;
    }

    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f3598f = eCommercePrice;
        return this;
    }

    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f3596d = map;
        return this;
    }

    public ECommerceProduct setPromocodes(List<String> list) {
        this.f3599g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f3593a + '\'' + ", name='" + this.f3594b + '\'' + ", categoriesPath=" + this.f3595c + ", payload=" + this.f3596d + ", actualPrice=" + this.f3597e + ", originalPrice=" + this.f3598f + ", promocodes=" + this.f3599g + '}';
    }
}
