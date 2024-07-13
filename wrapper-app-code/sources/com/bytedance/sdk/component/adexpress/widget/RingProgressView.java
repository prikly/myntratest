package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class RingProgressView extends View {

    /* renamed from: a  reason: collision with root package name */
    private Context f18741a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f18742b;

    /* renamed from: c  reason: collision with root package name */
    private RectF f18743c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public float f18744d;

    /* renamed from: e  reason: collision with root package name */
    private ValueAnimator f18745e;

    /* renamed from: f  reason: collision with root package name */
    private int f18746f = 1500;

    /* renamed from: g  reason: collision with root package name */
    private boolean f18747g;

    public RingProgressView(Context context) {
        super(context);
        this.f18741a = context;
        Paint paint = new Paint();
        this.f18742b = paint;
        paint.setAntiAlias(true);
        this.f18742b.setStyle(Paint.Style.STROKE);
        this.f18742b.setStrokeWidth(10.0f);
        this.f18742b.setColor(Color.parseColor("#80FFFFFF"));
        this.f18743c = new RectF();
    }

    public void a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 360.0f});
        this.f18745e = ofFloat;
        ofFloat.setDuration((long) this.f18746f);
        this.f18745e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float unused = RingProgressView.this.f18744d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RingProgressView.this.requestLayout();
            }
        });
        this.f18745e.start();
    }

    public void b() {
        ValueAnimator valueAnimator = this.f18745e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void c() {
        this.f18747g = true;
        invalidate();
    }

    public void setDuration(int i) {
        this.f18746f = i;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f18747g) {
            canvas.drawArc(this.f18743c, 270.0f, this.f18744d, false, this.f18742b);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f18743c.set(5.0f, 5.0f, (float) (i - 5), (float) (i2 - 5));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }
}
