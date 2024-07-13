package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.i;

public final class q extends i {

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f14223c = new Paint(1);

    /* renamed from: d  reason: collision with root package name */
    private static final Paint f14224d = new Paint(1);

    public q(Context context) {
        super(context);
        f14223c.setARGB(80, 0, 0, 0);
        f14224d.setColor(-1);
        f14224d.setStyle(Paint.Style.STROKE);
    }

    public void a(int i) {
        setViewScale(((float) i) / 30.0f);
    }

    /* access modifiers changed from: protected */
    public float getCenter() {
        return getSize() / 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getCrossOffset() {
        return this.f14164a * 8.0f;
    }

    /* access modifiers changed from: protected */
    public float getStrokeWidth() {
        return this.f14164a * 2.0f;
    }

    public i.a getStyle() {
        return i.a.WHITE_ON_TRANSPARENT;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f14223c);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        f14224d.setStrokeWidth(getStrokeWidth());
        Canvas canvas2 = canvas;
        float f2 = crossOffset;
        float f3 = size;
        canvas2.drawLine(f2, crossOffset, f3, size, f14224d);
        canvas2.drawLine(f2, size, f3, crossOffset, f14224d);
    }
}
