package com.appodeal.ads;

import com.appodeal.ads.networking.LoadingError;

public final class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f17615a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f17616b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b0 f17617c;

    public w(b0 b0Var, r rVar, l lVar, LoadingError loadingError) {
        this.f17617c = b0Var;
        this.f17615a = rVar;
        this.f17616b = lVar;
    }

    public final void run() {
        this.f17617c.f16301b.d(this.f17615a, this.f17616b);
    }
}
