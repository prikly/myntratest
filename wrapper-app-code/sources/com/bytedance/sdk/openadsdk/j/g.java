package com.bytedance.sdk.openadsdk.j;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.utils.IabUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: PlayablePlugin */
public class g {
    /* access modifiers changed from: private */
    public WeakReference<View> A;
    private e B;
    private a C;
    private c D;
    private int E = 0;
    private int F = 0;
    private JSONObject G = new JSONObject();
    private String H;
    private String I;
    private String J;
    private Map<String, String> K = new HashMap();
    private JSONObject L;
    private String M;
    private JSONObject N;
    private float O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private String Z;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Handler f2061a = new Handler(Looper.getMainLooper());
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private String ae;
    private String af;
    private boolean ag = false;
    private ViewTreeObserver.OnGlobalLayoutListener ah = new ViewTreeObserver.OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            try {
                View view = (View) g.this.A.get();
                if (view != null) {
                    g.this.b(view);
                }
            } catch (Throwable th) {
                f.a("PlayablePlugin", "onSizeChanged error", th);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Runnable f2062b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Runnable f2063c;

    /* renamed from: d  reason: collision with root package name */
    private Timer f2064d = new Timer();

    /* renamed from: e  reason: collision with root package name */
    private TimerTask f2065e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public b f2066f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2067g = true;

    /* renamed from: h  reason: collision with root package name */
    private Set<String> f2068h = new HashSet(Arrays.asList(new String[]{"adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"}));
    private String i = null;
    private String j = "embeded_ad";
    private boolean k = true;
    /* access modifiers changed from: private */
    public boolean l = true;
    private boolean m = true;
    private long n = 10;
    private long o = 10;
    private long p = 0;
    private long q = 0;
    private long r = -1;
    private long s = -1;
    private long t = -1;
    private long u = -1;
    private int v = 0;
    private int w = 0;
    private a x = a.MAIN;
    private Context y;
    /* access modifiers changed from: private */
    public WebView z;

    /* compiled from: PlayablePlugin */
    enum a {
        MAIN,
        RIFLE
    }

    public void q() {
    }

    public void r() {
    }

    public String w() {
        return "function playable_callJS(){return \"Android调用了JS的callJS方法\";}";
    }

    static /* synthetic */ int h(g gVar) {
        int i2 = gVar.v;
        gVar.v = i2 + 1;
        return i2;
    }

    private g(Context context, WebView webView, c cVar, a aVar) {
        this.z = webView;
        h.a(webView);
        a((View) webView);
        a(context, cVar, aVar);
        x();
    }

    private void a(Context context, c cVar, a aVar) {
        this.i = UUID.randomUUID().toString();
        this.y = context;
        this.B = new e(this);
        this.C = aVar;
        this.D = cVar;
    }

    private void x() {
        this.f2066f = new b(this);
        this.f2062b = new Runnable() {
            public void run() {
                if (g.this.l) {
                    boolean unused = g.this.l = false;
                    g.this.f2061a.removeCallbacks(g.this.f2063c);
                    g.this.a(2, "容器加载超时");
                }
            }
        };
        this.f2063c = new Runnable() {
            public void run() {
                if (g.this.l) {
                    boolean unused = g.this.l = false;
                    g.this.f2061a.removeCallbacks(g.this.f2062b);
                    g.this.a(3, "JSSDK加载超时");
                }
            }
        };
        this.f2065e = new TimerTask() {
            public void run() {
                g.this.f2061a.post(new Runnable() {
                    public void run() {
                        if (Build.VERSION.SDK_INT >= 19 && g.this.z != null) {
                            g.this.z.evaluateJavascript("javascript:playable_callJS()", new ValueCallback<String>() {
                                /* renamed from: a */
                                public void onReceiveValue(String str) {
                                    if (g.this.f2066f != null) {
                                        g.this.f2066f.a(System.currentTimeMillis());
                                    }
                                }
                            });
                        }
                    }
                });
            }
        };
    }

    private boolean y() {
        String str = this.M;
        if (str != null) {
            return str.contains("/union-fe/playable/") || this.M.contains("/union-fe-sg/playable/") || this.M.contains("/union-fe-i18n/playable/");
        }
        return false;
    }

    public void a(View view) {
        if (view != null) {
            try {
                this.A = new WeakReference<>(view);
                b(view);
                view.getViewTreeObserver().addOnGlobalLayoutListener(this.ah);
            } catch (Throwable th) {
                f.a("PlayablePlugin", "setViewForScreenSize error", th);
            }
        }
    }

    /* access modifiers changed from: private */
    public void b(View view) {
        if (view != null) {
            try {
                if (this.E != view.getWidth() || this.F != view.getHeight()) {
                    this.E = view.getWidth();
                    this.F = view.getHeight();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IabUtils.KEY_WIDTH, this.E);
                    jSONObject.put(IabUtils.KEY_HEIGHT, this.F);
                    a("resize", jSONObject);
                    this.G = jSONObject;
                }
            } catch (Throwable th) {
                f.a("PlayablePlugin", "resetViewDataJsonByView error", th);
            }
        }
    }

    public Context a() {
        return this.y;
    }

    public g a(String str, String str2) {
        this.K.put(str, str2);
        return this;
    }

    public Map<String, String> b() {
        return this.K;
    }

    public g a(String str) {
        this.H = str;
        return this;
    }

    public g b(String str) {
        this.I = str;
        return this;
    }

    public JSONObject c() {
        return this.N;
    }

    public g c(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.N = jSONObject;
        } catch (Throwable th) {
            f.a("PlayablePlugin", "setPlayableStyle error", th);
        }
        return this;
    }

    public String d() {
        return this.I;
    }

    public String e() {
        return this.H;
    }

    public g d(String str) {
        this.J = str;
        return this;
    }

    public String f() {
        return this.J;
    }

    public g e(String str) {
        this.Z = str;
        return this;
    }

    public String g() {
        return this.Z;
    }

    public g a(boolean z2) {
        this.aa = z2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.aa);
            a("volumeChange", jSONObject);
        } catch (Throwable th) {
            f.a("PlayablePlugin", "setIsMute error", th);
        }
        return this;
    }

    public boolean h() {
        return this.aa;
    }

    public g b(boolean z2) {
        if (this.ab == z2) {
            return this;
        }
        this.ab = z2;
        d(z2 ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", (JSONObject) null);
        if (this.s == -1 && this.ab) {
            this.s = System.currentTimeMillis();
            d("PL_sdk_page_show", (JSONObject) null);
        }
        if (this.ab) {
            this.r = System.currentTimeMillis();
        } else if (this.r != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.r;
            f.a("PlayablePlugin", "playable show time +" + currentTimeMillis);
            this.p = this.p + currentTimeMillis;
            this.r = -1;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", this.ab);
            a("viewableChange", jSONObject);
        } catch (Throwable th) {
            f.a("PlayablePlugin", "setViewable error", th);
        }
        return this;
    }

    public boolean i() {
        return this.ab;
    }

    public g c(boolean z2) {
        this.ac = z2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.ac);
            a("change_playable_click", jSONObject);
        } catch (Throwable th) {
            f.a("PlayablePlugin", "setPlayableClick error", th);
        }
        return this;
    }

    public Set<String> j() {
        return this.B.a();
    }

    public void a(String str, JSONObject jSONObject) {
        if (f.a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("CALL JS [");
            sb.append(str);
            sb.append("] ");
            sb.append(jSONObject != null ? jSONObject.toString() : "");
            f.a("PlayablePlugin", sb.toString());
        }
        c cVar = this.D;
        if (cVar != null) {
            cVar.a(str, jSONObject);
        }
    }

    public d k() {
        return this.C.a();
    }

    public a l() {
        return this.C;
    }

    public JSONObject m() {
        return this.G;
    }

    public JSONObject n() {
        return this.L;
    }

    public g a(JSONObject jSONObject) {
        this.L = jSONObject;
        return this;
    }

    public g f(String str) {
        if (str != null) {
            try {
                int indexOf = str.indexOf("?");
                if (indexOf != -1) {
                    str = str.substring(0, indexOf);
                }
            } catch (Throwable unused) {
            }
        }
        this.M = str;
        return this;
    }

    public JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", (double) this.O);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(IabUtils.KEY_WIDTH, this.P);
            jSONObject2.put(IabUtils.KEY_HEIGHT, this.Q);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.S);
            jSONObject3.put("y", this.R);
            jSONObject3.put(IabUtils.KEY_WIDTH, this.T);
            jSONObject3.put(IabUtils.KEY_HEIGHT, this.U);
            jSONObject.put("webview", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.W);
            jSONObject4.put("y", this.V);
            jSONObject4.put(IabUtils.KEY_WIDTH, this.X);
            jSONObject4.put(IabUtils.KEY_HEIGHT, this.Y);
            jSONObject.put("visible", jSONObject4);
        } catch (Throwable th) {
            f.a("PlayablePlugin", "getViewport error", th);
        }
        return jSONObject;
    }

    public void p() {
        this.C.b();
    }

    public void g(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            this.t = System.currentTimeMillis();
            jSONObject.put("playable_full_url", str);
            long j2 = 0;
            if (this.s != -1) {
                j2 = this.t - this.s;
            }
            jSONObject.put("playable_page_show_duration", j2);
        } catch (Throwable th) {
            f.a("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        d("PL_sdk_html_load_start", jSONObject);
        if (this.k && this.x == a.MAIN) {
            this.f2061a.postDelayed(this.f2062b, this.n * 1000);
            this.f2061a.postDelayed(this.f2063c, this.o * 1000);
            this.k = false;
        }
    }

    public void h(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            this.u = System.currentTimeMillis();
            jSONObject.put("playable_full_url", str);
            long j2 = 0;
            if (this.t != -1) {
                j2 = this.u - this.t;
            }
            jSONObject.put("playable_html_load_start_duration", j2);
        } catch (Throwable th) {
            f.a("PlayablePlugin", "reportUrlLoadFinish error", th);
        }
        d("PL_sdk_html_load_finish", jSONObject);
        this.f2061a.removeCallbacks(this.f2062b);
        if (Build.VERSION.SDK_INT >= 19 && this.f2067g) {
            this.f2067g = false;
            this.z.evaluateJavascript(w(), new ValueCallback<String>() {
                /* renamed from: a */
                public void onReceiveValue(String str) {
                    f.a("Playable_CrashMonitor", "加载注入js=" + str);
                }
            });
        }
        try {
            if (this.x == a.MAIN && this.m && this.f2066f != null) {
                this.m = false;
                this.f2066f.a(System.currentTimeMillis());
                this.f2064d.schedule(this.f2065e, 0, 1500);
                this.f2066f.a(1000);
            }
        } catch (Throwable th2) {
            f.a("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    public void s() {
        this.f2061a.removeCallbacks(this.f2062b);
        this.f2061a.removeCallbacks(this.f2063c);
    }

    public void b(JSONObject jSONObject) {
        if (jSONObject != null && !jSONObject.optBoolean("success", true) && this.l) {
            this.l = false;
            this.f2061a.removeCallbacks(this.f2062b);
            this.f2061a.removeCallbacks(this.f2063c);
            a(4, "素材渲染失败");
        }
    }

    private void b(int i2, String str) {
        if (this.C != null && y()) {
            this.C.a(i2, str);
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i2, String str) {
        b(i2, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i2);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            f.a("PlayablePlugin", "reportRenderFatal error", th);
        }
        d("PL_sdk_global_faild", jSONObject);
    }

    public void t() {
        f.a("Playable_CrashMonitor", "-- 检测到页面卡顿超过2s  需要上报");
        d("PL_sdk_page_stuck", (JSONObject) null);
        Timer timer = this.f2064d;
        if (timer != null) {
            timer.cancel();
        }
    }

    /* access modifiers changed from: protected */
    public void b(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            d(str, jSONObject);
        }
    }

    private String b(String str, String str2) {
        return String.format("rubeex://playable-lynx?accessKey=%1s&groupId=%2s&cardId=main", new Object[]{str, str2});
    }

    private void d(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("playable_event", str);
                jSONObject.put("playable_ts", System.currentTimeMillis());
                jSONObject.put("playable_viewable", this.ab);
                jSONObject.put("playable_session_id", this.i);
                if (this.x == a.MAIN) {
                    jSONObject.put("playable_url", this.M);
                } else {
                    jSONObject.put("playable_url", b(this.ae, this.af));
                }
                jSONObject.put("playable_is_prerender", this.ad);
                jSONObject.put("playable_render_type", this.x.ordinal());
                jSONObject.put("playable_sdk_version", "5.2.2");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("ad_extra_data", jSONObject);
                jSONObject2.put("tag", this.j);
                jSONObject2.put("nt", 4);
                jSONObject2.put("category", "umeng");
                jSONObject2.put("is_ad_event", "1");
                jSONObject2.put("refer", "playable");
                jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, this.L.opt("cid"));
                jSONObject2.put("log_extra", this.L.opt("log_extra"));
                if (this.C != null) {
                    if (this.x == a.MAIN) {
                        if (y()) {
                            f.a("PlayablePlugin", "reportEvent by ActionProxy");
                            this.C.a("playable_track", jSONObject2);
                            this.C.c(jSONObject);
                            return;
                        }
                    }
                    if (this.x != a.MAIN) {
                        f.a("PlayablePlugin", "reportEvent by ActionProxy");
                        this.C.a("playable_track", jSONObject2);
                        this.C.c(jSONObject);
                        return;
                    }
                    f.a("PlayablePlugin", "reportEvent error no not playable url");
                    return;
                }
                f.a("PlayablePlugin", "reportEvent error no impl");
            } catch (Throwable th) {
                f.a("PlayablePlugin", "reportEvent error", th);
            }
        }
    }

    public void i(String str) {
        this.f2061a.post(new Runnable() {
            public void run() {
                g.h(g.this);
            }
        });
    }

    public void u() {
        this.O = 0.0f;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:3|4|5|(2:7|(1:9)(1:10))|11|12|13|14|(1:16)|17|(1:19)|22|23|24|25|(1:27)|28|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0037 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x007c */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b A[Catch:{ all -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044 A[Catch:{ all -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0084 A[Catch:{ all -> 0x00b9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v() {
        /*
            r7 = this;
            boolean r0 = r7.ag
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r7.ag = r0
            r0 = 0
            r7.q = r0
            r7.u()
            java.lang.ref.WeakReference<android.view.View> r0 = r7.A     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0032 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0032
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0032 }
            r2 = 16
            if (r1 < r2) goto L_0x0029
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch:{ all -> 0x0032 }
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r7.ah     // Catch:{ all -> 0x0032 }
            r0.removeOnGlobalLayoutListener(r1)     // Catch:{ all -> 0x0032 }
            goto L_0x0032
        L_0x0029:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch:{ all -> 0x0032 }
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r7.ah     // Catch:{ all -> 0x0032 }
            r0.removeGlobalOnLayoutListener(r1)     // Catch:{ all -> 0x0032 }
        L_0x0032:
            com.bytedance.sdk.openadsdk.j.e r0 = r7.B     // Catch:{ all -> 0x0037 }
            r0.b()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            java.util.Timer r0 = r7.f2064d     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0040
            java.util.Timer r0 = r7.f2064d     // Catch:{ all -> 0x004d }
            r0.cancel()     // Catch:{ all -> 0x004d }
        L_0x0040:
            com.bytedance.sdk.openadsdk.j.b r0 = r7.f2066f     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0064
            com.bytedance.sdk.openadsdk.j.b r0 = r7.f2066f     // Catch:{ all -> 0x004d }
            r0.a()     // Catch:{ all -> 0x004d }
            r0 = 0
            r7.f2066f = r0     // Catch:{ all -> 0x004d }
            goto L_0x0064
        L_0x004d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "发生crash -- "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Playable_CrashMonitor"
            com.bytedance.sdk.openadsdk.j.f.a(r1, r0)
        L_0x0064:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x007c }
            r0.<init>()     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "playable_all_times"
            int r2 = r7.v     // Catch:{ all -> 0x007c }
            r0.put(r1, r2)     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "playable_hit_times"
            int r2 = r7.w     // Catch:{ all -> 0x007c }
            r0.put(r1, r2)     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "PL_sdk_preload_times"
            r7.d(r1, r0)     // Catch:{ all -> 0x007c }
        L_0x007c:
            long r0 = r7.r     // Catch:{ all -> 0x00b9 }
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00a8
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b9 }
            long r4 = r7.r     // Catch:{ all -> 0x00b9 }
            long r0 = r0 - r4
            java.lang.String r4 = "PlayablePlugin"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b9 }
            r5.<init>()     // Catch:{ all -> 0x00b9 }
            java.lang.String r6 = "playable show time +"
            r5.append(r6)     // Catch:{ all -> 0x00b9 }
            r5.append(r0)     // Catch:{ all -> 0x00b9 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00b9 }
            com.bytedance.sdk.openadsdk.j.f.a(r4, r5)     // Catch:{ all -> 0x00b9 }
            long r4 = r7.p     // Catch:{ all -> 0x00b9 }
            long r4 = r4 + r0
            r7.p = r4     // Catch:{ all -> 0x00b9 }
            r7.r = r2     // Catch:{ all -> 0x00b9 }
        L_0x00a8:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x00b9 }
            r0.<init>()     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = "playable_user_play_duration"
            long r2 = r7.p     // Catch:{ all -> 0x00b9 }
            r0.put(r1, r2)     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = "PL_sdk_user_play_duration"
            r7.d(r1, r0)     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.j.g.v():void");
    }

    public void a(int i2, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i2);
            jSONObject.put("description", str);
            jSONObject.put("failingUrl", str2);
        } catch (Throwable th) {
            f.a("PlayablePlugin", "onWebReceivedError error", th);
        }
        d("PL_sdk_html_load_error", jSONObject);
        if (this.l) {
            this.l = false;
            this.f2061a.removeCallbacks(this.f2062b);
            this.f2061a.removeCallbacks(this.f2063c);
            a(1, "容器加载失败");
        }
    }

    public void a(boolean z2, String str, int i2) {
        if (z2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, i2);
                jSONObject.put("failingUrl", str);
            } catch (Throwable th) {
                f.a("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            d("PL_sdk_html_load_error", jSONObject);
            if (this.l) {
                this.l = false;
                this.f2061a.removeCallbacks(this.f2062b);
                this.f2061a.removeCallbacks(this.f2063c);
                a(1, "容器加载失败");
            }
        }
    }

    /* access modifiers changed from: protected */
    public void c(JSONObject jSONObject) {
        this.C.d(jSONObject);
    }

    /* access modifiers changed from: protected */
    public void d(JSONObject jSONObject) {
        this.C.e(jSONObject);
    }

    /* access modifiers changed from: protected */
    public void e(JSONObject jSONObject) {
        this.C.f(jSONObject);
    }

    public JSONObject c(String str, JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = "";
        if (f.a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("PlayablePlugin JSB-REQ [");
            sb.append(str);
            sb.append("] ");
            sb.append(jSONObject != null ? jSONObject.toString() : str2);
            f.a("PlayablePlugin", sb.toString());
        }
        JSONObject a2 = this.B.a(str, jSONObject);
        if (f.a()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PlayablePlugin JSB-RSP [");
            sb2.append(str);
            sb2.append("] time:");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(" ");
            if (a2 != null) {
                str2 = a2.toString();
            }
            sb2.append(str2);
            f.a("PlayablePlugin", sb2.toString());
        }
        return a2;
    }

    public static g a(Context context, WebView webView, c cVar, a aVar) {
        if (webView == null || cVar == null || aVar == null) {
            return null;
        }
        return new g(context, webView, cVar, aVar);
    }
}
