package com.appodeal.ads;

import android.graphics.Bitmap;
import com.appodeal.ads.utils.l;

public final class o2 implements l.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l2 f17010a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s2 f17011b;

    public o2(s2 s2Var, l2 l2Var) {
        this.f17011b = s2Var;
        this.f17010a = l2Var;
    }

    public final void a() {
        s2 s2Var = this.f17011b;
        s2Var.t--;
        s2Var.m();
    }

    public final void a(Bitmap bitmap) {
        this.f17010a.k = bitmap;
        s2 s2Var = this.f17011b;
        s2Var.t--;
        s2Var.m();
    }

    public final void a(String str) {
        this.f17010a.j = str;
        s2 s2Var = this.f17011b;
        s2Var.t--;
        s2Var.m();
    }
}
