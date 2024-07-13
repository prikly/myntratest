package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.c;
import com.bytedance.sdk.component.adexpress.dynamic.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.utils.t;

public class DynamicSkipCountDownBtn extends DynamicButton implements b {

    /* renamed from: a  reason: collision with root package name */
    private int[] f18615a;

    /* renamed from: b  reason: collision with root package name */
    private int f18616b;
    private int s;

    public DynamicSkipCountDownBtn(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        dynamicRootView.setTimeOutListener(this);
    }

    public boolean h() {
        super.h();
        ((TextView) this.o).setText("");
        return true;
    }

    public void f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f18592g, this.f18593h);
        layoutParams.gravity = 21;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (TextUtils.isEmpty(((TextView) this.o).getText())) {
            setMeasuredDimension(0, this.f18593h);
        } else {
            setMeasuredDimension(this.f18592g, this.f18593h);
        }
    }

    public void a(CharSequence charSequence, boolean z, int i) {
        String a2 = t.a(c.a(), "tt_reward_screen_skip_tx");
        if (i == 0) {
            this.o.setVisibility(0);
            ((TextView) this.o).setText(" | " + a2);
            this.o.measure(-2, -2);
            this.f18615a = new int[]{this.o.getMeasuredWidth() + 1, this.o.getMeasuredHeight()};
            View view = this.o;
            int[] iArr = this.f18615a;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.o).setGravity(17);
            ((TextView) this.o).setIncludeFontPadding(false);
            a();
            this.o.setPadding(this.l.c(), this.f18616b, this.l.d(), this.s);
        }
        requestLayout();
    }

    private void a() {
        this.f18616b = ((this.f18593h - ((int) com.bytedance.sdk.component.adexpress.c.b.a(this.k, this.l.e()))) / 2) - this.l.a();
        this.s = 0;
    }
}
