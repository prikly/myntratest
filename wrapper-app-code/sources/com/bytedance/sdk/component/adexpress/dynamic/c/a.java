package com.bytedance.sdk.component.adexpress.dynamic.c;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.b.f;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ComputeRuler */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, c> f18532a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map<String, c> f18533b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public Map<String, c> f18534c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private double f18535d = Math.random();

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.component.adexpress.dynamic.c.a.c a(com.bytedance.sdk.component.adexpress.dynamic.b.h r13, float r14, float r15) {
        /*
            r12 = this;
            com.bytedance.sdk.component.adexpress.dynamic.b.e r0 = r13.i()
            java.lang.String r0 = r0.c()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0023
            com.bytedance.sdk.component.adexpress.dynamic.b.e r0 = r13.i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r0 = r0.e()
            java.lang.String r0 = r0.P()
            if (r0 != 0) goto L_0x0023
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r13.<init>(r1, r1)
            return r13
        L_0x0023:
            com.bytedance.sdk.component.adexpress.dynamic.b.e r0 = r13.i()
            java.lang.String r0 = r0.b()
            java.lang.String r2 = "creative-playable-bait"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x0039
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r13.<init>(r1, r1)
            return r13
        L_0x0039:
            float r0 = r13.g()
            float r1 = r13.h()
            com.bytedance.sdk.component.adexpress.dynamic.b.e r2 = r13.i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r2 = r2.e()
            java.lang.String r3 = r2.r()
            java.lang.String r2 = r2.q()
            int r4 = r13.l()
            float r4 = (float) r4
            int r5 = r13.m()
            float r5 = (float) r5
            float r6 = r13.n()
            float r7 = r13.o()
            java.lang.String r8 = "fixed"
            boolean r9 = android.text.TextUtils.equals(r3, r8)
            java.lang.String r10 = "flex"
            java.lang.String r11 = "auto"
            if (r9 == 0) goto L_0x0086
            float r14 = java.lang.Math.min(r0, r14)
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto L_0x00b7
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = r12.b((com.bytedance.sdk.component.adexpress.dynamic.b.h) r13, (float) r0, (float) r1)
            float r13 = r13.f18545b
        L_0x0083:
            float r1 = r13 + r7
            goto L_0x00b7
        L_0x0086:
            boolean r9 = android.text.TextUtils.equals(r3, r11)
            if (r9 == 0) goto L_0x009f
            float r14 = r14 - r6
            float r0 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = r12.b((com.bytedance.sdk.component.adexpress.dynamic.b.h) r13, (float) r14, (float) r0)
            float r14 = r13.f18544a
            float r14 = r14 + r6
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto L_0x00b7
            float r13 = r13.f18545b
            goto L_0x0083
        L_0x009f:
            boolean r3 = android.text.TextUtils.equals(r3, r10)
            if (r3 == 0) goto L_0x00b6
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto L_0x00b7
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = r12.b((com.bytedance.sdk.component.adexpress.dynamic.b.h) r13, (float) r0, (float) r1)
            float r13 = r13.f18545b
            goto L_0x0083
        L_0x00b6:
            r14 = r0
        L_0x00b7:
            java.lang.String r13 = "scale"
            boolean r13 = android.text.TextUtils.equals(r2, r13)
            if (r13 == 0) goto L_0x00da
            float r13 = r14 - r4
            float r13 = r13 / r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r13 = r13 + r5
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d8
            float r13 = r15 - r5
            float r13 = r13 * r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r14 = r13 + r4
            goto L_0x00ee
        L_0x00d8:
            r15 = r13
            goto L_0x00ee
        L_0x00da:
            boolean r13 = android.text.TextUtils.equals(r2, r8)
            if (r13 == 0) goto L_0x00e6
            float r1 = r1 + r5
            float r15 = java.lang.Math.min(r1, r15)
            goto L_0x00ee
        L_0x00e6:
            boolean r13 = android.text.TextUtils.equals(r2, r10)
            if (r13 == 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r15 = r1
        L_0x00ee:
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r13.<init>()
            r13.f18544a = r14
            r13.f18545b = r15
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.c.a.a(com.bytedance.sdk.component.adexpress.dynamic.b.h, float, float):com.bytedance.sdk.component.adexpress.dynamic.c.a$c");
    }

    public c b(h hVar, float f2, float f3) {
        c cVar = new c();
        if (hVar.i().e() == null) {
            return cVar;
        }
        c e2 = e(hVar, f2, f3);
        float f4 = e2.f18544a;
        float f5 = e2.f18545b;
        cVar.f18544a = Math.min(f4, f2);
        cVar.f18545b = Math.min(f5, f3);
        return cVar;
    }

    private c e(h hVar, float f2, float f3) {
        String str = hVar.b() + "_" + f2 + "_" + f3;
        if (this.f18534c.containsKey(str)) {
            return this.f18534c.get(str);
        }
        c f4 = f(hVar, f2, f3);
        this.f18534c.put(str, f4);
        return f4;
    }

    private c f(h hVar, float f2, float f3) {
        new c();
        f e2 = hVar.i().e();
        hVar.i().c();
        e2.G();
        float j = e2.j();
        int F = e2.F();
        double E = e2.E();
        int H = e2.H();
        boolean y = e2.y();
        boolean I = e2.I();
        int z = e2.z();
        b bVar = new b();
        bVar.f18539a = j;
        bVar.f18540b = F;
        bVar.f18541c = H;
        bVar.f18542d = E;
        bVar.f18543e = f2;
        return a(hVar.i().c(), bVar, y, I, z, hVar);
    }

    private c a(String str, b bVar, boolean z, boolean z2, int i, h hVar) {
        return l.a(str, hVar.i().b(), b.a(bVar).toString(), z, z2, i);
    }

    public c c(h hVar, float f2, float f3) {
        if (hVar == null) {
            return null;
        }
        c a2 = a(hVar);
        if (a2 != null && (a2.f18544a != 0.0f || a2.f18545b != 0.0f)) {
            return a2;
        }
        c d2 = d(hVar, f2, f3);
        a(hVar, d2);
        return d2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.component.adexpress.dynamic.c.a.c d(com.bytedance.sdk.component.adexpress.dynamic.b.h r19, float r20, float r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r3 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r3.<init>()
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x011b
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 > 0) goto L_0x0016
            goto L_0x011b
        L_0x0016:
            boolean r5 = r19.q()
            if (r5 == 0) goto L_0x0021
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r1 = r18.a((com.bytedance.sdk.component.adexpress.dynamic.b.h) r19, (float) r20, (float) r21)
            return r1
        L_0x0021:
            float r5 = r19.g()
            float r6 = r19.h()
            float r7 = r19.n()
            float r8 = r19.o()
            com.bytedance.sdk.component.adexpress.dynamic.b.e r9 = r19.i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r9 = r9.e()
            java.lang.String r10 = r9.r()
            java.lang.String r9 = r9.q()
            java.lang.String r11 = "flex"
            boolean r12 = android.text.TextUtils.equals(r10, r11)
            java.lang.String r13 = "auto"
            if (r12 != 0) goto L_0x0057
            boolean r12 = android.text.TextUtils.equals(r10, r13)
            if (r12 == 0) goto L_0x0052
            goto L_0x0057
        L_0x0052:
            float r5 = java.lang.Math.min(r5, r1)
            goto L_0x0058
        L_0x0057:
            r5 = r1
        L_0x0058:
            float r5 = r5 - r7
            java.lang.String r12 = "scale"
            boolean r12 = android.text.TextUtils.equals(r9, r12)
            if (r12 == 0) goto L_0x0077
            float r12 = r5 / r6
            int r12 = java.lang.Math.round(r12)
            float r12 = (float) r12
            float r12 = r12 + r8
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 <= 0) goto L_0x008a
            float r5 = r2 - r8
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            goto L_0x0089
        L_0x0077:
            boolean r12 = android.text.TextUtils.equals(r9, r13)
            if (r12 != 0) goto L_0x0089
            boolean r12 = android.text.TextUtils.equals(r9, r11)
            if (r12 == 0) goto L_0x0084
            goto L_0x0089
        L_0x0084:
            float r12 = java.lang.Math.min(r6, r2)
            goto L_0x008a
        L_0x0089:
            r12 = r2
        L_0x008a:
            float r12 = r12 - r8
            java.util.List r6 = r19.p()
            java.util.Iterator r14 = r6.iterator()
            r15 = 0
            r16 = 0
        L_0x0096:
            boolean r17 = r14.hasNext()
            if (r17 == 0) goto L_0x00c4
            java.lang.Object r17 = r14.next()
            r1 = r17
            java.util.List r1 = (java.util.List) r1
            r19 = r14
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r14 = r0.b((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.h>) r1, (float) r5, (float) r12)
            boolean r1 = r0.b((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.h>) r1)
            if (r1 == 0) goto L_0x00b4
            r1 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 + r1
            goto L_0x00bb
        L_0x00b4:
            float r1 = r14.f18544a
            float r1 = java.lang.Math.max(r15, r1)
            r15 = r1
        L_0x00bb:
            float r1 = r14.f18545b
            float r16 = r16 + r1
            r14 = r19
            r1 = r20
            goto L_0x0096
        L_0x00c4:
            boolean r1 = android.text.TextUtils.equals(r10, r13)
            if (r1 == 0) goto L_0x00ed
            int r1 = r6.size()
            float r1 = (float) r1
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00d6
            r15 = r20
            goto L_0x00ee
        L_0x00d6:
            java.util.Iterator r1 = r6.iterator()
        L_0x00da:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00ee
            java.lang.Object r4 = r1.next()
            java.util.List r4 = (java.util.List) r4
            r0.c((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.h>) r4)
            r0.b((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.h>) r4, (float) r15, (float) r12)
            goto L_0x00da
        L_0x00ed:
            r15 = r5
        L_0x00ee:
            boolean r1 = android.text.TextUtils.equals(r9, r13)
            if (r1 == 0) goto L_0x00ff
            int r1 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x00fb
            r12 = r16
            goto L_0x0114
        L_0x00fb:
            r0.a((java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.h>>) r6, (float) r15, (float) r12)
            goto L_0x0114
        L_0x00ff:
            java.lang.String r1 = "fixed"
            boolean r1 = android.text.TextUtils.equals(r9, r1)
            if (r1 != 0) goto L_0x010d
            boolean r1 = android.text.TextUtils.equals(r9, r11)
            if (r1 == 0) goto L_0x0114
        L_0x010d:
            int r1 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x0114
            r0.a((java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.h>>) r6, (float) r15, (float) r12)
        L_0x0114:
            float r15 = r15 + r7
            float r12 = r12 + r8
            r3.f18544a = r15
            r3.f18545b = r12
            return r3
        L_0x011b:
            r3.f18544a = r4
            r3.f18545b = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.c.a.d(com.bytedance.sdk.component.adexpress.dynamic.b.h, float, float):com.bytedance.sdk.component.adexpress.dynamic.c.a$c");
    }

    private void a(List<List<h>> list, float f2, float f3) {
        float f4;
        if (list != null && list.size() > 0) {
            boolean z = false;
            for (List<h> a2 : list) {
                if (a(a2, false)) {
                    z = true;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (List next : list) {
                C0227a aVar = new C0227a();
                boolean a3 = a((List<h>) next, !z);
                c b2 = b((List<h>) next, f2, f3);
                if (a3) {
                    f4 = 1.0f;
                } else {
                    f4 = b2.f18545b;
                }
                aVar.f18536a = f4;
                aVar.f18537b = !a3;
                arrayList.add(aVar);
            }
            List<C0227a> a4 = k.a(f3, arrayList);
            for (int i = 0; i < list.size(); i++) {
                if (((C0227a) arrayList.get(i)).f18536a != a4.get(i).f18536a) {
                    List list2 = list.get(i);
                    c((List<h>) list2);
                    b((List<h>) list2, f2, a4.get(i).f18536a);
                }
            }
        }
    }

    private boolean b(List<h> list) {
        boolean z;
        List<List<h>> p;
        Iterator<h> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (TextUtils.equals(it.next().i().e().r(), "flex")) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return true;
        }
        Iterator<h> it2 = list.iterator();
        while (true) {
            boolean z2 = false;
            while (true) {
                if (!it2.hasNext()) {
                    return z2;
                }
                h next = it2.next();
                if (TextUtils.equals(next.i().e().r(), "auto") && (p = next.p()) != null) {
                    Iterator<List<h>> it3 = p.iterator();
                    int i = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            continue;
                            break;
                        }
                        List next2 = it3.next();
                        i++;
                        if (b((List<h>) next2)) {
                            if (i == next2.size()) {
                                z2 = true;
                            }
                        }
                    }
                }
            }
        }
    }

    private c b(List<h> list, float f2, float f3) {
        c a2 = a(list);
        if (a2 != null && (a2.f18544a != 0.0f || a2.f18545b != 0.0f)) {
            return a2;
        }
        c c2 = c(list, f2, f3);
        a(list, c2);
        return c2;
    }

    private c c(List<h> list, float f2, float f3) {
        float f4;
        d(list);
        c cVar = new c();
        ArrayList<h> arrayList = new ArrayList<>();
        ArrayList<h> arrayList2 = new ArrayList<>();
        for (h next : list) {
            f e2 = next.i().e();
            if (e2.J() == 1 || e2.J() == 2) {
                arrayList.add(next);
            }
            if (!(e2.J() == 1 || e2.J() == 2)) {
                arrayList2.add(next);
            }
        }
        for (h c2 : arrayList) {
            c(c2, f2, f3);
        }
        if (arrayList2.size() <= 0) {
            return cVar;
        }
        ArrayList arrayList3 = new ArrayList();
        for (h c3 : arrayList2) {
            arrayList3.add(Float.valueOf(c(c3, f2, f3).f18544a));
        }
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        while (true) {
            f4 = 0.0f;
            if (i >= arrayList2.size()) {
                break;
            }
            h hVar = (h) arrayList2.get(i);
            String r = hVar.i().e().r();
            float g2 = hVar.g();
            boolean equals = TextUtils.equals(r, "flex");
            if (TextUtils.equals(r, "auto")) {
                List<List<h>> p = hVar.p();
                if (p != null && p.size() > 0) {
                    Iterator<List<h>> it = p.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (b(it.next())) {
                                equals = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                equals = false;
            }
            C0227a aVar = new C0227a();
            if (!equals) {
                g2 = ((Float) arrayList3.get(i)).floatValue();
            }
            aVar.f18536a = g2;
            aVar.f18537b = !equals;
            if (equals) {
                f4 = ((Float) arrayList3.get(i)).floatValue();
            }
            aVar.f18538c = f4;
            arrayList4.add(aVar);
            i++;
        }
        a((List<C0227a>) arrayList4, f2, (List<h>) arrayList2);
        List<C0227a> a2 = k.a(f2, arrayList4);
        float f5 = 0.0f;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            f5 += a2.get(i2).f18536a;
            if (((Float) arrayList3.get(i2)).floatValue() != a2.get(i2).f18536a) {
                d((h) arrayList2.get(i2));
            }
        }
        Iterator it2 = arrayList2.iterator();
        int i3 = 0;
        boolean z = false;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            i3++;
            if (!b((h) it2.next())) {
                z = false;
                break;
            } else if (i3 == arrayList2.size()) {
                z = true;
            }
        }
        if (z) {
            f4 = f3;
        }
        ArrayList<c> arrayList5 = new ArrayList<>();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            h hVar2 = (h) arrayList2.get(i4);
            c c4 = c(hVar2, a2.get(i4).f18536a, f3);
            if (!b(hVar2)) {
                f4 = Math.max(f4, c4.f18545b);
            }
            arrayList5.add(c4);
        }
        ArrayList arrayList6 = new ArrayList();
        for (c cVar2 : arrayList5) {
            arrayList6.add(Float.valueOf(cVar2.f18545b));
        }
        if (!z) {
            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                h hVar3 = (h) arrayList2.get(i5);
                if (b(hVar3) && ((Float) arrayList6.get(i5)).floatValue() != f4) {
                    d(hVar3);
                    c(hVar3, a2.get(i5).f18536a, f4);
                }
            }
        }
        cVar.f18544a = f5;
        cVar.f18545b = f4;
        return cVar;
    }

    private boolean b(h hVar) {
        if (hVar == null) {
            return false;
        }
        if (TextUtils.equals(hVar.i().e().q(), "flex")) {
            return true;
        }
        return c(hVar);
    }

    private boolean c(h hVar) {
        List<List<h>> p;
        if (!hVar.q() && TextUtils.equals(hVar.i().e().q(), "auto") && (p = hVar.p()) != null && p.size() > 0) {
            if (p.size() == 1) {
                for (h b2 : p.get(0)) {
                    if (!b(b2)) {
                        return false;
                    }
                }
                return true;
            }
            for (List<h> a2 : p) {
                if (a(a2, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(List<h> list, boolean z) {
        boolean z2;
        Iterator<h> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            String q = it.next().i().e().q();
            if (!TextUtils.equals(q, "flex") && (!z || !TextUtils.equals(q, "flex"))) {
            }
        }
        z2 = true;
        if (z2) {
            return true;
        }
        for (h c2 : list) {
            if (c(c2)) {
                return true;
            }
        }
        return false;
    }

    private void a(List<C0227a> list, float f2, List<h> list2) {
        float f3 = 0.0f;
        for (C0227a next : list) {
            if (next.f18537b) {
                f3 += next.f18536a;
            }
        }
        if (f3 > f2) {
            int i = 0;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (list.get(i2).f18537b && list2.get(i2).s()) {
                    i++;
                }
            }
            if (i > 0) {
                float ceil = (float) (Math.ceil((double) (((f3 - f2) / ((float) i)) * 1000.0f)) / 1000.0d);
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    C0227a aVar = list.get(i3);
                    if (aVar.f18537b && list2.get(i3).s()) {
                        aVar.f18536a -= ceil;
                    }
                }
            }
        }
    }

    public void a() {
        this.f18534c.clear();
        this.f18532a.clear();
        this.f18533b.clear();
    }

    public c a(h hVar) {
        return this.f18532a.get(e(hVar));
    }

    public c a(List<h> list) {
        return this.f18533b.get(d(list));
    }

    private void d(h hVar) {
        this.f18532a.remove(e(hVar));
        List<List<h>> p = hVar.p();
        if (p != null && p.size() > 0) {
            for (List<h> c2 : p) {
                c(c2);
            }
        }
    }

    private void c(List<h> list) {
        if (list != null && list.size() > 0) {
            this.f18533b.remove(d(list));
            for (h d2 : list) {
                d(d2);
            }
        }
    }

    private String e(h hVar) {
        return hVar.b();
    }

    private String d(List<h> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            String b2 = list.get(i).b();
            if (i < list.size() - 1) {
                sb.append(b2);
                sb.append("-");
            } else {
                sb.append(b2);
            }
        }
        return sb.toString();
    }

    private void a(h hVar, c cVar) {
        this.f18532a.put(e(hVar), cVar);
    }

    private void a(List<h> list, c cVar) {
        this.f18533b.put(d(list), cVar);
    }

    /* compiled from: ComputeRuler */
    static class c {

        /* renamed from: a  reason: collision with root package name */
        float f18544a;

        /* renamed from: b  reason: collision with root package name */
        float f18545b;

        public c() {
        }

        public c(float f2, float f3) {
            this.f18544a = f2;
            this.f18545b = f3;
        }

        public String toString() {
            return "UnitSize{width=" + this.f18544a + ", height=" + this.f18545b + '}';
        }
    }

    /* compiled from: ComputeRuler */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        float f18539a;

        /* renamed from: b  reason: collision with root package name */
        int f18540b;

        /* renamed from: c  reason: collision with root package name */
        int f18541c;

        /* renamed from: d  reason: collision with root package name */
        double f18542d;

        /* renamed from: e  reason: collision with root package name */
        float f18543e;

        b() {
        }

        static JSONObject a(b bVar) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", (double) bVar.f18539a);
                jSONObject.put("letterSpacing", bVar.f18540b);
                jSONObject.put("lineHeight", bVar.f18542d);
                jSONObject.put("maxWidth", (double) bVar.f18543e);
                jSONObject.put("fontWeight", bVar.f18541c);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.a$a  reason: collision with other inner class name */
    /* compiled from: ComputeRuler */
    static class C0227a implements Cloneable {

        /* renamed from: a  reason: collision with root package name */
        float f18536a;

        /* renamed from: b  reason: collision with root package name */
        boolean f18537b;

        /* renamed from: c  reason: collision with root package name */
        float f18538c;

        C0227a() {
        }

        public Object clone() {
            try {
                return (C0227a) super.clone();
            } catch (CloneNotSupportedException e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }
}
