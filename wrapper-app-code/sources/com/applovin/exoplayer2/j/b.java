package com.applovin.exoplayer2.j;

import com.applovin.exoplayer2.h.ac;
import com.applovin.exoplayer2.j.d;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.v;
import java.util.Arrays;

public abstract class b implements d {

    /* renamed from: a  reason: collision with root package name */
    protected final ac f13227a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f13228b;

    /* renamed from: c  reason: collision with root package name */
    protected final int[] f13229c;

    /* renamed from: d  reason: collision with root package name */
    private final int f13230d;

    /* renamed from: e  reason: collision with root package name */
    private final v[] f13231e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f13232f;

    /* renamed from: g  reason: collision with root package name */
    private int f13233g;

    public b(ac acVar, int[] iArr, int i) {
        int i2 = 0;
        a.b(iArr.length > 0);
        this.f13230d = i;
        this.f13227a = (ac) a.b(acVar);
        int length = iArr.length;
        this.f13228b = length;
        this.f13231e = new v[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f13231e[i3] = acVar.a(iArr[i3]);
        }
        Arrays.sort(this.f13231e, $$Lambda$b$XwOlcEtU5JOv_rtmCb6VP1bxxLA.INSTANCE);
        this.f13229c = new int[this.f13228b];
        while (true) {
            int i4 = this.f13228b;
            if (i2 < i4) {
                this.f13229c[i2] = acVar.a(this.f13231e[i2]);
                i2++;
            } else {
                this.f13232f = new long[i4];
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(v vVar, v vVar2) {
        return vVar2.f13929h - vVar.f13929h;
    }

    public final v a(int i) {
        return this.f13231e[i];
    }

    public void a() {
    }

    public void a(float f2) {
    }

    public /* synthetic */ void a(boolean z) {
        d.CC.$default$a(this, z);
    }

    public final int b(int i) {
        return this.f13229c[i];
    }

    public void b() {
    }

    public final ac d() {
        return this.f13227a;
    }

    public final int e() {
        return this.f13229c.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13227a == bVar.f13227a && Arrays.equals(this.f13229c, bVar.f13229c);
    }

    public final v f() {
        return this.f13231e[c()];
    }

    public /* synthetic */ void g() {
        d.CC.$default$g(this);
    }

    public /* synthetic */ void h() {
        d.CC.$default$h(this);
    }

    public int hashCode() {
        if (this.f13233g == 0) {
            this.f13233g = (System.identityHashCode(this.f13227a) * 31) + Arrays.hashCode(this.f13229c);
        }
        return this.f13233g;
    }
}
