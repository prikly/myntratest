package com.google.common.collect;

import com.google.common.collect.Multiset;
import java.util.Spliterator;

public final class Multisets {
    static <E> Spliterator<E> spliteratorImpl(Multiset<E> multiset) {
        Spliterator<Multiset.Entry<E>> spliterator = multiset.entrySet().spliterator();
        return CollectSpliterators.flatMap(spliterator, $$Lambda$Multisets$smHOVM71wczmmBOjT7onhbFVLho.INSTANCE, (spliterator.characteristics() & 1296) | 64, (long) multiset.size());
    }
}
