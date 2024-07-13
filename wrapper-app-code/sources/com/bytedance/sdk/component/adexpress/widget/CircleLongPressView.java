package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.utils.t;

public class CircleLongPressView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Context f18696a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f18697b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f18698c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f18699d;

    /* renamed from: e  reason: collision with root package name */
    private RingProgressView f18700e;

    /* renamed from: f  reason: collision with root package name */
    private AnimatorSet f18701f = new AnimatorSet();

    public CircleLongPressView(Context context) {
        super(context);
        this.f18696a = context;
        e();
        f();
    }

    private void e() {
        FrameLayout frameLayout = new FrameLayout(this.f18696a);
        this.f18700e = new RingProgressView(this.f18696a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) b.a(this.f18696a, 95.0f), (int) b.a(this.f18696a, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.f18700e, layoutParams);
        ImageView imageView = new ImageView(this.f18696a);
        this.f18697b = imageView;
        imageView.setImageResource(t.d(this.f18696a, "tt_interact_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) b.a(this.f18696a, 75.0f), (int) b.a(this.f18696a, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.f18697b, layoutParams2);
        ImageView imageView2 = new ImageView(this.f18696a);
        this.f18698c = imageView2;
        imageView2.setImageResource(t.d(this.f18696a, "tt_interact_oval"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) b.a(this.f18696a, 63.0f), (int) b.a(this.f18696a, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.f18698c, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.f18696a);
        this.f18699d = textView;
        textView.setTextColor(-1);
        this.f18699d.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.f18699d, layoutParams4);
    }

    private void f() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f18698c, "scaleX", new float[]{1.0f, 0.9f});
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setRepeatMode(2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f18698c, "scaleY", new float[]{1.0f, 0.9f});
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f18701f.setDuration(800);
        this.f18701f.playTogether(new Animator[]{ofFloat, ofFloat2});
    }

    public void setGuideText(String str) {
        this.f18699d.setText(str);
    }

    public void a() {
        this.f18701f.start();
    }

    public void b() {
        this.f18701f.cancel();
    }

    public void c() {
        this.f18700e.a();
    }

    public void d() {
        this.f18700e.b();
        this.f18700e.c();
    }
}
