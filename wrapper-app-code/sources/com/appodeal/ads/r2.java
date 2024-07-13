package com.appodeal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.appodeal.ads.utils.n;
import com.explorestack.iab.vast.VastRequest;
import java.io.File;

public final class r2 implements n.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l2 f17099a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s2 f17100b;

    public r2(s2 s2Var, l2 l2Var) {
        this.f17100b = s2Var;
        this.f17099a = l2Var;
    }

    public final void a() {
        s2 s2Var = this.f17100b;
        s2Var.t--;
        s2Var.m();
    }

    public final void a(Uri uri, VastRequest vastRequest) {
        l2 l2Var = this.f17099a;
        l2Var.r = vastRequest;
        l2Var.q = uri;
        if (TextUtils.isEmpty(l2Var.l) && uri != null && new File(uri.getPath()).exists()) {
            this.f17099a.l = n5.a(uri);
        }
        s2 s2Var = this.f17100b;
        s2Var.t--;
        s2Var.m();
    }
}
