package com.applovin.exoplayer2.c;

import com.applovin.exoplayer2.c.f;
import com.applovin.exoplayer2.c.g;
import com.applovin.exoplayer2.c.i;
import com.applovin.exoplayer2.l.a;
import java.util.ArrayDeque;

public abstract class j<I extends g, O extends i, E extends f> implements d<I, O, E> {

    /* renamed from: a  reason: collision with root package name */
    private final Thread f11434a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f11435b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<I> f11436c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<O> f11437d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    private final I[] f11438e;

    /* renamed from: f  reason: collision with root package name */
    private final O[] f11439f;

    /* renamed from: g  reason: collision with root package name */
    private int f11440g;

    /* renamed from: h  reason: collision with root package name */
    private int f11441h;
    private I i;
    private E j;
    private boolean k;
    private boolean l;
    private int m;

    protected j(I[] iArr, O[] oArr) {
        this.f11438e = iArr;
        this.f11440g = iArr.length;
        for (int i2 = 0; i2 < this.f11440g; i2++) {
            this.f11438e[i2] = g();
        }
        this.f11439f = oArr;
        this.f11441h = oArr.length;
        for (int i3 = 0; i3 < this.f11441h; i3++) {
            this.f11439f[i3] = h();
        }
        AnonymousClass1 r4 = new Thread("ExoPlayer:SimpleDecoder") {
            public void run() {
                j.this.k();
            }
        };
        this.f11434a = r4;
        r4.start();
    }

    private void b(I i2) {
        i2.a();
        I[] iArr = this.f11438e;
        int i3 = this.f11440g;
        this.f11440g = i3 + 1;
        iArr[i3] = i2;
    }

    private void b(O o) {
        o.a();
        O[] oArr = this.f11439f;
        int i2 = this.f11441h;
        this.f11441h = i2 + 1;
        oArr[i2] = o;
    }

    private void i() throws f {
        E e2 = this.j;
        if (e2 != null) {
            throw e2;
        }
    }

    private void j() {
        if (m()) {
            this.f11435b.notify();
        }
    }

    /* access modifiers changed from: private */
    public void k() {
        do {
            try {
            } catch (InterruptedException e2) {
                throw new IllegalStateException(e2);
            }
        } while (l());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.c() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.b(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.b() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.b(androidx.recyclerview.widget.RecyclerView.UNDEFINED_DURATION);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = a(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        r0 = a(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean l() throws java.lang.InterruptedException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f11435b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.l     // Catch:{ all -> 0x0089 }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r6.m()     // Catch:{ all -> 0x0089 }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.f11435b     // Catch:{ all -> 0x0089 }
            r1.wait()     // Catch:{ all -> 0x0089 }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r6.l     // Catch:{ all -> 0x0089 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            return r2
        L_0x001a:
            java.util.ArrayDeque<I> r1 = r6.f11436c     // Catch:{ all -> 0x0089 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0089 }
            com.applovin.exoplayer2.c.g r1 = (com.applovin.exoplayer2.c.g) r1     // Catch:{ all -> 0x0089 }
            O[] r3 = r6.f11439f     // Catch:{ all -> 0x0089 }
            int r4 = r6.f11441h     // Catch:{ all -> 0x0089 }
            r5 = 1
            int r4 = r4 - r5
            r6.f11441h = r4     // Catch:{ all -> 0x0089 }
            r3 = r3[r4]     // Catch:{ all -> 0x0089 }
            boolean r4 = r6.k     // Catch:{ all -> 0x0089 }
            r6.k = r2     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x003c
            r0 = 4
            r3.b(r0)
            goto L_0x005f
        L_0x003c:
            boolean r0 = r1.b()
            if (r0 == 0) goto L_0x0047
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.b(r0)
        L_0x0047:
            com.applovin.exoplayer2.c.f r0 = r6.a(r1, r3, r4)     // Catch:{ RuntimeException -> 0x004e, OutOfMemoryError -> 0x004c }
            goto L_0x0053
        L_0x004c:
            r0 = move-exception
            goto L_0x004f
        L_0x004e:
            r0 = move-exception
        L_0x004f:
            com.applovin.exoplayer2.c.f r0 = r6.a((java.lang.Throwable) r0)
        L_0x0053:
            if (r0 == 0) goto L_0x005f
            java.lang.Object r4 = r6.f11435b
            monitor-enter(r4)
            r6.j = r0     // Catch:{ all -> 0x005c }
            monitor-exit(r4)     // Catch:{ all -> 0x005c }
            return r2
        L_0x005c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005c }
            throw r0
        L_0x005f:
            java.lang.Object r4 = r6.f11435b
            monitor-enter(r4)
            boolean r0 = r6.k     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x006a
        L_0x0066:
            r3.f()     // Catch:{ all -> 0x0086 }
            goto L_0x0081
        L_0x006a:
            boolean r0 = r3.b()     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0076
            int r0 = r6.m     // Catch:{ all -> 0x0086 }
            int r0 = r0 + r5
            r6.m = r0     // Catch:{ all -> 0x0086 }
            goto L_0x0066
        L_0x0076:
            int r0 = r6.m     // Catch:{ all -> 0x0086 }
            r3.f11433b = r0     // Catch:{ all -> 0x0086 }
            r6.m = r2     // Catch:{ all -> 0x0086 }
            java.util.ArrayDeque<O> r0 = r6.f11437d     // Catch:{ all -> 0x0086 }
            r0.addLast(r3)     // Catch:{ all -> 0x0086 }
        L_0x0081:
            r6.b(r1)     // Catch:{ all -> 0x0086 }
            monitor-exit(r4)     // Catch:{ all -> 0x0086 }
            return r5
        L_0x0086:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0086 }
            throw r0
        L_0x0089:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.c.j.l():boolean");
    }

    private boolean m() {
        return !this.f11436c.isEmpty() && this.f11441h > 0;
    }

    /* access modifiers changed from: protected */
    public abstract E a(I i2, O o, boolean z);

    /* access modifiers changed from: protected */
    public abstract E a(Throwable th);

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        a.b(this.f11440g == this.f11438e.length);
        for (I f2 : this.f11438e) {
            f2.f(i2);
        }
    }

    public final void a(I i2) throws f {
        synchronized (this.f11435b) {
            i();
            a.a(i2 == this.i);
            this.f11436c.addLast(i2);
            j();
            this.i = null;
        }
    }

    /* access modifiers changed from: protected */
    public void a(O o) {
        synchronized (this.f11435b) {
            b(o);
            j();
        }
    }

    public final void c() {
        synchronized (this.f11435b) {
            this.k = true;
            this.m = 0;
            if (this.i != null) {
                b(this.i);
                this.i = null;
            }
            while (!this.f11436c.isEmpty()) {
                b((g) this.f11436c.removeFirst());
            }
            while (!this.f11437d.isEmpty()) {
                ((i) this.f11437d.removeFirst()).f();
            }
        }
    }

    public void d() {
        synchronized (this.f11435b) {
            this.l = true;
            this.f11435b.notify();
        }
        try {
            this.f11434a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: e */
    public final I a() throws f {
        I i2;
        synchronized (this.f11435b) {
            i();
            a.b(this.i == null);
            if (this.f11440g == 0) {
                i2 = null;
            } else {
                I[] iArr = this.f11438e;
                int i3 = this.f11440g - 1;
                this.f11440g = i3;
                i2 = iArr[i3];
            }
            this.i = i2;
        }
        return i2;
    }

    /* renamed from: f */
    public final O b() throws f {
        synchronized (this.f11435b) {
            i();
            if (this.f11437d.isEmpty()) {
                return null;
            }
            O o = (i) this.f11437d.removeFirst();
            return o;
        }
    }

    /* access modifiers changed from: protected */
    public abstract I g();

    /* access modifiers changed from: protected */
    public abstract O h();
}
