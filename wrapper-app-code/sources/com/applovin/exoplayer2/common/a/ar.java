package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;

final class ar<E> extends w<E> {

    /* renamed from: a  reason: collision with root package name */
    final transient E f11494a;
    @LazyInit

    /* renamed from: b  reason: collision with root package name */
    private transient int f11495b;

    ar(E e2) {
        this.f11494a = Preconditions.checkNotNull(e2);
    }

    ar(E e2, int i) {
        this.f11494a = e2;
        this.f11495b = i;
    }

    /* access modifiers changed from: package-private */
    public int a(Object[] objArr, int i) {
        objArr[i] = this.f11494a;
        return i + 1;
    }

    /* renamed from: a */
    public ax<E> iterator() {
        return y.a(this.f11494a);
    }

    public boolean contains(Object obj) {
        return this.f11494a.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return this.f11495b != 0;
    }

    public final int hashCode() {
        int i = this.f11495b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f11494a.hashCode();
        this.f11495b = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: package-private */
    public s<E> i() {
        return s.a(this.f11494a);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        return '[' + this.f11494a.toString() + ']';
    }
}
