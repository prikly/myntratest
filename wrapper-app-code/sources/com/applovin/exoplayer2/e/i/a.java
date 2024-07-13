package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final l f12146a = $$Lambda$a$J3GBVKR5iHguCSck9RLzCgkKqB0.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    private final b f12147b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final y f12148c = new y(2786);

    /* renamed from: d  reason: collision with root package name */
    private boolean f12149d;

    /* access modifiers changed from: private */
    public static /* synthetic */ h[] a() {
        return new h[]{new a()};
    }

    public int a(i iVar, u uVar) throws IOException {
        int a2 = iVar.a(this.f12148c.d(), 0, 2786);
        if (a2 == -1) {
            return -1;
        }
        this.f12148c.d(0);
        this.f12148c.c(a2);
        if (!this.f12149d) {
            this.f12147b.a(0, 4);
            this.f12149d = true;
        }
        this.f12147b.a(this.f12148c);
        return 0;
    }

    public void a(long j, long j2) {
        this.f12149d = false;
        this.f12147b.a();
    }

    public void a(j jVar) {
        this.f12147b.a(jVar, new ad.d(0, 1));
        jVar.a();
        jVar.a(new v.b(-9223372036854775807L));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        r8.a();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if ((r4 - r3) < 8192) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.applovin.exoplayer2.e.i r8) throws java.io.IOException {
        /*
            r7 = this;
            com.applovin.exoplayer2.l.y r0 = new com.applovin.exoplayer2.l.y
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.d()
            r8.d(r4, r2, r1)
            r0.d(r2)
            int r4 = r0.m()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x005f
            r8.a()
            r8.c(r3)
            r4 = r3
        L_0x0023:
            r1 = 0
        L_0x0024:
            byte[] r5 = r0.d()
            r6 = 6
            r8.d(r5, r2, r6)
            r0.d(r2)
            int r5 = r0.i()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L_0x0047
            r8.a()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0043
            return r2
        L_0x0043:
            r8.c(r4)
            goto L_0x0023
        L_0x0047:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L_0x004d
            return r5
        L_0x004d:
            byte[] r5 = r0.d()
            int r5 = com.applovin.exoplayer2.b.b.a((byte[]) r5)
            r6 = -1
            if (r5 != r6) goto L_0x0059
            return r2
        L_0x0059:
            int r5 = r5 + -6
            r8.c(r5)
            goto L_0x0024
        L_0x005f:
            r4 = 3
            r0.e(r4)
            int r4 = r0.v()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.c(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.a.a(com.applovin.exoplayer2.e.i):boolean");
    }

    public void c() {
    }
}
