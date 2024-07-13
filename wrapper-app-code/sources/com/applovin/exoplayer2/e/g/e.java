package com.applovin.exoplayer2.e.g;

import android.util.Pair;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.e.g.a;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.r;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.g.b.c;
import com.applovin.exoplayer2.k.g;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import com.unity3d.services.core.device.MimeTypes;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.KotlinVersion;

public class e implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final l f12020a = $$Lambda$e$XdcPKOBxOMtaTqkUwwYk0cfnngM.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f12021b = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: c  reason: collision with root package name */
    private static final v f12022c = new v.a().f("application/x-emsg").a();
    private long A;
    private long B;
    private b C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private j H;
    private x[] I;
    private x[] J;
    private boolean K;

    /* renamed from: d  reason: collision with root package name */
    private final int f12023d;

    /* renamed from: e  reason: collision with root package name */
    private final k f12024e;

    /* renamed from: f  reason: collision with root package name */
    private final List<v> f12025f;

    /* renamed from: g  reason: collision with root package name */
    private final SparseArray<b> f12026g;

    /* renamed from: h  reason: collision with root package name */
    private final y f12027h;
    private final y i;
    private final y j;
    private final byte[] k;
    private final y l;
    private final ag m;
    private final c n;
    private final y o;
    private final ArrayDeque<a.C0116a> p;
    private final ArrayDeque<a> q;
    private final x r;
    private int s;
    private int t;
    private long u;
    private int v;
    private y w;
    private long x;
    private int y;
    private long z;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f12028a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12029b;

        public a(long j, int i) {
            this.f12028a = j;
            this.f12029b = i;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final x f12030a;

        /* renamed from: b  reason: collision with root package name */
        public final m f12031b = new m();

        /* renamed from: c  reason: collision with root package name */
        public final y f12032c = new y();

        /* renamed from: d  reason: collision with root package name */
        public n f12033d;

        /* renamed from: e  reason: collision with root package name */
        public c f12034e;

        /* renamed from: f  reason: collision with root package name */
        public int f12035f;

        /* renamed from: g  reason: collision with root package name */
        public int f12036g;

        /* renamed from: h  reason: collision with root package name */
        public int f12037h;
        public int i;
        private final y j = new y(1);
        private final y k = new y();
        /* access modifiers changed from: private */
        public boolean l;

        public b(x xVar, n nVar, c cVar) {
            this.f12030a = xVar;
            this.f12033d = nVar;
            this.f12034e = cVar;
            a(nVar, cVar);
        }

        public int a(int i2, int i3) {
            y yVar;
            int i4;
            l h2 = h();
            if (h2 == null) {
                return 0;
            }
            if (h2.f12074d != 0) {
                yVar = this.f12031b.p;
                i4 = h2.f12074d;
            } else {
                byte[] bArr = (byte[]) ai.a(h2.f12075e);
                this.k.a(bArr, bArr.length);
                yVar = this.k;
                i4 = bArr.length;
            }
            boolean c2 = this.f12031b.c(this.f12035f);
            boolean z = c2 || i3 != 0;
            this.j.d()[0] = (byte) ((z ? 128 : 0) | i4);
            this.j.d(0);
            this.f12030a.a(this.j, 1, 1);
            this.f12030a.a(yVar, i4, 1);
            if (!z) {
                return i4 + 1;
            }
            if (!c2) {
                this.f12032c.a(8);
                byte[] d2 = this.f12032c.d();
                d2[0] = 0;
                d2[1] = 1;
                d2[2] = (byte) ((i3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                d2[3] = (byte) (i3 & KotlinVersion.MAX_COMPONENT_VALUE);
                d2[4] = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                d2[5] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                d2[6] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                d2[7] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f12030a.a(this.f12032c, 8, 1);
                return i4 + 1 + 8;
            }
            y yVar2 = this.f12031b.p;
            int i5 = yVar2.i();
            yVar2.e(-2);
            int i6 = (i5 * 6) + 2;
            if (i3 != 0) {
                this.f12032c.a(i6);
                byte[] d3 = this.f12032c.d();
                yVar2.a(d3, 0, i6);
                int i7 = (((d3[2] & 255) << 8) | (d3[3] & 255)) + i3;
                d3[2] = (byte) ((i7 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                d3[3] = (byte) (i7 & KotlinVersion.MAX_COMPONENT_VALUE);
                yVar2 = this.f12032c;
            }
            this.f12030a.a(yVar2, i6, 1);
            return i4 + 1 + i6;
        }

        public void a() {
            this.f12031b.a();
            this.f12035f = 0;
            this.f12037h = 0;
            this.f12036g = 0;
            this.i = 0;
            this.l = false;
        }

        public void a(long j2) {
            int i2 = this.f12035f;
            while (i2 < this.f12031b.f12081f && this.f12031b.b(i2) < j2) {
                if (this.f12031b.l[i2]) {
                    this.i = i2;
                }
                i2++;
            }
        }

        public void a(com.applovin.exoplayer2.d.e eVar) {
            l a2 = this.f12033d.f12084a.a(((c) ai.a(this.f12031b.f12076a)).f12010a);
            this.f12030a.a(this.f12033d.f12084a.f12068f.a().a(eVar.a(a2 != null ? a2.f12072b : null)).a());
        }

        public void a(n nVar, c cVar) {
            this.f12033d = nVar;
            this.f12034e = cVar;
            this.f12030a.a(nVar.f12084a.f12068f);
            a();
        }

        public long b() {
            return !this.l ? this.f12033d.f12089f[this.f12035f] : this.f12031b.b(this.f12035f);
        }

        public long c() {
            return !this.l ? this.f12033d.f12086c[this.f12035f] : this.f12031b.f12082g[this.f12037h];
        }

        public int d() {
            return !this.l ? this.f12033d.f12087d[this.f12035f] : this.f12031b.i[this.f12035f];
        }

        public int e() {
            int i2 = !this.l ? this.f12033d.f12090g[this.f12035f] : this.f12031b.l[this.f12035f] ? 1 : 0;
            return h() != null ? i2 | 1073741824 : i2;
        }

        public boolean f() {
            this.f12035f++;
            if (!this.l) {
                return false;
            }
            int i2 = this.f12036g + 1;
            this.f12036g = i2;
            int[] iArr = this.f12031b.f12083h;
            int i3 = this.f12037h;
            if (i2 != iArr[i3]) {
                return true;
            }
            this.f12037h = i3 + 1;
            this.f12036g = 0;
            return false;
        }

        public void g() {
            l h2 = h();
            if (h2 != null) {
                y yVar = this.f12031b.p;
                if (h2.f12074d != 0) {
                    yVar.e(h2.f12074d);
                }
                if (this.f12031b.c(this.f12035f)) {
                    yVar.e(yVar.i() * 6);
                }
            }
        }

        public l h() {
            if (!this.l) {
                return null;
            }
            l a2 = this.f12031b.o != null ? this.f12031b.o : this.f12033d.f12084a.a(((c) ai.a(this.f12031b.f12076a)).f12010a);
            if (a2 == null || !a2.f12071a) {
                return null;
            }
            return a2;
        }
    }

    public e() {
        this(0);
    }

    public e(int i2) {
        this(i2, (ag) null);
    }

    public e(int i2, ag agVar) {
        this(i2, agVar, (k) null, Collections.emptyList());
    }

    public e(int i2, ag agVar, k kVar, List<v> list) {
        this(i2, agVar, kVar, list, (x) null);
    }

    public e(int i2, ag agVar, k kVar, List<v> list, x xVar) {
        this.f12023d = i2;
        this.m = agVar;
        this.f12024e = kVar;
        this.f12025f = Collections.unmodifiableList(list);
        this.r = xVar;
        this.n = new c();
        this.o = new y(16);
        this.f12027h = new y(com.applovin.exoplayer2.l.v.f13581a);
        this.i = new y(5);
        this.j = new y();
        byte[] bArr = new byte[16];
        this.k = bArr;
        this.l = new y(bArr);
        this.p = new ArrayDeque<>();
        this.q = new ArrayDeque<>();
        this.f12026g = new SparseArray<>();
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.H = j.f12390a;
        this.I = new x[0];
        this.J = new x[0];
    }

    private static int a(int i2) throws com.applovin.exoplayer2.ai {
        if (i2 >= 0) {
            return i2;
        }
        throw com.applovin.exoplayer2.ai.b("Unexpected negative value: " + i2, (Throwable) null);
    }

    private static int a(b bVar, int i2, int i3, y yVar, int i4) throws com.applovin.exoplayer2.ai {
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        b bVar2 = bVar;
        yVar.d(8);
        int b2 = a.b(yVar.q());
        k kVar = bVar2.f12033d.f12084a;
        m mVar = bVar2.f12031b;
        c cVar = (c) ai.a(mVar.f12076a);
        mVar.f12083h[i2] = yVar.w();
        mVar.f12082g[i2] = mVar.f12078c;
        if ((b2 & 1) != 0) {
            long[] jArr = mVar.f12082g;
            jArr[i2] = jArr[i2] + ((long) yVar.q());
        }
        boolean z6 = (b2 & 4) != 0;
        int i7 = cVar.f12013d;
        if (z6) {
            i7 = yVar.q();
        }
        boolean z7 = (b2 & 256) != 0;
        boolean z8 = (b2 & 512) != 0;
        boolean z9 = (b2 & 1024) != 0;
        boolean z10 = (b2 & 2048) != 0;
        long j2 = 0;
        if (kVar.f12070h != null && kVar.f12070h.length == 1 && kVar.f12070h[0] == 0) {
            j2 = ai.d(((long[]) ai.a(kVar.i))[0], 1000000, kVar.f12065c);
        }
        int[] iArr = mVar.i;
        int[] iArr2 = mVar.j;
        long[] jArr2 = mVar.k;
        int i8 = i7;
        boolean[] zArr = mVar.l;
        boolean z11 = kVar.f12064b == 2 && (i3 & 1) != 0;
        int i9 = i4 + mVar.f12083h[i2];
        boolean z12 = z11;
        long j3 = kVar.f12065c;
        long j4 = j2;
        long[] jArr3 = jArr2;
        long j5 = mVar.r;
        int i10 = i4;
        while (i10 < i9) {
            int a2 = a(z7 ? yVar.q() : cVar.f12011b);
            if (z8) {
                z2 = z7;
                i5 = yVar.q();
            } else {
                z2 = z7;
                i5 = cVar.f12012c;
            }
            int a3 = a(i5);
            if (z9) {
                z3 = z6;
                i6 = yVar.q();
            } else if (i10 != 0 || !z6) {
                z3 = z6;
                i6 = cVar.f12013d;
            } else {
                z3 = z6;
                i6 = i8;
            }
            boolean z13 = z10;
            if (z10) {
                z5 = z8;
                z4 = z9;
                iArr2[i10] = (int) ((((long) yVar.q()) * 1000000) / j3);
            } else {
                z5 = z8;
                z4 = z9;
                iArr2[i10] = 0;
            }
            jArr3[i10] = ai.d(j5, 1000000, j3) - j4;
            if (!mVar.s) {
                jArr3[i10] = jArr3[i10] + bVar2.f12033d.f12091h;
            }
            iArr[i10] = a3;
            zArr[i10] = ((i6 >> 16) & 1) == 0 && (!z12 || i10 == 0);
            j5 += (long) a2;
            i10++;
            bVar2 = bVar;
            z7 = z2;
            j3 = j3;
            z6 = z3;
            z10 = z13;
            z8 = z5;
            z9 = z4;
        }
        mVar.r = j5;
        return i9;
    }

    private static Pair<Long, com.applovin.exoplayer2.e.c> a(y yVar, long j2) throws com.applovin.exoplayer2.ai {
        long j3;
        long j4;
        y yVar2 = yVar;
        yVar2.d(8);
        int a2 = a.a(yVar.q());
        yVar2.e(4);
        long o2 = yVar.o();
        if (a2 == 0) {
            j4 = yVar.o();
            j3 = yVar.o();
        } else {
            j4 = yVar.y();
            j3 = yVar.y();
        }
        long j5 = j4;
        long j6 = j2 + j3;
        long d2 = ai.d(j5, 1000000, o2);
        yVar2.e(2);
        int i2 = yVar.i();
        int[] iArr = new int[i2];
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        long[] jArr3 = new long[i2];
        long j7 = j5;
        long j8 = d2;
        int i3 = 0;
        while (i3 < i2) {
            int q2 = yVar.q();
            if ((q2 & RecyclerView.UNDEFINED_DURATION) == 0) {
                long o3 = yVar.o();
                iArr[i3] = q2 & Integer.MAX_VALUE;
                jArr[i3] = j6;
                jArr3[i3] = j8;
                long j9 = j7 + o3;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i4 = i2;
                int[] iArr2 = iArr;
                long d3 = ai.d(j9, 1000000, o2);
                jArr4[i3] = d3 - jArr5[i3];
                yVar2.e(4);
                j6 += (long) iArr2[i3];
                i3++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                i2 = i4;
                long j10 = d3;
                j7 = j9;
                j8 = j10;
            } else {
                throw com.applovin.exoplayer2.ai.b("Unhandled indirect reference", (Throwable) null);
            }
        }
        return Pair.create(Long.valueOf(d2), new com.applovin.exoplayer2.e.c(iArr, jArr, jArr2, jArr3));
    }

    private static com.applovin.exoplayer2.d.e a(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            a.b bVar = list.get(i2);
            if (bVar.f11981a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] d2 = bVar.f11985b.d();
                UUID b2 = h.b(d2);
                if (b2 == null) {
                    q.c("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new e.a(b2, "video/mp4", d2));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new com.applovin.exoplayer2.d.e((List<e.a>) arrayList);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.util.SparseArray, android.util.SparseArray<com.applovin.exoplayer2.e.g.c>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.exoplayer2.e.g.c a(android.util.SparseArray<com.applovin.exoplayer2.e.g.c> r3, int r4) {
        /*
            r2 = this;
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto L_0x000f
            r4 = 0
            java.lang.Object r3 = r3.valueAt(r4)
        L_0x000c:
            com.applovin.exoplayer2.e.g.c r3 = (com.applovin.exoplayer2.e.g.c) r3
            return r3
        L_0x000f:
            java.lang.Object r3 = r3.get(r4)
            com.applovin.exoplayer2.e.g.c r3 = (com.applovin.exoplayer2.e.g.c) r3
            java.lang.Object r3 = com.applovin.exoplayer2.l.a.b(r3)
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.g.e.a(android.util.SparseArray, int):com.applovin.exoplayer2.e.g.c");
    }

    private static b a(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            b valueAt = sparseArray.valueAt(i2);
            if ((valueAt.l || valueAt.f12035f != valueAt.f12033d.f12085b) && (!valueAt.l || valueAt.f12037h != valueAt.f12031b.f12080e)) {
                long c2 = valueAt.c();
                if (c2 < j2) {
                    bVar = valueAt;
                    j2 = c2;
                }
            }
        }
        return bVar;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.util.SparseArray, android.util.SparseArray<com.applovin.exoplayer2.e.g.e$b>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.exoplayer2.e.g.e.b a(com.applovin.exoplayer2.l.y r4, android.util.SparseArray<com.applovin.exoplayer2.e.g.e.b> r5, boolean r6) {
        /*
            r0 = 8
            r4.d(r0)
            int r0 = r4.q()
            int r0 = com.applovin.exoplayer2.e.g.a.b(r0)
            int r1 = r4.q()
            if (r6 == 0) goto L_0x0019
            r6 = 0
            java.lang.Object r5 = r5.valueAt(r6)
            goto L_0x001d
        L_0x0019:
            java.lang.Object r5 = r5.get(r1)
        L_0x001d:
            com.applovin.exoplayer2.e.g.e$b r5 = (com.applovin.exoplayer2.e.g.e.b) r5
            if (r5 != 0) goto L_0x0023
            r4 = 0
            return r4
        L_0x0023:
            r6 = r0 & 1
            if (r6 == 0) goto L_0x0033
            long r1 = r4.y()
            com.applovin.exoplayer2.e.g.m r6 = r5.f12031b
            r6.f12078c = r1
            com.applovin.exoplayer2.e.g.m r6 = r5.f12031b
            r6.f12079d = r1
        L_0x0033:
            com.applovin.exoplayer2.e.g.c r6 = r5.f12034e
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0040
            int r1 = r4.q()
            int r1 = r1 + -1
            goto L_0x0042
        L_0x0040:
            int r1 = r6.f12010a
        L_0x0042:
            r2 = r0 & 8
            if (r2 == 0) goto L_0x004b
            int r2 = r4.q()
            goto L_0x004d
        L_0x004b:
            int r2 = r6.f12011b
        L_0x004d:
            r3 = r0 & 16
            if (r3 == 0) goto L_0x0056
            int r3 = r4.q()
            goto L_0x0058
        L_0x0056:
            int r3 = r6.f12012c
        L_0x0058:
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0061
            int r4 = r4.q()
            goto L_0x0063
        L_0x0061:
            int r4 = r6.f12013d
        L_0x0063:
            com.applovin.exoplayer2.e.g.m r6 = r5.f12031b
            com.applovin.exoplayer2.e.g.c r0 = new com.applovin.exoplayer2.e.g.c
            r0.<init>(r1, r2, r3, r4)
            r6.f12076a = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.g.e.a(com.applovin.exoplayer2.l.y, android.util.SparseArray, boolean):com.applovin.exoplayer2.e.g.e$b");
    }

    private void a() {
        this.s = 0;
        this.v = 0;
    }

    private void a(long j2) throws com.applovin.exoplayer2.ai {
        while (!this.p.isEmpty() && this.p.peek().f11982b == j2) {
            a(this.p.pop());
        }
        a();
    }

    private void a(a.C0116a aVar) throws com.applovin.exoplayer2.ai {
        if (aVar.f11981a == 1836019574) {
            b(aVar);
        } else if (aVar.f11981a == 1836019558) {
            c(aVar);
        } else if (!this.p.isEmpty()) {
            this.p.peek().a(aVar);
        }
    }

    private static void a(a.C0116a aVar, SparseArray<b> sparseArray, boolean z2, int i2, byte[] bArr) throws com.applovin.exoplayer2.ai {
        int size = aVar.f11984d.size();
        for (int i3 = 0; i3 < size; i3++) {
            a.C0116a aVar2 = aVar.f11984d.get(i3);
            if (aVar2.f11981a == 1953653094) {
                b(aVar2, sparseArray, z2, i2, bArr);
            }
        }
    }

    private static void a(a.C0116a aVar, b bVar, int i2) throws com.applovin.exoplayer2.ai {
        List<a.b> list = aVar.f11983c;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            a.b bVar2 = list.get(i5);
            if (bVar2.f11981a == 1953658222) {
                y yVar = bVar2.f11985b;
                yVar.d(12);
                int w2 = yVar.w();
                if (w2 > 0) {
                    i4 += w2;
                    i3++;
                }
            }
        }
        bVar.f12037h = 0;
        bVar.f12036g = 0;
        bVar.f12035f = 0;
        bVar.f12031b.a(i3, i4);
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            a.b bVar3 = list.get(i8);
            if (bVar3.f11981a == 1953658222) {
                i7 = a(bVar, i6, i2, bVar3.f11985b, i7);
                i6++;
            }
        }
    }

    private static void a(a.C0116a aVar, String str, m mVar) throws com.applovin.exoplayer2.ai {
        a.C0116a aVar2 = aVar;
        m mVar2 = mVar;
        byte[] bArr = null;
        y yVar = null;
        y yVar2 = null;
        for (int i2 = 0; i2 < aVar2.f11983c.size(); i2++) {
            a.b bVar = aVar2.f11983c.get(i2);
            y yVar3 = bVar.f11985b;
            if (bVar.f11981a == 1935828848) {
                yVar3.d(12);
                if (yVar3.q() == 1936025959) {
                    yVar = yVar3;
                }
            } else if (bVar.f11981a == 1936158820) {
                yVar3.d(12);
                if (yVar3.q() == 1936025959) {
                    yVar2 = yVar3;
                }
            }
        }
        if (yVar != null && yVar2 != null) {
            yVar.d(8);
            int a2 = a.a(yVar.q());
            yVar.e(4);
            if (a2 == 1) {
                yVar.e(4);
            }
            if (yVar.q() == 1) {
                yVar2.d(8);
                int a3 = a.a(yVar2.q());
                yVar2.e(4);
                if (a3 == 1) {
                    if (yVar2.o() == 0) {
                        throw com.applovin.exoplayer2.ai.a("Variable length description in sgpd found (unsupported)");
                    }
                } else if (a3 >= 2) {
                    yVar2.e(4);
                }
                if (yVar2.o() == 1) {
                    yVar2.e(1);
                    int h2 = yVar2.h();
                    int i3 = (h2 & 240) >> 4;
                    int i4 = h2 & 15;
                    boolean z2 = yVar2.h() == 1;
                    if (z2) {
                        int h3 = yVar2.h();
                        byte[] bArr2 = new byte[16];
                        yVar2.a(bArr2, 0, 16);
                        if (h3 == 0) {
                            int h4 = yVar2.h();
                            bArr = new byte[h4];
                            yVar2.a(bArr, 0, h4);
                        }
                        mVar2.m = true;
                        mVar2.o = new l(z2, str, h3, bArr2, i3, i4, bArr);
                        return;
                    }
                    return;
                }
                throw com.applovin.exoplayer2.ai.a("Entry count in sgpd != 1 (unsupported).");
            }
            throw com.applovin.exoplayer2.ai.a("Entry count in sbgp != 1 (unsupported).");
        }
    }

    private void a(a.b bVar, long j2) throws com.applovin.exoplayer2.ai {
        if (!this.p.isEmpty()) {
            this.p.peek().a(bVar);
        } else if (bVar.f11981a == 1936286840) {
            Pair<Long, com.applovin.exoplayer2.e.c> a2 = a(bVar.f11985b, j2);
            this.B = ((Long) a2.first).longValue();
            this.H.a((com.applovin.exoplayer2.e.v) a2.second);
            this.K = true;
        } else if (bVar.f11981a == 1701671783) {
            a(bVar.f11985b);
        }
    }

    private static void a(l lVar, y yVar, m mVar) throws com.applovin.exoplayer2.ai {
        int i2;
        int i3 = lVar.f12074d;
        yVar.d(8);
        boolean z2 = true;
        if ((a.b(yVar.q()) & 1) == 1) {
            yVar.e(8);
        }
        int h2 = yVar.h();
        int w2 = yVar.w();
        if (w2 <= mVar.f12081f) {
            if (h2 == 0) {
                boolean[] zArr = mVar.n;
                i2 = 0;
                for (int i4 = 0; i4 < w2; i4++) {
                    int h3 = yVar.h();
                    i2 += h3;
                    zArr[i4] = h3 > i3;
                }
            } else {
                if (h2 <= i3) {
                    z2 = false;
                }
                i2 = (h2 * w2) + 0;
                Arrays.fill(mVar.n, 0, w2, z2);
            }
            Arrays.fill(mVar.n, w2, mVar.f12081f, false);
            if (i2 > 0) {
                mVar.a(i2);
                return;
            }
            return;
        }
        throw com.applovin.exoplayer2.ai.b("Saiz sample count " + w2 + " is greater than fragment sample count" + mVar.f12081f, (Throwable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.applovin.exoplayer2.l.y r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            com.applovin.exoplayer2.e.x[] r2 = r0.I
            int r2 = r2.length
            if (r2 != 0) goto L_0x000a
            return
        L_0x000a:
            r2 = 8
            r1.d(r2)
            int r2 = r27.q()
            int r2 = com.applovin.exoplayer2.e.g.a.a(r2)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0074
            r5 = 1
            if (r2 == r5) goto L_0x0038
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Skipping unsupported emsg version: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentedMp4Extractor"
            com.applovin.exoplayer2.l.q.c(r2, r1)
            return
        L_0x0038:
            long r11 = r27.o()
            long r5 = r27.y()
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r9 = r11
            long r13 = com.applovin.exoplayer2.l.ai.d(r5, r7, r9)
            long r5 = r27.o()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = com.applovin.exoplayer2.l.ai.d(r5, r7, r9)
            long r7 = r27.o()
            java.lang.String r2 = r27.B()
            java.lang.Object r2 = com.applovin.exoplayer2.l.a.b(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r9 = r27.B()
            java.lang.Object r9 = com.applovin.exoplayer2.l.a.b(r9)
            java.lang.String r9 = (java.lang.String) r9
            r19 = r2
            r21 = r5
            r23 = r7
            r20 = r9
            r7 = r3
            goto L_0x00be
        L_0x0074:
            java.lang.String r2 = r27.B()
            java.lang.Object r2 = com.applovin.exoplayer2.l.a.b(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = r27.B()
            java.lang.Object r5 = com.applovin.exoplayer2.l.a.b(r5)
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            long r5 = r27.o()
            long r10 = r27.o()
            r12 = 1000000(0xf4240, double:4.940656E-318)
            r14 = r5
            long r7 = com.applovin.exoplayer2.l.ai.d(r10, r12, r14)
            long r10 = r0.B
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x00a3
            long r10 = r10 + r7
            r16 = r10
            goto L_0x00a5
        L_0x00a3:
            r16 = r3
        L_0x00a5:
            long r10 = r27.o()
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = r5
            long r5 = com.applovin.exoplayer2.l.ai.d(r10, r12, r14)
            long r10 = r27.o()
            r19 = r2
            r21 = r5
            r20 = r9
            r23 = r10
            r13 = r16
        L_0x00be:
            int r2 = r27.a()
            byte[] r2 = new byte[r2]
            int r5 = r27.a()
            r6 = 0
            r1.a(r2, r6, r5)
            com.applovin.exoplayer2.g.b.a r1 = new com.applovin.exoplayer2.g.b.a
            r18 = r1
            r25 = r2
            r18.<init>(r19, r20, r21, r23, r25)
            com.applovin.exoplayer2.l.y r2 = new com.applovin.exoplayer2.l.y
            com.applovin.exoplayer2.g.b.c r5 = r0.n
            byte[] r1 = r5.a(r1)
            r2.<init>((byte[]) r1)
            int r1 = r2.a()
            com.applovin.exoplayer2.e.x[] r5 = r0.I
            int r9 = r5.length
            r10 = 0
        L_0x00e8:
            if (r10 >= r9) goto L_0x00f5
            r11 = r5[r10]
            r2.d(r6)
            r11.a(r2, r1)
            int r10 = r10 + 1
            goto L_0x00e8
        L_0x00f5:
            int r2 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0109
            java.util.ArrayDeque<com.applovin.exoplayer2.e.g.e$a> r2 = r0.q
            com.applovin.exoplayer2.e.g.e$a r3 = new com.applovin.exoplayer2.e.g.e$a
            r3.<init>(r7, r1)
            r2.addLast(r3)
            int r2 = r0.y
            int r2 = r2 + r1
            r0.y = r2
            goto L_0x0128
        L_0x0109:
            com.applovin.exoplayer2.l.ag r2 = r0.m
            if (r2 == 0) goto L_0x0111
            long r13 = r2.c(r13)
        L_0x0111:
            com.applovin.exoplayer2.e.x[] r2 = r0.I
            int r3 = r2.length
        L_0x0114:
            if (r6 >= r3) goto L_0x0128
            r15 = r2[r6]
            r18 = 1
            r20 = 0
            r21 = 0
            r16 = r13
            r19 = r1
            r15.a(r16, r18, r19, r20, r21)
            int r6 = r6 + 1
            goto L_0x0114
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.g.e.a(com.applovin.exoplayer2.l.y):void");
    }

    private static void a(y yVar, int i2, m mVar) throws com.applovin.exoplayer2.ai {
        yVar.d(i2 + 8);
        int b2 = a.b(yVar.q());
        if ((b2 & 1) == 0) {
            boolean z2 = (b2 & 2) != 0;
            int w2 = yVar.w();
            if (w2 == 0) {
                Arrays.fill(mVar.n, 0, mVar.f12081f, false);
            } else if (w2 == mVar.f12081f) {
                Arrays.fill(mVar.n, 0, w2, z2);
                mVar.a(yVar.a());
                mVar.a(yVar);
            } else {
                throw com.applovin.exoplayer2.ai.b("Senc sample count " + w2 + " is different from fragment sample count" + mVar.f12081f, (Throwable) null);
            }
        } else {
            throw com.applovin.exoplayer2.ai.a("Overriding TrackEncryptionBox parameters is unsupported.");
        }
    }

    private static void a(y yVar, m mVar) throws com.applovin.exoplayer2.ai {
        yVar.d(8);
        int q2 = yVar.q();
        if ((a.b(q2) & 1) == 1) {
            yVar.e(8);
        }
        int w2 = yVar.w();
        if (w2 == 1) {
            mVar.f12079d += a.a(q2) == 0 ? yVar.o() : yVar.y();
            return;
        }
        throw com.applovin.exoplayer2.ai.b("Unexpected saio entry count: " + w2, (Throwable) null);
    }

    private static void a(y yVar, m mVar, byte[] bArr) throws com.applovin.exoplayer2.ai {
        yVar.d(8);
        yVar.a(bArr, 0, 16);
        if (Arrays.equals(bArr, f12021b)) {
            a(yVar, 16, mVar);
        }
    }

    private static Pair<Integer, c> b(y yVar) {
        yVar.d(12);
        return Pair.create(Integer.valueOf(yVar.q()), new c(yVar.q() - 1, yVar.q(), yVar.q(), yVar.q()));
    }

    private void b() {
        int i2;
        x[] xVarArr = new x[2];
        this.I = xVarArr;
        x xVar = this.r;
        int i3 = 0;
        if (xVar != null) {
            xVarArr[0] = xVar;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = 100;
        if ((this.f12023d & 4) != 0) {
            this.I[i2] = this.H.a(100, 5);
            i2++;
            i4 = 101;
        }
        x[] xVarArr2 = (x[]) ai.a((T[]) this.I, i2);
        this.I = xVarArr2;
        for (x a2 : xVarArr2) {
            a2.a(f12022c);
        }
        this.J = new x[this.f12025f.size()];
        while (i3 < this.J.length) {
            x a3 = this.H.a(i4, 3);
            a3.a(this.f12025f.get(i3));
            this.J[i3] = a3;
            i3++;
            i4++;
        }
    }

    private void b(long j2) {
        while (!this.q.isEmpty()) {
            a removeFirst = this.q.removeFirst();
            this.y -= removeFirst.f12029b;
            long j3 = removeFirst.f12028a + j2;
            ag agVar = this.m;
            if (agVar != null) {
                j3 = agVar.c(j3);
            }
            for (x a2 : this.I) {
                a2.a(j3, 1, removeFirst.f12029b, this.y, (x.a) null);
            }
        }
    }

    private void b(a.C0116a aVar) throws com.applovin.exoplayer2.ai {
        boolean z2 = true;
        int i2 = 0;
        com.applovin.exoplayer2.l.a.b(this.f12024e == null, "Unexpected moov box.");
        com.applovin.exoplayer2.d.e a2 = a(aVar.f11983c);
        a.C0116a aVar2 = (a.C0116a) com.applovin.exoplayer2.l.a.b(aVar.e(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.f11983c.size();
        long j2 = -9223372036854775807L;
        for (int i3 = 0; i3 < size; i3++) {
            a.b bVar = aVar2.f11983c.get(i3);
            if (bVar.f11981a == 1953654136) {
                Pair<Integer, c> b2 = b(bVar.f11985b);
                sparseArray.put(((Integer) b2.first).intValue(), (c) b2.second);
            } else if (bVar.f11981a == 1835362404) {
                j2 = c(bVar.f11985b);
            }
        }
        List<n> a3 = b.a(aVar, new r(), j2, a2, (this.f12023d & 16) != 0, false, (Function<k, k>) new Function() {
            public final Object apply(Object obj) {
                return e.this.a((k) obj);
            }
        });
        int size2 = a3.size();
        if (this.f12026g.size() == 0) {
            while (i2 < size2) {
                n nVar = a3.get(i2);
                k kVar = nVar.f12084a;
                this.f12026g.put(kVar.f12063a, new b(this.H.a(i2, kVar.f12064b), nVar, a((SparseArray<c>) sparseArray, kVar.f12063a)));
                this.A = Math.max(this.A, kVar.f12067e);
                i2++;
            }
            this.H.a();
            return;
        }
        if (this.f12026g.size() != size2) {
            z2 = false;
        }
        com.applovin.exoplayer2.l.a.b(z2);
        while (i2 < size2) {
            n nVar2 = a3.get(i2);
            k kVar2 = nVar2.f12084a;
            this.f12026g.get(kVar2.f12063a).a(nVar2, a((SparseArray<c>) sparseArray, kVar2.f12063a));
            i2++;
        }
    }

    private static void b(a.C0116a aVar, SparseArray<b> sparseArray, boolean z2, int i2, byte[] bArr) throws com.applovin.exoplayer2.ai {
        b a2 = a(((a.b) com.applovin.exoplayer2.l.a.b(aVar.d(1952868452))).f11985b, sparseArray, z2);
        if (a2 != null) {
            m mVar = a2.f12031b;
            long j2 = mVar.r;
            boolean z3 = mVar.s;
            a2.a();
            boolean unused = a2.l = true;
            a.b d2 = aVar.d(1952867444);
            if (d2 == null || (i2 & 2) != 0) {
                mVar.r = j2;
                mVar.s = z3;
            } else {
                mVar.r = d(d2.f11985b);
                mVar.s = true;
            }
            a(aVar, a2, i2);
            l a3 = a2.f12033d.f12084a.a(((c) com.applovin.exoplayer2.l.a.b(mVar.f12076a)).f12010a);
            a.b d3 = aVar.d(1935763834);
            if (d3 != null) {
                a((l) com.applovin.exoplayer2.l.a.b(a3), d3.f11985b, mVar);
            }
            a.b d4 = aVar.d(1935763823);
            if (d4 != null) {
                a(d4.f11985b, mVar);
            }
            a.b d5 = aVar.d(1936027235);
            if (d5 != null) {
                b(d5.f11985b, mVar);
            }
            a(aVar, a3 != null ? a3.f12072b : null, mVar);
            int size = aVar.f11983c.size();
            for (int i3 = 0; i3 < size; i3++) {
                a.b bVar = aVar.f11983c.get(i3);
                if (bVar.f11981a == 1970628964) {
                    a(bVar.f11985b, mVar, bArr);
                }
            }
        }
    }

    private static void b(y yVar, m mVar) throws com.applovin.exoplayer2.ai {
        a(yVar, 0, mVar);
    }

    private static boolean b(int i2) {
        return i2 == 1751411826 || i2 == 1835296868 || i2 == 1836476516 || i2 == 1936286840 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1668576371 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1937011571 || i2 == 1952867444 || i2 == 1952868452 || i2 == 1953196132 || i2 == 1953654136 || i2 == 1953658222 || i2 == 1886614376 || i2 == 1935763834 || i2 == 1935763823 || i2 == 1936027235 || i2 == 1970628964 || i2 == 1935828848 || i2 == 1936158820 || i2 == 1701606260 || i2 == 1835362404 || i2 == 1701671783;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(com.applovin.exoplayer2.e.i r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.v
            r1 = 8
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x002c
            com.applovin.exoplayer2.l.y r0 = r11.o
            byte[] r0 = r0.d()
            boolean r0 = r12.a(r0, r2, r1, r3)
            if (r0 != 0) goto L_0x0015
            return r2
        L_0x0015:
            r11.v = r1
            com.applovin.exoplayer2.l.y r0 = r11.o
            r0.d(r2)
            com.applovin.exoplayer2.l.y r0 = r11.o
            long r4 = r0.o()
            r11.u = r4
            com.applovin.exoplayer2.l.y r0 = r11.o
            int r0 = r0.q()
            r11.t = r0
        L_0x002c:
            long r4 = r11.u
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x004b
            com.applovin.exoplayer2.l.y r0 = r11.o
            byte[] r0 = r0.d()
            r12.b(r0, r1, r1)
            int r0 = r11.v
            int r0 = r0 + r1
            r11.v = r0
            com.applovin.exoplayer2.l.y r0 = r11.o
            long r4 = r0.y()
        L_0x0048:
            r11.u = r4
            goto L_0x007b
        L_0x004b:
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x007b
            long r4 = r12.d()
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x006d
            java.util.ArrayDeque<com.applovin.exoplayer2.e.g.a$a> r0 = r11.p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x006d
            java.util.ArrayDeque<com.applovin.exoplayer2.e.g.a$a> r0 = r11.p
            java.lang.Object r0 = r0.peek()
            com.applovin.exoplayer2.e.g.a$a r0 = (com.applovin.exoplayer2.e.g.a.C0116a) r0
            long r4 = r0.f11982b
        L_0x006d:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x007b
            long r6 = r12.c()
            long r4 = r4 - r6
            int r0 = r11.v
            long r6 = (long) r0
            long r4 = r4 + r6
            goto L_0x0048
        L_0x007b:
            long r4 = r11.u
            int r0 = r11.v
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0152
            long r4 = r12.c()
            int r0 = r11.v
            long r6 = (long) r0
            long r4 = r4 - r6
            int r0 = r11.t
            r6 = 1835295092(0x6d646174, float:4.4175247E27)
            r7 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r0 == r7) goto L_0x0098
            if (r0 != r6) goto L_0x00aa
        L_0x0098:
            boolean r0 = r11.K
            if (r0 != 0) goto L_0x00aa
            com.applovin.exoplayer2.e.j r0 = r11.H
            com.applovin.exoplayer2.e.v$b r8 = new com.applovin.exoplayer2.e.v$b
            long r9 = r11.A
            r8.<init>(r9, r4)
            r0.a(r8)
            r11.K = r3
        L_0x00aa:
            int r0 = r11.t
            if (r0 != r7) goto L_0x00ca
            android.util.SparseArray<com.applovin.exoplayer2.e.g.e$b> r0 = r11.f12026g
            int r0 = r0.size()
            r7 = 0
        L_0x00b5:
            if (r7 >= r0) goto L_0x00ca
            android.util.SparseArray<com.applovin.exoplayer2.e.g.e$b> r8 = r11.f12026g
            java.lang.Object r8 = r8.valueAt(r7)
            com.applovin.exoplayer2.e.g.e$b r8 = (com.applovin.exoplayer2.e.g.e.b) r8
            com.applovin.exoplayer2.e.g.m r8 = r8.f12031b
            r8.f12077b = r4
            r8.f12079d = r4
            r8.f12078c = r4
            int r7 = r7 + 1
            goto L_0x00b5
        L_0x00ca:
            int r0 = r11.t
            r7 = 0
            if (r0 != r6) goto L_0x00da
            r11.C = r7
            long r0 = r11.u
            long r4 = r4 + r0
            r11.x = r4
            r12 = 2
            r11.s = r12
            return r3
        L_0x00da:
            boolean r0 = c((int) r0)
            if (r0 == 0) goto L_0x0107
            long r0 = r12.c()
            long r4 = r11.u
            long r0 = r0 + r4
            r4 = 8
            long r0 = r0 - r4
            java.util.ArrayDeque<com.applovin.exoplayer2.e.g.a$a> r12 = r11.p
            com.applovin.exoplayer2.e.g.a$a r2 = new com.applovin.exoplayer2.e.g.a$a
            int r4 = r11.t
            r2.<init>(r4, r0)
            r12.push(r2)
            long r4 = r11.u
            int r12 = r11.v
            long r6 = (long) r12
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x0103
            r11.a((long) r0)
            goto L_0x014a
        L_0x0103:
            r11.a()
            goto L_0x014a
        L_0x0107:
            int r12 = r11.t
            boolean r12 = b((int) r12)
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r12 == 0) goto L_0x0140
            int r12 = r11.v
            if (r12 != r1) goto L_0x0139
            long r6 = r11.u
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 > 0) goto L_0x0132
            com.applovin.exoplayer2.l.y r12 = new com.applovin.exoplayer2.l.y
            int r0 = (int) r6
            r12.<init>((int) r0)
            com.applovin.exoplayer2.l.y r0 = r11.o
            byte[] r0 = r0.d()
            byte[] r4 = r12.d()
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            r11.w = r12
            goto L_0x0148
        L_0x0132:
            java.lang.String r12 = "Leaf atom with length > 2147483647 (unsupported)."
            com.applovin.exoplayer2.ai r12 = com.applovin.exoplayer2.ai.a(r12)
            throw r12
        L_0x0139:
            java.lang.String r12 = "Leaf atom defines extended atom size (unsupported)."
            com.applovin.exoplayer2.ai r12 = com.applovin.exoplayer2.ai.a(r12)
            throw r12
        L_0x0140:
            long r0 = r11.u
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 > 0) goto L_0x014b
            r11.w = r7
        L_0x0148:
            r11.s = r3
        L_0x014a:
            return r3
        L_0x014b:
            java.lang.String r12 = "Skipping atom with length > 2147483647 (unsupported)."
            com.applovin.exoplayer2.ai r12 = com.applovin.exoplayer2.ai.a(r12)
            throw r12
        L_0x0152:
            java.lang.String r12 = "Atom size less than header length (unsupported)."
            com.applovin.exoplayer2.ai r12 = com.applovin.exoplayer2.ai.a(r12)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.g.e.b(com.applovin.exoplayer2.e.i):boolean");
    }

    private static long c(y yVar) {
        yVar.d(8);
        return a.a(yVar.q()) == 0 ? yVar.o() : yVar.y();
    }

    private void c(a.C0116a aVar) throws com.applovin.exoplayer2.ai {
        a(aVar, this.f12026g, this.f12024e != null, this.f12023d, this.k);
        com.applovin.exoplayer2.d.e a2 = a(aVar.f11983c);
        if (a2 != null) {
            int size = this.f12026g.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f12026g.valueAt(i2).a(a2);
            }
        }
        if (this.z != -9223372036854775807L) {
            int size2 = this.f12026g.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.f12026g.valueAt(i3).a(this.z);
            }
            this.z = -9223372036854775807L;
        }
    }

    private void c(i iVar) throws IOException {
        int i2 = ((int) this.u) - this.v;
        y yVar = this.w;
        if (yVar != null) {
            iVar.b(yVar.d(), 8, i2);
            a(new a.b(this.t, yVar), iVar.c());
        } else {
            iVar.b(i2);
        }
        a(iVar.c());
    }

    private static boolean c(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1836019558 || i2 == 1953653094 || i2 == 1836475768 || i2 == 1701082227;
    }

    private static long d(y yVar) {
        yVar.d(8);
        return a.a(yVar.q()) == 1 ? yVar.y() : yVar.o();
    }

    private void d(i iVar) throws IOException {
        int size = this.f12026g.size();
        long j2 = Long.MAX_VALUE;
        b bVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.f12026g.valueAt(i2).f12031b;
            if (mVar.q && mVar.f12079d < j2) {
                j2 = mVar.f12079d;
                bVar = this.f12026g.valueAt(i2);
            }
        }
        if (bVar == null) {
            this.s = 3;
            return;
        }
        int c2 = (int) (j2 - iVar.c());
        if (c2 >= 0) {
            iVar.b(c2);
            bVar.f12031b.a(iVar);
            return;
        }
        throw com.applovin.exoplayer2.ai.b("Offset to encryption data was negative.", (Throwable) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ h[] d() {
        return new h[]{new e()};
    }

    private boolean e(i iVar) throws IOException {
        int i2;
        int i3;
        i iVar2 = iVar;
        b bVar = this.C;
        Throwable th = null;
        if (bVar == null) {
            bVar = a(this.f12026g);
            if (bVar == null) {
                int c2 = (int) (this.x - iVar.c());
                if (c2 >= 0) {
                    iVar2.b(c2);
                    a();
                    return false;
                }
                throw com.applovin.exoplayer2.ai.b("Offset to end of mdat was negative.", (Throwable) null);
            }
            int c3 = (int) (bVar.c() - iVar.c());
            if (c3 < 0) {
                q.c("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                c3 = 0;
            }
            iVar2.b(c3);
            this.C = bVar;
        }
        int i4 = 4;
        int i5 = 1;
        if (this.s == 3) {
            this.D = bVar.d();
            if (bVar.f12035f < bVar.i) {
                iVar2.b(this.D);
                bVar.g();
                if (!bVar.f()) {
                    this.C = null;
                }
                this.s = 3;
                return true;
            }
            if (bVar.f12033d.f12084a.f12069g == 1) {
                this.D -= 8;
                iVar2.b(8);
            }
            if ("audio/ac4".equals(bVar.f12033d.f12084a.f12068f.l)) {
                this.E = bVar.a(this.D, 7);
                com.applovin.exoplayer2.b.c.a(this.D, this.l);
                bVar.f12030a.a(this.l, 7);
                i3 = this.E + 7;
            } else {
                i3 = bVar.a(this.D, 0);
            }
            this.E = i3;
            this.D += this.E;
            this.s = 4;
            this.F = 0;
        }
        k kVar = bVar.f12033d.f12084a;
        x xVar = bVar.f12030a;
        long b2 = bVar.b();
        ag agVar = this.m;
        if (agVar != null) {
            b2 = agVar.c(b2);
        }
        long j2 = b2;
        if (kVar.j == 0) {
            while (true) {
                int i6 = this.E;
                int i7 = this.D;
                if (i6 >= i7) {
                    break;
                }
                this.E += xVar.a((g) iVar2, i7 - i6, false);
            }
        } else {
            byte[] d2 = this.i.d();
            d2[0] = 0;
            d2[1] = 0;
            d2[2] = 0;
            int i8 = kVar.j + 1;
            int i9 = 4 - kVar.j;
            while (this.E < this.D) {
                int i10 = this.F;
                if (i10 == 0) {
                    iVar2.b(d2, i9, i8);
                    this.i.d(0);
                    int q2 = this.i.q();
                    if (q2 >= i5) {
                        this.F = q2 - 1;
                        this.f12027h.d(0);
                        xVar.a(this.f12027h, i4);
                        xVar.a(this.i, i5);
                        this.G = this.J.length > 0 && com.applovin.exoplayer2.l.v.a(kVar.f12068f.l, d2[i4]);
                        this.E += 5;
                        this.D += i9;
                    } else {
                        throw com.applovin.exoplayer2.ai.b("Invalid NAL length", th);
                    }
                } else {
                    if (this.G) {
                        this.j.a(i10);
                        iVar2.b(this.j.d(), 0, this.F);
                        xVar.a(this.j, this.F);
                        i2 = this.F;
                        int a2 = com.applovin.exoplayer2.l.v.a(this.j.d(), this.j.b());
                        this.j.d(MimeTypes.VIDEO_H265.equals(kVar.f12068f.l) ? 1 : 0);
                        this.j.c(a2);
                        com.applovin.exoplayer2.e.b.a(j2, this.j, this.J);
                    } else {
                        i2 = xVar.a((g) iVar2, i10, false);
                    }
                    this.E += i2;
                    this.F -= i2;
                    th = null;
                    i4 = 4;
                    i5 = 1;
                }
            }
        }
        int e2 = bVar.e();
        l h2 = bVar.h();
        xVar.a(j2, e2, this.D, 0, h2 != null ? h2.f12073c : null);
        b(j2);
        if (!bVar.f()) {
            this.C = null;
        }
        this.s = 3;
        return true;
    }

    public int a(i iVar, u uVar) throws IOException {
        while (true) {
            int i2 = this.s;
            if (i2 != 0) {
                if (i2 == 1) {
                    c(iVar);
                } else if (i2 == 2) {
                    d(iVar);
                } else if (e(iVar)) {
                    return 0;
                }
            } else if (!b(iVar)) {
                return -1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public k a(k kVar) {
        return kVar;
    }

    public void a(long j2, long j3) {
        int size = this.f12026g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f12026g.valueAt(i2).a();
        }
        this.q.clear();
        this.y = 0;
        this.z = j3;
        this.p.clear();
        a();
    }

    public void a(j jVar) {
        this.H = jVar;
        a();
        b();
        k kVar = this.f12024e;
        if (kVar != null) {
            this.f12026g.put(0, new b(jVar.a(0, kVar.f12064b), new n(this.f12024e, new long[0], new int[0], 0, new long[0], new int[0], 0), new c(0, 0, 0, 0)));
            this.H.a();
        }
    }

    public boolean a(i iVar) throws IOException {
        return j.a(iVar);
    }

    public void c() {
    }
}
