package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ShadowImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private Paint f1734a;

    /* renamed from: b  reason: collision with root package name */
    private RectF f1735b;

    public ShadowImageView(Context context) {
        super(context);
        a();
    }

    public ShadowImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ShadowImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        Paint paint = new Paint();
        this.f1734a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f1734a.setColor(Color.parseColor("#99333333"));
        this.f1734a.setAntiAlias(true);
        this.f1734a.setStrokeWidth(0.0f);
        this.f1735b = new RectF();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1735b.right != ((float) getMeasuredWidth()) || this.f1735b.bottom != ((float) getMeasuredHeight())) {
            this.f1735b.set(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f1735b;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, this.f1735b.bottom / 2.0f, this.f1734a);
        super.onDraw(canvas);
    }
}
