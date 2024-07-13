package com.bytedance.sdk.openadsdk.b.b.b;

import com.bykv.vk.openvk.component.video.api.c.c;
import com.bytedance.sdk.openadsdk.core.e.n;

/* compiled from: VideoLogHelperModel */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private long f278a;

    /* renamed from: b  reason: collision with root package name */
    private String f279b;

    /* renamed from: c  reason: collision with root package name */
    private int f280c;

    /* renamed from: d  reason: collision with root package name */
    private c f281d;

    /* renamed from: e  reason: collision with root package name */
    private n f282e;

    public o(long j, String str, int i, c cVar, n nVar) {
        this.f278a = j;
        this.f279b = str;
        this.f280c = i;
        this.f281d = cVar;
        this.f282e = nVar;
    }

    public long a() {
        return this.f278a;
    }

    public String b() {
        return this.f279b;
    }

    public int c() {
        return this.f280c;
    }

    public c d() {
        return this.f281d;
    }

    public n e() {
        return this.f282e;
    }

    /* compiled from: VideoLogHelperModel */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private long f283a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f284b = 0;

        /* renamed from: c  reason: collision with root package name */
        private long f285c = 0;

        /* renamed from: d  reason: collision with root package name */
        private boolean f286d = false;

        /* renamed from: e  reason: collision with root package name */
        private int f287e = 0;

        /* renamed from: f  reason: collision with root package name */
        private int f288f = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f289g;

        /* renamed from: h  reason: collision with root package name */
        private int f290h;
        private int i;
        private int j;
        private int k;
        private boolean l = false;

        public long a() {
            return this.f283a;
        }

        public void a(long j2) {
            this.f283a = j2;
        }

        public long b() {
            return this.f284b;
        }

        public void b(long j2) {
            this.f284b = j2;
        }

        public long c() {
            return this.f285c;
        }

        public void c(long j2) {
            this.f285c = j2;
        }

        public int d() {
            return this.f287e;
        }

        public void a(int i2) {
            this.f287e = i2;
        }

        public int e() {
            return this.f288f;
        }

        public void b(int i2) {
            this.f288f = i2;
        }

        public int f() {
            return this.f289g;
        }

        public void c(int i2) {
            this.f289g = i2;
        }

        public int g() {
            return this.f290h;
        }

        public void d(int i2) {
            this.f290h = i2;
        }

        public int h() {
            long j2 = this.f285c;
            if (j2 <= 0) {
                return 0;
            }
            return Math.min((int) ((this.f283a * 100) / j2), 100);
        }

        public int i() {
            return this.i;
        }

        public void e(int i2) {
            this.i = i2;
        }

        public int j() {
            return this.j;
        }

        public int k() {
            return this.k;
        }

        public void f(int i2) {
            this.k = i2;
        }

        public boolean l() {
            return this.l;
        }

        public boolean m() {
            return this.f286d;
        }

        public void a(boolean z) {
            this.f286d = z;
        }
    }
}
