package com.yandex.metrica.impl.ob;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;

public class xn<T> implements Comparator<Collection<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final un<T> f7126a;

    /* renamed from: b  reason: collision with root package name */
    private final Comparator<T> f7127b;

    public xn(un<T> unVar, Comparator<T> comparator) {
        this.f7126a = unVar;
        this.f7127b = comparator;
    }

    public int compare(Object obj, Object obj2) {
        Collection collection = (Collection) obj;
        Collection collection2 = (Collection) obj2;
        boolean z = true;
        boolean z2 = collection == null;
        if (collection2 != null) {
            z = false;
        }
        if (!(z ^ z2)) {
            if (collection == collection2) {
                return 0;
            }
            if (collection.size() == collection2.size()) {
                HashMap hashMap = new HashMap();
                for (Object next : collection) {
                    hashMap.put(this.f7126a.a(next), next);
                }
                for (Object next2 : collection2) {
                    Object obj3 = hashMap.get(this.f7126a.a(next2));
                    if (obj3 != null) {
                        if (this.f7127b.compare(obj3, next2) != 0) {
                        }
                    }
                }
                return 0;
            }
        }
        return 10;
    }
}
