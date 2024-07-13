package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.utils.t;

public class SlideRightView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Context f18773a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ImageView f18774b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public ImageView f18775c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ImageView f18776d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f18777e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public AnimatorSet f18778f = new AnimatorSet();

    /* renamed from: g  reason: collision with root package name */
    private AnimatorSet f18779g = new AnimatorSet();

    /* renamed from: h  reason: collision with root package name */
    private AnimatorSet f18780h = new AnimatorSet();
    private AnimatorSet i = new AnimatorSet();

    public SlideRightView(Context context) {
        super(context);
        this.f18773a = context;
        b();
    }

    private void b() {
        ImageView imageView = new ImageView(this.f18773a);
        this.f18776d = imageView;
        imageView.setBackgroundResource(t.d(this.f18773a, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        addView(this.f18776d, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.f18773a);
        this.f18775c = imageView2;
        imageView2.setImageResource(t.d(this.f18773a, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) b.a(this.f18773a, 50.0f), (int) b.a(this.f18773a, 50.0f));
        layoutParams2.gravity = 48;
        addView(this.f18775c, layoutParams2);
        ImageView imageView3 = new ImageView(this.f18773a);
        this.f18774b = imageView3;
        imageView3.setImageResource(t.d(this.f18773a, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) b.a(this.f18773a, 80.0f), (int) b.a(this.f18773a, 80.0f));
        layoutParams3.gravity = 48;
        addView(this.f18774b, layoutParams3);
        TextView textView = new TextView(this.f18773a);
        this.f18777e = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.f18777e, layoutParams4);
        post(new Runnable() {
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SlideRightView.this.f18774b.getLayoutParams();
                layoutParams.topMargin = (int) ((((float) SlideRightView.this.f18775c.getMeasuredHeight()) / 2.0f) - b.a(SlideRightView.this.getContext(), 7.0f));
                layoutParams.leftMargin = -SlideRightView.this.f18775c.getMeasuredWidth();
                SlideRightView.this.f18774b.setLayoutParams(layoutParams);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) SlideRightView.this.f18776d.getLayoutParams();
                layoutParams2.topMargin = (int) ((((float) SlideRightView.this.f18775c.getMeasuredHeight()) / 2.0f) - b.a(SlideRightView.this.getContext(), 5.0f));
                layoutParams2.leftMargin = (int) (((float) SlideRightView.this.f18775c.getMeasuredWidth()) / 2.0f);
                SlideRightView.this.f18776d.setLayoutParams(layoutParams2);
            }
        });
    }

    private void c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18774b, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f18775c, "scaleX", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f18775c, "scaleY", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f18776d, "alpha", new float[]{0.0f, 1.0f});
        this.f18780h.setDuration(300);
        this.f18780h.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f18774b, "translationX", new float[]{0.0f, b.a(getContext(), 80.0f)});
        ofFloat5.setInterpolator(new a(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, (int) b.a(getContext(), 80.0f)});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SlideRightView.this.f18776d.getLayoutParams();
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SlideRightView.this.f18776d.setLayoutParams(layoutParams);
            }
        });
        ofInt.setInterpolator(new a(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f18775c, "translationX", new float[]{0.0f, b.a(getContext(), 80.0f)});
        ofFloat6.setInterpolator(new a(0.2f, 0.0f, 0.3f, 1.0f));
        this.i.setDuration(1500);
        this.i.playTogether(new Animator[]{ofFloat5, ofInt, ofFloat6});
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f18774b, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f18776d, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f18775c, "alpha", new float[]{1.0f, 0.0f});
        this.f18779g.setDuration(50);
        this.f18779g.playTogether(new Animator[]{ofFloat7, ofFloat8, ofFloat9});
        this.f18778f.playSequentially(new Animator[]{this.f18780h, this.i, this.f18779g});
    }

    public void a() {
        c();
        this.f18778f.start();
        this.f18778f.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SlideRightView.this.postDelayed(new Runnable() {
                    public void run() {
                        SlideRightView.this.f18778f.start();
                    }
                }, 200);
            }
        });
    }

    public void setGuideText(String str) {
        this.f18777e.setText(str);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
    }
}
