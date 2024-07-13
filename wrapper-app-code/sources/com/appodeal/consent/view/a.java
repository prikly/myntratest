package com.appodeal.consent.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.appodeal.consent.R;
import kotlin.jvm.internal.Intrinsics;

public final class a extends View {

    /* renamed from: a  reason: collision with root package name */
    public float f17888a = 54.0f;

    /* renamed from: b  reason: collision with root package name */
    public int f17889b;

    /* renamed from: c  reason: collision with root package name */
    public int f17890c;

    /* renamed from: d  reason: collision with root package name */
    public int f17891d;

    /* renamed from: e  reason: collision with root package name */
    public int f17892e;

    /* renamed from: f  reason: collision with root package name */
    public Bitmap f17893f;

    /* renamed from: g  reason: collision with root package name */
    public Bitmap f17894g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayerType(1, (Paint) null);
        this.f17889b = context.getResources().getColor(R.color.stack_consent_form_close_btn_main_color);
        this.f17890c = context.getResources().getColor(R.color.stack_consent_form_close_btn_background_color);
    }

    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f17893f != null) {
            float f2 = (float) this.f17892e;
            float f3 = (this.f17888a * 2.0f) - f2;
            RectF rectF = new RectF(f2, f2, f3, f3);
            Paint paint = new Paint(7);
            paint.setColor(this.f17890c);
            paint.setStyle(Paint.Style.FILL);
            RectF rectF2 = rectF;
            Paint paint2 = paint;
            canvas.drawArc(rectF2, 0.0f, 360.0f, false, paint2);
            paint.setColor(this.f17889b);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(5.0f);
            canvas.drawArc(rectF2, 0.0f, 360.0f, false, paint2);
            Paint paint3 = new Paint(7);
            paint3.setStyle(Paint.Style.FILL);
            paint3.setAntiAlias(true);
            Bitmap bitmap = this.f17893f;
            Intrinsics.checkNotNull(bitmap);
            float f4 = (float) ((int) (this.f17888a - ((float) (this.f17891d / 2))));
            canvas.drawBitmap(bitmap, f4, f4, paint3);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f17888a = ((float) i) / 2.0f;
        int max = Math.max(i, i2) / 4;
        this.f17892e = max;
        int sqrt = (int) (Math.sqrt(2.0d) * ((double) (this.f17888a - ((float) max))));
        this.f17891d = sqrt;
        Bitmap bitmap = this.f17894g;
        if (bitmap != null && sqrt > 0) {
            Intrinsics.checkNotNull(bitmap);
            int i5 = this.f17891d;
            this.f17893f = Bitmap.createScaledBitmap(bitmap, i5, i5, true);
            Paint paint = new Paint();
            paint.setColorFilter(new LightingColorFilter(this.f17889b, 0));
            Bitmap bitmap2 = this.f17893f;
            Intrinsics.checkNotNull(bitmap2);
            Canvas canvas = new Canvas(bitmap2);
            Bitmap bitmap3 = this.f17893f;
            Intrinsics.checkNotNull(bitmap3);
            canvas.drawBitmap(bitmap3, 0.0f, 0.0f, paint);
        }
    }

    public final void setImage(Bitmap bitmap) {
        int i;
        if (bitmap == null || (i = this.f17891d) <= 0) {
            this.f17894g = bitmap;
            this.f17893f = bitmap;
        } else {
            this.f17894g = bitmap;
            this.f17893f = Bitmap.createScaledBitmap(bitmap, i, i, true);
            Paint paint = new Paint();
            paint.setColorFilter(new LightingColorFilter(this.f17889b, 0));
            Bitmap bitmap2 = this.f17893f;
            Intrinsics.checkNotNull(bitmap2);
            Canvas canvas = new Canvas(bitmap2);
            Bitmap bitmap3 = this.f17893f;
            Intrinsics.checkNotNull(bitmap3);
            canvas.drawBitmap(bitmap3, 0.0f, 0.0f, paint);
        }
        postInvalidate();
    }
}
