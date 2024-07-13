package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.e.f.d;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.l.a;
import java.io.IOException;

public final class c implements s {

    /* renamed from: a  reason: collision with root package name */
    private final l f12758a;

    /* renamed from: b  reason: collision with root package name */
    private h f12759b;

    /* renamed from: c  reason: collision with root package name */
    private i f12760c;

    public c(l lVar) {
        this.f12758a = lVar;
    }

    public int a(u uVar) throws IOException {
        return ((h) a.b(this.f12759b)).a((i) a.b(this.f12760c), uVar);
    }

    public void a() {
        h hVar = this.f12759b;
        if (hVar != null) {
            hVar.c();
            this.f12759b = null;
        }
        this.f12760c = null;
    }

    public void a(long j, long j2) {
        ((h) a.b(this.f12759b)).a(j, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r0.c() != r11) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006d, code lost:
        if (r0.c() != r11) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0070, code lost:
        r1 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.applovin.exoplayer2.k.g r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, com.applovin.exoplayer2.e.j r15) throws java.io.IOException {
        /*
            r7 = this;
            com.applovin.exoplayer2.e.e r6 = new com.applovin.exoplayer2.e.e
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f12760c = r6
            com.applovin.exoplayer2.e.h r8 = r7.f12759b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            com.applovin.exoplayer2.e.l r8 = r7.f12758a
            com.applovin.exoplayer2.e.h[] r8 = r8.a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0020
            r8 = r8[r13]
            r7.f12759b = r8
            goto L_0x0080
        L_0x0020:
            int r10 = r8.length
            r0 = 0
        L_0x0022:
            if (r0 >= r10) goto L_0x007c
            r1 = r8[r0]
            boolean r2 = r1.a((com.applovin.exoplayer2.e.i) r6)     // Catch:{ EOFException -> 0x0062, all -> 0x004d }
            if (r2 == 0) goto L_0x0040
            r7.f12759b = r1     // Catch:{ EOFException -> 0x0062, all -> 0x004d }
            if (r1 != 0) goto L_0x0038
            long r0 = r6.c()
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0039
        L_0x0038:
            r13 = 1
        L_0x0039:
            com.applovin.exoplayer2.l.a.b((boolean) r13)
            r6.a()
            goto L_0x007c
        L_0x0040:
            com.applovin.exoplayer2.e.h r1 = r7.f12759b
            if (r1 != 0) goto L_0x0072
            long r1 = r6.c()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0070
            goto L_0x0072
        L_0x004d:
            r8 = move-exception
            com.applovin.exoplayer2.e.h r9 = r7.f12759b
            if (r9 != 0) goto L_0x005a
            long r9 = r6.c()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x005b
        L_0x005a:
            r13 = 1
        L_0x005b:
            com.applovin.exoplayer2.l.a.b((boolean) r13)
            r6.a()
            throw r8
        L_0x0062:
            com.applovin.exoplayer2.e.h r1 = r7.f12759b
            if (r1 != 0) goto L_0x0072
            long r1 = r6.c()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r1 = 0
            goto L_0x0073
        L_0x0072:
            r1 = 1
        L_0x0073:
            com.applovin.exoplayer2.l.a.b((boolean) r1)
            r6.a()
            int r0 = r0 + 1
            goto L_0x0022
        L_0x007c:
            com.applovin.exoplayer2.e.h r10 = r7.f12759b
            if (r10 == 0) goto L_0x0086
        L_0x0080:
            com.applovin.exoplayer2.e.h r8 = r7.f12759b
            r8.a((com.applovin.exoplayer2.e.j) r15)
            return
        L_0x0086:
            com.applovin.exoplayer2.h.ae r10 = new com.applovin.exoplayer2.h.ae
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = com.applovin.exoplayer2.l.ai.b((java.lang.Object[]) r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = com.applovin.exoplayer2.l.a.b(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.c.a(com.applovin.exoplayer2.k.g, android.net.Uri, java.util.Map, long, long, com.applovin.exoplayer2.e.j):void");
    }

    public void b() {
        h hVar = this.f12759b;
        if (hVar instanceof d) {
            ((d) hVar).a();
        }
    }

    public long c() {
        i iVar = this.f12760c;
        if (iVar != null) {
            return iVar.c();
        }
        return -1;
    }
}
