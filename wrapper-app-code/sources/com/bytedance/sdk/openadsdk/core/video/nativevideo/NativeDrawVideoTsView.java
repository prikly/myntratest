package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.o;
import com.bytedance.sdk.openadsdk.i.d;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;

public class NativeDrawVideoTsView extends NativeVideoTsView implements View.OnClickListener {
    private boolean q;

    /* access modifiers changed from: protected */
    public void b() {
        if (!this.f1646e || !o.b(this.l)) {
            this.f1645d = false;
        }
        this.l = "draw_ad";
        m.h().o(String.valueOf(u.f(this.f1642a)));
        super.b();
    }

    /* access modifiers changed from: protected */
    public void c() {
        if (this.q) {
            super.c();
        }
    }

    public void setCanInterruptVideoPlay(boolean z) {
        this.q = z;
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (this.i == null || this.i.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i);
        } else {
            e();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.i == null || this.i.getVisibility() != 0) {
            super.onWindowFocusChanged(z);
        } else {
            e();
        }
    }

    private void d() {
        v.a((View) this.f1648g, 0);
        v.a((View) this.f1649h, 0);
        v.a((View) this.j, 8);
    }

    private void e() {
        g();
        if (this.f1648g != null) {
            if (this.f1648g.getVisibility() != 0) {
                d.a().a(this.f1642a.J().h(), this.f1649h);
            } else {
                return;
            }
        }
        d();
    }

    public void onClick(View view) {
        if (this.i != null && this.i.getVisibility() == 0) {
            v.e((View) this.f1648g);
        }
        c();
    }
}
