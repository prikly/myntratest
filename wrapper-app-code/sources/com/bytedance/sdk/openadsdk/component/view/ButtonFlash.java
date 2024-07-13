package com.bytedance.sdk.openadsdk.component.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.TextView;

public class ButtonFlash extends TextView {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int f870a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f871b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f872c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public LinearGradient f873d;

    /* renamed from: e  reason: collision with root package name */
    private RectF f874e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Matrix f875f;

    /* renamed from: g  reason: collision with root package name */
    private ValueAnimator f876g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f877h = true;

    public ButtonFlash(Context context) {
        super(context);
        b();
    }

    public ButtonFlash(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public ButtonFlash(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        this.f874e = new RectF();
        this.f872c = new Paint();
        c();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f870a = i;
        this.f871b = i2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, ((float) this.f870a) / 2.0f, (float) this.f871b, new int[]{16777215, 1358954495, 16777215}, new float[]{0.1f, 0.3f, 0.5f}, Shader.TileMode.CLAMP);
        this.f873d = linearGradient;
        this.f872c.setShader(linearGradient);
        this.f872c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        Matrix matrix = new Matrix();
        this.f875f = matrix;
        matrix.setTranslate((float) (-this.f870a), (float) this.f871b);
        this.f873d.setLocalMatrix(this.f875f);
        this.f874e.set(0.0f, 0.0f, (float) this.f870a, (float) this.f871b);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f875f != null) {
            canvas.drawRoundRect(this.f874e, 100.0f, 100.0f, this.f872c);
        }
    }

    private void c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f876g = ofFloat;
        ofFloat.setDuration(3000);
        this.f876g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float a2 = (((float) (ButtonFlash.this.f870a * 2)) * ((Float) valueAnimator.getAnimatedValue()).floatValue()) - ((float) ButtonFlash.this.f870a);
                if (ButtonFlash.this.f875f != null) {
                    ButtonFlash.this.f875f.setTranslate(a2, (float) ButtonFlash.this.f871b);
                }
                if (ButtonFlash.this.f873d != null) {
                    ButtonFlash.this.f873d.setLocalMatrix(ButtonFlash.this.f875f);
                }
                ButtonFlash.this.invalidate();
            }
        });
        if (this.f877h) {
            this.f876g.setRepeatCount(-1);
            ValueAnimator valueAnimator = this.f876g;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    public void setAutoRun(boolean z) {
        this.f877h = z;
    }

    public void a() {
        ValueAnimator valueAnimator = this.f876g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            invalidate();
        }
    }
}
