package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.c;
import com.bytedance.sdk.component.adexpress.dynamic.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import java.util.Iterator;
import java.util.List;

public class DynamicTimeOuterContainerWidgetImp extends DynamicBaseWidgetImp implements b {

    /* renamed from: a  reason: collision with root package name */
    int f18621a;

    /* renamed from: b  reason: collision with root package name */
    boolean f18622b;
    private int s = 0;

    public DynamicTimeOuterContainerWidgetImp(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        setTag(Integer.valueOf(getClickArea()));
        a();
        dynamicRootView.setTimeOutListener(this);
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    public void f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.f18622b) {
            layoutParams.leftMargin = this.i;
        } else {
            layoutParams.leftMargin = this.i + this.s;
        }
        layoutParams.topMargin = this.j;
        setLayoutParams(layoutParams);
    }

    public boolean h() {
        super.h();
        setPadding((int) com.bytedance.sdk.component.adexpress.c.b.a(c.a(), (float) this.l.c()), (int) com.bytedance.sdk.component.adexpress.c.b.a(c.a(), (float) this.l.b()), (int) com.bytedance.sdk.component.adexpress.c.b.a(c.a(), (float) this.l.d()), (int) com.bytedance.sdk.component.adexpress.c.b.a(c.a(), (float) this.l.a()));
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f18622b) {
            setMeasuredDimension(this.f18592g, this.f18593h);
        } else {
            setMeasuredDimension(this.f18621a, this.f18593h);
        }
    }

    private void a() {
        List<h> j = this.m.j();
        if (j != null && j.size() > 0) {
            Iterator<h> it = j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h next = it.next();
                if (TextUtils.equals("skip-with-time-skip-btn", next.i().b())) {
                    this.f18621a = (int) (((float) this.f18592g) - com.bytedance.sdk.component.adexpress.c.b.a(this.k, next.g()));
                    break;
                }
            }
            this.s = this.f18592g - this.f18621a;
        }
    }

    public void a(CharSequence charSequence, boolean z, int i) {
        if (z && this.f18622b != z) {
            this.f18622b = z;
            f();
        }
        this.f18622b = z;
    }
}
