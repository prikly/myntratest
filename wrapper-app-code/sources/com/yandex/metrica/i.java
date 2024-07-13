package com.yandex.metrica;

import android.location.Location;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.impl.ob.A2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class i extends YandexMetricaConfig {

    /* renamed from: a  reason: collision with root package name */
    public final String f3627a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f3628b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3629c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f3630d;

    /* renamed from: e  reason: collision with root package name */
    public final Integer f3631e;

    /* renamed from: f  reason: collision with root package name */
    public final Integer f3632f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f3633g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, String> f3634h;
    public final Boolean i;
    public final Boolean j;
    public final Boolean k;
    public final c l;

    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public YandexMetricaConfig.Builder f3635a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f3636b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public List<String> f3637c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public Integer f3638d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public Map<String, String> f3639e;

        /* renamed from: f  reason: collision with root package name */
        public String f3640f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public Integer f3641g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public Integer f3642h;
        /* access modifiers changed from: private */
        public LinkedHashMap<String, String> i = new LinkedHashMap<>();
        /* access modifiers changed from: private */
        public Boolean j;
        /* access modifiers changed from: private */
        public Boolean k;
        /* access modifiers changed from: private */
        public Boolean l;
        /* access modifiers changed from: private */
        public c m;

        protected b(String str) {
            this.f3635a = YandexMetricaConfig.newConfigBuilder(str);
        }

        static /* synthetic */ void c(b bVar) {
        }

        static /* synthetic */ void f(b bVar) {
        }

        public b c(String str) {
            this.f3635a.withUserProfileID(str);
            return this;
        }

        public b f(boolean z) {
            this.f3635a.withNativeCrashReporting(z);
            return this;
        }

        public b a(String str) {
            this.f3635a.withAppVersion(str);
            return this;
        }

        public b b(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        public b c(int i2) {
            this.f3642h = Integer.valueOf(i2);
            return this;
        }

        public b d(boolean z) {
            this.f3635a.withCrashReporting(z);
            return this;
        }

        public b e(int i2) {
            this.f3635a.withSessionTimeout(i2);
            return this;
        }

        public b g(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        public b h(boolean z) {
            this.f3635a.withRevenueAutoTrackingEnabled(z);
            return this;
        }

        public b i(boolean z) {
            this.f3635a.withSessionsAutoTrackingEnabled(z);
            return this;
        }

        public b j(boolean z) {
            this.f3635a.withStatisticsSending(z);
            return this;
        }

        public b a(Location location) {
            this.f3635a.withLocation(location);
            return this;
        }

        public b b() {
            this.f3635a.withLogs();
            return this;
        }

        public b c(boolean z) {
            this.f3635a.withAppOpenTrackingEnabled(z);
            return this;
        }

        public b d(int i2) {
            this.f3635a.withMaxReportsInDatabaseCount(i2);
            return this;
        }

        public b e(boolean z) {
            this.f3635a.withLocationTracking(z);
            return this;
        }

        public b a(List<String> list) {
            this.f3637c = list;
            return this;
        }

        public b b(String str, String str2) {
            this.f3635a.withErrorEnvironmentValue(str, str2);
            return this;
        }

        public b a(int i2) {
            if (i2 >= 0) {
                this.f3638d = Integer.valueOf(i2);
                return this;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", new Object[]{"App Build Number"}));
        }

        public b b(String str) {
            this.f3636b = str;
            return this;
        }

        public b b(int i2) {
            this.f3641g = Integer.valueOf(i2);
            return this;
        }

        public b a(Map<String, String> map, Boolean bool) {
            this.j = bool;
            this.f3639e = map;
            return this;
        }

        public b a(PreloadInfo preloadInfo) {
            this.f3635a.withPreloadInfo(preloadInfo);
            return this;
        }

        public b a(boolean z) {
            this.f3635a.handleFirstActivationAsUpdate(z);
            return this;
        }

        public b a(String str, String str2) {
            this.i.put(str, str2);
            return this;
        }

        public b a(c cVar) {
            this.m = cVar;
            return this;
        }

        public i a() {
            return new i(this);
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public i(YandexMetricaConfig yandexMetricaConfig) {
        super(yandexMetricaConfig);
        this.f3627a = null;
        this.f3628b = null;
        this.f3631e = null;
        this.f3632f = null;
        this.f3633g = null;
        this.f3629c = null;
        this.f3634h = null;
        this.i = null;
        this.j = null;
        this.f3630d = null;
        this.k = null;
        this.l = null;
    }

    public static b a(YandexMetricaConfig yandexMetricaConfig) {
        b bVar = new b(yandexMetricaConfig.apiKey);
        if (A2.a((Object) yandexMetricaConfig.appVersion)) {
            bVar.a(yandexMetricaConfig.appVersion);
        }
        if (A2.a((Object) yandexMetricaConfig.sessionTimeout)) {
            bVar.e(yandexMetricaConfig.sessionTimeout.intValue());
        }
        if (A2.a((Object) yandexMetricaConfig.crashReporting)) {
            bVar.d(yandexMetricaConfig.crashReporting.booleanValue());
        }
        if (A2.a((Object) yandexMetricaConfig.nativeCrashReporting)) {
            bVar.f(yandexMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (A2.a((Object) yandexMetricaConfig.location)) {
            bVar.a(yandexMetricaConfig.location);
        }
        if (A2.a((Object) yandexMetricaConfig.locationTracking)) {
            bVar.e(yandexMetricaConfig.locationTracking.booleanValue());
        }
        if (A2.a((Object) yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            bVar.b();
        }
        if (A2.a((Object) yandexMetricaConfig.preloadInfo)) {
            bVar.a(yandexMetricaConfig.preloadInfo);
        }
        if (A2.a((Object) yandexMetricaConfig.firstActivationAsUpdate)) {
            bVar.a(yandexMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (A2.a((Object) yandexMetricaConfig.statisticsSending)) {
            bVar.j(yandexMetricaConfig.statisticsSending.booleanValue());
        }
        if (A2.a((Object) yandexMetricaConfig.maxReportsInDatabaseCount)) {
            bVar.d(yandexMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (A2.a((Object) yandexMetricaConfig.errorEnvironment)) {
            for (Map.Entry next : yandexMetricaConfig.errorEnvironment.entrySet()) {
                bVar.b((String) next.getKey(), (String) next.getValue());
            }
        }
        if (A2.a((Object) yandexMetricaConfig.userProfileID)) {
            bVar.c(yandexMetricaConfig.userProfileID);
        }
        if (A2.a((Object) yandexMetricaConfig.revenueAutoTrackingEnabled)) {
            bVar.h(yandexMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (A2.a((Object) yandexMetricaConfig.sessionsAutoTrackingEnabled)) {
            bVar.i(yandexMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (A2.a((Object) yandexMetricaConfig.appOpenTrackingEnabled)) {
            bVar.c(yandexMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (yandexMetricaConfig instanceof i) {
            i iVar = (i) yandexMetricaConfig;
            if (A2.a((Object) iVar.f3630d)) {
                bVar.a(iVar.f3630d);
            }
            if (A2.a((Object) iVar.l)) {
                bVar.a(iVar.l);
            }
            A2.a((Object) null);
        }
        return bVar;
    }

    private i(b bVar) {
        super(bVar.f3635a);
        List<String> list;
        this.f3631e = bVar.f3638d;
        List h2 = bVar.f3637c;
        Map<String, String> map = null;
        if (h2 == null) {
            list = null;
        } else {
            list = A2.c(h2);
        }
        this.f3630d = list;
        this.f3627a = bVar.f3636b;
        Map j2 = bVar.f3639e;
        this.f3628b = j2 != null ? A2.e(j2) : map;
        this.f3633g = bVar.f3642h;
        this.f3632f = bVar.f3641g;
        this.f3629c = bVar.f3640f;
        this.f3634h = A2.e(bVar.i);
        this.i = bVar.j;
        this.j = bVar.k;
        b.c(bVar);
        this.k = bVar.l;
        this.l = bVar.m;
        b.f(bVar);
    }
}
