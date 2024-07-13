package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;

class ak<E> extends s<E> {

    /* renamed from: a  reason: collision with root package name */
    static final s<Object> f11460a = new ak(new Object[0], 0);

    /* renamed from: b  reason: collision with root package name */
    final transient Object[] f11461b;

    /* renamed from: c  reason: collision with root package name */
    private final transient int f11462c;

    ak(Object[] objArr, int i) {
        this.f11461b = objArr;
        this.f11462c = i;
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i) {
        System.arraycopy(this.f11461b, 0, objArr, i, this.f11462c);
        return i + this.f11462c;
    }

    /* access modifiers changed from: package-private */
    public Object[] b() {
        return this.f11461b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f11462c;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return false;
    }

    public E get(int i) {
        Preconditions.checkElementIndex(i, this.f11462c);
        return this.f11461b[i];
    }

    public int size() {
        return this.f11462c;
    }
}
