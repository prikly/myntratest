package com.applovin.exoplayer2;

import android.os.Looper;
import com.applovin.exoplayer2.l.d;
import java.util.concurrent.TimeoutException;

public final class ao {

    /* renamed from: a  reason: collision with root package name */
    private final b f11123a;

    /* renamed from: b  reason: collision with root package name */
    private final a f11124b;

    /* renamed from: c  reason: collision with root package name */
    private final d f11125c;

    /* renamed from: d  reason: collision with root package name */
    private final ba f11126d;

    /* renamed from: e  reason: collision with root package name */
    private int f11127e;

    /* renamed from: f  reason: collision with root package name */
    private Object f11128f;

    /* renamed from: g  reason: collision with root package name */
    private Looper f11129g;

    /* renamed from: h  reason: collision with root package name */
    private int f11130h;
    private long i = -9223372036854775807L;
    private boolean j = true;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    public interface a {
        void a(ao aoVar);
    }

    public interface b {
        void a(int i, Object obj) throws p;
    }

    public ao(a aVar, b bVar, ba baVar, int i2, d dVar, Looper looper) {
        this.f11124b = aVar;
        this.f11123a = bVar;
        this.f11126d = baVar;
        this.f11129g = looper;
        this.f11125c = dVar;
        this.f11130h = i2;
    }

    public ao a(int i2) {
        com.applovin.exoplayer2.l.a.b(!this.k);
        this.f11127e = i2;
        return this;
    }

    public ao a(Object obj) {
        com.applovin.exoplayer2.l.a.b(!this.k);
        this.f11128f = obj;
        return this;
    }

    public ba a() {
        return this.f11126d;
    }

    public synchronized void a(boolean z) {
        this.l = z | this.l;
        this.m = true;
        notifyAll();
    }

    public synchronized boolean a(long j2) throws InterruptedException, TimeoutException {
        com.applovin.exoplayer2.l.a.b(this.k);
        com.applovin.exoplayer2.l.a.b(this.f11129g.getThread() != Thread.currentThread());
        long a2 = this.f11125c.a() + j2;
        while (!this.m && j2 > 0) {
            this.f11125c.c();
            wait(j2);
            j2 = a2 - this.f11125c.a();
        }
        if (!this.m) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.l;
    }

    public b b() {
        return this.f11123a;
    }

    public int c() {
        return this.f11127e;
    }

    public Object d() {
        return this.f11128f;
    }

    public Looper e() {
        return this.f11129g;
    }

    public long f() {
        return this.i;
    }

    public int g() {
        return this.f11130h;
    }

    public boolean h() {
        return this.j;
    }

    public ao i() {
        com.applovin.exoplayer2.l.a.b(!this.k);
        if (this.i == -9223372036854775807L) {
            com.applovin.exoplayer2.l.a.a(this.j);
        }
        this.k = true;
        this.f11124b.a(this);
        return this;
    }

    public synchronized boolean j() {
        return this.n;
    }
}
