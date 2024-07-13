package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.c;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.utils.t;

public class SlideUpView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private ImageView f18785a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f18786b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f18787c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ImageView f18788d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f18789e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public AnimatorSet f18790f = new AnimatorSet();

    /* renamed from: g  reason: collision with root package name */
    private AnimatorSet f18791g = new AnimatorSet();

    /* renamed from: h  reason: collision with root package name */
    private AnimatorSet f18792h = new AnimatorSet();
    private AnimatorSet i = new AnimatorSet();

    public SlideUpView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        if (context == null) {
            context = c.a();
        }
        inflate(context, t.f(context, "tt_dynamic_splash_slide_up"), this);
        this.f18787c = (ImageView) findViewById(t.e(context, "tt_splash_slide_up_guide_bar"));
        this.f18785a = (ImageView) findViewById(t.e(context, "tt_splash_slide_up_finger"));
        this.f18786b = (ImageView) findViewById(t.e(context, "tt_splash_slide_up_circle"));
        this.f18789e = (TextView) findViewById(t.e(context, "slide_guide_text"));
        this.f18788d = (ImageView) findViewById(t.e(context, "tt_splash_slide_up_bg"));
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.f18790f;
    }

    public void a() {
        b();
        this.f18790f.start();
        this.f18790f.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SlideUpView.this.postDelayed(new Runnable() {
                    public void run() {
                        SlideUpView.this.f18790f.start();
                    }
                }, 200);
            }
        });
    }

    public void b() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18785a, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f18785a, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f18785a, "translationY", new float[]{0.0f, b.a(getContext(), -100.0f)});
        ofFloat3.setInterpolator(new a(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, (int) b.a(getContext(), 100.0f)});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) SlideUpView.this.f18788d.getLayoutParams();
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SlideUpView.this.f18788d.setLayoutParams(layoutParams);
            }
        });
        ofInt.setInterpolator(new a(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f18788d, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f18788d, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f18786b, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f18786b, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f18786b, "scaleX", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f18786b, "scaleY", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f18786b, "translationY", new float[]{0.0f, b.a(getContext(), -100.0f)});
        ValueAnimator valueAnimator = ofInt;
        ofFloat10.setInterpolator(new a(0.2f, 0.0f, 0.3f, 1.0f));
        this.f18791g.setDuration(50);
        this.i.setDuration(1500);
        this.f18792h.setDuration(50);
        this.f18791g.playTogether(new Animator[]{ofFloat2, ofFloat7, ofFloat5});
        this.f18792h.playTogether(new Animator[]{ofFloat, ofFloat6, ofFloat8, ofFloat9, ofFloat4});
        this.i.playTogether(new Animator[]{ofFloat3, valueAnimator, ofFloat10});
        this.f18790f.playSequentially(new Animator[]{this.f18792h, this.i, this.f18791g});
    }

    public void c() {
        AnimatorSet animatorSet = this.f18790f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f18792h;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.f18791g;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.i;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
    }

    public void setGuideText(String str) {
        this.f18789e.setText(str);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }
}
