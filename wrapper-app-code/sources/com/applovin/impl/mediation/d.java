package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.b.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

public class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final n f14614a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, c> f14615b = CollectionUtils.map(4);

    /* renamed from: c  reason: collision with root package name */
    private final Object f14616c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, com.applovin.impl.mediation.a.a> f14617d = CollectionUtils.map(4);

    /* renamed from: e  reason: collision with root package name */
    private final Object f14618e = new Object();

    public enum a {
        PUBLISHER_INITIATED("publisher_initiated"),
        SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
        REFRESH("refresh"),
        EXPONENTIAL_RETRY("exponential_retry"),
        EXPIRED("expired"),
        NATIVE_AD_PLACER("native_ad_placer");
        

        /* renamed from: g  reason: collision with root package name */
        private final String f14634g;

        private a(String str) {
            this.f14634g = str;
        }

        public String a() {
            return this.f14634g;
        }
    }

    private static class b implements a.C0141a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final n f14635a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference<Context> f14636b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final d f14637c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final c f14638d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final MaxAdFormat f14639e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final Map<String, Object> f14640f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final Map<String, Object> f14641g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public final Map<String, Object> f14642h;
        private final int i;
        private long j;

        private b(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, c cVar, MaxAdFormat maxAdFormat, long j2, d dVar, n nVar, Context context) {
            this.f14635a = nVar;
            this.f14636b = new WeakReference<>(context);
            this.f14637c = dVar;
            this.f14638d = cVar;
            this.f14639e = maxAdFormat;
            this.f14641g = map2;
            this.f14640f = map;
            this.f14642h = map3;
            this.j = j2;
            this.i = CollectionUtils.getBoolean(map2, AppLovinSdkExtraParameterKey.DISABLE_AUTO_RETRIES) ? -1 : (!maxAdFormat.isAdViewAd() || !CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) ? ((Integer) nVar.a(com.applovin.impl.sdk.c.a.O)).intValue() : Math.min(2, ((Integer) nVar.a(com.applovin.impl.sdk.c.a.O)).intValue());
        }

        public void onAdClicked(MaxAd maxAd) {
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        public void onAdDisplayed(MaxAd maxAd) {
        }

        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        public void onAdLoadFailed(final String str, MaxError maxError) {
            if (!this.f14635a.a(com.applovin.impl.sdk.c.a.P, this.f14639e) || this.f14638d.f14648c >= this.i) {
                int unused = this.f14638d.f14648c = 0;
                this.f14638d.f14647b.set(false);
                if (this.f14638d.f14649d != null) {
                    MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError;
                    maxErrorImpl.setLoadTag(this.f14638d.f14646a);
                    maxErrorImpl.setRequestLatencyMillis(SystemClock.elapsedRealtime() - this.j);
                    k.a((MaxAdListener) this.f14638d.f14649d, str, maxError);
                    a.C0141a unused2 = this.f14638d.f14649d = null;
                    return;
                }
                return;
            }
            c.e(this.f14638d);
            final int pow = (int) Math.pow(2.0d, (double) this.f14638d.f14648c);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    b.this.f14641g.put("retry_delay_sec", Integer.valueOf(pow));
                    b.this.f14641g.put("retry_attempt", Integer.valueOf(b.this.f14638d.f14648c));
                    Context context = (Context) b.this.f14636b.get();
                    if (context == null) {
                        context = b.this.f14635a.P();
                    }
                    b.this.f14642h.put("art", a.EXPONENTIAL_RETRY.a());
                    b.this.f14642h.put("era", Integer.valueOf(b.this.f14638d.f14648c));
                    b.this.f14637c.a(str, b.this.f14639e, b.this.f14640f, b.this.f14641g, b.this.f14642h, context, b.this);
                }
            }, TimeUnit.SECONDS.toMillis((long) pow));
        }

        public void onAdLoaded(MaxAd maxAd) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
            aVar.a(this.f14638d.f14646a);
            aVar.a(SystemClock.elapsedRealtime() - this.j);
            int unused = this.f14638d.f14648c = 0;
            if (this.f14638d.f14649d != null) {
                aVar.g().e().a(this.f14638d.f14649d);
                this.f14638d.f14649d.onAdLoaded(aVar);
                if (aVar.d().endsWith("load")) {
                    this.f14638d.f14649d.onAdRevenuePaid(aVar);
                }
                a.C0141a unused2 = this.f14638d.f14649d = null;
                if ((this.f14635a.b(com.applovin.impl.sdk.c.a.N).contains(maxAd.getAdUnitId()) || this.f14635a.a(com.applovin.impl.sdk.c.a.M, maxAd.getFormat())) && !this.f14635a.N().a() && !this.f14635a.N().b()) {
                    Context context = (Context) this.f14636b.get();
                    if (context == null) {
                        context = this.f14635a.P();
                    }
                    this.j = SystemClock.elapsedRealtime();
                    this.f14642h.put("art", a.SEQUENTIAL_OR_PRECACHE.a());
                    this.f14637c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f14640f, this.f14641g, this.f14642h, context, this);
                    return;
                }
            } else {
                this.f14637c.a(aVar);
            }
            this.f14638d.f14647b.set(false);
        }

        public void onAdRequestStarted(String str) {
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
        }
    }

    private static class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f14646a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final AtomicBoolean f14647b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f14648c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public volatile a.C0141a f14649d;

        private c(String str) {
            this.f14647b = new AtomicBoolean();
            this.f14646a = str;
        }

        static /* synthetic */ int e(c cVar) {
            int i = cVar.f14648c;
            cVar.f14648c = i + 1;
            return i;
        }
    }

    public d(n nVar) {
        this.f14614a = nVar;
    }

    /* access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f14618e) {
            if (this.f14617d.containsKey(aVar.getAdUnitId())) {
                v.i("AppLovinSdk", "Ad in cache already: " + aVar.getAdUnitId());
            }
            this.f14617d.put(aVar.getAdUnitId(), aVar);
        }
    }

    /* access modifiers changed from: private */
    public void a(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, Context context, a.C0141a aVar) {
        final String str2 = str;
        final MaxAdFormat maxAdFormat2 = maxAdFormat;
        final Map<String, Object> map4 = map;
        final Map<String, Object> map5 = map2;
        final Map<String, Object> map6 = map3;
        final Context context2 = context;
        final a.C0141a aVar2 = aVar;
        this.f14614a.V().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.mediation.b.b(maxAdFormat, map, context, this.f14614a, new b.a() {
            public void a(JSONArray jSONArray) {
                d.this.f14614a.V().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.mediation.b.c(str2, maxAdFormat2, map4, map5, map6, jSONArray, context2, d.this.f14614a, aVar2));
            }
        }), com.applovin.impl.mediation.c.c.a(maxAdFormat));
    }

    private com.applovin.impl.mediation.a.a b(String str) {
        com.applovin.impl.mediation.a.a aVar;
        synchronized (this.f14618e) {
            aVar = this.f14617d.get(str);
            this.f14617d.remove(str);
        }
        return aVar;
    }

    private c b(String str, String str2) {
        c cVar;
        synchronized (this.f14616c) {
            String c2 = c(str, str2);
            cVar = this.f14615b.get(c2);
            if (cVar == null) {
                cVar = new c(str2);
                this.f14615b.put(c2, cVar);
            }
        }
        return cVar;
    }

    private String c(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            str3 = "-" + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }

    public void a(String str, String str2) {
        synchronized (this.f14616c) {
            this.f14615b.remove(c(str, str2));
        }
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, a aVar, Map<String, Object> map, Map<String, Object> map2, Context context, a.C0141a aVar2) {
        String str3 = str2;
        a.C0141a aVar3 = aVar2;
        com.applovin.impl.mediation.a.a b2 = (this.f14614a.N().b() || Utils.isDspDemoApp(this.f14614a.P())) ? null : b(str);
        if (b2 != null) {
            b2.a(str3);
            b2.g().e().a(aVar3);
            aVar3.onAdLoaded(b2);
            if (b2.d().endsWith("load")) {
                aVar3.onAdRevenuePaid(b2);
            }
        }
        c b3 = b(str, str2);
        if (b3.f14647b.compareAndSet(false, true)) {
            if (b2 == null) {
                a.C0141a unused = b3.f14649d = aVar3;
            }
            Map synchronizedMap = Collections.synchronizedMap(CollectionUtils.map());
            synchronizedMap.put("art", aVar.a());
            if (StringUtils.isValidString(str2)) {
                synchronizedMap.put("alt", str3);
            }
            a(str, maxAdFormat, map, map2, synchronizedMap, context, new b(map, map2, synchronizedMap, b3, maxAdFormat, SystemClock.elapsedRealtime(), this, this.f14614a, context));
            return;
        }
        if (!(b3.f14649d == null || b3.f14649d == aVar3)) {
            v.h("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
        }
        a.C0141a unused2 = b3.f14649d = aVar3;
    }

    public boolean a(String str) {
        boolean z;
        synchronized (this.f14618e) {
            z = this.f14617d.get(str) != null;
        }
        return z;
    }
}
