package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class w implements f {

    /* renamed from: b  reason: collision with root package name */
    private int f11347b;

    /* renamed from: c  reason: collision with root package name */
    private float f11348c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f11349d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private f.a f11350e = f.a.f11228a;

    /* renamed from: f  reason: collision with root package name */
    private f.a f11351f = f.a.f11228a;

    /* renamed from: g  reason: collision with root package name */
    private f.a f11352g = f.a.f11228a;

    /* renamed from: h  reason: collision with root package name */
    private f.a f11353h = f.a.f11228a;
    private boolean i;
    private v j;
    private ByteBuffer k;
    private ShortBuffer l;
    private ByteBuffer m;
    private long n;
    private long o;
    private boolean p;

    public w() {
        ByteBuffer byteBuffer = f11227a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = f11227a;
        this.f11347b = -1;
    }

    public long a(long j2) {
        if (this.o < 1024) {
            return (long) (((double) this.f11348c) * ((double) j2));
        }
        long a2 = this.n - ((long) ((v) a.b(this.j)).a());
        if (this.f11353h.f11229b == this.f11352g.f11229b) {
            return ai.d(j2, a2, this.o);
        }
        return ai.d(j2, a2 * ((long) this.f11353h.f11229b), this.o * ((long) this.f11352g.f11229b));
    }

    public f.a a(f.a aVar) throws f.b {
        if (aVar.f11231d == 2) {
            int i2 = this.f11347b;
            if (i2 == -1) {
                i2 = aVar.f11229b;
            }
            this.f11350e = aVar;
            f.a aVar2 = new f.a(i2, aVar.f11230c, 2);
            this.f11351f = aVar2;
            this.i = true;
            return aVar2;
        }
        throw new f.b(aVar);
    }

    public void a(float f2) {
        if (this.f11348c != f2) {
            this.f11348c = f2;
            this.i = true;
        }
    }

    public void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += (long) remaining;
            ((v) a.b(this.j)).a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public boolean a() {
        return this.f11351f.f11229b != -1 && (Math.abs(this.f11348c - 1.0f) >= 1.0E-4f || Math.abs(this.f11349d - 1.0f) >= 1.0E-4f || this.f11351f.f11229b != this.f11350e.f11229b);
    }

    public void b() {
        v vVar = this.j;
        if (vVar != null) {
            vVar.b();
        }
        this.p = true;
    }

    public void b(float f2) {
        if (this.f11349d != f2) {
            this.f11349d = f2;
            this.i = true;
        }
    }

    public ByteBuffer c() {
        int d2;
        v vVar = this.j;
        if (vVar != null && (d2 = vVar.d()) > 0) {
            if (this.k.capacity() < d2) {
                ByteBuffer order = ByteBuffer.allocateDirect(d2).order(ByteOrder.nativeOrder());
                this.k = order;
                this.l = order.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            vVar.b(this.l);
            this.o += (long) d2;
            this.k.limit(d2);
            this.m = this.k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = f11227a;
        return byteBuffer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r1 = this;
            boolean r0 = r1.p
            if (r0 == 0) goto L_0x0010
            com.applovin.exoplayer2.b.v r0 = r1.j
            if (r0 == 0) goto L_0x000e
            int r0 = r0.d()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.b.w.d():boolean");
    }

    public void e() {
        if (a()) {
            f.a aVar = this.f11350e;
            this.f11352g = aVar;
            this.f11353h = this.f11351f;
            if (this.i) {
                this.j = new v(aVar.f11229b, this.f11352g.f11230c, this.f11348c, this.f11349d, this.f11353h.f11229b);
            } else {
                v vVar = this.j;
                if (vVar != null) {
                    vVar.c();
                }
            }
        }
        this.m = f11227a;
        this.n = 0;
        this.o = 0;
        this.p = false;
    }

    public void f() {
        this.f11348c = 1.0f;
        this.f11349d = 1.0f;
        this.f11350e = f.a.f11228a;
        this.f11351f = f.a.f11228a;
        this.f11352g = f.a.f11228a;
        this.f11353h = f.a.f11228a;
        ByteBuffer byteBuffer = f11227a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = f11227a;
        this.f11347b = -1;
        this.i = false;
        this.j = null;
        this.n = 0;
        this.o = 0;
        this.p = false;
    }
}
