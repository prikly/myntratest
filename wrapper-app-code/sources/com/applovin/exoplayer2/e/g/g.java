package com.applovin.exoplayer2.e.g;

import android.util.Pair;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.b.c;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.e.g.a;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.r;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.g.f.b;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public final class g implements h, v {

    /* renamed from: a  reason: collision with root package name */
    public static final l f12039a = $$Lambda$g$0AHKgn45xH3VxUATAkMAzUw_7_E.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    private final int f12040b;

    /* renamed from: c  reason: collision with root package name */
    private final y f12041c;

    /* renamed from: d  reason: collision with root package name */
    private final y f12042d;

    /* renamed from: e  reason: collision with root package name */
    private final y f12043e;

    /* renamed from: f  reason: collision with root package name */
    private final y f12044f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque<a.C0116a> f12045g;

    /* renamed from: h  reason: collision with root package name */
    private final i f12046h;
    private final List<a.C0122a> i;
    private int j;
    private int k;
    private long l;
    private int m;
    private y n;
    private int o;
    private int p;
    private int q;
    private int r;
    private j s;
    private a[] t;
    private long[][] u;
    private int v;
    private long w;
    private int x;
    private b y;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final k f12047a;

        /* renamed from: b  reason: collision with root package name */
        public final n f12048b;

        /* renamed from: c  reason: collision with root package name */
        public final x f12049c;

        /* renamed from: d  reason: collision with root package name */
        public int f12050d;

        public a(k kVar, n nVar, x xVar) {
            this.f12047a = kVar;
            this.f12048b = nVar;
            this.f12049c = xVar;
        }
    }

    public g() {
        this(0);
    }

    public g(int i2) {
        this.f12040b = i2;
        this.j = (i2 & 4) != 0 ? 3 : 0;
        this.f12046h = new i();
        this.i = new ArrayList();
        this.f12044f = new y(16);
        this.f12045g = new ArrayDeque<>();
        this.f12041c = new y(com.applovin.exoplayer2.l.v.f13581a);
        this.f12042d = new y(4);
        this.f12043e = new y();
        this.o = -1;
    }

    private static int a(int i2) {
        if (i2 != 1751476579) {
            return i2 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int a(n nVar, long j2) {
        int a2 = nVar.a(j2);
        return a2 == -1 ? nVar.b(j2) : a2;
    }

    private static int a(y yVar) {
        yVar.d(8);
        int a2 = a(yVar.q());
        if (a2 != 0) {
            return a2;
        }
        yVar.e(4);
        while (yVar.a() > 0) {
            int a3 = a(yVar.q());
            if (a3 != 0) {
                return a3;
            }
        }
        return 0;
    }

    private static long a(n nVar, long j2, long j3) {
        int a2 = a(nVar, j2);
        return a2 == -1 ? j3 : Math.min(nVar.f12086c[a2], j3);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ k a(k kVar) {
        return kVar;
    }

    private void a(a.C0116a aVar) throws ai {
        com.applovin.exoplayer2.g.a aVar2;
        com.applovin.exoplayer2.g.a aVar3;
        int i2;
        List<n> list;
        ArrayList arrayList;
        a.C0116a aVar4 = aVar;
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.x == 1;
        r rVar = new r();
        a.b d2 = aVar4.d(1969517665);
        if (d2 != null) {
            Pair<com.applovin.exoplayer2.g.a, com.applovin.exoplayer2.g.a> a2 = b.a(d2);
            com.applovin.exoplayer2.g.a aVar5 = (com.applovin.exoplayer2.g.a) a2.first;
            com.applovin.exoplayer2.g.a aVar6 = (com.applovin.exoplayer2.g.a) a2.second;
            if (aVar5 != null) {
                rVar.a(aVar5);
            }
            aVar3 = aVar6;
            aVar2 = aVar5;
        } else {
            aVar3 = null;
            aVar2 = null;
        }
        a.C0116a e2 = aVar4.e(1835365473);
        com.applovin.exoplayer2.g.a a3 = e2 != null ? b.a(e2) : null;
        List<n> a4 = b.a(aVar, rVar, -9223372036854775807L, (e) null, (this.f12040b & 1) != 0, z, (Function<k, k>) $$Lambda$g$63yPC0iSamo2bG8FUE7OCQhmrAE.INSTANCE);
        j jVar = (j) com.applovin.exoplayer2.l.a.b(this.s);
        int size = a4.size();
        int i3 = 0;
        int i4 = -1;
        long j2 = -9223372036854775807L;
        while (i3 < size) {
            n nVar = a4.get(i3);
            if (nVar.f12085b == 0) {
                list = a4;
                i2 = size;
                arrayList = arrayList2;
            } else {
                k kVar = nVar.f12084a;
                int i5 = i4;
                arrayList = arrayList2;
                long j3 = kVar.f12067e != -9223372036854775807L ? kVar.f12067e : nVar.f12091h;
                long max = Math.max(j2, j3);
                list = a4;
                i2 = size;
                a aVar7 = new a(kVar, nVar, jVar.a(i3, kVar.f12064b));
                long j4 = max;
                v.a a5 = kVar.f12068f.a();
                a5.f(nVar.f12088e + 30);
                if (kVar.f12064b == 2 && j3 > 0 && nVar.f12085b > 1) {
                    a5.a(((float) nVar.f12085b) / (((float) j3) / 1000000.0f));
                }
                f.a(kVar.f12064b, rVar, a5);
                int i6 = kVar.f12064b;
                com.applovin.exoplayer2.g.a[] aVarArr = new com.applovin.exoplayer2.g.a[2];
                aVarArr[0] = aVar3;
                aVarArr[1] = this.i.isEmpty() ? null : new com.applovin.exoplayer2.g.a((List<? extends a.C0122a>) this.i);
                f.a(i6, aVar2, a3, a5, aVarArr);
                aVar7.f12049c.a(a5.a());
                int i7 = i5;
                if (kVar.f12064b == 2) {
                    if (i7 == -1) {
                        i4 = arrayList.size();
                        arrayList.add(aVar7);
                        j2 = j4;
                    }
                }
                i4 = i7;
                arrayList.add(aVar7);
                j2 = j4;
            }
            i3++;
            arrayList2 = arrayList;
            a4 = list;
            size = i2;
        }
        this.v = i4;
        this.w = j2;
        a[] aVarArr2 = (a[]) arrayList2.toArray(new a[0]);
        this.t = aVarArr2;
        this.u = a(aVarArr2);
        jVar.a();
        jVar.a(this);
    }

    private static long[][] a(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            jArr[i2] = new long[aVarArr[i2].f12048b.f12085b];
            jArr2[i2] = aVarArr[i2].f12048b.f12089f[0];
        }
        long j2 = 0;
        int i3 = 0;
        while (i3 < aVarArr.length) {
            long j3 = Long.MAX_VALUE;
            int i4 = -1;
            for (int i5 = 0; i5 < aVarArr.length; i5++) {
                if (!zArr[i5] && jArr2[i5] <= j3) {
                    j3 = jArr2[i5];
                    i4 = i5;
                }
            }
            int i6 = iArr[i4];
            jArr[i4][i6] = j2;
            j2 += (long) aVarArr[i4].f12048b.f12087d[i6];
            int i7 = i6 + 1;
            iArr[i4] = i7;
            if (i7 < jArr[i4].length) {
                jArr2[i4] = aVarArr[i4].f12048b.f12089f[i7];
            } else {
                zArr[i4] = true;
                i3++;
            }
        }
        return jArr;
    }

    private void b(long j2) throws ai {
        while (!this.f12045g.isEmpty() && this.f12045g.peek().f11982b == j2) {
            a.C0116a pop = this.f12045g.pop();
            if (pop.f11981a == 1836019574) {
                a(pop);
                this.f12045g.clear();
                this.j = 2;
            } else if (!this.f12045g.isEmpty()) {
                this.f12045g.peek().a(pop);
            }
        }
        if (this.j != 2) {
            d();
        }
    }

    private static boolean b(int i2) {
        return i2 == 1835296868 || i2 == 1836476516 || i2 == 1751411826 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1937011571 || i2 == 1668576371 || i2 == 1701606260 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1953196132 || i2 == 1718909296 || i2 == 1969517665 || i2 == 1801812339 || i2 == 1768715124;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(com.applovin.exoplayer2.e.i r9) throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r8.m
            r1 = 1
            r2 = 8
            r3 = 0
            if (r0 != 0) goto L_0x002f
            com.applovin.exoplayer2.l.y r0 = r8.f12044f
            byte[] r0 = r0.d()
            boolean r0 = r9.a(r0, r3, r2, r1)
            if (r0 != 0) goto L_0x0018
            r8.e()
            return r3
        L_0x0018:
            r8.m = r2
            com.applovin.exoplayer2.l.y r0 = r8.f12044f
            r0.d(r3)
            com.applovin.exoplayer2.l.y r0 = r8.f12044f
            long r4 = r0.o()
            r8.l = r4
            com.applovin.exoplayer2.l.y r0 = r8.f12044f
            int r0 = r0.q()
            r8.k = r0
        L_0x002f:
            long r4 = r8.l
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x004e
            com.applovin.exoplayer2.l.y r0 = r8.f12044f
            byte[] r0 = r0.d()
            r9.b(r0, r2, r2)
            int r0 = r8.m
            int r0 = r0 + r2
            r8.m = r0
            com.applovin.exoplayer2.l.y r0 = r8.f12044f
            long r4 = r0.y()
        L_0x004b:
            r8.l = r4
            goto L_0x0078
        L_0x004e:
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0078
            long r4 = r9.d()
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x006a
            java.util.ArrayDeque<com.applovin.exoplayer2.e.g.a$a> r0 = r8.f12045g
            java.lang.Object r0 = r0.peek()
            com.applovin.exoplayer2.e.g.a$a r0 = (com.applovin.exoplayer2.e.g.a.C0116a) r0
            if (r0 == 0) goto L_0x006a
            long r4 = r0.f11982b
        L_0x006a:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0078
            long r6 = r9.c()
            long r4 = r4 - r6
            int r0 = r8.m
            long r6 = (long) r0
            long r4 = r4 + r6
            goto L_0x004b
        L_0x0078:
            long r4 = r8.l
            int r0 = r8.m
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0108
            int r0 = r8.k
            boolean r0 = c((int) r0)
            if (r0 == 0) goto L_0x00c0
            long r2 = r9.c()
            long r4 = r8.l
            long r2 = r2 + r4
            int r0 = r8.m
            long r6 = (long) r0
            long r2 = r2 - r6
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00a3
            int r0 = r8.k
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r0 != r4) goto L_0x00a3
            r8.c((com.applovin.exoplayer2.e.i) r9)
        L_0x00a3:
            java.util.ArrayDeque<com.applovin.exoplayer2.e.g.a$a> r9 = r8.f12045g
            com.applovin.exoplayer2.e.g.a$a r0 = new com.applovin.exoplayer2.e.g.a$a
            int r4 = r8.k
            r0.<init>(r4, r2)
            r9.push(r0)
            long r4 = r8.l
            int r9 = r8.m
            long r6 = (long) r9
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x00bc
            r8.b((long) r2)
            goto L_0x0107
        L_0x00bc:
            r8.d()
            goto L_0x0107
        L_0x00c0:
            int r0 = r8.k
            boolean r0 = b((int) r0)
            if (r0 == 0) goto L_0x00f7
            int r9 = r8.m
            if (r9 != r2) goto L_0x00ce
            r9 = 1
            goto L_0x00cf
        L_0x00ce:
            r9 = 0
        L_0x00cf:
            com.applovin.exoplayer2.l.a.b((boolean) r9)
            long r4 = r8.l
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x00dd
            r9 = 1
            goto L_0x00de
        L_0x00dd:
            r9 = 0
        L_0x00de:
            com.applovin.exoplayer2.l.a.b((boolean) r9)
            com.applovin.exoplayer2.l.y r9 = new com.applovin.exoplayer2.l.y
            long r4 = r8.l
            int r0 = (int) r4
            r9.<init>((int) r0)
            com.applovin.exoplayer2.l.y r0 = r8.f12044f
            byte[] r0 = r0.d()
            byte[] r4 = r9.d()
            java.lang.System.arraycopy(r0, r3, r4, r3, r2)
            goto L_0x0103
        L_0x00f7:
            long r2 = r9.c()
            int r9 = r8.m
            long r4 = (long) r9
            long r2 = r2 - r4
            r8.e(r2)
            r9 = 0
        L_0x0103:
            r8.n = r9
            r8.j = r1
        L_0x0107:
            return r1
        L_0x0108:
            java.lang.String r9 = "Atom size less than header length (unsupported)."
            com.applovin.exoplayer2.ai r9 = com.applovin.exoplayer2.ai.a(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.g.g.b(com.applovin.exoplayer2.e.i):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(com.applovin.exoplayer2.e.i r10, com.applovin.exoplayer2.e.u r11) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.l
            int r2 = r9.m
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.c()
            long r2 = r2 + r0
            com.applovin.exoplayer2.l.y r4 = r9.n
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0044
            byte[] r11 = r4.d()
            int r7 = r9.m
            int r1 = (int) r0
            r10.b(r11, r7, r1)
            int r10 = r9.k
            r11 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r11) goto L_0x0029
            int r10 = a((com.applovin.exoplayer2.l.y) r4)
            r9.x = r10
            goto L_0x004f
        L_0x0029:
            java.util.ArrayDeque<com.applovin.exoplayer2.e.g.a$a> r10 = r9.f12045g
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x004f
            java.util.ArrayDeque<com.applovin.exoplayer2.e.g.a$a> r10 = r9.f12045g
            java.lang.Object r10 = r10.peek()
            com.applovin.exoplayer2.e.g.a$a r10 = (com.applovin.exoplayer2.e.g.a.C0116a) r10
            com.applovin.exoplayer2.e.g.a$b r11 = new com.applovin.exoplayer2.e.g.a$b
            int r0 = r9.k
            r11.<init>(r0, r4)
            r10.a((com.applovin.exoplayer2.e.g.a.b) r11)
            goto L_0x004f
        L_0x0044:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0051
            int r11 = (int) r0
            r10.b(r11)
        L_0x004f:
            r10 = 0
            goto L_0x0059
        L_0x0051:
            long r7 = r10.c()
            long r7 = r7 + r0
            r11.f12451a = r7
            r10 = 1
        L_0x0059:
            r9.b((long) r2)
            if (r10 == 0) goto L_0x0064
            int r10 = r9.j
            r11 = 2
            if (r10 == r11) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.g.g.b(com.applovin.exoplayer2.e.i, com.applovin.exoplayer2.e.u):boolean");
    }

    private int c(long j2) {
        int i2 = -1;
        int i3 = -1;
        long j3 = Long.MAX_VALUE;
        boolean z = true;
        long j4 = Long.MAX_VALUE;
        boolean z2 = true;
        long j5 = Long.MAX_VALUE;
        for (int i4 = 0; i4 < ((a[]) com.applovin.exoplayer2.l.ai.a(this.t)).length; i4++) {
            a aVar = this.t[i4];
            int i5 = aVar.f12050d;
            if (i5 != aVar.f12048b.f12085b) {
                long j6 = aVar.f12048b.f12086c[i5];
                long j7 = ((long[][]) com.applovin.exoplayer2.l.ai.a(this.u))[i4][i5];
                long j8 = j6 - j2;
                boolean z3 = j8 < 0 || j8 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j8 < j5)) {
                    z2 = z3;
                    j5 = j8;
                    i3 = i4;
                    j4 = j7;
                }
                if (j7 < j3) {
                    z = z3;
                    i2 = i4;
                    j3 = j7;
                }
            }
        }
        return (j3 == Long.MAX_VALUE || !z || j4 < j3 + 10485760) ? i3 : i2;
    }

    private int c(i iVar, u uVar) throws IOException {
        int a2 = this.f12046h.a(iVar, uVar, this.i);
        if (a2 == 1 && uVar.f12451a == 0) {
            d();
        }
        return a2;
    }

    private void c(i iVar) throws IOException {
        this.f12043e.a(8);
        iVar.d(this.f12043e.d(), 0, 8);
        b.a(this.f12043e);
        iVar.b(this.f12043e.c());
        iVar.a();
    }

    private static boolean c(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1701082227 || i2 == 1835365473;
    }

    private int d(i iVar, u uVar) throws IOException {
        long c2 = iVar.c();
        if (this.o == -1) {
            int c3 = c(c2);
            this.o = c3;
            if (c3 == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) com.applovin.exoplayer2.l.ai.a(this.t))[this.o];
        x xVar = aVar.f12049c;
        int i2 = aVar.f12050d;
        long j2 = aVar.f12048b.f12086c[i2];
        int i3 = aVar.f12048b.f12087d[i2];
        long j3 = (j2 - c2) + ((long) this.p);
        if (j3 < 0 || j3 >= 262144) {
            uVar.f12451a = j2;
            return 1;
        }
        if (aVar.f12047a.f12069g == 1) {
            j3 += 8;
            i3 -= 8;
        }
        iVar.b((int) j3);
        if (aVar.f12047a.j == 0) {
            if ("audio/ac4".equals(aVar.f12047a.f12068f.l)) {
                if (this.q == 0) {
                    c.a(i3, this.f12043e);
                    xVar.a(this.f12043e, 7);
                    this.q += 7;
                }
                i3 += 7;
            }
            while (true) {
                int i4 = this.q;
                if (i4 >= i3) {
                    break;
                }
                int a2 = xVar.a((com.applovin.exoplayer2.k.g) iVar, i3 - i4, false);
                this.p += a2;
                this.q += a2;
                this.r -= a2;
            }
        } else {
            byte[] d2 = this.f12042d.d();
            d2[0] = 0;
            d2[1] = 0;
            d2[2] = 0;
            int i5 = aVar.f12047a.j;
            int i6 = 4 - aVar.f12047a.j;
            while (this.q < i3) {
                int i7 = this.r;
                if (i7 == 0) {
                    iVar.b(d2, i6, i5);
                    this.p += i5;
                    this.f12042d.d(0);
                    int q2 = this.f12042d.q();
                    if (q2 >= 0) {
                        this.r = q2;
                        this.f12041c.d(0);
                        xVar.a(this.f12041c, 4);
                        this.q += 4;
                        i3 += i6;
                    } else {
                        throw ai.b("Invalid NAL length", (Throwable) null);
                    }
                } else {
                    int a3 = xVar.a((com.applovin.exoplayer2.k.g) iVar, i7, false);
                    this.p += a3;
                    this.q += a3;
                    this.r -= a3;
                }
            }
        }
        xVar.a(aVar.f12048b.f12089f[i2], aVar.f12048b.f12090g[i2], i3, 0, (x.a) null);
        aVar.f12050d++;
        this.o = -1;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        return 0;
    }

    private void d() {
        this.j = 0;
        this.m = 0;
    }

    private void d(long j2) {
        for (a aVar : this.t) {
            n nVar = aVar.f12048b;
            int a2 = nVar.a(j2);
            if (a2 == -1) {
                a2 = nVar.b(j2);
            }
            aVar.f12050d = a2;
        }
    }

    private void e() {
        com.applovin.exoplayer2.g.a aVar;
        if (this.x == 2 && (this.f12040b & 2) != 0) {
            j jVar = (j) com.applovin.exoplayer2.l.a.b(this.s);
            x a2 = jVar.a(0, 4);
            if (this.y == null) {
                aVar = null;
            } else {
                aVar = new com.applovin.exoplayer2.g.a(this.y);
            }
            a2.a(new v.a().a(aVar).a());
            jVar.a();
            jVar.a(new v.b(-9223372036854775807L));
        }
    }

    private void e(long j2) {
        if (this.k == 1836086884) {
            int i2 = this.m;
            this.y = new b(0, j2, -9223372036854775807L, j2 + ((long) i2), this.l - ((long) i2));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ h[] f() {
        return new h[]{new g()};
    }

    public int a(i iVar, u uVar) throws IOException {
        while (true) {
            int i2 = this.j;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return d(iVar, uVar);
                    }
                    if (i2 == 3) {
                        return c(iVar, uVar);
                    }
                    throw new IllegalStateException();
                } else if (b(iVar, uVar)) {
                    return 1;
                }
            } else if (!b(iVar)) {
                return -1;
            }
        }
    }

    public v.a a(long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        int b2;
        if (((a[]) com.applovin.exoplayer2.l.a.b(this.t)).length == 0) {
            return new v.a(w.f12456a);
        }
        int i2 = this.v;
        if (i2 != -1) {
            n nVar = this.t[i2].f12048b;
            int a2 = a(nVar, j2);
            if (a2 == -1) {
                return new v.a(w.f12456a);
            }
            long j7 = nVar.f12089f[a2];
            j3 = nVar.f12086c[a2];
            if (j7 >= j2 || a2 >= nVar.f12085b - 1 || (b2 = nVar.b(j2)) == -1 || b2 == a2) {
                j6 = -1;
                j5 = -9223372036854775807L;
            } else {
                j5 = nVar.f12089f[b2];
                j6 = nVar.f12086c[b2];
            }
            j4 = j6;
            j2 = j7;
        } else {
            j3 = Long.MAX_VALUE;
            j4 = -1;
            j5 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            a[] aVarArr = this.t;
            if (i3 >= aVarArr.length) {
                break;
            }
            if (i3 != this.v) {
                n nVar2 = aVarArr[i3].f12048b;
                long a3 = a(nVar2, j2, j3);
                if (j5 != -9223372036854775807L) {
                    j4 = a(nVar2, j5, j4);
                }
                j3 = a3;
            }
            i3++;
        }
        w wVar = new w(j2, j3);
        return j5 == -9223372036854775807L ? new v.a(wVar) : new v.a(wVar, new w(j5, j4));
    }

    public void a(long j2, long j3) {
        this.f12045g.clear();
        this.m = 0;
        this.o = -1;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        if (j2 == 0) {
            if (this.j != 3) {
                d();
                return;
            }
            this.f12046h.a();
            this.i.clear();
        } else if (this.t != null) {
            d(j3);
        }
    }

    public void a(j jVar) {
        this.s = jVar;
    }

    public boolean a() {
        return true;
    }

    public boolean a(i iVar) throws IOException {
        return j.a(iVar, (this.f12040b & 2) != 0);
    }

    public long b() {
        return this.w;
    }

    public void c() {
    }
}
