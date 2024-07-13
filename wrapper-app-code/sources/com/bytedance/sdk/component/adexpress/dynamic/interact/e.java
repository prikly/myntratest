package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.g;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.HandLongPressView;

/* compiled from: LongPressInteract */
public class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private HandLongPressView f18659a;

    public e(Context context, DynamicBaseWidget dynamicBaseWidget, g gVar) {
        this.f18659a = new HandLongPressView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) b.a(context, 180.0f), (int) b.a(context, 180.0f));
        layoutParams.gravity = 17;
        this.f18659a.setLayoutParams(layoutParams);
        this.f18659a.setGuideText(gVar.I());
    }

    public void a() {
        this.f18659a.a();
    }

    public void b() {
        this.f18659a.b();
    }

    public ViewGroup d() {
        return this.f18659a;
    }
}
