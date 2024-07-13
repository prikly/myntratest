package com.adcolony.sdk;

class f {

    /* renamed from: a  reason: collision with root package name */
    private boolean f10050a;

    f() {
    }

    public synchronized void a(long j) {
        if (!this.f10050a) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
            }
        }
    }

    public synchronized void a(boolean z) {
        this.f10050a = z;
        if (z) {
            notifyAll();
        }
    }

    public boolean a() {
        return this.f10050a;
    }
}
