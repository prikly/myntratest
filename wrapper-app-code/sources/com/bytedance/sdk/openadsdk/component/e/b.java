package com.bytedance.sdk.openadsdk.component.e;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.m;

/* compiled from: TTAppOpenAdTopManager */
public class b {

    /* renamed from: g  reason: collision with root package name */
    private static String f570g = "Skip";

    /* renamed from: a  reason: collision with root package name */
    private TextView f571a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f572b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public a f573c;

    /* renamed from: d  reason: collision with root package name */
    private int f574d = 0;

    /* renamed from: e  reason: collision with root package name */
    private float f575e = 5.0f;

    /* renamed from: f  reason: collision with root package name */
    private int f576f = 0;

    /* renamed from: h  reason: collision with root package name */
    private ValueAnimator f577h;
    /* access modifiers changed from: private */
    public boolean i;
    private boolean j;

    public b() {
        f570g = t.a(m.a(), "tt_txt_skip");
    }

    public void a(Activity activity) {
        this.f571a = (TextView) activity.findViewById(t.e(activity, "tt_top_dislike"));
        this.f572b = (TextView) activity.findViewById(t.e(activity, "tt_top_skip"));
        this.f571a.setText(t.a(m.a(), "tt_reward_feedback"));
        g();
    }

    private void g() {
        this.f571a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (b.this.f573c != null) {
                    b.this.f573c.b(view);
                }
            }
        });
        this.f572b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (b.this.f573c != null && b.this.i) {
                    b.this.f573c.a(view);
                }
            }
        });
    }

    public void a() {
        int i2 = (int) (this.f575e * 1000.0f);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, i2});
        this.f577h = ofInt;
        ofInt.setDuration((long) i2);
        this.f577h.setInterpolator(new LinearInterpolator());
        this.f577h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                b.this.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
    }

    public void a(int i2) {
        this.f574d = i2;
        float f2 = (((float) i2) * 1.0f) / 1000.0f;
        int ceil = (int) Math.ceil((double) (this.f575e - f2));
        if (ceil <= 0) {
            ceil = 0;
            a aVar = this.f573c;
            if (aVar != null && !this.j) {
                aVar.a();
                this.j = true;
            }
        }
        String valueOf = String.valueOf(ceil);
        if (f2 >= ((float) this.f576f)) {
            valueOf = valueOf + " | " + f570g;
            this.i = true;
        }
        this.f572b.setText(valueOf);
    }

    public void a(float f2) {
        this.f575e = f2;
        if (f2 <= 0.0f) {
            this.f575e = 5.0f;
        }
        a();
    }

    public void b(int i2) {
        this.f576f = i2;
    }

    public void a(a aVar) {
        this.f573c = aVar;
    }

    public ValueAnimator b() {
        return this.f577h;
    }

    public void c() {
        TextView textView = this.f572b;
        if (textView != null) {
            textView.performClick();
        }
    }

    public int d() {
        return this.f574d;
    }

    public float e() {
        return this.f575e;
    }

    public int f() {
        return this.f576f;
    }
}
