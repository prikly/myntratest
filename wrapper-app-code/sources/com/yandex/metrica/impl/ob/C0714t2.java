package com.yandex.metrica.impl.ob;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.t2  reason: case insensitive filesystem */
public final class C0714t2 extends V1<String[]> {
    public C0714t2(Context context, String str) {
        super(context, str, "array");
    }

    public Object a(int i) {
        Context context = this.f5202a;
        Intrinsics.checkNotNullExpressionValue(context, "mContext");
        return context.getResources().getStringArray(i);
    }
}
