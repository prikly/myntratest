package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.g;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.SlideUpView;

/* compiled from: SlideUpInteract */
public class j implements b<SlideUpView> {

    /* renamed from: a  reason: collision with root package name */
    private SlideUpView f18673a;

    /* renamed from: b  reason: collision with root package name */
    private Context f18674b;

    /* renamed from: c  reason: collision with root package name */
    private DynamicBaseWidget f18675c;

    /* renamed from: d  reason: collision with root package name */
    private g f18676d;

    public j(Context context, DynamicBaseWidget dynamicBaseWidget, g gVar) {
        this.f18674b = context;
        this.f18675c = dynamicBaseWidget;
        this.f18676d = gVar;
        e();
    }

    private void e() {
        this.f18673a = new SlideUpView(this.f18674b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) b.a(this.f18674b, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) b.a(this.f18674b, 100.0f);
        this.f18673a.setLayoutParams(layoutParams);
        this.f18673a.setGuideText(this.f18676d.I());
    }

    public void a() {
        this.f18673a.a();
    }

    public void b() {
        this.f18673a.c();
    }

    /* renamed from: c */
    public SlideUpView d() {
        return this.f18673a;
    }
}
