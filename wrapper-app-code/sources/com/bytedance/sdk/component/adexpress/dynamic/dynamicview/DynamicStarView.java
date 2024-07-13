package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.c;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.widget.TTRatingBar2;

public class DynamicStarView extends DynamicBaseWidgetImp {

    /* renamed from: a  reason: collision with root package name */
    private int f18619a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f18620b = 0;

    public DynamicStarView(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        this.o = new TTRatingBar2(context, (AttributeSet) null);
        this.o.setTag(Integer.valueOf(getClickArea()));
        addView(this.o, getWidgetLayoutParams());
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        this.f18593h = (int) (((float) this.f18593h) + b.a(this.k, (float) (this.l.b() + this.l.a())));
        int a2 = (int) ((b.a(c.a(), this.l.e()) * 5.0f) + b.a(c.a(), ((float) this.l.c()) + b.a(c.a(), (float) this.l.d())));
        if (this.f18592g > a2 && 4 == this.l.h()) {
            this.f18619a = (this.f18592g - a2) / 2;
        }
        this.f18620b = (int) b.a(this.k, (float) this.l.b());
        this.f18592g = a2;
        return new FrameLayout.LayoutParams(this.f18592g, this.f18593h);
    }

    public void f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f18592g, this.f18593h);
        layoutParams.topMargin = this.j + this.f18620b;
        layoutParams.leftMargin = this.i + this.f18619a;
        setLayoutParams(layoutParams);
    }

    public boolean h() {
        super.h();
        double m = this.l.m();
        if (!c.b() || (m >= 0.0d && m <= 5.0d && (this.n == null || this.n.getRenderRequest() == null || this.n.getRenderRequest().k() == 4))) {
            if (m < 0.0d || m > 5.0d) {
                m = 5.0d;
            }
            this.o.setVisibility(0);
            ((TTRatingBar2) this.o).a(m, this.l.g(), (int) this.l.e());
            return true;
        }
        this.o.setVisibility(8);
        return true;
    }
}
