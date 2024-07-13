package com.applovin.exoplayer2.l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class i<E> implements Iterable<E> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f13543a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map<E, Integer> f13544b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Set<E> f13545c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private List<E> f13546d = Collections.emptyList();

    public Set<E> a() {
        Set<E> set;
        synchronized (this.f13543a) {
            set = this.f13545c;
        }
        return set;
    }

    public void a(E e2) {
        synchronized (this.f13543a) {
            ArrayList arrayList = new ArrayList(this.f13546d);
            arrayList.add(e2);
            this.f13546d = Collections.unmodifiableList(arrayList);
            Integer num = this.f13544b.get(e2);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f13545c);
                hashSet.add(e2);
                this.f13545c = Collections.unmodifiableSet(hashSet);
            }
            Map<E, Integer> map = this.f13544b;
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            map.put(e2, Integer.valueOf(i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(E r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f13543a
            monitor-enter(r0)
            java.util.Map<E, java.lang.Integer> r1 = r4.f13544b     // Catch:{ all -> 0x004c }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x004c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x000f:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x004c }
            java.util.List<E> r3 = r4.f13546d     // Catch:{ all -> 0x004c }
            r2.<init>(r3)     // Catch:{ all -> 0x004c }
            r2.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x004c }
            r4.f13546d = r2     // Catch:{ all -> 0x004c }
            int r2 = r1.intValue()     // Catch:{ all -> 0x004c }
            r3 = 1
            if (r2 != r3) goto L_0x003c
            java.util.Map<E, java.lang.Integer> r1 = r4.f13544b     // Catch:{ all -> 0x004c }
            r1.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x004c }
            java.util.Set<E> r2 = r4.f13545c     // Catch:{ all -> 0x004c }
            r1.<init>(r2)     // Catch:{ all -> 0x004c }
            r1.remove(r5)     // Catch:{ all -> 0x004c }
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r1)     // Catch:{ all -> 0x004c }
            r4.f13545c = r5     // Catch:{ all -> 0x004c }
            goto L_0x004a
        L_0x003c:
            java.util.Map<E, java.lang.Integer> r2 = r4.f13544b     // Catch:{ all -> 0x004c }
            int r1 = r1.intValue()     // Catch:{ all -> 0x004c }
            int r1 = r1 - r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x004c }
            r2.put(r5, r1)     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return
        L_0x004c:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.i.b(java.lang.Object):void");
    }

    public int c(E e2) {
        int intValue;
        synchronized (this.f13543a) {
            intValue = this.f13544b.containsKey(e2) ? this.f13544b.get(e2).intValue() : 0;
        }
        return intValue;
    }

    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f13543a) {
            it = this.f13546d.iterator();
        }
        return it;
    }
}
