package com.appnext.ads.fullscreen;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

public final class a extends Animation {
    private float aA;
    private Circle ay;
    private float az;

    public a(Circle circle, float f2) {
        setInterpolator(new LinearInterpolator());
        this.az = circle.getAngle();
        this.aA = f2;
        this.ay = circle;
    }

    /* access modifiers changed from: protected */
    public final void applyTransformation(float f2, Transformation transformation) {
        float f3 = this.az;
        this.ay.setAngle(f3 - ((f3 - this.aA) * f2));
        this.ay.invalidate();
        this.ay.requestLayout();
    }
}
