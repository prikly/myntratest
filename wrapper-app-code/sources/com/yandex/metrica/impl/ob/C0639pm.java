package com.yandex.metrica.impl.ob;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.pm  reason: case insensitive filesystem */
public class C0639pm<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<K, V> f6481a;

    /* renamed from: b  reason: collision with root package name */
    private int f6482b;

    /* renamed from: c  reason: collision with root package name */
    private int f6483c;

    /* renamed from: d  reason: collision with root package name */
    private int f6484d;

    /* renamed from: e  reason: collision with root package name */
    private int f6485e;

    /* renamed from: f  reason: collision with root package name */
    private int f6486f;

    /* renamed from: g  reason: collision with root package name */
    private int f6487g;

    public C0639pm(int i) {
        if (i > 0) {
            this.f6483c = i;
            this.f6481a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int b(K k, V v) {
        Pair pair = (Pair) v;
        int length = C0267b.b(((C0804wk) k).f7063b).length + 4 + 4 + 4;
        if (length >= 0) {
            return length;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public final synchronized V a(K k) {
        V v = this.f6481a.get(k);
        if (v != null) {
            this.f6486f++;
            return v;
        }
        this.f6487g++;
        return null;
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f6486f;
        i2 = this.f6487g + i;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f6483c), Integer.valueOf(this.f6486f), Integer.valueOf(this.f6487g), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0)});
    }

    public final synchronized V a(K k, V v) {
        V put;
        this.f6484d++;
        this.f6482b += b(k, v);
        put = this.f6481a.put(k, v);
        if (put != null) {
            this.f6482b -= b(k, put);
        }
        a(this.f6483c);
        return put;
    }

    private void a(int i) {
        Map.Entry next;
        while (this.f6482b > i && !this.f6481a.isEmpty() && (next = this.f6481a.entrySet().iterator().next()) != null) {
            Object key = next.getKey();
            Object value = next.getValue();
            this.f6481a.remove(key);
            this.f6482b -= b(key, value);
            this.f6485e++;
        }
        if (this.f6482b < 0 || (this.f6481a.isEmpty() && this.f6482b != 0)) {
            throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
        }
    }

    public final synchronized void a() {
        a(-1);
    }
}
