package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.e8  reason: case insensitive filesystem */
public final class C0351e8 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, C0276b8> f5717a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final B0 f5718b;

    /* renamed from: c  reason: collision with root package name */
    private final Q7 f5719c;

    /* renamed from: d  reason: collision with root package name */
    private final C0251a8 f5720d;

    /* renamed from: e  reason: collision with root package name */
    private final C0251a8 f5721e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f5722f;

    public C0351e8(Context context) {
        this.f5722f = context;
        B0 b0 = new B0();
        this.f5718b = b0;
        Q7 q7 = new Q7(context, "appmetrica_vital.dat", b0);
        this.f5719c = q7;
        F0 g2 = F0.g();
        Intrinsics.checkNotNullExpressionValue(g2, "GlobalServiceLocator.getInstance()");
        C0352e9 s = g2.s();
        Intrinsics.checkNotNullExpressionValue(s, "GlobalServiceLocator.get…ance().servicePreferences");
        this.f5720d = new C0251a8(s, q7);
        C0477ja a2 = C0477ja.a(context);
        Intrinsics.checkNotNullExpressionValue(a2, "DatabaseStorageFactory.getInstance(context)");
        this.f5721e = new C0251a8(new C0352e9(a2.j()), q7);
    }

    public final C0251a8 a() {
        return this.f5720d;
    }

    public final C0251a8 b() {
        return this.f5721e;
    }

    public final synchronized C0276b8 a(I3 i3) {
        C0276b8 b8Var;
        String valueOf = String.valueOf(i3.a());
        Map<String, C0276b8> map = this.f5717a;
        b8Var = map.get(valueOf);
        if (b8Var == null) {
            C0302c9 c9Var = new C0302c9(C0477ja.a(this.f5722f).b(i3));
            Context context = this.f5722f;
            String a2 = i3.a();
            b8Var = new C0276b8(c9Var, new Q7(context, "appmetrica_vital_" + a2 + ".dat", this.f5718b), valueOf);
            map.put(valueOf, b8Var);
        }
        return b8Var;
    }
}
