package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class m<T> extends ai<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final Comparator<T> f11570a;

    m(Comparator<T> comparator) {
        this.f11570a = (Comparator) Preconditions.checkNotNull(comparator);
    }

    public int compare(T t, T t2) {
        return this.f11570a.compare(t, t2);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return this.f11570a.equals(((m) obj).f11570a);
        }
        return false;
    }

    public int hashCode() {
        return this.f11570a.hashCode();
    }

    public String toString() {
        return this.f11570a.toString();
    }
}
