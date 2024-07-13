package com.criteo.publisher.context;

import com.criteo.publisher.context.AbstractContextData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class AbstractContextData<T extends AbstractContextData<T>> {
    private final Map<String, Object> data = new LinkedHashMap();
    private final T myself = this;

    public T set(String str, String str2) {
        this.data.put(str, str2);
        return this.myself;
    }

    public T set(String str, Iterable<String> iterable) {
        ArrayList arrayList = new ArrayList();
        for (String add : iterable) {
            arrayList.add(add);
        }
        this.data.put(str, Collections.unmodifiableList(arrayList));
        return this.myself;
    }

    public T set(String str, long j) {
        this.data.put(str, Long.valueOf(j));
        return this.myself;
    }

    public T set(String str, double d2) {
        this.data.put(str, Double.valueOf(d2));
        return this.myself;
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> getData() {
        return Collections.unmodifiableMap(this.data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractContextData)) {
            return false;
        }
        return this.data.equals(((ContextData) obj).data);
    }

    public int hashCode() {
        return this.data.hashCode();
    }
}
