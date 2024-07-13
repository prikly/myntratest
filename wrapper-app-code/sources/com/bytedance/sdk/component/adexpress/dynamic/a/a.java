package com.bytedance.sdk.component.adexpress.dynamic.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.b.d;
import com.bytedance.sdk.component.adexpress.b.f;
import com.bytedance.sdk.component.adexpress.b.g;
import com.bytedance.sdk.component.adexpress.b.j;
import com.bytedance.sdk.component.adexpress.b.l;
import com.bytedance.sdk.component.adexpress.b.m;
import com.bytedance.sdk.component.adexpress.dynamic.c.h;
import com.bytedance.sdk.component.adexpress.dynamic.c.i;
import com.bytedance.sdk.component.adexpress.dynamic.d.b;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.c;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.f.e;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DynamicRender */
public class a implements d<DynamicRootView>, j {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public DynamicRootView f18437a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public i f18438b;

    /* renamed from: c  reason: collision with root package name */
    private Context f18439c;

    /* renamed from: d  reason: collision with root package name */
    private f f18440d;

    /* renamed from: e  reason: collision with root package name */
    private g f18441e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public l f18442f;

    /* renamed from: g  reason: collision with root package name */
    private ScheduledFuture<?> f18443g;

    /* renamed from: h  reason: collision with root package name */
    private AtomicBoolean f18444h = new AtomicBoolean(false);

    public a(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, i iVar, l lVar, com.bytedance.sdk.component.adexpress.dynamic.d.a aVar) {
        this.f18439c = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z, lVar, aVar);
        this.f18437a = dynamicRootView;
        this.f18438b = iVar;
        this.f18442f = lVar;
        dynamicRootView.setRenderListener(this);
        this.f18442f = lVar;
    }

    public void a(f fVar) {
        this.f18440d = fVar;
        int d2 = this.f18442f.d();
        if (d2 < 0) {
            this.f18437a.a(this.f18438b instanceof h ? 127 : 117);
            return;
        }
        this.f18443g = e.d().schedule(new C0226a(2), (long) d2, TimeUnit.MILLISECONDS);
        com.bytedance.sdk.component.utils.h.b().postDelayed(new Runnable() {
            public void run() {
                a.this.f();
            }
        }, this.f18442f.j());
    }

    /* access modifiers changed from: private */
    public void f() {
        this.f18442f.c().c(c());
        if (!com.bytedance.sdk.component.adexpress.a.b.a.a(this.f18442f.a())) {
            this.f18437a.a(this.f18438b instanceof h ? 123 : 113);
            return;
        }
        this.f18438b.a((b) new b() {
            public void a(final com.bytedance.sdk.component.adexpress.dynamic.b.h hVar) {
                a.this.h();
                a.this.f18442f.c().d(a.this.c());
                a.this.a(hVar);
                a.this.b(hVar);
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        a.this.c(hVar);
                    }
                });
                a.this.f18437a.setBgColor(hVar.a());
            }
        });
        this.f18438b.a(this.f18442f);
    }

    /* access modifiers changed from: private */
    public void a(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar) {
        List<com.bytedance.sdk.component.adexpress.dynamic.b.h> j;
        if (hVar != null && (j = hVar.j()) != null && j.size() > 0) {
            Collections.sort(j, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.b.h>() {
                /* renamed from: a */
                public int compare(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar, com.bytedance.sdk.component.adexpress.dynamic.b.h hVar2) {
                    com.bytedance.sdk.component.adexpress.dynamic.b.f e2 = hVar.i().e();
                    com.bytedance.sdk.component.adexpress.dynamic.b.f e3 = hVar2.i().e();
                    if (e2 == null || e3 == null) {
                        return 0;
                    }
                    return e2.Z() >= e3.Z() ? 1 : -1;
                }
            });
            for (com.bytedance.sdk.component.adexpress.dynamic.b.h next : j) {
                if (next != null) {
                    a(next);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void b(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar) {
        if (hVar != null) {
            List<com.bytedance.sdk.component.adexpress.dynamic.b.h> j = hVar.j();
            if (j != null && j.size() > 0) {
                for (com.bytedance.sdk.component.adexpress.dynamic.b.h b2 : j) {
                    b(b2);
                }
            }
            com.bytedance.sdk.component.adexpress.dynamic.b.h k = hVar.k();
            if (k != null) {
                hVar.c(hVar.e() - k.e());
                hVar.d(hVar.f() - k.f());
            }
        }
    }

    /* renamed from: a */
    public DynamicRootView e() {
        return d();
    }

    public void b() {
        a((View) e());
    }

    private void a(View view) {
        if (view != null) {
            if (view instanceof ViewGroup) {
                int i = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    a(viewGroup.getChildAt(i));
                    i++;
                }
            }
            if (view instanceof c) {
                ((c) view).b();
            }
        }
    }

    public int c() {
        return this.f18438b instanceof h ? 3 : 2;
    }

    /* access modifiers changed from: private */
    public void c(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar) {
        if (hVar == null) {
            this.f18437a.a(this.f18438b instanceof h ? 123 : 113);
            return;
        }
        this.f18442f.c().e(c());
        try {
            this.f18437a.a(hVar, c());
        } catch (Exception unused) {
            this.f18437a.a(this.f18438b instanceof h ? 128 : 118);
        }
    }

    public DynamicRootView d() {
        return this.f18437a;
    }

    public void a(g gVar) {
        this.f18441e = gVar;
    }

    private boolean g() {
        DynamicRootView dynamicRootView = this.f18437a;
        if (dynamicRootView == null || dynamicRootView.getChildCount() == 0) {
            return false;
        }
        return true;
    }

    public void a(m mVar) {
        if (!this.f18444h.get()) {
            this.f18444h.set(true);
            if (!mVar.a() || !g()) {
                this.f18440d.a(mVar.h());
                return;
            }
            this.f18437a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f18440d.a(e(), mVar);
        }
    }

    public void a(View view, int i, com.bytedance.sdk.component.adexpress.b bVar) {
        g gVar = this.f18441e;
        if (gVar != null) {
            gVar.a(view, i, bVar);
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.a.a$a  reason: collision with other inner class name */
    /* compiled from: DynamicRender */
    private class C0226a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private int f18451b;

        public C0226a(int i) {
            this.f18451b = i;
        }

        public void run() {
            if (this.f18451b == 2) {
                com.bytedance.sdk.component.utils.l.b("DynamicRender", "Dynamic parse time out");
                a.this.f18437a.a(a.this.f18438b instanceof h ? 127 : 117);
            }
        }
    }

    /* access modifiers changed from: private */
    public void h() {
        try {
            if (this.f18443g != null && !this.f18443g.isCancelled()) {
                this.f18443g.cancel(false);
                this.f18443g = null;
            }
            com.bytedance.sdk.component.utils.l.b("DynamicRender", "WebView Render cancel timeout timer");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
