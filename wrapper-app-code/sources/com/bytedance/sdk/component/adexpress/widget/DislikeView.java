package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class DislikeView extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f18710a;

    /* renamed from: b  reason: collision with root package name */
    private int f18711b;

    /* renamed from: c  reason: collision with root package name */
    private RectF f18712c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f18713d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f18714e;

    /* renamed from: f  reason: collision with root package name */
    private int f18715f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f18716g;

    /* renamed from: h  reason: collision with root package name */
    private int f18717h;

    public DislikeView(Context context) {
        super(context);
        a();
    }

    private void a() {
        Paint paint = new Paint();
        this.f18713d = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f18716g = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f18714e = paint3;
        paint3.setAntiAlias(true);
    }

    public void setRadius(int i) {
        this.f18715f = i;
    }

    public void setDislikeColor(int i) {
        this.f18716g.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.f18716g.setStrokeWidth((float) i);
    }

    public void setStrokeColor(int i) {
        this.f18713d.setStyle(Paint.Style.STROKE);
        this.f18713d.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.f18713d.setStrokeWidth((float) i);
        this.f18717h = i;
    }

    public void setBgColor(int i) {
        this.f18714e.setStyle(Paint.Style.FILL);
        this.f18714e.setColor(i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f18712c;
        int i = this.f18715f;
        canvas.drawRoundRect(rectF, (float) i, (float) i, this.f18714e);
        RectF rectF2 = this.f18712c;
        int i2 = this.f18715f;
        canvas.drawRoundRect(rectF2, (float) i2, (float) i2, this.f18713d);
        int i3 = this.f18710a;
        int i4 = this.f18711b;
        Canvas canvas2 = canvas;
        canvas2.drawLine(((float) i3) * 0.3f, ((float) i4) * 0.3f, ((float) i3) * 0.7f, ((float) i4) * 0.7f, this.f18716g);
        int i5 = this.f18710a;
        int i6 = this.f18711b;
        Canvas canvas3 = canvas;
        canvas3.drawLine(((float) i5) * 0.7f, ((float) i6) * 0.3f, ((float) i5) * 0.3f, ((float) i6) * 0.7f, this.f18716g);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f18710a = i;
        this.f18711b = i2;
        int i5 = this.f18717h;
        this.f18712c = new RectF((float) i5, (float) i5, (float) (this.f18710a - i5), (float) (this.f18711b - i5));
    }
}
