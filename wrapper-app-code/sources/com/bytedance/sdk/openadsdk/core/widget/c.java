package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.m;

/* compiled from: TTCustomShadowBackground */
public class c extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private int f1816a;

    /* renamed from: b  reason: collision with root package name */
    private int f1817b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f1818c;

    /* renamed from: d  reason: collision with root package name */
    private float[] f1819d;

    /* renamed from: e  reason: collision with root package name */
    private LinearGradient f1820e;

    /* renamed from: f  reason: collision with root package name */
    private int f1821f;

    /* renamed from: g  reason: collision with root package name */
    private int f1822g;

    /* renamed from: h  reason: collision with root package name */
    private int f1823h;
    private int i;
    private RectF j;
    private Paint k;

    public int getOpacity() {
        return -3;
    }

    public c(int i2, int[] iArr, float[] fArr, int i3, LinearGradient linearGradient, int i4, int i5, int i6, int i7) {
        this.f1816a = i2;
        this.f1818c = iArr;
        this.f1819d = fArr;
        this.f1817b = i3;
        this.f1820e = linearGradient;
        this.f1821f = i4;
        this.f1822g = i5;
        this.f1823h = i6;
        this.i = i7;
    }

    public void draw(Canvas canvas) {
        if (this.j == null) {
            Rect bounds = getBounds();
            this.j = new RectF((float) ((bounds.left + this.f1822g) - this.f1823h), (float) ((bounds.top + this.f1822g) - this.i), (float) ((bounds.right - this.f1822g) - this.f1823h), (float) ((bounds.bottom - this.f1822g) - this.i));
        }
        if (this.k == null) {
            a();
        }
        RectF rectF = this.j;
        int i2 = this.f1821f;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, this.k);
    }

    public void setAlpha(int i2) {
        Paint paint = this.k;
        if (paint != null) {
            paint.setAlpha(i2);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.k;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    private void a() {
        int[] iArr;
        Paint paint = new Paint();
        this.k = paint;
        boolean z = true;
        paint.setAntiAlias(true);
        this.k.setShadowLayer((float) this.f1822g, (float) this.f1823h, (float) this.i, this.f1817b);
        if (this.j == null || (iArr = this.f1818c) == null || iArr.length <= 1) {
            this.k.setColor(this.f1816a);
            return;
        }
        float[] fArr = this.f1819d;
        if (fArr == null || fArr.length <= 0 || fArr.length != iArr.length) {
            z = false;
        }
        Paint paint2 = this.k;
        LinearGradient linearGradient = this.f1820e;
        if (linearGradient == null) {
            linearGradient = new LinearGradient(this.j.left, 0.0f, this.j.right, 0.0f, this.f1818c, z ? this.f1819d : null, Shader.TileMode.CLAMP);
        }
        paint2.setShader(linearGradient);
    }

    public static void a(View view, a aVar) {
        if (view != null && aVar != null) {
            view.setLayerType(1, (Paint) null);
            ViewCompat.setBackground(view, aVar.a());
        }
    }

    /* compiled from: TTCustomShadowBackground */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f1824a;

        /* renamed from: b  reason: collision with root package name */
        private int f1825b;

        /* renamed from: c  reason: collision with root package name */
        private int[] f1826c;

        /* renamed from: d  reason: collision with root package name */
        private float[] f1827d;

        /* renamed from: e  reason: collision with root package name */
        private LinearGradient f1828e;

        /* renamed from: f  reason: collision with root package name */
        private int f1829f;

        /* renamed from: g  reason: collision with root package name */
        private int f1830g;

        /* renamed from: h  reason: collision with root package name */
        private int f1831h;
        private int i;

        public a() {
            this.f1831h = 0;
            this.i = 0;
            this.f1824a = t.k(m.a(), "tt_ssxinmian8");
            this.f1825b = t.k(m.a(), "tt_ssxinxian3");
            this.f1829f = 10;
            this.f1830g = 16;
            this.f1831h = 0;
            this.i = 0;
        }

        public a a(int i2) {
            this.f1824a = i2;
            return this;
        }

        public a b(int i2) {
            this.f1825b = i2;
            return this;
        }

        public a a(int[] iArr) {
            this.f1826c = iArr;
            return this;
        }

        public a c(int i2) {
            this.f1829f = i2;
            return this;
        }

        public a d(int i2) {
            this.f1831h = i2;
            return this;
        }

        public a e(int i2) {
            this.i = i2;
            return this;
        }

        public c a() {
            return new c(this.f1824a, this.f1826c, this.f1827d, this.f1825b, this.f1828e, this.f1829f, this.f1830g, this.f1831h, this.i);
        }
    }
}
