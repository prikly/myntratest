package com.applovin.exoplayer2.common.base;

import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;
    @MonotonicNonNullDecl
    @LazyInit
    private transient Converter<B, A> reverse;

    private static final class a<A, B, C> extends Converter<A, C> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        final Converter<A, B> f11656a;

        /* renamed from: b  reason: collision with root package name */
        final Converter<B, C> f11657b;

        a(Converter<A, B> converter, Converter<B, C> converter2) {
            this.f11656a = converter;
            this.f11657b = converter2;
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public A correctedDoBackward(@NullableDecl C c2) {
            return this.f11656a.correctedDoBackward(this.f11657b.correctedDoBackward(c2));
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public C correctedDoForward(@NullableDecl A a2) {
            return this.f11657b.correctedDoForward(this.f11656a.correctedDoForward(a2));
        }

        /* access modifiers changed from: protected */
        public A doBackward(C c2) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        public C doForward(A a2) {
            throw new AssertionError();
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11656a.equals(aVar.f11656a) && this.f11657b.equals(aVar.f11657b);
        }

        public int hashCode() {
            return (this.f11656a.hashCode() * 31) + this.f11657b.hashCode();
        }

        public String toString() {
            return this.f11656a + ".andThen(" + this.f11657b + ")";
        }
    }

    private static final class b<A, B> extends Converter<A, B> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final Function<? super A, ? extends B> f11658a;

        /* renamed from: b  reason: collision with root package name */
        private final Function<? super B, ? extends A> f11659b;

        private b(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
            this.f11658a = (Function) Preconditions.checkNotNull(function);
            this.f11659b = (Function) Preconditions.checkNotNull(function2);
        }

        /* access modifiers changed from: protected */
        public A doBackward(B b2) {
            return this.f11659b.apply(b2);
        }

        /* access modifiers changed from: protected */
        public B doForward(A a2) {
            return this.f11658a.apply(a2);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f11658a.equals(bVar.f11658a) && this.f11659b.equals(bVar.f11659b);
        }

        public int hashCode() {
            return (this.f11658a.hashCode() * 31) + this.f11659b.hashCode();
        }

        public String toString() {
            return "Converter.from(" + this.f11658a + ", " + this.f11659b + ")";
        }
    }

    private static final class c<T> extends Converter<T, T> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        static final c f11660a = new c();

        private c() {
        }

        /* renamed from: a */
        public c<T> reverse() {
            return this;
        }

        /* access modifiers changed from: package-private */
        public <S> Converter<T, S> doAndThen(Converter<T, S> converter) {
            return (Converter) Preconditions.checkNotNull(converter, "otherConverter");
        }

        /* access modifiers changed from: protected */
        public T doBackward(T t) {
            return t;
        }

        /* access modifiers changed from: protected */
        public T doForward(T t) {
            return t;
        }

        public String toString() {
            return "Converter.identity()";
        }
    }

    private static final class d<A, B> extends Converter<B, A> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        final Converter<A, B> f11661a;

        d(Converter<A, B> converter) {
            this.f11661a = converter;
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public B correctedDoBackward(@NullableDecl A a2) {
            return this.f11661a.correctedDoForward(a2);
        }

        /* access modifiers changed from: package-private */
        @NullableDecl
        public A correctedDoForward(@NullableDecl B b2) {
            return this.f11661a.correctedDoBackward(b2);
        }

        /* access modifiers changed from: protected */
        public B doBackward(A a2) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        public A doForward(B b2) {
            throw new AssertionError();
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof d) {
                return this.f11661a.equals(((d) obj).f11661a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f11661a.hashCode();
        }

        public Converter<A, B> reverse() {
            return this.f11661a;
        }

        public String toString() {
            return this.f11661a + ".reverse()";
        }
    }

    protected Converter() {
        this(true);
    }

    Converter(boolean z) {
        this.handleNullAutomatically = z;
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new b(function, function2);
    }

    public static <T> Converter<T, T> identity() {
        return c.f11660a;
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    @NullableDecl
    @Deprecated
    public final B apply(@NullableDecl A a2) {
        return convert(a2);
    }

    @NullableDecl
    public final B convert(@NullableDecl A a2) {
        return correctedDoForward(a2);
    }

    public Iterable<B> convertAll(final Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new Iterable<B>() {
            public Iterator<B> iterator() {
                return new Iterator<B>() {

                    /* renamed from: b  reason: collision with root package name */
                    private final Iterator<? extends A> f11655b = iterable.iterator();

                    public boolean hasNext() {
                        return this.f11655b.hasNext();
                    }

                    public B next() {
                        return Converter.this.convert(this.f11655b.next());
                    }

                    public void remove() {
                        this.f11655b.remove();
                    }
                };
            }
        };
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public A correctedDoBackward(@NullableDecl B b2) {
        if (!this.handleNullAutomatically) {
            return doBackward(b2);
        }
        if (b2 == null) {
            return null;
        }
        return Preconditions.checkNotNull(doBackward(b2));
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    public B correctedDoForward(@NullableDecl A a2) {
        if (!this.handleNullAutomatically) {
            return doForward(a2);
        }
        if (a2 == null) {
            return null;
        }
        return Preconditions.checkNotNull(doForward(a2));
    }

    /* access modifiers changed from: package-private */
    public <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        return new a(this, (Converter) Preconditions.checkNotNull(converter));
    }

    /* access modifiers changed from: protected */
    public abstract A doBackward(B b2);

    /* access modifiers changed from: protected */
    public abstract B doForward(A a2);

    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.reverse;
        if (converter != null) {
            return converter;
        }
        d dVar = new d(this);
        this.reverse = dVar;
        return dVar;
    }
}
