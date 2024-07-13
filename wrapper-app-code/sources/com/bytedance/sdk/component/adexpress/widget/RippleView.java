package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

public class RippleView extends View {

    /* renamed from: a  reason: collision with root package name */
    private float f18749a;

    /* renamed from: b  reason: collision with root package name */
    private float f18750b;

    /* renamed from: c  reason: collision with root package name */
    private ValueAnimator f18751c;

    /* renamed from: d  reason: collision with root package name */
    private ValueAnimator f18752d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f18753e;

    /* renamed from: f  reason: collision with root package name */
    private long f18754f = 300;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public float f18755g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    private float f18756h;
    private Animator.AnimatorListener i;

    public RippleView(Context context) {
        super(context);
        a();
    }

    public void a() {
        Paint paint = new Paint(1);
        this.f18753e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f18753e.setColor(Color.parseColor("#99000000"));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f18749a = ((float) i2) / 2.0f;
        this.f18750b = ((float) i3) / 2.0f;
        this.f18756h = (float) (Math.hypot((double) i2, (double) i3) / 2.0d);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f18749a, this.f18750b, this.f18755g, this.f18753e);
    }

    public void b() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, this.f18756h});
        this.f18751c = ofFloat;
        ofFloat.setDuration(this.f18754f);
        this.f18751c.setInterpolator(new LinearInterpolator());
        this.f18751c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = RippleView.this.f18755g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        this.f18751c.start();
    }

    public void c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f18756h, 0.0f});
        this.f18752d = ofFloat;
        ofFloat.setDuration(this.f18754f);
        this.f18752d.setInterpolator(new LinearInterpolator());
        this.f18752d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = RippleView.this.f18755g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.i;
        if (animatorListener != null) {
            this.f18752d.addListener(animatorListener);
        }
        this.f18752d.start();
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.i = animatorListener;
    }
}
