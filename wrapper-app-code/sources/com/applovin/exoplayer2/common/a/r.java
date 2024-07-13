package com.applovin.exoplayer2.common.a;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

class r<K, V> extends e<K, V> implements Serializable {
    @NullableDecl

    /* renamed from: a  reason: collision with root package name */
    final K f11580a;
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    final V f11581b;

    r(@NullableDecl K k, @NullableDecl V v) {
        this.f11580a = k;
        this.f11581b = v;
    }

    @NullableDecl
    public final K getKey() {
        return this.f11580a;
    }

    @NullableDecl
    public final V getValue() {
        return this.f11581b;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
