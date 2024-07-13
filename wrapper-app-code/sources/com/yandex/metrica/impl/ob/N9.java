package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.If;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

public final class N9 implements Converter<Map<String, ? extends Object>, If.l[]> {

    /* renamed from: a  reason: collision with root package name */
    private final C0480jd f4598a;

    public N9() {
        F0 g2 = F0.g();
        Intrinsics.checkNotNullExpressionValue(g2, "GlobalServiceLocator.getInstance()");
        C0480jd j = g2.j();
        Intrinsics.checkNotNullExpressionValue(j, "GlobalServiceLocator.get…tance().modulesController");
        this.f4598a = j;
    }

    /* renamed from: a */
    public If.l[] fromModel(Map<String, ? extends Object> map) {
        If.l lVar;
        Map<String, C0431hd> c2 = this.f4598a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            C0431hd hdVar = c2.get(str);
            if (hdVar == null || value == null) {
                lVar = null;
            } else {
                lVar = new If.l();
                lVar.f4205a = str;
                lVar.f4206b = hdVar.a(value);
            }
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        Object[] array = arrayList.toArray(new If.l[0]);
        if (array != null) {
            return (If.l[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public Map<String, Object> toModel(If.l[] lVarArr) {
        Map<String, C0431hd> c2 = this.f4598a.c();
        ArrayList arrayList = new ArrayList();
        for (If.l lVar : lVarArr) {
            C0431hd hdVar = c2.get(lVar.f4205a);
            Pair pair = hdVar != null ? TuplesKt.to(lVar.f4205a, hdVar.a(lVar.f4206b)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }
}
