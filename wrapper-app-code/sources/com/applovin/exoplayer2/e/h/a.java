package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.k;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.l.ai;
import java.io.EOFException;
import java.io.IOException;

final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private final e f12092a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f12093b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final long f12094c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final h f12095d;

    /* renamed from: e  reason: collision with root package name */
    private int f12096e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public long f12097f;

    /* renamed from: g  reason: collision with root package name */
    private long f12098g;

    /* renamed from: h  reason: collision with root package name */
    private long f12099h;
    private long i;
    private long j;
    private long k;
    private long l;

    /* renamed from: com.applovin.exoplayer2.e.h.a$a  reason: collision with other inner class name */
    private final class C0118a implements v {
        private C0118a() {
        }

        public v.a a(long j) {
            return new v.a(new w(j, ai.a((a.this.f12093b + ((a.this.f12095d.b(j) * (a.this.f12094c - a.this.f12093b)) / a.this.f12097f)) - 30000, a.this.f12093b, a.this.f12094c - 1)));
        }

        public boolean a() {
            return true;
        }

        public long b() {
            return a.this.f12095d.a(a.this.f12097f);
        }
    }

    public a(h hVar, long j2, long j3, long j4, long j5, boolean z) {
        com.applovin.exoplayer2.l.a.a(j2 >= 0 && j3 > j2);
        this.f12095d = hVar;
        this.f12093b = j2;
        this.f12094c = j3;
        if (j4 == j3 - j2 || z) {
            this.f12097f = j5;
            this.f12096e = 4;
        } else {
            this.f12096e = 0;
        }
        this.f12092a = new e();
    }

    private long c(i iVar) throws IOException {
        i iVar2 = iVar;
        if (this.i == this.j) {
            return -1;
        }
        long c2 = iVar.c();
        if (!this.f12092a.a(iVar2, this.j)) {
            long j2 = this.i;
            if (j2 != c2) {
                return j2;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f12092a.a(iVar2, false);
        iVar.a();
        long j3 = this.f12099h - this.f12092a.f12118c;
        int i2 = this.f12092a.f12123h + this.f12092a.i;
        if (0 <= j3 && j3 < 72000) {
            return -1;
        }
        int i3 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i3 < 0) {
            this.j = c2;
            this.l = this.f12092a.f12118c;
        } else {
            this.i = iVar.c() + ((long) i2);
            this.k = this.f12092a.f12118c;
        }
        long j4 = this.j;
        long j5 = this.i;
        if (j4 - j5 < 100000) {
            this.j = j5;
            return j5;
        }
        long j6 = ((long) i2) * (i3 <= 0 ? 2 : 1);
        long j7 = this.j;
        long j8 = this.i;
        return ai.a((iVar.c() - j6) + ((j3 * (j7 - j8)) / (this.l - this.k)), j8, j7 - 1);
    }

    private void d(i iVar) throws IOException {
        while (true) {
            this.f12092a.a(iVar);
            this.f12092a.a(iVar, false);
            if (this.f12092a.f12118c > this.f12099h) {
                iVar.a();
                return;
            }
            iVar.b(this.f12092a.f12123h + this.f12092a.i);
            this.i = iVar.c();
            this.k = this.f12092a.f12118c;
        }
    }

    public long a(i iVar) throws IOException {
        int i2 = this.f12096e;
        if (i2 == 0) {
            long c2 = iVar.c();
            this.f12098g = c2;
            this.f12096e = 1;
            long j2 = this.f12094c - 65307;
            if (j2 > c2) {
                return j2;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                long c3 = c(iVar);
                if (c3 != -1) {
                    return c3;
                }
                this.f12096e = 3;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            d(iVar);
            this.f12096e = 4;
            return -(this.k + 2);
        }
        this.f12097f = b(iVar);
        this.f12096e = 4;
        return this.f12098g;
    }

    /* renamed from: a */
    public C0118a b() {
        if (this.f12097f != 0) {
            return new C0118a();
        }
        return null;
    }

    public void a(long j2) {
        this.f12099h = ai.a(j2, 0, this.f12097f - 1);
        this.f12096e = 2;
        this.i = this.f12093b;
        this.j = this.f12094c;
        this.k = 0;
        this.l = this.f12097f;
    }

    /* access modifiers changed from: package-private */
    public long b(i iVar) throws IOException {
        long j2;
        this.f12092a.a();
        if (this.f12092a.a(iVar)) {
            this.f12092a.a(iVar, false);
            iVar.b(this.f12092a.f12123h + this.f12092a.i);
            do {
                j2 = this.f12092a.f12118c;
                if ((this.f12092a.f12117b & 4) == 4 || !this.f12092a.a(iVar) || iVar.c() >= this.f12094c || !this.f12092a.a(iVar, true) || !k.a(iVar, this.f12092a.f12123h + this.f12092a.i)) {
                    return j2;
                }
                j2 = this.f12092a.f12118c;
                break;
            } while (!k.a(iVar, this.f12092a.f12123h + this.f12092a.i));
            return j2;
        }
        throw new EOFException();
    }
}
