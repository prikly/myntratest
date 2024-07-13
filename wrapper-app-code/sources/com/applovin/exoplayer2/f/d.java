package com.applovin.exoplayer2.f;

import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.c.g;
import com.applovin.exoplayer2.l.a;
import java.nio.ByteBuffer;

final class d extends g {

    /* renamed from: f  reason: collision with root package name */
    private long f12523f;

    /* renamed from: g  reason: collision with root package name */
    private int f12524g;

    /* renamed from: h  reason: collision with root package name */
    private int f12525h = 32;

    public d() {
        super(2);
    }

    private boolean b(g gVar) {
        if (!l()) {
            return true;
        }
        if (this.f12524g >= this.f12525h || gVar.b() != b()) {
            return false;
        }
        ByteBuffer byteBuffer = gVar.f11419b;
        return byteBuffer == null || this.f11419b == null || this.f11419b.position() + byteBuffer.remaining() <= 3072000;
    }

    public void a() {
        super.a();
        this.f12524g = 0;
    }

    public boolean a(g gVar) {
        a.a(!gVar.g());
        a.a(!gVar.e());
        a.a(!gVar.c());
        if (!b(gVar)) {
            return false;
        }
        int i = this.f12524g;
        this.f12524g = i + 1;
        if (i == 0) {
            this.f11421d = gVar.f11421d;
            if (gVar.d()) {
                a_(1);
            }
        }
        if (gVar.b()) {
            a_(RecyclerView.UNDEFINED_DURATION);
        }
        ByteBuffer byteBuffer = gVar.f11419b;
        if (byteBuffer != null) {
            f(byteBuffer.remaining());
            this.f11419b.put(byteBuffer);
        }
        this.f12523f = gVar.f11421d;
        return true;
    }

    public void g(int i) {
        a.a(i > 0);
        this.f12525h = i;
    }

    public long i() {
        return this.f11421d;
    }

    public long j() {
        return this.f12523f;
    }

    public int k() {
        return this.f12524g;
    }

    public boolean l() {
        return this.f12524g > 0;
    }
}
