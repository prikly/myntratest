package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.View;
import com.bykv.vk.openvk.component.video.api.d.b;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.i.d;
import com.bytedance.sdk.openadsdk.utils.v;

public class ExpressVideoView extends NativeVideoTsView implements View.OnClickListener {
    private boolean q = false;

    /* access modifiers changed from: protected */
    public void a(boolean z) {
    }

    public ExpressVideoView(Context context, n nVar, String str, j jVar) {
        super(context, nVar, false, str, false, false, jVar);
        if ("draw_ad".equals(str)) {
            this.q = true;
        }
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
    }

    /* access modifiers changed from: protected */
    public void b() {
        if (!this.f1646e || !o.b(this.l)) {
            this.f1645d = false;
        }
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

    public void setShouldCheckNetChange(boolean z) {
        if (this.f1643b != null) {
            this.f1643b.e(z);
        }
    }

    public void d() {
        if (this.j != null) {
            v.a((View) this.j, 8);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (this.i == null || this.i.getVisibility() != 0) {
            super.onWindowVisibilityChanged(i);
        } else {
            o();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.i == null || this.i.getVisibility() != 0) {
            super.onWindowFocusChanged(z);
        } else {
            o();
        }
    }

    private void n() {
        v.a((View) this.f1648g, 0);
        v.a((View) this.f1649h, 0);
        v.a((View) this.j, 8);
    }

    private void o() {
        g();
        if (this.f1648g != null) {
            if (this.f1648g.getVisibility() != 0) {
                d.a().a(this.f1642a.J().h(), this.f1649h);
            } else {
                return;
            }
        }
        n();
    }

    public void onClick(View view) {
        if (this.i != null && this.i.getVisibility() == 0) {
            v.e((View) this.f1648g);
        }
        c();
    }

    public void setShowAdInteractionView(boolean z) {
        b o;
        if (this.f1643b != null && (o = this.f1643b.o()) != null) {
            o.a(z);
        }
    }

    /* access modifiers changed from: protected */
    public void e() {
        g();
        v.a((View) this.f1648g, 0);
    }
}
