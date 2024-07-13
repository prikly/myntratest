package com.bytedance.sdk.component.adexpress.widget;

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

public class WriggleGuideAnimationView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f18813a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ImageView f18814b;

    /* renamed from: c  reason: collision with root package name */
    private v f18815c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f18816d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public a f18817e;

    /* renamed from: f  reason: collision with root package name */
    private LinearLayout f18818f;

    /* renamed from: g  reason: collision with root package name */
    private WriggleGuideView f18819g;

    /* renamed from: h  reason: collision with root package name */
    private int f18820h;

    public interface a {
        void a();
    }

    public WriggleGuideAnimationView(Context context, int i, int i2) {
        super(context);
        this.f18820h = i2;
        a(context, i);
    }

    private void a(Context context, int i) {
        inflate(context, i, this);
        this.f18818f = (LinearLayout) findViewById(t.e(context, "tt_interact_splash_wriggle_layout"));
        this.f18814b = (ImageView) findViewById(t.e(context, "tt_interact_splash_top_img"));
        this.f18819g = (WriggleGuideView) findViewById(t.e(context, "tt_interact_splash_progress_img"));
        this.f18813a = (TextView) findViewById(t.e(context, "tt_interact_splash_top_text"));
        this.f18816d = (TextView) findViewById(t.e(context, "tt_interact_splash_click_bar_text"));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f18818f.setBackground(gradientDrawable);
    }

    public void setShakeText(String str) {
        this.f18816d.setText(str);
    }

    public LinearLayout getWriggleLayout() {
        return this.f18818f;
    }

    public WriggleGuideView getWriggleProgressIv() {
        return this.f18819g;
    }

    public TextView getTopTextView() {
        return this.f18813a;
    }

    public void setOnShakeViewListener(a aVar) {
        this.f18817e = aVar;
    }

    public void a() {
        postDelayed(new Runnable() {
            public void run() {
                if (WriggleGuideAnimationView.this.f18814b != null) {
                    final RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -35.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setInterpolator(new b());
                    rotateAnimation.setDuration(1500);
                    rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
                        public void onAnimationRepeat(Animation animation) {
                        }

                        public void onAnimationStart(Animation animation) {
                        }

                        public void onAnimationEnd(Animation animation) {
                            WriggleGuideAnimationView.this.postDelayed(new Runnable() {
                                public void run() {
                                    WriggleGuideAnimationView.this.f18814b.startAnimation(rotateAnimation);
                                }
                            }, 300);
                        }
                    });
                    WriggleGuideAnimationView.this.f18814b.startAnimation(rotateAnimation);
                }
            }
        }, 500);
    }

    private static class b implements Interpolator {
        public float getInterpolation(float f2) {
            return f2 <= 0.4f ? f2 * 2.5f : f2 <= 0.8f ? (f2 * -2.2f) + 1.86f : (f2 * -0.7f) + 0.7f;
        }

        private b() {
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f18815c == null) {
                this.f18815c = new v(getContext().getApplicationContext());
            }
            this.f18815c.a((v.a) new v.a() {
                public void a(int i) {
                    if (i == 2 && WriggleGuideAnimationView.this.isShown() && WriggleGuideAnimationView.this.f18817e != null) {
                        WriggleGuideAnimationView.this.f18817e.a();
                    }
                }
            });
            this.f18815c.b((float) this.f18820h);
            this.f18815c.a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v vVar = this.f18815c;
        if (vVar != null) {
            vVar.b();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        v vVar = this.f18815c;
        if (vVar == null) {
            return;
        }
        if (z) {
            vVar.a();
        } else {
            vVar.b();
        }
    }
}
