package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.common.base.Splitter;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.g.f.c;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Splitter f12054a = Splitter.on(':');

    /* renamed from: b  reason: collision with root package name */
    private static final Splitter f12055b = Splitter.on('*');

    /* renamed from: c  reason: collision with root package name */
    private final List<a> f12056c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private int f12057d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f12058e;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12059a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12060b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12061c;

        public a(int i, long j, int i2) {
            this.f12059a = i;
            this.f12060b = j;
            this.f12061c = i2;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.lang.String r5) throws com.applovin.exoplayer2.ai {
        /*
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1711564334: goto L_0x0034;
                case -1332107749: goto L_0x002a;
                case -1251387154: goto L_0x0020;
                case -830665521: goto L_0x0016;
                case 1760745220: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x003e
        L_0x000c:
            java.lang.String r0 = "Super_SlowMotion_BGM"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 2
            goto L_0x003f
        L_0x0016:
            java.lang.String r0 = "Super_SlowMotion_Deflickering_On"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 4
            goto L_0x003f
        L_0x0020:
            java.lang.String r0 = "Super_SlowMotion_Data"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 1
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "Super_SlowMotion_Edit_Data"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 3
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "SlowMotion_Data"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 0
            goto L_0x003f
        L_0x003e:
            r5 = -1
        L_0x003f:
            if (r5 == 0) goto L_0x005d
            if (r5 == r4) goto L_0x005a
            if (r5 == r3) goto L_0x0057
            if (r5 == r2) goto L_0x0054
            if (r5 != r1) goto L_0x004c
            r5 = 2820(0xb04, float:3.952E-42)
            return r5
        L_0x004c:
            r5 = 0
            java.lang.String r0 = "Invalid SEF name"
            com.applovin.exoplayer2.ai r5 = com.applovin.exoplayer2.ai.b(r0, r5)
            throw r5
        L_0x0054:
            r5 = 2819(0xb03, float:3.95E-42)
            return r5
        L_0x0057:
            r5 = 2817(0xb01, float:3.947E-42)
            return r5
        L_0x005a:
            r5 = 2816(0xb00, float:3.946E-42)
            return r5
        L_0x005d:
            r5 = 2192(0x890, float:3.072E-42)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.g.i.a(java.lang.String):int");
    }

    private static c a(y yVar, int i) throws ai {
        ArrayList arrayList = new ArrayList();
        List<String> splitToList = f12055b.splitToList(yVar.f(i));
        int i2 = 0;
        while (i2 < splitToList.size()) {
            List<String> splitToList2 = f12054a.splitToList(splitToList.get(i2));
            if (splitToList2.size() == 3) {
                try {
                    arrayList.add(new c.a(Long.parseLong(splitToList2.get(0)), Long.parseLong(splitToList2.get(1)), 1 << (Integer.parseInt(splitToList2.get(2)) - 1)));
                    i2++;
                } catch (NumberFormatException e2) {
                    throw ai.b((String) null, e2);
                }
            } else {
                throw ai.b((String) null, (Throwable) null);
            }
        }
        return new c(arrayList);
    }

    private void a(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        y yVar = new y(8);
        iVar.b(yVar.d(), 0, 8);
        this.f12058e = yVar.r() + 8;
        if (yVar.q() != 1397048916) {
            uVar.f12451a = 0;
            return;
        }
        uVar.f12451a = iVar.c() - ((long) (this.f12058e - 12));
        this.f12057d = 2;
    }

    private void a(com.applovin.exoplayer2.e.i iVar, List<a.C0122a> list) throws IOException {
        long c2 = iVar.c();
        int d2 = (int) ((iVar.d() - iVar.c()) - ((long) this.f12058e));
        y yVar = new y(d2);
        iVar.b(yVar.d(), 0, d2);
        for (int i = 0; i < this.f12056c.size(); i++) {
            a aVar = this.f12056c.get(i);
            yVar.d((int) (aVar.f12060b - c2));
            yVar.e(4);
            int r = yVar.r();
            int a2 = a(yVar.f(r));
            int i2 = aVar.f12061c - (r + 8);
            if (a2 == 2192) {
                list.add(a(yVar, i2));
            } else if (!(a2 == 2816 || a2 == 2817 || a2 == 2819 || a2 == 2820)) {
                throw new IllegalStateException();
            }
        }
    }

    private void b(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        long j;
        long d2 = iVar.d();
        int i = (this.f12058e - 12) - 8;
        y yVar = new y(i);
        iVar.b(yVar.d(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            yVar.e(2);
            short l = yVar.l();
            if (l == 2192 || l == 2816 || l == 2817 || l == 2819 || l == 2820) {
                this.f12056c.add(new a(l, (d2 - ((long) this.f12058e)) - ((long) yVar.r()), yVar.r()));
            } else {
                yVar.e(8);
            }
        }
        if (this.f12056c.isEmpty()) {
            j = 0;
        } else {
            this.f12057d = 3;
            j = this.f12056c.get(0).f12060b;
        }
        uVar.f12451a = j;
    }

    public int a(com.applovin.exoplayer2.e.i iVar, u uVar, List<a.C0122a> list) throws IOException {
        int i = this.f12057d;
        long j = 0;
        if (i == 0) {
            long d2 = iVar.d();
            if (d2 != -1 && d2 >= 8) {
                j = d2 - 8;
            }
            uVar.f12451a = j;
            this.f12057d = 1;
        } else if (i == 1) {
            a(iVar, uVar);
        } else if (i == 2) {
            b(iVar, uVar);
        } else if (i == 3) {
            a(iVar, list);
            uVar.f12451a = 0;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    public void a() {
        this.f12056c.clear();
        this.f12057d = 0;
    }
}
