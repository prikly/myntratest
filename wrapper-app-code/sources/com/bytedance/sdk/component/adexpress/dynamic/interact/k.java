package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.g;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideView;
import com.bytedance.sdk.component.utils.t;

/* compiled from: WriggleGuideInteract */
public class k implements b<WriggleGuideAnimationView> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public WriggleGuideAnimationView f18677a;

    /* renamed from: b  reason: collision with root package name */
    private Context f18678b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public DynamicBaseWidget f18679c;

    /* renamed from: d  reason: collision with root package name */
    private g f18680d;

    /* renamed from: e  reason: collision with root package name */
    private String f18681e;

    /* renamed from: f  reason: collision with root package name */
    private int f18682f;

    public k(Context context, DynamicBaseWidget dynamicBaseWidget, g gVar, String str, int i) {
        this.f18678b = context;
        this.f18679c = dynamicBaseWidget;
        this.f18680d = gVar;
        this.f18681e = str;
        this.f18682f = i;
        e();
    }

    private void e() {
        int F = this.f18680d.F();
        if ("18".equals(this.f18681e)) {
            Context context = this.f18678b;
            WriggleGuideAnimationView wriggleGuideAnimationView = new WriggleGuideAnimationView(context, t.f(context, "tt_hand_wriggle_guide"), this.f18682f);
            this.f18677a = wriggleGuideAnimationView;
            if (wriggleGuideAnimationView.getWriggleLayout() != null) {
                this.f18677a.getWriggleLayout().setOnClickListener((View.OnClickListener) this.f18679c.getDynamicClickListener());
            }
            if (this.f18677a.getTopTextView() != null) {
                this.f18677a.getTopTextView().setText(t.b(this.f18678b, "tt_splash_wriggle_top_text_style_17"));
            }
        } else {
            Context context2 = this.f18678b;
            this.f18677a = new WriggleGuideAnimationView(context2, t.f(context2, "tt_hand_wriggle_guide"), this.f18682f);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) b.a(this.f18678b, (float) F);
        this.f18677a.setLayoutParams(layoutParams);
        this.f18677a.setShakeText(this.f18680d.I());
        this.f18677a.setClipChildren(false);
        final WriggleGuideView wriggleProgressIv = this.f18677a.getWriggleProgressIv();
        this.f18677a.setOnShakeViewListener(new WriggleGuideAnimationView.a() {
            public void a() {
                WriggleGuideView wriggleGuideView = wriggleProgressIv;
                if (wriggleGuideView != null) {
                    wriggleGuideView.a(new WriggleGuideView.a() {
                        public void a() {
                            k.this.f18677a.setOnClickListener((View.OnClickListener) k.this.f18679c.getDynamicClickListener());
                            k.this.f18677a.performClick();
                        }
                    });
                }
            }
        });
    }

    public void a() {
        this.f18677a.a();
    }

    public void b() {
        this.f18677a.clearAnimation();
    }

    /* renamed from: c */
    public WriggleGuideAnimationView d() {
        return this.f18677a;
    }
}
