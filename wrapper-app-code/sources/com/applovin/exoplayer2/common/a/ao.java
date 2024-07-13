package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class ao<T> extends ai<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final ai<? super T> f11484a;

    ao(ai<? super T> aiVar) {
        this.f11484a = (ai) Preconditions.checkNotNull(aiVar);
    }

    public <S extends T> ai<S> a() {
        return this.f11484a;
    }

    public int compare(T t, T t2) {
        return this.f11484a.compare(t2, t);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ao) {
            return this.f11484a.equals(((ao) obj).f11484a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f11484a.hashCode();
    }

    public String toString() {
        return this.f11484a + ".reverse()";
    }
}
