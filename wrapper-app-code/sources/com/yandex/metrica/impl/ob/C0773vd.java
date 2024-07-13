package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.vd  reason: case insensitive filesystem */
public final class C0773vd {
    public static final boolean a(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
        }
    }
}
