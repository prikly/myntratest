package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.c;
import com.bytedance.sdk.component.adexpress.dynamic.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.utils.t;

public class DynamicTimeOuterSkip extends DynamicButton implements b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f18623a;

    public DynamicTimeOuterSkip(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null) {
            this.f18623a = dynamicRootView.getRenderRequest().n();
        }
    }

    public boolean h() {
        super.h();
        if (!TextUtils.equals(this.m.i().b(), "skip-with-time-skip-btn")) {
            return true;
        }
        ((TextView) this.o).setText("");
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.o).getText())) {
            setMeasuredDimension(0, this.f18593h);
        }
    }

    public void f() {
        if (TextUtils.equals("skip-with-time-skip-btn", this.m.i().b())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f18592g, this.f18593h);
            layoutParams.gravity = 21;
            setLayoutParams(layoutParams);
        } else {
            super.f();
        }
        if (!"skip-with-time-skip-btn".equals(this.m.i().b()) && Build.VERSION.SDK_INT >= 17) {
            this.o.setTextAlignment(1);
            ((TextView) this.o).setGravity(17);
        }
        setVisibility(8);
    }

    public void a(CharSequence charSequence, boolean z, int i) {
        String a2 = t.a(c.a(), "tt_reward_screen_skip_tx");
        if (z) {
            if ("skip-with-time-skip-btn".equals(this.m.i().b())) {
                if (c.b() && this.f18623a) {
                    a2 = "X";
                }
                ((TextView) this.o).setText(" | " + a2);
            } else {
                ((TextView) this.o).setText(a2);
            }
            setVisibility(0);
        } else {
            setVisibility(8);
        }
        requestLayout();
    }
}
