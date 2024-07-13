package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.d;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

public final class e implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final l f12211a = $$Lambda$e$FgKmDX7almKazsJxOUkYa06RKpw.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    private final int f12212b;

    /* renamed from: c  reason: collision with root package name */
    private final f f12213c;

    /* renamed from: d  reason: collision with root package name */
    private final y f12214d;

    /* renamed from: e  reason: collision with root package name */
    private final y f12215e;

    /* renamed from: f  reason: collision with root package name */
    private final x f12216f;

    /* renamed from: g  reason: collision with root package name */
    private j f12217g;

    /* renamed from: h  reason: collision with root package name */
    private long f12218h;
    private long i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;

    public e() {
        this(0);
    }

    public e(int i2) {
        this.f12212b = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.f12213c = new f(true);
        this.f12214d = new y(2048);
        this.j = -1;
        this.i = -1;
        y yVar = new y(10);
        this.f12215e = yVar;
        this.f12216f = new x(yVar.d());
    }

    private static int a(int i2, long j2) {
        return (int) ((((long) (i2 * 8)) * 1000000) / j2);
    }

    private void a(long j2, boolean z) {
        if (!this.m) {
            boolean z2 = false;
            boolean z3 = (this.f12212b & 1) != 0 && this.j > 0;
            if (!z3 || this.f12213c.c() != -9223372036854775807L || z) {
                if (!z3 || this.f12213c.c() == -9223372036854775807L) {
                    this.f12217g.a(new v.b(-9223372036854775807L));
                } else {
                    j jVar = this.f12217g;
                    if ((this.f12212b & 2) != 0) {
                        z2 = true;
                    }
                    jVar.a(b(j2, z2));
                }
                this.m = true;
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ h[] a() {
        return new h[]{new e()};
    }

    private int b(i iVar) throws IOException {
        int i2 = 0;
        while (true) {
            iVar.d(this.f12215e.d(), 0, 10);
            this.f12215e.d(0);
            if (this.f12215e.m() != 4801587) {
                break;
            }
            this.f12215e.e(3);
            int v = this.f12215e.v();
            i2 += v + 10;
            iVar.c(v);
        }
        iVar.a();
        iVar.c(i2);
        if (this.i == -1) {
            this.i = (long) i2;
        }
        return i2;
    }

    private v b(long j2, boolean z) {
        return new d(j2, this.i, a(this.j, this.f12213c.c()), this.j, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(com.applovin.exoplayer2.e.i r10) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r9.k
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = -1
            r9.j = r0
            r10.a()
            long r1 = r10.c()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0018
            r9.b(r10)
        L_0x0018:
            r1 = 0
            r2 = 0
        L_0x001a:
            r5 = 1
            com.applovin.exoplayer2.l.y r6 = r9.f12215e     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.d()     // Catch:{ EOFException -> 0x0076 }
            r7 = 2
            boolean r6 = r10.b(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 == 0) goto L_0x0076
            com.applovin.exoplayer2.l.y r6 = r9.f12215e     // Catch:{ EOFException -> 0x0076 }
            r6.d(r1)     // Catch:{ EOFException -> 0x0076 }
            com.applovin.exoplayer2.l.y r6 = r9.f12215e     // Catch:{ EOFException -> 0x0076 }
            int r6 = r6.i()     // Catch:{ EOFException -> 0x0076 }
            boolean r6 = com.applovin.exoplayer2.e.i.f.a((int) r6)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x003a
            goto L_0x0077
        L_0x003a:
            com.applovin.exoplayer2.l.y r6 = r9.f12215e     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.d()     // Catch:{ EOFException -> 0x0076 }
            r7 = 4
            boolean r6 = r10.b(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x0048
            goto L_0x0076
        L_0x0048:
            com.applovin.exoplayer2.l.x r6 = r9.f12216f     // Catch:{ EOFException -> 0x0076 }
            r7 = 14
            r6.a((int) r7)     // Catch:{ EOFException -> 0x0076 }
            com.applovin.exoplayer2.l.x r6 = r9.f12216f     // Catch:{ EOFException -> 0x0076 }
            r7 = 13
            int r6 = r6.c(r7)     // Catch:{ EOFException -> 0x0076 }
            r7 = 6
            if (r6 <= r7) goto L_0x006c
            long r7 = (long) r6     // Catch:{ EOFException -> 0x0076 }
            long r3 = r3 + r7
            int r2 = r2 + 1
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r7) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            int r6 = r6 + -6
            boolean r6 = r10.b(r6, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x001a
        L_0x006b:
            goto L_0x0076
        L_0x006c:
            r9.k = r5     // Catch:{ EOFException -> 0x0076 }
            java.lang.String r1 = "Malformed ADTS stream"
            r6 = 0
            com.applovin.exoplayer2.ai r1 = com.applovin.exoplayer2.ai.b(r1, r6)     // Catch:{ EOFException -> 0x0076 }
            throw r1     // Catch:{ EOFException -> 0x0076 }
        L_0x0076:
            r1 = r2
        L_0x0077:
            r10.a()
            if (r1 <= 0) goto L_0x0082
            long r0 = (long) r1
            long r3 = r3 / r0
            int r10 = (int) r3
            r9.j = r10
            goto L_0x0084
        L_0x0082:
            r9.j = r0
        L_0x0084:
            r9.k = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.e.c(com.applovin.exoplayer2.e.i):void");
    }

    public int a(i iVar, u uVar) throws IOException {
        a.a(this.f12217g);
        long d2 = iVar.d();
        int i2 = this.f12212b;
        if (((i2 & 2) == 0 && ((i2 & 1) == 0 || d2 == -1)) ? false : true) {
            c(iVar);
        }
        int a2 = iVar.a(this.f12214d.d(), 0, 2048);
        boolean z = a2 == -1;
        a(d2, z);
        if (z) {
            return -1;
        }
        this.f12214d.d(0);
        this.f12214d.c(a2);
        if (!this.l) {
            this.f12213c.a(this.f12218h, 4);
            this.l = true;
        }
        this.f12213c.a(this.f12214d);
        return 0;
    }

    public void a(long j2, long j3) {
        this.l = false;
        this.f12213c.a();
        this.f12218h = j3;
    }

    public void a(j jVar) {
        this.f12217g = jVar;
        this.f12213c.a(jVar, new ad.d(0, 1));
        jVar.a();
    }

    public boolean a(i iVar) throws IOException {
        int b2 = b(iVar);
        int i2 = b2;
        int i3 = 0;
        int i4 = 0;
        do {
            iVar.d(this.f12215e.d(), 0, 2);
            this.f12215e.d(0);
            if (f.a(this.f12215e.i())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                iVar.d(this.f12215e.d(), 0, 4);
                this.f12216f.a(14);
                int c2 = this.f12216f.c(13);
                if (c2 > 6) {
                    iVar.c(c2 - 6);
                    i4 += c2;
                }
            }
            i2++;
            iVar.a();
            iVar.c(i2);
            i3 = 0;
            i4 = 0;
        } while (i2 - b2 < 8192);
        return false;
    }

    public void c() {
    }
}
