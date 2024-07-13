package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.bb  reason: case insensitive filesystem */
public class C0279bb {

    /* renamed from: a  reason: collision with root package name */
    public final String f5527a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f5528b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5529c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, String> f5530d;

    public C0279bb(ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), A2.a(eCommerceScreen.getCategoriesPath()), eCommerceScreen.getSearchQuery(), A2.c(eCommerceScreen.getPayload()));
    }

    public String toString() {
        return "ScreenWrapper{name='" + this.f5527a + '\'' + ", categoriesPath=" + this.f5528b + ", searchQuery='" + this.f5529c + '\'' + ", payload=" + this.f5530d + '}';
    }

    public C0279bb(String str, List<String> list, String str2, Map<String, String> map) {
        this.f5527a = str;
        this.f5528b = list;
        this.f5529c = str2;
        this.f5530d = map;
    }
}
