package com.ironsource.mediationsdk;

import com.applovin.sdk.AppLovinMediationProvider;
import com.appodeal.ads.AppodealNetworks;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.e  reason: case insensitive filesystem */
public final class C0883e {

    /* renamed from: c  reason: collision with root package name */
    private static final C0883e f8596c = new C0883e();

    /* renamed from: a  reason: collision with root package name */
    final ConcurrentHashMap<String, String> f8597a;

    /* renamed from: b  reason: collision with root package name */
    final ConcurrentHashMap<String, String> f8598b;

    private C0883e() {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        this.f8597a = concurrentHashMap;
        concurrentHashMap.put("adcolony", "4.1.6");
        this.f8597a.put(AppodealNetworks.VUNGLE, "4.1.5");
        this.f8597a.put(AppodealNetworks.APPLOVIN, "4.3.3");
        this.f8597a.put("admob", "4.3.2");
        ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
        this.f8598b = concurrentHashMap2;
        concurrentHashMap2.put("adcolony", "4.1.6");
        this.f8598b.put("admob", "4.3.2");
        this.f8598b.put(AppodealNetworks.APPLOVIN, "4.3.3");
        this.f8598b.put("chartboost", "4.1.9");
        this.f8598b.put(AppLovinMediationProvider.FYBER, "4.1.0");
        this.f8598b.put("hyprmx", "4.1.2");
        this.f8598b.put("inmobi", "4.3.1");
        this.f8598b.put("maio", "4.1.3");
        this.f8598b.put("tapjoy", "4.0.0");
        this.f8598b.put("unityads", "4.1.4");
        this.f8598b.put(AppodealNetworks.VUNGLE, "4.1.5");
    }

    public static C0883e a() {
        return f8596c;
    }

    private static boolean a(String str, String str2) {
        if (str.equalsIgnoreCase(str2)) {
            return true;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        for (int i = 0; i < 3; i++) {
            int parseInt = Integer.parseInt(split[i]);
            int parseInt2 = Integer.parseInt(split2[i]);
            if (parseInt2 < parseInt) {
                return false;
            }
            if (parseInt2 > parseInt) {
                return true;
            }
        }
        return true;
    }

    public final boolean a(AbstractAdapter abstractAdapter) {
        if (abstractAdapter == null) {
            return false;
        }
        String version = abstractAdapter.getVersion();
        boolean a2 = a("4.3.0", version);
        if (!a2) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, abstractAdapter.getProviderName() + " adapter " + version + " is incompatible with SDK version " + IronSourceUtils.getSDKVersion() + ", please update your adapter to the latest version", 3);
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public boolean a(AbstractAdapter abstractAdapter, Map<String, String> map, String str) {
        if (abstractAdapter == null) {
            return false;
        }
        String lowerCase = abstractAdapter.getProviderName().toLowerCase(Locale.ENGLISH);
        if (!map.containsKey(lowerCase)) {
            return true;
        }
        String version = abstractAdapter.getVersion();
        boolean a2 = a(map.get(lowerCase), version);
        if (!a2) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, abstractAdapter.getProviderName() + " adapter " + version + " is incompatible with SDK version " + IronSourceUtils.getSDKVersion() + " for " + str + " ad unit, please update your adapter to the latest version", 3);
        }
        return a2;
    }
}
