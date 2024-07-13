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

public class HandLongPressView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f18718a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ImageView f18719b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public CircleRippleView f18720c;

    /* renamed from: d  reason: collision with root package name */
    private AnimatorSet f18721d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f18722e = true;

    /* renamed from: f  reason: collision with root package name */
    private TextView f18723f;

    public HandLongPressView(Context context) {
        super(context);
        this.f18718a = context;
        this.f18721d = new AnimatorSet();
        c();
        d();
        post(new Runnable() {
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) HandLongPressView.this.f18719b.getLayoutParams();
                layoutParams.topMargin = ((int) ((((float) HandLongPressView.this.f18720c.getMeasuredHeight()) / 2.0f) - b.a(HandLongPressView.this.getContext(), 5.0f))) + ((int) b.a(HandLongPressView.this.f18718a, 20.0f));
                layoutParams.leftMargin = ((int) ((((float) HandLongPressView.this.f18720c.getMeasuredWidth()) / 2.0f) - b.a(HandLongPressView.this.getContext(), 5.0f))) + ((int) b.a(HandLongPressView.this.f18718a, 20.0f));
                layoutParams.bottomMargin = (int) ((((float) (-HandLongPressView.this.f18720c.getMeasuredHeight())) / 2.0f) + b.a(HandLongPressView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) ((((float) (-HandLongPressView.this.f18720c.getMeasuredWidth())) / 2.0f) + b.a(HandLongPressView.this.getContext(), 5.0f));
                HandLongPressView.this.f18719b.setLayoutParams(layoutParams);
            }
        });
    }

    private void c() {
        this.f18720c = new CircleRippleView(this.f18718a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) b.a(this.f18718a, 80.0f), (int) b.a(this.f18718a, 80.0f));
        layoutParams.gravity = 51;
        layoutParams.topMargin = (int) b.a(this.f18718a, 20.0f);
        layoutParams.leftMargin = (int) b.a(this.f18718a, 20.0f);
        addView(this.f18720c, layoutParams);
        this.f18720c.a();
        this.f18719b = new ImageView(this.f18718a);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) b.a(this.f18718a, 80.0f), (int) b.a(this.f18718a, 80.0f));
        this.f18719b.setImageResource(t.d(this.f18718a, "tt_splash_hand"));
        addView(this.f18719b, layoutParams2);
        TextView textView = new TextView(this.f18718a);
        this.f18723f = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) b.a(this.f18718a, 10.0f);
        addView(this.f18723f, layoutParams3);
    }

    private void d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18719b, "scaleX", new float[]{1.0f, 0.8f});
        ofFloat.setDuration(1000);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(HandLongPressView.this.f18719b, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(200);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.start();
                HandLongPressView.this.f18719b.setVisibility(0);
            }

            public void onAnimationRepeat(Animator animator) {
                if (HandLongPressView.this.f18722e) {
                    HandLongPressView.this.f18720c.a();
                    HandLongPressView.this.f18720c.setAlpha(1.0f);
                } else {
                    HandLongPressView.this.f18720c.b();
                    HandLongPressView.this.f18720c.setAlpha(0.0f);
                }
                HandLongPressView handLongPressView = HandLongPressView.this;
                boolean unused = handLongPressView.f18722e = !handLongPressView.f18722e;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f18719b, "scaleY", new float[]{1.0f, 0.8f});
        ofFloat2.setDuration(1000);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.f18721d.playTogether(new Animator[]{ofFloat, ofFloat2});
    }

    public void setGuideText(String str) {
        this.f18723f.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.f18723f.setTextColor(i);
    }

    public void a() {
        this.f18721d.start();
    }

    public void b() {
        AnimatorSet animatorSet = this.f18721d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        CircleRippleView circleRippleView = this.f18720c;
        if (circleRippleView != null) {
            circleRippleView.b();
        }
    }
}
