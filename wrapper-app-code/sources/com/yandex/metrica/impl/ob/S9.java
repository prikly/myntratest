package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C0286bi;
import com.yandex.metrica.impl.ob.If;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S9 implements ProtobufConverter<C0286bi, If.o> {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Integer, C0286bi.a> f4920a = Collections.unmodifiableMap(new a());

    /* renamed from: b  reason: collision with root package name */
    private static final Map<C0286bi.a, Integer> f4921b = Collections.unmodifiableMap(new b());

    class a extends HashMap<Integer, C0286bi.a> {
        a() {
            put(1, C0286bi.a.WIFI);
            put(2, C0286bi.a.CELL);
        }
    }

    class b extends HashMap<C0286bi.a, Integer> {
        b() {
            put(C0286bi.a.WIFI, 1);
            put(C0286bi.a.CELL, 2);
        }
    }

    /* renamed from: a */
    public If.o fromModel(C0286bi biVar) {
        If.o oVar = new If.o();
        oVar.f4213a = biVar.f5550a;
        oVar.f4214b = biVar.f5551b;
        oVar.f4215c = biVar.f5552c;
        List<Pair<String, String>> list = biVar.f5553d;
        If.o.a[] aVarArr = new If.o.a[list.size()];
        int i = 0;
        for (Pair next : list) {
            If.o.a aVar = new If.o.a();
            aVar.f4220a = (String) next.first;
            aVar.f4221b = (String) next.second;
            aVarArr[i] = aVar;
            i++;
        }
        oVar.f4216d = aVarArr;
        Long l = biVar.f5554e;
        oVar.f4217e = l == null ? 0 : l.longValue();
        List<C0286bi.a> list2 = biVar.f5555f;
        int[] iArr = new int[list2.size()];
        for (int i2 = 0; i2 < list2.size(); i2++) {
            iArr[i2] = f4921b.get(list2.get(i2)).intValue();
        }
        oVar.f4218f = iArr;
        return oVar;
    }

    /* renamed from: a */
    public C0286bi toModel(If.o oVar) {
        String str = oVar.f4213a;
        String str2 = oVar.f4214b;
        String str3 = oVar.f4215c;
        If.o.a[] aVarArr = oVar.f4216d;
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (If.o.a aVar : aVarArr) {
            arrayList.add(new Pair(aVar.f4220a, aVar.f4221b));
        }
        Long valueOf = Long.valueOf(oVar.f4217e);
        int[] iArr = oVar.f4218f;
        ArrayList arrayList2 = new ArrayList(iArr.length);
        for (int valueOf2 : iArr) {
            arrayList2.add(f4920a.get(Integer.valueOf(valueOf2)));
        }
        return new C0286bi(str, str2, str3, arrayList, valueOf, arrayList2);
    }
}
