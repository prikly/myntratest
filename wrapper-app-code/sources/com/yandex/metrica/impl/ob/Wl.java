package com.yandex.metrica.impl.ob;

import java.util.concurrent.Callable;

class Wl implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Xl f5275a;

    Wl(Xl xl) {
        this.f5275a = xl;
    }

    public Object call() throws Exception {
        return this.f5275a.a();
    }
}
