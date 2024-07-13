package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.onesignal.outcomes.OSOutcomeConstants;
import io.bidmachine.utils.IabUtils;
import kotlin.KotlinVersion;

class u extends EditText {

    /* renamed from: a  reason: collision with root package name */
    private int f10309a;

    /* renamed from: b  reason: collision with root package name */
    private int f10310b;

    /* renamed from: c  reason: collision with root package name */
    private int f10311c;

    /* renamed from: d  reason: collision with root package name */
    private int f10312d;

    /* renamed from: e  reason: collision with root package name */
    private int f10313e;

    /* renamed from: f  reason: collision with root package name */
    private int f10314f;

    /* renamed from: g  reason: collision with root package name */
    private int f10315g;

    /* renamed from: h  reason: collision with root package name */
    private int f10316h;
    private int i;
    private int j;
    private String k;
    private String l;
    private String m;
    private String n;
    private c o;
    private h0 p;

    class a implements j0 {
        a() {
        }

        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.a(h0Var);
            }
        }
    }

    class b implements j0 {
        b() {
        }

        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.k(h0Var);
            }
        }
    }

    class c implements j0 {
        c() {
        }

        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.e(h0Var);
            }
        }
    }

    class d implements j0 {
        d() {
        }

        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.f(h0Var);
            }
        }
    }

    class e implements j0 {
        e() {
        }

        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.d(h0Var);
            }
        }
    }

    class f implements j0 {
        f() {
        }

        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.j(h0Var);
            }
        }
    }

    class g implements j0 {
        g() {
        }

        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.g(h0Var);
            }
        }
    }

    class h implements j0 {
        h() {
        }

        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.h(h0Var);
            }
        }
    }

    class i implements j0 {
        i() {
        }

        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.b(h0Var);
            }
        }
    }

    class j implements j0 {
        j() {
        }

        public void a(h0 h0Var) {
            if (u.this.c(h0Var)) {
                u.this.i(h0Var);
            }
        }
    }

    u(Context context, h0 h0Var, int i2, c cVar) {
        super(context);
        this.f10309a = i2;
        this.p = h0Var;
        this.o = cVar;
    }

    /* access modifiers changed from: package-private */
    public int a(boolean z, int i2) {
        if (i2 == 0) {
            return z ? 1 : 16;
        }
        if (i2 == 1) {
            return z ? 8388611 : 48;
        }
        if (i2 != 2) {
            return 17;
        }
        return z ? 8388613 : 80;
    }

    /* access modifiers changed from: package-private */
    public void a(h0 h0Var) {
        f1 a2 = h0Var.a();
        this.i = c0.d(a2, "x");
        this.j = c0.d(a2, "y");
        setGravity(a(true, this.i) | a(false, this.j));
    }

    /* access modifiers changed from: package-private */
    public void b(h0 h0Var) {
        f1 b2 = c0.b();
        c0.a(b2, "text", getText().toString());
        h0Var.a(b2).c();
    }

    /* access modifiers changed from: package-private */
    public boolean c(h0 h0Var) {
        f1 a2 = h0Var.a();
        return c0.d(a2, OSOutcomeConstants.OUTCOME_ID) == this.f10309a && c0.d(a2, "container_id") == this.o.c() && c0.h(a2, "ad_session_id").equals(this.o.a());
    }

    /* access modifiers changed from: package-private */
    public void d(h0 h0Var) {
        String h2 = c0.h(h0Var.a(), "background_color");
        this.l = h2;
        setBackgroundColor(z0.f(h2));
    }

    /* access modifiers changed from: package-private */
    public void e(h0 h0Var) {
        f1 a2 = h0Var.a();
        this.f10310b = c0.d(a2, "x");
        this.f10311c = c0.d(a2, "y");
        this.f10312d = c0.d(a2, IabUtils.KEY_WIDTH);
        this.f10313e = c0.d(a2, IabUtils.KEY_HEIGHT);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f10310b, this.f10311c, 0, 0);
        layoutParams.width = this.f10312d;
        layoutParams.height = this.f10313e;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void f(h0 h0Var) {
        String h2 = c0.h(h0Var.a(), "font_color");
        this.m = h2;
        setTextColor(z0.f(h2));
    }

    /* access modifiers changed from: package-private */
    public void g(h0 h0Var) {
        int d2 = c0.d(h0Var.a(), "font_size");
        this.f10316h = d2;
        setTextSize((float) d2);
    }

    /* access modifiers changed from: package-private */
    public void h(h0 h0Var) {
        int d2 = c0.d(h0Var.a(), "font_style");
        this.f10314f = d2;
        if (d2 == 0) {
            setTypeface(getTypeface(), 0);
        } else if (d2 == 1) {
            setTypeface(getTypeface(), 1);
        } else if (d2 == 2) {
            setTypeface(getTypeface(), 2);
        } else if (d2 == 3) {
            setTypeface(getTypeface(), 3);
        }
    }

    /* access modifiers changed from: package-private */
    public void i(h0 h0Var) {
        String h2 = c0.h(h0Var.a(), "text");
        this.n = h2;
        setText(h2);
    }

    /* access modifiers changed from: package-private */
    public void j(h0 h0Var) {
        int d2 = c0.d(h0Var.a(), "font_family");
        this.f10315g = d2;
        if (d2 == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (d2 == 1) {
            setTypeface(Typeface.SERIF);
        } else if (d2 == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (d2 == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
    }

    /* access modifiers changed from: package-private */
    public void k(h0 h0Var) {
        if (c0.b(h0Var.a(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        k b2 = a.b();
        d c2 = b2.c();
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        f1 b3 = c0.b();
        c0.b(b3, "view_id", this.f10309a);
        c0.a(b3, "ad_session_id", this.k);
        c0.b(b3, "container_x", this.f10310b + x);
        c0.b(b3, "container_y", this.f10311c + y);
        c0.b(b3, "view_x", x);
        c0.b(b3, "view_y", y);
        c0.b(b3, OSOutcomeConstants.OUTCOME_ID, this.o.c());
        if (action == 0) {
            new h0("AdContainer.on_touch_began", this.o.k(), b3).c();
        } else if (action == 1) {
            if (!this.o.p()) {
                b2.a(c2.d().get(this.k));
            }
            new h0("AdContainer.on_touch_ended", this.o.k(), b3).c();
        } else if (action == 2) {
            new h0("AdContainer.on_touch_moved", this.o.k(), b3).c();
        } else if (action == 3) {
            new h0("AdContainer.on_touch_cancelled", this.o.k(), b3).c();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            c0.b(b3, "container_x", ((int) motionEvent2.getX(action2)) + this.f10310b);
            c0.b(b3, "container_y", ((int) motionEvent2.getY(action2)) + this.f10311c);
            c0.b(b3, "view_x", (int) motionEvent2.getX(action2));
            c0.b(b3, "view_y", (int) motionEvent2.getY(action2));
            new h0("AdContainer.on_touch_began", this.o.k(), b3).c();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & 65280) >> 8;
            c0.b(b3, "container_x", ((int) motionEvent2.getX(action3)) + this.f10310b);
            c0.b(b3, "container_y", ((int) motionEvent2.getY(action3)) + this.f10311c);
            c0.b(b3, "view_x", (int) motionEvent2.getX(action3));
            c0.b(b3, "view_y", (int) motionEvent2.getY(action3));
            if (!this.o.p()) {
                b2.a(c2.d().get(this.k));
            }
            new h0("AdContainer.on_touch_ended", this.o.k(), b3).c();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        f1 a2 = this.p.a();
        this.k = c0.h(a2, "ad_session_id");
        this.f10310b = c0.d(a2, "x");
        this.f10311c = c0.d(a2, "y");
        this.f10312d = c0.d(a2, IabUtils.KEY_WIDTH);
        this.f10313e = c0.d(a2, IabUtils.KEY_HEIGHT);
        this.f10315g = c0.d(a2, "font_family");
        this.f10314f = c0.d(a2, "font_style");
        this.f10316h = c0.d(a2, "font_size");
        this.l = c0.h(a2, "background_color");
        this.m = c0.h(a2, "font_color");
        this.n = c0.h(a2, "text");
        this.i = c0.d(a2, "align_x");
        this.j = c0.d(a2, "align_y");
        setVisibility(4);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f10312d, this.f10313e);
        layoutParams.setMargins(this.f10310b, this.f10311c, 0, 0);
        layoutParams.gravity = 0;
        this.o.addView(this, layoutParams);
        int i2 = this.f10315g;
        if (i2 == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (i2 == 1) {
            setTypeface(Typeface.SERIF);
        } else if (i2 == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (i2 == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
        int i3 = this.f10314f;
        if (i3 == 0) {
            setTypeface(getTypeface(), 0);
        } else if (i3 == 1) {
            setTypeface(getTypeface(), 1);
        } else if (i3 == 2) {
            setTypeface(getTypeface(), 2);
        } else if (i3 == 3) {
            setTypeface(getTypeface(), 3);
        }
        setText(this.n);
        setTextSize((float) this.f10316h);
        setGravity(a(true, this.i) | a(false, this.j));
        if (!this.l.equals("")) {
            setBackgroundColor(z0.f(this.l));
        }
        if (!this.m.equals("")) {
            setTextColor(z0.f(this.m));
        }
        this.o.i().add(a.a("TextView.set_visible", (j0) new b(), true));
        this.o.i().add(a.a("TextView.set_bounds", (j0) new c(), true));
        this.o.i().add(a.a("TextView.set_font_color", (j0) new d(), true));
        this.o.i().add(a.a("TextView.set_background_color", (j0) new e(), true));
        this.o.i().add(a.a("TextView.set_typeface", (j0) new f(), true));
        this.o.i().add(a.a("TextView.set_font_size", (j0) new g(), true));
        this.o.i().add(a.a("TextView.set_font_style", (j0) new h(), true));
        this.o.i().add(a.a("TextView.get_text", (j0) new i(), true));
        this.o.i().add(a.a("TextView.set_text", (j0) new j(), true));
        this.o.i().add(a.a("TextView.align", (j0) new a(), true));
        this.o.j().add("TextView.set_visible");
        this.o.j().add("TextView.set_bounds");
        this.o.j().add("TextView.set_font_color");
        this.o.j().add("TextView.set_background_color");
        this.o.j().add("TextView.set_typeface");
        this.o.j().add("TextView.set_font_size");
        this.o.j().add("TextView.set_font_style");
        this.o.j().add("TextView.get_text");
        this.o.j().add("TextView.set_text");
        this.o.j().add("TextView.align");
    }
}
