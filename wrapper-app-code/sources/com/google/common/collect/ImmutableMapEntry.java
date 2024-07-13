package com.google.common.collect;

class ImmutableMapEntry<K, V> extends ImmutableEntry<K, V> {
    /* access modifiers changed from: package-private */
    public ImmutableMapEntry<K, V> getNextInKeyBucket() {
        return null;
    }
}
