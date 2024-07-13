package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.sdk.component.utils.t;
import java.util.ArrayList;
import java.util.List;

public class WriggleGuideView extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f18826a;

    /* renamed from: b  reason: collision with root package name */
    private int f18827b;

    /* renamed from: c  reason: collision with root package name */
    private Bitmap f18828c;

    /* renamed from: d  reason: collision with root package name */
    private Bitmap f18829d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f18830e;

    /* renamed from: f  reason: collision with root package name */
    private int f18831f;

    /* renamed from: g  reason: collision with root package name */
    private final List<b> f18832g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f18833h;
    private boolean i;
    private a j;

    public interface a {
        void a();
    }

    public WriggleGuideView(Context context) {
        this(context, (AttributeSet) null);
    }

    public WriggleGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WriggleGuideView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f18826a = 0;
        this.f18827b = 0;
        this.f18831f = 0;
        this.f18832g = new ArrayList();
        this.f18833h = true;
        this.i = false;
        setLayerType(1, (Paint) null);
        this.f18830e = new Paint();
        this.f18830e = new Paint(1);
        this.f18832g.clear();
    }

    private Bitmap a(int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(BitmapFactory.decodeResource(getContext().getResources(), t.d(getContext(), "tt_wriggle_union")), (Rect) null, new RectF(0.0f, 0.0f, (float) i2, (float) i3), this.f18830e);
        return createBitmap;
    }

    private Bitmap b(int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(BitmapFactory.decodeResource(getContext().getResources(), t.d(getContext(), "tt_wriggle_union_white")), (Rect) null, new RectF(0.0f, 0.0f, (float) i2, (float) i3), new Paint(1));
        return createBitmap;
    }

    private Bitmap c(int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float f2 = ((float) this.f18831f) / ((float) this.f18826a);
        if (f2 >= 0.5f) {
            f2 = Math.abs(f2 - 1.0f);
        }
        int i4 = this.f18827b;
        this.f18832g.add(new b((float) (i2 - this.f18831f), ((float) i3) - ((f2 * 2.0f) * ((float) i4)), ((float) Math.min(this.f18826a, i4)) / 2.0f));
        for (b next : this.f18832g) {
            canvas.drawCircle(next.f18834a, next.f18835b, next.f18836c, paint);
        }
        return createBitmap;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f18833h) {
            this.f18826a = getWidth();
            int height = getHeight();
            this.f18827b = height;
            this.f18828c = a(this.f18826a, height);
            this.f18829d = b(this.f18826a, this.f18827b);
            this.f18833h = false;
        }
        canvas.drawBitmap(this.f18828c, 0.0f, 0.0f, this.f18830e);
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (Paint) null, 31);
        canvas.drawBitmap(this.f18829d, 0.0f, 0.0f, this.f18830e);
        this.f18830e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(c(this.f18826a, this.f18827b), 0.0f, 0.0f, this.f18830e);
        this.f18830e.setXfermode((Xfermode) null);
        canvas.restoreToCount(saveLayer);
        if (this.i) {
            this.f18831f += 2;
            invalidate();
            if (this.f18831f >= this.f18826a) {
                a aVar = this.j;
                if (aVar != null) {
                    aVar.a();
                }
                this.i = false;
            }
        }
    }

    public void a(a aVar) {
        this.j = aVar;
        this.f18831f = 0;
        this.i = true;
        invalidate();
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public float f18834a;

        /* renamed from: b  reason: collision with root package name */
        public float f18835b;

        /* renamed from: c  reason: collision with root package name */
        public float f18836c;

        b(float f2, float f3, float f4) {
            this.f18834a = f2;
            this.f18835b = f3;
            this.f18836c = f4;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.j != null) {
            this.j = null;
        }
    }
}
