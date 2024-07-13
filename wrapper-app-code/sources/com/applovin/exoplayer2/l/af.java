package com.applovin.exoplayer2.l;

import java.util.Arrays;

public final class af<V> {

    /* renamed from: a  reason: collision with root package name */
    private long[] f13517a;

    /* renamed from: b  reason: collision with root package name */
    private V[] f13518b;

    /* renamed from: c  reason: collision with root package name */
    private int f13519c;

    /* renamed from: d  reason: collision with root package name */
    private int f13520d;

    public af() {
        this(10);
    }

    public af(int i) {
        this.f13517a = new long[i];
        this.f13518b = a(i);
    }

    private V a(long j, boolean z) {
        V v = null;
        long j2 = Long.MAX_VALUE;
        while (this.f13520d > 0) {
            long j3 = j - this.f13517a[this.f13519c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = d();
            j2 = j3;
        }
        return v;
    }

    private static <V> V[] a(int i) {
        return new Object[i];
    }

    private void b(long j) {
        int i = this.f13520d;
        if (i > 0) {
            if (j <= this.f13517a[((this.f13519c + i) - 1) % this.f13518b.length]) {
                a();
            }
        }
    }

    private void b(long j, V v) {
        int i = this.f13519c;
        int i2 = this.f13520d;
        V[] vArr = this.f13518b;
        int length = (i + i2) % vArr.length;
        this.f13517a[length] = j;
        vArr[length] = v;
        this.f13520d = i2 + 1;
    }

    private V d() {
        a.b(this.f13520d > 0);
        V[] vArr = this.f13518b;
        int i = this.f13519c;
        V v = vArr[i];
        vArr[i] = null;
        this.f13519c = (i + 1) % vArr.length;
        this.f13520d--;
        return v;
    }

    private void e() {
        int length = this.f13518b.length;
        if (this.f13520d >= length) {
            int i = length * 2;
            long[] jArr = new long[i];
            V[] a2 = a(i);
            int i2 = this.f13519c;
            int i3 = length - i2;
            System.arraycopy(this.f13517a, i2, jArr, 0, i3);
            System.arraycopy(this.f13518b, this.f13519c, a2, 0, i3);
            int i4 = this.f13519c;
            if (i4 > 0) {
                System.arraycopy(this.f13517a, 0, jArr, i3, i4);
                System.arraycopy(this.f13518b, 0, a2, i3, this.f13519c);
            }
            this.f13517a = jArr;
            this.f13518b = a2;
            this.f13519c = 0;
        }
    }

    public synchronized V a(long j) {
        return a(j, true);
    }

    public synchronized void a() {
        this.f13519c = 0;
        this.f13520d = 0;
        Arrays.fill(this.f13518b, (Object) null);
    }

    public synchronized void a(long j, V v) {
        b(j);
        e();
        b(j, v);
    }

    public synchronized int b() {
        return this.f13520d;
    }

    public synchronized V c() {
        return this.f13520d == 0 ? null : d();
    }
}
