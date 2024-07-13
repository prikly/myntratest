package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;

final class x extends l {

    /* renamed from: d  reason: collision with root package name */
    private int f11354d;

    /* renamed from: e  reason: collision with root package name */
    private int f11355e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11356f;

    /* renamed from: g  reason: collision with root package name */
    private int f11357g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f11358h = ai.f13530f;
    private int i;
    private long j;

    public void a(int i2, int i3) {
        this.f11354d = i2;
        this.f11355e = i3;
    }

    public void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i2 != 0) {
            int min = Math.min(i2, this.f11357g);
            this.j += (long) (min / this.f11265b.f11232e);
            this.f11357g -= min;
            byteBuffer.position(position + min);
            if (this.f11357g <= 0) {
                int i3 = i2 - min;
                int length = (this.i + i3) - this.f11358h.length;
                ByteBuffer a2 = a(length);
                int a3 = ai.a(length, 0, this.i);
                a2.put(this.f11358h, 0, a3);
                int a4 = ai.a(length - a3, 0, i3);
                byteBuffer.limit(byteBuffer.position() + a4);
                a2.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i3 - a4;
                int i5 = this.i - a3;
                this.i = i5;
                byte[] bArr = this.f11358h;
                System.arraycopy(bArr, a3, bArr, 0, i5);
                byteBuffer.get(this.f11358h, this.i, i4);
                this.i += i4;
                a2.flip();
            }
        }
    }

    public f.a b(f.a aVar) throws f.b {
        if (aVar.f11231d == 2) {
            this.f11356f = true;
            return (this.f11354d == 0 && this.f11355e == 0) ? f.a.f11228a : aVar;
        }
        throw new f.b(aVar);
    }

    public ByteBuffer c() {
        int i2;
        if (super.d() && (i2 = this.i) > 0) {
            a(i2).put(this.f11358h, 0, this.i).flip();
            this.i = 0;
        }
        return super.c();
    }

    public boolean d() {
        return super.d() && this.i == 0;
    }

    /* access modifiers changed from: protected */
    public void h() {
        if (this.f11356f) {
            int i2 = this.i;
            if (i2 > 0) {
                this.j += (long) (i2 / this.f11265b.f11232e);
            }
            this.i = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
        if (this.f11356f) {
            this.f11356f = false;
            this.f11358h = new byte[(this.f11355e * this.f11265b.f11232e)];
            this.f11357g = this.f11354d * this.f11265b.f11232e;
        }
        this.i = 0;
    }

    /* access modifiers changed from: protected */
    public void j() {
        this.f11358h = ai.f13530f;
    }

    public void k() {
        this.j = 0;
    }

    public long l() {
        return this.j;
    }
}
