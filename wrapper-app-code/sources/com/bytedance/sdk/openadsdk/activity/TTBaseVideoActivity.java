package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.a.a;
import com.bytedance.sdk.openadsdk.component.reward.a.f;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.e.g;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.j;
import com.bytedance.sdk.openadsdk.core.video.c.b;
import com.bytedance.sdk.openadsdk.core.video.c.c;
import com.bytedance.sdk.openadsdk.core.widget.a;
import com.bytedance.sdk.openadsdk.core.z;
import com.bytedance.sdk.openadsdk.g.d;
import com.bytedance.sdk.openadsdk.g.e;
import com.bytedance.sdk.openadsdk.g.f;
import com.bytedance.sdk.openadsdk.g.g;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.utils.IabUtils;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public abstract class TTBaseVideoActivity extends Activity implements x.a, b, c, f {
    protected final AtomicBoolean A;
    protected a B;
    protected IListenerManager C;
    protected String D;
    protected g E;
    boolean F;
    boolean G;
    protected boolean H;
    ProgressBar I;
    protected int J;
    String K;
    protected com.bytedance.sdk.openadsdk.component.reward.b.a L;
    protected boolean M;
    public AtomicBoolean N;
    public int O;
    protected e P;
    protected d Q;
    private com.bytedance.sdk.openadsdk.core.b.e R;
    /* access modifiers changed from: private */
    public Double S;
    private long T;
    private AtomicBoolean U;
    private boolean V;
    /* access modifiers changed from: private */
    public boolean W;
    /* access modifiers changed from: private */
    public float X;
    /* access modifiers changed from: private */
    public int Y;
    private int Z;

    /* renamed from: a  reason: collision with root package name */
    protected final String f27a;
    private int aa;
    private boolean ab;
    private AtomicBoolean ac;
    private AtomicBoolean ad;
    /* access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.common.c ae;
    private LinearLayout af;
    /* access modifiers changed from: private */
    public boolean ag;
    private int ah;

    /* renamed from: b  reason: collision with root package name */
    Context f28b;

    /* renamed from: c  reason: collision with root package name */
    n f29c;

    /* renamed from: d  reason: collision with root package name */
    String f30d;

    /* renamed from: e  reason: collision with root package name */
    TTAdDislikeDialog f31e;

    /* renamed from: f  reason: collision with root package name */
    TTAdDislikeToast f32f;

    /* renamed from: g  reason: collision with root package name */
    public AtomicBoolean f33g;

    /* renamed from: h  reason: collision with root package name */
    public AtomicBoolean f34h;
    com.bytedance.sdk.openadsdk.component.reward.view.d i;
    com.bytedance.sdk.openadsdk.component.reward.view.a j;
    com.bytedance.sdk.openadsdk.component.reward.a.c k;
    com.bytedance.sdk.openadsdk.component.reward.view.b l;
    com.bytedance.sdk.openadsdk.component.reward.a.e m;
    com.bytedance.sdk.openadsdk.component.reward.a.a n;
    com.bytedance.sdk.openadsdk.component.reward.a.f o;
    com.bytedance.sdk.openadsdk.component.reward.a.b p;
    final x q;
    boolean r;
    int s;
    int t;
    protected int u;
    final AtomicBoolean v;
    final AtomicBoolean w;
    final AtomicBoolean x;
    final AtomicBoolean y;
    final AtomicBoolean z;

    /* access modifiers changed from: protected */
    public void A() {
    }

    /* access modifiers changed from: protected */
    public abstract void H();

    /* access modifiers changed from: protected */
    public abstract boolean I();

    /* access modifiers changed from: protected */
    public boolean J() {
        return false;
    }

    public void e() {
    }

    public TTBaseVideoActivity() {
        this.f27a = I() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.S = null;
        this.T = 0;
        this.U = new AtomicBoolean(false);
        this.f33g = new AtomicBoolean(false);
        this.f34h = new AtomicBoolean(false);
        this.i = J() ? new com.bytedance.sdk.openadsdk.component.reward.view.d(this) : new com.bytedance.sdk.openadsdk.component.reward.view.c(this);
        this.j = new com.bytedance.sdk.openadsdk.component.reward.view.a(this);
        this.k = new com.bytedance.sdk.openadsdk.component.reward.a.c(this);
        this.l = new com.bytedance.sdk.openadsdk.component.reward.view.b(this);
        this.m = new com.bytedance.sdk.openadsdk.component.reward.a.e(this);
        this.n = new com.bytedance.sdk.openadsdk.component.reward.a.a(this);
        this.o = new com.bytedance.sdk.openadsdk.component.reward.a.f(this);
        this.p = new com.bytedance.sdk.openadsdk.component.reward.a.b(this);
        this.q = new x(Looper.getMainLooper(), this);
        this.r = true;
        this.u = 0;
        this.v = new AtomicBoolean(false);
        this.w = new AtomicBoolean(false);
        this.x = new AtomicBoolean(false);
        this.y = new AtomicBoolean(false);
        this.z = new AtomicBoolean(false);
        this.A = new AtomicBoolean(false);
        this.V = false;
        this.H = false;
        this.J = -1;
        this.K = "video_player";
        this.W = false;
        this.Y = 1;
        this.ab = true;
        this.N = new AtomicBoolean(false);
        this.ac = new AtomicBoolean(false);
        this.ad = new AtomicBoolean(false);
        this.ah = 0;
        this.P = new e() {
            public void a() {
                TTBaseVideoActivity.this.A();
            }
        };
        this.Q = new d() {
            public void a(int i) {
            }

            public void b() {
            }

            public void a() {
                if (!TTBaseVideoActivity.this.isFinishing()) {
                    if ((TTBaseVideoActivity.this.f29c == null || TTBaseVideoActivity.this.f29c.aG()) && TTBaseVideoActivity.this.f29c != null && !p.g(TTBaseVideoActivity.this.f29c)) {
                        TTBaseVideoActivity.this.q.removeMessages(800);
                        TTBaseVideoActivity.this.q.sendMessage(TTBaseVideoActivity.this.e(1));
                    }
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        a(getIntent());
        a(bundle);
        try {
            m.a(this);
            this.u = v.d(this, v.j(this));
            requestWindowFeature(1);
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        if (bundle != null && bundle.getLong("video_current") > 0) {
            this.m.b(bundle.getLong("video_current", 0));
        }
        this.f28b = this;
        g gVar = new g(getApplicationContext());
        this.E = gVar;
        gVar.a((f) this);
        this.J = this.E.g();
        getWindow().addFlags(128);
        l.b("onVolumeChanged", "onCreate >>>>>> mVolume = " + this.J);
    }

    /* access modifiers changed from: protected */
    public void a() {
        h();
        this.k.b(this.r);
        b();
        if (!this.f29c.aw()) {
            this.o.h();
            String str = I() ? "reward_endcard" : "fullscreen_endcard";
            b(str);
            a(str);
        }
        j();
        if (p.i(this.f29c)) {
            this.p.e();
        }
        if (com.bytedance.sdk.openadsdk.core.e.l.c(this.f29c)) {
            this.q.sendEmptyMessageDelayed(500, 100);
        }
        this.s = (int) this.m.C();
        this.i.a(g(), this.X == 100.0f);
        this.j.c();
        p();
        H();
        M();
        o();
        n nVar = this.f29c;
        if (nVar != null && nVar.ax() != null && this.f29c.ax().a() != null) {
            this.f29c.ax().a().a(0);
        }
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2 || !this.U.get()) {
            this.T = System.currentTimeMillis();
            return;
        }
        com.bytedance.sdk.openadsdk.b.e.a((System.currentTimeMillis() - this.T) + "", this.f29c, this.f27a, this.m.a());
        this.T = 0;
    }

    private void M() {
        if (!I()) {
            if (com.bytedance.sdk.openadsdk.component.reward.b.c.a(this.f29c)) {
                com.bytedance.sdk.openadsdk.component.reward.b.c cVar = new com.bytedance.sdk.openadsdk.component.reward.b.c(this, this.f29c, this.Z, this.aa);
                this.L = cVar;
                cVar.a(this.k, this.i);
                this.L.a(this.m.z());
                this.L.a(this.Y);
                this.L.a(this.X);
                this.L.a(this.R);
            } else if (com.bytedance.sdk.openadsdk.component.reward.b.b.c(this.f29c)) {
                com.bytedance.sdk.openadsdk.component.reward.b.b bVar = new com.bytedance.sdk.openadsdk.component.reward.b.b(this, this.f29c, this.Z, this.aa);
                this.L = bVar;
                bVar.a(this.k, this.i);
                this.L.a(this.Y);
                this.L.a(this.X);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        if (p.a(this.f29c) && this.J == 0) {
            this.r = true;
            this.k.b(true);
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (p.j(this.f29c) && this.r) {
            this.k.b(true);
            this.E.a(true);
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.k.a();
        this.k.a(I(), this.f29c);
        if (this.f29c.aw()) {
            this.k.a(false);
        } else {
            this.k.a(this.f29c.ap());
        }
        if (p.a(this.f29c)) {
            this.o.c().setBackgroundColor(-16777216);
            this.o.d().setBackgroundColor(-16777216);
            this.k.c(true);
            if (p.i(this.f29c)) {
                this.i.b();
                v.a((View) this.o.c(), 4);
                v.a((View) this.o.d(), 0);
            }
        }
        if (!com.bytedance.sdk.openadsdk.core.e.l.c(this.f29c) && !com.bytedance.sdk.openadsdk.core.e.l.b(this.f29c)) {
            this.i.a(v.e(this.f28b, (float) this.Z), v.e(this.f28b, (float) this.aa));
        }
    }

    /* access modifiers changed from: private */
    public boolean N() {
        return this.f29c.aw() || this.f29c.ad() == 15 || this.f29c.ad() == 5 || this.f29c.ad() == 50;
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        this.o.a(str, (f.a) new f.a() {
            /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|(1:9)|10|11|(1:20)(2:15|17)) */
            /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
                return;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0036 */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x004a A[Catch:{ all -> 0x0072 }] */
            /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void a(android.webkit.WebView r4, java.lang.String r5) {
                /*
                    r3 = this;
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.openadsdk.core.e.n r4 = r4.f29c     // Catch:{ all -> 0x0036 }
                    boolean r4 = com.bytedance.sdk.openadsdk.core.e.p.i(r4)     // Catch:{ all -> 0x0036 }
                    if (r4 == 0) goto L_0x0036
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    boolean r4 = r4.isFinishing()     // Catch:{ all -> 0x0036 }
                    if (r4 != 0) goto L_0x0036
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.openadsdk.core.e.n r4 = r4.f29c     // Catch:{ all -> 0x0036 }
                    boolean r4 = r4.aG()     // Catch:{ all -> 0x0036 }
                    if (r4 == 0) goto L_0x0036
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.openadsdk.core.e.n r4 = r4.f29c     // Catch:{ all -> 0x0036 }
                    boolean r4 = com.bytedance.sdk.openadsdk.core.e.p.g(r4)     // Catch:{ all -> 0x0036 }
                    if (r4 != 0) goto L_0x0036
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.component.utils.x r4 = r4.q     // Catch:{ all -> 0x0036 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r5 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0036 }
                    r0 = 0
                    android.os.Message r5 = r5.e((int) r0)     // Catch:{ all -> 0x0036 }
                    r0 = 1000(0x3e8, double:4.94E-321)
                    r4.sendMessageDelayed(r5, r0)     // Catch:{ all -> 0x0036 }
                L_0x0036:
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.component.reward.a.f r4 = r4.o     // Catch:{ all -> 0x0072 }
                    boolean r4 = r4.j()     // Catch:{ all -> 0x0072 }
                    if (r4 == 0) goto L_0x0072
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.core.e.n r4 = r4.f29c     // Catch:{ all -> 0x0072 }
                    boolean r4 = com.bytedance.sdk.openadsdk.core.e.p.i(r4)     // Catch:{ all -> 0x0072 }
                    if (r4 == 0) goto L_0x0072
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.component.reward.a.b r4 = r4.p     // Catch:{ all -> 0x0072 }
                    r4.b()     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.component.reward.a.f r4 = r4.o     // Catch:{ all -> 0x0072 }
                    r5 = 1
                    r4.b((boolean) r5)     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.component.reward.a.f r4 = r4.o     // Catch:{ all -> 0x0072 }
                    r4.c((boolean) r5)     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r4 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    android.content.Context r4 = r4.f28b     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r5 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.core.e.n r5 = r5.f29c     // Catch:{ all -> 0x0072 }
                    com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x0072 }
                    java.lang.String r0 = r0.f27a     // Catch:{ all -> 0x0072 }
                    java.lang.String r1 = "py_loading_success"
                    r2 = 0
                    com.bytedance.sdk.openadsdk.b.e.c((android.content.Context) r4, (com.bytedance.sdk.openadsdk.core.e.n) r5, (java.lang.String) r0, (java.lang.String) r1, (org.json.JSONObject) r2)     // Catch:{ all -> 0x0072 }
                L_0x0072:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.AnonymousClass1.a(android.webkit.WebView, java.lang.String):void");
            }

            public void a(WebView webView, String str, Bitmap bitmap) {
                if (!TTBaseVideoActivity.this.W && p.i(TTBaseVideoActivity.this.f29c)) {
                    boolean unused = TTBaseVideoActivity.this.W = true;
                    TTBaseVideoActivity.this.p.a(TTBaseVideoActivity.this.t, TTBaseVideoActivity.this.f29c, TTBaseVideoActivity.this.I());
                    TTBaseVideoActivity.this.q.sendEmptyMessageDelayed(600, (long) (TTBaseVideoActivity.this.p.j() * 1000));
                    Message obtain = Message.obtain();
                    obtain.what = 900;
                    obtain.arg1 = TTBaseVideoActivity.this.p.j();
                    TTBaseVideoActivity.this.q.sendMessage(obtain);
                    TTBaseVideoActivity.this.p.f();
                    TTBaseVideoActivity.this.f();
                    TTBaseVideoActivity.this.p.h();
                }
            }

            public void a(WebView webView, int i) {
                try {
                    if (p.i(TTBaseVideoActivity.this.f29c) && TTBaseVideoActivity.this.f29c.aG() && !TTBaseVideoActivity.this.isFinishing()) {
                        TTBaseVideoActivity.this.p.a(i);
                    } else if (TTBaseVideoActivity.this.ag && TTBaseVideoActivity.this.ae != null) {
                        TTBaseVideoActivity.this.ae.a(webView, i);
                    }
                } catch (Throwable unused) {
                }
            }
        });
        if (p.i(this.f29c)) {
            com.bytedance.sdk.openadsdk.component.reward.a.f fVar = this.o;
            fVar.a(fVar.d());
            this.p.a((DownloadListener) new DownloadListener() {
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    TTBaseVideoActivity.this.n.b();
                    TTBaseVideoActivity.this.L();
                }
            });
        }
        this.p.a(this.F);
        this.o.a((DownloadListener) new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                TTBaseVideoActivity.this.n.b();
                TTBaseVideoActivity.this.L();
            }
        });
    }

    public void f() {
        if (!this.f34h.getAndSet(true) || p.i(this.f29c)) {
            HashMap hashMap = null;
            if (!TextUtils.isEmpty(this.D)) {
                hashMap = new HashMap();
                hashMap.put("rit_scene", this.D);
                View findViewById = findViewById(16908290);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IabUtils.KEY_WIDTH, findViewById.getWidth());
                    jSONObject.put(IabUtils.KEY_HEIGHT, findViewById.getHeight());
                    jSONObject.put("alpha", (double) findViewById.getAlpha());
                } catch (Throwable unused) {
                }
                hashMap.put("root_view", jSONObject.toString());
            }
            if (!this.U.get() || !com.bytedance.sdk.openadsdk.core.e.l.c(this.f29c)) {
                this.U.set(true);
                com.bytedance.sdk.openadsdk.b.e.a(this.f28b, this.f29c, this.f27a, (Map<String, Object>) hashMap, this.S);
                K();
            }
        }
    }

    /* access modifiers changed from: protected */
    public String g() {
        String a2 = t.a(this, "tt_video_download_apk");
        n nVar = this.f29c;
        if (nVar == null) {
            return a2;
        }
        if (!TextUtils.isEmpty(nVar.W())) {
            return this.f29c.W();
        }
        if (this.f29c.L() != 4) {
            return t.a(this, "tt_video_mobile_go_detail");
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public void h() {
        if (this.p.a() && p.i(this.f29c) && p.g(this.f29c)) {
            this.q.sendMessageDelayed(e(2), 10000);
        }
    }

    /* access modifiers changed from: protected */
    public boolean i() {
        return m.h().j(String.valueOf(this.t)) != 1;
    }

    /* access modifiers changed from: private */
    public Message e(int i2) {
        Message obtain = Message.obtain();
        obtain.what = 800;
        obtain.arg1 = i2;
        return obtain;
    }

    /* access modifiers changed from: protected */
    public void j() {
        this.j.a(this.f29c);
        this.j.a(g());
    }

    private void O() {
        n nVar = this.f29c;
        if (nVar != null) {
            com.bytedance.sdk.openadsdk.h.a.b e2 = com.bytedance.sdk.openadsdk.h.a.b.b().a(I() ? 7 : 8).c(String.valueOf(u.f(nVar))).e(u.h(this.f29c));
            e2.b(this.o.n()).f(this.o.o());
            e2.g(this.f29c.ac()).d(this.f29c.Y());
            com.bytedance.sdk.openadsdk.h.b.a().f(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        this.o.a(Boolean.valueOf(I()), this.D, this.r, this.P, str);
        this.o.e().a(this.i.k()).a(this.F).a(this.P).a(this.Q).a((com.bytedance.sdk.openadsdk.g.b) new com.bytedance.sdk.openadsdk.g.b() {
            public void a(boolean z, int i, String str) {
                l.b("end card load finish: ", "code=" + i + " msg=" + str + " isRenderSuc=" + z);
                StringBuilder sb = new StringBuilder();
                sb.append("loadFinish:isRenderSuc = ");
                sb.append(z);
                Log.i("TTBaseVideoActivity", sb.toString());
                if (z) {
                    TTBaseVideoActivity.this.p.c();
                }
                if (n.b(TTBaseVideoActivity.this.f29c) && !p.a(TTBaseVideoActivity.this.f29c)) {
                    l.b("TTBaseVideoActivity", "TimeTrackLog report from js " + z);
                    TTBaseVideoActivity.this.o.a(z, i, str);
                }
            }
        });
    }

    private void P() {
        this.q.postDelayed(new Runnable() {
            public void run() {
                try {
                    TTBaseVideoActivity.this.getWindow().getDecorView().findViewById(16908335).setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300);
    }

    public void k() {
        com.bytedance.sdk.openadsdk.component.reward.view.d dVar;
        if (!(!com.bytedance.sdk.openadsdk.core.e.l.b(this.f29c) || (dVar = this.i) == null || dVar.x == null)) {
            if (this.i.x.c()) {
                this.i.r();
                this.f33g.set(true);
            } else {
                this.ad.set(true);
                a(true, false, true);
            }
        }
        if (com.bytedance.sdk.openadsdk.core.e.l.c(this.f29c)) {
            a(true, false, true);
        }
    }

    public void l() {
        com.bytedance.sdk.openadsdk.component.reward.a.e eVar = this.m;
        if (eVar != null) {
            eVar.D();
        }
    }

    public View m() {
        com.bytedance.sdk.openadsdk.component.reward.a.e eVar = this.m;
        if (eVar != null) {
            return eVar.E();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2) {
        a(z2, false);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2, boolean z3) {
        a(z2, z3, false);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z2, boolean z3, boolean z4) {
        com.bytedance.sdk.openadsdk.component.reward.a.c cVar;
        com.bytedance.sdk.openadsdk.component.reward.view.d dVar = this.i;
        if (dVar != null) {
            dVar.m();
        }
        if (z3) {
            this.ac.set(true);
        }
        if (!this.f33g.get() && (!com.bytedance.sdk.openadsdk.core.e.l.b(this.f29c) || !this.ac.get() || !this.ad.get())) {
            if (com.bytedance.sdk.openadsdk.core.e.l.b(this.f29c) && z4) {
                return;
            }
            if ((com.bytedance.sdk.openadsdk.core.e.l.b(this.f29c) || com.bytedance.sdk.openadsdk.core.e.l.c(this.f29c)) && (cVar = this.k) != null) {
                cVar.c(false);
                n();
                return;
            }
        }
        if ((Build.VERSION.SDK_INT < 17 || !isDestroyed()) && !isFinishing()) {
            this.o.s();
            this.K = "endcard";
            this.y.set(false);
            this.z.set(false);
            TTAdDislikeToast tTAdDislikeToast = this.f32f;
            if (tTAdDislikeToast != null) {
                tTAdDislikeToast.a();
            }
            Y();
            if (!this.v.getAndSet(true)) {
                if (J() && p.a(this.f29c) && z2) {
                    this.k.d(true);
                }
                c();
                if (!p.i(this.f29c)) {
                    this.x.set(z2);
                    a aVar = this.B;
                    if (aVar != null && aVar.isShowing()) {
                        this.B.dismiss();
                    }
                    if (this.f29c.aw()) {
                        this.k.d(false);
                    } else {
                        this.k.d(p.i(this.f29c));
                    }
                    this.k.c(p.a(this.f29c));
                    if (J() && p.a(this.f29c) && z2) {
                        this.k.d(true);
                    }
                    this.o.t();
                    com.bytedance.sdk.openadsdk.component.reward.view.d dVar2 = this.i;
                    if (!(dVar2 == null || dVar2.x == null)) {
                        this.i.x.d();
                    }
                    if (n.a(this.f29c) || this.o.y() || (!n.a(this.f29c, this.o.j(), this.p.d(), this.o.u()) && !p.a(this.f29c))) {
                        if (!n.b(this.f29c)) {
                            l.b("TTBaseVideoActivity", "TimeTrackLog report 408 from backup page");
                            this.o.a(false, TTAdConstant.DOWNLOAD_URL_CODE, "end_card_timeout");
                        }
                        this.o.v();
                        this.o.a(8);
                        if (this.ag) {
                            v.a((View) this.af, 8);
                            this.k.c(0);
                            this.i.d(0);
                        }
                        this.i.b(8);
                        if (!this.f29c.aw()) {
                            this.j.b();
                        } else if (!this.j.a(this.m)) {
                            finish();
                        }
                        n();
                        this.k.c(false);
                        O();
                        if (!I() && this.m.b() && this.x.get()) {
                            this.m.l();
                            return;
                        }
                        return;
                    }
                    if (!n.b(this.f29c) && !p.a(this.f29c)) {
                        l.b("TTBaseVideoActivity", "TimeTrackLog report Success from Android");
                        this.o.a(true, 0, (String) null);
                    }
                    this.o.a(0.0f);
                    this.i.a(0.0f);
                    this.o.a(0);
                    if (this.ag) {
                        v.a((View) this.af, 0);
                        this.k.c(8);
                        this.i.d(8);
                    }
                    if (p.a(this.f29c)) {
                        int au = this.f29c.au();
                        if (p.i(this.f29c)) {
                            au = (this.f29c.at() + 1) * 1000;
                        }
                        if (au == -1) {
                            n();
                        } else if (au >= 0) {
                            this.q.sendEmptyMessageDelayed(600, (long) au);
                        }
                    } else if (!p.a(this.f29c)) {
                        int av = this.f29c.av();
                        if (av == -1) {
                            n();
                        } else if (av >= 0) {
                            this.q.sendEmptyMessageDelayed(600, (long) av);
                        }
                    }
                    this.q.sendEmptyMessageDelayed(500, 100);
                    this.o.a(this.r, true);
                    this.o.c(true);
                    this.i.b(8);
                    this.o.b(true);
                    this.o.e().a("prerender_page_show", (JSONObject) null);
                }
            }
        }
    }

    public void n() {
        if (!this.ag) {
            this.k.d();
            this.i.d(0);
        }
    }

    /* access modifiers changed from: protected */
    public void o() {
        if (p.i(this.f29c)) {
            a(false);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.b.a aVar = this.L;
        if (aVar != null) {
            aVar.a(this.i.h());
        }
        Q();
    }

    /* access modifiers changed from: private */
    public void Q() {
        com.bytedance.sdk.openadsdk.component.reward.view.b bVar;
        com.bytedance.sdk.openadsdk.component.reward.b.a aVar = this.L;
        if (aVar != null && !aVar.c()) {
            HashMap hashMap = new HashMap();
            if (J() && (bVar = this.l) != null) {
                hashMap.put("dynamic_show_type", Integer.valueOf(bVar.i()));
            }
            if (!TextUtils.isEmpty(this.D)) {
                hashMap.put("rit_scene", this.D);
            }
            View findViewById = findViewById(16908290);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IabUtils.KEY_WIDTH, findViewById.getWidth());
                jSONObject.put(IabUtils.KEY_HEIGHT, findViewById.getHeight());
                jSONObject.put("alpha", (double) findViewById.getAlpha());
            } catch (Throwable unused) {
            }
            hashMap.put("root_view", jSONObject.toString());
            this.U.set(true);
            com.bytedance.sdk.openadsdk.b.e.a(this.f28b, this.f29c, this.f27a, (Map<String, Object>) hashMap, this.S);
            K();
        } else if (!a(this.m.h(), false)) {
            this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
            x();
            com.bytedance.sdk.openadsdk.component.reward.a.e eVar = this.m;
            eVar.a(true ^ eVar.B() ? 1 : 0, 4);
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(long j2, boolean z2, final Map<String, Object> map) {
        boolean z3 = false;
        if (!this.m.x()) {
            return false;
        }
        if (com.bytedance.sdk.openadsdk.core.e.l.c(this.f29c)) {
            return true;
        }
        if (!z2 || !this.m.y()) {
            W();
        }
        try {
            z3 = this.m.a(j2, this.r);
        } catch (Exception unused) {
        }
        if (z3 && !z2) {
            this.U.set(true);
            final View findViewById = findViewById(16908290);
            if (findViewById == null) {
                findViewById = getWindow().getDecorView();
            }
            findViewById.post(new Runnable() {
                public void run() {
                    if (!TTBaseVideoActivity.this.f34h.getAndSet(true)) {
                        Map map = map;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(IabUtils.KEY_WIDTH, findViewById.getWidth());
                            jSONObject.put(IabUtils.KEY_HEIGHT, findViewById.getHeight());
                            jSONObject.put("alpha", (double) findViewById.getAlpha());
                            if (map == null) {
                                map = new HashMap();
                            }
                            map.put("root_view", jSONObject.toString());
                        } catch (Throwable unused) {
                        }
                        com.bytedance.sdk.openadsdk.b.e.a(TTBaseVideoActivity.this.f28b, TTBaseVideoActivity.this.f29c, TTBaseVideoActivity.this.f27a, (Map<String, Object>) map, TTBaseVideoActivity.this.S);
                        TTBaseVideoActivity.this.K();
                    }
                }
            });
        }
        return z3;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        n nVar = this.f29c;
        if (nVar != null) {
            AnonymousClass19 r0 = new com.bytedance.sdk.openadsdk.core.b.e(this, nVar, this.f27a, I() ? 7 : 5) {
                public void a(View view, float f2, float f3, float f4, float f5, SparseArray<c.a> sparseArray, int i, int i2, int i3, boolean z) {
                    View view2 = view;
                    StringBuilder sb = new StringBuilder();
                    sb.append("ccr log, onRewardBarClick , x = ");
                    float f6 = f2;
                    sb.append(f2);
                    l.b("TTBaseVideoActivity", sb.toString());
                    if (!(TTBaseVideoActivity.this.f29c == null || !TTBaseVideoActivity.this.f29c.aw() || view2 == null || view.getTag() == null)) {
                        a(view.getTag().toString());
                    }
                    HashMap hashMap = new HashMap();
                    if (TTBaseVideoActivity.this.v.get()) {
                        hashMap.put("click_scence", 2);
                    } else if (p.i(TTBaseVideoActivity.this.f29c)) {
                        hashMap.put("click_scence", 3);
                    } else {
                        hashMap.put("click_scence", 1);
                    }
                    a((Map<String, Object>) hashMap);
                    TTBaseVideoActivity.this.onRewardBarClick(view);
                    if (view.getId() == t.e(TTBaseVideoActivity.this, "tt_playable_play") && p.i(TTBaseVideoActivity.this.f29c)) {
                        HashMap hashMap2 = new HashMap();
                        if (TTBaseVideoActivity.this.f29c.J() != null) {
                            hashMap2.put("playable_url", TTBaseVideoActivity.this.f29c.J().j());
                        }
                        TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                        com.bytedance.sdk.openadsdk.b.e.e((Context) tTBaseVideoActivity, tTBaseVideoActivity.f29c, TTBaseVideoActivity.this.f27a, "click_playable_download_button_loading", (Map<String, Object>) hashMap2);
                    }
                    TTBaseVideoActivity.this.n.a(view, f2, f3, f4, f5, sparseArray, i, i2, i3, new a.C0002a() {
                        public void a(String str, JSONObject jSONObject) {
                            TTBaseVideoActivity.this.a(str, jSONObject);
                        }

                        public void a(View view, float f2, float f3, float f4, float f5, SparseArray<c.a> sparseArray, int i, int i2, int i3) {
                            TTBaseVideoActivity.this.a(view, f2, f3, f4, f5, sparseArray, i, i2, i3);
                        }
                    });
                }
            };
            this.R = r0;
            r0.a(findViewById(16908290));
            this.R.b(findViewById(t.e(m.a(), "tt_top_dislike")));
            if (!TextUtils.isEmpty(this.D)) {
                HashMap hashMap = new HashMap();
                hashMap.put("rit_scene", this.D);
                this.R.a((Map<String, Object>) hashMap);
            }
            if (this.n.c() != null) {
                this.R.a(this.n.c());
            }
            this.p.a(this.R);
            AnonymousClass20 r9 = new com.bytedance.sdk.openadsdk.core.b.b(this, this.f29c, this.f27a, I() ? 7 : 5) {
                public void a(View view, float f2, float f3, float f4, float f5, SparseArray<c.a> sparseArray, boolean z) {
                    try {
                        TTBaseVideoActivity.this.a(view, f2, f3, f4, f5, sparseArray, this.A, this.y, this.z);
                    } catch (Exception e2) {
                        l.e("TTBaseVideoActivity", "onClickReport error :" + e2.getMessage());
                    }
                }
            };
            com.bytedance.sdk.openadsdk.component.reward.view.d dVar = this.i;
            com.bytedance.sdk.openadsdk.core.b.e eVar = this.R;
            dVar.a(eVar, eVar, r9, this.m);
            this.j.a(this.R);
            this.j.a(this.f29c, this.f27a);
        }
    }

    /* access modifiers changed from: private */
    public void a(View view, float f2, float f3, float f4, float f5, SparseArray<c.a> sparseArray, int i2, int i3, int i4) {
        if (view != null) {
            if (view.getId() == t.e(this, "tt_rb_score")) {
                a("click_play_star_level", (JSONObject) null);
            } else if (view.getId() == t.e(this, "tt_comment_vertical") || view.getId() == t.e(this, "tt_reward_ad_description")) {
                a("click_play_star_nums", (JSONObject) null);
            } else if (view.getId() == t.e(this, "tt_reward_ad_appname")) {
                a("click_play_source", (JSONObject) null);
            } else if (view.getId() == t.e(this, "tt_reward_ad_icon")) {
                a("click_play_logo", (JSONObject) null);
            } else if (view.getId() == t.e(this, "tt_video_reward_bar") || view.getId() == t.e(this, "tt_click_lower_non_content_layout") || view.getId() == t.e(this, "tt_click_upper_non_content_layout")) {
                a("click_start_play_bar", q());
            } else if (view.getId() == t.e(this, "tt_reward_ad_download")) {
                a("click_start_play", q());
            } else if (view.getId() == t.e(this, "tt_video_reward_container")) {
                a("click_video", q());
            } else if (view.getId() == t.e(this, "tt_reward_ad_download_backup") || view.getId() == t.e(this, "tt_reward_full_endcard_vast_image")) {
                a("fallback_endcard_click", q());
            }
            b(view, f2, f3, f4, f5, sparseArray, i2, i3, i4);
        }
    }

    private void b(View view, float f2, float f3, float f4, float f5, SparseArray<c.a> sparseArray, int i2, int i3, int i4) {
        HashMap hashMap;
        if (r() && this.f29c != null && view != null) {
            if (view.getId() == t.e(this, "tt_rb_score") || view.getId() == t.e(this, "tt_comment_vertical") || view.getId() == t.e(this, "tt_reward_ad_appname") || view.getId() == t.e(this, "tt_reward_ad_icon") || view.getId() == t.e(this, "tt_video_reward_bar") || view.getId() == t.e(this, "tt_click_lower_non_content_layout") || view.getId() == t.e(this, "tt_click_upper_non_content_layout") || view.getId() == t.e(this, "tt_reward_ad_download") || view.getId() == t.e(this, "tt_video_reward_container") || view.getId() == t.e(this, "tt_reward_ad_download_backup") || view.getId() == t.e(this, "tt_reward_ad_description")) {
                if (!TextUtils.isEmpty(this.D)) {
                    hashMap = new HashMap();
                    hashMap.put("rit_scene", this.D);
                } else {
                    hashMap = null;
                }
                com.bytedance.sdk.openadsdk.b.e.a(this.f28b, "click_other", this.f29c, new g.a().f(f2).e(f3).d(f4).c(f5).b(System.currentTimeMillis()).a(0).b(v.a(this.i.l())).a(v.a((View) null)).c(v.c(this.i.l())).d(v.c((View) null)).d(i3).e(i4).f(i2).a(sparseArray).b(h.d().b() ? 1 : 2).c(v.g(m.a())).a(v.e(m.a())).b(v.f(m.a())).a(), this.f27a, true, (Map<String, Object>) hashMap, -1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public JSONObject q() {
        try {
            long p2 = this.m.p();
            int q2 = this.m.q();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, p2);
                jSONObject.put("percent", q2);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public void a(String str, JSONObject jSONObject) {
        Context context = this.f28b;
        n nVar = this.f29c;
        String str2 = this.f27a;
        if (!I()) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.b.e.a(context, nVar, str2, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        n nVar = this.f29c;
        if (nVar == null || nVar.I() == 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void s() {
        HashMap hashMap = new HashMap();
        if (p.i(this.f29c)) {
            this.p.a((Map<String, Object>) hashMap);
        }
        Context context = this.f28b;
        n nVar = this.f29c;
        String str = this.f27a;
        if (I()) {
            hashMap = null;
        }
        com.bytedance.sdk.openadsdk.b.e.b(context, nVar, str, "click_close", (Map<String, Object>) hashMap);
    }

    /* access modifiers changed from: protected */
    public void t() {
        this.t = u.f(this.f29c);
        this.r = m.h().b(this.t);
        this.X = this.f29c.an();
        if (26 != Build.VERSION.SDK_INT) {
            this.Y = this.f29c.am();
        } else if (this.f28b.getResources().getConfiguration().orientation == 1) {
            this.Y = 1;
        } else {
            this.Y = 2;
        }
        if (this.Y == 2 || !v.c((Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    /* access modifiers changed from: protected */
    public void u() {
        n nVar = this.f29c;
        if (nVar == null) {
            finish();
            return;
        }
        setContentView(this.i.a(nVar));
        this.ag = com.bytedance.sdk.openadsdk.core.e.l.d(this.f29c);
        v();
        this.i.a(this.f29c, this.f27a, this.Y, I(), this.k);
        this.j.a();
        if (!this.f29c.aw()) {
            if (this.ag) {
                R();
            }
            this.o.a(this.f29c, this.f27a, this.Y, I());
            this.o.b(this.Z, this.aa);
        }
        this.p.a(this.o, this.f29c, this.f27a, this.Y);
    }

    private void R() {
        LinearLayout linearLayout = (LinearLayout) findViewById(t.e(this.f28b, "tt_lp_new_style_container"));
        this.af = linearLayout;
        v.a((View) linearLayout, 8);
        com.bytedance.sdk.openadsdk.common.c cVar = new com.bytedance.sdk.openadsdk.common.c(this, this.f29c, "landingpage_endcard");
        this.ae = cVar;
        cVar.c().setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTBaseVideoActivity.this.i.k().performClick();
            }
        });
        this.af.addView(this.ae.e(), new LinearLayout.LayoutParams(-1, -1));
        this.o.a(this.ae);
    }

    /* access modifiers changed from: protected */
    public void v() {
        float f2;
        float f3;
        int i2;
        int i3;
        if (Build.VERSION.SDK_INT != 26) {
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    S();
                } catch (Throwable unused) {
                }
            } else {
                S();
            }
        }
        float V2 = V();
        float U2 = U();
        if (this.Y == 2) {
            f2 = Math.max(V2, U2);
            f3 = Math.min(V2, U2);
        } else {
            f2 = Math.min(V2, U2);
            f3 = Math.max(V2, U2);
        }
        Context context = this.f28b;
        int d2 = v.d(context, v.j(context));
        if (this.Y != 2) {
            if (v.c((Activity) this)) {
                f3 -= (float) d2;
            }
        } else if (v.c((Activity) this)) {
            f2 -= (float) d2;
        }
        if (I()) {
            this.Z = (int) f2;
            this.aa = (int) f3;
            return;
        }
        int i4 = 20;
        int i5 = 0;
        if (this.Y != 2) {
            float f4 = this.X;
            if (!(f4 == 0.0f || f4 == 100.0f)) {
                float f5 = (float) 20;
                i2 = (int) Math.max((f3 - (((f2 - f5) - f5) / f4)) / 2.0f, 0.0f);
                i5 = i2;
                i3 = 20;
                float f6 = (float) i4;
                float f7 = (float) i3;
                this.Z = (int) ((f2 - f6) - f7);
                float f8 = (float) i5;
                float f9 = (float) i2;
                this.aa = (int) ((f3 - f8) - f9);
                int e2 = v.e(this, f8);
                int e3 = v.e(this, f9);
                getWindow().getDecorView().setPadding(v.e(this, f6), e2, v.e(this, f7), e3);
            }
        } else {
            float f10 = this.X;
            if (!(f10 == 0.0f || f10 == 100.0f)) {
                float f11 = (float) 20;
                i3 = (int) Math.max((f2 - (((f3 - f11) - f11) * f10)) / 2.0f, 0.0f);
                i4 = i3;
                i2 = 20;
                i5 = 20;
                float f62 = (float) i4;
                float f72 = (float) i3;
                this.Z = (int) ((f2 - f62) - f72);
                float f82 = (float) i5;
                float f92 = (float) i2;
                this.aa = (int) ((f3 - f82) - f92);
                int e22 = v.e(this, f82);
                int e32 = v.e(this, f92);
                getWindow().getDecorView().setPadding(v.e(this, f62), e22, v.e(this, f72), e32);
            }
        }
        i3 = 0;
        i2 = 0;
        i4 = 0;
        float f622 = (float) i4;
        float f722 = (float) i3;
        this.Z = (int) ((f2 - f622) - f722);
        float f822 = (float) i5;
        float f922 = (float) i2;
        this.aa = (int) ((f3 - f822) - f922);
        int e222 = v.e(this, f822);
        int e322 = v.e(this, f922);
        getWindow().getDecorView().setPadding(v.e(this, f622), e222, v.e(this, f722), e322);
    }

    private void S() {
        if (this.Y != 2) {
            setRequestedOrientation(1);
        } else if (w()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
    }

    /* access modifiers changed from: protected */
    public boolean w() {
        try {
            if (getIntent().getIntExtra("orientation_angle", 0) == 3) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private void T() {
        try {
            final boolean z2 = true;
            final boolean z3 = this.ab && m.h().u() == 1;
            if (!this.ab || !v.c((Activity) this) || Build.VERSION.SDK_INT < 19) {
                z2 = false;
            }
            if (z2 || z3) {
                this.q.post(new Runnable() {
                    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c3 A[Catch:{ all -> 0x00d7 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d2 A[Catch:{ all -> 0x00d7 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                            r8 = this;
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            int r0 = r0.Y     // Catch:{ all -> 0x00d7 }
                            r1 = 2
                            if (r0 != r1) goto L_0x0033
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x00d7 }
                            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x00d7 }
                            int r0 = r0.orientation     // Catch:{ all -> 0x00d7 }
                            if (r0 != r1) goto L_0x0033
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x00d7 }
                            android.view.View r0 = r0.getDecorView()     // Catch:{ all -> 0x00d7 }
                            int r0 = r0.getWidth()     // Catch:{ all -> 0x00d7 }
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r2 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r2 = r2.f28b     // Catch:{ all -> 0x00d7 }
                            int r2 = com.bytedance.sdk.openadsdk.utils.v.i(r2)     // Catch:{ all -> 0x00d7 }
                            int r2 = r2 - r0
                            int r0 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x00d7 }
                            goto L_0x004e
                        L_0x0033:
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x00d7 }
                            android.view.View r0 = r0.getDecorView()     // Catch:{ all -> 0x00d7 }
                            int r0 = r0.getHeight()     // Catch:{ all -> 0x00d7 }
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r2 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r2 = r2.f28b     // Catch:{ all -> 0x00d7 }
                            int r2 = com.bytedance.sdk.openadsdk.utils.v.h(r2)     // Catch:{ all -> 0x00d7 }
                            int r2 = r2 - r0
                            int r0 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x00d7 }
                        L_0x004e:
                            if (r0 != 0) goto L_0x00d7
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r0 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x00d7 }
                            android.view.View r0 = r0.getDecorView()     // Catch:{ all -> 0x00d7 }
                            int r2 = r0.getPaddingLeft()     // Catch:{ all -> 0x00d7 }
                            int r3 = r0.getPaddingTop()     // Catch:{ all -> 0x00d7 }
                            int r4 = r0.getPaddingRight()     // Catch:{ all -> 0x00d7 }
                            int r5 = r0.getPaddingBottom()     // Catch:{ all -> 0x00d7 }
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            int r6 = r6.Y     // Catch:{ all -> 0x00d7 }
                            r7 = 1
                            if (r6 != r7) goto L_0x008c
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x00d7 }
                            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch:{ all -> 0x00d7 }
                            int r6 = r6.orientation     // Catch:{ all -> 0x00d7 }
                            if (r6 != r7) goto L_0x008c
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r1 = r1.f28b     // Catch:{ all -> 0x00d7 }
                            float r1 = com.bytedance.sdk.openadsdk.utils.v.j(r1)     // Catch:{ all -> 0x00d7 }
                        L_0x0089:
                            int r1 = (int) r1     // Catch:{ all -> 0x00d7 }
                            int r3 = r3 + r1
                            goto L_0x00bd
                        L_0x008c:
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            int r6 = r6.Y     // Catch:{ all -> 0x00d7 }
                            if (r6 != r1) goto L_0x00bd
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r6 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.res.Resources r6 = r6.getResources()     // Catch:{ all -> 0x00d7 }
                            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch:{ all -> 0x00d7 }
                            int r6 = r6.orientation     // Catch:{ all -> 0x00d7 }
                            if (r6 != r1) goto L_0x00bd
                            boolean r1 = r1     // Catch:{ all -> 0x00d7 }
                            if (r1 == 0) goto L_0x00b0
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r1 = r1.f28b     // Catch:{ all -> 0x00d7 }
                            float r1 = com.bytedance.sdk.openadsdk.utils.v.j(r1)     // Catch:{ all -> 0x00d7 }
                            int r1 = (int) r1     // Catch:{ all -> 0x00d7 }
                            int r2 = r2 + r1
                        L_0x00b0:
                            boolean r1 = r0     // Catch:{ all -> 0x00d7 }
                            if (r1 == 0) goto L_0x00bd
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            android.content.Context r1 = r1.f28b     // Catch:{ all -> 0x00d7 }
                            float r1 = com.bytedance.sdk.openadsdk.utils.v.j(r1)     // Catch:{ all -> 0x00d7 }
                            goto L_0x0089
                        L_0x00bd:
                            boolean r1 = r0.isAttachedToWindow()     // Catch:{ all -> 0x00d7 }
                            if (r1 == 0) goto L_0x00c6
                            r0.setPadding(r2, r3, r4, r5)     // Catch:{ all -> 0x00d7 }
                        L_0x00c6:
                            com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity r1 = com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.this     // Catch:{ all -> 0x00d7 }
                            float r1 = r1.X     // Catch:{ all -> 0x00d7 }
                            r2 = 1120403456(0x42c80000, float:100.0)
                            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                            if (r1 != 0) goto L_0x00d7
                            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                            r0.setBackgroundColor(r1)     // Catch:{ all -> 0x00d7 }
                        L_0x00d7:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.AnonymousClass2.run():void");
                    }
                });
            }
            this.ab = false;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.o.w();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.H = true;
        l.b("TTBaseVideoActivity", "onResume mIsActivityShow=" + this.H + " mIsMute=" + this.r);
        T();
        if (Z()) {
            Y();
        }
        if (p.a(this.f29c)) {
            if (this.J == 0) {
                this.r = true;
            }
            if (this.r) {
                this.E.a(true);
                this.k.b(true);
            }
        }
        if (Build.VERSION.SDK_INT > 28 || Build.VERSION.SDK_INT < 24) {
            super.onResume();
        } else {
            try {
                super.onResume();
            } catch (IllegalArgumentException e2) {
                l.c("TTBaseVideoActivity", "super.onResume() run fail", e2);
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.set(this, true);
                } catch (Exception e3) {
                    l.c("TTBaseVideoActivity", "onResume set mCalled fail", e3);
                }
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.view.d dVar = this.i;
        if (dVar != null) {
            dVar.o();
        }
        this.o.m();
        com.bytedance.sdk.openadsdk.g.g gVar = this.E;
        if (gVar != null) {
            gVar.a((com.bytedance.sdk.openadsdk.g.f) this);
            this.E.e();
        }
        if (ac()) {
            W();
            this.m.a(false, this, this.ah != 0);
        }
        this.ah++;
        if (this.p.i() && p.i(this.f29c)) {
            this.p.a("return_foreground");
            com.bytedance.sdk.openadsdk.core.widget.a aVar = this.B;
            if ((aVar == null || !aVar.isShowing()) && this.p.k() > 0) {
                Message obtain = Message.obtain();
                obtain.what = 900;
                obtain.arg1 = this.p.k();
                this.q.sendMessage(obtain);
            }
        }
        B();
        com.bytedance.sdk.openadsdk.component.reward.view.b bVar = this.l;
        if (bVar != null) {
            bVar.g();
        }
        P();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        com.bytedance.sdk.openadsdk.component.reward.view.d dVar = this.i;
        if (dVar != null) {
            dVar.q();
        }
        this.H = false;
        l.b("TTBaseVideoActivity", "onPause mIsActivityShow=" + this.H + " mIsMute=" + this.r);
        if (!this.y.get()) {
            this.m.i();
        }
        X();
        if (p.i(this.f29c)) {
            this.q.removeMessages(900);
            this.q.removeMessages(600);
            this.p.a("go_background");
        }
        this.o.l();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.view.d dVar = this.i;
        if (dVar != null) {
            dVar.p();
        }
        l.b("TTBaseVideoActivity", "onStop mIsMute=" + this.r + " mLast=" + this.E.b() + " mVolume=" + this.J);
        this.o.k();
        if (p.i(this.f29c)) {
            this.q.removeMessages(900);
            this.q.removeMessages(600);
            this.p.a("go_background");
        }
        if (this.r) {
            runOnUiThread(new Runnable() {
                public void run() {
                    if (TTBaseVideoActivity.this.E.b() > 0) {
                        TTBaseVideoActivity.this.E.a(false);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.T > 0 && this.U.get()) {
            com.bytedance.sdk.openadsdk.b.e.a((System.currentTimeMillis() - this.T) + "", this.f29c, this.f27a, this.m.a());
            this.T = 0;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.b bVar = this.l;
        if (bVar != null) {
            bVar.f();
        }
        com.bytedance.sdk.openadsdk.component.reward.view.d dVar = this.i;
        if (dVar != null) {
            dVar.n();
        }
        TTAdDislikeToast tTAdDislikeToast = this.f32f;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.b();
        }
        this.q.removeCallbacksAndMessages((Object) null);
        com.bytedance.sdk.openadsdk.component.reward.a.f fVar = this.o;
        if (!(fVar == null || fVar.c() == null)) {
            z.a(this.f28b, this.o.c().getWebView());
            z.a(this.o.c().getWebView());
        }
        this.m.c(I());
        com.bytedance.sdk.openadsdk.component.reward.b.a aVar = this.L;
        if (aVar != null && !aVar.b() && !this.v.get()) {
            this.o.q();
        }
        com.bytedance.sdk.openadsdk.component.reward.a.f fVar2 = this.o;
        if (fVar2 != null) {
            fVar2.i();
        }
        com.bytedance.sdk.openadsdk.g.g gVar = this.E;
        if (gVar != null) {
            gVar.f();
            this.E.a((com.bytedance.sdk.openadsdk.g.f) null);
        }
        this.p.a(getApplicationContext());
        this.i.m();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            bundle.putString("material_meta", this.f29c != null ? this.f29c.ar().toString() : null);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.f30d);
            bundle.putString("video_cache_url", this.m.z());
            bundle.putLong("video_current", this.m.s());
            bundle.putBoolean("is_mute", this.r);
            bundle.putString("rit_scene", this.D);
            bundle.putBoolean("has_show_skip_btn", this.w.get());
            bundle.putString(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE, this.S == null ? "" : String.valueOf(this.S));
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    public void onBackPressed() {
        int i2;
        com.bytedance.sdk.openadsdk.component.reward.a.c cVar;
        com.bytedance.sdk.openadsdk.component.reward.a.b bVar;
        if (m.h().h(this.t) == 1) {
            if (I()) {
                if (p.i(this.f29c)) {
                    i2 = m.h().a(String.valueOf(this.t), true);
                } else {
                    i2 = m.h().f(this.t);
                }
            } else if (p.i(this.f29c)) {
                i2 = m.h().a(String.valueOf(this.t), false);
            } else {
                i2 = m.h().e(this.t);
            }
            com.bytedance.sdk.openadsdk.component.reward.view.d dVar = this.i;
            if (dVar != null && dVar.j()) {
                com.bytedance.sdk.openadsdk.component.reward.view.d dVar2 = this.i;
                if (dVar2 != null) {
                    dVar2.k().performClick();
                }
            } else if ((!this.v.get() || p.i(this.f29c)) && i2 != -1) {
                com.bytedance.sdk.openadsdk.component.reward.a.e eVar = this.m;
                if (((eVar != null && eVar.f() >= ((long) (i2 * 1000))) || ((bVar = this.p) != null && bVar.j() - this.p.k() >= i2)) && (cVar = this.k) != null) {
                    cVar.b();
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v.a((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (!TTBaseVideoActivity.this.isFinishing()) {
                            TTBaseVideoActivity.this.getWindow().getDecorView().postDelayed(new Runnable() {
                                public void run() {
                                    v.a((Activity) TTBaseVideoActivity.this);
                                }
                            }, 2500);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        });
    }

    public void a(Message message) {
        int i2 = message.what;
        if (i2 == 300) {
            x();
            com.bytedance.sdk.openadsdk.component.reward.a.e eVar = this.m;
            eVar.a(eVar.B() ^ true ? 1 : 0, this.m.B() ^ true ? 1 : 0);
            if (this.f29c.ax() != null && this.f29c.ax().a() != null) {
                this.f29c.ax().a().a(com.bytedance.sdk.openadsdk.core.j.a.a.GENERAL_LINEAR_AD_ERROR);
            }
        } else if (i2 == 400) {
            this.m.m();
            a(false, true);
        } else if (i2 == 500) {
            if (!p.a(this.f29c)) {
                this.k.c(false);
            }
            SSWebView c2 = this.o.c();
            if (!(c2 == null || c2.getWebView() == null)) {
                c2.i();
                c2.getWebView().resumeTimers();
            }
            if (this.o.c() != null) {
                this.o.a(1.0f);
                this.i.a(1.0f);
            }
            if (!I() && this.m.b() && this.x.get()) {
                this.m.l();
            }
        } else if (i2 == 600) {
            n();
        } else if (i2 == 800) {
            HashMap hashMap = new HashMap();
            hashMap.put("remove_loading_page_type", Integer.valueOf(message.arg1));
            if (this.f29c.J() != null) {
                hashMap.put("playable_url", this.f29c.J().j());
            }
            com.bytedance.sdk.openadsdk.b.e.e((Context) this, this.f29c, this.f27a, "remove_loading_page", (Map<String, Object>) hashMap);
            this.q.removeMessages(800);
            this.p.g();
        } else if (i2 == 900 && p.i(this.f29c)) {
            int i3 = message.arg1;
            if (i3 > 0) {
                this.k.d(true);
                int b2 = this.p.b(i3);
                if (b2 == i3) {
                    this.k.a(String.valueOf(i3), (CharSequence) null);
                } else if (b2 > 0) {
                    this.k.a(String.valueOf(i3), (CharSequence) String.format(t.a(this.f28b, "tt_skip_ad_time_text"), new Object[]{Integer.valueOf(b2)}));
                } else {
                    this.k.a(String.valueOf(i3), (CharSequence) t.a(this.f28b, "tt_txt_skip"));
                    this.k.e(true);
                }
                Message obtain = Message.obtain();
                obtain.what = 900;
                obtain.arg1 = i3 - 1;
                this.q.sendMessageDelayed(obtain, 1000);
                this.p.c(i3);
            } else {
                this.k.d(false);
                this.N.set(true);
                n();
                f(I() ? 10001 : 10002);
            }
            A();
        }
    }

    /* access modifiers changed from: protected */
    public void x() {
        this.m.t();
        this.m.m();
        a(false, true);
        if (I()) {
            f(10000);
        }
    }

    /* access modifiers changed from: protected */
    public void y() {
        x xVar = this.q;
        if (xVar != null) {
            xVar.removeMessages(900);
            this.q.removeMessages(600);
        }
    }

    /* access modifiers changed from: protected */
    public void z() {
        Message obtain = Message.obtain();
        obtain.what = 900;
        obtain.arg1 = this.p.k();
        this.q.sendMessageDelayed(obtain, 1000);
    }

    /* access modifiers changed from: protected */
    public IListenerManager a(int i2) {
        if (this.C == null) {
            this.C = com.bytedance.sdk.openadsdk.multipro.aidl.a.a.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.a.a(m.a()).a(i2));
        }
        return this.C;
    }

    public void b(int i2) {
        if (i2 > 0) {
            if (this.J > 0) {
                this.J = i2;
            } else {
                l.b("onVolumeChanged", "onVolumeChanged >>>> 变为非静音状态通知 h5");
                this.o.d(false);
                this.J = i2;
                n nVar = this.f29c;
                if (!(nVar == null || nVar.ax() == null || this.f29c.ax().a() == null || this.m == null)) {
                    this.f29c.ax().a().i(this.m.s());
                }
            }
        } else if (this.J > 0) {
            l.b("onVolumeChanged", "onVolumeChanged >>>> 变为静音状态通知 h5");
            this.o.d(true);
            this.J = i2;
            n nVar2 = this.f29c;
            if (!(nVar2 == null || nVar2.ax() == null || this.f29c.ax().a() == null || this.m == null)) {
                this.f29c.ax().a().h(this.m.s());
            }
        } else {
            this.J = i2;
        }
        if (p.j(this.f29c) && !this.v.get()) {
            return;
        }
        if (!p.i(this.f29c) && !p.j(this.f29c)) {
            return;
        }
        if (this.E.c()) {
            l.b("TTBaseVideoActivity", "onVolumeChanged by SDK mIsMute=" + this.r + " mVolume=" + this.J + " mLastVolume=" + this.E.b());
            if (this.J == 0) {
                this.k.b(true);
                this.m.b(true);
                return;
            }
            this.k.b(false);
            this.m.b(false);
            return;
        }
        this.E.b(-1);
        l.b("TTBaseVideoActivity", "onVolumeChanged by User mIsMute=" + this.r + " mVolume=" + this.J + " mLastVolume=" + this.E.b());
        if (!this.H) {
            return;
        }
        if (this.J == 0) {
            this.r = true;
            this.k.b(true);
            this.m.b(true);
            return;
        }
        this.r = false;
        this.k.b(false);
        this.m.b(false);
    }

    /* access modifiers changed from: protected */
    public float[] c(int i2) {
        float U2 = U();
        float V2 = V();
        if ((this.Y == 1) != (U2 > V2)) {
            float f2 = U2 + V2;
            V2 = f2 - V2;
            U2 = f2 - V2;
        }
        if (this.Y == 1) {
            U2 -= (float) i2;
        } else {
            V2 -= (float) i2;
        }
        return new float[]{V2, U2};
    }

    private float U() {
        return (float) v.d(this.f28b, (float) v.h(this.f28b));
    }

    private float V() {
        return (float) v.d(this.f28b, (float) v.i(this.f28b));
    }

    /* access modifiers changed from: protected */
    public void B() {
        if (J() && !this.V) {
            this.V = true;
            getWindow().getDecorView().post(new Runnable() {
                public void run() {
                    if (TTBaseVideoActivity.this.f29c != null) {
                        TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                        tTBaseVideoActivity.a(tTBaseVideoActivity.C());
                    }
                }
            });
        }
    }

    public float[] C() {
        float[] fArr = {(float) (getWindow().getDecorView().getWidth() - (getWindow().getDecorView().getPaddingLeft() * 2)), (float) (getWindow().getDecorView().getHeight() - (getWindow().getDecorView().getPaddingTop() * 2))};
        fArr[0] = (float) v.d(this, fArr[0]);
        fArr[1] = (float) v.d(this, fArr[1]);
        if (fArr[0] >= 10.0f && fArr[1] >= 10.0f) {
            return fArr;
        }
        l.b("TTBaseVideoActivity", "get root view size error, so run backup");
        return c(this.u);
    }

    /* access modifiers changed from: private */
    public void a(float[] fArr) {
        com.bytedance.sdk.openadsdk.component.reward.view.b bVar;
        this.l.a(this.f29c, new AdSlot.Builder().setCodeId(String.valueOf(u.f(this.f29c))).setExpressViewAcceptedSize(fArr[0], fArr[1]).build(), this.f27a, this.r);
        com.bytedance.sdk.openadsdk.component.reward.a.c cVar = this.k;
        if (!(cVar == null || (bVar = this.l) == null)) {
            cVar.a((com.bytedance.sdk.component.adexpress.dynamic.c) bVar.a());
        }
        this.l.a((j) new j() {
            public void a(boolean z) {
                if (TTBaseVideoActivity.this.r != z) {
                    TTBaseVideoActivity.this.k.c();
                }
            }

            public void a() {
                TTBaseVideoActivity.this.k.b();
            }

            public void b() {
                if (TTBaseVideoActivity.this.i != null && TTBaseVideoActivity.this.i.k() != null) {
                    TTBaseVideoActivity.this.i.k().performClick();
                }
            }

            public void a(int i) {
                boolean z = false;
                if (i != 1) {
                    if (i == 2) {
                        TTBaseVideoActivity.this.m.A();
                        return;
                    } else if (i == 3) {
                        com.bytedance.sdk.openadsdk.component.reward.a.e eVar = TTBaseVideoActivity.this.m;
                        if (TTBaseVideoActivity.this.v.get() || TTBaseVideoActivity.this.y.get()) {
                            z = true;
                        }
                        eVar.a(z, (b) TTBaseVideoActivity.this);
                        return;
                    } else if (i == 4) {
                        TTBaseVideoActivity.this.m.k();
                        return;
                    } else if (i != 5) {
                        return;
                    }
                }
                if (!TTBaseVideoActivity.this.m.b() && !TTBaseVideoActivity.this.m.d()) {
                    TTBaseVideoActivity.this.a(0, false);
                }
            }

            public long c() {
                return TTBaseVideoActivity.this.m.f();
            }

            public int d() {
                if (TTBaseVideoActivity.this.l.c()) {
                    return 4;
                }
                if (TTBaseVideoActivity.this.l.d()) {
                    return 5;
                }
                if (TTBaseVideoActivity.this.m.e()) {
                    return 1;
                }
                if (TTBaseVideoActivity.this.m.b()) {
                    return 2;
                }
                if (TTBaseVideoActivity.this.m.d()) {
                }
                return 3;
            }

            public void e() {
                TTBaseVideoActivity.this.G();
            }

            public void b(int i) {
                TTBaseVideoActivity.this.O = i;
            }
        });
        this.l.a((TTNativeExpressAd.ExpressAdInteractionListener) new TTNativeExpressAd.ExpressAdInteractionListener() {
            public void onAdClicked(View view, int i) {
            }

            public void onAdShow(View view, int i) {
            }

            public void onRenderFail(View view, String str, int i) {
                TTBaseVideoActivity.this.o.a(true);
                TTBaseVideoActivity.this.o.b();
                l.b("TTBaseVideoActivity", "onRenderFail、、、code:" + i);
                TTBaseVideoActivity.this.l.e().post(new Runnable() {
                    public void run() {
                        TTBaseVideoActivity.this.a(false);
                    }
                });
                TTBaseVideoActivity.this.ad();
            }

            public void onRenderSuccess(View view, float f2, float f3) {
                if (!p.i(TTBaseVideoActivity.this.f29c)) {
                    if (TTBaseVideoActivity.this.l.h()) {
                        TTBaseVideoActivity.this.b(true);
                    }
                    TTBaseVideoActivity.this.d(8);
                    TTBaseVideoActivity.this.o.a(true);
                    TTBaseVideoActivity.this.o.b();
                    if (TTBaseVideoActivity.this.l.h()) {
                        TTBaseVideoActivity.this.l.b().setBackgroundColor(-16777216);
                        if (TTBaseVideoActivity.this.L != null) {
                            TTBaseVideoActivity.this.L.a(TTBaseVideoActivity.this.i.h());
                        }
                    } else if (TTBaseVideoActivity.this.f29c.J() != null && TTBaseVideoActivity.this.N()) {
                        TTBaseVideoActivity.this.M = true;
                    }
                    TTBaseVideoActivity.this.Q();
                    TTBaseVideoActivity.this.ad();
                }
            }
        });
        Context context = this.f28b;
        n nVar = this.f29c;
        String str = this.f27a;
        AnonymousClass10 r5 = new com.bytedance.sdk.openadsdk.core.nativeexpress.f(context, nVar, str, u.a(str)) {
            public void a(View view, float f2, float f3, float f4, float f5, SparseArray<c.a> sparseArray, boolean z) {
                super.a(view, f2, f3, f4, f5, sparseArray, z);
                TTBaseVideoActivity.this.onRewardBarClick(view);
            }
        };
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.D)) {
            hashMap.put("rit_scene", this.D);
        }
        if (p.i(this.f29c)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 1);
        }
        r5.a((Map<String, Object>) hashMap);
        Context context2 = this.f28b;
        n nVar2 = this.f29c;
        String str2 = this.f27a;
        AnonymousClass11 r7 = new com.bytedance.sdk.openadsdk.core.nativeexpress.e(context2, nVar2, str2, u.a(str2)) {
            public void a(View view, float f2, float f3, float f4, float f5, SparseArray<c.a> sparseArray, boolean z) {
                super.a(view, f2, f3, f4, f5, sparseArray, z);
                if (a(view, z)) {
                    TTBaseVideoActivity.this.onRewardBarClick(view);
                }
            }
        };
        HashMap hashMap2 = new HashMap();
        if (!TextUtils.isEmpty(this.D)) {
            hashMap2.put("rit_scene", this.D);
        }
        if (p.i(this.f29c)) {
            hashMap2.put("click_scence", 3);
        } else {
            hashMap2.put("click_scence", 1);
        }
        r7.a((Map<String, Object>) hashMap2);
        this.l.a(r5, r7);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.i.h().addView(this.l.a(), layoutParams);
        if (!this.l.h()) {
            b(false);
        }
        this.l.k();
    }

    /* access modifiers changed from: protected */
    public void b(boolean z2) {
        if (!this.v.get()) {
            if (!z2) {
                this.k.c(false);
                this.k.a(false);
                this.k.d(false);
                this.i.d(8);
            } else {
                this.k.a(this.f29c.ap());
                if (p.i(this.f29c) || N()) {
                    this.k.c(true);
                }
                if (N() || ((this.L instanceof com.bytedance.sdk.openadsdk.component.reward.b.b) && J())) {
                    this.k.d(true);
                } else {
                    this.k.d();
                    this.i.d(0);
                }
            }
            if (!z2) {
                this.i.a(4);
                this.i.b(8);
            } else if (I() || (this.X == FullRewardExpressView.f823c && N())) {
                this.i.a(0);
                this.i.b(0);
            } else {
                this.i.a(8);
                this.i.b(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void D() {
        Message message = new Message();
        message.what = 400;
        if (I()) {
            f(10000);
        }
        x xVar = this.q;
        if (xVar != null) {
            xVar.sendMessageDelayed(message, 2000);
        }
    }

    /* access modifiers changed from: protected */
    public void E() {
        this.q.removeMessages(400);
    }

    /* access modifiers changed from: private */
    public void W() {
        if (!this.v.get() && this.H && !p.i(this.f29c)) {
            if ((n.c(this.f29c) || m.h().j(String.valueOf(this.t)) != 1 || !this.l.d()) && !com.bytedance.sdk.openadsdk.core.e.l.c(this.f29c)) {
                com.bytedance.sdk.openadsdk.component.reward.b.a aVar = this.L;
                if (aVar == null || aVar.c()) {
                    this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                    Message obtain = Message.obtain();
                    obtain.what = ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE;
                    this.q.sendMessageDelayed(obtain, 5000);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void X() {
        this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
    }

    /* access modifiers changed from: protected */
    public void d(int i2) {
        if (this.I == null) {
            this.I = new ProgressBar(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.I.setLayoutParams(layoutParams);
            this.I.setIndeterminateDrawable(getResources().getDrawable(t.d(this, "tt_video_loading_progress_bar")));
            this.i.h().addView(this.I);
        }
        this.I.setVisibility(i2);
    }

    private void Y() {
        this.k.a(this.f29c.ap());
    }

    /* access modifiers changed from: package-private */
    public void F() {
        if (this.f31e == null) {
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog((Context) this, this.f29c);
            this.f31e = tTAdDislikeDialog;
            tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.a() {
                public void c(View view) {
                }

                public void a(View view) {
                    TTBaseVideoActivity.this.y.set(true);
                    TTBaseVideoActivity.this.X();
                    if (TTBaseVideoActivity.this.m.b()) {
                        TTBaseVideoActivity.this.m.o();
                    }
                }

                public void b(View view) {
                    TTBaseVideoActivity.this.y.set(false);
                    TTBaseVideoActivity.this.W();
                    if (TTBaseVideoActivity.this.m.d()) {
                        TTBaseVideoActivity.this.m.n();
                    }
                }

                public void a(int i, FilterWord filterWord) {
                    if (!TTBaseVideoActivity.this.z.get() && filterWord != null && !filterWord.hasSecondOptions()) {
                        TTBaseVideoActivity.this.z.set(true);
                        TTBaseVideoActivity.this.ab();
                    }
                }
            });
            ((FrameLayout) findViewById(16908290)).addView(this.f31e);
        }
        if (this.f32f == null) {
            this.f32f = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(16908290)).addView(this.f32f);
        }
    }

    private boolean Z() {
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.v.get();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void G() {
        if (!isFinishing()) {
            if (this.z.get()) {
                aa();
                return;
            }
            if (this.f31e == null) {
                F();
            }
            this.f31e.a();
        }
    }

    private void aa() {
        this.f32f.a(com.bytedance.sdk.openadsdk.core.i.f.f1255d);
    }

    /* access modifiers changed from: private */
    public void ab() {
        this.f32f.a(com.bytedance.sdk.openadsdk.core.i.f.f1256e);
    }

    private boolean ac() {
        if (com.bytedance.sdk.openadsdk.core.e.l.b(this.f29c) && this.N.get()) {
            com.bytedance.sdk.openadsdk.component.reward.view.d dVar = this.i;
            if (dVar != null) {
                dVar.h().setVisibility(4);
                this.i.h().setVisibility(0);
            }
            return false;
        } else if (this.v.get() || this.y.get() || p.i(this.f29c)) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void a(Intent intent) {
        if (intent != null) {
            this.i.b(intent.getBooleanExtra("show_download_bar", true));
            this.D = intent.getStringExtra("rit_scene");
            this.m.a(intent.getStringExtra("video_cache_url"));
            this.f30d = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            try {
                String stringExtra = intent.getStringExtra(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE);
                if (!TextUtils.isEmpty(stringExtra)) {
                    this.S = Double.valueOf(Double.parseDouble(stringExtra));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(Bundle bundle) {
        if (bundle != null) {
            this.f30d = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
            this.m.a(bundle.getString("video_cache_url"));
            this.r = bundle.getBoolean("is_mute");
            this.D = bundle.getString("rit_scene");
            try {
                String string = bundle.getString(TTAdConstant.CLIENT_BIDDING_AUTION_PRICE);
                if (!TextUtils.isEmpty(string)) {
                    this.S = Double.valueOf(Double.parseDouble(string));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public void ad() {
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f28b, t.l(this.f28b, "tt_fade_out"));
            if (loadAnimation != null) {
                loadAnimation.setAnimationListener(new Animation.AnimationListener() {
                    public void onAnimationRepeat(Animation animation) {
                    }

                    public void onAnimationStart(Animation animation) {
                    }

                    public void onAnimationEnd(Animation animation) {
                        TTBaseVideoActivity.this.i.m();
                    }
                });
                this.i.a(loadAnimation);
                return;
            }
            this.i.m();
        } catch (Throwable unused) {
            this.i.m();
        }
    }

    public void finish() {
        super.finish();
        if (com.bytedance.sdk.openadsdk.utils.m.e()) {
            v.b((Activity) this);
        }
    }
}
