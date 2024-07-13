package com.google.common.collect;

import java.util.Comparator;

public abstract class Ordering<T> implements Comparator<T> {
    public static <T> Ordering<T> from(Comparator<T> comparator) {
        if (comparator instanceof Ordering) {
            return (Ordering) comparator;
        }
        return new ComparatorOrdering(comparator);
    }

    protected Ordering() {
    }
}
