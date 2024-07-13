package com.applovin.exoplayer2.i.a;

import com.applovin.exoplayer2.c.i;
import com.applovin.exoplayer2.i.a.c;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.i.g;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.i.j;
import com.applovin.exoplayer2.i.k;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

abstract class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<a> f12965a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<k> f12966b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityQueue<a> f12967c;

    /* renamed from: d  reason: collision with root package name */
    private a f12968d;

    /* renamed from: e  reason: collision with root package name */
    private long f12969e;

    /* renamed from: f  reason: collision with root package name */
    private long f12970f;

    private static final class a extends j implements Comparable<a> {
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public long f12971g;

        private a() {
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            if (c() != aVar.c()) {
                return c() ? 1 : -1;
            }
            long j = this.f11421d - aVar.f11421d;
            if (j == 0) {
                j = this.f12971g - aVar.f12971g;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    private static final class b extends k {

        /* renamed from: c  reason: collision with root package name */
        private i.a<b> f12972c;

        public b(i.a<b> aVar) {
            this.f12972c = aVar;
        }

        public final void f() {
            this.f12972c.releaseOutputBuffer(this);
        }
    }

    public c() {
        for (int i = 0; i < 10; i++) {
            this.f12965a.add(new a());
        }
        this.f12966b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f12966b.add(new b(new i.a() {
                public final void releaseOutputBuffer(i iVar) {
                    c.this.a((k) (c.b) iVar);
                }
            }));
        }
        this.f12967c = new PriorityQueue<>();
    }

    private void a(a aVar) {
        aVar.a();
        this.f12965a.add(aVar);
    }

    public void a(long j) {
        this.f12969e = j;
    }

    /* access modifiers changed from: protected */
    public abstract void a(j jVar);

    /* access modifiers changed from: protected */
    public void a(k kVar) {
        kVar.a();
        this.f12966b.add(kVar);
    }

    /* renamed from: b */
    public void a(j jVar) throws h {
        com.applovin.exoplayer2.l.a.a(jVar == this.f12968d);
        a aVar = (a) jVar;
        if (aVar.b()) {
            a(aVar);
        } else {
            long j = this.f12970f;
            this.f12970f = 1 + j;
            long unused = aVar.f12971g = j;
            this.f12967c.add(aVar);
        }
        this.f12968d = null;
    }

    public void c() {
        this.f12970f = 0;
        this.f12969e = 0;
        while (!this.f12967c.isEmpty()) {
            a((a) ai.a(this.f12967c.poll()));
        }
        a aVar = this.f12968d;
        if (aVar != null) {
            a(aVar);
            this.f12968d = null;
        }
    }

    public void d() {
    }

    /* renamed from: e */
    public k b() throws h {
        k kVar;
        if (this.f12966b.isEmpty()) {
            return null;
        }
        while (!this.f12967c.isEmpty() && ((a) ai.a(this.f12967c.peek())).f11421d <= this.f12969e) {
            a aVar = (a) ai.a(this.f12967c.poll());
            if (aVar.c()) {
                kVar = (k) ai.a(this.f12966b.pollFirst());
                kVar.b(4);
            } else {
                a((j) aVar);
                if (f()) {
                    f g2 = g();
                    kVar = (k) ai.a(this.f12966b.pollFirst());
                    kVar.a(aVar.f11421d, g2, Long.MAX_VALUE);
                } else {
                    a(aVar);
                }
            }
            a(aVar);
            return kVar;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract boolean f();

    /* access modifiers changed from: protected */
    public abstract f g();

    /* renamed from: h */
    public j a() throws h {
        com.applovin.exoplayer2.l.a.b(this.f12968d == null);
        if (this.f12965a.isEmpty()) {
            return null;
        }
        a pollFirst = this.f12965a.pollFirst();
        this.f12968d = pollFirst;
        return pollFirst;
    }

    /* access modifiers changed from: protected */
    public final k j() {
        return this.f12966b.pollFirst();
    }

    /* access modifiers changed from: protected */
    public final long k() {
        return this.f12969e;
    }
}
