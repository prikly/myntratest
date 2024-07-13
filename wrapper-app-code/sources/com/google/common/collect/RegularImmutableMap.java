package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMapEntrySet;
import java.util.Map;
import java.util.function.BiConsumer;

final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    static final ImmutableMap<Object, Object> EMPTY = new RegularImmutableMap(ImmutableMap.EMPTY_ENTRY_ARRAY, (ImmutableMapEntry<K, V>[]) null, 0);
    final transient Map.Entry<K, V>[] entries;
    private final transient int mask;
    private final transient ImmutableMapEntry<K, V>[] table;

    private RegularImmutableMap(Map.Entry<K, V>[] entryArr, ImmutableMapEntry<K, V>[] immutableMapEntryArr, int i) {
        this.entries = entryArr;
        this.table = immutableMapEntryArr;
        this.mask = i;
    }

    public V get(Object obj) {
        return get(obj, this.table, this.mask);
    }

    static <V> V get(Object obj, ImmutableMapEntry<?, V>[] immutableMapEntryArr, int i) {
        if (!(obj == null || immutableMapEntryArr == null)) {
            for (ImmutableMapEntry<?, V> immutableMapEntry = immutableMapEntryArr[i & Hashing.smear(obj.hashCode())]; immutableMapEntry != null; immutableMapEntry = immutableMapEntry.getNextInKeyBucket()) {
                if (obj.equals(immutableMapEntry.getKey())) {
                    return immutableMapEntry.getValue();
                }
            }
        }
        return null;
    }

    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        Preconditions.checkNotNull(biConsumer);
        for (Map.Entry<K, V> entry : this.entries) {
            biConsumer.accept(entry.getKey(), entry.getValue());
        }
    }

    public int size() {
        return this.entries.length;
    }

    /* access modifiers changed from: package-private */
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new ImmutableMapEntrySet.RegularEntrySet(this, this.entries);
    }

    /* access modifiers changed from: package-private */
    public ImmutableSet<K> createKeySet() {
        return new KeySet(this);
    }

    private static final class KeySet<K> extends IndexedImmutableSet<K> {
        private final RegularImmutableMap<K, ?> map;

        KeySet(RegularImmutableMap<K, ?> regularImmutableMap) {
            this.map = regularImmutableMap;
        }

        /* access modifiers changed from: package-private */
        public K get(int i) {
            return this.map.entries[i].getKey();
        }

        public boolean contains(Object obj) {
            return this.map.containsKey(obj);
        }

        public int size() {
            return this.map.size();
        }
    }

    /* access modifiers changed from: package-private */
    public ImmutableCollection<V> createValues() {
        return new Values(this);
    }

    private static final class Values<K, V> extends ImmutableList<V> {
        final RegularImmutableMap<K, V> map;

        Values(RegularImmutableMap<K, V> regularImmutableMap) {
            this.map = regularImmutableMap;
        }

        public V get(int i) {
            return this.map.entries[i].getValue();
        }

        public int size() {
            return this.map.size();
        }
    }
}
