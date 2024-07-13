package com.applovin.exoplayer2;

import com.applovin.exoplayer2.ar;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.c.g;
import com.applovin.exoplayer2.h.x;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.s;
import java.io.IOException;

public abstract class e implements ar, as {

    /* renamed from: a  reason: collision with root package name */
    private final int f11795a;

    /* renamed from: b  reason: collision with root package name */
    private final w f11796b = new w();

    /* renamed from: c  reason: collision with root package name */
    private at f11797c;

    /* renamed from: d  reason: collision with root package name */
    private int f11798d;

    /* renamed from: e  reason: collision with root package name */
    private int f11799e;

    /* renamed from: f  reason: collision with root package name */
    private x f11800f;

    /* renamed from: g  reason: collision with root package name */
    private v[] f11801g;

    /* renamed from: h  reason: collision with root package name */
    private long f11802h;
    private long i;
    private long j = Long.MIN_VALUE;
    private boolean k;
    private boolean l;

    public e(int i2) {
        this.f11795a = i2;
    }

    public final int a() {
        return this.f11795a;
    }

    /* access modifiers changed from: protected */
    public final int a(w wVar, g gVar, int i2) {
        int a2 = ((x) a.b(this.f11800f)).a(wVar, gVar, i2);
        if (a2 == -4) {
            if (gVar.c()) {
                this.j = Long.MIN_VALUE;
                return this.k ? -4 : -3;
            }
            gVar.f11421d += this.f11802h;
            this.j = Math.max(this.j, gVar.f11421d);
        } else if (a2 == -5) {
            v vVar = (v) a.b(wVar.f13939b);
            if (vVar.p != Long.MAX_VALUE) {
                wVar.f13939b = vVar.a().a(vVar.p + this.f11802h).a();
            }
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public final p a(Throwable th, v vVar, int i2) {
        return a(th, vVar, false, i2);
    }

    /* access modifiers changed from: protected */
    public final p a(Throwable th, v vVar, boolean z, int i2) {
        int i3;
        if (vVar != null && !this.l) {
            this.l = true;
            try {
                int c2 = as.CC.c(a(vVar));
                this.l = false;
                i3 = c2;
            } catch (p unused) {
                this.l = false;
            } catch (Throwable th2) {
                this.l = false;
                throw th2;
            }
            return p.a(th, y(), w(), vVar, i3, z, i2);
        }
        i3 = 4;
        return p.a(th, y(), w(), vVar, i3, z, i2);
    }

    public /* synthetic */ void a(float f2, float f3) throws p {
        ar.CC.$default$a(this, f2, f3);
    }

    public final void a(int i2) {
        this.f11798d = i2;
    }

    public void a(int i2, Object obj) throws p {
    }

    public final void a(long j2) throws p {
        this.k = false;
        this.i = j2;
        this.j = j2;
        a(j2, false);
    }

    /* access modifiers changed from: protected */
    public void a(long j2, boolean z) throws p {
    }

    public final void a(at atVar, v[] vVarArr, x xVar, long j2, boolean z, boolean z2, long j3, long j4) throws p {
        long j5 = j2;
        boolean z3 = z;
        a.b(this.f11799e == 0);
        this.f11797c = atVar;
        this.f11799e = 1;
        this.i = j5;
        a(z3, z2);
        a(vVarArr, xVar, j3, j4);
        a(j5, z3);
    }

    /* access modifiers changed from: protected */
    public void a(boolean z, boolean z2) throws p {
    }

    /* access modifiers changed from: protected */
    public void a(v[] vVarArr, long j2, long j3) throws p {
    }

    public final void a(v[] vVarArr, x xVar, long j2, long j3) throws p {
        a.b(!this.k);
        this.f11800f = xVar;
        if (this.j == Long.MIN_VALUE) {
            this.j = j2;
        }
        this.f11801g = vVarArr;
        this.f11802h = j3;
        a(vVarArr, j2, j3);
    }

    /* access modifiers changed from: protected */
    public int b(long j2) {
        return ((x) a.b(this.f11800f)).a(j2 - this.f11802h);
    }

    public final as b() {
        return this;
    }

    public s c() {
        return null;
    }

    public final int d_() {
        return this.f11799e;
    }

    public final void e() throws p {
        boolean z = true;
        if (this.f11799e != 1) {
            z = false;
        }
        a.b(z);
        this.f11799e = 2;
        p();
    }

    public final x f() {
        return this.f11800f;
    }

    public final boolean g() {
        return this.j == Long.MIN_VALUE;
    }

    public final long h() {
        return this.j;
    }

    public final void i() {
        this.k = true;
    }

    public final boolean j() {
        return this.k;
    }

    public final void k() throws IOException {
        ((x) a.b(this.f11800f)).c();
    }

    public final void l() {
        a.b(this.f11799e == 2);
        this.f11799e = 1;
        q();
    }

    public final void m() {
        boolean z = true;
        if (this.f11799e != 1) {
            z = false;
        }
        a.b(z);
        this.f11796b.a();
        this.f11799e = 0;
        this.f11800f = null;
        this.f11801g = null;
        this.k = false;
        r();
    }

    public final void n() {
        a.b(this.f11799e == 0);
        this.f11796b.a();
        s();
    }

    public int o() throws p {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void p() throws p {
    }

    /* access modifiers changed from: protected */
    public void q() {
    }

    /* access modifiers changed from: protected */
    public void r() {
    }

    /* access modifiers changed from: protected */
    public void s() {
    }

    /* access modifiers changed from: protected */
    public final w t() {
        this.f11796b.a();
        return this.f11796b;
    }

    /* access modifiers changed from: protected */
    public final v[] u() {
        return (v[]) a.b(this.f11801g);
    }

    /* access modifiers changed from: protected */
    public final at v() {
        return (at) a.b(this.f11797c);
    }

    /* access modifiers changed from: protected */
    public final int w() {
        return this.f11798d;
    }

    /* access modifiers changed from: protected */
    public final boolean x() {
        return g() ? this.k : ((x) a.b(this.f11800f)).b();
    }
}
