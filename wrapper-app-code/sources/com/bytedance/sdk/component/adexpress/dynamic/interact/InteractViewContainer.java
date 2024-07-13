package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.b.g;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.interact.a.a;
import com.bytedance.sdk.component.adexpress.dynamic.interact.a.b;
import com.bytedance.sdk.component.adexpress.dynamic.interact.a.c;
import com.bytedance.sdk.component.adexpress.dynamic.interact.a.d;
import com.bytedance.sdk.component.adexpress.widget.CircleLongPressView;
import com.bytedance.sdk.component.adexpress.widget.RippleView;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;

public class InteractViewContainer extends FrameLayout implements c {

    /* renamed from: a  reason: collision with root package name */
    private Context f18628a;

    /* renamed from: b  reason: collision with root package name */
    private DynamicBaseWidget f18629b;

    /* renamed from: c  reason: collision with root package name */
    private g f18630c;

    /* renamed from: d  reason: collision with root package name */
    private View f18631d;

    /* renamed from: e  reason: collision with root package name */
    private b f18632e;

    /* renamed from: f  reason: collision with root package name */
    private String f18633f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public RippleView f18634g;

    /* renamed from: h  reason: collision with root package name */
    private View.OnTouchListener f18635h;
    private int i;
    private int j;
    private int k;

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, g gVar) {
        super(context);
        this.f18628a = context;
        this.f18629b = dynamicBaseWidget;
        this.f18630c = gVar;
        e();
    }

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, g gVar, int i2, int i3) {
        super(context);
        this.f18628a = context;
        this.f18629b = dynamicBaseWidget;
        this.f18630c = gVar;
        this.j = i2;
        this.k = i3;
        e();
    }

    private void e() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.f18633f = this.f18630c.D();
        this.i = this.f18630c.E();
        b a2 = d.a(this.f18628a, this.f18629b, this.f18630c, this.j, this.k);
        this.f18632e = a2;
        if (a2 != null) {
            this.f18631d = a2.d();
            if (TextUtils.equals(this.f18633f, "6")) {
                RippleView rippleView = new RippleView(this.f18628a);
                this.f18634g = rippleView;
                addView(rippleView, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() {
                    public void run() {
                        InteractViewContainer.this.f18634g.b();
                    }
                });
            }
            addView(this.f18632e.d());
            f();
            setVisibility(0);
        }
    }

    private void f() {
        if (this.f18631d != null) {
            String str = this.f18633f;
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 50) {
                switch (hashCode) {
                    case 53:
                        if (str.equals("5")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case 54:
                        if (str.equals("6")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 55:
                        if (str.equals("7")) {
                            c2 = 10;
                            break;
                        }
                        break;
                    case 56:
                        if (str.equals("8")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 57:
                        if (str.equals("9")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    default:
                        switch (hashCode) {
                            case 1568:
                                if (str.equals("11")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case 1569:
                                if (str.equals("12")) {
                                    c2 = 6;
                                    break;
                                }
                                break;
                            case 1570:
                                if (str.equals("13")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 1571:
                                if (str.equals("14")) {
                                    c2 = 8;
                                    break;
                                }
                                break;
                            default:
                                switch (hashCode) {
                                    case 1573:
                                        if (str.equals("16")) {
                                            c2 = 11;
                                            break;
                                        }
                                        break;
                                    case 1574:
                                        if (str.equals("17")) {
                                            c2 = 1;
                                            break;
                                        }
                                        break;
                                    case 1575:
                                        if (str.equals("18")) {
                                            c2 = 12;
                                            break;
                                        }
                                        break;
                                }
                        }
                }
            } else if (str.equals("2")) {
                c2 = 9;
            }
            switch (c2) {
                case 0:
                case 1:
                    this.f18631d.setTag(2);
                    break;
                case 2:
                    this.f18635h = new c(this, this.i);
                    break;
                case 3:
                    setBackgroundColor(Color.parseColor("#80000000"));
                    this.f18635h = new d(this);
                    break;
                case 4:
                case 5:
                    this.f18629b.setClipChildren(false);
                    this.f18629b.setClipChildren(false);
                    ViewGroup viewGroup = (ViewGroup) this.f18629b.getParent();
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                    this.f18635h = new d(this);
                    break;
                case 6:
                    this.f18635h = new b(this);
                    break;
                case 7:
                    setBackgroundColor(Color.parseColor("#80000000"));
                    this.f18635h = new b(this);
                    break;
                case 8:
                    this.f18635h = new a(this, this);
                    break;
                case 9:
                case 10:
                    setBackgroundColor(Color.parseColor("#80000000"));
                    this.f18635h = new a(this, this);
                    break;
                case 11:
                    View view = this.f18631d;
                    if (!(view == null || !(view instanceof ShakeAnimationView) || ((ShakeAnimationView) view).getShakeLayout() == null)) {
                        ((ShakeAnimationView) this.f18631d).getShakeLayout().setTag(2);
                    }
                    this.f18631d.setTag(2);
                    break;
                case 12:
                    View view2 = this.f18631d;
                    if (!(view2 == null || !(view2 instanceof WriggleGuideAnimationView) || ((WriggleGuideAnimationView) view2).getWriggleLayout() == null)) {
                        ((WriggleGuideAnimationView) this.f18631d).getWriggleLayout().setTag(2);
                    }
                    this.f18631d.setTag(2);
                    break;
            }
            View.OnTouchListener onTouchListener = this.f18635h;
            if (onTouchListener != null) {
                setOnTouchListener(onTouchListener);
            }
            if (g()) {
                setOnClickListener((View.OnClickListener) this.f18629b.getDynamicClickListener());
            }
        }
    }

    private boolean g() {
        if (!this.f18630c.J() && !TextUtils.equals("9", this.f18633f) && !TextUtils.equals("16", this.f18633f) && !TextUtils.equals("17", this.f18633f) && !TextUtils.equals("18", this.f18633f)) {
            return true;
        }
        return false;
    }

    public void b() {
        b bVar = this.f18632e;
        if (bVar != null) {
            bVar.a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f18632e;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void c() {
        if (this.f18631d != null && TextUtils.equals(this.f18633f, "2")) {
            View view = this.f18631d;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).c();
            }
        }
    }

    public void d() {
        if (this.f18631d != null && TextUtils.equals(this.f18633f, "2")) {
            View view = this.f18631d;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).d();
            }
        }
    }

    public void a() {
        if (TextUtils.equals(this.f18633f, "6")) {
            RippleView rippleView = this.f18634g;
            if (rippleView != null) {
                rippleView.c();
                postDelayed(new Runnable() {
                    public void run() {
                        InteractViewContainer.this.h();
                    }
                }, 300);
                return;
            }
            return;
        }
        h();
    }

    /* access modifiers changed from: private */
    public void h() {
        if (this.f18635h != null) {
            setOnClickListener((View.OnClickListener) this.f18629b.getDynamicClickListener());
            performClick();
        }
    }
}
