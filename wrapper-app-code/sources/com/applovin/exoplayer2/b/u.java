package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;

public final class u extends l {

    /* renamed from: d  reason: collision with root package name */
    private final long f11334d;

    /* renamed from: e  reason: collision with root package name */
    private final long f11335e;

    /* renamed from: f  reason: collision with root package name */
    private final short f11336f;

    /* renamed from: g  reason: collision with root package name */
    private int f11337g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11338h;
    private byte[] i;
    private byte[] j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private long o;

    public u() {
        this(150000, 20000, 1024);
    }

    public u(long j2, long j3, short s) {
        a.a(j3 <= j2);
        this.f11334d = j2;
        this.f11335e = j3;
        this.f11336f = s;
        this.i = ai.f13530f;
        this.j = ai.f13530f;
    }

    private int a(long j2) {
        return (int) ((j2 * ((long) this.f11265b.f11229b)) / 1000000);
    }

    private void a(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int min = Math.min(byteBuffer.remaining(), this.m);
        int i3 = this.m - min;
        System.arraycopy(bArr, i2 - i3, this.j, 0, i3);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.j, i3, min);
    }

    private void a(byte[] bArr, int i2) {
        a(i2).put(bArr, 0, i2).flip();
        if (i2 > 0) {
            this.n = true;
        }
    }

    private void b(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.i.length));
        int g2 = g(byteBuffer);
        if (g2 == byteBuffer.position()) {
            this.k = 1;
        } else {
            byteBuffer.limit(g2);
            e(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void c(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int f2 = f(byteBuffer);
        int position = f2 - byteBuffer.position();
        byte[] bArr = this.i;
        int length = bArr.length;
        int i2 = this.l;
        int i3 = length - i2;
        if (f2 >= limit || position >= i3) {
            int min = Math.min(position, i3);
            byteBuffer.limit(byteBuffer.position() + min);
            byteBuffer.get(this.i, this.l, min);
            int i4 = this.l + min;
            this.l = i4;
            byte[] bArr2 = this.i;
            if (i4 == bArr2.length) {
                if (this.n) {
                    a(bArr2, this.m);
                    this.o += (long) ((this.l - (this.m * 2)) / this.f11337g);
                } else {
                    this.o += (long) ((i4 - this.m) / this.f11337g);
                }
                a(byteBuffer, this.i, this.l);
                this.l = 0;
                this.k = 2;
            }
            byteBuffer.limit(limit);
            return;
        }
        a(bArr, i2);
        this.l = 0;
        this.k = 0;
    }

    private void d(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int f2 = f(byteBuffer);
        byteBuffer.limit(f2);
        this.o += (long) (byteBuffer.remaining() / this.f11337g);
        a(byteBuffer, this.j, this.m);
        if (f2 < limit) {
            a(this.j, this.m);
            this.k = 0;
            byteBuffer.limit(limit);
        }
    }

    private void e(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        a(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.n = true;
        }
    }

    private int f(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > this.f11336f) {
                int i2 = this.f11337g;
                return i2 * (position / i2);
            }
        }
        return byteBuffer.limit();
    }

    private int g(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
            if (Math.abs(byteBuffer.getShort(limit)) > this.f11336f) {
                int i2 = this.f11337g;
                return ((limit / i2) * i2) + i2;
            }
        }
    }

    public void a(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i2 = this.k;
            if (i2 == 0) {
                b(byteBuffer);
            } else if (i2 == 1) {
                c(byteBuffer);
            } else if (i2 == 2) {
                d(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public void a(boolean z) {
        this.f11338h = z;
    }

    public boolean a() {
        return this.f11338h;
    }

    public f.a b(f.a aVar) throws f.b {
        if (aVar.f11231d == 2) {
            return this.f11338h ? aVar : f.a.f11228a;
        }
        throw new f.b(aVar);
    }

    /* access modifiers changed from: protected */
    public void h() {
        int i2 = this.l;
        if (i2 > 0) {
            a(this.i, i2);
        }
        if (!this.n) {
            this.o += (long) (this.m / this.f11337g);
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
        if (this.f11338h) {
            this.f11337g = this.f11265b.f11232e;
            int a2 = a(this.f11334d) * this.f11337g;
            if (this.i.length != a2) {
                this.i = new byte[a2];
            }
            int a3 = a(this.f11335e) * this.f11337g;
            this.m = a3;
            if (this.j.length != a3) {
                this.j = new byte[a3];
            }
        }
        this.k = 0;
        this.o = 0;
        this.l = 0;
        this.n = false;
    }

    /* access modifiers changed from: protected */
    public void j() {
        this.f11338h = false;
        this.m = 0;
        this.i = ai.f13530f;
        this.j = ai.f13530f;
    }

    public long k() {
        return this.o;
    }
}
