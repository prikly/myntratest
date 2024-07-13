package com.appodeal.ads;

import android.view.View;

public final class e2 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g2 f16386a;

    public e2(g2 g2Var) {
        this.f16386a = g2Var;
    }

    public final void onClick(View view) {
        g2 g2Var;
        boolean z;
        if (this.f16386a.c()) {
            g2 g2Var2 = this.f16386a;
            if (g2Var2.l) {
                g2Var2.f16427g.setVolume(1.0f, 1.0f);
                g2Var = this.f16386a;
                z = false;
            } else {
                g2Var2.f16427g.setVolume(0.0f, 0.0f);
                g2Var = this.f16386a;
                z = true;
            }
            g2Var.l = z;
            this.f16386a.g();
        }
    }
}
