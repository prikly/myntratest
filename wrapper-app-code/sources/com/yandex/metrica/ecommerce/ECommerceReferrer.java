package com.yandex.metrica.ecommerce;

public class ECommerceReferrer {

    /* renamed from: a  reason: collision with root package name */
    private String f3600a;

    /* renamed from: b  reason: collision with root package name */
    private String f3601b;

    /* renamed from: c  reason: collision with root package name */
    private ECommerceScreen f3602c;

    public String getIdentifier() {
        return this.f3601b;
    }

    public ECommerceScreen getScreen() {
        return this.f3602c;
    }

    public String getType() {
        return this.f3600a;
    }

    public ECommerceReferrer setIdentifier(String str) {
        this.f3601b = str;
        return this;
    }

    public ECommerceReferrer setScreen(ECommerceScreen eCommerceScreen) {
        this.f3602c = eCommerceScreen;
        return this;
    }

    public ECommerceReferrer setType(String str) {
        this.f3600a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f3600a + '\'' + ", identifier='" + this.f3601b + '\'' + ", screen=" + this.f3602c + '}';
    }
}
