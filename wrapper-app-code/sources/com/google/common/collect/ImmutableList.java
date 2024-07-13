package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    @Deprecated
    public final ImmutableList<E> asList() {
        return this;
    }

    public static <E> ImmutableList<E> of() {
        return RegularImmutableList.EMPTY;
    }

    public static <E> ImmutableList<E> of(E e2) {
        return new SingletonImmutableList(e2);
    }

    public static <E> ImmutableList<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return construct((Object[]) eArr.clone());
        }
        return of(eArr[0]);
    }

    private static <E> ImmutableList<E> construct(Object... objArr) {
        return asImmutableList(ObjectArrays.checkElementsNotNull(objArr));
    }

    static <E> ImmutableList<E> asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    static <E> ImmutableList<E> asImmutableList(Object[] objArr, int i) {
        if (i == 0) {
            return of();
        }
        if (i == 1) {
            return of(Objects.requireNonNull(objArr[0]));
        }
        if (i < objArr.length) {
            objArr = Arrays.copyOf(objArr, i);
        }
        return new RegularImmutableList(objArr);
    }

    ImmutableList() {
    }

    public UnmodifiableIterator<E> iterator() {
        return listIterator();
    }

    public UnmodifiableListIterator<E> listIterator() {
        return listIterator(0);
    }

    public UnmodifiableListIterator<E> listIterator(int i) {
        return new AbstractIndexedListIterator<E>(size(), i) {
            /* access modifiers changed from: protected */
            public E get(int i) {
                return ImmutableList.this.get(i);
            }
        };
    }

    public void forEach(Consumer<? super E> consumer) {
        Preconditions.checkNotNull(consumer);
        int size = size();
        for (int i = 0; i < size; i++) {
            consumer.accept(get(i));
        }
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.indexOfImpl(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.lastIndexOfImpl(this, obj);
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public ImmutableList<E> subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return of();
        }
        if (i3 == 1) {
            return of(get(i));
        }
        return subListUnchecked(i, i2);
    }

    /* access modifiers changed from: package-private */
    public ImmutableList<E> subListUnchecked(int i, int i2) {
        return new SubList(i, i2 - i);
    }

    class SubList extends ImmutableList<E> {
        final transient int length;
        final transient int offset;

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return ImmutableList.super.listIterator(i);
        }

        SubList(int i, int i2) {
            this.offset = i;
            this.length = i2;
        }

        public int size() {
            return this.length;
        }

        public E get(int i) {
            Preconditions.checkElementIndex(i, this.length);
            return ImmutableList.this.get(i + this.offset);
        }

        public ImmutableList<E> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, this.length);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.offset;
            return immutableList.subList(i + i3, i2 + i3);
        }
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void add(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException();
    }

    public Spliterator<E> spliterator() {
        return CollectSpliterators.indexed(size(), 1296, new IntFunction() {
            public final Object apply(int i) {
                return ImmutableList.this.get(i);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public int copyIntoArray(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean equals(Object obj) {
        return Lists.equalsImpl(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static final class Builder<E> extends ImmutableCollection.Builder<E> {
        Object[] contents;
        private boolean forceCopy;
        private int size;

        public Builder() {
            this(4);
        }

        Builder(int i) {
            this.contents = new Object[i];
            this.size = 0;
        }

        private void getReadyToExpandTo(int i) {
            Object[] objArr = this.contents;
            if (objArr.length < i) {
                this.contents = Arrays.copyOf(objArr, expandedCapacity(objArr.length, i));
                this.forceCopy = false;
            } else if (this.forceCopy) {
                this.contents = Arrays.copyOf(objArr, objArr.length);
                this.forceCopy = false;
            }
        }

        public Builder<E> add(E e2) {
            Preconditions.checkNotNull(e2);
            getReadyToExpandTo(this.size + 1);
            Object[] objArr = this.contents;
            int i = this.size;
            this.size = i + 1;
            objArr[i] = e2;
            return this;
        }

        public ImmutableList<E> build() {
            this.forceCopy = true;
            return ImmutableList.asImmutableList(this.contents, this.size);
        }
    }
}
