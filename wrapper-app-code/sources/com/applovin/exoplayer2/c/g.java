package com.applovin.exoplayer2.c;

import java.nio.ByteBuffer;

public class g extends a {

    /* renamed from: a  reason: collision with root package name */
    public final c f11418a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f11419b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11420c;

    /* renamed from: d  reason: collision with root package name */
    public long f11421d;

    /* renamed from: e  reason: collision with root package name */
    public ByteBuffer f11422e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11423f;

    /* renamed from: g  reason: collision with root package name */
    private final int f11424g;

    public static final class a extends IllegalStateException {

        /* renamed from: a  reason: collision with root package name */
        public final int f11425a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11426b;

        public a(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.f11425a = i;
            this.f11426b = i2;
        }
    }

    public g(int i) {
        this(i, 0);
    }

    public g(int i, int i2) {
        this.f11418a = new c();
        this.f11423f = i;
        this.f11424g = i2;
    }

    public static g f() {
        return new g(0);
    }

    private ByteBuffer g(int i) {
        int i2 = this.f11423f;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f11419b;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public void a() {
        super.a();
        ByteBuffer byteBuffer = this.f11419b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f11422e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f11420c = false;
    }

    public void e(int i) {
        ByteBuffer byteBuffer = this.f11422e;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f11422e = ByteBuffer.allocate(i);
        } else {
            this.f11422e.clear();
        }
    }

    public void f(int i) {
        int i2 = i + this.f11424g;
        ByteBuffer byteBuffer = this.f11419b;
        if (byteBuffer == null) {
            this.f11419b = g(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.f11419b = byteBuffer;
            return;
        }
        ByteBuffer g2 = g(i3);
        g2.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            g2.put(byteBuffer);
        }
        this.f11419b = g2;
    }

    public final boolean g() {
        return d(1073741824);
    }

    public final void h() {
        ByteBuffer byteBuffer = this.f11419b;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f11422e;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
