package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;

public class AnimationButton extends TextView implements b {

    /* renamed from: a  reason: collision with root package name */
    a f18471a = new a();

    /* renamed from: b  reason: collision with root package name */
    private float f18472b;

    /* renamed from: c  reason: collision with root package name */
    private float f18473c;

    /* renamed from: d  reason: collision with root package name */
    private float f18474d;

    public float getShineValue() {
        return this.f18473c;
    }

    public void setShineValue(float f2) {
        this.f18473c = f2;
        postInvalidate();
    }

    public float getRippleValue() {
        return this.f18472b;
    }

    public void setRippleValue(float f2) {
        this.f18472b = f2;
        postInvalidate();
    }

    public float getMarqueeValue() {
        return this.f18474d;
    }

    public void setMarqueeValue(float f2) {
        this.f18474d = f2;
        postInvalidate();
    }

    public AnimationButton(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f18471a.a(canvas, (b) this, (View) this);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f18471a.a((View) this, i, i2);
    }
}
