package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class Predicates {

    private static class a<T> implements Predicate<T>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final List<? extends Predicate<? super T>> f11672a;

        private a(List<? extends Predicate<? super T>> list) {
            this.f11672a = list;
        }

        public boolean apply(@NullableDecl T t) {
            for (int i = 0; i < this.f11672a.size(); i++) {
                if (!((Predicate) this.f11672a.get(i)).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof a) {
                return this.f11672a.equals(((a) obj).f11672a);
            }
            return false;
        }

        public int hashCode() {
            return this.f11672a.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.toStringHelper("and", this.f11672a);
        }
    }

    private static class b<A, B> implements Predicate<A>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        final Predicate<B> f11673a;

        /* renamed from: b  reason: collision with root package name */
        final Function<A, ? extends B> f11674b;

        private b(Predicate<B> predicate, Function<A, ? extends B> function) {
            this.f11673a = (Predicate) Preconditions.checkNotNull(predicate);
            this.f11674b = (Function) Preconditions.checkNotNull(function);
        }

        public boolean apply(@NullableDecl A a2) {
            return this.f11673a.apply(this.f11674b.apply(a2));
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f11674b.equals(bVar.f11674b) && this.f11673a.equals(bVar.f11673a);
        }

        public int hashCode() {
            return this.f11674b.hashCode() ^ this.f11673a.hashCode();
        }

        public String toString() {
            return this.f11673a + "(" + this.f11674b + ")";
        }
    }

    private static class c<T> implements Predicate<T>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final Collection<?> f11675a;

        private c(Collection<?> collection) {
            this.f11675a = (Collection) Preconditions.checkNotNull(collection);
        }

        public boolean apply(@NullableDecl T t) {
            try {
                return this.f11675a.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof c) {
                return this.f11675a.equals(((c) obj).f11675a);
            }
            return false;
        }

        public int hashCode() {
            return this.f11675a.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.f11675a + ")";
        }
    }

    private static class d implements Predicate<Object>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final Class<?> f11676a;

        private d(Class<?> cls) {
            this.f11676a = (Class) Preconditions.checkNotNull(cls);
        }

        public boolean apply(@NullableDecl Object obj) {
            return this.f11676a.isInstance(obj);
        }

        public boolean equals(@NullableDecl Object obj) {
            return (obj instanceof d) && this.f11676a == ((d) obj).f11676a;
        }

        public int hashCode() {
            return this.f11676a.hashCode();
        }

        public String toString() {
            return "Predicates.instanceOf(" + this.f11676a.getName() + ")";
        }
    }

    private static class e<T> implements Predicate<T>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final T f11677a;

        private e(T t) {
            this.f11677a = t;
        }

        public boolean apply(T t) {
            return this.f11677a.equals(t);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof e) {
                return this.f11677a.equals(((e) obj).f11677a);
            }
            return false;
        }

        public int hashCode() {
            return this.f11677a.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.f11677a + ")";
        }
    }

    private static class f<T> implements Predicate<T>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        final Predicate<T> f11678a;

        f(Predicate<T> predicate) {
            this.f11678a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        public boolean apply(@NullableDecl T t) {
            return !this.f11678a.apply(t);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof f) {
                return this.f11678a.equals(((f) obj).f11678a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f11678a.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.f11678a + ")";
        }
    }

    enum g implements Predicate<Object> {
        ALWAYS_TRUE {
            public boolean apply(@NullableDecl Object obj) {
                return true;
            }

            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE {
            public boolean apply(@NullableDecl Object obj) {
                return false;
            }

            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL {
            public boolean apply(@NullableDecl Object obj) {
                return obj == null;
            }

            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL {
            public boolean apply(@NullableDecl Object obj) {
                return obj != null;
            }

            public String toString() {
                return "Predicates.notNull()";
            }
        };

        /* access modifiers changed from: package-private */
        public <T> Predicate<T> a() {
            return this;
        }
    }

    private static class h<T> implements Predicate<T>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final List<? extends Predicate<? super T>> f11684a;

        private h(List<? extends Predicate<? super T>> list) {
            this.f11684a = list;
        }

        public boolean apply(@NullableDecl T t) {
            for (int i = 0; i < this.f11684a.size(); i++) {
                if (((Predicate) this.f11684a.get(i)).apply(t)) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof h) {
                return this.f11684a.equals(((h) obj).f11684a);
            }
            return false;
        }

        public int hashCode() {
            return this.f11684a.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.toStringHelper("or", this.f11684a);
        }
    }

    private static class i implements Predicate<Class<?>>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final Class<?> f11685a;

        private i(Class<?> cls) {
            this.f11685a = (Class) Preconditions.checkNotNull(cls);
        }

        /* renamed from: a */
        public boolean apply(Class<?> cls) {
            return this.f11685a.isAssignableFrom(cls);
        }

        public boolean equals(@NullableDecl Object obj) {
            return (obj instanceof i) && this.f11685a == ((i) obj).f11685a;
        }

        public int hashCode() {
            return this.f11685a.hashCode();
        }

        public String toString() {
            return "Predicates.subtypeOf(" + this.f11685a.getName() + ")";
        }
    }

    private Predicates() {
    }

    public static <T> Predicate<T> alwaysFalse() {
        return g.ALWAYS_FALSE.a();
    }

    public static <T> Predicate<T> alwaysTrue() {
        return g.ALWAYS_TRUE.a();
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new a(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    public static <T> Predicate<T> and(Iterable<? extends Predicate<? super T>> iterable) {
        return new a(defensiveCopy(iterable));
    }

    @SafeVarargs
    public static <T> Predicate<T> and(Predicate<? super T>... predicateArr) {
        return new a(defensiveCopy((T[]) predicateArr));
    }

    private static <T> List<Predicate<? super T>> asList(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return Arrays.asList(new Predicate[]{predicate, predicate2});
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new b(predicate, function);
    }

    static <T> List<T> defensiveCopy(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T checkNotNull : iterable) {
            arrayList.add(Preconditions.checkNotNull(checkNotNull));
        }
        return arrayList;
    }

    private static <T> List<T> defensiveCopy(T... tArr) {
        return defensiveCopy(Arrays.asList(tArr));
    }

    public static <T> Predicate<T> equalTo(@NullableDecl T t) {
        return t == null ? isNull() : new e(t);
    }

    public static <T> Predicate<T> in(Collection<? extends T> collection) {
        return new c(collection);
    }

    public static Predicate<Object> instanceOf(Class<?> cls) {
        return new d(cls);
    }

    public static <T> Predicate<T> isNull() {
        return g.IS_NULL.a();
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new f(predicate);
    }

    public static <T> Predicate<T> notNull() {
        return g.NOT_NULL.a();
    }

    public static <T> Predicate<T> or(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new h(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    public static <T> Predicate<T> or(Iterable<? extends Predicate<? super T>> iterable) {
        return new h(defensiveCopy(iterable));
    }

    @SafeVarargs
    public static <T> Predicate<T> or(Predicate<? super T>... predicateArr) {
        return new h(defensiveCopy((T[]) predicateArr));
    }

    public static Predicate<Class<?>> subtypeOf(Class<?> cls) {
        return new i(cls);
    }

    /* access modifiers changed from: private */
    public static String toStringHelper(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object next : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(next);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
