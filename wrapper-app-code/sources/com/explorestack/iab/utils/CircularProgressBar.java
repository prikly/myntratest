package com.explorestack.iab.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ProgressBar;

public final class CircularProgressBar extends ProgressBar implements IabElement {

    /* renamed from: a  reason: collision with root package name */
    public b f3057a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f3058b;

    public CircularProgressBar(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f3058b = paint;
        paint.setColor(0);
        a(context);
    }

    public void a(Context context) {
        float f2 = getResources().getDisplayMetrics().density;
        int dpToPx = Utils.dpToPx(context, 8.0f);
        setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        b bVar = new b(context);
        this.f3057a = bVar;
        bVar.c(f2 * 4.0f);
        this.f3057a.a(-65536);
        this.f3057a.a(Paint.Cap.ROUND);
        setIndeterminateDrawable(this.f3057a);
        setIndeterminate(true);
    }

    public synchronized void onDraw(Canvas canvas) {
        canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((float) Math.min(getWidth(), getHeight())) / 2.0f, this.f3058b);
        super.onDraw(canvas);
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f3057a.a((((float) Math.min((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom())) / 2.0f) - this.f3057a.a());
    }

    public void setColorSchemeColors(int... iArr) {
        this.f3057a.a(iArr);
    }

    public void setProgressBackgroundColor(int i) {
        this.f3058b.setColor(i);
    }

    public void setStyle(IabElementStyle iabElementStyle) {
        this.f3057a.c(iabElementStyle.getStrokeWidth(getContext()).floatValue());
        this.f3057a.a(iabElementStyle.getStrokeColor().intValue());
        this.f3058b.setColor(iabElementStyle.getFillColor().intValue());
        postInvalidate();
    }
}
