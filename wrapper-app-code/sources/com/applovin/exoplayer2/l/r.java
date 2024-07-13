package com.applovin.exoplayer2.l;

import java.util.Arrays;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private int f13572a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f13573b;

    public r() {
        this(32);
    }

    public r(int i) {
        this.f13573b = new long[i];
    }

    public int a() {
        return this.f13572a;
    }

    public long a(int i) {
        if (i >= 0 && i < this.f13572a) {
            return this.f13573b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f13572a);
    }

    public void a(long j) {
        int i = this.f13572a;
        long[] jArr = this.f13573b;
        if (i == jArr.length) {
            this.f13573b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f13573b;
        int i2 = this.f13572a;
        this.f13572a = i2 + 1;
        jArr2[i2] = j;
    }

    public long[] b() {
        return Arrays.copyOf(this.f13573b, this.f13572a);
    }
}
