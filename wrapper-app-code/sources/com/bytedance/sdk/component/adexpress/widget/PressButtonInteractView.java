package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.utils.t;

public class PressButtonInteractView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Context f18726a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ImageView f18727b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public SplashDiffuseView f18728c;

    /* renamed from: d  reason: collision with root package name */
    private AnimatorSet f18729d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f18730e = true;

    public PressButtonInteractView(Context context) {
        super(context);
        this.f18726a = context;
        this.f18729d = new AnimatorSet();
        c();
        d();
        post(new Runnable() {
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PressButtonInteractView.this.f18727b.getLayoutParams();
                layoutParams.topMargin = (int) ((((float) PressButtonInteractView.this.f18728c.getMeasuredHeight()) / 2.0f) - b.a(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((((float) PressButtonInteractView.this.f18728c.getMeasuredWidth()) / 2.0f) - b.a(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) ((((float) (-PressButtonInteractView.this.f18728c.getMeasuredHeight())) / 2.0f) + b.a(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) ((((float) (-PressButtonInteractView.this.f18728c.getMeasuredWidth())) / 2.0f) + b.a(PressButtonInteractView.this.getContext(), 5.0f));
                PressButtonInteractView.this.f18727b.setLayoutParams(layoutParams);
            }
        });
    }

    private void c() {
        this.f18728c = new SplashDiffuseView(this.f18726a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) b.a(this.f18726a, 40.0f), (int) b.a(this.f18726a, 40.0f));
        layoutParams.gravity = 19;
        addView(this.f18728c, layoutParams);
        this.f18727b = new ImageView(this.f18726a);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) b.a(this.f18726a, 62.0f), (int) b.a(this.f18726a, 62.0f));
        layoutParams2.gravity = 16;
        this.f18727b.setImageResource(t.d(this.f18726a, "tt_splash_hand"));
        addView(this.f18727b, layoutParams2);
    }

    private void d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18727b, "scaleX", new float[]{1.0f, 0.9f});
        ofFloat.setDuration(800);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(PressButtonInteractView.this.f18727b, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(200);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.start();
                PressButtonInteractView.this.f18727b.setVisibility(0);
            }

            public void onAnimationRepeat(Animator animator) {
                if (PressButtonInteractView.this.f18730e) {
                    PressButtonInteractView.this.f18728c.a();
                }
                PressButtonInteractView pressButtonInteractView = PressButtonInteractView.this;
                boolean unused = pressButtonInteractView.f18730e = !pressButtonInteractView.f18730e;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f18727b, "scaleY", new float[]{1.0f, 0.9f});
        ofFloat2.setDuration(800);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f18729d.playTogether(new Animator[]{ofFloat, ofFloat2});
    }

    public void a() {
        this.f18729d.start();
    }

    public void b() {
        AnimatorSet animatorSet = this.f18729d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
