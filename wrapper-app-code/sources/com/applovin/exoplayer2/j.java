package com.applovin.exoplayer2;

@Deprecated
public class j implements i {

    /* renamed from: a  reason: collision with root package name */
    private final long f13211a = -9223372036854775807L;

    /* renamed from: b  reason: collision with root package name */
    private final long f13212b = -9223372036854775807L;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f13213c = false;

    private static void a(an anVar, long j) {
        long I = anVar.I() + j;
        long H = anVar.H();
        if (H != -9223372036854775807L) {
            I = Math.min(I, H);
        }
        anVar.a(Math.max(I, 0));
    }

    public boolean a() {
        return !this.f13213c || this.f13211a > 0;
    }

    public boolean a(an anVar) {
        anVar.w();
        return true;
    }

    public boolean a(an anVar, int i) {
        anVar.c(i);
        return true;
    }

    public boolean a(an anVar, int i, long j) {
        anVar.a(i, j);
        return true;
    }

    public boolean a(an anVar, boolean z) {
        anVar.a(z);
        return true;
    }

    public boolean b() {
        return !this.f13213c || this.f13212b > 0;
    }

    public boolean b(an anVar) {
        anVar.g();
        return true;
    }

    public boolean b(an anVar, boolean z) {
        anVar.b(z);
        return true;
    }

    public boolean c(an anVar) {
        anVar.j();
        return true;
    }

    public boolean d(an anVar) {
        if (!this.f13213c) {
            anVar.c();
            return true;
        } else if (!a() || !anVar.o()) {
            return true;
        } else {
            a(anVar, -this.f13211a);
            return true;
        }
    }

    public boolean e(an anVar) {
        if (!this.f13213c) {
            anVar.d();
            return true;
        } else if (!b() || !anVar.o()) {
            return true;
        } else {
            a(anVar, this.f13212b);
            return true;
        }
    }
}
