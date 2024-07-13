package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class Equivalence<T> {

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;
        @NullableDecl
        private final T reference;

        private Wrapper(Equivalence<? super T> equivalence2, @NullableDecl T t) {
            this.equivalence = (Equivalence) Preconditions.checkNotNull(equivalence2);
            this.reference = t;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.equivalent(this.reference, wrapper.reference);
            }
            return false;
        }

        @NullableDecl
        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public String toString() {
            return this.equivalence + ".wrap(" + this.reference + ")";
        }
    }

    static final class a extends Equivalence<Object> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        static final a f11662a = new a();

        a() {
        }

        /* access modifiers changed from: protected */
        public boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        /* access modifiers changed from: protected */
        public int doHash(Object obj) {
            return obj.hashCode();
        }
    }

    private static final class b<T> implements Predicate<T>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final Equivalence<T> f11663a;
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        private final T f11664b;

        b(Equivalence<T> equivalence, @NullableDecl T t) {
            this.f11663a = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.f11664b = t;
        }

        public boolean apply(@NullableDecl T t) {
            return this.f11663a.equivalent(t, this.f11664b);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f11663a.equals(bVar.f11663a) && Objects.equal(this.f11664b, bVar.f11664b);
        }

        public int hashCode() {
            return Objects.hashCode(this.f11663a, this.f11664b);
        }

        public String toString() {
            return this.f11663a + ".equivalentTo(" + this.f11664b + ")";
        }
    }

    static final class c extends Equivalence<Object> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        static final c f11665a = new c();

        c() {
        }

        /* access modifiers changed from: protected */
        public boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        /* access modifiers changed from: protected */
        public int doHash(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected Equivalence() {
    }

    public static Equivalence<Object> equals() {
        return a.f11662a;
    }

    public static Equivalence<Object> identity() {
        return c.f11665a;
    }

    /* access modifiers changed from: protected */
    public abstract boolean doEquivalent(T t, T t2);

    /* access modifiers changed from: protected */
    public abstract int doHash(T t);

    public final boolean equivalent(@NullableDecl T t, @NullableDecl T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return doEquivalent(t, t2);
    }

    public final Predicate<T> equivalentTo(@NullableDecl T t) {
        return new b(this, t);
    }

    public final int hash(@NullableDecl T t) {
        if (t == null) {
            return 0;
        }
        return doHash(t);
    }

    public final <S extends T> Wrapper<S> wrap(@NullableDecl S s) {
        return new Wrapper<>(s);
    }
}
