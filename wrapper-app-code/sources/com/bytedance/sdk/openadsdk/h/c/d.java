package com.bytedance.sdk.openadsdk.h.c;

import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.openadsdk.h.c.c;
import com.bytedance.sdk.openadsdk.multipro.c.a;
import com.bytedance.sdk.openadsdk.utils.l;
import com.bytedance.sdk.openadsdk.utils.t;

/* compiled from: LogUploaderImpl4MultiProcess */
public class d implements a {
    public void b() {
    }

    public void a() {
        a.e();
    }

    public void a(final com.bytedance.sdk.openadsdk.h.a aVar) {
        try {
            t.b(new g("uploadEvent") {
                public void run() {
                    try {
                        a.b(aVar.a().a().toString());
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    public String b(com.bytedance.sdk.openadsdk.h.a aVar) throws Exception {
        return new c.a(l.a(), aVar.a().a()).a();
    }

    public void a(final com.bytedance.sdk.openadsdk.h.a aVar, final boolean z) {
        try {
            t.b(new g("uploadEvent") {
                public void run() {
                    try {
                        a.a(d.this.b(aVar), z);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }
}
