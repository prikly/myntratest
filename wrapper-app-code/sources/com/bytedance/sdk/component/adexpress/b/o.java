package com.bytedance.sdk.component.adexpress.b;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.b.i;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.utils.l;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WebViewRenderInterceptor */
public class o implements i {

    /* renamed from: a  reason: collision with root package name */
    private Context f18398a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.sdk.component.adexpress.d.a f18399b;

    /* renamed from: c  reason: collision with root package name */
    private g f18400c;

    /* renamed from: d  reason: collision with root package name */
    private l f18401d;

    /* renamed from: e  reason: collision with root package name */
    private ScheduledFuture<?> f18402e;

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f18403f = new AtomicBoolean(false);

    public o(Context context, l lVar, com.bytedance.sdk.component.adexpress.d.a aVar, g gVar) {
        this.f18398a = context;
        this.f18401d = lVar;
        this.f18400c = gVar;
        this.f18399b = aVar;
        aVar.a(this.f18400c);
    }

    public boolean a(final i.a aVar) {
        int d2 = this.f18401d.d();
        if (d2 < 0) {
            a(aVar, 107);
        } else {
            this.f18402e = e.d().schedule(new a(1, aVar), (long) d2, TimeUnit.MILLISECONDS);
            this.f18399b.a((f) new f() {
                public void a(View view, m mVar) {
                    n b2;
                    o.this.e();
                    if (!aVar.c() && (b2 = aVar.b()) != null) {
                        b2.a(o.this.f18399b, mVar);
                        aVar.a(true);
                    }
                }

                public void a(int i) {
                    o.this.a(aVar, i);
                }
            });
        }
        return true;
    }

    public void a() {
        this.f18399b.d();
        e();
    }

    public void b() {
        this.f18399b.h();
    }

    public void c() {
        this.f18399b.i();
    }

    public com.bytedance.sdk.component.adexpress.d.a d() {
        return this.f18399b;
    }

    /* access modifiers changed from: private */
    public void e() {
        try {
            if (this.f18402e != null && !this.f18402e.isCancelled()) {
                this.f18402e.cancel(false);
                this.f18402e = null;
            }
            l.b("RenderInterceptor", "WebView Render cancel timeout timer");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* compiled from: WebViewRenderInterceptor */
    private class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        i.a f18406a;

        /* renamed from: c  reason: collision with root package name */
        private int f18408c;

        public a(int i, i.a aVar) {
            this.f18408c = i;
            this.f18406a = aVar;
        }

        public void run() {
            if (this.f18408c == 1) {
                l.b("RenderInterceptor", "WebView Render timeout");
                o.this.f18399b.a(true);
                o.this.a(this.f18406a, 107);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(i.a aVar, int i) {
        if (!aVar.c() && !this.f18403f.get()) {
            e();
            this.f18401d.c().a(i);
            if (aVar.b(this)) {
                aVar.a((i) this);
            } else {
                n b2 = aVar.b();
                if (b2 != null) {
                    b2.a_(i);
                } else {
                    return;
                }
            }
            this.f18403f.getAndSet(true);
        }
    }
}
