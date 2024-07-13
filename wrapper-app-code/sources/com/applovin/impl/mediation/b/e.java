package com.applovin.impl.mediation.b;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.c.c;
import com.applovin.impl.sdk.d.f;
import com.applovin.impl.sdk.d.g;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import com.appnext.core.a.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class e extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f14585a = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final String f14586e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final MaxAdFormat f14587f;

    /* renamed from: g  reason: collision with root package name */
    private final JSONObject f14588g;

    /* renamed from: h  reason: collision with root package name */
    private final List<com.applovin.impl.mediation.a.a> f14589h;
    /* access modifiers changed from: private */
    public final a.C0141a i;
    /* access modifiers changed from: private */
    public final WeakReference<Context> j;
    private long k;
    /* access modifiers changed from: private */
    public final List<MaxNetworkResponseInfo> l;

    private class a extends com.applovin.impl.sdk.e.a {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final long f14594e = SystemClock.elapsedRealtime();
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final int f14595f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final com.applovin.impl.mediation.a.a f14596g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public final List<com.applovin.impl.mediation.a.a> f14597h;

        a(int i, List<com.applovin.impl.mediation.a.a> list) {
            super(e.this.f15419c, e.this.f15418b);
            this.f14595f = i;
            this.f14596g = list.get(i);
            this.f14597h = list;
        }

        /* access modifiers changed from: private */
        public void a(com.applovin.impl.mediation.a.a aVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j, MaxError maxError) {
            MaxNetworkResponseInfo.AdLoadState adLoadState2 = adLoadState;
            e.this.l.add(new MaxNetworkResponseInfoImpl(adLoadState2, aVar.i(), new MaxMediatedNetworkInfoImpl(c.a(aVar.R(), this.f15418b)), j, maxError));
        }

        /* access modifiers changed from: private */
        public void a(String str) {
        }

        public void run() {
            v vVar = this.f15420d;
            if (v.a()) {
                v vVar2 = this.f15420d;
                String str = this.f15419c;
                vVar2.b(str, "Loading ad " + (this.f14595f + 1) + " of " + this.f14597h.size() + ": " + this.f14596g.S());
            }
            a("started to load ad");
            Context context = (Context) e.this.j.get();
            this.f15418b.H().loadThirdPartyMediatedAd(e.this.f14586e, this.f14596g, context instanceof Activity ? (Activity) context : this.f15418b.ar(), new com.applovin.impl.mediation.c.a(e.this.i) {
                public void onAdLoadFailed(String str, MaxError maxError) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.f14594e;
                    v unused = a.this.f15420d;
                    if (v.a()) {
                        v i = a.this.f15420d;
                        String h2 = a.this.f15419c;
                        i.b(h2, "Ad failed to load in " + elapsedRealtime + " ms with error: " + maxError);
                    }
                    a aVar = a.this;
                    aVar.a("failed to load ad: " + maxError.getCode());
                    a aVar2 = a.this;
                    aVar2.a(aVar2.f14596g, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                    if (a.this.f14595f < a.this.f14597h.size() - 1) {
                        a.this.f15418b.V().a((com.applovin.impl.sdk.e.a) new a(a.this.f14595f + 1, a.this.f14597h), c.a(e.this.f14587f));
                        return;
                    }
                    e.this.a((MaxError) new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }

                public void onAdLoaded(MaxAd maxAd) {
                    a.this.a("loaded ad");
                    long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.f14594e;
                    v unused = a.this.f15420d;
                    if (v.a()) {
                        v d2 = a.this.f15420d;
                        String c2 = a.this.f15419c;
                        d2.b(c2, "Ad loaded in " + elapsedRealtime + "ms");
                    }
                    com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
                    a.this.a(aVar, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, (MaxError) null);
                    int e2 = a.this.f14595f;
                    while (true) {
                        e2++;
                        if (e2 < a.this.f14597h.size()) {
                            a aVar2 = a.this;
                            aVar2.a((com.applovin.impl.mediation.a.a) aVar2.f14597h.get(e2), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1, (MaxError) null);
                        } else {
                            e.this.a(aVar);
                            return;
                        }
                    }
                }
            });
        }
    }

    e(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, JSONObject jSONObject, Context context, n nVar, a.C0141a aVar) {
        super("TaskProcessMediationWaterfall:" + str + ":" + maxAdFormat.getLabel(), nVar);
        this.f14586e = str;
        this.f14587f = maxAdFormat;
        this.f14588g = jSONObject;
        this.i = aVar;
        this.j = new WeakReference<>(context);
        this.f14589h = new ArrayList(jSONObject.length());
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ads", new JSONArray());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            this.f14589h.add(com.applovin.impl.mediation.a.a.a(map, JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null), jSONObject, nVar));
        }
        this.l = new ArrayList(this.f14589h.size());
    }

    /* access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        this.f15418b.J().a(aVar);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.k;
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.c(str, "Waterfall loaded in " + elapsedRealtime + "ms for " + aVar.S());
        }
        aVar.a((MaxAdWaterfallInfo) new MaxAdWaterfallInfoImpl(aVar, elapsedRealtime, this.l));
        k.a((MaxAdListener) this.i, (MaxAd) aVar);
    }

    /* access modifiers changed from: private */
    public void a(MaxError maxError) {
        g W;
        f fVar;
        if (maxError.getCode() == 204) {
            W = this.f15418b.W();
            fVar = f.r;
        } else if (maxError.getCode() == -5001) {
            W = this.f15418b.W();
            fVar = f.s;
        } else {
            W = this.f15418b.W();
            fVar = f.t;
        }
        W.a(fVar);
        ArrayList arrayList = new ArrayList(this.l.size());
        for (MaxNetworkResponseInfo next : this.l) {
            if (next.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======");
            sb.append("\n");
            int i2 = 0;
            while (i2 < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo = (MaxNetworkResponseInfo) arrayList.get(i2);
                i2++;
                sb.append(i2);
                sb.append(") ");
                sb.append(maxNetworkResponseInfo.getMediatedNetwork().getName());
                sb.append("\n");
                sb.append("..code: ");
                sb.append(maxNetworkResponseInfo.getError().getCode());
                sb.append("\n");
                sb.append("..message: ");
                sb.append(maxNetworkResponseInfo.getError().getMessage());
                sb.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.k;
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.c(str, "Waterfall failed in " + elapsedRealtime + "ms with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl((com.applovin.impl.mediation.a.a) null, JsonUtils.getString(this.f14588g, "waterfall_name", ""), JsonUtils.getString(this.f14588g, "waterfall_test_name", ""), elapsedRealtime, this.l));
        k.a((MaxAdListener) this.i, this.f14586e, maxError);
    }

    public void run() {
        this.k = SystemClock.elapsedRealtime();
        if (this.f14588g.optBoolean("is_testing", false) && !this.f15418b.N().a() && f14585a.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    Utils.showAlert("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", (Context) e.this.f15418b.ar());
                }
            });
        }
        if (this.f14589h.size() > 0) {
            v vVar = this.f15420d;
            if (v.a()) {
                v vVar2 = this.f15420d;
                String str = this.f15419c;
                vVar2.b(str, "Starting waterfall for " + this.f14589h.size() + " ad(s)...");
            }
            this.f15418b.V().a((com.applovin.impl.sdk.e.a) new a(0, this.f14589h));
            return;
        }
        v vVar3 = this.f15420d;
        if (v.a()) {
            this.f15420d.d(this.f15419c, "No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher(this.f14586e, this.f14587f, this.f14588g, this.f15418b);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f14588g, b.hW, new JSONObject());
        long j2 = JsonUtils.getLong(jSONObject, "alfdcs", 0);
        final MaxErrorImpl maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device.");
        if (j2 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(j2);
            AnonymousClass2 r5 = new Runnable() {
                public void run() {
                    e.this.a(maxErrorImpl);
                }
            };
            if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", false).booleanValue()) {
                com.applovin.impl.sdk.utils.f.a(millis, this.f15418b, r5);
            } else {
                AppLovinSdkUtils.runOnUiThreadDelayed(r5, millis);
            }
        } else {
            a((MaxError) maxErrorImpl);
        }
    }
}
