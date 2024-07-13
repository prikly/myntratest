package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.text.StringsKt;

public final class Jg {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f4364a;

    /* renamed from: b  reason: collision with root package name */
    private final C0714t2 f4365b;

    public Jg(C0714t2 t2Var) {
        this.f4365b = t2Var;
        this.f4364a = a(new String[]{"https://startup.mobile.yandex.net/", "", "", ""});
    }

    public final Collection<String> a() {
        String[] strArr = (String[]) this.f4365b.a();
        if (strArr != null) {
            List<String> a2 = a(strArr);
            if (!(!a2.isEmpty())) {
                a2 = null;
            }
            if (a2 != null) {
                return a2;
            }
        }
        return this.f4364a;
    }

    private final List<String> a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !(!StringsKt.isBlank(str))) {
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Jg() {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.t2 r0 = new com.yandex.metrica.impl.ob.t2
            com.yandex.metrica.impl.ob.F0 r1 = com.yandex.metrica.impl.ob.F0.g()
            java.lang.String r2 = "GlobalServiceLocator.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            android.content.Context r1 = r1.e()
            java.lang.String r2 = "GlobalServiceLocator.getInstance().context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r2 = "appmetrica_startup_hosts"
            r0.<init>(r1, r2)
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Jg.<init>():void");
    }
}
