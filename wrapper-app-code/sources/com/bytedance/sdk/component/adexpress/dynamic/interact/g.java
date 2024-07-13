package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.PressInteractView;

/* compiled from: PressInteract */
public class g implements b<PressInteractView> {

    /* renamed from: a  reason: collision with root package name */
    private PressInteractView f18661a;

    public g(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.b.g gVar) {
        this.f18661a = new PressInteractView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) b.a(context, 180.0f), (int) b.a(context, 180.0f));
        layoutParams.gravity = 17;
        this.f18661a.setLayoutParams(layoutParams);
        this.f18661a.setGuideText(gVar.I());
    }

    public void a() {
        this.f18661a.a();
    }

    public void b() {
        this.f18661a.b();
    }

    /* renamed from: c */
    public PressInteractView d() {
        return this.f18661a;
    }
}
