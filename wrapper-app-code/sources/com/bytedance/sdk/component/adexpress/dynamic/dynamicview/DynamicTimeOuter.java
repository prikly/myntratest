package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;

public class DynamicTimeOuter extends DynamicButton implements b {
    public DynamicTimeOuter(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(hVar.i().b())) {
            dynamicRootView.setTimedown(this.f18593h);
        }
    }

    public boolean h() {
        super.h();
        if ("timedown".equals(this.m.i().b())) {
            ((TextView) this.o).setText(String.valueOf((int) Double.parseDouble(this.l.j())));
            return true;
        }
        ((TextView) this.o).setText(((int) Double.parseDouble(this.l.j())) + "s");
        return true;
    }

    public void f() {
        if (TextUtils.equals("skip-with-countdowns-video-countdown", this.m.i().b()) || TextUtils.equals("skip-with-time-countdown", this.m.i().b())) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f18592g, this.f18593h);
            layoutParams.gravity = 19;
            setLayoutParams(layoutParams);
            return;
        }
        super.f();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.o).getText())) {
            setMeasuredDimension(0, this.f18593h);
        }
    }

    public void a(CharSequence charSequence, boolean z, int i) {
        if ("timedown".equals(this.m.i().b())) {
            ((TextView) this.o).setText(charSequence);
            return;
        }
        ((TextView) this.o).setText(charSequence + "s");
    }
}
