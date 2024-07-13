package com.criteo.publisher.f0;

import com.criteo.publisher.i0.a;
import com.criteo.publisher.k0.g;
import com.criteo.publisher.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MetricSendingTask.kt */
public final class y extends x {

    /* renamed from: c  reason: collision with root package name */
    private final u f2506c;

    /* renamed from: d  reason: collision with root package name */
    private final g f2507d;

    /* renamed from: e  reason: collision with root package name */
    private final com.criteo.publisher.n0.g f2508e;

    public y(u uVar, g gVar, com.criteo.publisher.n0.g gVar2) {
        Intrinsics.checkParameterIsNotNull(uVar, "queue");
        Intrinsics.checkParameterIsNotNull(gVar, "api");
        Intrinsics.checkParameterIsNotNull(gVar2, "buildConfigWrapper");
        this.f2506c = uVar;
        this.f2507d = gVar;
        this.f2508e = gVar2;
    }

    public void a() {
        List a2 = this.f2506c.a(this.f2508e.d());
        if (!a2.isEmpty()) {
            List mutableList = CollectionsKt.toMutableList(a2);
            try {
                for (Map.Entry next : a(a2).entrySet()) {
                    this.f2507d.a((t) next.getKey());
                    mutableList.removeAll((Collection) next.getValue());
                }
            } finally {
                if (!mutableList.isEmpty()) {
                    b(mutableList);
                }
            }
        }
    }

    private final Map<t, Collection<n>> a(Collection<? extends n> collection) {
        String q = this.f2508e.q();
        Intrinsics.checkExpressionValueIsNotNull(q, "buildConfigWrapper.sdkVersion");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : collection) {
            Integer f2 = ((n) next).f();
            if (f2 == null) {
                f2 = Integer.valueOf(a.FALLBACK.a());
            }
            Object obj = linkedHashMap.get(f2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(f2, obj);
            }
            ((List) obj).add(next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Intrinsics.checkExpressionValueIsNotNull(key, "it.key");
            linkedHashMap2.put(t.a((Collection) entry.getValue(), q, ((Number) key).intValue()), entry.getValue());
        }
        return linkedHashMap2;
    }

    private final void b(Collection<? extends n> collection) {
        for (n a2 : collection) {
            this.f2506c.a(a2);
        }
    }
}
