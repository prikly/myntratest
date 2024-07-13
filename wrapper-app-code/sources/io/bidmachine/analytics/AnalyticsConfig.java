package io.bidmachine.analytics;

import io.bidmachine.analytics.entity.AnalyticsMetricConfig;
import java.util.ArrayList;
import java.util.List;

public class AnalyticsConfig {

    /* renamed from: a  reason: collision with root package name */
    public final String f9651a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9652b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9653c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9654d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9655e;

    /* renamed from: f  reason: collision with root package name */
    public final List<AnalyticsMetricConfig> f9656f;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final String f9657a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9658b;

        /* renamed from: c  reason: collision with root package name */
        public final List<AnalyticsMetricConfig> f9659c;

        /* renamed from: d  reason: collision with root package name */
        public int f9660d = 30;

        /* renamed from: e  reason: collision with root package name */
        public int f9661e = 4;

        /* renamed from: f  reason: collision with root package name */
        public int f9662f = 8;

        public Builder(String str, String str2) {
            this.f9657a = str;
            this.f9658b = str2;
            this.f9659c = new ArrayList();
        }

        public Builder addAnalyticsMetricConfig(AnalyticsMetricConfig analyticsMetricConfig) {
            this.f9659c.add(analyticsMetricConfig);
            return this;
        }

        public AnalyticsConfig build() {
            return new AnalyticsConfig(this.f9657a, this.f9658b, this.f9660d, this.f9661e, this.f9662f, this.f9659c);
        }

        public Builder setAnalyticsMetricConfigList(List<AnalyticsMetricConfig> list) {
            this.f9659c.clear();
            this.f9659c.addAll(list);
            return this;
        }

        public Builder setEventBatchSize(int i) {
            return setEventBatchSize(i, (Integer) null);
        }

        public Builder setEventBatchSize(int i, Integer num) {
            int i2;
            this.f9661e = i;
            if (num == null || num.intValue() < i) {
                i2 = i * 2;
                if (i2 < 8) {
                    i2 = 8;
                }
            } else {
                i2 = num.intValue();
            }
            this.f9662f = i2;
            return this;
        }

        public Builder setIntervalSec(int i) {
            this.f9660d = i;
            return this;
        }
    }

    private AnalyticsConfig(String str, String str2, int i, int i2, int i3, List<AnalyticsMetricConfig> list) {
        this.f9651a = str;
        this.f9652b = str2;
        this.f9653c = ((long) i) * 1000;
        this.f9654d = i2;
        this.f9655e = i3;
        this.f9656f = list;
    }

    public List<AnalyticsMetricConfig> getAnalyticsMetricConfigList() {
        return this.f9656f;
    }

    public String getContext() {
        return this.f9652b;
    }

    public int getEventBatchMaxSize() {
        return this.f9655e;
    }

    public int getEventBatchSize() {
        return this.f9654d;
    }

    public long getIntervalMs() {
        return this.f9653c;
    }

    public String getRequestUrl() {
        return this.f9651a;
    }
}
