package com.applovin.exoplayer2.common.base;

import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class a<T> extends Optional<T> {

    /* renamed from: a  reason: collision with root package name */
    static final a<Object> f11698a = new a<>();

    private a() {
    }

    static <T> Optional<T> a() {
        return f11698a;
    }

    public Set<T> asSet() {
        return Collections.emptySet();
    }

    public boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public int hashCode() {
        return 2040732332;
    }

    public boolean isPresent() {
        return false;
    }

    public Optional<T> or(Optional<? extends T> optional) {
        return (Optional) Preconditions.checkNotNull(optional);
    }

    public T or(Supplier<? extends T> supplier) {
        return Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    public T or(T t) {
        return Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    @NullableDecl
    public T orNull() {
        return null;
    }

    public String toString() {
        return "Optional.absent()";
    }

    public <V> Optional<V> transform(Function<? super T, V> function) {
        Preconditions.checkNotNull(function);
        return Optional.absent();
    }
}
