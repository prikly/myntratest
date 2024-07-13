package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.ob.A2;
import java.math.BigDecimal;

public class ECommerceAmount {

    /* renamed from: a  reason: collision with root package name */
    private final BigDecimal f3581a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3582b;

    public ECommerceAmount(long j, String str) {
        this(A2.a(j), str);
    }

    public BigDecimal getAmount() {
        return this.f3581a;
    }

    public String getUnit() {
        return this.f3582b;
    }

    public String toString() {
        return "ECommerceAmount{amount=" + this.f3581a + ", unit='" + this.f3582b + '\'' + '}';
    }

    public ECommerceAmount(double d2, String str) {
        this(new BigDecimal(A2.a(d2, 0.0d)), str);
    }

    public ECommerceAmount(BigDecimal bigDecimal, String str) {
        this.f3581a = bigDecimal;
        this.f3582b = str;
    }
}
