package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Iterator;

abstract class aw<F, T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    final Iterator<? extends F> f11496a;

    aw(Iterator<? extends F> it) {
        this.f11496a = (Iterator) Preconditions.checkNotNull(it);
    }

    /* access modifiers changed from: package-private */
    public abstract T a(F f2);

    public final boolean hasNext() {
        return this.f11496a.hasNext();
    }

    public final T next() {
        return a(this.f11496a.next());
    }

    public final void remove() {
        this.f11496a.remove();
    }
}
