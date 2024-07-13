package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appodeal.ads.Native;
import com.appodeal.ads.l;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.libs.network.NetworkStateObserver;
import com.appodeal.ads.modules.libs.network.NetworkStatus;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.r;
import com.appodeal.ads.s;
import com.appodeal.ads.segments.g;
import com.appodeal.ads.segments.h;
import com.appodeal.ads.segments.k;
import com.appodeal.ads.segments.m;
import com.appodeal.ads.segments.n;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.app.AppState;
import com.appodeal.ads.utils.c0;
import com.appodeal.ads.utils.o;
import com.onesignal.OneSignalDbContract;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class u<AdObjectType extends l, AdRequestType extends r<AdObjectType>, RequestParamsType extends s> {
    public static final /* synthetic */ boolean E = (!u.class.desiredAssertionStatus());
    public float A;
    public int B;
    public final a C;
    public RequestParamsType D;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedBlockingQueue f17430a = new LinkedBlockingQueue();

    /* renamed from: b  reason: collision with root package name */
    public ThreadPoolExecutor f17431b;

    /* renamed from: c  reason: collision with root package name */
    public final NetworkStatus f17432c;

    /* renamed from: d  reason: collision with root package name */
    public final b0<AdObjectType, AdRequestType, ?> f17433d;

    /* renamed from: e  reason: collision with root package name */
    public final i f17434e;

    /* renamed from: f  reason: collision with root package name */
    public final AdType f17435f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f17436g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f17437h;
    public boolean i;
    public boolean j;
    public boolean k;
    public g l;
    public String m;
    public com.appodeal.ads.waterfall_filter.a n;
    public long o;
    public Integer p;
    public int q;
    public String r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public AdRequestType x;
    public AdRequestType y;
    public float z;

    public class a extends c0 {
        public a() {
        }

        public final void a(Activity activity, AppState appState) {
            u.this.a(activity, appState);
        }

        public final void a(Configuration configuration) {
            u.this.a(configuration);
        }
    }

    public class b implements n.a {
        public b() {
        }

        public final void a() {
            u.this.j = true;
        }
    }

    public class c implements h.a {
        public c() {
        }

        public final String a() {
            return u.this.m;
        }

        public final g b() {
            return u.this.l;
        }

        public final void a(g gVar) {
            u uVar = u.this;
            uVar.l = gVar;
            uVar.m = null;
        }
    }

    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r f17441a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l f17442b;

        public d(r rVar, l lVar) {
            this.f17441a = rVar;
            this.f17442b = lVar;
        }

        public final void run() {
            u.this.f17433d.a(this.f17441a, this.f17442b, LoadingError.TimeoutError);
        }
    }

    public u(b0<AdObjectType, AdRequestType, ?> b0Var, AdType adType, g gVar) {
        NetworkStatus networkStatus = NetworkStatus.INSTANCE;
        this.f17432c = networkStatus;
        c();
        this.f17436g = new ArrayList();
        this.f17437h = false;
        this.i = false;
        this.j = false;
        this.k = true;
        this.o = 0;
        this.p = null;
        this.q = 0;
        this.s = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.z = 1.2f;
        this.A = 2.0f;
        this.B = 5000;
        this.C = new a();
        this.D = null;
        this.f17433d = b0Var;
        this.f17435f = adType;
        this.l = gVar;
        this.f17434e = i.a(adType);
        b0Var.a((u<AdObjectType, AdRequestType, ?>) this);
        n.a(new b());
        h.a(new c());
        networkStatus.subscribe(new NetworkStateObserver.ConnectionListener() {
            public final void onConnectionUpdated(boolean z) {
                u.this.a(z);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2) {
        if (z2) {
            t();
        }
    }

    public int a(AdRequestType adrequesttype, AdObjectType adobjecttype, boolean z2) {
        return 1;
    }

    public abstract l a(r rVar, AdNetwork adNetwork, d0 d0Var);

    public abstract AdRequestType a(RequestParamsType requestparamstype);

    public void a(Activity activity, AppState appState) {
    }

    public void a(Configuration configuration) {
    }

    public final void a(g gVar) {
        this.l = gVar;
    }

    public final void a(String str) {
        this.m = str;
    }

    public abstract void a(JSONObject jSONObject);

    public boolean a() {
        return !(this instanceof Native.a);
    }

    public boolean a(AdNetwork adNetwork, JSONObject jSONObject, String str, boolean z2) {
        return false;
    }

    public boolean a(AdRequestType adrequesttype) {
        return !adrequesttype.f17078b.isEmpty();
    }

    public boolean a(AdRequestType adrequesttype, int i2) {
        return false;
    }

    public boolean a(AdRequestType adrequesttype, AdObjectType adobjecttype) {
        return adrequesttype.a(adobjecttype, this.l, this.f17435f);
    }

    public void b() {
        for (int i2 = 0; i2 < this.f17436g.size(); i2++) {
            AdRequestType adrequesttype = (r) this.f17436g.get(i2);
            if (!(adrequesttype == null || adrequesttype.E || adrequesttype == this.x || adrequesttype == this.y)) {
                adrequesttype.c();
            }
        }
    }

    public abstract void b(Context context);

    public final void c() {
        int availableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        this.f17431b = new ThreadPoolExecutor(availableProcessors, availableProcessors, 0, TimeUnit.MICROSECONDS, this.f17430a);
    }

    public final void c(Context context) {
        if (q4.f17048b) {
            this.u = true;
        } else {
            b(context);
        }
    }

    public final AdType d() {
        return this.f17435f;
    }

    public final void d(Context context) {
        r f2 = f();
        if (f2 != null && k()) {
            return;
        }
        if (f2 == null || f2.b() || this.j) {
            c(context);
        } else if (f2.u) {
            this.f17433d.g(f2, f2.s);
        }
    }

    public final g e() {
        g gVar = this.l;
        return gVar == null ? h.a(RewardedVideo.VIDEO_MODE_DEFAULT) : gVar;
    }

    public final AdRequestType f() {
        AdRequestType adrequesttype;
        if (this.f17436g.isEmpty()) {
            adrequesttype = null;
        } else {
            ArrayList arrayList = this.f17436g;
            adrequesttype = (r) arrayList.get(arrayList.size() - 1);
        }
        while (adrequesttype != null) {
            AdRequestType adrequesttype2 = adrequesttype.H;
            if (adrequesttype2 == null || adrequesttype2.t < adrequesttype.t) {
                break;
            }
            adrequesttype = adrequesttype2;
        }
        return adrequesttype;
    }

    public final i g() {
        return this.f17434e;
    }

    public final double h() {
        k.a aVar = n.c().f17273b;
        AdType adType = this.f17435f;
        JSONObject optJSONObject = aVar.f17277a.optJSONObject("price_floor");
        if (optJSONObject != null) {
            return optJSONObject.optDouble(m.a(adType), -1.0d);
        }
        return -1.0d;
    }

    public abstract String i();

    public final void j() {
        if (this.i && k()) {
            r f2 = f();
            if (f2 == null || (f2.b() && !f2.F)) {
                c(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext());
            }
        }
    }

    public boolean k() {
        return this.k;
    }

    public boolean l() {
        return !(this instanceof Native.a);
    }

    public final boolean m() {
        return this.f17437h;
    }

    public final boolean n() {
        return n.c().f17273b.a(this.f17435f);
    }

    public final boolean o() {
        return this.i;
    }

    public final boolean p() {
        return this.j;
    }

    public final void q() {
        if (!this.i) {
            return;
        }
        if (u() || (!this.w && k())) {
            this.w = true;
            this.u = false;
            s();
        }
    }

    public final Long r() {
        r f2 = f();
        return Long.valueOf(f2 != null ? f2.x().longValue() : -1);
    }

    public void s() {
        c(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext());
    }

    public void t() {
        if (this.v && k()) {
            this.v = false;
            c(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext());
        }
    }

    public boolean u() {
        return this.u;
    }

    public boolean v() {
        return !(this instanceof Native.a);
    }

    public class e {

        /* renamed from: a  reason: collision with root package name */
        public final AdRequestType f17444a;

        /* renamed from: b  reason: collision with root package name */
        public final String f17445b;

        public class a implements Runnable {
            public final void run() {
                TestActivity testActivity = q4.f17050d;
                testActivity.d();
                testActivity.b();
            }
        }

        public class b implements Runnable {
            public b() {
            }

            public final void run() {
                q4.k().a(u.this.f17435f);
            }
        }

        public class c implements NetworkInitializationListener {
            public final void onInitializationFailed(LoadingError loadingError) {
            }

            public final void onInitializationFinished(Object obj) {
            }
        }

        public e(AdRequestType adrequesttype, String str) {
            this.f17444a = adrequesttype;
            this.f17445b = str;
        }

        public final void a(LoadingError loadingError) {
            u.this.f17433d.b(this.f17444a, (l) null, (l2) null, loadingError);
        }

        public final void a(JSONObject jSONObject) {
            if (jSONObject == null) {
                try {
                    a(LoadingError.RequestError);
                } catch (Exception e2) {
                    Log.log(e2);
                    u.this.f17433d.b(this.f17444a, (l) null, (l2) null, LoadingError.InternalError);
                }
            } else {
                if (!u.this.f17437h) {
                    if (!jSONObject.optBoolean(this.f17445b)) {
                        if (!n.c().f17273b.a(u.this.f17435f)) {
                            if (jSONObject.has("ads")) {
                                if (jSONObject.has("main_id")) {
                                    u.this.o = System.currentTimeMillis();
                                    u.this.q = jSONObject.optInt("afd", 0);
                                    if (jSONObject.has("main_id")) {
                                        u.this.r = jSONObject.getString("main_id");
                                    }
                                    if (jSONObject.has("rri")) {
                                        u.this.s = jSONObject.optBoolean("rri");
                                    }
                                    if (jSONObject.has("waterfall_cache_timeout")) {
                                        u.this.p = Integer.valueOf(jSONObject.getInt("waterfall_cache_timeout"));
                                    }
                                    u.this.a(jSONObject);
                                    r0.c(jSONObject);
                                    u uVar = u.this;
                                    uVar.n = new com.appodeal.ads.waterfall_filter.a(jSONObject, uVar.f17435f);
                                    u.this.n.a((r) null);
                                    this.f17444a.a(u.this.n);
                                    AdRequestType adrequesttype = this.f17444a;
                                    adrequesttype.j = u.this.r;
                                    q4 q4Var = q4.f17047a;
                                    adrequesttype.k = Long.valueOf(n.c().f17272a);
                                    AdRequestType adrequesttype2 = this.f17444a;
                                    if (!adrequesttype2.f17084h) {
                                        u.this.b(adrequesttype2);
                                        return;
                                    } else if (!adrequesttype2.i || q4.f17050d == null) {
                                        h5.f16458a.post(new b());
                                        AdNetwork b2 = u.this.f17434e.b(Constants.DEBUG_INTERSTITIAL);
                                        if (b2 != null) {
                                            b2.initialize(com.appodeal.ads.context.b.f16327b, new d0(), new h(this.f17444a, j4.f16495a), new c());
                                            return;
                                        }
                                        return;
                                    } else {
                                        h5.f16458a.post(new a());
                                        return;
                                    }
                                }
                            }
                            if (jSONObject.has(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE)) {
                                u.this.a(LogConstants.EVENT_REQUEST_FAILED, jSONObject.getString(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE));
                            }
                            u.this.f17433d.b(this.f17444a, (l) null, (l2) null, LoadingError.RequestError);
                            return;
                        }
                    }
                }
                u uVar2 = u.this;
                uVar2.f17437h = true;
                uVar2.a(LogConstants.EVENT_REQUEST_FAILED, LogConstants.MSG_AD_TYPE_DISABLED);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: org.json.JSONObject} */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r4.f17078b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(com.appodeal.ads.r r4, com.appodeal.ads.l r5) {
        /*
            boolean r0 = r4.v()
            r1 = 0
            if (r0 == 0) goto L_0x001a
            java.util.ArrayList r0 = r4.f17078b
            if (r0 == 0) goto L_0x001a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x001a
            java.util.ArrayList r0 = r4.f17078b
            java.lang.Object r0 = r0.get(r1)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 != 0) goto L_0x0030
            java.util.ArrayList r2 = r4.f17077a
            if (r2 == 0) goto L_0x0030
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0030
            java.util.ArrayList r4 = r4.f17077a
            java.lang.Object r4 = r4.get(r1)
            r0 = r4
            org.json.JSONObject r0 = (org.json.JSONObject) r0
        L_0x0030:
            if (r0 == 0) goto L_0x0045
            r2 = 0
            java.lang.String r4 = "ecpm"
            double r2 = r0.optDouble(r4, r2)
            com.appodeal.ads.f5 r4 = r5.f16570c
            double r4 = r4.getEcpm()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0045
            r1 = 1
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.u.b(com.appodeal.ads.r, com.appodeal.ads.l):boolean");
    }

    public final synchronized void a(Context context) {
        if (!this.i) {
            try {
                com.appodeal.ads.utils.app.b.All.a((com.appodeal.ads.utils.app.a) this.C);
                this.f17434e.a(context);
                this.i = true;
                Log.log(this.f17435f.getDisplayName(), LogConstants.EVENT_INITIALIZE, "done");
            } catch (Exception e2) {
                Log.log(e2);
            }
        } else {
            return;
        }
        return;
    }

    public final void a(AdRequestType adrequesttype, int i2, boolean z2, boolean z3) {
        LoadingError loadingError;
        b0<AdObjectType, AdRequestType, ?> b0Var;
        l h2;
        AdRequestType adrequesttype2 = adrequesttype;
        boolean z4 = z2;
        boolean z5 = z3;
        if (!this.f17432c.isConnected()) {
            this.f17433d.b(adrequesttype2, (l) null, (l2) null, LoadingError.ConnectionError);
        } else if (adrequesttype2 != null && !a(adrequesttype, i2)) {
            JSONObject a2 = adrequesttype.a(i2, z2, z3);
            if (a2 == null) {
                this.f17433d.a(adrequesttype2, null, (f5) null, LoadingError.InternalError);
                return;
            }
            d0 a3 = d0.a(a2, z4);
            if (TextUtils.isEmpty(a3.getId())) {
                this.f17433d.a(adrequesttype2, null, LoadingError.IncorrectAdunit);
                return;
            }
            adrequesttype2.a(a3);
            try {
                if (!l() || (h2 = adrequesttype.h()) == null || Double.compare(h2.getEcpm(), a3.getEcpm()) < 0) {
                    JSONArray optJSONArray = a2.optJSONArray("target_placements");
                    boolean z6 = false;
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        int i3 = 0;
                        for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                            if (adrequesttype.i().containsKey(optJSONArray.optString(i4))) {
                                i3++;
                            }
                        }
                        if (i3 == optJSONArray.length()) {
                            b(adrequesttype);
                            return;
                        }
                    }
                    AdNetwork b2 = this.f17434e.b(a3.getStatus());
                    if (a(b2, a2, a3.getId(), z5)) {
                        adrequesttype2.b(a3);
                        return;
                    }
                    if (b2 != null) {
                        l a4 = a((r) adrequesttype2, b2, a3);
                        if (a4 != null) {
                            if (a()) {
                                a4.a(a2);
                            }
                            if (a(adrequesttype2, a4)) {
                                if (z4) {
                                    adrequesttype2.c(a4);
                                } else {
                                    adrequesttype2.b(a4);
                                }
                                b2.setLogging(q4.i() == Log.LogLevel.verbose);
                                adrequesttype2.a(a4);
                                v vVar = new v(this, adrequesttype, a4, a(adrequesttype2, a4, z4), a4, adrequesttype);
                                if (!z5 && !adrequesttype.t() && a4.isAsync()) {
                                    z6 = true;
                                }
                                if (z6) {
                                    this.f17431b.submit(vVar);
                                    if (adrequesttype.a() > 0) {
                                        b(adrequesttype);
                                    }
                                } else {
                                    h5.f16458a.post(vVar);
                                }
                                h5.a(new d(adrequesttype2, a4), (long) a4.getLoadingTimeout());
                                return;
                            }
                            this.f17433d.a(adrequesttype2, a4, (f5) a3, LoadingError.NoFill);
                            return;
                        }
                        b0Var = this.f17433d;
                        loadingError = LoadingError.AdTypeNotSupportedInAdapter;
                    } else {
                        b0Var = this.f17433d;
                        loadingError = LoadingError.AdapterNotFound;
                    }
                    b0Var.a(adrequesttype2, null, (f5) a3, loadingError);
                    return;
                }
                a(LogConstants.EVENT_LOAD_SKIPPED, (AdUnit) a3, (LoadingError) null);
                adrequesttype2.b(h2);
                adrequesttype2.b(a3);
                h2.b();
                this.f17433d.n(adrequesttype2, h2);
            } catch (Exception e2) {
                Log.log(e2);
                this.f17433d.a(adrequesttype2, null, (f5) a3, LoadingError.InternalError);
            }
        }
    }

    public final void b(AdRequestType adrequesttype) {
        if (a(adrequesttype)) {
            q4.k().a(this.f17435f);
            a(adrequesttype, 0, true, false);
        } else if (!adrequesttype.f17077a.isEmpty()) {
            q4.k().a(this.f17435f);
            a(adrequesttype, 0, false, false);
        } else {
            this.f17433d.b(adrequesttype, (l) null, (l2) null, LoadingError.NoFill);
        }
    }

    public final void a(String str, AdUnit adUnit, LoadingError loadingError) {
        String format;
        q4 q4Var = q4.f17047a;
        if (r0.f17088d != Log.LogLevel.none) {
            if (adUnit != null) {
                String id = adUnit.getId();
                if (!TextUtils.isEmpty(id) && TextUtils.getTrimmedLength(id) > 5) {
                    id = id.substring(0, 5) + APSSharedUtil.TRUNCATE_SEPARATOR;
                }
                if (loadingError == null) {
                    format = String.format(Locale.ENGLISH, "%s - eCPM: %.2f, precache: %s, expTime: %s, id: %s", new Object[]{n5.a(adUnit.getStatus()), Double.valueOf(adUnit.getEcpm()), Boolean.valueOf(adUnit.isPrecache()), Long.valueOf(adUnit.getExpTime()), id});
                } else {
                    format = String.format(Locale.ENGLISH, "%s - %s (%s) - eCPM: %.2f, precache: %s, expTime: %s, id: %s", new Object[]{n5.a(adUnit.getStatus()), loadingError.toString().toUpperCase(), Integer.valueOf(loadingError.getCode()), Double.valueOf(adUnit.getEcpm()), Boolean.valueOf(adUnit.isPrecache()), Long.valueOf(adUnit.getExpTime()), id});
                }
            } else if (loadingError == null) {
                format = null;
            } else {
                format = String.format("%s (%s)", new Object[]{loadingError.toString().toUpperCase(), Integer.valueOf(loadingError.getCode())});
            }
            a(str, format);
        }
    }

    public final void a(String str, String str2) {
        Log.log(this.f17435f.getDisplayName(), str, str2);
    }

    public void a(Context context, RequestParamsType requestparamstype) {
        q4.f17047a.getClass();
        a(LogConstants.EVENT_REQUEST_FAILED, String.format("paused: %s, disabled: %s, disabled by segment: %s", new Object[]{Boolean.valueOf(q4.p()), Boolean.valueOf(this.f17437h), Boolean.valueOf(n.c().f17273b.a(this.f17435f))}));
    }

    public final void b(Context context, RequestParamsType requestparamstype) {
        AdRequestType adrequesttype;
        r rVar;
        this.D = requestparamstype;
        try {
            if (!this.i) {
                a(LogConstants.EVENT_REQUEST_FAILED, LogConstants.MSG_NOT_INITIALIZED);
            } else if (!this.f17432c.isConnected()) {
                this.v = true;
                this.f17433d.b((r) null, (l) null, (l2) null, LoadingError.ConnectionError);
            } else {
                q4.f17047a.getClass();
                if (!q4.p() && !this.f17437h) {
                    if (!n.c().c().a(this.f17435f)) {
                        r f2 = f();
                        if (f2 == null) {
                            Boolean bool = Boolean.FALSE;
                            a(LogConstants.EVENT_CACHE, String.format("isDebug: %s, isLoaded: %s, isLoading: %s", new Object[]{Boolean.valueOf(requestparamstype.b()), bool, bool}));
                        } else {
                            a(LogConstants.EVENT_CACHE, String.format("isDebug: %s, isLoaded: %s, isLoading: %s", new Object[]{Boolean.valueOf(requestparamstype.b()), Boolean.valueOf(f2.p()), Boolean.valueOf(f2.u())}));
                            if (v()) {
                                o.b(f2.h());
                                o.a((Collection<? extends l>) f2.i().values());
                            }
                        }
                        adrequesttype = a(requestparamstype);
                        try {
                            this.f17436g.add(adrequesttype);
                            this.x = adrequesttype;
                            adrequesttype.z();
                            adrequesttype.b(this.r);
                            n.a(context);
                            adrequesttype.a(Long.valueOf(q4.l()));
                            if (!adrequesttype.q()) {
                                long j2 = this.o;
                                if (j2 != 0) {
                                    if (!r0.a(j2, this.p.intValue())) {
                                        com.appodeal.ads.waterfall_filter.a aVar = this.n;
                                        if (aVar != null) {
                                            String o2 = adrequesttype.o();
                                            if (!TextUtils.isEmpty(o2)) {
                                                if (!E) {
                                                    if (o2 == null) {
                                                        throw new AssertionError();
                                                    }
                                                }
                                                int size = this.f17436g.size() - 1;
                                                while (true) {
                                                    if (size < 0) {
                                                        break;
                                                    }
                                                    rVar = (r) this.f17436g.get(size);
                                                    if (rVar.B && o2.equals(rVar.j)) {
                                                        break;
                                                    }
                                                    size--;
                                                }
                                                aVar.a(rVar);
                                                adrequesttype.a(this.n);
                                            }
                                            rVar = null;
                                            aVar.a(rVar);
                                            adrequesttype.a(this.n);
                                        }
                                        this.j = false;
                                        b(adrequesttype);
                                        b();
                                        return;
                                    }
                                }
                            }
                            k0.a(context, (u<?, ?, ?>) this, (r<?>) adrequesttype, (s<?>) requestparamstype, (u<?, ?, ?>.e) new e(adrequesttype, i()));
                            b();
                            return;
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                            Log.log(e);
                            this.f17433d.b(adrequesttype, (l) null, (l2) null, LoadingError.InternalError);
                        }
                    }
                }
                a(context, requestparamstype);
            }
        } catch (Exception e3) {
            e = e3;
            adrequesttype = null;
            e.printStackTrace();
            Log.log(e);
            this.f17433d.b(adrequesttype, (l) null, (l2) null, LoadingError.InternalError);
        }
    }

    public final void a(AdRequestType adrequesttype, JSONObject jSONObject) {
        AdRequestType adrequesttype2;
        AdObjectType adobjecttype;
        if (jSONObject != null) {
            try {
                if (!adrequesttype.F && !adrequesttype.C && (adobjecttype = adrequesttype.s) != null) {
                    AdRequestType adrequesttype3 = adobjecttype.f16568a;
                    if (!adrequesttype3.F && !adrequesttype3.C) {
                        AdRequestType adrequesttype4 = this.x;
                        if (adrequesttype4 != null && adrequesttype4 == adrequesttype) {
                            if (jSONObject.has("ads")) {
                                if (jSONObject.has("main_id")) {
                                    adrequesttype2 = a(this.D);
                                    try {
                                        adrequesttype2.H = adrequesttype;
                                        this.f17436g.add(adrequesttype2);
                                        this.x = adrequesttype2;
                                        adrequesttype2.a(true, false);
                                        com.appodeal.ads.waterfall_filter.a aVar = new com.appodeal.ads.waterfall_filter.a(jSONObject, adrequesttype.n());
                                        aVar.a(adrequesttype);
                                        com.appodeal.ads.waterfall_filter.d dVar = aVar.f17628e;
                                        adrequesttype2.f17077a = dVar.f17636b;
                                        adrequesttype2.f17078b = dVar.f17635a;
                                        adrequesttype2.j = jSONObject.getString("main_id");
                                        adrequesttype2.k = Long.valueOf(n.c().f17272a);
                                        b(adrequesttype2);
                                        return;
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                }
                            }
                            if (jSONObject.has(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE)) {
                                a(LogConstants.EVENT_REQUEST_FAILED, jSONObject.getString(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE));
                            }
                            this.f17433d.a(adrequesttype);
                            a(LogConstants.EVENT_REQUEST_FAILED, "skip postbid request");
                            return;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                adrequesttype2 = null;
                Log.log(th);
                this.f17433d.b(adrequesttype2, (l) null, (l2) null, LoadingError.InternalError);
                return;
            }
        }
        this.f17433d.a(adrequesttype);
        a(LogConstants.EVENT_REQUEST_FAILED, "skip postbid request");
    }
}
