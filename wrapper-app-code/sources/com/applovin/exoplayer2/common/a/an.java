package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;

final class an extends ai<Comparable> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final an f11483a = new an();

    private an() {
    }

    /* renamed from: a */
    public int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public <S extends Comparable> ai<S> a() {
        return ai.b();
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
