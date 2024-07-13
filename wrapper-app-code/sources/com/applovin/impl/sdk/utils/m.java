package com.applovin.impl.sdk.utils;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

public class m<T extends Comparable<? super T>> implements RandomAccess, Set<T> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<T> f15922a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<T> f15923b = new HashSet<>();

    public T a() {
        return (Comparable) this.f15922a.get(size() - 1);
    }

    public T a(int i) {
        return (Comparable) this.f15922a.get(i);
    }

    public void a(int i, T t) {
        this.f15923b.remove((Comparable) this.f15922a.get(i));
        this.f15922a.set(i, t);
        this.f15923b.add(t);
    }

    /* renamed from: a */
    public boolean add(T t) {
        if (contains(t)) {
            return false;
        }
        if (isEmpty() || t.compareTo(a()) > 0) {
            this.f15922a.add(t);
        } else {
            this.f15922a.add(c(t), t);
        }
        return this.f15923b.add(t);
    }

    public boolean addAll(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (add((Comparable) it.next()) || z) {
                    z = true;
                }
            }
        }
    }

    public int b(T t) {
        if (t == null || !contains(t)) {
            return -1;
        }
        return c(t);
    }

    public T b(int i) {
        T t = (Comparable) this.f15922a.remove(i);
        this.f15923b.remove(t);
        return t;
    }

    public int c(T t) {
        int binarySearch = Collections.binarySearch(this.f15922a, t);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a2 = a(binarySearch);
        while (binarySearch >= 0 && a2 == a(binarySearch)) {
            binarySearch--;
        }
        return binarySearch + 1;
    }

    public void clear() {
        this.f15922a.clear();
        this.f15923b.clear();
    }

    public boolean contains(Object obj) {
        return this.f15923b.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f15923b.containsAll(collection);
    }

    public int d(T t) {
        int binarySearch = Collections.binarySearch(this.f15922a, t);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a2 = a(binarySearch);
        while (binarySearch < size() && a2 == a(binarySearch)) {
            binarySearch++;
        }
        return binarySearch;
    }

    public boolean isEmpty() {
        return this.f15922a.isEmpty();
    }

    public Iterator<T> iterator() {
        return this.f15922a.iterator();
    }

    public boolean remove(Object obj) {
        int b2 = b((Comparable) obj);
        if (b2 == -1) {
            return false;
        }
        this.f15922a.remove(b2);
        return this.f15923b.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return false;
                }
                Object next = it.next();
                if (z || remove(next)) {
                    z = true;
                }
            }
        }
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            Comparable comparable = (Comparable) this.f15922a.get(size);
            if (!collection.contains(comparable)) {
                this.f15922a.remove(size);
                this.f15923b.remove(comparable);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f15922a.size();
    }

    public Object[] toArray() {
        return this.f15922a.toArray();
    }

    public <T1> T1[] toArray(T1[] t1Arr) {
        return this.f15922a.toArray(t1Arr);
    }
}
