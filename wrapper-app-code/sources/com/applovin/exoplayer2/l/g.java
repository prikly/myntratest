package com.applovin.exoplayer2.l;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private final d f13541a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13542b;

    public g() {
        this(d.f13534a);
    }

    public g(d dVar) {
        this.f13541a = dVar;
    }

    public synchronized boolean a() {
        if (this.f13542b) {
            return false;
        }
        this.f13542b = true;
        notifyAll();
        return true;
    }

    public synchronized boolean b() {
        boolean z;
        z = this.f13542b;
        this.f13542b = false;
        return z;
    }

    public synchronized void c() throws InterruptedException {
        while (!this.f13542b) {
            wait();
        }
    }

    public synchronized void d() {
        boolean z = false;
        while (!this.f13542b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean e() {
        return this.f13542b;
    }
}
