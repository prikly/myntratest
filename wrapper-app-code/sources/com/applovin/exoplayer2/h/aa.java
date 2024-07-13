package com.applovin.exoplayer2.h;

import android.net.Uri;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.l.a;

public final class aa extends ba {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f12739c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final ab f12740d = new ab.b().a("SinglePeriodTimeline").a(Uri.EMPTY).a();

    /* renamed from: e  reason: collision with root package name */
    private final long f12741e;

    /* renamed from: f  reason: collision with root package name */
    private final long f12742f;

    /* renamed from: g  reason: collision with root package name */
    private final long f12743g;

    /* renamed from: h  reason: collision with root package name */
    private final long f12744h;
    private final long i;
    private final long j;
    private final long k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final Object o;
    private final ab p;
    private final ab.e q;

    public aa(long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z, boolean z2, boolean z3, Object obj, ab abVar, ab.e eVar) {
        this.f12741e = j2;
        this.f12742f = j3;
        this.f12743g = j4;
        this.f12744h = j5;
        this.i = j6;
        this.j = j7;
        this.k = j8;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = obj;
        this.p = (ab) a.b(abVar);
        this.q = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public aa(long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, Object obj, ab abVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j2, j3, j4, j5, z, z2, false, obj, abVar, z3 ? abVar.f10977d : null);
    }

    public aa(long j2, boolean z, boolean z2, boolean z3, Object obj, ab abVar) {
        this(j2, j2, 0, 0, z, z2, z3, obj, abVar);
    }

    public ba.a a(int i2, ba.a aVar, boolean z) {
        a.a(i2, 0, 1);
        return aVar.a((Object) null, z ? f12739c : null, 0, this.f12744h, -this.j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r1 > r6) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.applovin.exoplayer2.ba.c a(int r28, com.applovin.exoplayer2.ba.c r29, long r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = 0
            r2 = 1
            r3 = r28
            com.applovin.exoplayer2.l.a.a(r3, r1, r2)
            long r1 = r0.k
            boolean r3 = r0.m
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x002e
            boolean r3 = r0.n
            if (r3 != 0) goto L_0x002e
            r6 = 0
            int r3 = (r30 > r6 ? 1 : (r30 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x002e
            long r6 = r0.i
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0027
        L_0x0024:
            r19 = r4
            goto L_0x0030
        L_0x0027:
            long r1 = r1 + r30
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x002e
            goto L_0x0024
        L_0x002e:
            r19 = r1
        L_0x0030:
            java.lang.Object r7 = com.applovin.exoplayer2.ba.c.f11373a
            com.applovin.exoplayer2.ab r8 = r0.p
            java.lang.Object r9 = r0.o
            long r10 = r0.f12741e
            long r12 = r0.f12742f
            long r14 = r0.f12743g
            boolean r1 = r0.l
            r16 = r1
            boolean r1 = r0.m
            r17 = r1
            com.applovin.exoplayer2.ab$e r1 = r0.q
            r18 = r1
            long r1 = r0.i
            r21 = r1
            r23 = 0
            r24 = 0
            long r1 = r0.j
            r25 = r1
            r6 = r29
            com.applovin.exoplayer2.ba$c r1 = r6.a(r7, r8, r9, r10, r12, r14, r16, r17, r18, r19, r21, r23, r24, r25)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.aa.a(int, com.applovin.exoplayer2.ba$c, long):com.applovin.exoplayer2.ba$c");
    }

    public Object a(int i2) {
        a.a(i2, 0, 1);
        return f12739c;
    }

    public int b() {
        return 1;
    }

    public int c() {
        return 1;
    }

    public int c(Object obj) {
        return f12739c.equals(obj) ? 0 : -1;
    }
}
