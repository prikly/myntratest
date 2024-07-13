package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.f;

/* compiled from: DBAdapter */
public class e extends f {

    /* renamed from: a  reason: collision with root package name */
    private static volatile e f1031a;

    private e(Context context) {
        super(context);
    }

    public static e a(Context context) {
        Class<e> cls = e.class;
        if (f1031a == null) {
            synchronized (cls) {
                if (f1031a == null) {
                    f1031a = new e(context);
                }
            }
        }
        return f1031a;
    }

    public /* bridge */ /* synthetic */ f.c a() {
        return super.a();
    }
}
