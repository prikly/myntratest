package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.b.g;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.PressButtonInteractView;

/* compiled from: PressButtonInteract */
public class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private PressButtonInteractView f18660a;

    public f(Context context, DynamicBaseWidget dynamicBaseWidget, g gVar) {
        this.f18660a = new PressButtonInteractView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicBaseWidget.getDynamicHeight(), dynamicBaseWidget.getDynamicHeight());
        layoutParams.gravity = 21;
        this.f18660a.setLayoutParams(layoutParams);
    }

    public void a() {
        this.f18660a.a();
    }

    public void b() {
        this.f18660a.b();
    }

    /* renamed from: c */
    public PressButtonInteractView d() {
        return this.f18660a;
    }
}
