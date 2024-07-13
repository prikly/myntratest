package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.utils.v;

public class TTCornersWebView extends WebView {

    /* renamed from: a  reason: collision with root package name */
    private int f1739a;

    /* renamed from: b  reason: collision with root package name */
    private int f1740b;

    /* renamed from: c  reason: collision with root package name */
    private int f1741c;

    /* renamed from: d  reason: collision with root package name */
    private int f1742d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f1743e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f1744f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f1745g = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    public TTCornersWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public TTCornersWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Paint paint = new Paint();
        this.f1743e = paint;
        paint.setColor(-1);
        this.f1743e.setAntiAlias(true);
        this.f1743e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Paint paint2 = new Paint();
        this.f1744f = paint2;
        paint2.setXfermode((Xfermode) null);
        this.f1744f.setAntiAlias(true);
        float b2 = v.b(context, 14.0f);
        a(b2, b2, 0.0f, 0.0f);
    }

    public void a(float f2, float f3, float f4, float f5) {
        float[] fArr = this.f1745g;
        fArr[0] = f2;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f3;
        fArr[4] = f4;
        fArr[5] = f4;
        fArr[6] = f5;
        fArr[7] = f5;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f1739a = getMeasuredWidth();
        this.f1740b = getMeasuredHeight();
    }

    public void onDraw(Canvas canvas) {
        this.f1741c = getScrollX();
        this.f1742d = getScrollY();
        Path path = new Path();
        int i = this.f1742d;
        path.addRoundRect(new RectF(0.0f, (float) i, (float) (this.f1741c + this.f1739a), (float) (i + this.f1740b)), this.f1745g, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }
}
