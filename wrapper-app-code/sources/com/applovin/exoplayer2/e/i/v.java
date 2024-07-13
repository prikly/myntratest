package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

final class v {

    /* renamed from: a  reason: collision with root package name */
    private final ag f12358a = new ag(0);

    /* renamed from: b  reason: collision with root package name */
    private final y f12359b = new y();

    /* renamed from: c  reason: collision with root package name */
    private boolean f12360c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12361d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12362e;

    /* renamed from: f  reason: collision with root package name */
    private long f12363f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    private long f12364g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f12365h = -9223372036854775807L;

    v() {
    }

    private int a(i iVar) {
        this.f12359b.a(ai.f13530f);
        this.f12360c = true;
        iVar.a();
        return 0;
    }

    private int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i + 1] & 255) << Ascii.DLE) | ((bArr[i + 2] & 255) << 8);
    }

    public static long a(y yVar) {
        int c2 = yVar.c();
        if (yVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        yVar.a(bArr, 0, 9);
        yVar.d(c2);
        if (!a(bArr)) {
            return -9223372036854775807L;
        }
        return b(bArr);
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(i iVar, u uVar) throws IOException {
        int min = (int) Math.min(20000, iVar.d());
        long j = (long) 0;
        if (iVar.c() != j) {
            uVar.f12451a = j;
            return 1;
        }
        this.f12359b.a(min);
        iVar.a();
        iVar.d(this.f12359b.d(), 0, min);
        this.f12363f = b(this.f12359b);
        this.f12361d = true;
        return 0;
    }

    private long b(y yVar) {
        int b2 = yVar.b();
        for (int c2 = yVar.c(); c2 < b2 - 3; c2++) {
            if (a(yVar.d(), c2) == 442) {
                yVar.d(c2 + 4);
                long a2 = a(yVar);
                if (a2 != -9223372036854775807L) {
                    return a2;
                }
            }
        }
        return -9223372036854775807L;
    }

    private static long b(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    private int c(i iVar, u uVar) throws IOException {
        long d2 = iVar.d();
        int min = (int) Math.min(20000, d2);
        long j = d2 - ((long) min);
        if (iVar.c() != j) {
            uVar.f12451a = j;
            return 1;
        }
        this.f12359b.a(min);
        iVar.a();
        iVar.d(this.f12359b.d(), 0, min);
        this.f12364g = c(this.f12359b);
        this.f12362e = true;
        return 0;
    }

    private long c(y yVar) {
        int c2 = yVar.c();
        for (int b2 = yVar.b() - 4; b2 >= c2; b2--) {
            if (a(yVar.d(), b2) == 442) {
                yVar.d(b2 + 4);
                long a2 = a(yVar);
                if (a2 != -9223372036854775807L) {
                    return a2;
                }
            }
        }
        return -9223372036854775807L;
    }

    public int a(i iVar, u uVar) throws IOException {
        if (!this.f12362e) {
            return c(iVar, uVar);
        }
        if (this.f12364g == -9223372036854775807L) {
            return a(iVar);
        }
        if (!this.f12361d) {
            return b(iVar, uVar);
        }
        long j = this.f12363f;
        if (j == -9223372036854775807L) {
            return a(iVar);
        }
        long b2 = this.f12358a.b(this.f12364g) - this.f12358a.b(j);
        this.f12365h = b2;
        if (b2 < 0) {
            q.c("PsDurationReader", "Invalid duration: " + this.f12365h + ". Using TIME_UNSET instead.");
            this.f12365h = -9223372036854775807L;
        }
        return a(iVar);
    }

    public boolean a() {
        return this.f12360c;
    }

    public ag b() {
        return this.f12358a;
    }

    public long c() {
        return this.f12365h;
    }
}
