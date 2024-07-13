package com.appodeal.ads;

import android.net.Uri;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.m;

public final class c2 implements m.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g2 f16322a;

    public c2(g2 g2Var) {
        this.f16322a = g2Var;
    }

    public final void a(Uri uri) {
        Log.log(g2.x, "Video", "has been loaded");
        g2 g2Var = this.f16322a;
        g2Var.f16421a.q = uri;
        g2Var.e();
    }

    public final void a() {
        Log.log(g2.x, "Video", "hasn't been loaded");
        g2 g2Var = this.f16322a;
        g2Var.w = 1;
        g2Var.h();
        this.f16322a.q = false;
    }
}
