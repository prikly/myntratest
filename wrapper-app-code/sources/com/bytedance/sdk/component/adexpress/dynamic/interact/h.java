package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.g;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.utils.t;

/* compiled from: ShakeInteract */
public class h implements b<ShakeAnimationView> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public ShakeAnimationView f18662a;

    /* renamed from: b  reason: collision with root package name */
    private Context f18663b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public DynamicBaseWidget f18664c;

    /* renamed from: d  reason: collision with root package name */
    private g f18665d;

    /* renamed from: e  reason: collision with root package name */
    private String f18666e;

    /* renamed from: f  reason: collision with root package name */
    private int f18667f;

    public h(Context context, DynamicBaseWidget dynamicBaseWidget, g gVar, String str, int i) {
        this.f18663b = context;
        this.f18664c = dynamicBaseWidget;
        this.f18665d = gVar;
        this.f18666e = str;
        this.f18667f = i;
        e();
    }

    private void e() {
        if ("16".equals(this.f18666e)) {
            Context context = this.f18663b;
            ShakeAnimationView shakeAnimationView = new ShakeAnimationView(context, t.f(context, "tt_hand_shake_interaction_type_16"), this.f18667f);
            this.f18662a = shakeAnimationView;
            if (shakeAnimationView.getShakeLayout() != null) {
                this.f18662a.getShakeLayout().setOnClickListener((View.OnClickListener) this.f18664c.getDynamicClickListener());
            }
        } else {
            Context context2 = this.f18663b;
            this.f18662a = new ShakeAnimationView(context2, t.f(context2, "tt_hand_shake"), this.f18667f);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) b.a(this.f18663b, 80.0f);
        this.f18662a.setLayoutParams(layoutParams);
        this.f18662a.setShakeText(this.f18665d.I());
        this.f18662a.setClipChildren(false);
        this.f18662a.setOnShakeViewListener(new ShakeAnimationView.a() {
            public void a() {
                h.this.f18662a.setOnClickListener((View.OnClickListener) h.this.f18664c.getDynamicClickListener());
                h.this.f18662a.performClick();
            }
        });
    }

    public void a() {
        this.f18662a.a();
    }

    public void b() {
        this.f18662a.clearAnimation();
    }

    /* renamed from: c */
    public ShakeAnimationView d() {
        return this.f18662a;
    }
}
