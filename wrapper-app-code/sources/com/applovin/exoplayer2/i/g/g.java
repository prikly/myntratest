package com.applovin.exoplayer2.i.g;

import android.text.Layout;

final class g {

    /* renamed from: a  reason: collision with root package name */
    private String f13133a;

    /* renamed from: b  reason: collision with root package name */
    private int f13134b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13135c;

    /* renamed from: d  reason: collision with root package name */
    private int f13136d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13137e;

    /* renamed from: f  reason: collision with root package name */
    private int f13138f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f13139g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f13140h = -1;
    private int i = -1;
    private int j = -1;
    private float k;
    private String l;
    private int m = -1;
    private int n = -1;
    private Layout.Alignment o;
    private Layout.Alignment p;
    private int q = -1;
    private b r;
    private float s = Float.MAX_VALUE;

    private g a(g gVar, boolean z) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f13135c && gVar.f13135c) {
                a(gVar.f13134b);
            }
            if (this.f13140h == -1) {
                this.f13140h = gVar.f13140h;
            }
            if (this.i == -1) {
                this.i = gVar.i;
            }
            if (this.f13133a == null && (str = gVar.f13133a) != null) {
                this.f13133a = str;
            }
            if (this.f13138f == -1) {
                this.f13138f = gVar.f13138f;
            }
            if (this.f13139g == -1) {
                this.f13139g = gVar.f13139g;
            }
            if (this.n == -1) {
                this.n = gVar.n;
            }
            if (this.o == null && (alignment2 = gVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = gVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = gVar.q;
            }
            if (this.j == -1) {
                this.j = gVar.j;
                this.k = gVar.k;
            }
            if (this.r == null) {
                this.r = gVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = gVar.s;
            }
            if (z && !this.f13137e && gVar.f13137e) {
                b(gVar.f13136d);
            }
            if (z && this.m == -1 && (i2 = gVar.m) != -1) {
                this.m = i2;
            }
        }
        return this;
    }

    public int a() {
        if (this.f13140h == -1 && this.i == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = this.f13140h == 1 ? 1 : 0;
        if (this.i == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    public g a(float f2) {
        this.s = f2;
        return this;
    }

    public g a(int i2) {
        this.f13134b = i2;
        this.f13135c = true;
        return this;
    }

    public g a(Layout.Alignment alignment) {
        this.o = alignment;
        return this;
    }

    public g a(b bVar) {
        this.r = bVar;
        return this;
    }

    public g a(g gVar) {
        return a(gVar, true);
    }

    public g a(String str) {
        this.f13133a = str;
        return this;
    }

    public g a(boolean z) {
        this.f13138f = z ? 1 : 0;
        return this;
    }

    public g b(float f2) {
        this.k = f2;
        return this;
    }

    public g b(int i2) {
        this.f13136d = i2;
        this.f13137e = true;
        return this;
    }

    public g b(Layout.Alignment alignment) {
        this.p = alignment;
        return this;
    }

    public g b(String str) {
        this.l = str;
        return this;
    }

    public g b(boolean z) {
        this.f13139g = z ? 1 : 0;
        return this;
    }

    public boolean b() {
        return this.f13138f == 1;
    }

    public g c(int i2) {
        this.m = i2;
        return this;
    }

    public g c(boolean z) {
        this.f13140h = z ? 1 : 0;
        return this;
    }

    public boolean c() {
        return this.f13139g == 1;
    }

    public g d(int i2) {
        this.n = i2;
        return this;
    }

    public g d(boolean z) {
        this.i = z ? 1 : 0;
        return this;
    }

    public String d() {
        return this.f13133a;
    }

    public int e() {
        if (this.f13135c) {
            return this.f13134b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public g e(int i2) {
        this.j = i2;
        return this;
    }

    public g e(boolean z) {
        this.q = z ? 1 : 0;
        return this;
    }

    public boolean f() {
        return this.f13135c;
    }

    public int g() {
        if (this.f13137e) {
            return this.f13136d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public boolean h() {
        return this.f13137e;
    }

    public float i() {
        return this.s;
    }

    public String j() {
        return this.l;
    }

    public int k() {
        return this.m;
    }

    public int l() {
        return this.n;
    }

    public Layout.Alignment m() {
        return this.o;
    }

    public Layout.Alignment n() {
        return this.p;
    }

    public boolean o() {
        return this.q == 1;
    }

    public b p() {
        return this.r;
    }

    public int q() {
        return this.j;
    }

    public float r() {
        return this.k;
    }
}
