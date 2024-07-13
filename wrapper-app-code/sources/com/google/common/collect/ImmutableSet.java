package com.google.common.collect;

import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.Iterator;
import java.util.Set;

public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    /* access modifiers changed from: package-private */
    public boolean isHashCodeFast() {
        return false;
    }

    public abstract UnmodifiableIterator<E> iterator();

    ImmutableSet() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableSet) || !isHashCodeFast() || !((ImmutableSet) obj).isHashCodeFast() || hashCode() == obj.hashCode()) {
            return Sets.equalsImpl(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }

    static abstract class CachingAsList<E> extends ImmutableSet<E> {
        @LazyInit
        private transient ImmutableList<E> asList;

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableSet.super.iterator();
        }

        CachingAsList() {
        }

        public ImmutableList<E> asList() {
            ImmutableList<E> immutableList = this.asList;
            if (immutableList != null) {
                return immutableList;
            }
            ImmutableList<E> createAsList = createAsList();
            this.asList = createAsList;
            return createAsList;
        }

        /* access modifiers changed from: package-private */
        public ImmutableList<E> createAsList() {
            return new RegularImmutableAsList(this, toArray());
        }
    }
}
