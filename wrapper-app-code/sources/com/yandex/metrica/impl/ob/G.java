package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;

public class G<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final If.c f4018e = new If.c();

    /* renamed from: a  reason: collision with root package name */
    private volatile long f4019a;

    /* renamed from: b  reason: collision with root package name */
    private volatile long f4020b;

    /* renamed from: c  reason: collision with root package name */
    private long f4021c = 0;

    /* renamed from: d  reason: collision with root package name */
    private T f4022d = null;

    public G(long j, long j2) {
        this.f4019a = j;
        this.f4020b = j2;
    }

    public T a() {
        return this.f4022d;
    }

    public final boolean b() {
        return this.f4022d == null;
    }

    public final boolean c() {
        if (this.f4021c == 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f4021c;
        if (currentTimeMillis > this.f4020b || currentTimeMillis < 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        long currentTimeMillis = System.currentTimeMillis() - this.f4021c;
        return currentTimeMillis > this.f4019a || currentTimeMillis < 0;
    }

    public String toString() {
        return "CachedData{refreshTime=" + this.f4019a + ", mCachedTime=" + this.f4021c + ", expiryTime=" + this.f4020b + ", mCachedData=" + this.f4022d + '}';
    }

    public void a(T t) {
        this.f4022d = t;
        this.f4021c = System.currentTimeMillis();
    }

    public void a(long j, long j2) {
        this.f4019a = j;
        this.f4020b = j2;
    }
}
