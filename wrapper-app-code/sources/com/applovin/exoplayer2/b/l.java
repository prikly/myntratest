package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class l implements f {

    /* renamed from: b  reason: collision with root package name */
    protected f.a f11265b = f.a.f11228a;

    /* renamed from: c  reason: collision with root package name */
    protected f.a f11266c = f.a.f11228a;

    /* renamed from: d  reason: collision with root package name */
    private f.a f11267d = f.a.f11228a;

    /* renamed from: e  reason: collision with root package name */
    private f.a f11268e = f.a.f11228a;

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer f11269f = f11227a;

    /* renamed from: g  reason: collision with root package name */
    private ByteBuffer f11270g = f11227a;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11271h;

    public final f.a a(f.a aVar) throws f.b {
        this.f11267d = aVar;
        this.f11268e = b(aVar);
        return a() ? this.f11268e : f.a.f11228a;
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer a(int i) {
        if (this.f11269f.capacity() < i) {
            this.f11269f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f11269f.clear();
        }
        ByteBuffer byteBuffer = this.f11269f;
        this.f11270g = byteBuffer;
        return byteBuffer;
    }

    public boolean a() {
        return this.f11268e != f.a.f11228a;
    }

    /* access modifiers changed from: protected */
    public f.a b(f.a aVar) throws f.b {
        return f.a.f11228a;
    }

    public final void b() {
        this.f11271h = true;
        h();
    }

    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f11270g;
        this.f11270g = f11227a;
        return byteBuffer;
    }

    public boolean d() {
        return this.f11271h && this.f11270g == f11227a;
    }

    public final void e() {
        this.f11270g = f11227a;
        this.f11271h = false;
        this.f11265b = this.f11267d;
        this.f11266c = this.f11268e;
        i();
    }

    public final void f() {
        e();
        this.f11269f = f11227a;
        this.f11267d = f.a.f11228a;
        this.f11268e = f.a.f11228a;
        this.f11265b = f.a.f11228a;
        this.f11266c = f.a.f11228a;
        j();
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        return this.f11270g.hasRemaining();
    }

    /* access modifiers changed from: protected */
    public void h() {
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    /* access modifiers changed from: protected */
    public void j() {
    }
}
