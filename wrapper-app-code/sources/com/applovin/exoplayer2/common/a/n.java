package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.b.c;
import com.applovin.exoplayer2.common.b.d;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class n {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final n f11571a = new n() {
        /* access modifiers changed from: package-private */
        public n a(int i) {
            return i < 0 ? n.f11572b : i > 0 ? n.f11573c : n.f11571a;
        }

        public n a(int i, int i2) {
            return a(c.a(i, i2));
        }

        public n a(long j, long j2) {
            return a(d.a(j, j2));
        }

        public <T> n a(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator) {
            return a(comparator.compare(t, t2));
        }

        public n a(boolean z, boolean z2) {
            return a(com.applovin.exoplayer2.common.b.a.a(z2, z));
        }

        public int b() {
            return 0;
        }

        public n b(boolean z, boolean z2) {
            return a(com.applovin.exoplayer2.common.b.a.a(z, z2));
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final n f11572b = new a(-1);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final n f11573c = new a(1);

    private static final class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final int f11574a;

        a(int i) {
            super();
            this.f11574a = i;
        }

        public n a(int i, int i2) {
            return this;
        }

        public n a(long j, long j2) {
            return this;
        }

        public <T> n a(@NullableDecl T t, @NullableDecl T t2, @NullableDecl Comparator<T> comparator) {
            return this;
        }

        public n a(boolean z, boolean z2) {
            return this;
        }

        public int b() {
            return this.f11574a;
        }

        public n b(boolean z, boolean z2) {
            return this;
        }
    }

    private n() {
    }

    public static n a() {
        return f11571a;
    }

    public abstract n a(int i, int i2);

    public abstract n a(long j, long j2);

    public abstract <T> n a(@NullableDecl T t, @NullableDecl T t2, Comparator<T> comparator);

    public abstract n a(boolean z, boolean z2);

    public abstract int b();

    public abstract n b(boolean z, boolean z2);
}
