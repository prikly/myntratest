package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.b;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.e.j;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;

public class FullRewardExpressBackupView extends BackupView {

    /* renamed from: a  reason: collision with root package name */
    private View f1395a;
    private NativeExpressView m;
    private FrameLayout n;

    public FullRewardExpressBackupView(Context context) {
        super(context);
        this.f1386b = context;
    }

    public void a(n nVar, NativeExpressView nativeExpressView) {
        l.b("FullRewardExpressBackupView", "show backup view");
        if (nVar != null) {
            setBackgroundColor(-1);
            this.f1387c = nVar;
            this.m = nativeExpressView;
            if (u.e(this.f1387c) == 7) {
                this.f1390f = "rewarded_video";
            } else {
                this.f1390f = "fullscreen_interstitial_ad";
            }
            b();
            this.m.addView(this, new ViewGroup.LayoutParams(-2, -2));
        }
    }

    private void b() {
        this.f1391g = v.e(this.f1386b, (float) this.m.getExpectExpressWidth());
        this.f1392h = v.e(this.f1386b, (float) this.m.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.f1391g, this.f1392h);
        }
        layoutParams.width = this.f1391g;
        layoutParams.height = this.f1392h;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.f1387c.v();
        c();
    }

    private void c() {
        View inflate = LayoutInflater.from(this.f1386b).inflate(t.f(this.f1386b, "tt_backup_full_reward"), this, true);
        this.f1395a = inflate;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(t.e(this.f1386b, "tt_bu_video_container"));
        this.n = frameLayout;
        frameLayout.removeAllViews();
    }

    public FrameLayout getVideoContainer() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public void a(View view, int i, j jVar) {
        NativeExpressView nativeExpressView = this.m;
        if (nativeExpressView != null) {
            nativeExpressView.a(view, i, (b) jVar);
        }
    }

    public View getBackupContainerBackgroundView() {
        return this.f1395a;
    }
}
