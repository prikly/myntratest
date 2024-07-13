package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.c;
import com.bytedance.sdk.component.adexpress.dynamic.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.utils.t;

public class DynamicSkipCountDown extends DynamicButton implements b {
    public DynamicSkipCountDown(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.o).getText())) {
            setMeasuredDimension(0, this.f18593h);
        }
    }

    public void f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f18592g, this.f18593h);
        layoutParams.leftMargin = this.i;
        layoutParams.gravity = 16;
        setLayoutParams(layoutParams);
    }

    public void a(CharSequence charSequence, boolean z, int i) {
        if (i != 0) {
            String a2 = t.a(c.a(), "tt_reward_full_skip_count_down");
            ((TextView) this.o).setText(" | " + String.format(a2, new Object[]{Integer.valueOf(i)}));
        } else if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        requestLayout();
    }
}
