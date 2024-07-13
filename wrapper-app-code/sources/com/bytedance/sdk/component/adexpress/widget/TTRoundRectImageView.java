package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class TTRoundRectImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private Paint f18809a;

    /* renamed from: b  reason: collision with root package name */
    private int f18810b;

    /* renamed from: c  reason: collision with root package name */
    private int f18811c;

    /* renamed from: d  reason: collision with root package name */
    private Matrix f18812d;

    public TTRoundRectImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTRoundRectImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18810b = 25;
        this.f18811c = 25;
        Paint paint = new Paint();
        this.f18809a = paint;
        paint.setAntiAlias(true);
        this.f18809a.setFilterBitmap(true);
        this.f18812d = new Matrix();
    }

    public void setXRound(int i) {
        this.f18810b = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.f18811c = i;
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Bitmap a2 = a(drawable);
            if (a2 != null) {
                BitmapShader bitmapShader = new BitmapShader(a2, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                float f2 = 1.0f;
                if (!(a2.getWidth() == getWidth() && a2.getHeight() == getHeight())) {
                    f2 = Math.max((((float) getWidth()) * 1.0f) / ((float) a2.getWidth()), (((float) getHeight()) * 1.0f) / ((float) a2.getHeight()));
                }
                this.f18812d.setScale(f2, f2);
                bitmapShader.setLocalMatrix(this.f18812d);
                this.f18809a.setShader(bitmapShader);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), (float) this.f18810b, (float) this.f18811c, this.f18809a);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    private Bitmap a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return createBitmap;
    }
}
