package com.applovin.exoplayer2.common.a;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class am<E> extends w<E> {

    /* renamed from: a  reason: collision with root package name */
    static final am<Object> f11477a = new am(new Object[0], 0, (Object[]) null, 0, 0);

    /* renamed from: b  reason: collision with root package name */
    final transient Object[] f11478b;

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f11479c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f11480d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f11481e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f11482f;

    am(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f11478b = objArr;
        this.f11479c = objArr2;
        this.f11480d = i2;
        this.f11481e = i;
        this.f11482f = i3;
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i) {
        System.arraycopy(this.f11478b, 0, objArr, i, this.f11482f);
        return i + this.f11482f;
    }

    /* renamed from: a */
    public ax<E> iterator() {
        return e().iterator();
    }

    /* access modifiers changed from: package-private */
    public Object[] b() {
        return this.f11478b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return 0;
    }

    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f11479c;
        if (obj == null || objArr == null) {
            return false;
        }
        int a2 = p.a(obj);
        while (true) {
            int i = a2 & this.f11480d;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a2 = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f11482f;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return true;
    }

    public int hashCode() {
        return this.f11481e;
    }

    /* access modifiers changed from: package-private */
    public s<E> i() {
        return s.b(this.f11478b, this.f11482f);
    }

    public int size() {
        return this.f11482f;
    }
}
