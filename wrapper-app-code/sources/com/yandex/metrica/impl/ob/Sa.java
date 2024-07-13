package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

public class Sa {

    /* renamed from: a  reason: collision with root package name */
    public final BigDecimal f4922a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4923b;

    public Sa(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public String toString() {
        return "AmountWrapper{amount=" + this.f4922a + ", unit='" + this.f4923b + '\'' + '}';
    }

    public Sa(BigDecimal bigDecimal, String str) {
        this.f4922a = bigDecimal;
        this.f4923b = str;
    }
}
