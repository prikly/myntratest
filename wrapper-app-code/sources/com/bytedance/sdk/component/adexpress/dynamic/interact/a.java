package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.g;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.CircleLongPressView;

/* compiled from: CircleLongPressInteract */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private CircleLongPressView f18638a;

    public a(Context context, DynamicBaseWidget dynamicBaseWidget, g gVar) {
        this.f18638a = new CircleLongPressView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) b.a(context, 180.0f), (int) b.a(context, 180.0f));
        layoutParams.gravity = 17;
        this.f18638a.setLayoutParams(layoutParams);
        this.f18638a.setGuideText(gVar.I());
    }

    public void a() {
        this.f18638a.a();
    }

    public void b() {
        this.f18638a.b();
    }

    /* renamed from: c */
    public CircleLongPressView d() {
        return this.f18638a;
    }
}
