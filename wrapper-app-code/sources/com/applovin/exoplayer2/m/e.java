package com.applovin.exoplayer2.m;

import java.util.Arrays;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private a f13691a = new a();

    /* renamed from: b  reason: collision with root package name */
    private a f13692b = new a();

    /* renamed from: c  reason: collision with root package name */
    private boolean f13693c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13694d;

    /* renamed from: e  reason: collision with root package name */
    private long f13695e = -9223372036854775807L;

    /* renamed from: f  reason: collision with root package name */
    private int f13696f;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f13697a;

        /* renamed from: b  reason: collision with root package name */
        private long f13698b;

        /* renamed from: c  reason: collision with root package name */
        private long f13699c;

        /* renamed from: d  reason: collision with root package name */
        private long f13700d;

        /* renamed from: e  reason: collision with root package name */
        private long f13701e;

        /* renamed from: f  reason: collision with root package name */
        private long f13702f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean[] f13703g = new boolean[15];

        /* renamed from: h  reason: collision with root package name */
        private int f13704h;

        private static int b(long j) {
            return (int) (j % 15);
        }

        public void a() {
            this.f13700d = 0;
            this.f13701e = 0;
            this.f13702f = 0;
            this.f13704h = 0;
            Arrays.fill(this.f13703g, false);
        }

        public void a(long j) {
            int i;
            long j2 = this.f13700d;
            if (j2 == 0) {
                this.f13697a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f13697a;
                this.f13698b = j3;
                this.f13702f = j3;
                this.f13701e = 1;
            } else {
                long j4 = j - this.f13699c;
                int b2 = b(j2);
                if (Math.abs(j4 - this.f13698b) <= 1000000) {
                    this.f13701e++;
                    this.f13702f += j4;
                    boolean[] zArr = this.f13703g;
                    if (zArr[b2]) {
                        zArr[b2] = false;
                        i = this.f13704h - 1;
                    }
                } else {
                    boolean[] zArr2 = this.f13703g;
                    if (!zArr2[b2]) {
                        zArr2[b2] = true;
                        i = this.f13704h + 1;
                    }
                }
                this.f13704h = i;
            }
            this.f13700d++;
            this.f13699c = j;
        }

        public boolean b() {
            return this.f13700d > 15 && this.f13704h == 0;
        }

        public boolean c() {
            long j = this.f13700d;
            if (j == 0) {
                return false;
            }
            return this.f13703g[b(j - 1)];
        }

        public long d() {
            return this.f13702f;
        }

        public long e() {
            long j = this.f13701e;
            if (j == 0) {
                return 0;
            }
            return this.f13702f / j;
        }
    }

    public void a() {
        this.f13691a.a();
        this.f13692b.a();
        this.f13693c = false;
        this.f13695e = -9223372036854775807L;
        this.f13696f = 0;
    }

    public void a(long j) {
        this.f13691a.a(j);
        int i = 0;
        if (this.f13691a.b() && !this.f13694d) {
            this.f13693c = false;
        } else if (this.f13695e != -9223372036854775807L) {
            if (!this.f13693c || this.f13692b.c()) {
                this.f13692b.a();
                this.f13692b.a(this.f13695e);
            }
            this.f13693c = true;
            this.f13692b.a(j);
        }
        if (this.f13693c && this.f13692b.b()) {
            a aVar = this.f13691a;
            this.f13691a = this.f13692b;
            this.f13692b = aVar;
            this.f13693c = false;
            this.f13694d = false;
        }
        this.f13695e = j;
        if (!this.f13691a.b()) {
            i = this.f13696f + 1;
        }
        this.f13696f = i;
    }

    public boolean b() {
        return this.f13691a.b();
    }

    public int c() {
        return this.f13696f;
    }

    public long d() {
        if (b()) {
            return this.f13691a.d();
        }
        return -9223372036854775807L;
    }

    public long e() {
        if (b()) {
            return this.f13691a.e();
        }
        return -9223372036854775807L;
    }

    public float f() {
        if (b()) {
            return (float) (1.0E9d / ((double) this.f13691a.e()));
        }
        return -1.0f;
    }
}
