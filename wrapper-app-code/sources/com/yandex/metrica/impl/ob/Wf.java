package com.yandex.metrica.impl.ob;

import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.e;
import com.yandex.metrica.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Wf {
    public i a(i iVar) {
        if (!A2.a((Object) iVar.maxReportsInDatabaseCount)) {
            return iVar;
        }
        i.b a2 = i.a((YandexMetricaConfig) iVar).a((List<String>) new ArrayList());
        if (A2.a((Object) iVar.f3627a)) {
            a2.b(iVar.f3627a);
        }
        if (A2.a((Object) iVar.f3628b) && A2.a((Object) iVar.i)) {
            a2.a(iVar.f3628b, iVar.i);
        }
        if (A2.a((Object) iVar.f3631e)) {
            a2.a(iVar.f3631e.intValue());
        }
        if (A2.a((Object) iVar.f3632f)) {
            a2.b(iVar.f3632f.intValue());
        }
        if (A2.a((Object) iVar.f3633g)) {
            a2.c(iVar.f3633g.intValue());
        }
        if (A2.a((Object) iVar.f3629c)) {
            a2.f3640f = iVar.f3629c;
        }
        if (A2.a((Object) iVar.f3634h)) {
            for (Map.Entry next : iVar.f3634h.entrySet()) {
                a2.a((String) next.getKey(), (String) next.getValue());
            }
        }
        if (A2.a((Object) iVar.j)) {
            a2.g(iVar.j.booleanValue());
        }
        if (A2.a((Object) iVar.f3630d)) {
            a2.a(iVar.f3630d);
        }
        if (A2.a((Object) iVar.k)) {
            a2.b(iVar.k.booleanValue());
        }
        return a2.d(a(iVar.maxReportsInDatabaseCount, iVar.apiKey)).a();
    }

    public e a(e eVar) {
        return A2.a((Object) eVar.maxReportsInDatabaseCount) ? e.a(eVar).a(a(eVar.maxReportsInDatabaseCount, eVar.apiKey)).a() : eVar;
    }

    private int a(Integer num, String str) {
        if (num.intValue() < 100) {
            Ul.b(str).fw("Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to %d, but was: %d. Default value (%d) will be used", 100, num, 100);
            return 100;
        } else if (num.intValue() <= 10000) {
            return num.intValue();
        } else {
            Ul.b(str).fw("Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to %d, but was: %d. Default value (%d) will be used", 10000, num, 10000);
            return 10000;
        }
    }
}
