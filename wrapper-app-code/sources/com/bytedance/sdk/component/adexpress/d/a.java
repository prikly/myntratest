package com.bytedance.sdk.component.adexpress.d;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.a.c.b;
import com.bytedance.sdk.component.adexpress.b.d;
import com.bytedance.sdk.component.adexpress.b.f;
import com.bytedance.sdk.component.adexpress.b.g;
import com.bytedance.sdk.component.adexpress.b.j;
import com.bytedance.sdk.component.adexpress.b.l;
import com.bytedance.sdk.component.adexpress.b.m;
import com.bytedance.sdk.component.adexpress.c;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.k;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: BaseWebViewRender */
public abstract class a implements com.bytedance.sdk.component.adexpress.a, d<SSWebView>, j, com.bytedance.sdk.component.adexpress.theme.a {

    /* renamed from: a  reason: collision with root package name */
    protected SSWebView f18416a;

    /* renamed from: b  reason: collision with root package name */
    protected int f18417b = 8;
    /* access modifiers changed from: protected */

    /* renamed from: c  reason: collision with root package name */
    public b f18418c;
    /* access modifiers changed from: protected */

    /* renamed from: d  reason: collision with root package name */
    public AtomicBoolean f18419d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private Context f18420e;

    /* renamed from: f  reason: collision with root package name */
    private String f18421f;

    /* renamed from: g  reason: collision with root package name */
    private JSONObject f18422g;

    /* renamed from: h  reason: collision with root package name */
    private String f18423h;
    private f i;
    private boolean j = false;
    private boolean k;
    private g l;
    private l m;
    private boolean n;
    private int o;

    public abstract void a(int i2);

    public int c() {
        return 0;
    }

    public abstract void g();

    public void h() {
    }

    public void i() {
    }

    /* access modifiers changed from: protected */
    public void k() {
    }

    /* access modifiers changed from: protected */
    public void l() {
    }

    public a(Context context, l lVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.f18420e = context;
        this.m = lVar;
        this.f18421f = lVar.b();
        this.f18422g = lVar.a();
        themeStatusBroadcastReceiver.a(this);
        SSWebView b2 = e.a().b();
        this.f18416a = b2;
        if (b2 == null) {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (c.a() != null) {
                this.f18416a = new SSWebView(c.a());
                return;
            }
            return;
        }
        this.j = true;
        Log.d("WebViewRender", "initWebView: reuse WebView");
    }

    public void a(String str) {
        this.f18423h = str;
    }

    public SSWebView a() {
        return this.f18416a;
    }

    public void a(g gVar) {
        this.l = gVar;
    }

    public void a(f fVar) {
        this.i = fVar;
        if (a() == null || a().getWebView() == null) {
            this.i.a(102);
        } else if (!com.bytedance.sdk.component.adexpress.a.b.a.f()) {
            this.i.a(102);
        } else if (TextUtils.isEmpty(this.f18423h)) {
            this.i.a(102);
        } else if (this.f18418c != null || com.bytedance.sdk.component.adexpress.a.b.a.a(this.f18422g)) {
            this.m.c().a(this.j);
            if (this.j) {
                try {
                    this.f18416a.m();
                    this.m.c().b();
                    k.a(this.f18416a.getWebView(), "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();");
                } catch (Exception unused) {
                    com.bytedance.sdk.component.utils.l.b("WebViewRender", "reuse webview load fail ");
                    e.a().c(this.f18416a);
                    this.i.a(102);
                }
            } else {
                SSWebView a2 = a();
                a2.m();
                this.m.c().b();
                a2.a(this.f18423h);
            }
        } else {
            this.i.a(103);
        }
    }

    /* renamed from: b */
    public SSWebView e() {
        return a();
    }

    public void d() {
        if (!this.f18419d.get()) {
            this.f18419d.set(true);
            g();
            if (this.f18416a.getParent() != null) {
                ((ViewGroup) this.f18416a.getParent()).removeView(this.f18416a);
            }
            if (this.k) {
                e.a().a(this.f18416a);
            } else {
                e.a().c(this.f18416a);
            }
        }
    }

    public void f() {
        if (a() != null) {
            try {
                a().getWebView().resumeTimers();
            } catch (Exception unused) {
            }
        }
    }

    public void a(boolean z) {
        this.n = z;
    }

    public void a(final m mVar) {
        if (mVar == null) {
            this.i.a(105);
            return;
        }
        boolean a2 = mVar.a();
        final float b2 = (float) mVar.b();
        final float c2 = (float) mVar.c();
        if (b2 <= 0.0f || c2 <= 0.0f) {
            this.i.a(105);
            return;
        }
        this.k = a2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(mVar, b2, c2);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    a.this.a(mVar, b2, c2);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void a(m mVar, float f2, float f3) {
        if (!this.k || this.n) {
            e.a().c(this.f18416a);
            c(mVar.h());
            return;
        }
        a(f2, f3);
        a(this.f18417b);
        f fVar = this.i;
        if (fVar != null) {
            fVar.a(a(), mVar);
        }
    }

    public void a(View view, int i2, com.bytedance.sdk.component.adexpress.b bVar) {
        g gVar = this.l;
        if (gVar != null) {
            gVar.a(view, i2, bVar);
        }
    }

    private void a(float f2, float f3) {
        this.m.c().c();
        int a2 = (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f18420e, f2);
        int a3 = (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f18420e, f3);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(a2, a3);
        }
        layoutParams.width = a2;
        layoutParams.height = a3;
        a().setLayoutParams(layoutParams);
    }

    private void c(int i2) {
        f fVar = this.i;
        if (fVar != null) {
            fVar.a(i2);
        }
    }

    public void j() {
        k();
        Activity a2 = com.bytedance.sdk.component.utils.b.a(this.f18416a);
        if (a2 != null) {
            this.o = a2.hashCode();
        }
    }

    public void a(Activity activity) {
        if (this.o != 0 && activity != null && activity.hashCode() == this.o) {
            com.bytedance.sdk.component.utils.l.b("WebViewRender", "release from activity onDestroy");
            d();
            l();
        }
    }
}
