package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;

public class DynamicBaseScrollWidgetImp extends DynamicBaseWidgetImp implements c {

    /* renamed from: a  reason: collision with root package name */
    ObjectAnimator f18579a;

    /* renamed from: b  reason: collision with root package name */
    ObjectAnimator f18580b;
    private int s = 0;
    private Runnable t = new Runnable() {
        public void run() {
            DynamicBaseScrollWidgetImp.this.a();
        }
    };

    /* access modifiers changed from: private */
    public void a() {
        final View childAt = getChildAt(this.s);
        final View childAt2 = getChildAt((this.s + 1) % getChildCount());
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "translationY", new float[]{0.0f, (float) ((-(this.f18593h + getChildAt(this.s).getHeight())) / 2)});
        this.f18579a = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f18579a.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", new float[]{(float) ((this.f18593h + childAt2.getHeight()) / 2), 0.0f});
        this.f18580b = ofFloat2;
        ofFloat2.setInterpolator(new LinearInterpolator());
        this.f18580b.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }
        });
        this.f18579a.setDuration(500);
        this.f18580b.setDuration(500);
        this.f18579a.start();
        this.f18580b.start();
        int i = this.s + 1;
        this.s = i;
        this.s = i % getChildCount();
        postDelayed(this.t, 2000);
    }

    public DynamicBaseScrollWidgetImp(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.f18593h - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.t, 2500);
    }

    public void b() {
        removeCallbacks(this.t);
        ObjectAnimator objectAnimator = this.f18579a;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.f18579a.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f18580b;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f18580b.cancel();
        }
        super.b();
    }
}
