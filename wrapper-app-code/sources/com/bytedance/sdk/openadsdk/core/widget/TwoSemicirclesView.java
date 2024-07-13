package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.KotlinVersion;

public class TwoSemicirclesView extends View {

    /* renamed from: a  reason: collision with root package name */
    private final RectF f1768a;

    /* renamed from: b  reason: collision with root package name */
    private int f1769b;

    /* renamed from: c  reason: collision with root package name */
    private int f1770c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f1771d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f1772e;

    /* renamed from: f  reason: collision with root package name */
    private float f1773f = -90.0f;

    /* renamed from: g  reason: collision with root package name */
    private float f1774g = 220.0f;

    /* renamed from: h  reason: collision with root package name */
    private int f1775h = Color.parseColor("#FFFFFF");
    private int i = Color.parseColor("#C4C4C4");

    public TwoSemicirclesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
        float f2 = this.f1774g;
        this.f1768a = new RectF(-f2, -f2, f2, f2);
    }

    private void a() {
        Paint paint = new Paint();
        this.f1771d = paint;
        paint.setColor(this.f1775h);
        this.f1771d.setStyle(Paint.Style.STROKE);
        this.f1771d.setStrokeWidth(4.0f);
        this.f1771d.setAlpha(20);
        Paint paint2 = new Paint(this.f1771d);
        this.f1772e = paint2;
        paint2.setColor(this.i);
        this.f1772e.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f1769b = i2;
        this.f1770c = i3;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f1768a;
        float f2 = this.f1774g;
        rectF.set(-f2, -f2, f2, f2);
        canvas.translate((float) (this.f1769b / 2), (float) (this.f1770c / 2));
        canvas.drawArc(this.f1768a, this.f1773f, 180.0f, false, this.f1771d);
        canvas.drawArc(this.f1768a, this.f1773f + 180.0f, 180.0f, false, this.f1772e);
    }

    public void setCurrentStartAngle(float f2) {
        this.f1773f = f2;
        postInvalidate();
    }

    public void setRadius(float f2) {
        this.f1774g = f2;
        postInvalidate();
    }

    public void setPaintOne(Paint paint) {
        this.f1771d = paint;
        postInvalidate();
    }

    public Paint getPaintOne() {
        return this.f1771d;
    }

    public void setPaintTwo(Paint paint) {
        this.f1772e = paint;
        postInvalidate();
    }

    public Paint getPaintTwo() {
        return this.f1772e;
    }
}
