package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.a.a.a;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.debugger.b;
import com.applovin.impl.mediation.h;
import com.applovin.impl.sdk.a.f;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.c.e;
import com.applovin.impl.sdk.d.c;
import com.applovin.impl.sdk.d.g;
import com.applovin.impl.sdk.e.i;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.utils.o;
import com.applovin.impl.sdk.utils.q;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinTargetingData;
import com.applovin.sdk.AppLovinUserSegment;
import com.applovin.sdk.AppLovinUserService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public static n f15597a;

    /* renamed from: b  reason: collision with root package name */
    public static n f15598b;

    /* renamed from: c  reason: collision with root package name */
    protected static Context f15599c;

    /* renamed from: e  reason: collision with root package name */
    private static final long f15600e = System.currentTimeMillis();

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f15601f;

    /* renamed from: g  reason: collision with root package name */
    private static a f15602g;
    private e A;
    private m B;
    private q C;
    private c D;
    private s E;
    private r F;
    private c G;
    private SessionTracker H;
    private t I;
    /* access modifiers changed from: private */
    public d J;
    private j K;
    private o L;
    private h M;
    private a N;
    private f O;
    private u P;
    private ArrayService Q;
    private PostbackServiceImpl R;
    private com.applovin.impl.sdk.network.f S;
    private e T;
    private com.applovin.impl.mediation.f U;
    private com.applovin.impl.mediation.e V;
    private MediationServiceImpl W;
    private com.applovin.mediation.hybridAds.d X;
    private h Y;
    private b Z;
    private w aa;
    private com.applovin.impl.mediation.d ab;
    private com.applovin.impl.mediation.debugger.ui.testmode.c ac;
    /* access modifiers changed from: private */
    public List<MaxAdFormat> ad;
    /* access modifiers changed from: private */
    public final Object ae = new Object();
    private final AtomicBoolean af = new AtomicBoolean(true);
    /* access modifiers changed from: private */
    public boolean ag = false;
    private boolean ah = false;
    private boolean ai = false;
    private boolean aj = false;
    private int ak = 0;
    private AppLovinSdk.SdkInitializationListener al;
    private AppLovinSdk.SdkInitializationListener am;
    /* access modifiers changed from: private */
    public AppLovinSdkConfiguration an;

    /* renamed from: d  reason: collision with root package name */
    protected com.applovin.impl.sdk.c.c f15603d;

    /* renamed from: h  reason: collision with root package name */
    private String f15604h;
    private WeakReference<Activity> i;
    private long j;
    private boolean k;
    private AppLovinSdkSettings l;
    private AppLovinUserSegment m;
    private AppLovinTargetingData n;
    private String o;
    private AppLovinAdServiceImpl p;
    private AppLovinNativeAdService q;
    private EventServiceImpl r;
    private UserServiceImpl s;
    private VariableServiceImpl t;
    private AppLovinSdk u;
    /* access modifiers changed from: private */
    public v v;
    /* access modifiers changed from: private */
    public com.applovin.impl.sdk.e.o w;
    private com.applovin.impl.sdk.network.b x;
    private g y;
    private o z;

    static {
        boolean z2;
        try {
            AppLovinSdkUtils.runOnUiThread($$Lambda$VR7QGn0xyRJD0dkleEGYCFjawQ.INSTANCE);
            z2 = true;
        } catch (Throwable th) {
            f15601f = false;
            throw th;
        }
        f15601f = z2;
    }

    public static long A() {
        return f15600e;
    }

    public static boolean B() {
        return f15601f;
    }

    public static Context Q() {
        return f15599c;
    }

    public static a a(Context context) {
        if (f15602g == null) {
            f15602g = new a(context);
        }
        return f15602g;
    }

    /* access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        for (String i2 : JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList())) {
            v.i("AppLovinSdk", i2);
        }
    }

    private void as() {
        this.J.a((d.a) new d.a() {
            public void a() {
                v unused = n.this.v;
                if (v.a()) {
                    n.this.v.c("AppLovinSdk", "Connected to internet - re-initializing SDK");
                }
                synchronized (n.this.ae) {
                    if (!n.this.ag) {
                        n.this.b();
                    }
                }
                n.this.J.b(this);
            }

            public void b() {
            }
        });
    }

    /* access modifiers changed from: private */
    public List<MaxAdFormat> b(JSONObject jSONObject) {
        List<String> asList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(asList.size());
        for (String formatFromString : asList) {
            MaxAdFormat formatFromString2 = MaxAdFormat.formatFromString(formatFromString);
            if (formatFromString2 != null) {
                arrayList.add(formatFromString2);
            }
        }
        return arrayList;
    }

    public String C() {
        return this.f15604h;
    }

    public v D() {
        return this.v;
    }

    public e E() {
        return this.T;
    }

    public com.applovin.impl.mediation.f F() {
        return this.U;
    }

    public com.applovin.impl.mediation.e G() {
        return this.V;
    }

    public MediationServiceImpl H() {
        return this.W;
    }

    public com.applovin.mediation.hybridAds.d I() {
        return this.X;
    }

    public w J() {
        return this.aa;
    }

    public b K() {
        return this.Z;
    }

    public h L() {
        return this.Y;
    }

    public com.applovin.impl.mediation.d M() {
        return this.ab;
    }

    public com.applovin.impl.mediation.debugger.ui.testmode.c N() {
        return this.ac;
    }

    public com.applovin.impl.sdk.c.c O() {
        return this.f15603d;
    }

    public Context P() {
        return f15599c;
    }

    public Activity R() {
        WeakReference<Activity> weakReference = this.i;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public boolean S() {
        return this.ai;
    }

    public boolean T() {
        return this.aj;
    }

    public com.applovin.impl.sdk.network.b U() {
        return this.x;
    }

    public com.applovin.impl.sdk.e.o V() {
        return this.w;
    }

    public g W() {
        return this.y;
    }

    public com.applovin.impl.sdk.network.f X() {
        return this.S;
    }

    public o Y() {
        return this.z;
    }

    public m Z() {
        return this.B;
    }

    public <T> T a(com.applovin.impl.sdk.c.b<T> bVar) {
        return this.f15603d.a(bVar);
    }

    public <T> T a(com.applovin.impl.sdk.c.d<T> dVar) {
        return b(dVar, (Object) null);
    }

    public <T> T a(String str, T t2, Class<?> cls, SharedPreferences sharedPreferences) {
        return e.a(str, t2, (Class) cls, sharedPreferences);
    }

    public void a() {
        synchronized (this.ae) {
            if (!this.ag && !this.ah) {
                b();
            }
        }
    }

    public void a(long j2) {
        this.B.a(j2);
    }

    public void a(SharedPreferences sharedPreferences) {
        this.A.a(sharedPreferences);
    }

    public void a(com.applovin.impl.mediation.a.f fVar) {
        if (!this.w.a()) {
            List<String> b2 = b(com.applovin.impl.sdk.c.a.f15335a);
            if (b2.size() > 0 && this.V.b().keySet().containsAll(b2)) {
                if (v.a()) {
                    this.v.b("AppLovinSdk", "All required adapters initialized");
                }
                this.w.e();
                j();
            }
        }
    }

    public <T> void a(com.applovin.impl.sdk.c.d<T> dVar, T t2) {
        this.A.a(dVar, t2);
    }

    public <T> void a(com.applovin.impl.sdk.c.d<T> dVar, T t2, SharedPreferences sharedPreferences) {
        this.A.a(dVar, t2, sharedPreferences);
    }

    public void a(final AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        if (!d()) {
            this.al = sdkInitializationListener;
        } else if (sdkInitializationListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    sdkInitializationListener.onSdkInitialized(n.this.an);
                }
            });
        }
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.u = appLovinSdk;
    }

    public void a(String str) {
        v.f("AppLovinSdk", "Setting plugin version: " + str);
        this.f15603d.a((com.applovin.impl.sdk.c.b<?>) com.applovin.impl.sdk.c.b.dI, (Object) str);
    }

    public void a(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        e eVar;
        String str2;
        com.applovin.impl.sdk.c.d<String> dVar;
        this.f15604h = str;
        this.j = System.currentTimeMillis();
        this.l = appLovinSdkSettings;
        this.m = new g();
        this.n = new AppLovinTargetingDataImpl();
        this.an = new SdkConfigurationImpl((List<String>) null, this);
        f15599c = context.getApplicationContext();
        if (context instanceof Activity) {
            this.i = new WeakReference<>((Activity) context);
        }
        if ("HSrCHRtOan6wp2kwOIGJC1RDtuSrF2mWVbio2aBcMHX9KF3iTJ1lLSzCKP1ZSo5yNolPNw1kCTtWpxELFF4ah1".equalsIgnoreCase(str)) {
            this.k = true;
            f15598b = this;
        } else if (f15597a == null) {
            f15597a = this;
        } else {
            v.i("AppLovinSdk", "Multiple SDK instances detected");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.A = new e(this);
        this.f15603d = new com.applovin.impl.sdk.c.c(this);
        this.v = new v(this);
        if (((Boolean) a(com.applovin.impl.sdk.c.b.bA)).booleanValue()) {
            this.E = new s(this);
        }
        this.F = new r(this);
        this.D = new c(this);
        this.r = new EventServiceImpl(this);
        this.s = new UserServiceImpl(this);
        this.t = new VariableServiceImpl(this);
        this.G = new c(this);
        this.w = new com.applovin.impl.sdk.e.o(this);
        this.x = new com.applovin.impl.sdk.network.b(this);
        this.y = new g(this);
        this.O = new f(this);
        this.z = new o(this);
        this.p = new AppLovinAdServiceImpl(this);
        this.q = new AppLovinNativeAdService(this);
        this.H = new SessionTracker(this);
        this.I = new t(this);
        this.R = new PostbackServiceImpl(this);
        this.S = new com.applovin.impl.sdk.network.f(this);
        this.T = new e(this);
        this.U = new com.applovin.impl.mediation.f(this);
        this.V = new com.applovin.impl.mediation.e(this);
        this.W = new MediationServiceImpl(this);
        this.X = new com.applovin.mediation.hybridAds.d(this);
        this.aa = new w(this);
        this.Z = new b(this);
        this.Y = new h();
        this.ab = new com.applovin.impl.mediation.d(this);
        this.B = new m(this);
        this.L = new o(this);
        this.M = new h(this);
        this.ac = new com.applovin.impl.mediation.debugger.ui.testmode.c(this);
        this.N = new a(this);
        this.P = new u(this);
        this.Q = new ArrayService(this);
        this.K = new j(this);
        this.C = new q(this);
        this.V.a(MaxAdapter.InitializationStatus.INITIALIZING);
        if (((Boolean) a(com.applovin.impl.sdk.c.b.dg)).booleanValue()) {
            this.J = new d(context);
        }
        if (TextUtils.isEmpty(str)) {
            v.i("AppLovinSdk", "Unable to find AppLovin SDK key. Please add  meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.");
            v.i("AppLovinSdk", "Called with an invalid SDK key from: " + Log.getStackTraceString(new Throwable("")));
        }
        if (str.length() != 86 && Utils.isPubInDebugMode(context, this)) {
            v.i("AppLovinSdk", "Please double-check that you entered your SDK key correctly (" + str + ") : " + Log.getStackTraceString(new Throwable("")));
        }
        if (Utils.isProguardRulesOmitted()) {
            v.i("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!Utils.hasAndroidCoreJsonLibrary(this)) {
            v.i("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (Utils.isVerboseLoggingEnabled(context)) {
            appLovinSdkSettings.setVerboseLogging(true);
        }
        O().a((com.applovin.impl.sdk.c.b<?>) com.applovin.impl.sdk.c.b.ae, (Object) Boolean.valueOf(appLovinSdkSettings.isVerboseLoggingEnabled()));
        com.applovin.impl.adview.d.class.getName();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (TextUtils.isEmpty((String) this.A.b(com.applovin.impl.sdk.c.d.f15352a, null, defaultSharedPreferences))) {
            this.ai = true;
            eVar = this.A;
            dVar = com.applovin.impl.sdk.c.d.f15352a;
            str2 = Boolean.toString(true);
        } else {
            eVar = this.A;
            dVar = com.applovin.impl.sdk.c.d.f15352a;
            str2 = Boolean.toString(false);
        }
        eVar.a(dVar, str2, defaultSharedPreferences);
        if (((Boolean) this.A.b(com.applovin.impl.sdk.c.d.f15353b, false)).booleanValue()) {
            if (v.a()) {
                this.v.b("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.aj = true;
        } else {
            if (v.a()) {
                this.v.b("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            this.A.a(com.applovin.impl.sdk.c.d.f15353b, true);
        }
        String str3 = (String) this.A.b(com.applovin.impl.sdk.c.d.f15354c, null);
        if (!StringUtils.isValidString(str3) || AppLovinSdk.VERSION_CODE > Utils.toVersionCode(str3)) {
            this.A.a(com.applovin.impl.sdk.c.d.f15354c, AppLovinSdk.VERSION);
        }
        boolean a2 = i.a(P());
        if (!((Boolean) a(com.applovin.impl.sdk.c.b.dh)).booleanValue() || a2) {
            b();
        }
        if (((Boolean) a(com.applovin.impl.sdk.c.b.dg)).booleanValue() && !a2) {
            if (v.a()) {
                this.v.c("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            as();
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public <T> void a(String str, T t2, SharedPreferences.Editor editor) {
        this.A.a(str, t2, editor);
    }

    public void a(Map<String, List<?>> map) {
        this.Z.a(map);
    }

    public void a(boolean z2) {
        synchronized (this.ae) {
            this.ag = false;
            this.ah = z2;
        }
        if (this.f15603d != null && this.w != null) {
            List<String> b2 = b(com.applovin.impl.sdk.c.a.f15335a);
            if (b2.isEmpty()) {
                this.w.e();
                j();
                return;
            }
            long longValue = ((Long) a(com.applovin.impl.sdk.c.a.f15336b)).longValue();
            z zVar = new z(this, true, new Runnable() {
                public void run() {
                    if (!n.this.w.a()) {
                        v unused = n.this.v;
                        if (v.a()) {
                            n.this.v.b("AppLovinSdk", "Timing out adapters init...");
                        }
                        n.this.w.e();
                        n.this.j();
                    }
                }
            });
            if (v.a()) {
                v vVar = this.v;
                vVar.b("AppLovinSdk", "Waiting for required adapters to init: " + b2 + " - timing out in " + longValue + "ms...");
            }
            this.w.a(zVar, o.a.MEDIATION_TIMEOUT, longValue, true);
        }
    }

    public boolean a(com.applovin.impl.sdk.c.b<String> bVar, MaxAdFormat maxAdFormat) {
        return c(bVar).contains(maxAdFormat);
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List<MaxAdFormat> list = this.ad;
        return list != null && list.size() > 0 && !this.ad.contains(maxAdFormat);
    }

    public PostbackServiceImpl aa() {
        return this.R;
    }

    public AppLovinSdk ab() {
        return this.u;
    }

    public c ac() {
        return this.D;
    }

    public s ad() {
        return this.E;
    }

    public r ae() {
        return this.F;
    }

    public c af() {
        return this.G;
    }

    public SessionTracker ag() {
        return this.H;
    }

    public t ah() {
        return this.I;
    }

    public a ai() {
        return f15602g;
    }

    public j aj() {
        return this.K;
    }

    public com.applovin.impl.sdk.utils.o ak() {
        return this.L;
    }

    public h al() {
        return this.M;
    }

    public AppLovinBroadcastManager am() {
        return AppLovinBroadcastManager.getInstance(f15599c);
    }

    public a an() {
        return this.N;
    }

    public f ao() {
        return this.O;
    }

    public u ap() {
        return this.P;
    }

    public ArrayService aq() {
        return this.Q;
    }

    public Activity ar() {
        Activity a2 = a(f15599c).a();
        return a2 != null ? a2 : R();
    }

    public <T> T b(com.applovin.impl.sdk.c.d<T> dVar, T t2) {
        return this.A.b(dVar, t2);
    }

    public <T> T b(com.applovin.impl.sdk.c.d<T> dVar, T t2, SharedPreferences sharedPreferences) {
        return this.A.b(dVar, t2, sharedPreferences);
    }

    public List<String> b(com.applovin.impl.sdk.c.b<String> bVar) {
        return this.f15603d.b(bVar);
    }

    public void b() {
        synchronized (this.ae) {
            this.ag = true;
            V().d();
            int i2 = this.ak + 1;
            this.ak = i2;
            V().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.sdk.e.i(i2, this, new i.a() {
                public void a(JSONObject jSONObject) {
                    boolean z = jSONObject.length() > 0;
                    com.applovin.impl.sdk.utils.i.d(jSONObject, n.this);
                    com.applovin.impl.sdk.utils.i.c(jSONObject, n.this);
                    f.a(n.this);
                    com.applovin.impl.sdk.utils.i.e(jSONObject, n.this);
                    com.applovin.impl.sdk.utils.i.a(jSONObject, z, n.this);
                    com.applovin.impl.mediation.c.b.a(jSONObject, n.this);
                    com.applovin.impl.mediation.c.b.b(jSONObject, n.this);
                    n.this.K().a(JsonUtils.getBoolean(jSONObject, "smd", false).booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
                    n nVar = n.this;
                    List unused = nVar.ad = nVar.b(jSONObject);
                    if (z) {
                        List<String> explode = CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", ""));
                        n nVar2 = n.this;
                        AppLovinSdkConfiguration unused2 = nVar2.an = new SdkConfigurationImpl(explode, nVar2);
                    }
                    com.applovin.impl.sdk.utils.i.f(jSONObject, n.this);
                    n.this.N().a(jSONObject);
                    n.this.a(jSONObject);
                    n.this.V().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.sdk.e.n(n.this));
                }
            }), o.a.MAIN, (long) ((Integer) a(com.applovin.impl.sdk.c.b.ee)).intValue());
        }
    }

    public <T> void b(com.applovin.impl.sdk.c.d<T> dVar) {
        this.A.a(dVar);
    }

    public void b(String str) {
        if (v.a()) {
            v vVar = this.v;
            vVar.b("AppLovinSdk", "Setting user id: " + str);
        }
        if (StringUtils.isValidString(str) && str.length() > Utils.kilobytesToByes(8)) {
            v.i("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + Utils.kilobytesToByes(8) + " maximum)");
        }
        this.C.a(str);
    }

    public List<MaxAdFormat> c(com.applovin.impl.sdk.c.b<String> bVar) {
        return this.f15603d.c(bVar);
    }

    public void c(String str) {
        this.o = str;
        b(com.applovin.impl.sdk.c.d.A);
    }

    public boolean c() {
        boolean z2;
        synchronized (this.ae) {
            z2 = this.ag;
        }
        return z2;
    }

    public boolean d() {
        boolean z2;
        synchronized (this.ae) {
            z2 = this.ah;
        }
        return z2;
    }

    public boolean e() {
        return this.k;
    }

    public boolean f() {
        return StringUtils.containsIgnoreCase(u(), AppLovinMediationProvider.MAX);
    }

    public boolean g() {
        return Utils.checkClassExistence("com.unity3d.player.UnityPlayerActivity");
    }

    public void h() {
        String str = (String) this.A.b(com.applovin.impl.sdk.c.d.f15354c, null);
        if (StringUtils.isValidString(str) && AppLovinSdk.VERSION_CODE < Utils.toVersionCode(str)) {
            v.i("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
        }
    }

    public void i() {
        this.K.a();
    }

    public void j() {
        final AppLovinSdk.SdkInitializationListener sdkInitializationListener = this.al;
        if (sdkInitializationListener != null) {
            if (d()) {
                this.al = null;
                this.am = null;
                this.V.a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
            } else if (this.am != sdkInitializationListener) {
                this.V.a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
                if (((Boolean) a(com.applovin.impl.sdk.c.b.am)).booleanValue()) {
                    this.al = null;
                } else {
                    this.am = sdkInitializationListener;
                }
            } else {
                return;
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    v unused = n.this.v;
                    if (v.a()) {
                        n.this.v.b("AppLovinSdk", "Calling back publisher's initialization completion handler...");
                    }
                    sdkInitializationListener.onSdkInitialized(n.this.an);
                }
            }, Math.max(0, ((Long) a(com.applovin.impl.sdk.c.b.an)).longValue()));
        }
    }

    public void k() {
        v.i("AppLovinSdk", "Resetting SDK state...");
        long b2 = this.y.b(com.applovin.impl.sdk.d.f.i);
        this.f15603d.c();
        this.f15603d.a();
        this.y.a();
        this.y.b(com.applovin.impl.sdk.d.f.i, b2 + 1);
        if (this.af.compareAndSet(true, false)) {
            b();
        } else {
            this.af.set(true);
        }
    }

    public void l() {
        a((Map<String, List<?>>) null);
    }

    public void m() {
        this.N.b();
    }

    public String n() {
        return this.C.a();
    }

    public String o() {
        return this.C.b();
    }

    public String p() {
        return this.C.c();
    }

    public AppLovinSdkSettings q() {
        return this.l;
    }

    public AppLovinUserSegment r() {
        return this.m;
    }

    public AppLovinTargetingDataImpl s() {
        return (AppLovinTargetingDataImpl) this.n;
    }

    public AppLovinSdkConfiguration t() {
        return this.an;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.f15604h + '\'' + ", enabled=" + this.ah + ", isFirstSession=" + this.ai + '}';
    }

    public String u() {
        String str = (String) a(com.applovin.impl.sdk.c.d.A);
        return StringUtils.isValidString(str) ? str : this.o;
    }

    public AppLovinAdServiceImpl v() {
        return this.p;
    }

    public AppLovinNativeAdService w() {
        return this.q;
    }

    public AppLovinEventService x() {
        return this.r;
    }

    public AppLovinUserService y() {
        return this.s;
    }

    public VariableServiceImpl z() {
        return this.t;
    }
}
