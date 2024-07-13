package com.explorestack.iab.vast.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import com.explorestack.iab.utils.Assets;
import com.explorestack.iab.utils.IabElement;
import com.explorestack.iab.utils.IabElementStyle;
import com.explorestack.iab.utils.Utils;

public class CircleCountdownView extends View implements IabElement {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f3316a;

    /* renamed from: b  reason: collision with root package name */
    public int f3317b;

    /* renamed from: c  reason: collision with root package name */
    public int f3318c = Assets.mainAssetsColor;

    /* renamed from: d  reason: collision with root package name */
    public int f3319d = Assets.backgroundColor;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3320e = false;

    /* renamed from: f  reason: collision with root package name */
    public float f3321f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f3322g = 0.071428575f;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f3323h = new RectF();
    public final RectF i = new RectF();
    public float j = 54.0f;
    public float k = 54.0f;
    public float l = 5.0f;
    public Paint m;
    public Paint n;
    public Rect o;
    public RectF p;
    public Paint q;
    public Paint r;
    public float s = 100.0f;
    public int t;

    public CircleCountdownView(Context context) {
        super(context);
        a(context);
    }

    public final float a(float f2, boolean z) {
        float width = this.f3323h.width();
        if (z) {
            width -= this.l * 2.0f;
        }
        float sqrt = (float) (((double) (width / 2.0f)) * Math.sqrt(2.0d));
        return sqrt - ((f2 * sqrt) * 2.0f);
    }

    public final void a() {
        float min = (float) Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float f2 = min / 2.0f;
        float width = (((float) getWidth()) / 2.0f) - f2;
        float height = (((float) getHeight()) / 2.0f) - f2;
        this.f3323h.set(width, height, width + min, min + height);
        this.j = this.f3323h.centerX();
        this.k = this.f3323h.centerY();
        RectF rectF = this.i;
        RectF rectF2 = this.f3323h;
        float f3 = rectF2.left;
        float f4 = this.l / 2.0f;
        rectF.set(f3 + f4, rectF2.top + f4, rectF2.right - f4, rectF2.bottom - f4);
    }

    public final void a(Context context) {
        setLayerType(1, (Paint) null);
        this.l = (float) Utils.dpToPx(context, 3.0f);
    }

    public final void a(Canvas canvas) {
        if (this.q == null) {
            Paint paint = new Paint(7);
            this.q = paint;
            paint.setStyle(Paint.Style.FILL);
            this.q.setAntiAlias(true);
        }
        if (this.o == null) {
            this.o = new Rect();
        }
        if (this.p == null) {
            this.p = new RectF();
        }
        float a2 = a(this.f3321f, this.f3320e);
        float f2 = a2 / 2.0f;
        float f3 = this.j - f2;
        float f4 = this.k - f2;
        this.o.set(0, 0, this.f3316a.getWidth(), this.f3316a.getHeight());
        this.p.set(f3, f4, f3 + a2, a2 + f4);
        this.q.setColorFilter(new PorterDuffColorFilter(this.f3318c, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(this.f3316a, this.o, this.p, this.q);
        if (this.f3320e) {
            if (this.r == null) {
                Paint paint2 = new Paint(1);
                this.r = paint2;
                paint2.setStyle(Paint.Style.STROKE);
            }
            this.r.setStrokeWidth(this.l);
            this.r.setColor(this.f3318c);
            canvas.drawArc(this.i, 0.0f, 360.0f, false, this.r);
        }
    }

    public final void b(Canvas canvas) {
        if (this.m == null) {
            this.m = new Paint(1);
        }
        float f2 = 360.0f - ((this.s * 360.0f) * 0.01f);
        this.m.setColor(this.f3319d);
        this.m.setStyle(Paint.Style.FILL);
        canvas.drawArc(this.f3323h, 0.0f, 360.0f, false, this.m);
        this.m.setColor(this.f3318c);
        this.m.setStyle(Paint.Style.STROKE);
        this.m.setStrokeWidth(this.l);
        canvas.drawArc(this.i, 270.0f, f2, false, this.m);
    }

    public final void c(Canvas canvas) {
        if (this.n == null) {
            Paint paint = new Paint(1);
            this.n = paint;
            paint.setAntiAlias(true);
            this.n.setStyle(Paint.Style.FILL);
            this.n.setTextAlign(Paint.Align.CENTER);
        }
        String valueOf = String.valueOf(this.t);
        this.n.setColor(this.f3318c);
        this.n.setTypeface(Typeface.create(Typeface.DEFAULT, this.f3317b));
        this.n.setTextSize(a(this.f3322g, true));
        canvas.drawText(valueOf, this.j, this.k - ((this.n.descent() + this.n.ascent()) / 2.0f), this.n);
    }

    public void changePercentage(float f2, int i2) {
        if (this.f3316a == null || f2 == 100.0f) {
            this.s = f2;
            this.t = i2;
            postInvalidate();
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() != 0 && getHeight() != 0) {
            if (this.t != 0 || this.f3316a != null) {
                b(canvas);
                if (this.f3316a != null) {
                    a(canvas);
                } else {
                    c(canvas);
                }
            }
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        a();
    }

    public void setColors(int i2, int i3) {
        this.f3318c = i2;
        this.f3319d = i3;
        a();
    }

    public void setImage(Bitmap bitmap) {
        this.f3316a = bitmap;
        if (bitmap != null) {
            this.s = 100.0f;
        }
        postInvalidate();
    }

    public void setStyle(IabElementStyle iabElementStyle) {
        this.f3317b = iabElementStyle.getFontStyle().intValue();
        this.f3318c = iabElementStyle.getStrokeColor().intValue();
        this.f3319d = iabElementStyle.getFillColor().intValue();
        this.f3320e = iabElementStyle.isOutlined().booleanValue();
        this.l = iabElementStyle.getStrokeWidth(getContext()).floatValue();
        setPadding(iabElementStyle.getPaddingLeft(getContext()).intValue(), iabElementStyle.getPaddingTop(getContext()).intValue(), iabElementStyle.getPaddingRight(getContext()).intValue(), iabElementStyle.getPaddingBottom(getContext()).intValue());
        setAlpha(iabElementStyle.getOpacity().floatValue());
        a();
        postInvalidate();
    }
}
