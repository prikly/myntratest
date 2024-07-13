package com.explorestack.iab.utils;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.explorestack.iab.mraid.MraidLog;
import com.explorestack.iab.mraid.g;

public class m {
    public static final String o = "m";

    /* renamed from: a  reason: collision with root package name */
    public final Rect f3126a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f3127b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f3128c;

    /* renamed from: d  reason: collision with root package name */
    public final View f3129d;

    /* renamed from: e  reason: collision with root package name */
    public final d f3130e;

    /* renamed from: f  reason: collision with root package name */
    public final float f3131f;

    /* renamed from: g  reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f3132g;

    /* renamed from: h  reason: collision with root package name */
    public View.OnAttachStateChangeListener f3133h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final Runnable n;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            m.this.a();
            boolean unused = m.this.k = false;
        }
    }

    public class b implements ViewTreeObserver.OnPreDrawListener {
        public b() {
        }

        public boolean onPreDraw() {
            m.this.d();
            return true;
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        public void onViewAttachedToWindow(View view) {
            m.this.a();
        }

        public void onViewDetachedFromWindow(View view) {
            m.this.a();
        }
    }

    public interface d {
        void a(boolean z);
    }

    public m(Context context, View view, d dVar) {
        this(context, view, dVar, 0.1f);
    }

    public m(Context context, View view, d dVar, float f2) {
        this.f3126a = new Rect();
        this.f3127b = new Rect();
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = new a();
        this.f3128c = context;
        this.f3129d = view;
        this.f3130e = dVar;
        this.f3131f = f2;
    }

    public final void a() {
        try {
            if (this.f3129d.getVisibility() != 0) {
                a(this.f3129d, "Visibility != View.VISIBLE");
            } else if (this.f3129d.getParent() == null) {
                a(this.f3129d, "No parent");
            } else if (!this.f3129d.getGlobalVisibleRect(this.f3126a)) {
                a(this.f3129d, "Can't get global visible rect");
            } else if (Utils.isViewTransparent(this.f3129d)) {
                a(this.f3129d, "View is transparent (alpha = 0)");
            } else {
                float width = (float) (this.f3129d.getWidth() * this.f3129d.getHeight());
                if (width <= 0.0f) {
                    a(this.f3129d, "Ad View width or height is zero, show wasn't tracked");
                    return;
                }
                float width2 = ((float) (this.f3126a.width() * this.f3126a.height())) / width;
                if (width2 < this.f3131f) {
                    View view = this.f3129d;
                    a(view, "Ad View is not completely visible (" + width2 + "), show wasn't tracked");
                    return;
                }
                View a2 = g.a(this.f3128c, this.f3129d);
                if (a2 == null) {
                    a(this.f3129d, "Can't obtain root view");
                    return;
                }
                a2.getGlobalVisibleRect(this.f3127b);
                if (!Rect.intersects(this.f3126a, this.f3127b)) {
                    a(this.f3129d, "Ad View is out of current window, show wasn't tracked");
                    return;
                }
                a(this.f3129d);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a(View view) {
        this.j = false;
        a(true);
    }

    public final void a(View view, String str) {
        if (!this.j) {
            this.j = true;
            MraidLog.d(o, str);
        }
        a(false);
    }

    public final void a(boolean z) {
        if (this.i != z) {
            this.i = z;
            this.f3130e.a(z);
        }
    }

    public boolean b() {
        return this.i;
    }

    public void c() {
        this.m = true;
        this.l = false;
        this.k = false;
        this.f3129d.getViewTreeObserver().removeOnPreDrawListener(this.f3132g);
        this.f3129d.removeOnAttachStateChangeListener(this.f3133h);
        Utils.cancelOnUiThread(this.n);
    }

    public final void d() {
        if (!this.k) {
            this.k = true;
            Utils.onUiThread(this.n, 100);
        }
    }

    public void e() {
        if (!this.m && !this.l) {
            this.l = true;
            if (this.f3132g == null) {
                this.f3132g = new b();
            }
            if (this.f3133h == null) {
                this.f3133h = new c();
            }
            this.f3129d.getViewTreeObserver().addOnPreDrawListener(this.f3132g);
            this.f3129d.addOnAttachStateChangeListener(this.f3133h);
            a();
        }
    }
}
