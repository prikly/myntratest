package com.ironsource.mediationsdk.adunit.d.a;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C0884f;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.c.a.b;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.b.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.f;
import com.ironsource.mediationsdk.utils.n;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class c<Listener extends b> implements AdapterAdListener, NetworkInitializationListener, com.ironsource.mediationsdk.adunit.b.c, c.a, n.a {

    /* renamed from: a  reason: collision with root package name */
    protected com.ironsource.mediationsdk.adunit.d.a f8533a;

    /* renamed from: b  reason: collision with root package name */
    protected Listener f8534b;

    /* renamed from: c  reason: collision with root package name */
    protected d f8535c;

    /* renamed from: d  reason: collision with root package name */
    protected a f8536d;

    /* renamed from: e  reason: collision with root package name */
    protected Placement f8537e;

    /* renamed from: f  reason: collision with root package name */
    protected AdData f8538f;

    /* renamed from: g  reason: collision with root package name */
    private BaseAdAdapter<?, AdapterAdListener> f8539g;

    /* renamed from: h  reason: collision with root package name */
    private com.ironsource.mediationsdk.model.a f8540h;
    private JSONObject i;
    private String j;
    private Long k;
    private f l;
    private com.ironsource.mediationsdk.b.c m = new com.ironsource.mediationsdk.b.c((long) (this.f8533a.f8526d * 1000));

    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    public c(com.ironsource.mediationsdk.adunit.d.a aVar, BaseAdAdapter<?, ?> baseAdAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        this.f8533a = aVar;
        this.f8534b = listener;
        this.f8535c = new d(aVar.f8523a, d.b.PROVIDER, this);
        this.f8540h = aVar2;
        this.i = aVar2.f8726b;
        this.f8539g = baseAdAdapter;
        a(a.NONE);
    }

    private boolean a() {
        return this.f8536d == a.INIT_IN_PROGRESS;
    }

    public final Map<String, Object> a(com.ironsource.mediationsdk.adunit.b.b bVar) {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put("providerAdapterVersion", this.f8539g != null ? this.f8539g.getNetworkAdapter().getAdapterVersion() : str);
            if (this.f8539g != null) {
                str = this.f8539g.getNetworkAdapter().getNetworkSDKVersion();
            }
            hashMap.put("providerSDKVersion", str);
        } catch (Exception unused) {
            IronLog.INTERNAL.error(c("could not get adapter version for event data" + l()));
        }
        hashMap.put("spId", this.f8540h.f8725a.getSubProviderId());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f8540h.f8725a.getAdSourceNameForEvents());
        boolean z = true;
        hashMap.put("instanceType", Integer.valueOf(h() ? 2 : 1));
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.j)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.j);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f8533a.f8527e));
        if (this.f8533a.f8528f != null && this.f8533a.f8528f.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f8533a.f8528f);
        }
        if (!TextUtils.isEmpty(this.f8533a.f8529g)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f8533a.f8529g);
        }
        if (!(bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD || bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_SUCCESS || bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED || bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED_WITH_REASON || bVar == com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_NO_FILL || bVar == com.ironsource.mediationsdk.adunit.b.b.AD_OPENED || bVar == com.ironsource.mediationsdk.adunit.b.b.AD_CLOSED || bVar == com.ironsource.mediationsdk.adunit.b.b.SHOW_AD || bVar == com.ironsource.mediationsdk.adunit.b.b.SHOW_AD_FAILED || bVar == com.ironsource.mediationsdk.adunit.b.b.AD_CLICKED || bVar == com.ironsource.mediationsdk.adunit.b.b.AD_REWARDED)) {
            z = false;
        }
        if (z) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f8533a.f8530h));
            if (!TextUtils.isEmpty(this.f8533a.i)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f8533a.i);
            }
        }
        if (!TextUtils.isEmpty(this.f8533a.f8525c.getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f8533a.f8525c.getCustomNetwork());
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final void a(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("to " + aVar));
        this.f8536d = aVar;
    }

    public final void a(String str) {
        try {
            IronLog.INTERNAL.verbose(c(""));
            this.f8535c.f8471b.a(false);
            this.k = null;
            this.l = new f();
            HashMap hashMap = new HashMap();
            hashMap.put(DataKeys.USER_ID, this.f8533a.f8524b);
            hashMap.putAll(com.ironsource.mediationsdk.c.b.a(this.i));
            this.f8538f = new AdData(str, hashMap);
            a(a.INIT_IN_PROGRESS);
            this.m.a(this);
            AdapterBaseInterface networkAdapter = this.f8539g.getNetworkAdapter();
            if (networkAdapter != null) {
                networkAdapter.init(this.f8538f, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str2 = "loadAd - network adapter not available " + l();
            IronLog.INTERNAL.error(c(str2));
            this.f8535c.f8474e.a(str2);
            onInitFailed(com.ironsource.mediationsdk.adunit.a.a.a(this.f8533a.f8523a), str2);
        } catch (Throwable th) {
            String str3 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(c(str3));
            d dVar = this.f8535c;
            if (dVar != null) {
                dVar.f8474e.l(str3);
            }
            onInitFailed(com.ironsource.mediationsdk.adunit.a.a.a(this.f8533a.f8523a), str3);
        }
    }

    public final void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("state = " + this.f8536d + ", isBidder = " + h()));
        long a2 = f.a(this.l);
        if (c()) {
            a(a.FAILED);
            d dVar = this.f8535c;
            if (dVar != null) {
                dVar.f8471b.a(a2, (int) IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out");
                this.f8535c.f8471b.b(a2, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out");
            }
            Listener listener = this.f8534b;
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("timed out");
            f.a(this.l);
            listener.a(buildLoadFailedError, this);
            return;
        }
        String format = String.format("unexpected timeout for %s, state - %s, error - %s", new Object[]{l(), this.f8536d, Integer.valueOf(IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)});
        d dVar2 = this.f8535c;
        if (dVar2 != null) {
            dVar2.f8474e.k(format);
        }
    }

    public final void b(String str) {
        C0884f.a();
        this.j = C0884f.d(str);
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        String str2 = this.f8533a.f8523a.name() + " - " + l() + " - state = " + this.f8536d;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    public final boolean c() {
        return this.f8536d == a.INIT_IN_PROGRESS || this.f8536d == a.LOADING;
    }

    public final boolean d() {
        return this.f8536d == a.LOADED;
    }

    public final boolean e() {
        return this.f8536d != a.FAILED;
    }

    public final void f() {
        IronLog.INTERNAL.verbose(c(""));
        d dVar = this.f8535c;
        if (dVar != null) {
            dVar.f8473d.a();
        }
    }

    public final Long g() {
        return this.k;
    }

    public final boolean h() {
        return this.f8540h.f8727c;
    }

    public final int i() {
        return this.f8540h.f8728d;
    }

    public final int j() {
        return this.f8540h.f8729e;
    }

    public final String k() {
        return this.f8540h.f8725a.getProviderName();
    }

    public final String l() {
        return String.format("%s %s", new Object[]{k(), Integer.valueOf(hashCode())});
    }

    public final String m() {
        return this.f8540h.f8725a.getProviderTypeForReflection();
    }

    public final String n() {
        return this.f8533a.f8529g;
    }

    public final void o() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f8539g;
        if (baseAdAdapter != null) {
            try {
                baseAdAdapter.releaseMemory();
                this.f8539g = null;
            } catch (Exception e2) {
                String str = "Exception while calling adapter.releaseMemory() from " + this.f8540h.f8725a.getProviderName() + " - " + e2.getLocalizedMessage();
                IronLog.INTERNAL.error(c(str));
                this.f8535c.f8474e.l(str);
            }
        }
        d dVar = this.f8535c;
        if (dVar != null) {
            dVar.a();
            this.f8535c = null;
        }
        com.ironsource.mediationsdk.b.c cVar = this.m;
        if (cVar != null) {
            cVar.c();
            this.m = null;
        }
    }

    public void onAdClicked() {
        IronLog.INTERNAL.verbose(c(""));
        d dVar = this.f8535c;
        if (dVar != null) {
            dVar.f8473d.d(q());
        }
        this.f8534b.b(this);
    }

    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i2, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("error = " + i2 + ", " + str));
        com.ironsource.mediationsdk.b.c cVar = this.m;
        if (cVar != null) {
            cVar.d();
        }
        if (this.f8536d == a.LOADING) {
            long a2 = f.a(this.l);
            if (this.f8535c != null) {
                if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                    this.f8535c.f8471b.a(a2, i2);
                } else {
                    if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                        this.k = Long.valueOf(System.currentTimeMillis());
                    }
                    this.f8535c.f8471b.a(a2, i2, str);
                    this.f8535c.f8471b.b(a2, i2, str);
                }
            }
            a(a.FAILED);
            this.f8534b.a(new IronSourceError(i2, str), this);
        }
        if (this.f8536d != a.FAILED) {
            String format = String.format("unexpected load failed for %s, state - %s, error - %s, %s", new Object[]{l(), this.f8536d, Integer.valueOf(i2), str});
            d dVar = this.f8535c;
            if (dVar != null) {
                dVar.f8474e.j(format);
            }
        }
    }

    public void onAdLoadSuccess() {
        IronLog.INTERNAL.verbose(c(""));
        com.ironsource.mediationsdk.b.c cVar = this.m;
        if (cVar != null) {
            cVar.d();
        }
        if (this.f8536d == a.LOADING) {
            long a2 = f.a(this.l);
            d dVar = this.f8535c;
            if (dVar != null) {
                dVar.f8471b.a(a2, false);
            }
            a(a.LOADED);
            this.f8534b.a(this);
        } else if (this.f8536d != a.FAILED) {
            String format = String.format("unexpected load success for %s, state - %s", new Object[]{l(), this.f8536d});
            d dVar2 = this.f8535c;
            if (dVar2 != null) {
                dVar2.f8474e.i(format);
            }
        }
    }

    public void onInitFailed(int i2, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("error = " + i2 + ", " + str));
        if (a()) {
            com.ironsource.mediationsdk.b.c cVar = this.m;
            if (cVar != null) {
                cVar.d();
            }
            a(a.FAILED);
            Listener listener = this.f8534b;
            IronSourceError ironSourceError = new IronSourceError(i2, str);
            f.a(this.l);
            listener.a(ironSourceError, this);
        } else if (this.f8536d != a.FAILED) {
            String format = String.format("unexpected init failed for %s, state - %s, error - %s, %s", new Object[]{l(), this.f8536d, Integer.valueOf(i2), str});
            d dVar = this.f8535c;
            if (dVar != null) {
                dVar.f8474e.f(format);
            }
        }
    }

    public void onInitSuccess() {
        IronLog.INTERNAL.verbose(c(""));
        if (a()) {
            com.ironsource.mediationsdk.b.c cVar = this.m;
            if (cVar != null) {
                cVar.d();
            }
            a(a.READY_TO_LOAD);
            IronLog.INTERNAL.verbose(c(""));
            a(a.LOADING);
            try {
                this.m.a(this);
                this.f8539g.loadAd(this.f8538f, ContextProvider.getInstance().getCurrentActiveActivity(), this);
            } catch (Throwable th) {
                String str = "unexpected error while calling adapter.loadAd() - " + th.getLocalizedMessage();
                IronLog.INTERNAL.error(c(str));
                d dVar = this.f8535c;
                if (dVar != null) {
                    dVar.f8474e.l(str);
                }
                onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, str);
            }
        } else if (this.f8536d != a.FAILED) {
            String format = String.format("unexpected init success for %s, state - %s", new Object[]{l(), this.f8536d});
            d dVar2 = this.f8535c;
            if (dVar2 != null) {
                dVar2.f8474e.e(format);
            }
        }
    }

    public final boolean p() {
        return this.f8536d == a.SHOWING;
    }

    /* access modifiers changed from: protected */
    public final String q() {
        Placement placement = this.f8537e;
        return placement == null ? "" : placement.getPlacementName();
    }
}
