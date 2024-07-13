package com.yandex.metrica;

import android.location.Location;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.C0543m1;
import com.yandex.metrica.impl.ob.Hn;
import com.yandex.metrica.impl.ob.Kn;
import com.yandex.metrica.impl.ob.Ln;
import java.util.LinkedHashMap;
import java.util.Map;

public class YandexMetricaConfig {
    public final String apiKey;
    public final Boolean appOpenTrackingEnabled;
    public final String appVersion;
    public final Boolean crashReporting;
    public final Map<String, String> errorEnvironment;
    public final Boolean firstActivationAsUpdate;
    public final Location location;
    public final Boolean locationTracking;
    public final Boolean logs;
    public final Integer maxReportsInDatabaseCount;
    public final Boolean nativeCrashReporting;
    public final PreloadInfo preloadInfo;
    public final Boolean revenueAutoTrackingEnabled;
    public final Integer sessionTimeout;
    public final Boolean sessionsAutoTrackingEnabled;
    public final Boolean statisticsSending;
    public final String userProfileID;

    public static class Builder {
        private static final Kn<String> r = new Hn(new Ln());
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f3402a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f3403b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Integer f3404c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public Boolean f3405d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public Boolean f3406e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public Location f3407f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public Boolean f3408g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public Boolean f3409h;
        /* access modifiers changed from: private */
        public PreloadInfo i;
        /* access modifiers changed from: private */
        public Boolean j;
        /* access modifiers changed from: private */
        public Boolean k;
        /* access modifiers changed from: private */
        public Integer l;
        /* access modifiers changed from: private */
        public LinkedHashMap<String, String> m = new LinkedHashMap<>();
        /* access modifiers changed from: private */
        public String n;
        /* access modifiers changed from: private */
        public Boolean o;
        /* access modifiers changed from: private */
        public Boolean p;
        /* access modifiers changed from: private */
        public Boolean q;

        protected Builder(String str) {
            ((Hn) r).a(str);
            this.f3402a = str;
        }

        public YandexMetricaConfig build() {
            return new YandexMetricaConfig(this);
        }

        public Builder handleFirstActivationAsUpdate(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public Builder withAppOpenTrackingEnabled(boolean z) {
            this.q = Boolean.valueOf(z);
            return this;
        }

        public Builder withAppVersion(String str) {
            this.f3403b = str;
            return this;
        }

        public Builder withCrashReporting(boolean z) {
            this.f3405d = Boolean.valueOf(z);
            return this;
        }

        public Builder withErrorEnvironmentValue(String str, String str2) {
            this.m.put(str, str2);
            return this;
        }

        public Builder withLocation(Location location) {
            this.f3407f = location;
            return this;
        }

        public Builder withLocationTracking(boolean z) {
            this.f3408g = Boolean.valueOf(z);
            return this;
        }

        public Builder withLogs() {
            this.f3409h = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i2) {
            this.l = Integer.valueOf(i2);
            return this;
        }

        public Builder withNativeCrashReporting(boolean z) {
            this.f3406e = Boolean.valueOf(z);
            return this;
        }

        public Builder withPreloadInfo(PreloadInfo preloadInfo) {
            this.i = preloadInfo;
            return this;
        }

        public Builder withRevenueAutoTrackingEnabled(boolean z) {
            this.o = Boolean.valueOf(z);
            return this;
        }

        public Builder withSessionTimeout(int i2) {
            this.f3404c = Integer.valueOf(i2);
            return this;
        }

        public Builder withSessionsAutoTrackingEnabled(boolean z) {
            this.p = Boolean.valueOf(z);
            return this;
        }

        public Builder withStatisticsSending(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.n = str;
            return this;
        }
    }

    protected YandexMetricaConfig(Builder builder) {
        this.apiKey = builder.f3402a;
        this.appVersion = builder.f3403b;
        this.sessionTimeout = builder.f3404c;
        this.crashReporting = builder.f3405d;
        this.nativeCrashReporting = builder.f3406e;
        this.location = builder.f3407f;
        this.locationTracking = builder.f3408g;
        this.logs = builder.f3409h;
        this.preloadInfo = builder.i;
        this.firstActivationAsUpdate = builder.j;
        this.statisticsSending = builder.k;
        this.maxReportsInDatabaseCount = builder.l;
        this.errorEnvironment = A2.e(builder.m);
        this.userProfileID = builder.n;
        this.revenueAutoTrackingEnabled = builder.o;
        this.sessionsAutoTrackingEnabled = builder.p;
        this.appOpenTrackingEnabled = builder.q;
    }

    public static Builder createBuilderFromConfig(YandexMetricaConfig yandexMetricaConfig) {
        Builder newConfigBuilder = newConfigBuilder(yandexMetricaConfig.apiKey);
        if (A2.a((Object) yandexMetricaConfig.appVersion)) {
            newConfigBuilder.withAppVersion(yandexMetricaConfig.appVersion);
        }
        if (A2.a((Object) yandexMetricaConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(yandexMetricaConfig.sessionTimeout.intValue());
        }
        if (A2.a((Object) yandexMetricaConfig.crashReporting)) {
            newConfigBuilder.withCrashReporting(yandexMetricaConfig.crashReporting.booleanValue());
        }
        if (A2.a((Object) yandexMetricaConfig.nativeCrashReporting)) {
            newConfigBuilder.withNativeCrashReporting(yandexMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (A2.a((Object) yandexMetricaConfig.location)) {
            newConfigBuilder.withLocation(yandexMetricaConfig.location);
        }
        if (A2.a((Object) yandexMetricaConfig.locationTracking)) {
            newConfigBuilder.withLocationTracking(yandexMetricaConfig.locationTracking.booleanValue());
        }
        if (A2.a((Object) yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (A2.a((Object) yandexMetricaConfig.preloadInfo)) {
            newConfigBuilder.withPreloadInfo(yandexMetricaConfig.preloadInfo);
        }
        if (A2.a((Object) yandexMetricaConfig.firstActivationAsUpdate)) {
            newConfigBuilder.handleFirstActivationAsUpdate(yandexMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (A2.a((Object) yandexMetricaConfig.statisticsSending)) {
            newConfigBuilder.withStatisticsSending(yandexMetricaConfig.statisticsSending.booleanValue());
        }
        if (A2.a((Object) yandexMetricaConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(yandexMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (A2.a((Object) yandexMetricaConfig.errorEnvironment)) {
            for (Map.Entry next : yandexMetricaConfig.errorEnvironment.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue((String) next.getKey(), (String) next.getValue());
            }
        }
        if (A2.a((Object) yandexMetricaConfig.userProfileID)) {
            newConfigBuilder.withUserProfileID(yandexMetricaConfig.userProfileID);
        }
        if (A2.a((Object) yandexMetricaConfig.revenueAutoTrackingEnabled)) {
            newConfigBuilder.withRevenueAutoTrackingEnabled(yandexMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (A2.a((Object) yandexMetricaConfig.sessionsAutoTrackingEnabled)) {
            newConfigBuilder.withSessionsAutoTrackingEnabled(yandexMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (A2.a((Object) yandexMetricaConfig.appOpenTrackingEnabled)) {
            newConfigBuilder.withAppOpenTrackingEnabled(yandexMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        return newConfigBuilder;
    }

    public static YandexMetricaConfig fromJson(String str) {
        return new C0543m1().a(str);
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str);
    }

    public String toJson() {
        return new C0543m1().a(this);
    }

    protected YandexMetricaConfig(YandexMetricaConfig yandexMetricaConfig) {
        this.apiKey = yandexMetricaConfig.apiKey;
        this.appVersion = yandexMetricaConfig.appVersion;
        this.sessionTimeout = yandexMetricaConfig.sessionTimeout;
        this.crashReporting = yandexMetricaConfig.crashReporting;
        this.nativeCrashReporting = yandexMetricaConfig.nativeCrashReporting;
        this.location = yandexMetricaConfig.location;
        this.locationTracking = yandexMetricaConfig.locationTracking;
        this.logs = yandexMetricaConfig.logs;
        this.preloadInfo = yandexMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = yandexMetricaConfig.firstActivationAsUpdate;
        this.statisticsSending = yandexMetricaConfig.statisticsSending;
        this.maxReportsInDatabaseCount = yandexMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = yandexMetricaConfig.errorEnvironment;
        this.userProfileID = yandexMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = yandexMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = yandexMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = yandexMetricaConfig.appOpenTrackingEnabled;
    }
}
