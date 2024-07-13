package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ai;
import java.io.IOException;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final C0113a f11803a;

    /* renamed from: b  reason: collision with root package name */
    protected final f f11804b;

    /* renamed from: c  reason: collision with root package name */
    protected c f11805c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11806d;

    /* renamed from: com.applovin.exoplayer2.e.a$a  reason: collision with other inner class name */
    public static class C0113a implements v {

        /* renamed from: a  reason: collision with root package name */
        private final d f11807a;

        /* renamed from: b  reason: collision with root package name */
        private final long f11808b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f11809c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f11810d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final long f11811e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final long f11812f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final long f11813g;

        public C0113a(d dVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f11807a = dVar;
            this.f11808b = j;
            this.f11809c = j2;
            this.f11810d = j3;
            this.f11811e = j4;
            this.f11812f = j5;
            this.f11813g = j6;
        }

        public v.a a(long j) {
            return new v.a(new w(j, c.a(this.f11807a.timeUsToTargetTime(j), this.f11809c, this.f11810d, this.f11811e, this.f11812f, this.f11813g)));
        }

        public boolean a() {
            return true;
        }

        public long b() {
            return this.f11808b;
        }

        public long b(long j) {
            return this.f11807a.timeUsToTargetTime(j);
        }
    }

    public static final class b implements d {
        public long timeUsToTargetTime(long j) {
            return j;
        }
    }

    protected static class c {

        /* renamed from: a  reason: collision with root package name */
        private final long f11822a;

        /* renamed from: b  reason: collision with root package name */
        private final long f11823b;

        /* renamed from: c  reason: collision with root package name */
        private final long f11824c;

        /* renamed from: d  reason: collision with root package name */
        private long f11825d;

        /* renamed from: e  reason: collision with root package name */
        private long f11826e;

        /* renamed from: f  reason: collision with root package name */
        private long f11827f;

        /* renamed from: g  reason: collision with root package name */
        private long f11828g;

        /* renamed from: h  reason: collision with root package name */
        private long f11829h;

        protected c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f11822a = j;
            this.f11823b = j2;
            this.f11825d = j3;
            this.f11826e = j4;
            this.f11827f = j5;
            this.f11828g = j6;
            this.f11824c = j7;
            this.f11829h = a(j2, j3, j4, j5, j6, j7);
        }

        /* access modifiers changed from: private */
        public long a() {
            return this.f11827f;
        }

        protected static long a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
            return ai.a(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* access modifiers changed from: private */
        public void a(long j, long j2) {
            this.f11825d = j;
            this.f11827f = j2;
            f();
        }

        /* access modifiers changed from: private */
        public long b() {
            return this.f11828g;
        }

        /* access modifiers changed from: private */
        public void b(long j, long j2) {
            this.f11826e = j;
            this.f11828g = j2;
            f();
        }

        /* access modifiers changed from: private */
        public long c() {
            return this.f11823b;
        }

        /* access modifiers changed from: private */
        public long d() {
            return this.f11822a;
        }

        /* access modifiers changed from: private */
        public long e() {
            return this.f11829h;
        }

        private void f() {
            this.f11829h = a(this.f11823b, this.f11825d, this.f11826e, this.f11827f, this.f11828g, this.f11824c);
        }
    }

    protected interface d {
        long timeUsToTargetTime(long j);
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f11830a = new e(-3, -9223372036854775807L, -1);
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final int f11831b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f11832c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final long f11833d;

        private e(int i, long j, long j2) {
            this.f11831b = i;
            this.f11832c = j;
            this.f11833d = j2;
        }

        public static e a(long j) {
            return new e(0, -9223372036854775807L, j);
        }

        public static e a(long j, long j2) {
            return new e(-1, j, j2);
        }

        public static e b(long j, long j2) {
            return new e(-2, j, j2);
        }
    }

    protected interface f {

        /* renamed from: com.applovin.exoplayer2.e.a$f$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(f fVar) {
            }
        }

        e a(i iVar, long j) throws IOException;

        void a();
    }

    protected a(d dVar, f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f11804b = fVar;
        this.f11806d = i;
        this.f11803a = new C0113a(dVar, j, j2, j3, j4, j5, j6);
    }

    /* access modifiers changed from: protected */
    public final int a(i iVar, long j, u uVar) {
        if (j == iVar.c()) {
            return 0;
        }
        uVar.f12451a = j;
        return 1;
    }

    public int a(i iVar, u uVar) throws IOException {
        while (true) {
            c cVar = (c) com.applovin.exoplayer2.l.a.a(this.f11805c);
            long b2 = cVar.a();
            long c2 = cVar.b();
            long d2 = cVar.e();
            if (c2 - b2 <= ((long) this.f11806d)) {
                a(false, b2);
                return a(iVar, b2, uVar);
            } else if (!a(iVar, d2)) {
                return a(iVar, d2, uVar);
            } else {
                iVar.a();
                e a2 = this.f11804b.a(iVar, cVar.c());
                int a3 = a2.f11831b;
                if (a3 == -3) {
                    a(false, d2);
                    return a(iVar, d2, uVar);
                } else if (a3 == -2) {
                    cVar.a(a2.f11832c, a2.f11833d);
                } else if (a3 == -1) {
                    cVar.b(a2.f11832c, a2.f11833d);
                } else if (a3 == 0) {
                    a(iVar, a2.f11833d);
                    a(true, a2.f11833d);
                    return a(iVar, a2.f11833d, uVar);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    public final v a() {
        return this.f11803a;
    }

    public final void a(long j) {
        c cVar = this.f11805c;
        if (cVar == null || cVar.d() != j) {
            this.f11805c = b(j);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, long j) {
        this.f11805c = null;
        this.f11804b.a();
        b(z, j);
    }

    /* access modifiers changed from: protected */
    public final boolean a(i iVar, long j) throws IOException {
        long c2 = j - iVar.c();
        if (c2 < 0 || c2 > 262144) {
            return false;
        }
        iVar.b((int) c2);
        return true;
    }

    /* access modifiers changed from: protected */
    public c b(long j) {
        long j2 = j;
        return new c(j2, this.f11803a.b(j2), this.f11803a.f11809c, this.f11803a.f11810d, this.f11803a.f11811e, this.f11803a.f11812f, this.f11803a.f11813g);
    }

    /* access modifiers changed from: protected */
    public void b(boolean z, long j) {
    }

    public final boolean b() {
        return this.f11805c != null;
    }
}
