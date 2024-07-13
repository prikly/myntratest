package io.bidmachine.analytics.entity;

import java.util.HashMap;
import java.util.Map;

public class Event {

    /* renamed from: a  reason: collision with root package name */
    public final long f9666a = System.currentTimeMillis();

    /* renamed from: b  reason: collision with root package name */
    public final String f9667b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f9668c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Double> f9669d;

    public Event(String str) {
        this.f9667b = str;
        this.f9668c = new HashMap();
        this.f9669d = new HashMap();
    }

    public Event addDimension(String str, String str2) {
        this.f9668c.put(str, str2);
        return this;
    }

    public Event addMetric(String str, double d2) {
        this.f9669d.put(str, Double.valueOf(d2));
        return this;
    }

    public Map<String, String> getDimensions() {
        return this.f9668c;
    }

    public Map<String, Double> getMetrics() {
        return this.f9669d;
    }

    public String getName() {
        return this.f9667b;
    }

    public long getTimestamp() {
        return this.f9666a;
    }

    public Event setDimensions(Map<String, String> map) {
        this.f9668c.clear();
        this.f9668c.putAll(map);
        return this;
    }

    public Event setMetrics(Map<String, Double> map) {
        this.f9669d.clear();
        this.f9669d.putAll(map);
        return this;
    }
}
