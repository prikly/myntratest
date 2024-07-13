package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.utils.t;

public class PressInteractView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f18733a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ImageView f18734b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public SplashDiffuseView f18735c;

    /* renamed from: d  reason: collision with root package name */
    private AnimatorSet f18736d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f18737e = true;

    /* renamed from: f  reason: collision with root package name */
    private TextView f18738f;

    public PressInteractView(Context context) {
        super(context);
        this.f18733a = context;
        this.f18736d = new AnimatorSet();
        c();
        d();
        post(new Runnable() {
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PressInteractView.this.f18734b.getLayoutParams();
                layoutParams.topMargin = ((int) ((((float) PressInteractView.this.f18735c.getMeasuredHeight()) / 2.0f) - b.a(PressInteractView.this.getContext(), 5.0f))) + ((int) b.a(PressInteractView.this.f18733a, 20.0f));
                layoutParams.leftMargin = ((int) ((((float) PressInteractView.this.f18735c.getMeasuredWidth()) / 2.0f) - b.a(PressInteractView.this.getContext(), 5.0f))) + ((int) b.a(PressInteractView.this.f18733a, 20.0f));
                layoutParams.bottomMargin = (int) ((((float) (-PressInteractView.this.f18735c.getMeasuredHeight())) / 2.0f) + b.a(PressInteractView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) ((((float) (-PressInteractView.this.f18735c.getMeasuredWidth())) / 2.0f) + b.a(PressInteractView.this.getContext(), 5.0f));
                PressInteractView.this.f18734b.setLayoutParams(layoutParams);
            }
        });
    }

    private void c() {
        this.f18735c = new SplashDiffuseView(this.f18733a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) b.a(this.f18733a, 50.0f), (int) b.a(this.f18733a, 50.0f));
        layoutParams.gravity = 51;
        layoutParams.topMargin = (int) b.a(this.f18733a, 20.0f);
        layoutParams.leftMargin = (int) b.a(this.f18733a, 20.0f);
        addView(this.f18735c, layoutParams);
        this.f18734b = new ImageView(this.f18733a);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) b.a(this.f18733a, 78.0f), (int) b.a(this.f18733a, 78.0f));
        this.f18734b.setImageResource(t.d(this.f18733a, "tt_splash_hand"));
        addView(this.f18734b, layoutParams2);
        TextView textView = new TextView(this.f18733a);
        this.f18738f = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) b.a(this.f18733a, 10.0f);
        addView(this.f18738f, layoutParams3);
        this.f18738f.setVisibility(8);
    }

    private void d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18734b, "scaleX", new float[]{1.0f, 0.9f});
        ofFloat.setDuration(1000);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(PressInteractView.this.f18734b, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(200);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.start();
                PressInteractView.this.f18734b.setVisibility(0);
            }

            public void onAnimationRepeat(Animator animator) {
                if (PressInteractView.this.f18737e) {
                    PressInteractView.this.f18735c.a();
                }
                PressInteractView pressInteractView = PressInteractView.this;
                boolean unused = pressInteractView.f18737e = !pressInteractView.f18737e;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f18734b, "scaleY", new float[]{1.0f, 0.9f});
        ofFloat2.setDuration(1000);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.f18736d.playTogether(new Animator[]{ofFloat, ofFloat2});
    }

    public void setGuideText(String str) {
        this.f18738f.setVisibility(0);
        this.f18738f.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.f18738f.setTextColor(i);
    }

    public void a() {
        this.f18736d.start();
    }

    public void b() {
        AnimatorSet animatorSet = this.f18736d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
