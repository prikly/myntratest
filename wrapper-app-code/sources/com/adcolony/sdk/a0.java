package com.adcolony.sdk;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.onesignal.outcomes.OSOutcomeConstants;
import io.bidmachine.utils.IabUtils;
import java.io.File;
import kotlin.KotlinVersion;

class a0 extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    private int f9877a;

    /* renamed from: b  reason: collision with root package name */
    private int f9878b;

    /* renamed from: c  reason: collision with root package name */
    private int f9879c;

    /* renamed from: d  reason: collision with root package name */
    private int f9880d;

    /* renamed from: e  reason: collision with root package name */
    private int f9881e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9882f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9883g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9884h;
    private String i;
    private String j;
    private h0 k;
    private c l;

    class a implements j0 {
        a() {
        }

        public void a(h0 h0Var) {
            if (a0.this.a(h0Var)) {
                a0.this.d(h0Var);
            }
        }
    }

    class b implements j0 {
        b() {
        }

        public void a(h0 h0Var) {
            if (a0.this.a(h0Var)) {
                a0.this.b(h0Var);
            }
        }
    }

    class c implements j0 {
        c() {
        }

        public void a(h0 h0Var) {
            if (a0.this.a(h0Var)) {
                a0.this.c(h0Var);
            }
        }
    }

    a0(Context context, h0 h0Var, int i2, c cVar) {
        super(context);
        this.f9877a = i2;
        this.k = h0Var;
        this.l = cVar;
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
        c0.b(b3, "view_id", this.f9877a);
        c0.a(b3, "ad_session_id", this.j);
        c0.b(b3, "container_x", this.f9878b + x);
        c0.b(b3, "container_y", this.f9879c + y);
        c0.b(b3, "view_x", x);
        c0.b(b3, "view_y", y);
        c0.b(b3, OSOutcomeConstants.OUTCOME_ID, this.l.getId());
        if (action != 0) {
            int i2 = y;
            if (action == 1) {
                if (!this.l.p()) {
                    b2.a(c2.d().get(this.j));
                }
                if (x <= 0 || x >= this.f9880d || i2 <= 0 || i2 >= this.f9881e) {
                    new h0("AdContainer.on_touch_cancelled", this.l.k(), b3).c();
                    return true;
                }
                new h0("AdContainer.on_touch_ended", this.l.k(), b3).c();
                return true;
            } else if (action == 2) {
                new h0("AdContainer.on_touch_moved", this.l.k(), b3).c();
                return true;
            } else if (action == 3) {
                new h0("AdContainer.on_touch_cancelled", this.l.k(), b3).c();
                return true;
            } else if (action == 5) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                c0.b(b3, "container_x", ((int) motionEvent2.getX(action2)) + this.f9878b);
                c0.b(b3, "container_y", ((int) motionEvent2.getY(action2)) + this.f9879c);
                c0.b(b3, "view_x", (int) motionEvent2.getX(action2));
                c0.b(b3, "view_y", (int) motionEvent2.getY(action2));
                new h0("AdContainer.on_touch_began", this.l.k(), b3).c();
                return true;
            } else if (action != 6) {
                return true;
            } else {
                int action3 = (motionEvent.getAction() & 65280) >> 8;
                int x2 = (int) motionEvent2.getX(action3);
                int y2 = (int) motionEvent2.getY(action3);
                c0.b(b3, "container_x", ((int) motionEvent2.getX(action3)) + this.f9878b);
                c0.b(b3, "container_y", ((int) motionEvent2.getY(action3)) + this.f9879c);
                c0.b(b3, "view_x", (int) motionEvent2.getX(action3));
                c0.b(b3, "view_y", (int) motionEvent2.getY(action3));
                if (!this.l.p()) {
                    b2.a(c2.d().get(this.j));
                }
                if (x2 <= 0 || x2 >= this.f9880d || y2 <= 0 || y2 >= this.f9881e) {
                    new h0("AdContainer.on_touch_cancelled", this.l.k(), b3).c();
                    return true;
                }
                new h0("AdContainer.on_touch_ended", this.l.k(), b3).c();
                return true;
            }
        } else {
            new h0("AdContainer.on_touch_began", this.l.k(), b3).c();
            return true;
        }
    }

    /* access modifiers changed from: private */
    public boolean a(h0 h0Var) {
        f1 a2 = h0Var.a();
        return c0.d(a2, OSOutcomeConstants.OUTCOME_ID) == this.f9877a && c0.d(a2, "container_id") == this.l.c() && c0.h(a2, "ad_session_id").equals(this.l.a());
    }

    /* access modifiers changed from: private */
    public void b(h0 h0Var) {
        f1 a2 = h0Var.a();
        this.f9878b = c0.d(a2, "x");
        this.f9879c = c0.d(a2, "y");
        this.f9880d = c0.d(a2, IabUtils.KEY_WIDTH);
        this.f9881e = c0.d(a2, IabUtils.KEY_HEIGHT);
        if (this.f9882f) {
            float s = (((float) this.f9881e) * a.b().n().s()) / ((float) getDrawable().getIntrinsicHeight());
            this.f9881e = (int) (((float) getDrawable().getIntrinsicHeight()) * s);
            int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) * s);
            this.f9880d = intrinsicWidth;
            this.f9878b -= intrinsicWidth;
            this.f9879c -= this.f9881e;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f9878b, this.f9879c, 0, 0);
        layoutParams.width = this.f9880d;
        layoutParams.height = this.f9881e;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    public void c(h0 h0Var) {
        this.i = c0.h(h0Var.a(), "filepath");
        setImageURI(Uri.fromFile(new File(this.i)));
    }

    /* access modifiers changed from: private */
    public void d(h0 h0Var) {
        if (c0.b(h0Var.a(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        FrameLayout.LayoutParams layoutParams;
        int i2;
        f1 a2 = this.k.a();
        this.j = c0.h(a2, "ad_session_id");
        this.f9878b = c0.d(a2, "x");
        this.f9879c = c0.d(a2, "y");
        this.f9880d = c0.d(a2, IabUtils.KEY_WIDTH);
        this.f9881e = c0.d(a2, IabUtils.KEY_HEIGHT);
        this.i = c0.h(a2, "filepath");
        this.f9882f = c0.b(a2, "dpi");
        this.f9883g = c0.b(a2, "invert_y");
        this.f9884h = c0.b(a2, "wrap_content");
        setImageURI(Uri.fromFile(new File(this.i)));
        if (this.f9882f) {
            float s = (((float) this.f9881e) * a.b().n().s()) / ((float) getDrawable().getIntrinsicHeight());
            this.f9881e = (int) (((float) getDrawable().getIntrinsicHeight()) * s);
            int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) * s);
            this.f9880d = intrinsicWidth;
            this.f9878b -= intrinsicWidth;
            if (this.f9883g) {
                i2 = this.f9879c + this.f9881e;
            } else {
                i2 = this.f9879c - this.f9881e;
            }
            this.f9879c = i2;
        }
        setVisibility(4);
        if (this.f9884h) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f9880d, this.f9881e);
        }
        layoutParams.setMargins(this.f9878b, this.f9879c, 0, 0);
        layoutParams.gravity = 0;
        this.l.addView(this, layoutParams);
        this.l.i().add(a.a("ImageView.set_visible", (j0) new a(), true));
        this.l.i().add(a.a("ImageView.set_bounds", (j0) new b(), true));
        this.l.i().add(a.a("ImageView.set_image", (j0) new c(), true));
        this.l.j().add("ImageView.set_visible");
        this.l.j().add("ImageView.set_bounds");
        this.l.j().add("ImageView.set_image");
    }
}
