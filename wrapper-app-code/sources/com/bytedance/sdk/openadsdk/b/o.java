package com.bytedance.sdk.openadsdk.b;

import com.bytedance.sdk.component.utils.h;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.utils.p;

/* compiled from: LastShowAdManager */
public class o {
    public static void a(final n nVar, final String str) {
        if (nVar != null) {
            h.a().post(new Runnable() {
                public void run() {
                    try {
                        p.a(nVar.ar().toString(), str);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
