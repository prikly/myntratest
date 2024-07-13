package com.applovin.exoplayer2.f;

import java.util.NoSuchElementException;

final class f {

    /* renamed from: a  reason: collision with root package name */
    private int f12529a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f12530b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f12531c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int[] f12532d;

    /* renamed from: e  reason: collision with root package name */
    private int f12533e;

    public f() {
        int[] iArr = new int[16];
        this.f12532d = iArr;
        this.f12533e = iArr.length - 1;
    }

    private void d() {
        int[] iArr = this.f12532d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i = this.f12529a;
            int i2 = length2 - i;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f12532d, 0, iArr2, i2, i);
            this.f12529a = 0;
            this.f12530b = this.f12531c - 1;
            this.f12532d = iArr2;
            this.f12533e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    public int a() {
        int i = this.f12531c;
        if (i != 0) {
            int[] iArr = this.f12532d;
            int i2 = this.f12529a;
            int i3 = iArr[i2];
            this.f12529a = (i2 + 1) & this.f12533e;
            this.f12531c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }

    public void a(int i) {
        if (this.f12531c == this.f12532d.length) {
            d();
        }
        int i2 = (this.f12530b + 1) & this.f12533e;
        this.f12530b = i2;
        this.f12532d[i2] = i;
        this.f12531c++;
    }

    public boolean b() {
        return this.f12531c == 0;
    }

    public void c() {
        this.f12529a = 0;
        this.f12530b = -1;
        this.f12531c = 0;
    }
}
