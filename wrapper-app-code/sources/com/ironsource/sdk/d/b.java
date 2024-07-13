package com.ironsource.sdk.d;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.google.android.gms.plus.PlusShare;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.controller.g;
import com.ironsource.sdk.controller.j;
import com.ironsource.sdk.e;
import com.ironsource.sdk.f;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.j.a.a;
import com.ironsource.sdk.j.a.c;
import com.ironsource.sdk.j.a.d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import io.bidmachine.utils.IabUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b implements c, e, f, a, com.ironsource.sdk.j.a.b, c, d {

    /* renamed from: g  reason: collision with root package name */
    private static b f9425g;

    /* renamed from: a  reason: collision with root package name */
    public g f9426a;

    /* renamed from: b  reason: collision with root package name */
    com.ironsource.sdk.j.e f9427b;

    /* renamed from: c  reason: collision with root package name */
    String f9428c;

    /* renamed from: d  reason: collision with root package name */
    String f9429d;

    /* renamed from: e  reason: collision with root package name */
    j f9430e;

    /* renamed from: f  reason: collision with root package name */
    private final String f9431f = IronSourceConstants.SUPERSONIC_CONFIG_NAME;

    /* renamed from: h  reason: collision with root package name */
    private long f9432h;
    private com.ironsource.sdk.service.d i;
    private com.ironsource.sdk.service.c j;
    private boolean k = false;
    private com.ironsource.sdk.controller.c l;

    private b(Context context) {
        b(context);
    }

    private b(String str, String str2, Context context) {
        this.f9428c = str;
        this.f9429d = str2;
        b(context);
    }

    public static synchronized b a(Context context) {
        b a2;
        synchronized (b.class) {
            a2 = a(context, 0);
        }
        return a2;
    }

    public static synchronized b a(Context context, int i2) {
        b bVar;
        synchronized (b.class) {
            Logger.i("IronSourceAdsPublisherAgent", "getInstance()");
            if (f9425g == null) {
                f9425g = new b(context);
            }
            bVar = f9425g;
        }
        return bVar;
    }

    public static synchronized e a(String str, String str2, Context context) {
        b bVar;
        synchronized (b.class) {
            if (f9425g == null) {
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f8999a);
                f9425g = new b(str, str2, context);
            } else {
                com.ironsource.sdk.service.d.a().b(str);
                com.ironsource.sdk.service.d.a().a(str2);
            }
            bVar = f9425g;
        }
        return bVar;
    }

    private static com.ironsource.sdk.j.f a(com.ironsource.sdk.g.c cVar) {
        if (cVar == null) {
            return null;
        }
        return (com.ironsource.sdk.j.f) cVar.f9521g;
    }

    private void a(Context context, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("enableLifeCycleListeners", false);
        this.k = optBoolean;
        if (optBoolean) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new a(this));
            } catch (Throwable th) {
                com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
                aVar.a("generalmessage", th.getMessage());
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.q, (Map<String, Object>) aVar.f8990a);
            }
        }
    }

    private static com.ironsource.sdk.j.c b(com.ironsource.sdk.g.c cVar) {
        if (cVar == null) {
            return null;
        }
        return (com.ironsource.sdk.j.c) cVar.f9521g;
    }

    private void b(Context context) {
        try {
            JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
            com.ironsource.sdk.utils.b.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new com.ironsource.sdk.h.e(SDKUtils.getNetworkConfiguration().optJSONObject("storage")));
            com.ironsource.sdk.utils.b.a().a(SDKUtils.getSDKVersion());
            this.i = c(context);
            this.f9430e = new j();
            com.ironsource.sdk.controller.c cVar = new com.ironsource.sdk.controller.c();
            this.l = cVar;
            if (context instanceof Activity) {
                cVar.a((Activity) context);
            }
            this.f9426a = new g(context, this.l, this.i, this.f9430e, com.ironsource.environment.e.a.f8069a);
            Logger.enableLogging(FeaturesManager.getInstance().getDebugMode());
            Logger.i("IronSourceAdsPublisherAgent", "C'tor");
            a(context, networkConfiguration);
            this.j = new com.ironsource.sdk.service.c();
            com.ironsource.mediationsdk.adunit.a.a.a("sdkv", (Object) "5.113");
            this.j.a();
            this.j.a(context);
            this.j.b();
            this.j.c();
            this.j.b(context);
            this.f9432h = 0;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void b(com.ironsource.sdk.b bVar, Map<String, String> map) {
        if (bVar.f9016h) {
            c(bVar, map);
        } else {
            d(bVar, map);
        }
    }

    private static com.ironsource.sdk.j.b c(com.ironsource.sdk.g.c cVar) {
        if (cVar == null) {
            return null;
        }
        return (com.ironsource.sdk.j.b) cVar.f9521g;
    }

    private com.ironsource.sdk.service.d c(Context context) {
        com.ironsource.sdk.service.d a2 = com.ironsource.sdk.service.d.a();
        a2.b();
        a2.a(context, this.f9428c, this.f9429d);
        return a2;
    }

    private void c(final com.ironsource.sdk.b bVar, final Map<String, String> map) {
        Logger.d("IronSourceAdsPublisherAgent", "loadOnInitializedInstance " + bVar.f9010b);
        this.f9426a.a((Runnable) new Runnable() {
            public final void run() {
                com.ironsource.sdk.g.c a2 = b.this.f9430e.a(d.e.Interstitial, bVar.f9010b);
                if (a2 != null) {
                    b.this.f9426a.a(a2, (Map<String, String>) map, (c) b.this);
                }
            }
        });
    }

    private com.ironsource.sdk.g.c d(d.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f9430e.a(eVar, str);
    }

    private void d(final com.ironsource.sdk.b bVar, final Map<String, String> map) {
        Logger.d("IronSourceAdsPublisherAgent", "loadOnNewInstance " + bVar.f9010b);
        this.f9426a.a((Runnable) new Runnable() {
            public final void run() {
                d.e eVar = bVar.a() ? d.e.Banner : d.e.Interstitial;
                j jVar = b.this.f9430e;
                com.ironsource.sdk.b bVar = bVar;
                String str = bVar.f9010b;
                String str2 = bVar.f9011c;
                HashMap hashMap = new HashMap();
                hashMap.put("instanceId", bVar.f9010b);
                hashMap.put("instanceName", bVar.f9011c);
                hashMap.put("rewarded", Boolean.toString(bVar.f9009a));
                hashMap.put("inAppBidding", Boolean.toString(bVar.f9012d));
                hashMap.put("apiVersion", "2");
                com.ironsource.sdk.a aVar = bVar.f9013e;
                String str3 = BuildConfig.ADAPTER_VERSION;
                hashMap.put(IabUtils.KEY_WIDTH, aVar != null ? Integer.toString(bVar.f9013e.f8987a) : str3);
                if (bVar.f9013e != null) {
                    str3 = Integer.toString(bVar.f9013e.f8988b);
                }
                hashMap.put(IabUtils.KEY_HEIGHT, str3);
                hashMap.put(PlusShare.KEY_CALL_TO_ACTION_LABEL, bVar.f9013e != null ? bVar.f9013e.f8989c : "");
                hashMap.put("isBanner", Boolean.toString(bVar.a()));
                if (bVar.f9014f != null) {
                    hashMap.putAll(bVar.f9014f);
                }
                com.ironsource.sdk.g.c cVar = new com.ironsource.sdk.g.c(str, str2, hashMap, bVar.f9015g);
                jVar.a(eVar, str, cVar);
                com.ironsource.sdk.a.a aVar2 = new com.ironsource.sdk.a.a();
                com.ironsource.sdk.a.a a2 = aVar2.a("isbiddinginstance", Boolean.valueOf(bVar.f9012d)).a("demandsourcename", bVar.f9011c).a("producttype", com.ironsource.sdk.d.a(bVar));
                com.ironsource.sdk.service.a aVar3 = com.ironsource.sdk.service.a.f9599a;
                a2.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(bVar.f9010b)));
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f9005g, (Map<String, Object>) aVar2.f8990a);
                if (eVar == d.e.Banner) {
                    b.this.f9426a.a(b.this.f9428c, b.this.f9429d, cVar, (com.ironsource.sdk.j.a.b) b.this);
                    bVar.f9016h = true;
                    b.this.f9426a.a(cVar, (Map<String, String>) map, (com.ironsource.sdk.j.a.b) b.this);
                    return;
                }
                b.this.f9426a.a(b.this.f9428c, b.this.f9429d, cVar, (c) b.this);
                bVar.f9016h = true;
                b.this.f9426a.a(cVar, (Map<String, String>) map, (c) b.this);
            }
        });
    }

    public final void a() {
        this.f9426a.a((Runnable) new Runnable() {
            public final void run() {
                b.this.f9426a.d();
            }
        });
    }

    public final void a(Activity activity) {
        try {
            Logger.i("IronSourceAdsPublisherAgent", "release()");
            com.ironsource.sdk.utils.a.a();
            this.l.b();
            this.f9426a.b((Context) activity);
            this.f9426a.destroy();
            this.f9426a = null;
        } catch (Exception unused) {
        }
        f9425g = null;
    }

    public final void a(Activity activity, com.ironsource.sdk.b bVar, Map<String, String> map) {
        this.l.a(activity);
        long currentTimeMillis = System.currentTimeMillis();
        map.put("loadStartTime", String.valueOf(currentTimeMillis));
        com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f9599a;
        com.ironsource.sdk.service.a.a(bVar.f9010b, currentTimeMillis);
        com.ironsource.sdk.a.a aVar2 = new com.ironsource.sdk.a.a();
        aVar2.a("isbiddinginstance", Boolean.valueOf(bVar.f9012d)).a("demandsourcename", bVar.f9011c).a("producttype", com.ironsource.sdk.d.a(bVar)).a("custom_c", Long.valueOf(currentTimeMillis));
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f9003e, (Map<String, Object>) aVar2.f8990a);
        Logger.d("IronSourceAdsPublisherAgent", "loadAd " + bVar.f9010b);
        if (bVar.f9012d) {
            try {
                map.put("adm", SDKUtils.decodeString(map.get("adm")));
            } catch (Exception e2) {
                com.ironsource.sdk.a.a a2 = new com.ironsource.sdk.a.a().a("callfailreason", e2.getMessage()).a("generalmessage", bVar.f9016h ? com.ironsource.sdk.f.b.f9498a : com.ironsource.sdk.f.b.f9499b).a("isbiddinginstance", Boolean.valueOf(bVar.f9012d)).a("demandsourcename", bVar.f9011c).a("producttype", com.ironsource.sdk.d.a(bVar));
                com.ironsource.sdk.service.a aVar3 = com.ironsource.sdk.service.a.f9599a;
                com.ironsource.sdk.a.a a3 = a2.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(bVar.f9010b)));
                com.ironsource.sdk.service.a aVar4 = com.ironsource.sdk.service.a.f9599a;
                com.ironsource.sdk.service.a.b(bVar.f9010b);
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.j, (Map<String, Object>) a3.f8990a);
                e2.printStackTrace();
                Logger.d("IronSourceAdsPublisherAgent", "loadInAppBiddingAd failed decoding  ADM " + e2.getMessage());
            }
            b(bVar, map);
            return;
        }
        b(bVar, map);
    }

    public final void a(Activity activity, final Map<String, String> map) {
        if (activity != null) {
            this.l.a(activity);
        }
        this.f9426a.a((Runnable) new Runnable() {
            public final void run() {
                b.this.f9426a.a((Map<String, String>) map, b.this.f9427b);
            }
        });
    }

    public final void a(com.ironsource.sdk.b bVar, final Map<String, String> map) {
        Logger.i("IronSourceAdsPublisherAgent", "showAd " + bVar.f9010b);
        final com.ironsource.sdk.g.c a2 = this.f9430e.a(d.e.Interstitial, bVar.f9010b);
        if (a2 != null) {
            this.f9426a.a((Runnable) new Runnable() {
                public final void run() {
                    b.this.f9426a.b(a2, map, b.this);
                }
            });
        }
    }

    public final void a(d.e eVar, String str) {
        com.ironsource.sdk.j.c b2;
        com.ironsource.sdk.g.c d2 = d(eVar, str);
        if (d2 == null) {
            return;
        }
        if (eVar == d.e.RewardedVideo) {
            com.ironsource.sdk.j.f a2 = a(d2);
            if (a2 != null) {
                a2.onRVAdClosed();
            }
        } else if (eVar == d.e.Interstitial && (b2 = b(d2)) != null) {
            b2.onInterstitialClose();
        }
    }

    public final void a(d.e eVar, String str, com.ironsource.sdk.g.a aVar) {
        com.ironsource.sdk.j.b c2;
        com.ironsource.sdk.g.c d2 = d(eVar, str);
        if (d2 != null) {
            d2.a(2);
            if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f a2 = a(d2);
                if (a2 != null) {
                    a2.onRVInitSuccess(aVar);
                }
            } else if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c b2 = b(d2);
                if (b2 != null) {
                    b2.onInterstitialInitSuccess();
                }
            } else if (eVar == d.e.Banner && (c2 = c(d2)) != null) {
                c2.onBannerInitSuccess();
            }
        }
    }

    public final void a(d.e eVar, String str, String str2) {
        com.ironsource.sdk.j.b c2;
        com.ironsource.sdk.g.c d2 = d(eVar, str);
        com.ironsource.sdk.a.a a2 = new com.ironsource.sdk.a.a().a("demandsourcename", str).a("producttype", eVar).a("callfailreason", str2);
        com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f9599a;
        com.ironsource.sdk.a.a a3 = a2.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(d2.f9516b)));
        com.ironsource.sdk.service.a aVar2 = com.ironsource.sdk.service.a.f9599a;
        com.ironsource.sdk.service.a.b(d2.f9516b);
        if (d2 != null) {
            a3.a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(d2)));
            d2.a(3);
            if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f a4 = a(d2);
                if (a4 != null) {
                    a4.onRVInitFail(str2);
                }
            } else if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c b2 = b(d2);
                if (b2 != null) {
                    b2.onInterstitialInitFailed(str2);
                }
            } else if (eVar == d.e.Banner && (c2 = c(d2)) != null) {
                c2.onBannerInitFailed(str2);
            }
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f9006h, (Map<String, Object>) a3.f8990a);
    }

    public final void a(d.e eVar, String str, String str2, JSONObject jSONObject) {
        com.ironsource.sdk.j.b c2;
        com.ironsource.sdk.g.c d2 = d(eVar, str);
        if (d2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Logger.i("IronSourceAdsPublisherAgent", "Received Event Notification: " + str2 + " for demand source: " + d2.f9515a);
                if (eVar == d.e.Interstitial) {
                    com.ironsource.sdk.j.c b2 = b(d2);
                    if (b2 != null) {
                        jSONObject.put("demandSourceName", str);
                        b2.onInterstitialEventNotificationReceived(str2, jSONObject);
                    }
                } else if (eVar == d.e.RewardedVideo) {
                    com.ironsource.sdk.j.f a2 = a(d2);
                    if (a2 != null) {
                        jSONObject.put("demandSourceName", str);
                        a2.onRVEventNotificationReceived(str2, jSONObject);
                    }
                } else if (eVar == d.e.Banner && (c2 = c(d2)) != null) {
                    jSONObject.put("demandSourceName", str);
                    if (str2.equalsIgnoreCase("impressions")) {
                        c2.onBannerShowSuccess();
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(final com.ironsource.sdk.j.e eVar) {
        this.f9426a.a((Runnable) new Runnable() {
            public final void run() {
                b.this.f9426a.a(b.this.f9428c, b.this.f9429d, eVar);
            }
        });
    }

    public final void a(String str, int i2) {
        com.ironsource.sdk.j.f a2;
        com.ironsource.sdk.g.c d2 = d(d.e.RewardedVideo, str);
        if (d2 != null && (a2 = a(d2)) != null) {
            a2.onRVAdCredited(i2);
        }
    }

    public final void a(String str, com.ironsource.sdk.c.a aVar) {
        com.ironsource.sdk.j.b c2;
        com.ironsource.sdk.g.c d2 = d(d.e.Banner, str);
        if (d2 != null && (c2 = c(d2)) != null) {
            c2.onBannerLoadSuccess(aVar);
        }
    }

    public final void a(String str, String str2) {
        com.ironsource.sdk.j.f a2;
        com.ironsource.sdk.g.c d2 = d(d.e.RewardedVideo, str);
        if (d2 != null && (a2 = a(d2)) != null) {
            a2.onRVShowFail(str2);
        }
    }

    public final void a(String str, String str2, int i2) {
        d.e productType;
        com.ironsource.sdk.g.c a2;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (productType = SDKUtils.getProductType(str)) != null && (a2 = this.f9430e.a(productType, str2)) != null) {
            a2.f9517c = i2;
        }
    }

    public final void a(final String str, final String str2, final com.ironsource.sdk.j.e eVar) {
        this.f9428c = str;
        this.f9429d = str2;
        this.f9426a.a((Runnable) new Runnable() {
            public final void run() {
                b.this.f9426a.a(str, str2, eVar);
            }
        });
    }

    public final void a(final String str, final String str2, String str3, Map<String, String> map, com.ironsource.sdk.j.c cVar) {
        this.f9428c = str;
        this.f9429d = str2;
        final com.ironsource.sdk.g.c a2 = this.f9430e.a(d.e.Interstitial, str3, map, cVar);
        this.f9426a.a((Runnable) new Runnable() {
            public final void run() {
                b.this.f9426a.a(str, str2, a2, (c) b.this);
            }
        });
    }

    public final void a(final String str, final String str2, String str3, Map<String, String> map, com.ironsource.sdk.j.f fVar) {
        this.f9428c = str;
        this.f9429d = str2;
        final com.ironsource.sdk.g.c a2 = this.f9430e.a(d.e.RewardedVideo, str3, map, fVar);
        this.f9426a.a((Runnable) new Runnable() {
            public final void run() {
                b.this.f9426a.a(str, str2, a2, (com.ironsource.sdk.j.a.d) b.this);
            }
        });
    }

    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f9428c = str;
        this.f9429d = str2;
        this.f9427b = eVar;
        final String str3 = str;
        final String str4 = str2;
        final Map<String, String> map2 = map;
        final com.ironsource.sdk.j.e eVar2 = eVar;
        this.f9426a.a((Runnable) new Runnable() {
            public final void run() {
                b.this.f9426a.a(str3, str4, (Map<String, String>) map2, eVar2);
            }
        });
    }

    public final void a(final Map<String, String> map, final com.ironsource.sdk.j.e eVar) {
        this.f9427b = eVar;
        this.f9426a.a((Runnable) new Runnable() {
            public final void run() {
                b.this.f9426a.a(b.this.f9428c, b.this.f9429d, (Map<String, String>) map, eVar);
            }
        });
    }

    public final void a(final JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("gdprConsentStatus")) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("consent", Boolean.parseBoolean(jSONObject.getString("gdprConsentStatus")));
                this.i.a(jSONObject2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        this.f9426a.a((Runnable) new Runnable() {
            public final void run() {
                b.this.f9426a.a(jSONObject);
            }
        });
    }

    public final boolean a(com.ironsource.sdk.b bVar) {
        Logger.d("IronSourceAdsPublisherAgent", "isAdAvailable " + bVar.f9010b);
        com.ironsource.sdk.g.c a2 = this.f9430e.a(d.e.Interstitial, bVar.f9010b);
        if (a2 == null) {
            return false;
        }
        return a2.f9520f;
    }

    public final boolean a(String str) {
        return this.f9426a.c(str);
    }

    public final void b(Activity activity) {
        if (!this.k) {
            d(activity);
        }
    }

    public final void b(d.e eVar, String str) {
        com.ironsource.sdk.j.b c2;
        com.ironsource.sdk.g.c d2 = d(eVar, str);
        if (d2 == null) {
            return;
        }
        if (eVar == d.e.RewardedVideo) {
            com.ironsource.sdk.j.f a2 = a(d2);
            if (a2 != null) {
                a2.onRVAdClicked();
            }
        } else if (eVar == d.e.Interstitial) {
            com.ironsource.sdk.j.c b2 = b(d2);
            if (b2 != null) {
                b2.onInterstitialClick();
            }
        } else if (eVar == d.e.Banner && (c2 = c(d2)) != null) {
            c2.onBannerClick();
        }
    }

    public final void b(String str) {
        com.ironsource.sdk.j.f a2;
        com.ironsource.sdk.g.c d2 = d(d.e.RewardedVideo, str);
        if (d2 != null && (a2 = a(d2)) != null) {
            a2.onRVNoMoreOffers();
        }
    }

    public final void b(String str, int i2) {
        com.ironsource.sdk.g.c d2 = d(d.e.Interstitial, str);
        com.ironsource.sdk.j.c b2 = b(d2);
        if (d2 != null && b2 != null) {
            b2.onInterstitialAdRewarded(str, i2);
        }
    }

    public final void b(String str, String str2) {
        com.ironsource.sdk.g.c d2 = d(d.e.Interstitial, str);
        com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
        aVar.a("callfailreason", str2).a("demandsourcename", str);
        if (d2 != null) {
            com.ironsource.sdk.a.a a2 = aVar.a("producttype", com.ironsource.sdk.a.e.a(d2, d.e.Interstitial)).a("generalmessage", d2.f9519e == 2 ? com.ironsource.sdk.f.b.f9498a : com.ironsource.sdk.f.b.f9499b).a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(d2)));
            com.ironsource.sdk.service.a aVar2 = com.ironsource.sdk.service.a.f9599a;
            a2.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(d2.f9516b)));
            com.ironsource.sdk.service.a aVar3 = com.ironsource.sdk.service.a.f9599a;
            com.ironsource.sdk.service.a.b(d2.f9516b);
            com.ironsource.sdk.j.c b2 = b(d2);
            if (b2 != null) {
                b2.onInterstitialLoadFailed(str2);
            }
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f9004f, (Map<String, Object>) aVar.f8990a);
    }

    public final void b(final JSONObject jSONObject) {
        this.f9426a.a((Runnable) new Runnable() {
            public final void run() {
                b.this.f9426a.a(jSONObject, (com.ironsource.sdk.j.a.d) b.this);
            }
        });
    }

    public final void c(Activity activity) {
        if (!this.k) {
            e(activity);
        }
    }

    public final void c(d.e eVar, String str) {
        com.ironsource.sdk.j.f a2;
        com.ironsource.sdk.g.c d2 = d(eVar, str);
        if (d2 == null) {
            return;
        }
        if (eVar == d.e.Interstitial) {
            com.ironsource.sdk.j.c b2 = b(d2);
            if (b2 != null) {
                b2.onInterstitialOpen();
            }
        } else if (eVar == d.e.RewardedVideo && (a2 = a(d2)) != null) {
            a2.onRVAdOpened();
        }
    }

    public final void c(String str) {
        com.ironsource.sdk.g.c d2 = d(d.e.Interstitial, str);
        com.ironsource.sdk.a.a a2 = new com.ironsource.sdk.a.a().a("demandsourcename", str);
        if (d2 != null) {
            com.ironsource.sdk.a.a a3 = a2.a("producttype", com.ironsource.sdk.a.e.a(d2, d.e.Interstitial)).a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(d2)));
            com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f9599a;
            a3.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(d2.f9516b)));
            com.ironsource.sdk.service.a aVar2 = com.ironsource.sdk.service.a.f9599a;
            com.ironsource.sdk.service.a.b(d2.f9516b);
            com.ironsource.sdk.j.c b2 = b(d2);
            if (b2 != null) {
                b2.onInterstitialLoadSuccess();
            }
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.k, (Map<String, Object>) a2.f8990a);
    }

    public final void c(String str, String str2) {
        com.ironsource.sdk.j.c b2;
        com.ironsource.sdk.g.c d2 = d(d.e.Interstitial, str);
        if (d2 != null && (b2 = b(d2)) != null) {
            b2.onInterstitialShowFailed(str2);
        }
    }

    public final void c(JSONObject jSONObject) {
        final String optString = jSONObject.optString("demandSourceName");
        if (!TextUtils.isEmpty(optString)) {
            this.f9426a.a((Runnable) new Runnable() {
                public final void run() {
                    b.this.f9426a.a(optString, (c) b.this);
                }
            });
        }
    }

    public final void d(Activity activity) {
        try {
            this.f9426a.f();
            this.f9426a.b((Context) activity);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void d(String str) {
        com.ironsource.sdk.j.c b2;
        com.ironsource.sdk.g.c d2 = d(d.e.Interstitial, str);
        if (d2 != null && (b2 = b(d2)) != null) {
            b2.onInterstitialShowSuccess();
        }
    }

    public final void d(String str, String str2) {
        com.ironsource.sdk.j.b c2;
        com.ironsource.sdk.g.c d2 = d(d.e.Banner, str);
        if (d2 != null && (c2 = c(d2)) != null) {
            c2.onBannerLoadFail(str2);
        }
    }

    public final void d(final JSONObject jSONObject) {
        this.f9426a.a((Runnable) new Runnable() {
            public final void run() {
                b.this.f9426a.a(jSONObject, (c) b.this);
            }
        });
    }

    public final void e(Activity activity) {
        this.l.a(activity);
        this.f9426a.e();
        this.f9426a.a((Context) activity);
    }
}
