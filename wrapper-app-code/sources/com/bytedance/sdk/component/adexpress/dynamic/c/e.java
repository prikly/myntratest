package com.bytedance.sdk.component.adexpress.dynamic.c;

import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.bytedance.sdk.component.adexpress.dynamic.b.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.f;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.dynamic.b.i;
import com.bytedance.sdk.component.adexpress.dynamic.c.a;
import com.bytedance.sdk.component.utils.l;
import java.util.List;

/* compiled from: DynamicCanvas */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public b f18548a;

    /* renamed from: b  reason: collision with root package name */
    protected a f18549b = new a();

    /* renamed from: c  reason: collision with root package name */
    private h f18550c;

    /* renamed from: d  reason: collision with root package name */
    private a f18551d;

    /* compiled from: DynamicCanvas */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        float f18552a;

        /* renamed from: b  reason: collision with root package name */
        float f18553b;

        /* renamed from: c  reason: collision with root package name */
        float f18554c;

        a() {
        }
    }

    public void a(a aVar) {
        this.f18551d = aVar;
    }

    public void a() {
        this.f18549b.a();
    }

    public void a(h hVar, float f2, float f3) {
        if (hVar != null) {
            this.f18550c = hVar;
        }
        h hVar2 = this.f18550c;
        float g2 = hVar2.g();
        float h2 = hVar2.h();
        float f4 = TextUtils.equals(hVar2.i().e().q(), "fixed") ? h2 : 65536.0f;
        this.f18549b.a();
        this.f18549b.c(hVar2, g2, f4);
        a.c a2 = this.f18549b.a(hVar2);
        b bVar = new b();
        bVar.f18487a = f2;
        bVar.f18488b = f3;
        if (a2 != null) {
            g2 = a2.f18544a;
        }
        bVar.f18489c = g2;
        if (a2 != null) {
            h2 = a2.f18545b;
        }
        bVar.f18490d = h2;
        bVar.f18491e = "root";
        bVar.i = 1280.0f;
        bVar.f18492f = hVar2;
        bVar.f18492f.c(bVar.f18487a);
        bVar.f18492f.d(bVar.f18488b);
        bVar.f18492f.e(bVar.f18489c);
        bVar.f18492f.f(bVar.f18490d);
        b a3 = a(bVar, 0.0f);
        this.f18548a = a3;
        a(a3);
    }

    public void a(b bVar) {
        if (bVar != null) {
            l.b("DynamicCanvas", "native parser: type = " + bVar.f18492f.i().b() + "; width = " + bVar.f18489c + "; height = " + bVar.f18490d + "; x = " + bVar.f18487a + "; y = " + bVar.f18488b);
            List<List<b>> list = bVar.f18493g;
            if (list != null && list.size() > 0) {
                for (List<b> next : list) {
                    if (next != null && next.size() > 0) {
                        for (b a2 : next) {
                            a(a2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0205  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.component.adexpress.dynamic.b.b a(com.bytedance.sdk.component.adexpress.dynamic.b.b r37, float r38) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            com.bytedance.sdk.component.adexpress.dynamic.b.h r2 = r1.f18492f
            if (r2 != 0) goto L_0x0009
            return r1
        L_0x0009:
            r2.r()
            java.util.List r3 = r2.p()
            if (r3 == 0) goto L_0x0409
            int r4 = r3.size()
            if (r4 > 0) goto L_0x001a
            goto L_0x0409
        L_0x001a:
            com.bytedance.sdk.component.adexpress.dynamic.b.e r4 = r2.i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r4 = r4.e()
            float r5 = r4.i()
            float r6 = r4.h()
            float r7 = r4.f()
            float r8 = r4.g()
            float r9 = r4.d()
            java.lang.String r10 = r4.w()
            java.lang.String r11 = r4.x()
            float r12 = r1.f18487a
            float r12 = r12 + r8
            float r13 = r1.f18488b
            float r13 = r13 + r5
            float r14 = r1.f18489c
            float r14 = r14 - r8
            float r14 = r14 - r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 * r6
            float r14 = r14 - r9
            float r8 = r1.f18490d
            float r8 = r8 - r5
            float r8 = r8 - r7
            float r8 = r8 - r9
            com.bytedance.sdk.component.adexpress.dynamic.b.i r5 = new com.bytedance.sdk.component.adexpress.dynamic.b.i
            r5.<init>(r12, r13)
            java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.b>> r7 = r1.f18493g
            if (r7 != 0) goto L_0x0062
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r1.f18493g = r7
        L_0x0062:
            java.util.Iterator r7 = r3.iterator()
            r13 = 0
        L_0x0067:
            boolean r15 = r7.hasNext()
            if (r15 == 0) goto L_0x007f
            java.lang.Object r15 = r7.next()
            java.util.List r15 = (java.util.List) r15
            com.bytedance.sdk.component.adexpress.dynamic.c.a r9 = r0.f18549b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r9 = r9.a((java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.h>) r15)
            if (r9 == 0) goto L_0x0067
            float r9 = r9.f18545b
            float r13 = r13 + r9
            goto L_0x0067
        L_0x007f:
            java.lang.String r7 = "space-between"
            java.lang.String r9 = "space-around"
            java.lang.String r15 = "flex-end"
            java.lang.String r6 = "center"
            r17 = r12
            r12 = 1
            int r18 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r18 >= 0) goto L_0x00d0
            boolean r18 = android.text.TextUtils.equals(r11, r6)
            if (r18 == 0) goto L_0x0099
            float r8 = r8 - r13
            r11 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r11
            goto L_0x00d1
        L_0x0099:
            boolean r18 = android.text.TextUtils.equals(r11, r15)
            if (r18 == 0) goto L_0x00a1
            float r8 = r8 - r13
            goto L_0x00d1
        L_0x00a1:
            boolean r18 = android.text.TextUtils.equals(r11, r9)
            if (r18 == 0) goto L_0x00b5
            float r8 = r8 - r13
            int r11 = r3.size()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r8 = r8 / r11
            float r8 = com.bytedance.sdk.component.adexpress.dynamic.c.k.a(r8)
            r11 = r8
            goto L_0x00d2
        L_0x00b5:
            boolean r11 = android.text.TextUtils.equals(r11, r7)
            if (r11 == 0) goto L_0x00d0
            int r11 = r3.size()
            if (r11 <= r12) goto L_0x00d0
            float r8 = r8 - r13
            int r11 = r3.size()
            int r11 = r11 - r12
            float r11 = (float) r11
            float r8 = r8 / r11
            float r8 = com.bytedance.sdk.component.adexpress.dynamic.c.k.a(r8)
            r11 = r8
            r8 = 0
            goto L_0x00d2
        L_0x00d0:
            r8 = 0
        L_0x00d1:
            r11 = 0
        L_0x00d2:
            float r13 = r5.f18531b
            float r13 = r13 + r8
            r5.f18531b = r13
            r13 = r38
            r8 = 0
        L_0x00da:
            int r12 = r3.size()
            if (r8 >= r12) goto L_0x0407
            java.lang.Object r12 = r3.get(r8)
            java.util.List r12 = (java.util.List) r12
            int r8 = r8 + 1
            r20 = r3
            java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.b>> r3 = r1.f18493g
            int r3 = r3.size()
            if (r8 < r3) goto L_0x011b
            java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.b>> r3 = r1.f18493g
            int r3 = r3.size()
            int r3 = r8 - r3
            r19 = 1
            int r3 = r3 + 1
            r38 = r13
            r13 = 0
        L_0x0101:
            if (r13 >= r3) goto L_0x0118
            r21 = r3
            java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.b>> r3 = r1.f18493g
            r22 = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r3.add(r11)
            int r13 = r13 + 1
            r3 = r21
            r11 = r22
            goto L_0x0101
        L_0x0118:
            r22 = r11
            goto L_0x011f
        L_0x011b:
            r22 = r11
            r38 = r13
        L_0x011f:
            java.util.Iterator r3 = r12.iterator()
            r11 = 0
        L_0x0124:
            boolean r13 = r3.hasNext()
            r21 = r4
            if (r13 == 0) goto L_0x0165
            java.lang.Object r13 = r3.next()
            com.bytedance.sdk.component.adexpress.dynamic.b.h r13 = (com.bytedance.sdk.component.adexpress.dynamic.b.h) r13
            com.bytedance.sdk.component.adexpress.dynamic.b.e r23 = r13.i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r23 = r23.e()
            java.lang.String r4 = r23.r()
            r24 = r3
            int r3 = r23.J()
            java.lang.String r1 = "flex"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 != 0) goto L_0x015e
            r1 = 1
            if (r3 == r1) goto L_0x015e
            r1 = 2
            if (r3 != r1) goto L_0x0153
            goto L_0x015e
        L_0x0153:
            com.bytedance.sdk.component.adexpress.dynamic.c.a r1 = r0.f18549b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r1 = r1.a((com.bytedance.sdk.component.adexpress.dynamic.b.h) r13)
            if (r1 == 0) goto L_0x015e
            float r1 = r1.f18544a
            float r11 = r11 + r1
        L_0x015e:
            r1 = r37
            r4 = r21
            r3 = r24
            goto L_0x0124
        L_0x0165:
            float r1 = r14 - r11
            r3 = 0
            float r1 = java.lang.Math.max(r1, r3)
            java.util.Iterator r4 = r12.iterator()
            r11 = 0
        L_0x0171:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x01a5
            java.lang.Object r13 = r4.next()
            com.bytedance.sdk.component.adexpress.dynamic.b.h r13 = (com.bytedance.sdk.component.adexpress.dynamic.b.h) r13
            com.bytedance.sdk.component.adexpress.dynamic.b.e r16 = r13.i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r16 = r16.e()
            int r3 = r16.J()
            r24 = r4
            r4 = 1
            if (r3 == r4) goto L_0x01a1
            int r3 = r16.J()
            r4 = 2
            if (r3 != r4) goto L_0x0196
            goto L_0x01a1
        L_0x0196:
            com.bytedance.sdk.component.adexpress.dynamic.c.a r3 = r0.f18549b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r3 = r3.a((com.bytedance.sdk.component.adexpress.dynamic.b.h) r13)
            if (r3 == 0) goto L_0x01a1
            float r3 = r3.f18544a
            float r11 = r11 + r3
        L_0x01a1:
            r4 = r24
            r3 = 0
            goto L_0x0171
        L_0x01a5:
            int r3 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r3 >= 0) goto L_0x01f3
            boolean r3 = android.text.TextUtils.equals(r10, r6)
            if (r3 == 0) goto L_0x01b5
            float r3 = r14 - r11
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            goto L_0x01f4
        L_0x01b5:
            boolean r3 = android.text.TextUtils.equals(r10, r15)
            if (r3 == 0) goto L_0x01be
            float r3 = r14 - r11
            goto L_0x01f4
        L_0x01be:
            boolean r3 = android.text.TextUtils.equals(r10, r9)
            if (r3 == 0) goto L_0x01d4
            float r3 = r14 - r11
            int r4 = r12.size()
            r13 = 1
            int r4 = r4 + r13
            float r4 = (float) r4
            float r3 = r3 / r4
            float r3 = com.bytedance.sdk.component.adexpress.dynamic.c.k.a(r3)
            r4 = r3
            goto L_0x01f5
        L_0x01d4:
            r13 = 1
            boolean r3 = android.text.TextUtils.equals(r10, r7)
            if (r3 == 0) goto L_0x01f3
            int r3 = r12.size()
            if (r3 <= r13) goto L_0x01f3
            float r3 = r14 - r11
            int r4 = r12.size()
            float r4 = (float) r4
            r11 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r11
            float r3 = r3 / r4
            float r3 = com.bytedance.sdk.component.adexpress.dynamic.c.k.a(r3)
            r4 = r3
            r3 = 0
            goto L_0x01f5
        L_0x01f3:
            r3 = 0
        L_0x01f4:
            r4 = 0
        L_0x01f5:
            float r11 = r5.f18530a
            float r11 = r11 + r3
            r5.f18530a = r11
            java.util.Iterator r3 = r12.iterator()
            r11 = 0
        L_0x01ff:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x0247
            java.lang.Object r13 = r3.next()
            com.bytedance.sdk.component.adexpress.dynamic.b.h r13 = (com.bytedance.sdk.component.adexpress.dynamic.b.h) r13
            r16 = r3
            com.bytedance.sdk.component.adexpress.dynamic.c.a r3 = r0.f18549b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r3 = r3.a((com.bytedance.sdk.component.adexpress.dynamic.b.h) r13)
            if (r3 == 0) goto L_0x021e
            com.bytedance.sdk.component.adexpress.dynamic.c.a r3 = r0.f18549b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r3 = r3.a((com.bytedance.sdk.component.adexpress.dynamic.b.h) r13)
            float r3 = r3.f18545b
            goto L_0x021f
        L_0x021e:
            r3 = 0
        L_0x021f:
            com.bytedance.sdk.component.adexpress.dynamic.b.e r13 = r13.i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r13 = r13.e()
            r24 = r3
            int r3 = r13.J()
            r25 = r7
            r7 = 1
            if (r3 == r7) goto L_0x023d
            int r3 = r13.J()
            r7 = 2
            if (r3 != r7) goto L_0x023a
            goto L_0x023d
        L_0x023a:
            r3 = r24
            goto L_0x023e
        L_0x023d:
            r3 = 0
        L_0x023e:
            float r11 = java.lang.Math.max(r11, r3)
            r3 = r16
            r7 = r25
            goto L_0x01ff
        L_0x0247:
            r25 = r7
            java.util.Iterator r3 = r12.iterator()
            r13 = r38
        L_0x024f:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x03dd
            java.lang.Object r7 = r3.next()
            com.bytedance.sdk.component.adexpress.dynamic.b.h r7 = (com.bytedance.sdk.component.adexpress.dynamic.b.h) r7
            r38 = r3
            com.bytedance.sdk.component.adexpress.dynamic.c.a r3 = r0.f18549b
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r3 = r3.a((com.bytedance.sdk.component.adexpress.dynamic.b.h) r7)
            com.bytedance.sdk.component.adexpress.dynamic.b.e r16 = r7.i()
            r24 = r9
            com.bytedance.sdk.component.adexpress.dynamic.b.f r9 = r16.e()
            r16 = r10
            int r10 = r9.A()
            float r10 = (float) r10
            r26 = r13
            int r13 = r9.D()
            float r13 = (float) r13
            r27 = r14
            int r14 = r9.B()
            float r14 = (float) r14
            r28 = r4
            int r4 = r9.C()
            float r4 = (float) r4
            r29 = r5
            if (r3 != 0) goto L_0x028f
            r5 = 0
            goto L_0x0291
        L_0x028f:
            float r5 = r3.f18544a
        L_0x0291:
            if (r3 != 0) goto L_0x0297
            r30 = r12
            r3 = 0
            goto L_0x029b
        L_0x0297:
            float r3 = r3.f18545b
            r30 = r12
        L_0x029b:
            java.lang.String r12 = r2.b()
            r31 = r2
            java.lang.String r2 = "root"
            boolean r2 = android.text.TextUtils.equals(r12, r2)
            if (r2 == 0) goto L_0x02ab
            float r2 = (float) r8
            goto L_0x02ad
        L_0x02ab:
            r2 = r26
        L_0x02ad:
            int r12 = r9.J()
            r32 = r8
            r8 = 1
            if (r12 != r8) goto L_0x02c5
            float r8 = r5 - r13
            float r8 = r8 - r4
            float r12 = r3 - r10
            float r12 = r12 - r14
            r26 = r2
            r2 = r37
            com.bytedance.sdk.component.adexpress.dynamic.b.i r8 = r0.a(r2, r9, r8, r12)
            goto L_0x02cb
        L_0x02c5:
            r26 = r2
            r2 = r37
            r8 = r29
        L_0x02cb:
            int r12 = r9.J()
            r33 = r8
            r8 = 2
            if (r12 != r8) goto L_0x02f1
            com.bytedance.sdk.component.adexpress.dynamic.c.a r8 = r0.f18549b
            com.bytedance.sdk.component.adexpress.dynamic.b.h r12 = r0.f18550c
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r8 = r8.a((com.bytedance.sdk.component.adexpress.dynamic.b.h) r12)
            float r12 = r5 - r13
            float r12 = r12 - r4
            float r33 = r3 - r10
            r34 = r1
            float r1 = r33 - r14
            r35 = r7
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r7 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r7.<init>(r12, r1)
            com.bytedance.sdk.component.adexpress.dynamic.b.i r8 = r0.a((com.bytedance.sdk.component.adexpress.dynamic.b.f) r9, (com.bytedance.sdk.component.adexpress.dynamic.c.a.c) r8, (com.bytedance.sdk.component.adexpress.dynamic.c.a.c) r7)
            goto L_0x02f7
        L_0x02f1:
            r34 = r1
            r35 = r7
            r8 = r33
        L_0x02f7:
            java.lang.String r1 = r21.Y()
            int r7 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0338
            java.lang.String r7 = "flex-start"
            boolean r7 = android.text.TextUtils.equals(r1, r7)
            if (r7 != 0) goto L_0x0338
            int r12 = r1.hashCode()
            r7 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r12 == r7) goto L_0x031e
            r7 = 1742952711(0x67e35907, float:2.1472389E24)
            if (r12 == r7) goto L_0x0316
            goto L_0x0326
        L_0x0316:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x0326
            r1 = 1
            goto L_0x0327
        L_0x031e:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0326
            r1 = 0
            goto L_0x0327
        L_0x0326:
            r1 = -1
        L_0x0327:
            if (r1 == 0) goto L_0x0332
            r7 = 1
            if (r1 == r7) goto L_0x032d
            goto L_0x0338
        L_0x032d:
            float r1 = r11 - r3
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x033b
        L_0x0332:
            float r1 = r11 - r3
            r7 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r7
            goto L_0x033b
        L_0x0338:
            r7 = 1073741824(0x40000000, float:2.0)
            r1 = 0
        L_0x033b:
            com.bytedance.sdk.component.adexpress.dynamic.b.b r12 = new com.bytedance.sdk.component.adexpress.dynamic.b.b
            r12.<init>()
            float r7 = r8.f18530a
            float r7 = r7 + r4
            r12.f18487a = r7
            float r7 = r8.f18531b
            float r7 = r7 + r10
            float r7 = r7 + r1
            r12.f18488b = r7
            float r1 = r5 - r13
            float r1 = r1 - r4
            r12.f18489c = r1
            float r3 = r3 - r10
            float r3 = r3 - r14
            r12.f18490d = r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r2.f18491e
            r1.append(r3)
            java.lang.String r3 = "."
            r1.append(r3)
            java.lang.String r3 = r35.b()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r12.f18491e = r1
            r12.f18494h = r2
            r7 = r35
            r12.f18492f = r7
            r1 = r34
            r12.i = r1
            r3 = r30
            r12.j = r3
            com.bytedance.sdk.component.adexpress.dynamic.b.h r4 = r12.f18492f
            float r7 = r12.f18487a
            r4.c(r7)
            com.bytedance.sdk.component.adexpress.dynamic.b.h r4 = r12.f18492f
            float r7 = r12.f18488b
            r4.d(r7)
            com.bytedance.sdk.component.adexpress.dynamic.b.h r4 = r12.f18492f
            float r7 = r12.f18489c
            r4.e(r7)
            com.bytedance.sdk.component.adexpress.dynamic.b.h r4 = r12.f18492f
            float r7 = r12.f18490d
            r4.f(r7)
            r4 = r26
            com.bytedance.sdk.component.adexpress.dynamic.b.b r7 = r0.a(r12, r4)
            java.util.List<java.util.List<com.bytedance.sdk.component.adexpress.dynamic.b.b>> r8 = r2.f18493g
            r10 = r32
            java.lang.Object r8 = r8.get(r10)
            java.util.List r8 = (java.util.List) r8
            r8.add(r7)
            int r7 = r9.J()
            r8 = 1
            if (r7 == r8) goto L_0x03c8
            int r7 = r9.J()
            r9 = 2
            if (r7 == r9) goto L_0x03c5
            r7 = r29
            float r12 = r7.f18530a
            float r5 = r5 + r28
            float r12 = r12 + r5
            r7.f18530a = r12
            goto L_0x03cb
        L_0x03c5:
            r7 = r29
            goto L_0x03cb
        L_0x03c8:
            r7 = r29
            r9 = 2
        L_0x03cb:
            r12 = r3
            r13 = r4
            r5 = r7
            r8 = r10
            r10 = r16
            r9 = r24
            r14 = r27
            r4 = r28
            r2 = r31
            r3 = r38
            goto L_0x024f
        L_0x03dd:
            r31 = r2
            r7 = r5
            r24 = r9
            r16 = r10
            r26 = r13
            r27 = r14
            r12 = r17
            r2 = r37
            r10 = r8
            r8 = 1
            r7.f18530a = r12
            float r1 = r7.f18531b
            float r11 = r11 + r22
            float r1 = r1 + r11
            r7.f18531b = r1
            r1 = r2
            r8 = r10
            r10 = r16
            r3 = r20
            r4 = r21
            r11 = r22
            r7 = r25
            r2 = r31
            goto L_0x00da
        L_0x0407:
            r2 = r1
            return r2
        L_0x0409:
            r2 = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.c.e.a(com.bytedance.sdk.component.adexpress.dynamic.b.b, float):com.bytedance.sdk.component.adexpress.dynamic.b.b");
    }

    private i a(f fVar, a.c cVar, a.c cVar2) {
        float U = (float) fVar.U();
        float W = (float) fVar.W();
        float V = (float) fVar.V();
        float X = (float) fVar.X();
        boolean L = fVar.L();
        boolean M = fVar.M();
        boolean N = fVar.N();
        boolean O = fVar.O();
        if (!L) {
            if (M) {
                U = ((this.f18551d.f18552a != 0.0f ? this.f18551d.f18552a : cVar.f18544a) - V) - cVar2.f18544a;
            } else {
                U = 0.0f;
            }
        }
        if (!N) {
            if (O) {
                W = ((this.f18551d.f18553b != 0.0f ? this.f18551d.f18553b : cVar.f18545b) - X) - cVar2.f18545b;
            } else {
                W = 0.0f;
            }
        }
        return new i(U, W);
    }

    private i a(b bVar, f fVar, float f2, float f3) {
        float f4;
        float f5;
        b bVar2 = bVar;
        float f6 = bVar2.f18487a;
        float f7 = bVar2.f18488b;
        float U = (float) fVar.U();
        float W = (float) fVar.W();
        float V = (float) fVar.V();
        float X = (float) fVar.X();
        boolean L = fVar.L();
        boolean M = fVar.M();
        boolean N = fVar.N();
        boolean O = fVar.O();
        String K = fVar.K();
        float f8 = bVar2.f18489c;
        float f9 = bVar2.f18490d;
        if (TextUtils.equals(K, BuildConfig.ADAPTER_VERSION)) {
            if (L) {
                f6 = bVar2.f18487a + U;
            } else if (M) {
                f6 = ((bVar2.f18487a + f8) - V) - f2;
            }
            if (N) {
                f5 = bVar2.f18488b;
            } else {
                if (O) {
                    f4 = bVar2.f18488b;
                    f7 = ((f4 + f9) - X) - f3;
                }
                return new i(f6, f7);
            }
        } else {
            if (TextUtils.equals(K, "1")) {
                f6 = bVar2.f18487a + ((f8 - f2) / 2.0f);
                if (N) {
                    f5 = bVar2.f18488b;
                } else if (O) {
                    f4 = bVar2.f18488b;
                    f7 = ((f4 + f9) - X) - f3;
                }
            } else if (TextUtils.equals(K, "2")) {
                f7 = bVar2.f18488b + ((f9 - f3) / 2.0f);
                if (L) {
                    f6 = bVar2.f18487a + U;
                } else if (M) {
                    f6 = ((bVar2.f18487a + f8) - V) - f2;
                }
            } else if (TextUtils.equals(K, "3")) {
                f6 = bVar2.f18487a + ((f8 - f2) / 2.0f);
                f7 = bVar2.f18488b + ((f9 - f3) / 2.0f);
            }
            return new i(f6, f7);
        }
        f7 = f5 + W;
        return new i(f6, f7);
    }
}
