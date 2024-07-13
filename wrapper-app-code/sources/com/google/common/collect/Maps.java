package com.google.common.collect;

import java.util.Map;

public final class Maps {
    static boolean equalsImpl(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static String toStringImpl(Map<?, ?> map) {
        StringBuilder newStringBuilderForCollection = Collections2.newStringBuilderForCollection(map.size());
        newStringBuilderForCollection.append('{');
        boolean z = true;
        for (Map.Entry next : map.entrySet()) {
            if (!z) {
                newStringBuilderForCollection.append(", ");
            }
            z = false;
            newStringBuilderForCollection.append(next.getKey());
            newStringBuilderForCollection.append('=');
            newStringBuilderForCollection.append(next.getValue());
        }
        newStringBuilderForCollection.append('}');
        return newStringBuilderForCollection.toString();
    }
}
