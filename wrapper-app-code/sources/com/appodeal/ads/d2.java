package com.appodeal.ads;

import android.net.Uri;
import com.appodeal.ads.utils.n;
import com.explorestack.iab.vast.VastRequest;

public final class d2 implements n.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g2 f16370a;

    public d2(g2 g2Var) {
        this.f16370a = g2Var;
    }

    public final void a(Uri uri, VastRequest vastRequest) {
        g2 g2Var = this.f16370a;
        g2Var.t = vastRequest;
        l2 l2Var = g2Var.f16421a;
        l2Var.r = vastRequest;
        l2Var.q = uri;
        g2Var.e();
    }

    public final void a() {
        g2 g2Var = this.f16370a;
        g2Var.w = 1;
        g2Var.h();
        this.f16370a.q = false;
    }
}
