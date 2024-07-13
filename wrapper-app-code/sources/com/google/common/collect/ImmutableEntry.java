package com.google.common.collect;

import java.io.Serializable;

class ImmutableEntry<K, V> extends AbstractMapEntry<K, V> implements Serializable {
    final K key;
    final V value;

    public final K getKey() {
        return this.key;
    }

    public final V getValue() {
        return this.value;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
