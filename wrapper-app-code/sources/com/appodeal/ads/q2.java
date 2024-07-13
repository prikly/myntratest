package com.appodeal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.appodeal.ads.utils.m;
import java.io.File;

public final class q2 implements m.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l2 f17044a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s2 f17045b;

    public q2(s2 s2Var, l2 l2Var) {
        this.f17045b = s2Var;
        this.f17044a = l2Var;
    }

    public final void a() {
        s2 s2Var = this.f17045b;
        s2Var.t--;
        s2Var.m();
    }

    public final void a(Uri uri) {
        l2 l2Var = this.f17044a;
        l2Var.q = uri;
        if (TextUtils.isEmpty(l2Var.l) && uri != null && new File(uri.getPath()).exists()) {
            this.f17044a.l = n5.a(uri);
        }
        s2 s2Var = this.f17045b;
        s2Var.t--;
        s2Var.m();
    }
}
