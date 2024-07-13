package com.applovin.exoplayer2.common.base;

import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class d<T> extends Optional<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f11707a;

    d(T t) {
        this.f11707a = t;
    }

    public Set<T> asSet() {
        return Collections.singleton(this.f11707a);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof d) {
            return this.f11707a.equals(((d) obj).f11707a);
        }
        return false;
    }

    public T get() {
        return this.f11707a;
    }

    public int hashCode() {
        return this.f11707a.hashCode() + 1502476572;
    }

    public boolean isPresent() {
        return true;
    }

    public Optional<T> or(Optional<? extends T> optional) {
        Preconditions.checkNotNull(optional);
        return this;
    }

    public T or(Supplier<? extends T> supplier) {
        Preconditions.checkNotNull(supplier);
        return this.f11707a;
    }

    public T or(T t) {
        Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.f11707a;
    }

    public T orNull() {
        return this.f11707a;
    }

    public String toString() {
        return "Optional.of(" + this.f11707a + ")";
    }

    public <V> Optional<V> transform(Function<? super T, V> function) {
        return new d(Preconditions.checkNotNull(function.apply(this.f11707a), "the Function passed to Optional.transform() must not return null."));
    }
}
