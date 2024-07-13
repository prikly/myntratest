package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;

public class DynamicRoot extends DynamicBaseWidgetImp {

    /* renamed from: a  reason: collision with root package name */
    public a f18606a;

    public DynamicRoot(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
    }

    public boolean h() {
        return super.h();
    }

    /* access modifiers changed from: protected */
    public GradientDrawable getDrawable() {
        a aVar = new a();
        this.f18606a = aVar;
        return aVar;
    }

    /* access modifiers changed from: protected */
    public GradientDrawable a(GradientDrawable.Orientation orientation, int[] iArr) {
        a aVar = new a(orientation, iArr);
        this.f18606a = aVar;
        return aVar;
    }
}
