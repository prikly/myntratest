package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

final class ag extends ai<Comparable> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final ag f11459a = new ag();

    private ag() {
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public <S extends Comparable> ai<S> a() {
        return an.f11483a;
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
