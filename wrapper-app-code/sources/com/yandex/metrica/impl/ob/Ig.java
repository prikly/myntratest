package com.yandex.metrica.impl.ob;

import com.appodeal.ads.adapters.admob.BuildConfig;
import com.yandex.metrica.impl.ob.Tl;

public class Ig {

    /* renamed from: a  reason: collision with root package name */
    public final String f4261a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4262b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public final String f4263c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4264d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4265e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4266f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4267g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4268h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;

    public Ig(Tl.a aVar) {
        String str;
        this.f4261a = aVar.c("dId");
        this.f4262b = aVar.c("uId");
        this.f4263c = aVar.b("kitVer");
        this.f4264d = aVar.c("analyticsSdkVersionName");
        this.f4265e = aVar.c("kitBuildNumber");
        this.f4266f = aVar.c("kitBuildType");
        this.f4267g = aVar.c("appVer");
        this.f4268h = aVar.optString("app_debuggable", BuildConfig.ADAPTER_VERSION);
        this.i = aVar.c("appBuild");
        this.j = aVar.c("osVer");
        this.l = aVar.c("lang");
        this.m = aVar.c("root");
        this.p = aVar.c("commit_hash");
        this.n = aVar.optString("app_framework", C0420h2.a());
        int optInt = aVar.optInt("osApiLev", -1);
        String str2 = null;
        if (optInt == -1) {
            str = null;
        } else {
            str = String.valueOf(optInt);
        }
        this.k = str;
        int optInt2 = aVar.optInt("attribution_id", 0);
        this.o = optInt2 > 0 ? String.valueOf(optInt2) : str2;
    }

    public String toString() {
        return "DbNetworkTaskConfig{deviceId='" + this.f4261a + '\'' + ", uuid='" + this.f4262b + '\'' + ", kitVersion='" + this.f4263c + '\'' + ", analyticsSdkVersionName='" + this.f4264d + '\'' + ", kitBuildNumber='" + this.f4265e + '\'' + ", kitBuildType='" + this.f4266f + '\'' + ", appVersion='" + this.f4267g + '\'' + ", appDebuggable='" + this.f4268h + '\'' + ", appBuildNumber='" + this.i + '\'' + ", osVersion='" + this.j + '\'' + ", osApiLevel='" + this.k + '\'' + ", locale='" + this.l + '\'' + ", deviceRootStatus='" + this.m + '\'' + ", appFramework='" + this.n + '\'' + ", attributionId='" + this.o + '\'' + ", commitHash='" + this.p + '\'' + '}';
    }

    public Ig() {
        this.f4261a = null;
        this.f4262b = null;
        this.f4263c = null;
        this.f4264d = null;
        this.f4265e = null;
        this.f4266f = null;
        this.f4267g = null;
        this.f4268h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }
}
