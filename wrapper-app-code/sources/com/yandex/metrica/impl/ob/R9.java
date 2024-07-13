package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Df;
import com.yandex.metrica.impl.ob.H1;
import com.yandex.metrica.impl.ob.Jf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class R9 implements ProtobufConverter<Jf.e, Df> {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Integer, H1.d> f4857a = Collections.unmodifiableMap(new a());

    /* renamed from: b  reason: collision with root package name */
    private static final Map<H1.d, Integer> f4858b = Collections.unmodifiableMap(new b());

    class a extends HashMap<Integer, H1.d> {
        a() {
            put(1, H1.d.WIFI);
            put(2, H1.d.CELL);
        }
    }

    class b extends HashMap<H1.d, Integer> {
        b() {
            put(H1.d.WIFI, 1);
            put(H1.d.CELL, 2);
        }
    }

    public Object fromModel(Object obj) {
        Jf.e eVar = (Jf.e) obj;
        Df df = new Df();
        Set<String> a2 = eVar.a();
        df.f3876b = (String[]) a2.toArray(new String[((HashSet) a2).size()]);
        List<Jf.e.a> b2 = eVar.b();
        Df.a[] aVarArr = new Df.a[b2.size()];
        for (int i = 0; i < b2.size(); i++) {
            Jf.e.a aVar = b2.get(i);
            Df.a aVar2 = new Df.a();
            aVar2.f3878a = aVar.f4345a;
            aVar2.f3879b = aVar.f4346b;
            Df.a.C0044a[] aVarArr2 = new Df.a.C0044a[aVar.f4348d.c()];
            int i2 = 0;
            for (Map.Entry entry : aVar.f4348d.a()) {
                for (String str : (Collection) entry.getValue()) {
                    Df.a.C0044a aVar3 = new Df.a.C0044a();
                    aVar3.f3885a = (String) entry.getKey();
                    aVar3.f3886b = str;
                    aVarArr2[i2] = aVar3;
                    i2++;
                }
            }
            aVar2.f3881d = aVarArr2;
            aVar2.f3880c = aVar.f4347c;
            aVar2.f3882e = aVar.f4349e;
            List<H1.d> list = aVar.f4350f;
            int[] iArr = new int[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                iArr[i3] = f4858b.get(list.get(i3)).intValue();
            }
            aVar2.f3883f = iArr;
            aVarArr[i] = aVar2;
        }
        df.f3875a = aVarArr;
        return df;
    }

    public Object toModel(Object obj) {
        Df df = (Df) obj;
        ArrayList arrayList = new ArrayList();
        Df.a[] aVarArr = df.f3875a;
        int length = aVarArr.length;
        boolean z = false;
        int i = 0;
        while (i < length) {
            Df.a aVar = aVarArr[i];
            String str = aVar.f3878a;
            String str2 = aVar.f3879b;
            String str3 = aVar.f3880c;
            Df.a.C0044a[] aVarArr2 = aVar.f3881d;
            C0686rm rmVar = new C0686rm(z);
            int length2 = aVarArr2.length;
            int i2 = 0;
            while (i2 < length2) {
                Df.a.C0044a aVar2 = aVarArr2[i2];
                rmVar.a(aVar2.f3885a, aVar2.f3886b);
                i2++;
                aVarArr = aVarArr;
            }
            Df.a[] aVarArr3 = aVarArr;
            long j = aVar.f3882e;
            int[] iArr = aVar.f3883f;
            ArrayList arrayList2 = new ArrayList(iArr.length);
            int length3 = iArr.length;
            int i3 = 0;
            while (i3 < length3) {
                arrayList2.add(f4857a.get(Integer.valueOf(iArr[i3])));
                i3++;
                iArr = iArr;
                length = length;
            }
            int i4 = length;
            Jf.e.a aVar3 = r8;
            Jf.e.a aVar4 = new Jf.e.a(str, str2, str3, rmVar, j, arrayList2);
            arrayList.add(aVar3);
            i++;
            aVarArr = aVarArr3;
            z = false;
        }
        return new Jf.e(arrayList, Arrays.asList(df.f3876b));
    }
}
