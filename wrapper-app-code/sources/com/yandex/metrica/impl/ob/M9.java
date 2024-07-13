package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C0783w;
import com.yandex.metrica.impl.ob.E;
import com.yandex.metrica.impl.ob.If;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class M9 implements ProtobufConverter<Ac, If.k.b> {
    /* renamed from: a */
    public If.k.b fromModel(Ac ac) {
        If.k.b bVar = new If.k.b();
        bVar.f4202a = new int[ac.f3699a.size()];
        Iterator<E.b.a> it = ac.f3699a.iterator();
        int i = 0;
        while (true) {
            int i2 = 3;
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = bVar.f4202a;
            int ordinal = it.next().ordinal();
            if (ordinal == 1) {
                i2 = 0;
            } else if (ordinal == 2) {
                i2 = 1;
            } else if (ordinal == 3) {
                i2 = 2;
            } else if (ordinal != 4) {
                i2 = 4;
            }
            iArr[i] = i2;
            i++;
        }
        bVar.f4203b = new int[ac.f3700b.size()];
        int i3 = 0;
        for (C0783w.a ordinal2 : ac.f3700b) {
            int[] iArr2 = bVar.f4203b;
            int ordinal3 = ordinal2.ordinal();
            iArr2[i3] = ordinal3 != 1 ? ordinal3 != 2 ? 3 : 2 : 0;
            i3++;
        }
        return bVar;
    }

    /* renamed from: a */
    public Ac toModel(If.k.b bVar) {
        C0783w.a aVar;
        E.b.a aVar2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (bVar.f4202a.length != 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = bVar.f4202a;
                if (i2 >= iArr.length) {
                    break;
                }
                int i3 = iArr[i2];
                if (i3 == 0) {
                    aVar2 = E.b.a.NONE;
                } else if (i3 == 1) {
                    aVar2 = E.b.a.USB;
                } else if (i3 == 2) {
                    aVar2 = E.b.a.WIRELESS;
                } else if (i3 != 3) {
                    aVar2 = E.b.a.UNKNOWN;
                } else {
                    aVar2 = E.b.a.AC;
                }
                arrayList.add(aVar2);
                i2++;
            }
        } else {
            arrayList.addAll(Arrays.asList(E.b.a.values()));
        }
        ArrayList arrayList2 = new ArrayList();
        if (bVar.f4203b.length != 0) {
            while (true) {
                int[] iArr2 = bVar.f4203b;
                if (i >= iArr2.length) {
                    break;
                }
                int i4 = iArr2[i];
                if (i4 == 0) {
                    aVar = C0783w.a.BACKGROUND;
                } else if (i4 != 2) {
                    aVar = C0783w.a.UNKNOWN;
                } else {
                    aVar = C0783w.a.VISIBLE;
                }
                arrayList2.add(aVar);
                i++;
            }
        } else {
            arrayList2.addAll(Arrays.asList(C0783w.a.values()));
        }
        return new Ac(arrayList, arrayList2);
    }
}
