package com.applovin.exoplayer2.i;

import com.applovin.exoplayer2.c.i;
import com.applovin.exoplayer2.common.a.s;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private final b f13026a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final j f13027b = new j();

    /* renamed from: c  reason: collision with root package name */
    private final Deque<k> f13028c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    private int f13029d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13030e;

    private static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        private final long f13031a;

        /* renamed from: b  reason: collision with root package name */
        private final s<a> f13032b;

        public a(long j, s<a> sVar) {
            this.f13031a = j;
            this.f13032b = sVar;
        }

        public int a(long j) {
            return this.f13031a > j ? 0 : -1;
        }

        public long a(int i) {
            com.applovin.exoplayer2.l.a.a(i == 0);
            return this.f13031a;
        }

        public List<a> b(long j) {
            return j >= this.f13031a ? this.f13032b : s.g();
        }

        public int f_() {
            return 1;
        }
    }

    public c() {
        for (int i = 0; i < 2; i++) {
            this.f13028c.addFirst(new e(new i.a() {
                public final void releaseOutputBuffer(i iVar) {
                    c.this.a((k) iVar);
                }
            }));
        }
        this.f13029d = 0;
    }

    /* access modifiers changed from: private */
    public void a(k kVar) {
        com.applovin.exoplayer2.l.a.b(this.f13028c.size() < 2);
        com.applovin.exoplayer2.l.a.a(!this.f13028c.contains(kVar));
        kVar.a();
        this.f13028c.addFirst(kVar);
    }

    public void a(long j) {
    }

    public void a(j jVar) throws h {
        boolean z = true;
        com.applovin.exoplayer2.l.a.b(!this.f13030e);
        com.applovin.exoplayer2.l.a.b(this.f13029d == 1);
        if (this.f13027b != jVar) {
            z = false;
        }
        com.applovin.exoplayer2.l.a.a(z);
        this.f13029d = 2;
    }

    public void c() {
        com.applovin.exoplayer2.l.a.b(!this.f13030e);
        this.f13027b.a();
        this.f13029d = 0;
    }

    public void d() {
        this.f13030e = true;
    }

    /* renamed from: e */
    public j a() throws h {
        com.applovin.exoplayer2.l.a.b(!this.f13030e);
        if (this.f13029d != 0) {
            return null;
        }
        this.f13029d = 1;
        return this.f13027b;
    }

    /* renamed from: f */
    public k b() throws h {
        com.applovin.exoplayer2.l.a.b(!this.f13030e);
        if (this.f13029d != 2 || this.f13028c.isEmpty()) {
            return null;
        }
        k removeFirst = this.f13028c.removeFirst();
        if (this.f13027b.c()) {
            removeFirst.b(4);
        } else {
            a aVar = new a(this.f13027b.f11421d, this.f13026a.a(((ByteBuffer) com.applovin.exoplayer2.l.a.b(this.f13027b.f11419b)).array()));
            removeFirst.a(this.f13027b.f11421d, aVar, 0);
        }
        this.f13027b.a();
        this.f13029d = 0;
        return removeFirst;
    }
}
