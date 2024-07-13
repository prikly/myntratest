package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.v;

public class ShakeAnimationView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f18761a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ImageView f18762b;

    /* renamed from: c  reason: collision with root package name */
    private v f18763c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f18764d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public a f18765e;

    /* renamed from: f  reason: collision with root package name */
    private LinearLayout f18766f;

    /* renamed from: g  reason: collision with root package name */
    private int f18767g;

    public interface a {
        void a();
    }

    public ShakeAnimationView(Context context, int i, int i2) {
        super(context);
        this.f18767g = i2;
        a(context, i);
    }

    private void a(Context context, int i) {
        inflate(context, i, this);
        this.f18766f = (LinearLayout) findViewById(t.e(context, "tt_hand_container"));
        this.f18762b = (ImageView) findViewById(t.e(context, "tt_splash_rock_img"));
        this.f18761a = (TextView) findViewById(t.e(context, "tt_splash_rock_top_text"));
        this.f18764d = (TextView) findViewById(t.e(context, "tt_splash_rock_text"));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f18766f.setBackground(gradientDrawable);
    }

    public void setShakeText(String str) {
        this.f18764d.setText(str);
    }

    public LinearLayout getShakeLayout() {
        return this.f18766f;
    }

    public void setOnShakeViewListener(a aVar) {
        this.f18765e = aVar;
    }

    public void a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.start();
        postDelayed(new Runnable() {
            public void run() {
                if (ShakeAnimationView.this.f18762b != null) {
                    final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                    rotateAnimation.setInterpolator(new b());
                    rotateAnimation.setDuration(1000);
                    rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
                        public void onAnimationRepeat(Animation animation) {
                        }

                        public void onAnimationStart(Animation animation) {
                        }

                        public void onAnimationEnd(Animation animation) {
                            ShakeAnimationView.this.postDelayed(new Runnable() {
                                public void run() {
                                    ShakeAnimationView.this.f18762b.startAnimation(rotateAnimation);
                                }
                            }, 250);
                        }
                    });
                    ShakeAnimationView.this.f18762b.startAnimation(rotateAnimation);
                }
            }
        }, 500);
    }

    private static class b implements Interpolator {
        public float getInterpolation(float f2) {
            return f2 <= 0.25f ? (f2 * -2.0f) + 0.5f : f2 <= 0.5f ? (f2 * 4.0f) - 1.0f : f2 <= 0.75f ? (f2 * -4.0f) + 3.0f : (f2 * 2.0f) - 1.5f;
        }

        private b() {
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f18763c == null) {
                this.f18763c = new v(getContext().getApplicationContext());
            }
            this.f18763c.a((v.a) new v.a() {
                public void a(int i) {
                    if (i == 1 && ShakeAnimationView.this.isShown() && ShakeAnimationView.this.f18765e != null) {
                        ShakeAnimationView.this.f18765e.a();
                    }
                }
            });
            this.f18763c.a((float) this.f18767g);
            this.f18763c.a();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        v vVar = this.f18763c;
        if (vVar == null) {
            return;
        }
        if (z) {
            vVar.a();
        } else {
            vVar.b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v vVar = this.f18763c;
        if (vVar != null) {
            vVar.b();
        }
    }
}
