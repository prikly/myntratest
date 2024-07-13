package com.appodeal.ads.modules.common.internal.service;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/service/ServiceVariant;", "", "", "a", "Ljava/lang/String;", "getServiceName", "()Ljava/lang/String;", "serviceName", "b", "getClassName", "className", "Appsflyer", "Adjust", "FacebookAnalytics", "Firebase", "StackAnalytics", "SentryAnalytics", "apd_internal"}, k = 1, mv = {1, 6, 0})
public enum ServiceVariant {
    Appsflyer("AppsFlyer", "com.appodeal.ads.services.appsflyer.AppsflyerService"),
    Adjust("Adjust", "com.appodeal.ads.services.adjust.AdjustService"),
    FacebookAnalytics("Facebook Analytics", "com.appodeal.ads.services.facebook_analytics.FacebookAnalyticsService"),
    Firebase("Firebase Analytics", "com.appodeal.ads.services.firebase.FirebaseService"),
    StackAnalytics("Stack Analytics", "com.appodeal.ads.services.stack_analytics.StackAnalyticsService"),
    SentryAnalytics("Sentry Analytics", "com.appodeal.ads.services.sentry_analytics.SentryAnalyticsService");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f16698a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16699b;

    /* access modifiers changed from: public */
    ServiceVariant(String str, String str2) {
        this.f16698a = str;
        this.f16699b = str2;
    }

    public final String getClassName() {
        return this.f16699b;
    }

    public final String getServiceName() {
        return this.f16698a;
    }
}
