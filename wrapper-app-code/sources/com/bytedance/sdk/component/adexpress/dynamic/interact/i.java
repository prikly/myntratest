package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.g;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.SlideRightView;

/* compiled from: SlideRightInteract */
public class i implements b {

    /* renamed from: a  reason: collision with root package name */
    private SlideRightView f18669a;

    /* renamed from: b  reason: collision with root package name */
    private Context f18670b;

    /* renamed from: c  reason: collision with root package name */
    private DynamicBaseWidget f18671c;

    /* renamed from: d  reason: collision with root package name */
    private g f18672d;

    public void b() {
    }

    public i(Context context, DynamicBaseWidget dynamicBaseWidget, g gVar) {
        this.f18670b = context;
        this.f18671c = dynamicBaseWidget;
        this.f18672d = gVar;
        c();
    }

    private void c() {
        this.f18669a = new SlideRightView(this.f18670b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) b.a(this.f18670b, 120.0f), (int) b.a(this.f18670b, 120.0f));
        layoutParams.gravity = 17;
        this.f18669a.setLayoutParams(layoutParams);
        this.f18669a.setClipChildren(false);
        this.f18669a.setGuideText(this.f18672d.I());
    }

    public void a() {
        this.f18669a.a();
    }

    public ViewGroup d() {
        return this.f18669a;
    }
}
