package com.google.common.collect;

import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet.CachingAsList<Map.Entry<K, V>> {
    /* access modifiers changed from: package-private */
    public abstract ImmutableMap<K, V> map();

    static final class RegularEntrySet<K, V> extends ImmutableMapEntrySet<K, V> {
        private final transient ImmutableList<Map.Entry<K, V>> entries;
        private final transient ImmutableMap<K, V> map;

        RegularEntrySet(ImmutableMap<K, V> immutableMap, Map.Entry<K, V>[] entryArr) {
            this(immutableMap, ImmutableList.asImmutableList(entryArr));
        }

        RegularEntrySet(ImmutableMap<K, V> immutableMap, ImmutableList<Map.Entry<K, V>> immutableList) {
            this.map = immutableMap;
            this.entries = immutableList;
        }

        /* access modifiers changed from: package-private */
        public ImmutableMap<K, V> map() {
            return this.map;
        }

        /* access modifiers changed from: package-private */
        public int copyIntoArray(Object[] objArr, int i) {
            return this.entries.copyIntoArray(objArr, i);
        }

        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return this.entries.iterator();
        }

        public Spliterator<Map.Entry<K, V>> spliterator() {
            return this.entries.spliterator();
        }

        public void forEach(Consumer<? super Map.Entry<K, V>> consumer) {
            this.entries.forEach(consumer);
        }

        /* access modifiers changed from: package-private */
        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return new RegularImmutableAsList(this, this.entries);
        }
    }

    ImmutableMapEntrySet() {
    }

    public int size() {
        return map().size();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = map().get(entry.getKey());
        if (obj2 == null || !obj2.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isHashCodeFast() {
        return map().isHashCodeFast();
    }

    public int hashCode() {
        return map().hashCode();
    }
}
