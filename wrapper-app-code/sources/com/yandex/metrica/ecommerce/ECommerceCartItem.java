package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.ob.A2;
import java.math.BigDecimal;

public class ECommerceCartItem {

    /* renamed from: a  reason: collision with root package name */
    private final ECommerceProduct f3583a;

    /* renamed from: b  reason: collision with root package name */
    private final BigDecimal f3584b;

    /* renamed from: c  reason: collision with root package name */
    private final ECommercePrice f3585c;

    /* renamed from: d  reason: collision with root package name */
    private ECommerceReferrer f3586d;

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, long j) {
        this(eCommerceProduct, eCommercePrice, A2.a(j));
    }

    public ECommerceProduct getProduct() {
        return this.f3583a;
    }

    public BigDecimal getQuantity() {
        return this.f3584b;
    }

    public ECommerceReferrer getReferrer() {
        return this.f3586d;
    }

    public ECommercePrice getRevenue() {
        return this.f3585c;
    }

    public ECommerceCartItem setReferrer(ECommerceReferrer eCommerceReferrer) {
        this.f3586d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f3583a + ", quantity=" + this.f3584b + ", revenue=" + this.f3585c + ", referrer=" + this.f3586d + '}';
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, double d2) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(A2.a(d2, 0.0d)));
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, BigDecimal bigDecimal) {
        this.f3583a = eCommerceProduct;
        this.f3584b = bigDecimal;
        this.f3585c = eCommercePrice;
    }
}
