package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.jc  reason: case insensitive filesystem */
public class C0479jc {

    /* renamed from: a  reason: collision with root package name */
    private final T7 f6068a;

    /* renamed from: b  reason: collision with root package name */
    private final Vb f6069b;

    public C0479jc(Context context) {
        this(C0477ja.a(context).e(), new Vb(context));
    }

    public void a(C0529lc lcVar) {
        String a2 = this.f6069b.a(lcVar);
        if (!TextUtils.isEmpty(a2)) {
            this.f6068a.a(lcVar.d(), a2);
        }
    }

    C0479jc(T7 t7, Vb vb) {
        this.f6068a = t7;
        this.f6069b = vb;
    }
}
