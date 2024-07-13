package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.a;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.e;
import com.bytedance.sdk.component.adexpress.dynamic.b.f;
import com.bytedance.sdk.component.adexpress.dynamic.b.g;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.utils.t;
import java.util.List;

public abstract class DynamicBaseWidget extends FrameLayout implements b, b, c {

    /* renamed from: a  reason: collision with root package name */
    private float f18586a;

    /* renamed from: b  reason: collision with root package name */
    private float f18587b;

    /* renamed from: c  reason: collision with root package name */
    protected float f18588c;

    /* renamed from: d  reason: collision with root package name */
    protected float f18589d;

    /* renamed from: e  reason: collision with root package name */
    protected float f18590e;

    /* renamed from: f  reason: collision with root package name */
    protected float f18591f;

    /* renamed from: g  reason: collision with root package name */
    protected int f18592g = ((int) com.bytedance.sdk.component.adexpress.c.b.a(this.k, this.f18590e));

    /* renamed from: h  reason: collision with root package name */
    protected int f18593h = ((int) com.bytedance.sdk.component.adexpress.c.b.a(this.k, this.f18591f));
    protected int i = ((int) com.bytedance.sdk.component.adexpress.c.b.a(this.k, this.f18588c));
    protected int j = ((int) com.bytedance.sdk.component.adexpress.c.b.a(this.k, this.f18589d));
    protected Context k;
    protected g l;
    protected h m;
    protected DynamicRootView n;
    protected View o;
    protected boolean p;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.a.b q;
    a r;
    private float s;

    public float getShineValue() {
        return this.f18587b;
    }

    public void setShineValue(float f2) {
        this.f18587b = f2;
        postInvalidate();
    }

    public float getRippleValue() {
        return this.f18586a;
    }

    public void setRippleValue(float f2) {
        this.f18586a = f2;
        postInvalidate();
    }

    public float getMarqueeValue() {
        return this.s;
    }

    public void setMarqueeValue(float f2) {
        this.s = f2;
        postInvalidate();
    }

    public DynamicBaseWidget(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context);
        this.k = context;
        this.n = dynamicRootView;
        this.m = hVar;
        this.f18588c = hVar.e();
        this.f18589d = hVar.f();
        this.f18590e = hVar.g();
        this.f18591f = hVar.h();
        g gVar = new g(hVar.i());
        this.l = gVar;
        if (gVar.r() > 0) {
            this.f18592g += this.l.r() * 2;
            this.f18593h += this.l.r() * 2;
            this.i -= this.l.r();
            this.j -= this.l.r();
            List<h> j2 = hVar.j();
            if (j2 != null) {
                for (h next : j2) {
                    next.c(next.e() + ((float) com.bytedance.sdk.component.adexpress.c.b.b(this.k, (float) this.l.r())));
                    next.d(next.f() + ((float) com.bytedance.sdk.component.adexpress.c.b.b(this.k, (float) this.l.r())));
                    next.a((float) com.bytedance.sdk.component.adexpress.c.b.b(this.k, (float) this.l.r()));
                    next.b((float) com.bytedance.sdk.component.adexpress.c.b.b(this.k, (float) this.l.r()));
                }
            }
        }
        this.p = this.l.n() > 0.0d;
        this.r = new a();
    }

    public void setShouldInvisible(boolean z) {
        this.p = z;
    }

    public boolean getBeginInvisibleAndShow() {
        return this.p;
    }

    public boolean c() {
        h();
        f();
        d();
        return true;
    }

    public void a(int i2) {
        g gVar = this.l;
        if (gVar != null && gVar.a(i2)) {
            h();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != null && (getChildAt(i3) instanceof DynamicBaseWidget)) {
                    ((DynamicBaseWidget) childAt).a(i2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        if (!e()) {
            return true;
        }
        View view = this.o;
        if (view == null) {
            view = this;
        }
        view.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        view.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        view.setTag(t.e(getContext(), "tt_id_click_tag"), this.l.z());
        view.setTag(t.e(getContext(), "tt_id_click_area_type"), this.m.i().b());
        a(view);
        return true;
    }

    /* access modifiers changed from: protected */
    public void a(View view) {
        f e2;
        h hVar = this.m;
        if (hVar != null && (e2 = hVar.i().e()) != null) {
            view.setTag(t.e(getContext(), "tt_id_open_landing_page"), Boolean.valueOf(e2.ak()));
        }
    }

    public boolean e() {
        g gVar = this.l;
        return (gVar == null || gVar.v() == 0) ? false : true;
    }

    public void f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f18592g, this.f18593h);
        layoutParams.topMargin = this.j;
        layoutParams.leftMargin = this.i;
        setLayoutParams(layoutParams);
    }

    public int getClickArea() {
        return this.l.v();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.d.a getDynamicClickListener() {
        return this.n.getDynamicClickListener();
    }

    /* access modifiers changed from: protected */
    public Drawable getBackgroundDrawable() {
        return a(false, "");
    }

    /* access modifiers changed from: protected */
    public Drawable a(boolean z, String str) {
        int i2;
        if (!TextUtils.isEmpty(this.l.y())) {
            try {
                String y = this.l.y();
                String[] split = y.substring(y.indexOf("(") + 1, y.length() - 1).split(", ");
                GradientDrawable a2 = a(a(split[0]), new int[]{g.a(split[1].substring(0, 7)), g.a(split[2].substring(0, 7))});
                a2.setShape(0);
                a2.setCornerRadius(com.bytedance.sdk.component.adexpress.c.b.a(this.k, this.l.o()));
                return a2;
            } catch (Exception unused) {
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        drawable.setCornerRadius(com.bytedance.sdk.component.adexpress.c.b.a(this.k, this.l.o()));
        if (z) {
            i2 = Color.parseColor(str);
        } else {
            i2 = this.l.w();
        }
        drawable.setColor(i2);
        if (this.l.q() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.c.b.a(this.k, this.l.q()), this.l.p());
        } else if (this.l.r() > 0) {
            drawable.setStroke(this.l.r(), this.l.p());
            drawable.setAlpha(50);
        }
        return drawable;
    }

    /* access modifiers changed from: protected */
    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    /* access modifiers changed from: protected */
    public GradientDrawable a(GradientDrawable.Orientation orientation, int[] iArr) {
        return new GradientDrawable(orientation, iArr);
    }

    /* access modifiers changed from: protected */
    public GradientDrawable.Orientation a(String str) {
        try {
            int parseInt = Integer.parseInt(str.substring(0, str.length() - 3));
            if (parseInt <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (parseInt <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (parseInt <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.r.a(canvas, (b) this, (View) this);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        a aVar = this.r;
        View view = this.o;
        if (view == null) {
            view = this;
        }
        aVar.a(view, i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        b();
        super.onDetachedFromWindow();
    }

    public void g() {
        if (!a()) {
            View view = this.o;
            if (view == null) {
                view = this;
            }
            com.bytedance.sdk.component.adexpress.dynamic.animation.a.b bVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.a.b(view, this.m.i().e().ac());
            this.q = bVar;
            bVar.a();
        }
    }

    public void b() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.a.b bVar = this.q;
        if (bVar != null) {
            bVar.b();
        }
    }

    private boolean a() {
        h hVar = this.m;
        return hVar == null || hVar.i() == null || this.m.i().e() == null || this.m.i().e().ac() == null;
    }

    public int getDynamicWidth() {
        return this.f18592g;
    }

    public int getDynamicHeight() {
        return this.f18593h;
    }

    public f getDynamicLayoutBrickValue() {
        e i2;
        h hVar = this.m;
        if (hVar == null || (i2 = hVar.i()) == null) {
            return null;
        }
        return i2.e();
    }
}
