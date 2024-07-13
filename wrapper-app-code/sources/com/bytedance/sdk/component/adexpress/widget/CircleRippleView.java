package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

public class CircleRippleView extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f18702a;

    /* renamed from: b  reason: collision with root package name */
    private int f18703b;

    /* renamed from: c  reason: collision with root package name */
    private float f18704c;

    /* renamed from: d  reason: collision with root package name */
    private int f18705d;

    /* renamed from: e  reason: collision with root package name */
    private float f18706e;

    /* renamed from: f  reason: collision with root package name */
    private int f18707f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f18708g;

    /* renamed from: h  reason: collision with root package name */
    private List<Integer> f18709h;
    private List<Integer> i;
    private Paint j;
    private Paint k;
    private float l;
    private float m;
    private int n;

    public CircleRippleView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CircleRippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CircleRippleView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f18702a = -1;
        this.f18703b = -65536;
        this.f18704c = 18.0f;
        this.f18705d = 3;
        this.f18706e = 50.0f;
        this.f18707f = 2;
        this.f18708g = false;
        this.f18709h = new ArrayList();
        this.i = new ArrayList();
        this.n = 24;
        c();
    }

    private void c() {
        Paint paint = new Paint();
        this.j = paint;
        paint.setAntiAlias(true);
        this.j.setStrokeWidth((float) this.n);
        this.f18709h.add(Integer.valueOf(KotlinVersion.MAX_COMPONENT_VALUE));
        this.i.add(0);
        Paint paint2 = new Paint();
        this.k = paint2;
        paint2.setAntiAlias(true);
        this.k.setColor(Color.parseColor("#0FFFFFFF"));
        this.k.setStyle(Paint.Style.FILL);
    }

    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        float f2 = ((float) i2) / 2.0f;
        this.l = f2;
        this.m = ((float) i3) / 2.0f;
        float f3 = f2 - (((float) this.n) / 2.0f);
        this.f18706e = f3;
        this.f18704c = f3 / 4.0f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    public void onDraw(Canvas canvas) {
        this.j.setShader(new LinearGradient(this.l, 0.0f, this.m, (float) getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i2 >= this.f18709h.size()) {
                break;
            }
            Integer num = this.f18709h.get(i2);
            this.j.setAlpha(num.intValue());
            Integer num2 = this.i.get(i2);
            if (this.f18704c + ((float) num2.intValue()) < this.f18706e) {
                canvas.drawCircle(this.l, this.m, this.f18704c + ((float) num2.intValue()), this.j);
            }
            if (num.intValue() > 0 && ((float) num2.intValue()) < this.f18706e) {
                List<Integer> list = this.f18709h;
                if (num.intValue() - this.f18707f > 0) {
                    i3 = num.intValue() - (this.f18707f * 3);
                }
                list.set(i2, Integer.valueOf(i3));
                this.i.set(i2, Integer.valueOf(num2.intValue() + this.f18707f));
            }
            i2++;
        }
        List<Integer> list2 = this.i;
        if (((float) list2.get(list2.size() - 1).intValue()) >= this.f18706e / ((float) this.f18705d)) {
            this.f18709h.add(Integer.valueOf(KotlinVersion.MAX_COMPONENT_VALUE));
            this.i.add(0);
        }
        if (this.i.size() >= 3) {
            this.i.remove(0);
            this.f18709h.remove(0);
        }
        this.j.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        this.j.setColor(this.f18703b);
        canvas.drawCircle(this.l, this.m, this.f18704c, this.k);
        if (this.f18708g) {
            invalidate();
        }
    }

    public void a() {
        this.f18708g = true;
        invalidate();
    }

    public void b() {
        this.f18708g = false;
        this.i.clear();
        this.f18709h.clear();
        this.f18709h.add(Integer.valueOf(KotlinVersion.MAX_COMPONENT_VALUE));
        this.i.add(0);
        invalidate();
    }

    public void setColor(int i2) {
        this.f18702a = i2;
    }

    public void setCoreColor(int i2) {
        this.f18703b = i2;
    }

    public void setCoreRadius(int i2) {
        this.f18704c = (float) i2;
    }

    public void setDiffuseWidth(int i2) {
        this.f18705d = i2;
    }

    public void setMaxWidth(int i2) {
        this.f18706e = (float) i2;
    }

    public void setDiffuseSpeed(int i2) {
        this.f18707f = i2;
    }
}
