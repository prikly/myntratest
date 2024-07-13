package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;

public class Nb extends Ub<Xb> {
    public Nb(ICommonExecutor iCommonExecutor) {
        super(iCommonExecutor);
    }

    public void a(Runnable runnable, Object obj) {
        Wb wb = ((Xb) obj).f5333b;
        if (wb != null) {
            a(runnable, wb.f5260a);
        }
    }
}
