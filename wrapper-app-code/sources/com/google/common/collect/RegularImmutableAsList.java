package com.google.common.collect;

import java.util.function.Consumer;

class RegularImmutableAsList<E> extends ImmutableAsList<E> {
    private final ImmutableCollection<E> delegate;
    private final ImmutableList<? extends E> delegateList;

    RegularImmutableAsList(ImmutableCollection<E> immutableCollection, ImmutableList<? extends E> immutableList) {
        this.delegate = immutableCollection;
        this.delegateList = immutableList;
    }

    RegularImmutableAsList(ImmutableCollection<E> immutableCollection, Object[] objArr) {
        this(immutableCollection, ImmutableList.asImmutableList(objArr));
    }

    /* access modifiers changed from: package-private */
    public ImmutableCollection<E> delegateCollection() {
        return this.delegate;
    }

    public UnmodifiableListIterator<E> listIterator(int i) {
        return this.delegateList.listIterator(i);
    }

    public void forEach(Consumer<? super E> consumer) {
        this.delegateList.forEach(consumer);
    }

    /* access modifiers changed from: package-private */
    public int copyIntoArray(Object[] objArr, int i) {
        return this.delegateList.copyIntoArray(objArr, i);
    }

    /* access modifiers changed from: package-private */
    public Object[] internalArray() {
        return this.delegateList.internalArray();
    }

    /* access modifiers changed from: package-private */
    public int internalArrayStart() {
        return this.delegateList.internalArrayStart();
    }

    /* access modifiers changed from: package-private */
    public int internalArrayEnd() {
        return this.delegateList.internalArrayEnd();
    }

    public E get(int i) {
        return this.delegateList.get(i);
    }
}
