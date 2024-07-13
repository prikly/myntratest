package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

public class Ua {

    /* renamed from: a  reason: collision with root package name */
    public final Ya f5089a;

    /* renamed from: b  reason: collision with root package name */
    public final BigDecimal f5090b;

    /* renamed from: c  reason: collision with root package name */
    public final Xa f5091c;

    /* renamed from: d  reason: collision with root package name */
    public final C0254ab f5092d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Ua(ECommerceCartItem eCommerceCartItem) {
        this(new Ya(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Xa(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C0254ab(eCommerceCartItem.getReferrer()));
    }

    public String toString() {
        return "CartItemWrapper{product=" + this.f5089a + ", quantity=" + this.f5090b + ", revenue=" + this.f5091c + ", referrer=" + this.f5092d + '}';
    }

    public Ua(Ya ya, BigDecimal bigDecimal, Xa xa, C0254ab abVar) {
        this.f5089a = ya;
        this.f5090b = bigDecimal;
        this.f5091c = xa;
        this.f5092d = abVar;
    }
}
