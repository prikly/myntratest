package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class aq {

    /* renamed from: com.applovin.exoplayer2.common.a.aq$1  reason: invalid class name */
    class AnonymousClass1 extends b<E> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Set f11485a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Set f11486b;

        /* renamed from: a */
        public ax<E> iterator() {
            return new b<E>() {

                /* renamed from: a  reason: collision with root package name */
                final Iterator<? extends E> f11487a = AnonymousClass1.this.f11485a.iterator();

                /* renamed from: b  reason: collision with root package name */
                final Iterator<? extends E> f11488b = AnonymousClass1.this.f11486b.iterator();

                /* access modifiers changed from: protected */
                public E a() {
                    if (this.f11487a.hasNext()) {
                        return this.f11487a.next();
                    }
                    while (this.f11488b.hasNext()) {
                        E next = this.f11488b.next();
                        if (!AnonymousClass1.this.f11485a.contains(next)) {
                            return next;
                        }
                    }
                    return b();
                }
            };
        }

        public boolean contains(Object obj) {
            return this.f11485a.contains(obj) || this.f11486b.contains(obj);
        }

        public boolean isEmpty() {
            return this.f11485a.isEmpty() && this.f11486b.isEmpty();
        }

        public int size() {
            int size = this.f11485a.size();
            for (Object contains : this.f11486b) {
                if (!this.f11485a.contains(contains)) {
                    size++;
                }
            }
            return size;
        }
    }

    static abstract class a<E> extends AbstractSet<E> {
        a() {
        }

        public boolean removeAll(Collection<?> collection) {
            return aq.a((Set<?>) this, collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) Preconditions.checkNotNull(collection));
        }
    }

    public static abstract class b<E> extends AbstractSet<E> {
        private b() {
        }

        /* synthetic */ b(AnonymousClass1 r1) {
            this();
        }

        /* renamed from: a */
        public abstract ax<E> iterator();

        @Deprecated
        public final boolean add(E e2) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    static int a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static <E> b<E> a(final Set<E> set, final Set<?> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new b<E>() {
            /* renamed from: a */
            public ax<E> iterator() {
                return new b<E>() {

                    /* renamed from: a  reason: collision with root package name */
                    final Iterator<E> f11492a = set.iterator();

                    /* access modifiers changed from: protected */
                    public E a() {
                        while (this.f11492a.hasNext()) {
                            E next = this.f11492a.next();
                            if (set2.contains(next)) {
                                return next;
                            }
                        }
                        return b();
                    }
                };
            }

            public boolean contains(Object obj) {
                return set.contains(obj) && set2.contains(obj);
            }

            public boolean containsAll(Collection<?> collection) {
                return set.containsAll(collection) && set2.containsAll(collection);
            }

            public boolean isEmpty() {
                return Collections.disjoint(set2, set);
            }

            public int size() {
                int i = 0;
                for (Object contains : set) {
                    if (set2.contains(contains)) {
                        i++;
                    }
                }
                return i;
            }
        };
    }

    public static <E> HashSet<E> a() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> a(int i) {
        return new HashSet<>(ab.a(i));
    }

    static boolean a(Set<?> set, @NullableDecl Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean a(Set<?> set, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof af) {
            collection = ((af) collection).a();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? a(set, collection.iterator()) : y.a(set.iterator(), collection);
    }

    static boolean a(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    public static <E> Set<E> b() {
        return Collections.newSetFromMap(ab.c());
    }
}
