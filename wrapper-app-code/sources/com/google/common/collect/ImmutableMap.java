package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

@DoNotMock("Use ImmutableMap.of or another implementation")
public abstract class ImmutableMap<K, V> implements Serializable, Map<K, V> {
    static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];
    @LazyInit
    private transient ImmutableSet<Map.Entry<K, V>> entrySet;
    @LazyInit
    private transient ImmutableSet<K> keySet;
    @LazyInit
    private transient ImmutableCollection<V> values;

    /* access modifiers changed from: package-private */
    public abstract ImmutableSet<Map.Entry<K, V>> createEntrySet();

    /* access modifiers changed from: package-private */
    public abstract ImmutableSet<K> createKeySet();

    /* access modifiers changed from: package-private */
    public abstract ImmutableCollection<V> createValues();

    public abstract V get(Object obj);

    /* access modifiers changed from: package-private */
    public boolean isHashCodeFast() {
        return false;
    }

    public static <K, V> ImmutableMap<K, V> of() {
        return RegularImmutableMap.EMPTY;
    }

    ImmutableMap() {
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V putIfAbsent(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean replace(K k, V v, V v2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V replace(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> createValues = createValues();
        this.values = createValues;
        return createValues;
    }

    public boolean equals(Object obj) {
        return Maps.equalsImpl(this, obj);
    }

    public int hashCode() {
        return Sets.hashCodeImpl(entrySet());
    }

    public String toString() {
        return Maps.toStringImpl(this);
    }
}
