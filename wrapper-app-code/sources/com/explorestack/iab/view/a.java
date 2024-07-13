package com.explorestack.iab.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.explorestack.iab.utils.IabElementStyle;
import com.explorestack.iab.utils.e;

public class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final c f3336a = new c((C0038a) null);

    /* renamed from: b  reason: collision with root package name */
    public com.explorestack.iab.utils.d f3337b;

    /* renamed from: c  reason: collision with root package name */
    public e f3338c;

    /* renamed from: d  reason: collision with root package name */
    public b f3339d;

    /* renamed from: e  reason: collision with root package name */
    public d f3340e;

    /* renamed from: f  reason: collision with root package name */
    public IabElementStyle f3341f;

    /* renamed from: g  reason: collision with root package name */
    public IabElementStyle f3342g;

    /* renamed from: com.explorestack.iab.view.a$a  reason: collision with other inner class name */
    public class C0038a implements View.OnClickListener {
        public C0038a() {
        }

        public void onClick(View view) {
            if (a.this.f3340e != null) {
                a.this.f3340e.onCloseClick();
            }
        }
    }

    public class b implements Runnable {
        private b() {
        }

        public /* synthetic */ b(a aVar, C0038a aVar2) {
            this();
        }

        public void run() {
            if (a.this.f3338c != null) {
                long c2 = a.this.f3336a.f3348d;
                if (a.this.isShown()) {
                    c2 += 50;
                    a.this.f3336a.a(c2);
                    a.this.f3338c.a((int) ((100 * c2) / a.this.f3336a.f3347c), (int) Math.ceil(((double) (a.this.f3336a.f3347c - c2)) / 1000.0d));
                }
                int i = (c2 > a.this.f3336a.f3347c ? 1 : (c2 == a.this.f3336a.f3347c ? 0 : -1));
                a aVar = a.this;
                if (i >= 0) {
                    aVar.c();
                    if (a.this.f3336a.f3346b > 0.0f && a.this.f3340e != null) {
                        a.this.f3340e.onCountDownFinish();
                        return;
                    }
                    return;
                }
                aVar.postDelayed(this, 50);
            }
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3345a;

        /* renamed from: b  reason: collision with root package name */
        public float f3346b;

        /* renamed from: c  reason: collision with root package name */
        public long f3347c;

        /* renamed from: d  reason: collision with root package name */
        public long f3348d;

        /* renamed from: e  reason: collision with root package name */
        public long f3349e;

        /* renamed from: f  reason: collision with root package name */
        public long f3350f;

        private c() {
            this.f3345a = false;
            this.f3346b = 0.0f;
            this.f3347c = 0;
            this.f3348d = 0;
            this.f3349e = 0;
            this.f3350f = 0;
        }

        public /* synthetic */ c(C0038a aVar) {
            this();
        }

        public void a(long j) {
            this.f3348d = j;
        }

        public final void a(boolean z) {
            if (this.f3349e > 0) {
                this.f3350f += System.currentTimeMillis() - this.f3349e;
            }
            if (z) {
                this.f3349e = System.currentTimeMillis();
            } else {
                this.f3349e = 0;
            }
        }

        public void a(boolean z, float f2) {
            this.f3345a = z;
            this.f3346b = f2;
            this.f3347c = (long) (f2 * 1000.0f);
            this.f3348d = 0;
        }

        public boolean a() {
            long j = this.f3347c;
            return j == 0 || this.f3348d >= j;
        }

        public long b() {
            return this.f3349e > 0 ? System.currentTimeMillis() - this.f3349e : this.f3350f;
        }

        public boolean c() {
            long j = this.f3347c;
            return j != 0 && this.f3348d < j;
        }

        public boolean d() {
            return this.f3345a;
        }
    }

    public interface d {
        void onCloseClick();

        void onCountDownFinish();
    }

    public a(Context context) {
        super(context);
    }

    public final void a() {
        if (isShown()) {
            b();
            b bVar = new b(this, (C0038a) null);
            this.f3339d = bVar;
            postDelayed(bVar, 50);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        com.explorestack.iab.utils.d dVar = this.f3337b;
        if (dVar != null) {
            dVar.a();
        }
        e eVar = this.f3338c;
        if (eVar != null) {
            eVar.a();
        }
    }

    public final void b() {
        b bVar = this.f3339d;
        if (bVar != null) {
            removeCallbacks(bVar);
            this.f3339d = null;
        }
    }

    public final void c() {
        if (this.f3336a.c()) {
            com.explorestack.iab.utils.d dVar = this.f3337b;
            if (dVar != null) {
                dVar.c();
            }
            if (this.f3338c == null) {
                this.f3338c = new e((View.OnClickListener) null);
            }
            this.f3338c.a(getContext(), (ViewGroup) this, this.f3342g);
            a();
            return;
        }
        b();
        if (this.f3337b == null) {
            this.f3337b = new com.explorestack.iab.utils.d(new C0038a());
        }
        this.f3337b.a(getContext(), (ViewGroup) this, this.f3341f);
        e eVar = this.f3338c;
        if (eVar != null) {
            eVar.c();
        }
    }

    public boolean canBeClosed() {
        return this.f3336a.a();
    }

    public long getOnScreenTimeMs() {
        return this.f3336a.b();
    }

    public boolean isVisible() {
        return this.f3336a.d();
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            b();
        } else if (this.f3336a.c() && this.f3336a.d()) {
            a();
        }
        this.f3336a.a(i == 0);
    }

    public void setCloseClickListener(d dVar) {
        this.f3340e = dVar;
    }

    public void setCloseStyle(IabElementStyle iabElementStyle) {
        this.f3341f = iabElementStyle;
        com.explorestack.iab.utils.d dVar = this.f3337b;
        if (dVar != null && dVar.e()) {
            this.f3337b.a(getContext(), (ViewGroup) this, iabElementStyle);
        }
    }

    public void setCloseVisibility(boolean z, float f2) {
        if (this.f3336a.f3345a != z || this.f3336a.f3346b != f2) {
            this.f3336a.a(z, f2);
            if (!z) {
                com.explorestack.iab.utils.d dVar = this.f3337b;
                if (dVar != null) {
                    dVar.c();
                }
                e eVar = this.f3338c;
                if (eVar != null) {
                    eVar.c();
                }
                b();
                return;
            }
            c();
        }
    }

    public void setCountDownStyle(IabElementStyle iabElementStyle) {
        this.f3342g = iabElementStyle;
        e eVar = this.f3338c;
        if (eVar != null && eVar.e()) {
            this.f3338c.a(getContext(), (ViewGroup) this, iabElementStyle);
        }
    }
}
