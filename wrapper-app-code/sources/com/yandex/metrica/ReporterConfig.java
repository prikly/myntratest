package com.yandex.metrica;

import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Hn;
import com.yandex.metrica.impl.ob.Kn;
import com.yandex.metrica.impl.ob.Ln;

public class ReporterConfig {
    public final String apiKey;
    public final Boolean logs;
    public final Integer maxReportsInDatabaseCount;
    public final Integer sessionTimeout;
    public final Boolean statisticsSending;
    public final String userProfileID;

    public static class Builder {

        /* renamed from: g  reason: collision with root package name */
        private static final Kn<String> f3385g = new Hn(new Ln());
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f3386a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public Integer f3387b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public Boolean f3388c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public Boolean f3389d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public Integer f3390e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f3391f;

        Builder(String str) {
            ((Hn) f3385g).a(str);
            this.f3386a = str;
        }

        public ReporterConfig build() {
            return new ReporterConfig(this);
        }

        public Builder withLogs() {
            this.f3388c = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i) {
            this.f3390e = Integer.valueOf(i);
            return this;
        }

        public Builder withSessionTimeout(int i) {
            this.f3387b = Integer.valueOf(i);
            return this;
        }

        public Builder withStatisticsSending(boolean z) {
            this.f3389d = Boolean.valueOf(z);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f3391f = str;
            return this;
        }
    }

    ReporterConfig(Builder builder) {
        this.apiKey = builder.f3386a;
        this.sessionTimeout = builder.f3387b;
        this.logs = builder.f3388c;
        this.statisticsSending = builder.f3389d;
        this.maxReportsInDatabaseCount = builder.f3390e;
        this.userProfileID = builder.f3391f;
    }

    public static Builder createBuilderFromConfig(ReporterConfig reporterConfig) {
        Builder newConfigBuilder = newConfigBuilder(reporterConfig.apiKey);
        if (A2.a((Object) reporterConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(reporterConfig.sessionTimeout.intValue());
        }
        if (A2.a((Object) reporterConfig.logs) && reporterConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (A2.a((Object) reporterConfig.statisticsSending)) {
            newConfigBuilder.withStatisticsSending(reporterConfig.statisticsSending.booleanValue());
        }
        if (A2.a((Object) reporterConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(reporterConfig.maxReportsInDatabaseCount.intValue());
        }
        if (A2.a((Object) reporterConfig.userProfileID)) {
            newConfigBuilder.withUserProfileID(reporterConfig.userProfileID);
        }
        return newConfigBuilder;
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str);
    }

    ReporterConfig(ReporterConfig reporterConfig) {
        this.apiKey = reporterConfig.apiKey;
        this.sessionTimeout = reporterConfig.sessionTimeout;
        this.logs = reporterConfig.logs;
        this.statisticsSending = reporterConfig.statisticsSending;
        this.maxReportsInDatabaseCount = reporterConfig.maxReportsInDatabaseCount;
        this.userProfileID = reporterConfig.userProfileID;
    }
}
