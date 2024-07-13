package com.applovin.exoplayer2.common.a;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class x {
    @NullableDecl
    public static <T> T a(Iterable<? extends T> iterable, @NullableDecl T t) {
        return y.a(iterable.iterator(), t);
    }

    private static <T> T a(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static String a(Iterable<?> iterable) {
        return y.a(iterable.iterator());
    }

    static Object[] b(Iterable<?> iterable) {
        return d(iterable).toArray();
    }

    public static <T> T c(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return y.b(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return a(list);
        }
        throw new NoSuchElementException();
    }

    private static <E> Collection<E> d(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : aa.a(iterable.iterator());
    }
}
