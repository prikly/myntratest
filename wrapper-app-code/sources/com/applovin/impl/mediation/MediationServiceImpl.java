package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.a.c;
import com.applovin.impl.mediation.a.e;
import com.applovin.impl.mediation.a.g;
import com.applovin.impl.mediation.a.h;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.b.d;
import com.applovin.impl.mediation.b.g;
import com.applovin.impl.mediation.d;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.d.f;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.sdk.AppLovinSdkUtils;
import com.appodeal.ads.modules.common.internal.Constants;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final n f14382a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final v f14383b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<JSONObject> f14384c = new AtomicReference<>();

    public class a implements a.C0141a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

        /* renamed from: b  reason: collision with root package name */
        private final com.applovin.impl.mediation.a.a f14419b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public a.C0141a f14420c;

        public a(com.applovin.impl.mediation.a.a aVar, a.C0141a aVar2) {
            this.f14419b = aVar;
            this.f14420c = aVar2;
        }

        public void a(a.C0141a aVar) {
            this.f14420c = aVar;
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.f14419b.v();
            this.f14419b.a(bundle);
            MediationServiceImpl.this.a(this.f14419b);
            k.a((MaxAdListener) this.f14420c, maxAd);
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            v unused = MediationServiceImpl.this.f14383b;
            if (v.a()) {
                MediationServiceImpl.this.f14383b.b("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f14419b, this.f14420c);
            MediationServiceImpl.this.f14382a.W().a(f.f15399c);
            MediationServiceImpl.this.f14382a.W().a(f.f15402f);
            this.f14419b.a(bundle);
            if (maxAd.getFormat().isFullscreenAd()) {
                c cVar = (c) maxAd;
                if (cVar.N()) {
                    MediationServiceImpl.this.f14382a.aj().a(this.f14419b, "DID_DISPLAY");
                    MediationServiceImpl.this.f14382a.ah().a((Object) this.f14419b);
                } else {
                    v unused2 = MediationServiceImpl.this.f14383b;
                    if (v.a()) {
                        v b2 = MediationServiceImpl.this.f14383b;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Received ad display callback before attempting show");
                        sb.append(cVar.m() != null ? " for hybrid ad" : "");
                        b2.d("MediationService", sb.toString());
                        return;
                    }
                    return;
                }
            } else {
                MediationServiceImpl.this.f14382a.aj().a(this.f14419b, "DID_DISPLAY");
            }
            k.b((MaxAdListener) this.f14420c, maxAd);
        }

        public void c(final MaxAd maxAd, Bundle bundle) {
            if (bundle != null && bundle.size() > 0) {
                ((com.applovin.impl.mediation.a.a) maxAd).a(BundleUtils.toJSONObject(bundle.getBundle(Utils.KEY_AD_VALUES)));
            }
            MediationServiceImpl.this.f14382a.aj().a((com.applovin.impl.mediation.a.a) maxAd, "DID_HIDE");
            long j = 0;
            if (maxAd instanceof c) {
                j = ((c) maxAd).F();
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    if (maxAd.getFormat().isFullscreenAd()) {
                        MediationServiceImpl.this.f14382a.ah().b((Object) maxAd);
                    }
                    k.c(a.this.f14420c, maxAd);
                }
            }, j);
        }

        public void d(MaxAd maxAd, Bundle bundle) {
            if (bundle != null && bundle.size() > 0) {
                ((com.applovin.impl.mediation.a.a) maxAd).a(BundleUtils.toJSONObject(bundle.getBundle(Utils.KEY_AD_VALUES)));
            }
            MediationServiceImpl.this.a(this.f14419b, this.f14420c);
            k.d(this.f14420c, maxAd);
        }

        public void onAdClicked(MaxAd maxAd) {
            d(maxAd, (Bundle) null);
        }

        public void onAdCollapsed(MaxAd maxAd) {
            k.h(this.f14420c, maxAd);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            MediationServiceImpl.this.b(this.f14419b, maxError, this.f14420c);
            if ((maxAd.getFormat() == MaxAdFormat.REWARDED || maxAd.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) && (maxAd instanceof c)) {
                ((c) maxAd).K();
            }
        }

        public void onAdDisplayed(MaxAd maxAd) {
            b(maxAd, (Bundle) null);
        }

        public void onAdExpanded(MaxAd maxAd) {
            k.g(this.f14420c, maxAd);
        }

        public void onAdHidden(MaxAd maxAd) {
            c(maxAd, (Bundle) null);
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f14419b.v();
            MediationServiceImpl.this.a(this.f14419b, maxError, (MaxAdListener) this.f14420c);
        }

        public void onAdLoaded(MaxAd maxAd) {
            a(maxAd, (Bundle) null);
        }

        public void onAdRequestStarted(String str) {
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        public void onRewardedVideoCompleted(MaxAd maxAd) {
            k.f(this.f14420c, maxAd);
        }

        public void onRewardedVideoStarted(MaxAd maxAd) {
            k.e(this.f14420c, maxAd);
        }

        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            k.a((MaxAdListener) this.f14420c, maxAd, maxReward);
            MediationServiceImpl.this.f14382a.V().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.mediation.b.f((c) maxAd, MediationServiceImpl.this.f14382a), o.a.MEDIATION_REWARD);
        }
    }

    public MediationServiceImpl(n nVar) {
        this.f14382a = nVar;
        this.f14383b = nVar.D();
        nVar.am().registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    private g a(c cVar) {
        g g2 = cVar.g();
        if (g2 != null) {
            return g2;
        }
        this.f14382a.ah().a(false);
        if (v.a()) {
            v vVar = this.f14383b;
            vVar.d("MediationService", "Failed to show " + cVar + ": adapter not found");
        }
        v.i("MediationService", "There may be an integration problem with the adapter for ad unit id '" + cVar.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    /* access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        this.f14382a.aj().a(aVar, "DID_LOAD");
        if (aVar.d().endsWith("load")) {
            this.f14382a.aj().a(aVar);
        }
        long s = aVar.s();
        Map map = CollectionUtils.map(1);
        map.put("{LOAD_TIME_MS}", String.valueOf(s));
        a("load", (Map<String, String>) map, (com.applovin.impl.mediation.a.f) aVar);
    }

    /* access modifiers changed from: private */
    public void a(final com.applovin.impl.mediation.a.a aVar, final a.C0141a aVar2) {
        AnonymousClass8 r0 = new Runnable() {
            public void run() {
                MediationServiceImpl.this.f14382a.aj().a(aVar, "DID_CLICKED");
                MediationServiceImpl.this.f14382a.aj().a(aVar, "DID_CLICK");
                if (aVar.d().endsWith(Constants.CLICK)) {
                    MediationServiceImpl.this.f14382a.aj().a(aVar);
                    k.a((MaxAdRevenueListener) aVar2, (MaxAd) aVar);
                }
                Map map = CollectionUtils.map(1);
                String emptyIfNull = StringUtils.emptyIfNull(MediationServiceImpl.this.f14382a.n());
                if (!((Boolean) MediationServiceImpl.this.f14382a.a(b.dF)).booleanValue()) {
                    emptyIfNull = "";
                }
                map.put("{CUID}", emptyIfNull);
                MediationServiceImpl.this.a("mclick", (Map<String, String>) map, (com.applovin.impl.mediation.a.f) aVar);
            }
        };
        if (((Boolean) this.f14382a.a(com.applovin.impl.sdk.c.a.V)).booleanValue()) {
            this.f14382a.V().a((com.applovin.impl.sdk.e.a) new z(this.f14382a, r0), o.a.MEDIATION_POSTBACKS);
        } else {
            r0.run();
        }
    }

    /* access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, aVar);
        destroyAd(aVar);
        k.a(maxAdListener, aVar.getAdUnitId(), maxError);
    }

    /* access modifiers changed from: private */
    public void a(c cVar, a.C0141a aVar) {
        this.f14382a.ah().a(false);
        a(cVar, (MaxAdListener) aVar);
        if (v.a()) {
            this.f14383b.b("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpressionPostback(cVar, aVar);
        if (cVar.m() != null && cVar.w().get()) {
            if (v.a()) {
                this.f14383b.b("MediationService", "Running ad displayed logic");
            }
            this.f14382a.aj().a((com.applovin.impl.mediation.a.a) cVar, "DID_DISPLAY");
            this.f14382a.ah().a((Object) cVar);
            k.b((MaxAdListener) aVar, (MaxAd) cVar, true);
        }
    }

    private void a(c cVar, MaxAdListener maxAdListener) {
        long longValue = ((Long) this.f14382a.a(com.applovin.impl.sdk.c.a.G)).longValue();
        if (longValue > 0) {
            final c cVar2 = cVar;
            final long j = longValue;
            final MaxAdListener maxAdListener2 = maxAdListener;
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    if (!cVar2.w().get()) {
                        String str = "Ad (" + cVar2.T() + ") has not been displayed after " + j + "ms. Failing ad display...";
                        v.i("MediationService", str);
                        MediationServiceImpl.this.b(cVar2, new MaxErrorImpl(-1, str), maxAdListener2);
                        MediationServiceImpl.this.f14382a.ah().b((Object) cVar2);
                    }
                }
            }, longValue);
        }
    }

    private void a(MaxError maxError, com.applovin.impl.mediation.a.a aVar) {
        long s = aVar.s();
        Map map = CollectionUtils.map(1);
        map.put("{LOAD_TIME_MS}", String.valueOf(s));
        a("mlerr", (Map<String, String>) map, maxError, (com.applovin.impl.mediation.a.f) aVar);
    }

    /* access modifiers changed from: private */
    public void a(String str, h hVar, g gVar) {
        Map map = CollectionUtils.map(2);
        Utils.putObjectForStringIfValid("{ADAPTER_VERSION}", gVar.i(), map);
        Utils.putObjectForStringIfValid("{SDK_VERSION}", gVar.h(), map);
        a("serr", (Map<String, String>) map, (MaxError) new MaxErrorImpl(str), (com.applovin.impl.mediation.a.f) hVar);
    }

    /* access modifiers changed from: private */
    public void a(String str, Map<String, String> map, com.applovin.impl.mediation.a.f fVar) {
        a(str, map, (MaxError) null, fVar);
    }

    private void a(String str, Map<String, String> map, MaxError maxError, com.applovin.impl.mediation.a.f fVar) {
        Map<String, String> map2 = CollectionUtils.map(map);
        map2.put("{PLACEMENT}", StringUtils.emptyIfNull(fVar.getPlacement()));
        map2.put("{CUSTOM_DATA}", StringUtils.emptyIfNull(fVar.ag()));
        if (fVar instanceof com.applovin.impl.mediation.a.a) {
            map2.put("{CREATIVE_ID}", StringUtils.emptyIfNull(((com.applovin.impl.mediation.a.a) fVar).getCreativeId()));
        }
        this.f14382a.V().a((com.applovin.impl.sdk.e.a) new d(str, map2, maxError, fVar, this.f14382a), o.a.MEDIATION_POSTBACKS);
    }

    /* access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        if (aVar.m() == null) {
            this.f14382a.aj().a(aVar, "DID_FAIL_DISPLAY");
            processAdDisplayErrorPostback(maxError, aVar);
            if (aVar.w().compareAndSet(false, true)) {
                k.a(maxAdListener, (MaxAd) aVar, maxError);
            }
        } else if (v.a()) {
            this.f14383b.e("MediationService", "Ignoring ad display failure for hybrid ad...");
        }
    }

    /* access modifiers changed from: private */
    public void b(c cVar) {
        if (cVar.getFormat() == MaxAdFormat.REWARDED || cVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            this.f14382a.V().a((com.applovin.impl.sdk.e.a) new g(cVar, this.f14382a), o.a.MEDIATION_REWARD);
        }
    }

    public void collectSignal(MaxAdFormat maxAdFormat, final h hVar, Context context, final g.a aVar) {
        String str;
        v vVar;
        String str2;
        StringBuilder sb;
        if (hVar == null) {
            throw new IllegalArgumentException("No spec specified");
        } else if (context == null) {
            throw new IllegalArgumentException("No context specified");
        } else if (aVar != null) {
            final g a2 = this.f14382a.F().a(hVar, hVar.b());
            if (a2 != null) {
                Activity ar = context instanceof Activity ? (Activity) context : this.f14382a.ar();
                MaxAdapterParametersImpl a3 = MaxAdapterParametersImpl.a(hVar, maxAdFormat);
                if (((Boolean) this.f14382a.a(com.applovin.impl.sdk.c.a.R)).booleanValue()) {
                    this.f14382a.G().a((com.applovin.impl.mediation.a.f) hVar, ar);
                }
                AnonymousClass3 r1 = new MaxSignalCollectionListener() {
                    public void onSignalCollected(String str) {
                        aVar.a(com.applovin.impl.mediation.a.g.a(hVar, a2, str));
                        a2.j();
                    }

                    public void onSignalCollectionFailed(String str) {
                        MediationServiceImpl.this.a(str, hVar, a2);
                        aVar.a(com.applovin.impl.mediation.a.g.b(hVar, a2, str));
                        a2.j();
                    }
                };
                if (!hVar.a()) {
                    if (v.a()) {
                        vVar = this.f14383b;
                        sb = new StringBuilder();
                        str2 = "Collecting signal for adapter: ";
                    }
                    a2.a((MaxAdapterSignalCollectionParameters) a3, hVar, ar, (MaxSignalCollectionListener) r1);
                    return;
                } else if (this.f14382a.G().a((com.applovin.impl.mediation.a.f) hVar)) {
                    if (v.a()) {
                        vVar = this.f14383b;
                        sb = new StringBuilder();
                        str2 = "Collecting signal for now-initialized adapter: ";
                    }
                    a2.a((MaxAdapterSignalCollectionParameters) a3, hVar, ar, (MaxSignalCollectionListener) r1);
                    return;
                } else {
                    if (v.a()) {
                        v vVar2 = this.f14383b;
                        vVar2.e("MediationService", "Skip collecting signal for not-initialized adapter: " + a2.d());
                    }
                    str = "Adapter not initialized yet";
                }
                sb.append(str2);
                sb.append(a2.d());
                vVar.b("MediationService", sb.toString());
                a2.a((MaxAdapterSignalCollectionParameters) a3, hVar, ar, (MaxSignalCollectionListener) r1);
                return;
            }
            str = "Could not load adapter";
            aVar.a(com.applovin.impl.mediation.a.g.a(hVar, str));
        } else {
            throw new IllegalArgumentException("No callback specified");
        }
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof com.applovin.impl.mediation.a.a) {
            if (v.a()) {
                v vVar = this.f14383b;
                vVar.c("MediationService", "Destroying " + maxAd);
            }
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
            g g2 = aVar.g();
            if (g2 != null) {
                g2.j();
                aVar.y();
            }
            this.f14382a.E().b(aVar.f());
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return this.f14384c.getAndSet((Object) null);
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, d.a aVar, Map<String, Object> map, Map<String, Object> map2, Context context, a.C0141a aVar2) {
        String str3 = str;
        a.C0141a aVar3 = aVar2;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No ad unit ID specified");
        } else if (context == null) {
            throw new IllegalArgumentException("No context specified");
        } else if (aVar3 != null) {
            if (TextUtils.isEmpty(this.f14382a.u())) {
                v.i("AppLovinSdk", "Mediation provider is null. Please set AppLovin SDK mediation provider via AppLovinSdk.getInstance(context).setMediationProvider()");
            }
            if (!this.f14382a.d()) {
                v.h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
            }
            this.f14382a.a();
            if (str.length() != 16 && !str.startsWith("test_mode") && !this.f14382a.C().startsWith("05TMD")) {
                v.i("MediationService", "Please double-check the ad unit " + str + " for " + maxAdFormat.getLabel() + " : " + Log.getStackTraceString(new Throwable("")));
            }
            MaxAdFormat maxAdFormat2 = maxAdFormat;
            if (this.f14382a.a(maxAdFormat)) {
                v.i("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
                k.a((MaxAdListener) aVar3, str, (MaxError) new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
                return;
            }
            k.a((MaxAdRequestListener) aVar3, str, true);
            this.f14382a.M().a(str, str2, maxAdFormat, aVar, map, map2, context, aVar2);
        } else {
            throw new IllegalArgumentException("No listener specified");
        }
    }

    public void loadThirdPartyMediatedAd(String str, com.applovin.impl.mediation.a.a aVar, Activity activity, a.C0141a aVar2) {
        if (aVar != null) {
            if (v.a()) {
                this.f14383b.b("MediationService", "Loading " + aVar + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.f14382a.aj().a(aVar, "WILL_LOAD");
            g a2 = this.f14382a.F().a((com.applovin.impl.mediation.a.f) aVar);
            if (a2 != null) {
                MaxAdapterParametersImpl a3 = MaxAdapterParametersImpl.a(aVar);
                if (((Boolean) this.f14382a.a(com.applovin.impl.sdk.c.a.S)).booleanValue()) {
                    this.f14382a.G().a((com.applovin.impl.mediation.a.f) aVar, activity);
                }
                com.applovin.impl.mediation.a.a a4 = aVar.a(a2);
                a2.a(str, a4);
                a4.t();
                a2.a(str, a3, a4, activity, new a(a4, aVar2));
                return;
            }
            String str2 = "Failed to load " + aVar + ": adapter not loaded";
            v.i("MediationService", str2);
            a(aVar, (MaxError) new MaxErrorImpl(-5001, str2), (MaxAdListener) aVar2);
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object c2 = this.f14382a.ah().c();
            if (c2 instanceof com.applovin.impl.mediation.a.a) {
                processAdDisplayErrorPostback(MaxAdapterError.WEBVIEW_ERROR, (com.applovin.impl.mediation.a.a) c2);
            }
        }
    }

    public void processAdDisplayErrorPostback(MaxError maxError, com.applovin.impl.mediation.a.a aVar) {
        a("mierr", (Map<String, String>) Collections.EMPTY_MAP, maxError, (com.applovin.impl.mediation.a.f) aVar);
    }

    public void processAdLossPostback(com.applovin.impl.mediation.a.a aVar, Float f2) {
        String f3 = f2 != null ? f2.toString() : "";
        Map map = CollectionUtils.map(1);
        map.put("{MBR}", f3);
        a("mloss", (Map<String, String>) map, (com.applovin.impl.mediation.a.f) aVar);
    }

    public void processAdapterInitializationPostback(com.applovin.impl.mediation.a.f fVar, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        Map map = CollectionUtils.map(2);
        map.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        map.put("{INIT_TIME_MS}", String.valueOf(j));
        a("minit", (Map<String, String>) map, (MaxError) new MaxErrorImpl(str), fVar);
    }

    public void processCallbackAdImpressionPostback(final com.applovin.impl.mediation.a.a aVar, final a.C0141a aVar2) {
        AnonymousClass7 r0 = new Runnable() {
            public void run() {
                if (aVar.d().endsWith("cimp")) {
                    MediationServiceImpl.this.f14382a.aj().a(aVar);
                    k.a((MaxAdRevenueListener) aVar2, (MaxAd) aVar);
                }
                Map map = CollectionUtils.map(1);
                String emptyIfNull = StringUtils.emptyIfNull(MediationServiceImpl.this.f14382a.n());
                if (!((Boolean) MediationServiceImpl.this.f14382a.a(b.dF)).booleanValue()) {
                    emptyIfNull = "";
                }
                map.put("{CUID}", emptyIfNull);
                MediationServiceImpl.this.a("mcimp", (Map<String, String>) map, (com.applovin.impl.mediation.a.f) aVar);
            }
        };
        if (((Boolean) this.f14382a.a(com.applovin.impl.sdk.c.a.V)).booleanValue()) {
            this.f14382a.V().a((com.applovin.impl.sdk.e.a) new z(this.f14382a, r0), o.a.MEDIATION_POSTBACKS);
        } else {
            r0.run();
        }
    }

    public void processRawAdImpressionPostback(final com.applovin.impl.mediation.a.a aVar, final a.C0141a aVar2) {
        AnonymousClass5 r0 = new Runnable() {
            public void run() {
                MediationServiceImpl.this.f14382a.aj().a(aVar, "WILL_DISPLAY");
                if (aVar.d().endsWith("mimp")) {
                    MediationServiceImpl.this.f14382a.aj().a(aVar);
                    k.a((MaxAdRevenueListener) aVar2, (MaxAd) aVar);
                }
                Map map = CollectionUtils.map(2);
                com.applovin.impl.mediation.a.a aVar = aVar;
                if (aVar instanceof c) {
                    map.put("{TIME_TO_SHOW_MS}", String.valueOf(((c) aVar).D()));
                }
                String emptyIfNull = StringUtils.emptyIfNull(MediationServiceImpl.this.f14382a.n());
                if (!((Boolean) MediationServiceImpl.this.f14382a.a(b.dF)).booleanValue()) {
                    emptyIfNull = "";
                }
                map.put("{CUID}", emptyIfNull);
                MediationServiceImpl.this.a("mimp", (Map<String, String>) map, (com.applovin.impl.mediation.a.f) aVar);
            }
        };
        if (((Boolean) this.f14382a.a(com.applovin.impl.sdk.c.a.V)).booleanValue()) {
            this.f14382a.V().a((com.applovin.impl.sdk.e.a) new z(this.f14382a, r0), o.a.MEDIATION_POSTBACKS);
        } else {
            r0.run();
        }
    }

    public void processViewabilityAdImpressionPostback(e eVar, long j, a.C0141a aVar) {
        final e eVar2 = eVar;
        final a.C0141a aVar2 = aVar;
        final long j2 = j;
        AnonymousClass6 r0 = new Runnable() {
            public void run() {
                if (eVar2.d().endsWith("vimp")) {
                    MediationServiceImpl.this.f14382a.aj().a((com.applovin.impl.mediation.a.a) eVar2);
                    k.a((MaxAdRevenueListener) aVar2, (MaxAd) eVar2);
                }
                Map map = CollectionUtils.map(3);
                map.put("{VIEWABILITY_FLAGS}", String.valueOf(j2));
                map.put("{USED_VIEWABILITY_TIMER}", String.valueOf(eVar2.N()));
                String emptyIfNull = StringUtils.emptyIfNull(MediationServiceImpl.this.f14382a.n());
                if (!((Boolean) MediationServiceImpl.this.f14382a.a(b.dF)).booleanValue()) {
                    emptyIfNull = "";
                }
                map.put("{CUID}", emptyIfNull);
                MediationServiceImpl.this.a("mvimp", (Map<String, String>) map, (com.applovin.impl.mediation.a.f) eVar2);
            }
        };
        if (((Boolean) this.f14382a.a(com.applovin.impl.sdk.c.a.V)).booleanValue()) {
            this.f14382a.V().a((com.applovin.impl.sdk.e.a) new z(this.f14382a, r0), o.a.MEDIATION_POSTBACKS);
        } else {
            r0.run();
        }
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f14384c.set(jSONObject);
    }

    public void showFullscreenAd(c cVar, Activity activity, a.C0141a aVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (activity != null || MaxAdFormat.APP_OPEN == cVar.getFormat()) {
            this.f14382a.ah().a(true);
            final g a2 = a(cVar);
            long E = cVar.E();
            if (v.a()) {
                v vVar = this.f14383b;
                vVar.c("MediationService", "Showing ad " + cVar.getAdUnitId() + " with delay of " + E + "ms...");
            }
            final c cVar2 = cVar;
            final Activity activity2 = activity;
            final a.C0141a aVar2 = aVar;
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    cVar2.a(true);
                    MediationServiceImpl.this.b(cVar2);
                    a2.a((com.applovin.impl.mediation.a.a) cVar2, activity2);
                    MediationServiceImpl.this.a(cVar2, aVar2);
                }
            }, E);
        } else {
            throw new IllegalArgumentException("No activity specified");
        }
    }

    public void showFullscreenAd(c cVar, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, a.C0141a aVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (activity != null) {
            this.f14382a.ah().a(true);
            final g a2 = a(cVar);
            long E = cVar.E();
            if (v.a()) {
                v vVar = this.f14383b;
                vVar.c("MediationService", "Showing ad " + cVar.getAdUnitId() + " with delay of " + E + "ms...");
            }
            final c cVar2 = cVar;
            final ViewGroup viewGroup2 = viewGroup;
            final Lifecycle lifecycle2 = lifecycle;
            final Activity activity2 = activity;
            final a.C0141a aVar2 = aVar;
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    cVar2.a(true);
                    MediationServiceImpl.this.b(cVar2);
                    a2.a((com.applovin.impl.mediation.a.a) cVar2, viewGroup2, lifecycle2, activity2);
                    MediationServiceImpl.this.a(cVar2, aVar2);
                }
            }, E);
        } else {
            throw new IllegalArgumentException("No activity specified");
        }
    }
}
