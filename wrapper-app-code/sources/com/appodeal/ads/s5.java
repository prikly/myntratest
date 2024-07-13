package com.appodeal.ads;

import android.app.Activity;

public final class s5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f17234a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z5 f17235b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r5 f17236c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a f17237d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a f17238e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ u f17239f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ x5 f17240g;

    public s5(x5 x5Var, Activity activity, z5 z5Var, r5 r5Var, a aVar, a aVar2, u uVar) {
        this.f17240g = x5Var;
        this.f17234a = activity;
        this.f17235b = z5Var;
        this.f17236c = r5Var;
        this.f17237d = aVar;
        this.f17238e = aVar2;
        this.f17239f = uVar;
    }

    public final void run() {
        x5.a(this.f17240g, this.f17234a, this.f17235b, this.f17236c, this.f17237d, this.f17238e, this.f17239f, false);
    }
}
