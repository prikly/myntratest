package com.applovin.exoplayer2;

import android.util.Pair;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.z;

public abstract class a extends ba {

    /* renamed from: c  reason: collision with root package name */
    private final int f10946c;

    /* renamed from: d  reason: collision with root package name */
    private final z f10947d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f10948e;

    public a(boolean z, z zVar) {
        this.f10948e = z;
        this.f10947d = zVar;
        this.f10946c = zVar.a();
    }

    private int a(int i, boolean z) {
        if (z) {
            return this.f10947d.a(i);
        }
        if (i < this.f10946c - 1) {
            return i + 1;
        }
        return -1;
    }

    public static Object a(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int b(int i, boolean z) {
        if (z) {
            return this.f10947d.b(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    public static Object b(Object obj) {
        return ((Pair) obj).second;
    }

    public int a(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f10948e) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int c2 = c(i);
        int f2 = f(c2);
        ba d2 = d(c2);
        int i4 = i - f2;
        if (i2 != 2) {
            i3 = i2;
        }
        int a2 = d2.a(i4, i3, z);
        if (a2 != -1) {
            return f2 + a2;
        }
        int a3 = a(c2, z);
        while (a3 != -1 && d(a3).d()) {
            a3 = a(a3, z);
        }
        if (a3 != -1) {
            return f(a3) + d(a3).b(z);
        }
        if (i2 == 2) {
            return b(z);
        }
        return -1;
    }

    public int a(boolean z) {
        if (this.f10946c == 0) {
            return -1;
        }
        if (this.f10948e) {
            z = false;
        }
        int b2 = z ? this.f10947d.b() : this.f10946c - 1;
        while (d(b2).d()) {
            b2 = b(b2, z);
            if (b2 == -1) {
                return -1;
            }
        }
        return f(b2) + d(b2).a(z);
    }

    public final ba.a a(int i, ba.a aVar, boolean z) {
        int b2 = b(i);
        int f2 = f(b2);
        d(b2).a(i - e(b2), aVar, z);
        aVar.f11364c += f2;
        if (z) {
            aVar.f11363b = a(g(b2), com.applovin.exoplayer2.l.a.b(aVar.f11363b));
        }
        return aVar;
    }

    public final ba.a a(Object obj, ba.a aVar) {
        Object a2 = a(obj);
        Object b2 = b(obj);
        int d2 = d(a2);
        int f2 = f(d2);
        d(d2).a(b2, aVar);
        aVar.f11364c += f2;
        aVar.f11363b = obj;
        return aVar;
    }

    public final ba.c a(int i, ba.c cVar, long j) {
        int c2 = c(i);
        int f2 = f(c2);
        int e2 = e(c2);
        d(c2).a(i - f2, cVar, j);
        Object g2 = g(c2);
        if (!ba.c.f11373a.equals(cVar.f11374b)) {
            g2 = a(g2, cVar.f11374b);
        }
        cVar.f11374b = g2;
        cVar.p += e2;
        cVar.q += e2;
        return cVar;
    }

    public final Object a(int i) {
        int b2 = b(i);
        return a(g(b2), d(b2).a(i - e(b2)));
    }

    /* access modifiers changed from: protected */
    public abstract int b(int i);

    public int b(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f10948e) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int c2 = c(i);
        int f2 = f(c2);
        ba d2 = d(c2);
        int i4 = i - f2;
        if (i2 != 2) {
            i3 = i2;
        }
        int b2 = d2.b(i4, i3, z);
        if (b2 != -1) {
            return f2 + b2;
        }
        int b3 = b(c2, z);
        while (b3 != -1 && d(b3).d()) {
            b3 = b(b3, z);
        }
        if (b3 != -1) {
            return f(b3) + d(b3).a(z);
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    public int b(boolean z) {
        if (this.f10946c == 0) {
            return -1;
        }
        int i = 0;
        if (this.f10948e) {
            z = false;
        }
        if (z) {
            i = this.f10947d.c();
        }
        while (d(i).d()) {
            i = a(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return f(i) + d(i).b(z);
    }

    /* access modifiers changed from: protected */
    public abstract int c(int i);

    public final int c(Object obj) {
        int c2;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object a2 = a(obj);
        Object b2 = b(obj);
        int d2 = d(a2);
        if (d2 == -1 || (c2 = d(d2).c(b2)) == -1) {
            return -1;
        }
        return e(d2) + c2;
    }

    /* access modifiers changed from: protected */
    public abstract int d(Object obj);

    /* access modifiers changed from: protected */
    public abstract ba d(int i);

    /* access modifiers changed from: protected */
    public abstract int e(int i);

    /* access modifiers changed from: protected */
    public abstract int f(int i);

    /* access modifiers changed from: protected */
    public abstract Object g(int i);
}
