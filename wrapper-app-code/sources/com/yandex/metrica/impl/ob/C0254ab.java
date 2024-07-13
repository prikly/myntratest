package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceReferrer;

/* renamed from: com.yandex.metrica.impl.ob.ab  reason: case insensitive filesystem */
public class C0254ab {

    /* renamed from: a  reason: collision with root package name */
    public final String f5472a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5473b;

    /* renamed from: c  reason: collision with root package name */
    public final C0279bb f5474c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0254ab(ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C0279bb(eCommerceReferrer.getScreen()));
    }

    public String toString() {
        return "ReferrerWrapper{type='" + this.f5472a + '\'' + ", identifier='" + this.f5473b + '\'' + ", screen=" + this.f5474c + '}';
    }

    public C0254ab(String str, String str2, C0279bb bbVar) {
        this.f5472a = str;
        this.f5473b = str2;
        this.f5474c = bbVar;
    }
}
