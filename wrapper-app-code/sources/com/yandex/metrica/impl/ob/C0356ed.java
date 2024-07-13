package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.C0632pf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ed  reason: case insensitive filesystem */
public class C0356ed {

    /* renamed from: a  reason: collision with root package name */
    private final U7 f5739a;

    /* renamed from: b  reason: collision with root package name */
    private final T7 f5740b;

    /* renamed from: c  reason: collision with root package name */
    private final C0281bd f5741c;

    /* renamed from: d  reason: collision with root package name */
    private final Zc f5742d;

    public C0356ed(Context context) {
        this(C0477ja.a(context).f(), C0477ja.a(context).e(), new Vb(context), new C0256ad(), new Yc());
    }

    public C0331dd a(int i) {
        Map<Long, String> a2 = this.f5739a.a(i);
        Map<Long, String> a3 = this.f5740b.a(i);
        C0632pf pfVar = new C0632pf();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = (LinkedHashMap) a2;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C0632pf.b a4 = this.f5741c.a(((Long) entry.getKey()).longValue(), (String) entry.getValue());
            if (a4 != null) {
                arrayList.add(a4);
            }
        }
        pfVar.f6442a = (C0632pf.b[]) arrayList.toArray(new C0632pf.b[arrayList.size()]);
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) a3;
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            C0632pf.a a5 = this.f5742d.a(((Long) entry2.getKey()).longValue(), (String) entry2.getValue());
            if (a5 != null) {
                arrayList2.add(a5);
            }
        }
        pfVar.f6443b = (C0632pf.a[]) arrayList2.toArray(new C0632pf.a[arrayList2.size()]);
        long j = -1;
        long longValue = a2.isEmpty() ? -1 : ((Long) Collections.max(linkedHashMap.keySet())).longValue();
        if (!a3.isEmpty()) {
            j = ((Long) Collections.max(linkedHashMap2.keySet())).longValue();
        }
        return new C0331dd(longValue, j, pfVar);
    }

    C0356ed(U7 u7, T7 t7, Vb vb, C0256ad adVar, Yc yc) {
        this(u7, t7, new C0281bd(vb, adVar), new Zc(vb, yc));
    }

    C0356ed(U7 u7, T7 t7, C0281bd bdVar, Zc zc) {
        this.f5739a = u7;
        this.f5740b = t7;
        this.f5741c = bdVar;
        this.f5742d = zc;
    }

    public void a(C0331dd ddVar) {
        long j = ddVar.f5658a;
        if (j >= 0) {
            this.f5739a.c(j);
        }
        long j2 = ddVar.f5659b;
        if (j2 >= 0) {
            this.f5740b.c(j2);
        }
    }
}
