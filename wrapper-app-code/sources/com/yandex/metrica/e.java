package com.yandex.metrica;

import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.impl.ob.A2;
import java.util.LinkedHashMap;
import java.util.Map;

public class e extends ReporterConfig {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f3574a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f3575b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f3576c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        ReporterConfig.Builder f3577a;

        /* renamed from: b  reason: collision with root package name */
        Integer f3578b;

        /* renamed from: c  reason: collision with root package name */
        Integer f3579c;

        /* renamed from: d  reason: collision with root package name */
        LinkedHashMap<String, String> f3580d = new LinkedHashMap<>();

        public a(String str) {
            this.f3577a = ReporterConfig.newConfigBuilder(str);
        }

        public a a(int i) {
            this.f3577a.withMaxReportsInDatabaseCount(i);
            return this;
        }

        public e a() {
            return new e(this);
        }
    }

    e(a aVar) {
        super(aVar.f3577a);
        Map<String, String> map;
        this.f3575b = aVar.f3578b;
        this.f3574a = aVar.f3579c;
        LinkedHashMap<String, String> linkedHashMap = aVar.f3580d;
        if (linkedHashMap == null) {
            map = null;
        } else {
            map = A2.e(linkedHashMap);
        }
        this.f3576c = map;
    }

    public static e a(ReporterConfig reporterConfig) {
        if (reporterConfig instanceof e) {
            return (e) reporterConfig;
        }
        return new e(reporterConfig);
    }

    public static a a(e eVar) {
        a aVar = new a(eVar.apiKey);
        if (A2.a((Object) eVar.sessionTimeout)) {
            aVar.f3577a.withSessionTimeout(eVar.sessionTimeout.intValue());
        }
        if (A2.a((Object) eVar.logs) && eVar.logs.booleanValue()) {
            aVar.f3577a.withLogs();
        }
        if (A2.a((Object) eVar.statisticsSending)) {
            aVar.f3577a.withStatisticsSending(eVar.statisticsSending.booleanValue());
        }
        if (A2.a((Object) eVar.maxReportsInDatabaseCount)) {
            aVar.f3577a.withMaxReportsInDatabaseCount(eVar.maxReportsInDatabaseCount.intValue());
        }
        if (A2.a((Object) eVar.f3574a)) {
            aVar.f3579c = Integer.valueOf(eVar.f3574a.intValue());
        }
        if (A2.a((Object) eVar.f3575b)) {
            aVar.f3578b = Integer.valueOf(eVar.f3575b.intValue());
        }
        if (A2.a((Object) eVar.f3576c)) {
            for (Map.Entry next : eVar.f3576c.entrySet()) {
                aVar.f3580d.put((String) next.getKey(), (String) next.getValue());
            }
        }
        if (A2.a((Object) eVar.userProfileID)) {
            aVar.f3577a.withUserProfileID(eVar.userProfileID);
        }
        return aVar;
    }

    private e(ReporterConfig reporterConfig) {
        super(reporterConfig);
        if (reporterConfig instanceof e) {
            e eVar = (e) reporterConfig;
            this.f3574a = eVar.f3574a;
            this.f3575b = eVar.f3575b;
            this.f3576c = eVar.f3576c;
            return;
        }
        this.f3574a = null;
        this.f3575b = null;
        this.f3576c = null;
    }

    public static a a(String str) {
        return new a(str);
    }
}
