package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

public class SplashDiffuseView extends View {

    /* renamed from: c  reason: collision with root package name */
    private static int f18796c = 50;

    /* renamed from: a  reason: collision with root package name */
    private Paint f18797a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f18798b;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ObjectAnimator f18799d;

    public SplashDiffuseView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SplashDiffuseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SplashDiffuseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18798b = 10;
        b();
    }

    private void b() {
        Paint paint = new Paint();
        this.f18797a = paint;
        paint.setAntiAlias(true);
        this.f18797a.setColor(Color.parseColor("#FFFFFFFF"));
        this.f18797a.setStyle(Paint.Style.STROKE);
        this.f18797a.setStrokeWidth(18.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.0f});
        this.f18799d = ofFloat;
        ofFloat.setDuration(200);
    }

    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    public void onDraw(Canvas canvas) {
        this.f18797a.setShader(new LinearGradient((float) (getMeasuredWidth() / 2), 0.0f, (float) (getMeasuredWidth() / 2), (float) getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        canvas.drawCircle(((float) getMeasuredWidth()) / 2.0f, ((float) getMeasuredHeight()) / 2.0f, (float) this.f18798b, this.f18797a);
    }

    public void a() {
        int min = (int) Math.min(((float) getMeasuredWidth()) / 2.0f, ((float) getMeasuredHeight()) / 2.0f);
        f18796c = min;
        int i = min - 18;
        f18796c = i;
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{10, i});
        ofInt.setInterpolator(new a(0.0f, 0.2f, 0.3f, 1.0f));
        ofInt.setDuration(800);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int unused = SplashDiffuseView.this.f18798b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SplashDiffuseView.this.requestLayout();
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                SplashDiffuseView.this.setVisibility(0);
                SplashDiffuseView.this.setAlpha(1.0f);
            }

            public void onAnimationEnd(Animator animator) {
                SplashDiffuseView.this.f18799d.start();
            }
        });
        ofInt.start();
    }
}
