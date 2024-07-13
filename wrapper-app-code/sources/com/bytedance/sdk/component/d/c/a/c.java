package com.bytedance.sdk.component.d.c.a;

import android.util.Log;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: SoftLruCache */
public class c<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<K, SoftReference<V>> f19012a;

    /* renamed from: b  reason: collision with root package name */
    private int f19013b;

    /* renamed from: c  reason: collision with root package name */
    private int f19014c;

    /* renamed from: d  reason: collision with root package name */
    private int f19015d;

    /* renamed from: e  reason: collision with root package name */
    private int f19016e;

    /* renamed from: f  reason: collision with root package name */
    private int f19017f;

    /* renamed from: g  reason: collision with root package name */
    private int f19018g;

    /* renamed from: h  reason: collision with root package name */
    private int f19019h;

    /* access modifiers changed from: protected */
    public void a(boolean z, K k, V v, V v2) {
    }

    /* access modifiers changed from: protected */
    public int b(K k, V v) {
        return 1;
    }

    /* access modifiers changed from: protected */
    public V b(K k) {
        return null;
    }

    public c(int i) {
        if (i > 0) {
            this.f19014c = i;
            this.f19012a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r2 = b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r2 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.f19016e++;
        r1 = (java.lang.ref.SoftReference) r4.f19012a.put(r5, new java.lang.ref.SoftReference(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        r0 = r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r4.f19012a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        r4.f19013b += c(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r0 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        a(false, r5, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
        a(r4.f19014c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V a(K r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0070
            monitor-enter(r4)
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r4.f19012a     // Catch:{ all -> 0x006d }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x006d }
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch:{ all -> 0x006d }
            r1 = 0
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x001c
            int r5 = r4.f19018g     // Catch:{ all -> 0x006d }
            int r5 = r5 + 1
            r4.f19018g = r5     // Catch:{ all -> 0x006d }
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            return r0
        L_0x001c:
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r2 = r4.f19012a     // Catch:{ all -> 0x006d }
            r2.remove(r5)     // Catch:{ all -> 0x006d }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            int r2 = r4.f19019h     // Catch:{ all -> 0x006d }
            int r2 = r2 + 1
            r4.f19019h = r2     // Catch:{ all -> 0x006d }
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            java.lang.Object r2 = r4.b(r5)
            if (r2 != 0) goto L_0x0031
            return r1
        L_0x0031:
            monitor-enter(r4)
            int r1 = r4.f19016e     // Catch:{ all -> 0x006a }
            int r1 = r1 + 1
            r4.f19016e = r1     // Catch:{ all -> 0x006a }
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r1 = r4.f19012a     // Catch:{ all -> 0x006a }
            java.lang.ref.SoftReference r3 = new java.lang.ref.SoftReference     // Catch:{ all -> 0x006a }
            r3.<init>(r2)     // Catch:{ all -> 0x006a }
            java.lang.Object r1 = r1.put(r5, r3)     // Catch:{ all -> 0x006a }
            java.lang.ref.SoftReference r1 = (java.lang.ref.SoftReference) r1     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x004b
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x006a }
        L_0x004b:
            if (r0 == 0) goto L_0x0053
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r3 = r4.f19012a     // Catch:{ all -> 0x006a }
            r3.put(r5, r1)     // Catch:{ all -> 0x006a }
            goto L_0x005c
        L_0x0053:
            int r1 = r4.f19013b     // Catch:{ all -> 0x006a }
            int r3 = r4.c(r5, r2)     // Catch:{ all -> 0x006a }
            int r1 = r1 + r3
            r4.f19013b = r1     // Catch:{ all -> 0x006a }
        L_0x005c:
            monitor-exit(r4)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0064
            r1 = 0
            r4.a(r1, r5, r2, r0)
            return r0
        L_0x0064:
            int r5 = r4.f19014c
            r4.a((int) r5)
            return r2
        L_0x006a:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006a }
            throw r5
        L_0x006d:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006d }
            throw r5
        L_0x0070:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.d.c.a.c.a(java.lang.Object):java.lang.Object");
    }

    public final V a(K k, V v) {
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        V v2 = null;
        synchronized (this) {
            this.f19015d++;
            this.f19013b += c(k, v);
            SoftReference softReference = (SoftReference) this.f19012a.put(k, new SoftReference(v));
            if (!(softReference == null || (v2 = softReference.get()) == null)) {
                this.f19013b -= c(k, v2);
            }
        }
        if (v2 != null) {
            a(false, k, v2, v);
        }
        a(this.f19014c);
        return v2;
    }

    public void a(int i) {
        Object key;
        Object obj;
        while (true) {
            synchronized (this) {
                if (this.f19013b >= 0) {
                    if (this.f19012a.isEmpty() && this.f19013b != 0) {
                        break;
                    } else if (this.f19013b > i) {
                        Map.Entry next = this.f19012a.entrySet().iterator().next();
                        if (next != null) {
                            key = next.getKey();
                            SoftReference softReference = (SoftReference) next.getValue();
                            this.f19012a.remove(key);
                            if (softReference != null) {
                                obj = softReference.get();
                                this.f19013b -= c(key, obj);
                            } else {
                                obj = null;
                            }
                            this.f19017f++;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    break;
                }
            }
            a(true, key, obj, (Object) null);
        }
        Log.e("LruCache", "oom maybe occured, clear cache. size= " + this.f19013b + ", maxSize: " + i);
        this.f19013b = 0;
        this.f19012a.clear();
    }

    private int c(K k, V v) {
        int b2 = b(k, v);
        if (b2 >= 0) {
            return b2;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public final synchronized String toString() {
        int i;
        i = this.f19018g + this.f19019h;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f19014c), Integer.valueOf(this.f19018g), Integer.valueOf(this.f19019h), Integer.valueOf(i != 0 ? (this.f19018g * 100) / i : 0)});
    }
}
