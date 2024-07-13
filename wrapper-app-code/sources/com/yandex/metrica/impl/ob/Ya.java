package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

public class Ya {

    /* renamed from: a  reason: collision with root package name */
    public final String f5372a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5373b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f5374c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, String> f5375d;

    /* renamed from: e  reason: collision with root package name */
    public final Xa f5376e;

    /* renamed from: f  reason: collision with root package name */
    public final Xa f5377f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f5378g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Ya(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), A2.a(eCommerceProduct.getCategoriesPath()), A2.c(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new Xa(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new Xa(eCommerceProduct.getOriginalPrice()), A2.a(eCommerceProduct.getPromocodes()));
    }

    public String toString() {
        return "ProductWrapper{sku='" + this.f5372a + '\'' + ", name='" + this.f5373b + '\'' + ", categoriesPath=" + this.f5374c + ", payload=" + this.f5375d + ", actualPrice=" + this.f5376e + ", originalPrice=" + this.f5377f + ", promocodes=" + this.f5378g + '}';
    }

    public Ya(String str, String str2, List<String> list, Map<String, String> map, Xa xa, Xa xa2, List<String> list2) {
        this.f5372a = str;
        this.f5373b = str2;
        this.f5374c = list;
        this.f5375d = map;
        this.f5376e = xa;
        this.f5377f = xa2;
        this.f5378g = list2;
    }
}
