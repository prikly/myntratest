package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class RatioFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public float f1726a;

    public RatioFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1726a = 0.0f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = getLayoutParams().width;
        int i4 = getLayoutParams().height;
        float f2 = this.f1726a;
        if (f2 > 0.0f) {
            if (i3 == -2) {
                size = (int) (((float) size2) * f2);
                mode = 1073741824;
            } else if (i4 == -2) {
                size2 = (int) (((float) size) / f2);
                mode2 = 1073741824;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public void setRatio(float f2) {
        this.f1726a = f2;
    }
}
