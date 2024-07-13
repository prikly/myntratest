package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Arrays;

public class RoundFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Path f1728a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f1729b;

    /* renamed from: c  reason: collision with root package name */
    private RectF f1730c;

    /* renamed from: d  reason: collision with root package name */
    private float[] f1731d;

    public RoundFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1728a = new Path();
        this.f1730c = new RectF();
        Paint paint = new Paint();
        this.f1729b = paint;
        paint.setAntiAlias(true);
        this.f1729b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f1731d = new float[8];
    }

    public void a(float f2, float f3, float f4, float f5) {
        float[] fArr = this.f1731d;
        fArr[0] = f2;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f3;
        fArr[4] = f5;
        fArr[5] = f5;
        fArr[6] = f4;
        fArr[7] = f4;
        postInvalidate();
    }

    public void setRadius(float f2) {
        Arrays.fill(this.f1731d, f2);
        postInvalidate();
    }

    public void setTopLeftRadius(float f2) {
        float[] fArr = this.f1731d;
        fArr[0] = f2;
        fArr[1] = f2;
        postInvalidate();
    }

    public void setTopRightRadius(float f2) {
        float[] fArr = this.f1731d;
        fArr[2] = f2;
        fArr[3] = f2;
        postInvalidate();
    }

    public void setBottomRightRadius(float f2) {
        float[] fArr = this.f1731d;
        fArr[5] = f2;
        fArr[6] = f2;
        postInvalidate();
    }

    public void setBottomLeftRadius(float f2) {
        float[] fArr = this.f1731d;
        fArr[6] = f2;
        fArr[7] = f2;
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f1730c.set(0.0f, 0.0f, (float) i, (float) i2);
    }

    public void draw(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 28) {
            canvas.save();
            canvas.clipPath(a());
            super.draw(canvas);
        } else {
            canvas.saveLayer(this.f1730c, (Paint) null, 31);
            super.draw(canvas);
            canvas.drawPath(a(), this.f1729b);
        }
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 28) {
            canvas.save();
            canvas.clipPath(a());
            super.dispatchDraw(canvas);
        } else {
            canvas.saveLayer(this.f1730c, (Paint) null, 31);
            super.dispatchDraw(canvas);
            canvas.drawPath(a(), this.f1729b);
        }
        canvas.restore();
    }

    private Path a() {
        this.f1728a.reset();
        this.f1728a.addRoundRect(this.f1730c, this.f1731d, Path.Direction.CW);
        return this.f1728a;
    }
}
