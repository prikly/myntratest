package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.i;

public final class w extends i {

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f14240c = new Paint(1);

    /* renamed from: d  reason: collision with root package name */
    private static final Paint f14241d = new Paint(1);

    /* renamed from: e  reason: collision with root package name */
    private static final Paint f14242e = new Paint(1);

    public w(Context context) {
        super(context);
        f14240c.setColor(-1);
        f14241d.setColor(-16777216);
        f14242e.setColor(-1);
        f14242e.setStyle(Paint.Style.STROKE);
    }

    /* access modifiers changed from: protected */
    public float getCenter() {
        return getSize() / 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getCrossOffset() {
        return this.f14164a * 10.0f;
    }

    /* access modifiers changed from: protected */
    public float getInnerCircleOffset() {
        return this.f14164a * 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    /* access modifiers changed from: protected */
    public float getStrokeWidth() {
        return this.f14164a * 3.0f;
    }

    public i.a getStyle() {
        return i.a.WHITE_ON_BLACK;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f14240c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f14241d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        f14242e.setStrokeWidth(getStrokeWidth());
        Canvas canvas2 = canvas;
        float f2 = crossOffset;
        float f3 = size;
        canvas2.drawLine(f2, crossOffset, f3, size, f14242e);
        canvas2.drawLine(f2, size, f3, crossOffset, f14242e);
    }
}
