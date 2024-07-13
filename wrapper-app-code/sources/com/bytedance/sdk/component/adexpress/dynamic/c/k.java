package com.bytedance.sdk.component.adexpress.dynamic.c;

import com.bytedance.sdk.component.adexpress.dynamic.c.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FlexComputeRuler */
public class k {
    public static float a(float f2) {
        return (float) Math.ceil((double) ((f2 * 16.0f) / 16.0f));
    }

    public static List<a.C0227a> a(float f2, List<a.C0227a> list) {
        ArrayList<a.C0227a> arrayList = new ArrayList<>();
        for (a.C0227a clone : list) {
            arrayList.add((a.C0227a) clone.clone());
        }
        boolean z = true;
        int i = 0;
        int i2 = 0;
        for (a.C0227a aVar : arrayList) {
            if (aVar.f18537b) {
                i = (int) (((float) i) + aVar.f18536a);
            } else {
                i2 = (int) (((float) i2) + aVar.f18536a);
                z = false;
            }
        }
        if (z && f2 > ((float) i)) {
            return arrayList;
        }
        float f3 = (float) i;
        int i3 = (f2 > f3 ? 1 : (f2 == f3 ? 0 : -1));
        float f4 = i3 < 0 ? f2 / f3 : 1.0f;
        int i4 = (f2 > f3 ? 1 : (f2 == f3 ? 0 : -1));
        float f5 = i4 > 0 ? (f2 - f3) / ((float) i2) : 0.0f;
        if (f5 > 1.0f) {
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            for (a.C0227a aVar2 : arrayList) {
                if (!aVar2.f18537b && aVar2.f18538c != 0.0f && aVar2.f18536a * f5 > aVar2.f18538c) {
                    aVar2.f18536a = aVar2.f18538c;
                    aVar2.f18537b = true;
                    z2 = true;
                }
                arrayList2.add(aVar2);
            }
            if (z2) {
                return a(f2, arrayList2);
            }
        }
        int i5 = 0;
        for (a.C0227a aVar3 : arrayList) {
            if (aVar3.f18537b) {
                aVar3.f18536a = a(aVar3.f18536a * f4);
            } else {
                aVar3.f18536a = a(aVar3.f18536a * f5);
            }
            i5 = (int) (((float) i5) + aVar3.f18536a);
        }
        float f6 = (float) i5;
        if (f6 < f2) {
            float f7 = f2 - f6;
            for (int i6 = 0; i6 < arrayList.size() && f7 > 0.0f; i6 = (i6 + 1) % arrayList.size()) {
                a.C0227a aVar4 = (a.C0227a) arrayList.get(i6);
                if ((i3 < 0 && aVar4.f18537b) || (i4 > 0 && !aVar4.f18537b)) {
                    aVar4.f18536a += 0.0625f;
                    f7 -= 0.0625f;
                }
            }
        }
        return arrayList;
    }
}
