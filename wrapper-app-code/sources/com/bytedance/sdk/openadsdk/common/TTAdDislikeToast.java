package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;

public class TTAdDislikeToast extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Handler f434a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public TextView f435b;

    public TTAdDislikeToast(Context context) {
        this(context, (AttributeSet) null);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f434a = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        a(context);
    }

    private void a(Context context) {
        TextView textView = new TextView(context);
        this.f435b = textView;
        textView.setClickable(false);
        this.f435b.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        int b2 = (int) v.b(m.a(), 20.0f);
        int b3 = (int) v.b(m.a(), 12.0f);
        this.f435b.setPadding(b2, b3, b2, b3);
        this.f435b.setLayoutParams(layoutParams);
        this.f435b.setTextColor(-1);
        this.f435b.setTextSize(16.0f);
        this.f435b.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#CC000000"));
        gradientDrawable.setCornerRadius(v.b(m.a(), 6.0f));
        this.f435b.setBackgroundDrawable(gradientDrawable);
        addView(this.f435b);
    }

    public void a(final String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f434a.removeCallbacksAndMessages((Object) null);
            this.f434a.post(new Runnable() {
                public void run() {
                    if (TTAdDislikeToast.this.f435b != null) {
                        TTAdDislikeToast.this.f435b.setText(String.valueOf(str));
                    }
                    TTAdDislikeToast.this.setVisibility(0);
                }
            });
            this.f434a.postDelayed(new Runnable() {
                public void run() {
                    TTAdDislikeToast.this.setVisibility(8);
                }
            }, 2000);
        }
    }

    public void a() {
        setVisibility(8);
        this.f434a.removeCallbacksAndMessages((Object) null);
    }

    public void b() {
        setVisibility(8);
        this.f434a.removeCallbacksAndMessages((Object) null);
    }
}
