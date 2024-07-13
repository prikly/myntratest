package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.a.ab;
import com.applovin.exoplayer2.common.a.f;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class d<K, V> extends f<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public transient Map<K, Collection<V>> f11505a;

    /* renamed from: b  reason: collision with root package name */
    private transient int f11506b;

    private class a extends ab.e<K, Collection<V>> {

        /* renamed from: a  reason: collision with root package name */
        final transient Map<K, Collection<V>> f11509a;

        /* renamed from: com.applovin.exoplayer2.common.a.d$a$a  reason: collision with other inner class name */
        class C0108a extends ab.b<K, Collection<V>> {
            C0108a() {
            }

            /* access modifiers changed from: package-private */
            public Map<K, Collection<V>> a() {
                return a.this;
            }

            public boolean contains(Object obj) {
                return k.a(a.this.f11509a.entrySet(), obj);
            }

            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new b();
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                d.this.e(((Map.Entry) obj).getKey());
                return true;
            }
        }

        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f11512a = a.this.f11509a.entrySet().iterator();
            @NullableDecl

            /* renamed from: b  reason: collision with root package name */
            Collection<V> f11513b;

            b() {
            }

            /* renamed from: a */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry next = this.f11512a.next();
                this.f11513b = (Collection) next.getValue();
                return a.this.a(next);
            }

            public boolean hasNext() {
                return this.f11512a.hasNext();
            }

            public void remove() {
                j.a(this.f11513b != null);
                this.f11512a.remove();
                d.b(d.this, this.f11513b.size());
                this.f11513b.clear();
                this.f11513b = null;
            }
        }

        a(Map<K, Collection<V>> map) {
            this.f11509a = map;
        }

        /* renamed from: a */
        public Collection<V> get(Object obj) {
            Collection collection = (Collection) ab.a(this.f11509a, obj);
            if (collection == null) {
                return null;
            }
            return d.this.a(obj, collection);
        }

        /* access modifiers changed from: package-private */
        public Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return ab.a(key, d.this.a(key, entry.getValue()));
        }

        /* access modifiers changed from: protected */
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new C0108a();
        }

        /* renamed from: b */
        public Collection<V> remove(Object obj) {
            Collection remove = this.f11509a.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> c2 = d.this.c();
            c2.addAll(remove);
            d.b(d.this, remove.size());
            remove.clear();
            return c2;
        }

        public void clear() {
            if (this.f11509a == d.this.f11505a) {
                d.this.e();
            } else {
                y.d(new b());
            }
        }

        public boolean containsKey(Object obj) {
            return ab.b(this.f11509a, obj);
        }

        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f11509a.equals(obj);
        }

        public int hashCode() {
            return this.f11509a.hashCode();
        }

        public Set<K> keySet() {
            return d.this.p();
        }

        public int size() {
            return this.f11509a.size();
        }

        public String toString() {
            return this.f11509a.toString();
        }
    }

    private abstract class b<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f11515b;
        @NullableDecl

        /* renamed from: c  reason: collision with root package name */
        K f11516c = null;
        @MonotonicNonNullDecl

        /* renamed from: d  reason: collision with root package name */
        Collection<V> f11517d = null;

        /* renamed from: e  reason: collision with root package name */
        Iterator<V> f11518e = y.c();

        b() {
            this.f11515b = d.this.f11505a.entrySet().iterator();
        }

        /* access modifiers changed from: package-private */
        public abstract T a(K k, V v);

        public boolean hasNext() {
            return this.f11515b.hasNext() || this.f11518e.hasNext();
        }

        public T next() {
            if (!this.f11518e.hasNext()) {
                Map.Entry next = this.f11515b.next();
                this.f11516c = next.getKey();
                Collection<V> collection = (Collection) next.getValue();
                this.f11517d = collection;
                this.f11518e = collection.iterator();
            }
            return a(this.f11516c, this.f11518e.next());
        }

        public void remove() {
            this.f11518e.remove();
            if (this.f11517d.isEmpty()) {
                this.f11515b.remove();
            }
            d.b(d.this);
        }
    }

    private class c extends ab.c<K, Collection<V>> {
        c(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            y.d(iterator());
        }

        public boolean containsAll(Collection<?> collection) {
            return c().keySet().containsAll(collection);
        }

        public boolean equals(@NullableDecl Object obj) {
            return this == obj || c().keySet().equals(obj);
        }

        public int hashCode() {
            return c().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            final Iterator it = c().entrySet().iterator();
            return new Iterator<K>() {
                @NullableDecl

                /* renamed from: a  reason: collision with root package name */
                Map.Entry<K, Collection<V>> f11521a;

                public boolean hasNext() {
                    return it.hasNext();
                }

                public K next() {
                    Map.Entry<K, Collection<V>> entry = (Map.Entry) it.next();
                    this.f11521a = entry;
                    return entry.getKey();
                }

                public void remove() {
                    j.a(this.f11521a != null);
                    Collection value = this.f11521a.getValue();
                    it.remove();
                    d.b(d.this, value.size());
                    value.clear();
                    this.f11521a = null;
                }
            };
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) c().remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                d.b(d.this, i);
            } else {
                i = 0;
            }
            return i > 0;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.a.d$d  reason: collision with other inner class name */
    class C0109d extends d<K, V>.g implements NavigableMap<K, Collection<V>> {
        C0109d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* access modifiers changed from: package-private */
        public Map.Entry<K, Collection<V>> a(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry next = it.next();
            Collection c2 = d.this.c();
            c2.addAll((Collection) next.getValue());
            it.remove();
            return ab.a(next.getKey(), d.this.a(c2));
        }

        /* renamed from: a */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public NavigableMap<K, Collection<V>> g() {
            return (NavigableMap) super.g();
        }

        /* renamed from: c */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        /* renamed from: c */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        public Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry ceilingEntry = g().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return a(ceilingEntry);
        }

        public K ceilingKey(K k) {
            return g().ceilingKey(k);
        }

        /* renamed from: d */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public NavigableSet<K> h() {
            return new e(g());
        }

        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public NavigableMap<K, Collection<V>> descendingMap() {
            return new C0109d(g().descendingMap());
        }

        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry firstEntry = g().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return a(firstEntry);
        }

        public Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry floorEntry = g().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return a(floorEntry);
        }

        public K floorKey(K k) {
            return g().floorKey(k);
        }

        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new C0109d(g().headMap(k, z));
        }

        public Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry higherEntry = g().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return a(higherEntry);
        }

        public K higherKey(K k) {
            return g().higherKey(k);
        }

        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry lastEntry = g().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return a(lastEntry);
        }

        public Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry lowerEntry = g().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return a(lowerEntry);
        }

        public K lowerKey(K k) {
            return g().lowerKey(k);
        }

        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return a(entrySet().iterator());
        }

        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return a(descendingMap().entrySet().iterator());
        }

        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new C0109d(g().subMap(k, z, k2, z2));
        }

        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new C0109d(g().tailMap(k, z));
        }
    }

    class e extends d<K, V>.h implements NavigableSet<K> {
        e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public NavigableMap<K, Collection<V>> b() {
            return (NavigableMap) super.b();
        }

        /* renamed from: a */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        /* renamed from: a */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        /* renamed from: b */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        public K ceiling(K k) {
            return b().ceilingKey(k);
        }

        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<K> descendingSet() {
            return new e(b().descendingMap());
        }

        public K floor(K k) {
            return b().floorKey(k);
        }

        public NavigableSet<K> headSet(K k, boolean z) {
            return new e(b().headMap(k, z));
        }

        public K higher(K k) {
            return b().higherKey(k);
        }

        public K lower(K k) {
            return b().lowerKey(k);
        }

        public K pollFirst() {
            return y.c(iterator());
        }

        public K pollLast() {
            return y.c(descendingIterator());
        }

        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new e(b().subMap(k, z, k2, z2));
        }

        public NavigableSet<K> tailSet(K k, boolean z) {
            return new e(b().tailMap(k, z));
        }
    }

    private class f extends d<K, V>.j implements RandomAccess {
        f(@NullableDecl K k, List<V> list, @NullableDecl d<K, V>.i iVar) {
            super(k, list, iVar);
        }
    }

    private class g extends d<K, V>.a implements SortedMap<K, Collection<V>> {
        @MonotonicNonNullDecl

        /* renamed from: d  reason: collision with root package name */
        SortedSet<K> f11527d;

        g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return g().comparator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public SortedSet<K> h() {
            return new h(g());
        }

        /* renamed from: f */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f11527d;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> e2 = h();
            this.f11527d = e2;
            return e2;
        }

        public K firstKey() {
            return g().firstKey();
        }

        /* access modifiers changed from: package-private */
        public SortedMap<K, Collection<V>> g() {
            return (SortedMap) this.f11509a;
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new g(g().headMap(k));
        }

        public K lastKey() {
            return g().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new g(g().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new g(g().tailMap(k));
        }
    }

    private class h extends d<K, V>.c implements SortedSet<K> {
        h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* access modifiers changed from: package-private */
        public SortedMap<K, Collection<V>> b() {
            return (SortedMap) super.c();
        }

        public Comparator<? super K> comparator() {
            return b().comparator();
        }

        public K first() {
            return b().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new h(b().headMap(k));
        }

        public K last() {
            return b().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new h(b().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new h(b().tailMap(k));
        }
    }

    class i extends AbstractCollection<V> {
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        final K f11530b;

        /* renamed from: c  reason: collision with root package name */
        Collection<V> f11531c;
        @NullableDecl

        /* renamed from: d  reason: collision with root package name */
        final d<K, V>.i f11532d;
        @NullableDecl

        /* renamed from: e  reason: collision with root package name */
        final Collection<V> f11533e;

        class a implements Iterator<V> {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<V> f11535a;

            /* renamed from: b  reason: collision with root package name */
            final Collection<V> f11536b = i.this.f11531c;

            a() {
                this.f11535a = d.c(i.this.f11531c);
            }

            a(Iterator<V> it) {
                this.f11535a = it;
            }

            /* access modifiers changed from: package-private */
            public void a() {
                i.this.a();
                if (i.this.f11531c != this.f11536b) {
                    throw new ConcurrentModificationException();
                }
            }

            /* access modifiers changed from: package-private */
            public Iterator<V> b() {
                a();
                return this.f11535a;
            }

            public boolean hasNext() {
                a();
                return this.f11535a.hasNext();
            }

            public V next() {
                a();
                return this.f11535a.next();
            }

            public void remove() {
                this.f11535a.remove();
                d.b(d.this);
                i.this.b();
            }
        }

        i(@NullableDecl K k, Collection<V> collection, @NullableDecl d<K, V>.i iVar) {
            this.f11530b = k;
            this.f11531c = collection;
            this.f11532d = iVar;
            this.f11533e = iVar == null ? null : iVar.e();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            Collection<V> collection;
            d<K, V>.i iVar = this.f11532d;
            if (iVar != null) {
                iVar.a();
                if (this.f11532d.e() != this.f11533e) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f11531c.isEmpty() && (collection = (Collection) d.this.f11505a.get(this.f11530b)) != null) {
                this.f11531c = collection;
            }
        }

        public boolean add(V v) {
            a();
            boolean isEmpty = this.f11531c.isEmpty();
            boolean add = this.f11531c.add(v);
            if (add) {
                d.c(d.this);
                if (isEmpty) {
                    d();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f11531c.addAll(collection);
            if (addAll) {
                d.a(d.this, this.f11531c.size() - size);
                if (size == 0) {
                    d();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            d<K, V>.i iVar = this.f11532d;
            if (iVar != null) {
                iVar.b();
            } else if (this.f11531c.isEmpty()) {
                d.this.f11505a.remove(this.f11530b);
            }
        }

        /* access modifiers changed from: package-private */
        public K c() {
            return this.f11530b;
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f11531c.clear();
                d.b(d.this, size);
                b();
            }
        }

        public boolean contains(Object obj) {
            a();
            return this.f11531c.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            a();
            return this.f11531c.containsAll(collection);
        }

        /* access modifiers changed from: package-private */
        public void d() {
            d<K, V>.i iVar = this.f11532d;
            if (iVar != null) {
                iVar.d();
            } else {
                d.this.f11505a.put(this.f11530b, this.f11531c);
            }
        }

        /* access modifiers changed from: package-private */
        public Collection<V> e() {
            return this.f11531c;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            a();
            return this.f11531c.equals(obj);
        }

        /* access modifiers changed from: package-private */
        public d<K, V>.i f() {
            return this.f11532d;
        }

        public int hashCode() {
            a();
            return this.f11531c.hashCode();
        }

        public Iterator<V> iterator() {
            a();
            return new a();
        }

        public boolean remove(Object obj) {
            a();
            boolean remove = this.f11531c.remove(obj);
            if (remove) {
                d.b(d.this);
                b();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f11531c.removeAll(collection);
            if (removeAll) {
                d.a(d.this, this.f11531c.size() - size);
                b();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.f11531c.retainAll(collection);
            if (retainAll) {
                d.a(d.this, this.f11531c.size() - size);
                b();
            }
            return retainAll;
        }

        public int size() {
            a();
            return this.f11531c.size();
        }

        public String toString() {
            a();
            return this.f11531c.toString();
        }
    }

    class j extends d<K, V>.i implements List<V> {

        private class a extends d<K, V>.i.a implements ListIterator<V> {
            a() {
                super();
            }

            public a(int i) {
                super(j.this.g().listIterator(i));
            }

            private ListIterator<V> c() {
                return (ListIterator) b();
            }

            public void add(V v) {
                boolean isEmpty = j.this.isEmpty();
                c().add(v);
                d.c(d.this);
                if (isEmpty) {
                    j.this.d();
                }
            }

            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            public int nextIndex() {
                return c().nextIndex();
            }

            public V previous() {
                return c().previous();
            }

            public int previousIndex() {
                return c().previousIndex();
            }

            public void set(V v) {
                c().set(v);
            }
        }

        j(@NullableDecl K k, List<V> list, @NullableDecl d<K, V>.i iVar) {
            super(k, list, iVar);
        }

        public void add(int i, V v) {
            a();
            boolean isEmpty = e().isEmpty();
            g().add(i, v);
            d.c(d.this);
            if (isEmpty) {
                d();
            }
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = g().addAll(i, collection);
            if (addAll) {
                d.a(d.this, e().size() - size);
                if (size == 0) {
                    d();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: package-private */
        public List<V> g() {
            return (List) e();
        }

        public V get(int i) {
            a();
            return g().get(i);
        }

        public int indexOf(Object obj) {
            a();
            return g().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            a();
            return g().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            a();
            return new a();
        }

        public ListIterator<V> listIterator(int i) {
            a();
            return new a(i);
        }

        public V remove(int i) {
            a();
            V remove = g().remove(i);
            d.b(d.this);
            b();
            return remove;
        }

        public V set(int i, V v) {
            a();
            return g().set(i, v);
        }

        public List<V> subList(int i, int i2) {
            a();
            return d.this.a(c(), g().subList(i, i2), f() == null ? this : f());
        }
    }

    protected d(Map<K, Collection<V>> map) {
        Preconditions.checkArgument(map.isEmpty());
        this.f11505a = map;
    }

    static /* synthetic */ int a(d dVar, int i2) {
        int i3 = dVar.f11506b + i2;
        dVar.f11506b = i3;
        return i3;
    }

    static /* synthetic */ int b(d dVar) {
        int i2 = dVar.f11506b;
        dVar.f11506b = i2 - 1;
        return i2;
    }

    static /* synthetic */ int b(d dVar, int i2) {
        int i3 = dVar.f11506b - i2;
        dVar.f11506b = i3;
        return i3;
    }

    static /* synthetic */ int c(d dVar) {
        int i2 = dVar.f11506b;
        dVar.f11506b = i2 + 1;
        return i2;
    }

    /* access modifiers changed from: private */
    public static <E> Iterator<E> c(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* access modifiers changed from: private */
    public void e(Object obj) {
        Collection collection = (Collection) ab.c(this.f11505a, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f11506b -= size;
        }
    }

    /* access modifiers changed from: package-private */
    public Collection<V> a(@NullableDecl K k, Collection<V> collection) {
        return new i(k, collection, (d<K, V>.i) null);
    }

    /* access modifiers changed from: package-private */
    public <E> Collection<E> a(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    /* access modifiers changed from: package-private */
    public final List<V> a(@NullableDecl K k, List<V> list, @NullableDecl d<K, V>.i iVar) {
        return list instanceof RandomAccess ? new f(k, list, iVar) : new j(k, list, iVar);
    }

    public boolean a(@NullableDecl K k, @NullableDecl V v) {
        Collection collection = this.f11505a.get(k);
        if (collection == null) {
            Collection c2 = c(k);
            if (c2.add(v)) {
                this.f11506b++;
                this.f11505a.put(k, c2);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f11506b++;
            return true;
        }
    }

    public Collection<V> b(@NullableDecl K k) {
        Collection collection = this.f11505a.get(k);
        if (collection == null) {
            collection = c(k);
        }
        return a(k, collection);
    }

    /* access modifiers changed from: package-private */
    public abstract Collection<V> c();

    /* access modifiers changed from: package-private */
    public Collection<V> c(@NullableDecl K k) {
        return c();
    }

    public int d() {
        return this.f11506b;
    }

    public void e() {
        for (Collection<V> clear : this.f11505a.values()) {
            clear.clear();
        }
        this.f11505a.clear();
        this.f11506b = 0;
    }

    /* access modifiers changed from: package-private */
    public Set<K> f() {
        return new c(this.f11505a);
    }

    /* access modifiers changed from: package-private */
    public final Set<K> g() {
        Map<K, Collection<V>> map = this.f11505a;
        return map instanceof NavigableMap ? new e((NavigableMap) this.f11505a) : map instanceof SortedMap ? new h((SortedMap) this.f11505a) : new c(this.f11505a);
    }

    public Collection<V> h() {
        return super.h();
    }

    /* access modifiers changed from: package-private */
    public Collection<V> i() {
        return new f.c();
    }

    /* access modifiers changed from: package-private */
    public Iterator<V> j() {
        return new d<K, V>.b<V>() {
            /* access modifiers changed from: package-private */
            public V a(K k, V v) {
                return v;
            }
        };
    }

    public Collection<Map.Entry<K, V>> k() {
        return super.k();
    }

    /* access modifiers changed from: package-private */
    public Collection<Map.Entry<K, V>> l() {
        return this instanceof ap ? new f.b() : new f.a();
    }

    /* access modifiers changed from: package-private */
    public Iterator<Map.Entry<K, V>> m() {
        return new d<K, V>.b<Map.Entry<K, V>>() {
            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public Map.Entry<K, V> a(K k, V v) {
                return ab.a(k, v);
            }
        };
    }

    /* access modifiers changed from: package-private */
    public Map<K, Collection<V>> n() {
        return new a(this.f11505a);
    }

    /* access modifiers changed from: package-private */
    public final Map<K, Collection<V>> o() {
        Map<K, Collection<V>> map = this.f11505a;
        return map instanceof NavigableMap ? new C0109d((NavigableMap) this.f11505a) : map instanceof SortedMap ? new g((SortedMap) this.f11505a) : new a(this.f11505a);
    }
}
