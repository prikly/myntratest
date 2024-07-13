package com.bytedance.sdk.component.adexpress.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;

public class ShadowImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private Paint f18759a;

    /* renamed from: b  reason: collision with root package name */
    private RectF f18760b;

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f18760b.right != ((float) getMeasuredWidth()) || this.f18760b.bottom != ((float) getMeasuredHeight())) {
            this.f18760b.set(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f18760b;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, this.f18760b.bottom / 2.0f, this.f18759a);
        super.onDraw(canvas);
    }
}
