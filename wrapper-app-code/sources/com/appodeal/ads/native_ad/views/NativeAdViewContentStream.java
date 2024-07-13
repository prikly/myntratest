package com.appodeal.ads.native_ad.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appodeal.ads.NativeAd;
import com.appodeal.ads.NativeIconView;
import com.appodeal.ads.NativeMediaView;
import com.appodeal.ads.f1;

public class NativeAdViewContentStream extends NativeAdView {
    public NativeAdViewContentStream(Context context) {
        super(context);
    }

    public NativeAdViewContentStream(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeAdViewContentStream(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NativeAdViewContentStream(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public NativeAdViewContentStream(Context context, NativeAd nativeAd) {
        super(context, nativeAd, RewardedVideo.VIDEO_MODE_DEFAULT);
    }

    public NativeAdViewContentStream(Context context, NativeAd nativeAd, String str) {
        super(context, nativeAd, str);
    }

    public final void a() {
        if (!this.q) {
            TypedArray obtainStyledAttributes = this.p.obtainStyledAttributes(new int[]{16843534});
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            setBackground(drawable);
            this.k = new RelativeLayout(this.p);
            this.k.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            int round = Math.round(f1.l(this.p) * 5.0f);
            this.k.setPadding(round, round, round, round);
            this.k.setVisibility(8);
            addView(this.k);
            RelativeLayout relativeLayout = new RelativeLayout(this.p);
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            relativeLayout.setId(View.generateViewId());
            LinearLayout linearLayout = new LinearLayout(this.p);
            this.n = linearLayout;
            linearLayout.setOrientation(0);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            this.n.setLayoutParams(layoutParams);
            this.n.setId(View.generateViewId());
            relativeLayout.addView(this.n);
            TextView textView = new TextView(this.p);
            this.m = textView;
            textView.setTextSize(2, 10.0f);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 16;
            this.m.setLayoutParams(layoutParams2);
            c();
            this.n.addView(this.m);
            this.l = new RelativeLayout(this.p);
            this.l.setLayoutParams(new RelativeLayout.LayoutParams(-2, Math.round(f1.l(this.p) * 20.0f)));
            this.n.addView(this.l);
            this.f16138h = new NativeIconView(this.p);
            this.r = Math.round(f1.l(this.p) * 50.0f);
            int i = this.r;
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i, i);
            layoutParams3.setMargins(0, 0, Math.round(f1.l(this.p) * 10.0f), 0);
            layoutParams3.addRule(10);
            layoutParams3.addRule(9);
            this.f16138h.setLayoutParams(layoutParams3);
            this.f16138h.setId(View.generateViewId());
            relativeLayout.addView(this.f16138h);
            TextView textView2 = new TextView(this.p);
            this.f16133c = textView2;
            TextView textView3 = textView2;
            textView2.setTextSize(2, 16.0f);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.setMargins(0, 0, 0, Math.round(f1.l(this.p) * 5.0f));
            layoutParams4.addRule(1, this.f16138h.getId());
            layoutParams4.addRule(0, this.n.getId());
            this.f16133c.setLayoutParams(layoutParams4);
            this.f16133c.setId(View.generateViewId());
            relativeLayout.addView(this.f16133c);
            RatingBar ratingBar = new RatingBar(this.p, (AttributeSet) null, 16842877);
            this.f16135e = ratingBar;
            ratingBar.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams5.addRule(1, this.f16138h.getId());
            layoutParams5.addRule(3, this.f16133c.getId());
            this.f16135e.setLayoutParams(layoutParams5);
            this.f16135e.setId(View.generateViewId());
            relativeLayout.addView(this.f16135e);
            this.k.addView(relativeLayout);
            this.i = new NativeMediaView(this.p);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -1);
            int round2 = Math.round(f1.l(this.p) * 10.0f);
            layoutParams6.setMargins(0, round2, 0, round2);
            layoutParams6.addRule(3, relativeLayout.getId());
            this.i.setLayoutParams(layoutParams6);
            this.i.setId(View.generateViewId());
            this.k.addView(this.i);
            this.f16134d = new TextView(this.p);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
            int round3 = Math.round(f1.l(this.p) * 3.0f);
            int round4 = Math.round(f1.l(this.p) * 5.0f);
            layoutParams7.setMargins(round3, 0, 3, 3);
            layoutParams7.addRule(11);
            layoutParams7.addRule(3, this.i.getId());
            this.f16134d.setLayoutParams(layoutParams7);
            this.f16134d.setPadding(round4, round4, round4, round4);
            this.f16134d.setId(View.generateViewId());
            b();
            this.k.addView(this.f16134d);
            TextView textView4 = new TextView(this.p);
            this.f16136f = textView4;
            TextView textView5 = textView4;
            textView4.setTextSize(2, 12.0f);
            RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams8.setMargins(Math.round(f1.l(this.p) * 5.0f), 0, 0, 0);
            layoutParams8.addRule(0, this.f16134d.getId());
            layoutParams8.addRule(3, this.i.getId());
            this.f16136f.setLayoutParams(layoutParams8);
            ((TextView) this.f16136f).setMaxLines(2);
            ((TextView) this.f16136f).setMinLines(2);
            this.f16136f.setId(View.generateViewId());
            this.k.addView(this.f16136f);
            this.q = true;
        }
        if (this.o != null) {
            this.f16138h.measure(getWidth(), getHeight());
            ((TextView) this.f16133c).setText(this.o.getTitle());
            this.f16133c.measure(getWidth(), getHeight());
            ((TextView) this.f16136f).setText(this.o.getDescription());
            this.f16136f.measure(getWidth(), getHeight());
            if (this.o.getRating() > 0.0f) {
                ((RatingBar) this.f16135e).setRating(this.o.getRating());
                this.f16135e.setVisibility(0);
            } else {
                this.f16135e.setVisibility(8);
            }
            this.f16135e.measure(getWidth(), getHeight());
            if (this.o.getCallToAction() == null || this.o.getCallToAction().isEmpty() || this.o.getCallToAction().equals("")) {
                this.f16134d.setVisibility(8);
            } else {
                ((TextView) this.f16134d).setText(this.o.getCallToAction());
                this.f16134d.setVisibility(0);
            }
            this.f16134d.measure(getWidth(), getHeight());
            if (!(Math.max(this.f16136f.getMeasuredHeight(), this.f16134d.getMeasuredHeight()) + this.i.getMeasuredHeight() + Math.max(this.f16138h.getMeasuredHeight(), this.f16135e.getMeasuredHeight() + this.f16133c.getMeasuredHeight()) <= getHeight() || getLayoutParams() == null || getLayoutParams().height == -2 || getLayoutParams().height == -1)) {
                this.i.setVisibility(8);
            }
            View providerView = this.o.getProviderView(this.p);
            this.f16137g = providerView;
            if (providerView != null) {
                if (providerView.getParent() != null && (this.f16137g.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.f16137g.getParent()).removeView(this.f16137g);
                }
                this.l.removeAllViews();
                this.l.addView(this.f16137g, new ViewGroup.LayoutParams(-2, -2));
            } else {
                RelativeLayout relativeLayout2 = this.l;
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(8);
                }
            }
            registerView(this.o, this.t);
            this.k.setVisibility(0);
        }
    }
}
