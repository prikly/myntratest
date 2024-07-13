package com.bytedance.sdk.openadsdk.core.nativeexpress;

import com.bytedance.sdk.component.adexpress.b.h;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.b.u;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.Map;

/* compiled from: ExpressRenderEventMonitor */
public class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private u f1456a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f1457b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public n f1458c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f1459d;

    /* renamed from: e  reason: collision with root package name */
    private long f1460e;

    /* renamed from: f  reason: collision with root package name */
    private long f1461f;

    public i(u uVar, String str, n nVar, String str2) {
        this.f1456a = uVar;
        this.f1457b = str;
        this.f1459d = str2;
        this.f1458c = nVar;
    }

    public void a() {
        this.f1456a.a();
        l.b("ExpressRenderEvent", "start render ");
    }

    public void a(boolean z) {
        this.f1456a.b(z ? 1 : 0);
        l.b("ExpressRenderEvent", "webview start request");
    }

    public void b() {
        l.b("ExpressRenderEvent", "WebView start load");
    }

    public void c() {
        l.b("ExpressRenderEvent", "webview render success");
        this.f1456a.b();
    }

    public void a(int i) {
        this.f1456a.a(i);
        h.a(i, this.f1457b, this.f1459d, this.f1458c);
        l.b("ExpressRenderEvent", "WebView render fail");
    }

    public void b(int i) {
        l.b("ExpressRenderEvent", "dynamic start render");
        this.f1460e = System.currentTimeMillis();
        if (i == 3) {
            this.f1456a.c("dynamic_render2_start");
        } else {
            this.f1456a.c("dynamic_render_start");
        }
    }

    public void c(int i) {
        if (i == 3) {
            this.f1456a.d("dynamic_sub_analysis2_start");
        } else {
            this.f1456a.d("dynamic_sub_analysis_start");
        }
    }

    public void d(int i) {
        if (i == 3) {
            this.f1456a.d("dynamic_sub_analysis2_end");
        } else {
            this.f1456a.d("dynamic_sub_analysis_end");
        }
    }

    public void e(int i) {
        if (i == 3) {
            this.f1456a.d("dynamic_sub_render2_start");
        } else {
            this.f1456a.d("dynamic_sub_render_start");
        }
    }

    public void f(int i) {
        if (i == 3) {
            this.f1456a.d("dynamic_sub_render2_end");
        } else {
            this.f1456a.d("dynamic_sub_render_end");
        }
    }

    public void g(int i) {
        final String str;
        this.f1461f = System.currentTimeMillis();
        l.b("ExpressRenderEvent", "dynamic render success render type: " + i + "; ****cost time(ms): " + (this.f1461f - this.f1460e) + "****");
        if (i == 3) {
            this.f1456a.e("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.f1456a.e("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.f1456a.a(true);
        e.b((g) new g("dynamic_success") {
            public void run() {
                com.bytedance.sdk.openadsdk.b.e.c(m.a(), i.this.f1458c, i.this.f1457b, str, (Map<String, Object>) null);
            }
        });
    }

    public void a(int i, int i2, boolean z) {
        l.b("ExpressRenderEvent", "dynamic fail");
        if (!z) {
            this.f1456a.a(true);
        }
        if (i == 3) {
            this.f1456a.b(i2, "dynamic_render2_error");
        } else {
            this.f1456a.b(i2, "dynamic_render_error");
        }
        h.a(i2, this.f1457b, this.f1459d, this.f1458c);
    }

    public void d() {
        l.b("ExpressRenderEvent", "native render start");
        this.f1456a.c();
    }

    public void e() {
        l.b("ExpressRenderEvent", "native success");
        this.f1456a.a(true);
        this.f1456a.n();
        e.b((g) new g("native_success") {
            public void run() {
                h.a(i.this.f1457b, i.this.f1459d, i.this.f1458c);
                com.bytedance.sdk.openadsdk.b.e.c(m.a(), i.this.f1458c, i.this.f1457b, "dynamic_backup_render", (Map<String, Object>) null);
            }
        });
    }

    public void f() {
        l.b("ExpressRenderEvent", "no native render");
        this.f1456a.o();
    }

    public void g() {
        l.b("ExpressRenderEvent", "render fail");
        this.f1456a.p();
    }

    public void h() {
        l.b("ExpressRenderEvent", "render success");
        this.f1456a.b();
    }

    public void i() {
        this.f1456a.l();
        this.f1456a.m();
    }
}
