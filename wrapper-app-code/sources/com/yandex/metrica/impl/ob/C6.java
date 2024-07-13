package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.c;
import com.yandex.metrica.impl.ob.C0838y6;

public class C6 extends C0838y6 {

    /* renamed from: d  reason: collision with root package name */
    private C0834y2 f3808d;

    public C6(Context context, C0834y2 y2Var, C0838y6.a aVar, c cVar) {
        this(y2Var, aVar, cVar, new A0(context));
    }

    /* access modifiers changed from: package-private */
    public void a(H6 h6) {
        this.f3808d.a().a(h6);
    }

    C6(C0834y2 y2Var, C0838y6.a aVar, c cVar, A0 a0) {
        super(aVar, cVar, a0);
        this.f3808d = y2Var;
    }
}
