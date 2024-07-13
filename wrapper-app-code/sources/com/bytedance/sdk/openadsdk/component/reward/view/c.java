package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;

/* compiled from: RewardFullNativeVideoLayout */
public class c extends d {
    /* access modifiers changed from: protected */
    public boolean a() {
        return false;
    }

    public c(Activity activity) {
        super(activity);
    }

    public void a(int i, int i2) {
        super.a(i, i2);
        if (this.f852c != null && n.c(this.f852c) && this.f852c.t() == 3 && this.f852c.v() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.f851b.findViewById(t.e(this.f851b, "tt_video_container_back"));
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.f852c.am() == 1) {
                    int e2 = v.e(m.a(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = e2;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
