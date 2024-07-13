package com.explorestack.iab.utils;

import android.view.View;
import android.view.ViewTreeObserver;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public final View f3116a;

    /* renamed from: b  reason: collision with root package name */
    public final c f3117b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3118c = false;

    /* renamed from: d  reason: collision with root package name */
    public float f3119d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public long f3120e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f3121f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f3122g;

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f3123h;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            l.this.c();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            long b2 = l.this.f3121f;
            if (l.this.f3116a.isShown()) {
                b2 = Math.min(l.this.f3120e, b2 + 16);
                l.this.a(b2);
                l.this.f3117b.a((((float) l.this.f3121f) * 100.0f) / ((float) l.this.f3120e), l.this.f3121f, l.this.f3120e);
            }
            int i = (b2 > l.this.f3120e ? 1 : (b2 == l.this.f3120e ? 0 : -1));
            l lVar = l.this;
            if (i >= 0) {
                lVar.f3117b.a();
            } else {
                lVar.f3116a.postDelayed(this, 16);
            }
        }
    }

    public interface c {
        void a();

        void a(float f2, long j, long j2);
    }

    public l(View view, c cVar) {
        a aVar = new a();
        this.f3122g = aVar;
        this.f3123h = new b();
        this.f3116a = view;
        this.f3117b = cVar;
        view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
        c();
    }

    public void a() {
        e();
        this.f3116a.getViewTreeObserver().removeGlobalOnLayoutListener(this.f3122g);
    }

    public void a(float f2) {
        if (this.f3119d != f2) {
            this.f3119d = f2;
            this.f3120e = (long) (f2 * 1000.0f);
            d();
        }
    }

    public final void a(long j) {
        this.f3121f = j;
    }

    public boolean b() {
        long j = this.f3120e;
        return j != 0 && this.f3121f < j;
    }

    public final void c() {
        boolean isShown = this.f3116a.isShown();
        if (this.f3118c != isShown) {
            this.f3118c = isShown;
            if (!isShown) {
                e();
            } else if (b()) {
                d();
            }
        }
    }

    public void d() {
        if (this.f3116a.isShown() && this.f3120e != 0) {
            this.f3116a.postDelayed(this.f3123h, 16);
        }
    }

    public void e() {
        this.f3116a.removeCallbacks(this.f3123h);
    }
}
