package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.yandex.metrica.impl.ob.sm  reason: case insensitive filesystem */
public class C0710sm {

    /* renamed from: a  reason: collision with root package name */
    private final ReentrantLock f6800a;

    /* renamed from: b  reason: collision with root package name */
    private final C0734tm f6801b;

    public C0710sm(Context context, String str) {
        this(new ReentrantLock(), new C0734tm(context, str));
    }

    public void a() throws Throwable {
        this.f6800a.lock();
        this.f6801b.a();
    }

    public void b() {
        this.f6801b.b();
        this.f6800a.unlock();
    }

    public void c() {
        this.f6801b.c();
        this.f6800a.unlock();
    }

    C0710sm(ReentrantLock reentrantLock, C0734tm tmVar) {
        this.f6800a = reentrantLock;
        this.f6801b = tmVar;
    }
}
