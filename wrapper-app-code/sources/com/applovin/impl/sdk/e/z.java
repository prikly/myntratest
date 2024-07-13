package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.n;

public class z extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f15522a;

    public z(n nVar, Runnable runnable) {
        this(nVar, false, runnable);
    }

    public z(n nVar, boolean z, Runnable runnable) {
        super("TaskRunnable", nVar, z);
        this.f15522a = runnable;
    }

    public void run() {
        this.f15522a.run();
    }
}
