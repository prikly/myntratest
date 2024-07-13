package com.yandex.metrica.impl.ob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ln  reason: case insensitive filesystem */
public class C0540ln extends C0441hn<Map<String, String>, Xm> {

    /* renamed from: b  reason: collision with root package name */
    private final C0515kn f6162b;

    /* renamed from: c  reason: collision with root package name */
    private final C0515kn f6163c;

    /* renamed from: d  reason: collision with root package name */
    private Comparator<Map.Entry<String, String>> f6164d;

    /* renamed from: com.yandex.metrica.impl.ob.ln$a */
    class a implements Comparator<Map.Entry<String, String>> {
        a(C0540ln lnVar) {
        }

        public int compare(Object obj, Object obj2) {
            int length = C0267b.b((String) ((Map.Entry) obj).getValue()).length;
            int length2 = C0267b.b((String) ((Map.Entry) obj2).getValue()).length;
            if (length < length2) {
                return -1;
            }
            return length == length2 ? 0 : 1;
        }
    }

    public C0540ln(int i, int i2, int i3) {
        this(i, new C0515kn(i2), new C0515kn(i3));
    }

    public C0540ln(int i, C0515kn knVar, C0515kn knVar2) {
        super(i);
        this.f6164d = new a(this);
        this.f6162b = knVar;
        this.f6163c = knVar2;
    }

    public C0416gn<Map<String, String>, Xm> a(Map<String, String> map) {
        int i;
        HashMap hashMap;
        int i2 = 0;
        if (map != null) {
            hashMap = new HashMap();
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[entrySet.size()]);
            Arrays.sort(entryArr, this.f6164d);
            int length = entryArr.length;
            i = 0;
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            while (i2 < length) {
                Map.Entry entry = entryArr[i2];
                C0416gn<String, Vm> a2 = this.f6162b.a((String) entry.getKey());
                C0416gn<String, Vm> a3 = this.f6163c.a((String) entry.getValue());
                int length2 = C0267b.b((String) entry.getKey()).length + C0267b.b((String) entry.getValue()).length;
                int length3 = C0267b.b((String) a2.f5887a).length + C0267b.b((String) a3.f5887a).length;
                if (z || length3 + i4 > a()) {
                    i3++;
                    i += length2;
                    z = true;
                } else {
                    i = i + a2.f5888b.a() + a3.f5888b.a();
                    i4 += C0267b.b((String) a2.f5887a).length + C0267b.b((String) a3.f5887a).length;
                    hashMap.put(a2.f5887a, a3.f5887a);
                }
                i2++;
            }
            i2 = i3;
        } else {
            hashMap = null;
            i = 0;
        }
        return new C0416gn<>(hashMap, new Xm(i2, i));
    }
}
