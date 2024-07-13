package com.appodeal.ads;

import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.d0;

public final class u5 implements d0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f17459a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z5 f17460b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r5 f17461c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ x5 f17462d;

    public u5(x5 x5Var, u uVar, z5 z5Var, r5 r5Var) {
        this.f17462d = x5Var;
        this.f17459a = uVar;
        this.f17460b = z5Var;
        this.f17461c = r5Var;
    }

    public final void a() {
        Log.debug(this.f17462d.f17682a, "VisibilityTracker", "onViewShown");
        this.f17459a.f17433d.j(this.f17460b, this.f17461c, (l2) null);
    }

    public final void b() {
        Log.debug(this.f17462d.f17682a, "VisibilityTracker", "onViewTrackingFinished");
        this.f17459a.f17433d.i(this.f17460b, this.f17461c, (l2) null);
    }
}
