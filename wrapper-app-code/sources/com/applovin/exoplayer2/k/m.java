package com.applovin.exoplayer2.k;

import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

public final class m implements b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f13386a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13387b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f13388c;

    /* renamed from: d  reason: collision with root package name */
    private final a[] f13389d;

    /* renamed from: e  reason: collision with root package name */
    private int f13390e;

    /* renamed from: f  reason: collision with root package name */
    private int f13391f;

    /* renamed from: g  reason: collision with root package name */
    private int f13392g;

    /* renamed from: h  reason: collision with root package name */
    private a[] f13393h;

    public m(boolean z, int i) {
        this(z, i, 0);
    }

    public m(boolean z, int i, int i2) {
        a.a(i > 0);
        a.a(i2 >= 0);
        this.f13386a = z;
        this.f13387b = i;
        this.f13392g = i2;
        this.f13393h = new a[(i2 + 100)];
        if (i2 > 0) {
            this.f13388c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f13393h[i3] = new a(this.f13388c, i3 * i);
            }
        } else {
            this.f13388c = null;
        }
        this.f13389d = new a[1];
    }

    public synchronized a a() {
        a aVar;
        this.f13391f++;
        if (this.f13392g > 0) {
            a[] aVarArr = this.f13393h;
            int i = this.f13392g - 1;
            this.f13392g = i;
            aVar = (a) a.b(aVarArr[i]);
            this.f13393h[this.f13392g] = null;
        } else {
            aVar = new a(new byte[this.f13387b], 0);
        }
        return aVar;
    }

    public synchronized void a(int i) {
        boolean z = i < this.f13390e;
        this.f13390e = i;
        if (z) {
            b();
        }
    }

    public synchronized void a(a aVar) {
        this.f13389d[0] = aVar;
        a(this.f13389d);
    }

    public synchronized void a(a[] aVarArr) {
        if (this.f13392g + aVarArr.length >= this.f13393h.length) {
            this.f13393h = (a[]) Arrays.copyOf(this.f13393h, Math.max(this.f13393h.length * 2, this.f13392g + aVarArr.length));
        }
        for (a aVar : aVarArr) {
            a[] aVarArr2 = this.f13393h;
            int i = this.f13392g;
            this.f13392g = i + 1;
            aVarArr2[i] = aVar;
        }
        this.f13391f -= aVarArr.length;
        notifyAll();
    }

    public synchronized void b() {
        int i = 0;
        int max = Math.max(0, ai.a(this.f13390e, this.f13387b) - this.f13391f);
        if (max < this.f13392g) {
            if (this.f13388c != null) {
                int i2 = this.f13392g - 1;
                while (i <= i2) {
                    a aVar = (a) a.b(this.f13393h[i]);
                    if (aVar.f13330a == this.f13388c) {
                        i++;
                    } else {
                        a aVar2 = (a) a.b(this.f13393h[i2]);
                        if (aVar2.f13330a != this.f13388c) {
                            i2--;
                        } else {
                            this.f13393h[i] = aVar2;
                            this.f13393h[i2] = aVar;
                            i2--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f13392g) {
                    return;
                }
            }
            Arrays.fill(this.f13393h, max, this.f13392g, (Object) null);
            this.f13392g = max;
        }
    }

    public int c() {
        return this.f13387b;
    }

    public synchronized void d() {
        if (this.f13386a) {
            a(0);
        }
    }

    public synchronized int e() {
        return this.f13391f * this.f13387b;
    }
}
