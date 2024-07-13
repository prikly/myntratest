package com.appodeal.ads;

import android.content.Context;

public final class j extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f16487a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f16488b;

    public j(i iVar, Context context) {
        this.f16488b = iVar;
        this.f16487a = context;
    }

    public final void run() {
        super.run();
        this.f16488b.b(this.f16487a);
    }
}
