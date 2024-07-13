package com.yandex.metrica.impl.ob;

import com.applovin.sdk.AppLovinEventParameters;
import com.yandex.metrica.billing_interface.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.f  reason: case insensitive filesystem */
public final class C0367f implements C0516l {

    /* renamed from: a  reason: collision with root package name */
    private boolean f5771a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, a> f5772b;

    /* renamed from: c  reason: collision with root package name */
    private final C0566n f5773c;

    public C0367f(C0566n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "storage");
        this.f5773c = nVar;
        C0296c3 c3Var = (C0296c3) nVar;
        this.f5771a = c3Var.b();
        List<a> a2 = c3Var.a();
        Intrinsics.checkNotNullExpressionValue(a2, "storage.billingInfo");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : a2) {
            linkedHashMap.put(((a) next).f3545b, next);
        }
        this.f5772b = linkedHashMap;
    }

    public void a(Map<String, ? extends a> map) {
        Intrinsics.checkNotNullParameter(map, "history");
        for (a aVar : map.values()) {
            Map<String, a> map2 = this.f5772b;
            String str = aVar.f3545b;
            Intrinsics.checkNotNullExpressionValue(str, "billingInfo.sku");
            map2.put(str, aVar);
        }
        ((C0296c3) this.f5773c).a(CollectionsKt.toList(this.f5772b.values()), this.f5771a);
    }

    public void b() {
        if (!this.f5771a) {
            this.f5771a = true;
            ((C0296c3) this.f5773c).a(CollectionsKt.toList(this.f5772b.values()), this.f5771a);
        }
    }

    public a a(String str) {
        Intrinsics.checkNotNullParameter(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        return this.f5772b.get(str);
    }

    public boolean a() {
        return this.f5771a;
    }
}
