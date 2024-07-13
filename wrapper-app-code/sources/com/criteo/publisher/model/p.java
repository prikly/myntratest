package com.criteo.publisher.model;

import android.content.Context;
import com.criteo.publisher.c0.d;
import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.l0.c;
import com.criteo.publisher.n0.b;
import com.criteo.publisher.n0.g;
import com.criteo.publisher.n0.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

/* compiled from: CdbRequestFactory */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2826a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2827b;

    /* renamed from: c  reason: collision with root package name */
    private final u f2828c;

    /* renamed from: d  reason: collision with root package name */
    private final b f2829d;

    /* renamed from: e  reason: collision with root package name */
    private final c f2830e;

    /* renamed from: f  reason: collision with root package name */
    private final d f2831f;

    /* renamed from: g  reason: collision with root package name */
    private final g f2832g;

    /* renamed from: h  reason: collision with root package name */
    private final com.criteo.publisher.i0.c f2833h;
    private final com.criteo.publisher.context.b i;
    private final com.criteo.publisher.context.d j;

    public p(Context context, String str, u uVar, b bVar, c cVar, d dVar, g gVar, com.criteo.publisher.i0.c cVar2, com.criteo.publisher.context.b bVar2, com.criteo.publisher.context.d dVar2) {
        this.f2826a = context;
        this.f2827b = str;
        this.f2828c = uVar;
        this.f2829d = bVar;
        this.f2830e = cVar;
        this.f2831f = dVar;
        this.f2832g = gVar;
        this.f2833h = cVar2;
        this.i = bVar2;
        this.j = dVar2;
    }

    public o a(List<n> list, ContextData contextData) {
        return o.a(this.f2831f.a(), v.a(this.f2826a.getPackageName(), this.f2827b, a((Map<String, Object>[]) new Map[]{com.criteo.publisher.context.c.a(contextData)})), z.a(this.f2829d.b(), s.a(this.f2830e.d()), s.a(this.f2830e.c()), s.a(this.f2830e.e()), a((Map<String, Object>[]) new Map[]{this.i.j(), com.criteo.publisher.context.c.a(this.j.a())})), this.f2832g.q(), this.f2833h.b(), this.f2830e.b(), a(list));
    }

    private List<q> a(List<n> list) {
        ArrayList arrayList = new ArrayList();
        for (n a2 : list) {
            arrayList.add(a(a2));
        }
        return arrayList;
    }

    private q a(n nVar) {
        return q.a(this.f2831f.a(), nVar.b(), nVar.a(), nVar.c());
    }

    public Future<String> a() {
        return this.f2828c.b();
    }

    @SafeVarargs
    public final Map<String, Object> a(Map<String, Object>... mapArr) {
        Map linkedHashMap = new LinkedHashMap();
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        for (Map<String, Object> entrySet : mapArr) {
            for (Map.Entry next : entrySet.entrySet()) {
                String[] split = ((String) next.getKey()).split("\\.", -1);
                if (!a(split)) {
                    Map map = linkedHashMap;
                    for (int i2 = 0; i2 < split.length - 1; i2++) {
                        String str = split[i2];
                        if (map.containsKey(str)) {
                            Object obj = map.get(str);
                            if (!newSetFromMap.contains(obj)) {
                                break;
                            }
                            map = (Map) obj;
                        } else {
                            Map linkedHashMap2 = new LinkedHashMap();
                            newSetFromMap.add(linkedHashMap2);
                            map.put(str, linkedHashMap2);
                            map = linkedHashMap2;
                        }
                    }
                    String str2 = split[split.length - 1];
                    if (!map.containsKey(str2)) {
                        map.put(str2, next.getValue());
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private boolean a(String[] strArr) {
        for (String isEmpty : strArr) {
            if (isEmpty.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
