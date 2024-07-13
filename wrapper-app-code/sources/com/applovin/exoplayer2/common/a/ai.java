package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Function;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class ai<T> implements Comparator<T> {
    protected ai() {
    }

    public static <T> ai<T> a(Comparator<T> comparator) {
        return comparator instanceof ai ? (ai) comparator : new m(comparator);
    }

    public static <C extends Comparable> ai<C> b() {
        return ag.f11459a;
    }

    public <S extends T> ai<S> a() {
        return new ao(this);
    }

    public <F> ai<F> a(Function<F, ? extends T> function) {
        return new i(function, this);
    }

    public <E extends T> s<E> a(Iterable<E> iterable) {
        return s.a(this, iterable);
    }

    /* access modifiers changed from: package-private */
    public <T2 extends T> ai<Map.Entry<T2, ?>> c() {
        return a(ab.a());
    }

    public abstract int compare(@NullableDecl T t, @NullableDecl T t2);
}
