package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class b<T> extends ax<T> {

    /* renamed from: a  reason: collision with root package name */
    private a f11497a = a.NOT_READY;
    @NullableDecl

    /* renamed from: b  reason: collision with root package name */
    private T f11498b;

    /* renamed from: com.applovin.exoplayer2.common.a.b$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11499a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.applovin.exoplayer2.common.a.b$a[] r0 = com.applovin.exoplayer2.common.a.b.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11499a = r0
                com.applovin.exoplayer2.common.a.b$a r1 = com.applovin.exoplayer2.common.a.b.a.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11499a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.applovin.exoplayer2.common.a.b$a r1 = com.applovin.exoplayer2.common.a.b.a.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.a.b.AnonymousClass1.<clinit>():void");
        }
    }

    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean c() {
        this.f11497a = a.FAILED;
        this.f11498b = a();
        if (this.f11497a == a.DONE) {
            return false;
        }
        this.f11497a = a.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract T a();

    /* access modifiers changed from: protected */
    public final T b() {
        this.f11497a = a.DONE;
        return null;
    }

    public final boolean hasNext() {
        Preconditions.checkState(this.f11497a != a.FAILED);
        int i = AnonymousClass1.f11499a[this.f11497a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return c();
        }
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f11497a = a.NOT_READY;
            T t = this.f11498b;
            this.f11498b = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
