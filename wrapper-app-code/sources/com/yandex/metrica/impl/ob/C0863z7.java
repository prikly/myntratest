package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.z7  reason: case insensitive filesystem */
class C0863z7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0589nm f7217a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C0839y7 f7218b;

    C0863z7(C0839y7 y7Var, C0589nm nmVar) {
        this.f7218b = y7Var;
        this.f7217a = nmVar;
    }

    public void run() {
        this.f7218b.a(this.f7217a);
    }
}
