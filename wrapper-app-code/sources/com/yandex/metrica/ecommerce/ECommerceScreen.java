package com.yandex.metrica.ecommerce;

import java.util.List;
import java.util.Map;

public class ECommerceScreen {

    /* renamed from: a  reason: collision with root package name */
    private String f3603a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f3604b;

    /* renamed from: c  reason: collision with root package name */
    private String f3605c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, String> f3606d;

    public List<String> getCategoriesPath() {
        return this.f3604b;
    }

    public String getName() {
        return this.f3603a;
    }

    public Map<String, String> getPayload() {
        return this.f3606d;
    }

    public String getSearchQuery() {
        return this.f3605c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f3604b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f3603a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f3606d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f3605c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f3603a + '\'' + ", categoriesPath=" + this.f3604b + ", searchQuery='" + this.f3605c + '\'' + ", payload=" + this.f3606d + '}';
    }
}
