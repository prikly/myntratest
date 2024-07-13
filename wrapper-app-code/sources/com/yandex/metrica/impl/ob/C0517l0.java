package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.yandex.metrica.i;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.l0  reason: case insensitive filesystem */
public class C0517l0 implements C0568n1 {

    /* renamed from: a  reason: collision with root package name */
    private Location f6106a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f6107b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f6108c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f6109d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f6110e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    private Map<String, String> f6111f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    private String f6112g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6113h;
    private T1 i;

    private static boolean a(Object obj) {
        return obj == null;
    }

    public void a(boolean z) {
        this.f6108c = Boolean.valueOf(z);
        b();
    }

    public void b(boolean z) {
        this.f6107b = Boolean.valueOf(z);
        b();
    }

    public void c(String str, String str2) {
        this.f6111f.put(str, str2);
    }

    public void setStatisticsSending(boolean z) {
        this.f6109d = Boolean.valueOf(z);
        b();
    }

    public void setUserProfileID(String str) {
        this.f6112g = str;
    }

    private void b(Map<String, String> map, i.b bVar) {
        if (!A2.b((Map) map)) {
            for (Map.Entry next : map.entrySet()) {
                bVar.b((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    public void a(Location location) {
        this.f6106a = location;
    }

    public i a(i iVar) {
        if (this.f6113h) {
            return iVar;
        }
        i.b a2 = i.a(iVar.apiKey);
        a2.a(iVar.f3628b, iVar.i);
        a2.b(iVar.f3627a);
        a2.a(iVar.preloadInfo);
        a2.a(iVar.location);
        if (A2.a((Object) iVar.f3630d)) {
            a2.a(iVar.f3630d);
        }
        if (A2.a((Object) iVar.appVersion)) {
            a2.a(iVar.appVersion);
        }
        if (A2.a((Object) iVar.f3632f)) {
            a2.b(iVar.f3632f.intValue());
        }
        if (A2.a((Object) iVar.f3631e)) {
            a2.a(iVar.f3631e.intValue());
        }
        if (A2.a((Object) iVar.f3633g)) {
            a2.c(iVar.f3633g.intValue());
        }
        if (A2.a((Object) iVar.logs) && iVar.logs.booleanValue()) {
            a2.b();
        }
        if (A2.a((Object) iVar.sessionTimeout)) {
            a2.e(iVar.sessionTimeout.intValue());
        }
        if (A2.a((Object) iVar.crashReporting)) {
            a2.d(iVar.crashReporting.booleanValue());
        }
        if (A2.a((Object) iVar.nativeCrashReporting)) {
            a2.f(iVar.nativeCrashReporting.booleanValue());
        }
        if (A2.a((Object) iVar.locationTracking)) {
            a2.e(iVar.locationTracking.booleanValue());
        }
        if (A2.a((Object) iVar.f3629c)) {
            a2.f3640f = iVar.f3629c;
        }
        if (A2.a((Object) iVar.firstActivationAsUpdate)) {
            a2.a(iVar.firstActivationAsUpdate.booleanValue());
        }
        if (A2.a((Object) iVar.statisticsSending)) {
            a2.j(iVar.statisticsSending.booleanValue());
        }
        if (A2.a((Object) iVar.k)) {
            a2.b(iVar.k.booleanValue());
        }
        if (A2.a((Object) iVar.maxReportsInDatabaseCount)) {
            a2.d(iVar.maxReportsInDatabaseCount.intValue());
        }
        if (A2.a((Object) iVar.l)) {
            a2.a(iVar.l);
        }
        if (A2.a((Object) iVar.userProfileID)) {
            a2.c(iVar.userProfileID);
        }
        if (A2.a((Object) iVar.revenueAutoTrackingEnabled)) {
            a2.h(iVar.revenueAutoTrackingEnabled.booleanValue());
        }
        if (A2.a((Object) iVar.appOpenTrackingEnabled)) {
            a2.c(iVar.appOpenTrackingEnabled.booleanValue());
        }
        a(this.f6110e, a2);
        a(iVar.f3634h, a2);
        b(this.f6111f, a2);
        b(iVar.errorEnvironment, a2);
        Boolean bool = this.f6107b;
        if (a((Object) iVar.locationTracking) && A2.a((Object) bool)) {
            a2.e(bool.booleanValue());
        }
        Location location = this.f6106a;
        if (a((Object) iVar.location) && A2.a((Object) location)) {
            a2.a(location);
        }
        Boolean bool2 = this.f6109d;
        if (a((Object) iVar.statisticsSending) && A2.a((Object) bool2)) {
            a2.j(bool2.booleanValue());
        }
        if (!A2.a((Object) iVar.userProfileID) && A2.a((Object) this.f6112g)) {
            a2.c(this.f6112g);
        }
        this.f6113h = true;
        this.f6106a = null;
        this.f6107b = null;
        this.f6109d = null;
        this.f6110e.clear();
        this.f6111f.clear();
        this.f6112g = null;
        return a2.a();
    }

    private void b() {
        T1 t1 = this.i;
        if (t1 != null) {
            t1.a(this.f6107b, this.f6109d, this.f6108c);
        }
    }

    private void a(Map<String, String> map, i.b bVar) {
        if (!A2.b((Map) map)) {
            for (Map.Entry next : map.entrySet()) {
                bVar.a((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    public void a(T1 t1) {
        this.i = t1;
    }
}
