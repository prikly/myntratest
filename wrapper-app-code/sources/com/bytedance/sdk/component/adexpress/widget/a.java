package com.bytedance.sdk.component.adexpress.widget;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* compiled from: CubicBezierInterpolator */
public class a implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private int f18837a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final PointF f18838b = new PointF();

    /* renamed from: c  reason: collision with root package name */
    private final PointF f18839c = new PointF();

    /* renamed from: d  reason: collision with root package name */
    private float f18840d = 0.0f;

    public static double a(double d2, double d3, double d4) {
        double d5 = 1.0d - d2;
        double d6 = d2 * d2;
        return (d5 * d5 * 3.0d * d2 * d3) + (d5 * 3.0d * d6 * d4) + (d6 * d2);
    }

    public a(float f2, float f3, float f4, float f5) {
        this.f18838b.x = f2;
        this.f18838b.y = f3;
        this.f18839c.x = f4;
        this.f18839c.y = f5;
    }

    public float getInterpolation(float f2) {
        if (f2 < ((float) this.f18837a)) {
            this.f18837a = 0;
        }
        int i = this.f18837a;
        float f3 = f2;
        while (true) {
            if (i >= 4096) {
                break;
            }
            f3 = ((float) i) * 2.4414062E-4f;
            if (a((double) f3, (double) this.f18838b.x, (double) this.f18839c.x) >= ((double) f2)) {
                this.f18837a = i;
                break;
            }
            i++;
        }
        return (float) a((double) f3, (double) this.f18838b.y, (double) this.f18839c.y);
    }
}
