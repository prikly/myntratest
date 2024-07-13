package io.bidmachine.analytics.entity;

import java.util.List;

public class AnalyticsMetricConfig {

    /* renamed from: a  reason: collision with root package name */
    public final String f9663a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f9664b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f9665c;

    public AnalyticsMetricConfig(String str, List<String> list, List<String> list2) {
        this.f9663a = str;
        this.f9664b = list;
        this.f9665c = list2;
    }

    public List<String> getDimensions() {
        return this.f9664b;
    }

    public String getEventName() {
        return this.f9663a;
    }

    public List<String> getMetrics() {
        return this.f9665c;
    }
}
