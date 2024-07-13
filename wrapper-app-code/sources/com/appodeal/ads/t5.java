package com.appodeal.ads;

import android.app.Activity;

public final class t5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f17423a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z5 f17424b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r5 f17425c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a f17426d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a f17427e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ u f17428f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ x5 f17429g;

    public t5(x5 x5Var, Activity activity, z5 z5Var, r5 r5Var, a aVar, a aVar2, u uVar) {
        this.f17429g = x5Var;
        this.f17423a = activity;
        this.f17424b = z5Var;
        this.f17425c = r5Var;
        this.f17426d = aVar;
        this.f17427e = aVar2;
        this.f17428f = uVar;
    }

    public final void run() {
        x5.a(this.f17429g, this.f17423a, this.f17424b, this.f17425c, this.f17426d, this.f17427e, this.f17428f, true);
    }
}
