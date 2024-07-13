package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.graphics.drawable.GradientDrawable;

/* compiled from: CoverDrawable */
public class a extends GradientDrawable {

    /* renamed from: a  reason: collision with root package name */
    private Paint f18626a;

    /* renamed from: b  reason: collision with root package name */
    private Path f18627b = new Path();

    public a() {
        Paint paint = new Paint(1);
        this.f18626a = paint;
        paint.setColor(-1);
    }

    public a(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        Paint paint = new Paint(1);
        this.f18626a = paint;
        paint.setColor(-1);
    }

    public void draw(Canvas canvas) {
        Path path = this.f18627b;
        if (path == null || path.isEmpty()) {
            super.draw(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f18626a, 31);
        super.draw(canvas);
        this.f18626a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.f18627b, this.f18626a);
        this.f18626a.setXfermode((Xfermode) null);
        canvas.restoreToCount(saveLayer);
    }

    public void a(int i, int i2, int i3, int i4) {
        this.f18627b.addRect((float) i, (float) i2, (float) i3, (float) i4, Path.Direction.CW);
        invalidateSelf();
    }
}
