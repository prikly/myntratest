package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.b.l;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;

public class DynamicBaseWidgetImp extends DynamicBaseWidget {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public InteractViewContainer f18594a;

    public DynamicBaseWidgetImp(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        setTag(Integer.valueOf(getClickArea()));
        String b2 = hVar.i().b();
        if ("logo-union".equals(b2)) {
            dynamicRootView.setLogoUnionHeight(this.f18593h - ((int) b.a(context, (float) (this.l.b() + this.l.a()))));
        } else if ("scoreCountWithIcon".equals(b2)) {
            dynamicRootView.setScoreCountWithIcon(this.f18593h - ((int) b.a(context, (float) (this.l.b() + this.l.a()))));
        }
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.f18592g, this.f18593h);
    }

    public boolean h() {
        final View view = this.o == null ? this : this.o;
        view.setContentDescription(this.l.K());
        Drawable backgroundDrawable = getBackgroundDrawable();
        if (backgroundDrawable != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.l.x() > 0) {
            postDelayed(new Runnable() {
                public void run() {
                    try {
                        view.setBackground(DynamicBaseWidgetImp.this.a(true, DynamicBaseWidgetImp.this.n.getBgColor()));
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.l.x() * 1000));
        }
        if (this.o != null) {
            this.o.setPadding((int) b.a(this.k, (float) this.l.c()), (int) b.a(this.k, (float) this.l.b()), (int) b.a(this.k, (float) this.l.d()), (int) b.a(this.k, (float) this.l.a()));
        }
        if (this.p || this.l.n() > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        final View view = this.o == null ? this : this.o;
        double l = this.m.i().e().l();
        if (l < 90.0d && l > 0.0d) {
            com.bytedance.sdk.component.utils.h.b().postDelayed(new Runnable() {
                public void run() {
                    DynamicBaseWidgetImp.this.setVisibility(8);
                }
            }, (long) (l * 1000.0d));
        }
        double k = this.m.i().e().k();
        if (k > 0.0d) {
            com.bytedance.sdk.component.utils.h.b().postDelayed(new Runnable() {
                public void run() {
                    if (DynamicBaseWidgetImp.this.m.i().e().ac() == null) {
                        view.setVisibility(0);
                        DynamicBaseWidgetImp.this.setVisibility(0);
                    }
                }
            }, (long) (k * 1000.0d));
        }
        if (!TextUtils.isEmpty(this.l.D())) {
            a();
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    private void a() {
        int G = this.l.G();
        int H = this.l.H();
        postDelayed(new Runnable() {
            public void run() {
                if (DynamicBaseWidgetImp.this.n == null || DynamicBaseWidgetImp.this.n.getRenderRequest() == null) {
                    DynamicBaseWidgetImp dynamicBaseWidgetImp = DynamicBaseWidgetImp.this;
                    Context context = DynamicBaseWidgetImp.this.k;
                    DynamicBaseWidgetImp dynamicBaseWidgetImp2 = DynamicBaseWidgetImp.this;
                    InteractViewContainer unused = dynamicBaseWidgetImp.f18594a = new InteractViewContainer(context, dynamicBaseWidgetImp2, dynamicBaseWidgetImp2.l);
                } else {
                    l renderRequest = DynamicBaseWidgetImp.this.n.getRenderRequest();
                    int p = renderRequest.p();
                    int q = renderRequest.q();
                    DynamicBaseWidgetImp dynamicBaseWidgetImp3 = DynamicBaseWidgetImp.this;
                    Context context2 = DynamicBaseWidgetImp.this.k;
                    DynamicBaseWidgetImp dynamicBaseWidgetImp4 = DynamicBaseWidgetImp.this;
                    InteractViewContainer unused2 = dynamicBaseWidgetImp3.f18594a = new InteractViewContainer(context2, dynamicBaseWidgetImp4, dynamicBaseWidgetImp4.l, p, q);
                }
                DynamicBaseWidgetImp dynamicBaseWidgetImp5 = DynamicBaseWidgetImp.this;
                dynamicBaseWidgetImp5.a((View) dynamicBaseWidgetImp5.f18594a);
                DynamicBaseWidgetImp.this.f18594a.setTag(2);
                DynamicBaseWidgetImp dynamicBaseWidgetImp6 = DynamicBaseWidgetImp.this;
                dynamicBaseWidgetImp6.addView(dynamicBaseWidgetImp6.f18594a, new FrameLayout.LayoutParams(-1, -1));
                DynamicBaseWidgetImp.this.f18594a.b();
            }
        }, ((long) G) * 1000);
        if (H < Integer.MAX_VALUE && G < H) {
            postDelayed(new Runnable() {
                public void run() {
                    if (DynamicBaseWidgetImp.this.f18594a != null) {
                        DynamicBaseWidgetImp.this.f18594a.setVisibility(8);
                    }
                }
            }, ((long) H) * 1000);
        }
    }
}
