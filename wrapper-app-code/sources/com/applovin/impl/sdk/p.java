package com.applovin.impl.sdk;

import android.content.pm.PackageInfo;
import android.os.Build;
import com.applovin.impl.mediation.a.a;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.network.h;
import com.applovin.sdk.AppLovinSdk;
import java.util.HashMap;
import java.util.Map;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    protected final n f15761a;

    /* renamed from: b  reason: collision with root package name */
    protected final v f15762b;

    /* renamed from: c  reason: collision with root package name */
    private final String f15763c;

    public p(String str, n nVar) {
        this.f15763c = str;
        this.f15761a = nVar;
        this.f15762b = nVar.D();
    }

    private Map<String, String> b(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", this.f15763c);
        hashMap.put("platform", this.f15761a.Y().f());
        hashMap.put("applovin_random_token", this.f15761a.p());
        hashMap.put("compass_random_token", this.f15761a.o());
        hashMap.put("model", Build.MODEL);
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        hashMap.put("aei", String.valueOf(this.f15761a.a(b.au)));
        hashMap.put("mei", String.valueOf(this.f15761a.a(b.av)));
        c(hashMap);
        d(hashMap);
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    private void c(Map<String, String> map) {
        PackageInfo packageInfo;
        int i = 0;
        try {
            packageInfo = this.f15761a.P().getPackageManager().getPackageInfo(this.f15761a.P().getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        map.put("app_version", packageInfo != null ? packageInfo.versionName : "");
        if (packageInfo != null) {
            i = packageInfo.versionCode;
        }
        map.put("app_version_code", String.valueOf(i));
    }

    private void d(Map<String, String> map) {
        String str;
        Object c2 = this.f15761a.ah().c();
        if (c2 instanceof e) {
            map.put("fs_ad_network", "AppLovin");
            str = Long.toString(((e) c2).getAdIdNumber());
        } else if (c2 instanceof a) {
            a aVar = (a) c2;
            map.put("fs_ad_network", aVar.getNetworkName());
            str = aVar.getCreativeId();
        } else {
            str = "None";
            map.put("fs_ad_network", str);
        }
        map.put("fs_ad_creative_id", str);
    }

    public void a(Map<String, String> map) {
        if (v.a()) {
            v vVar = this.f15762b;
            vVar.b("ErrorReporter", "Reporting " + this.f15763c + " error...");
        }
        this.f15761a.X().a(h.o().c("https://ms.applovin.com/1.0/sdk/error").a(false).b("POST").a(b(map)).a());
    }
}
