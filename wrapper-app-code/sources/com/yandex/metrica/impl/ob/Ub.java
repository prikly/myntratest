package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

public abstract class Ub<T> implements Qb<T> {

    /* renamed from: a  reason: collision with root package name */
    private ICommonExecutor f5093a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Runnable f5094b;

    public Ub(ICommonExecutor iCommonExecutor) {
        this.f5093a = iCommonExecutor;
    }

    /* access modifiers changed from: package-private */
    public void a(Runnable runnable, long j) {
        this.f5093a.executeDelayed(runnable, j, TimeUnit.SECONDS);
        this.f5094b = runnable;
    }

    public void a() {
        Runnable runnable = this.f5094b;
        if (runnable != null) {
            this.f5093a.remove(runnable);
            this.f5094b = null;
        }
    }
}
