package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;

abstract class a<E> extends ay<E> {

    /* renamed from: a  reason: collision with root package name */
    private final int f11443a;

    /* renamed from: b  reason: collision with root package name */
    private int f11444b;

    protected a(int i, int i2) {
        Preconditions.checkPositionIndex(i2, i);
        this.f11443a = i;
        this.f11444b = i2;
    }

    /* access modifiers changed from: protected */
    public abstract E a(int i);

    public final boolean hasNext() {
        return this.f11444b < this.f11443a;
    }

    public final boolean hasPrevious() {
        return this.f11444b > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f11444b;
            this.f11444b = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f11444b;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f11444b - 1;
            this.f11444b = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f11444b - 1;
    }
}
