package com.yandex.metrica.impl.ob;

import android.os.Handler;
import java.util.concurrent.Executor;

class Nm implements Executor {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Handler f4627a;

    Nm(Om om, Handler handler) {
        this.f4627a = handler;
    }

    public void execute(Runnable runnable) {
        this.f4627a.post(runnable);
    }
}
