package com.explorestack.iab.mraid;

import android.content.Context;
import android.graphics.Rect;
import com.explorestack.iab.utils.Utils;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f2998a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public final Rect f2999b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final Rect f3000c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f3001d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f3002e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f3003f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final Rect f3004g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    public final Rect f3005h = new Rect();
    public final float i;

    public f(Context context) {
        this.i = context.getResources().getDisplayMetrics().density;
    }

    public Rect a() {
        return this.f3003f;
    }

    public void a(Rect rect, Rect rect2) {
        rect2.set(Utils.pixelsToIntDips((float) rect.left, this.i), Utils.pixelsToIntDips((float) rect.top, this.i), Utils.pixelsToIntDips((float) rect.right, this.i), Utils.pixelsToIntDips((float) rect.bottom, this.i));
    }

    public boolean a(int i2, int i3) {
        if (this.f2998a.width() == i2 && this.f2998a.height() == i3) {
            return false;
        }
        this.f2998a.set(0, 0, i2, i3);
        a(this.f2998a, this.f2999b);
        return true;
    }

    public boolean a(int i2, int i3, int i4, int i5) {
        return a(this.f3002e, this.f3003f, i2, i3, i4, i5);
    }

    public final boolean a(Rect rect, Rect rect2, int i2, int i3, int i4, int i5) {
        if (rect.left == i2 && rect.top == i3 && i2 + i4 == rect.right && i3 + i5 == rect.bottom) {
            return false;
        }
        rect.set(i2, i3, i4 + i2, i5 + i3);
        a(rect, rect2);
        return true;
    }

    public Rect b() {
        return this.f3004g;
    }

    public boolean b(int i2, int i3, int i4, int i5) {
        return a(this.f3004g, this.f3005h, i2, i3, i4, i5);
    }

    public Rect c() {
        return this.f3005h;
    }

    public boolean c(int i2, int i3, int i4, int i5) {
        return a(this.f3000c, this.f3001d, i2, i3, i4, i5);
    }

    public Rect d() {
        return this.f3001d;
    }

    public Rect e() {
        return this.f2999b;
    }
}
