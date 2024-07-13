package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.TextView;

public class ShadowTextView extends TextView {

    /* renamed from: a  reason: collision with root package name */
    private Paint f1736a;

    /* renamed from: b  reason: collision with root package name */
    private RectF f1737b;

    /* renamed from: c  reason: collision with root package name */
    private int f1738c;

    public ShadowTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShadowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1738c = 0;
        a();
    }

    private void a() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.f1736a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f1736a.setColor(Color.parseColor("#99333333"));
        this.f1736a.setAntiAlias(true);
        this.f1736a.setStrokeWidth(0.0f);
        this.f1737b = new RectF();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.f1737b.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        int measureText = (int) getPaint().measureText("00");
        this.f1738c = measureText;
        if (measuredWidth < measureText) {
            measuredWidth = measureText;
        }
        int i3 = measuredWidth + ((measuredHeight / 2) * 2);
        setMeasuredDimension(i3, measuredHeight);
        this.f1737b.set(0.0f, 0.0f, (float) i3, (float) measuredHeight);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f1737b;
        canvas.drawRoundRect(rectF, rectF.bottom / 2.0f, this.f1737b.bottom / 2.0f, this.f1736a);
        canvas.translate((this.f1737b.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }
}
