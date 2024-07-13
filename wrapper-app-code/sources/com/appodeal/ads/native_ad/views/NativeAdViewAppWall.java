package com.appodeal.ads.native_ad.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
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
import com.appodeal.ads.f1;

public class NativeAdViewAppWall extends NativeAdView {
    public NativeAdViewAppWall(Context context) {
        super(context);
    }

    public NativeAdViewAppWall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeAdViewAppWall(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NativeAdViewAppWall(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public NativeAdViewAppWall(Context context, NativeAd nativeAd) {
        super(context, nativeAd, RewardedVideo.VIDEO_MODE_DEFAULT);
    }

    public NativeAdViewAppWall(Context context, NativeAd nativeAd, String str) {
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
            LinearLayout linearLayout = new LinearLayout(this.p);
            this.n = linearLayout;
            linearLayout.setOrientation(0);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            this.n.setLayoutParams(layoutParams);
            this.n.setId(View.generateViewId());
            this.k.addView(this.n);
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
            this.r = Math.round(f1.l(this.p) * 70.0f);
            int i = this.r;
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i, i);
            layoutParams3.setMargins(0, 0, Math.round(f1.l(this.p) * 10.0f), 0);
            layoutParams3.addRule(10);
            layoutParams3.addRule(9);
            this.f16138h.setLayoutParams(layoutParams3);
            this.f16138h.setId(View.generateViewId());
            this.k.addView(this.f16138h);
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
            this.k.addView(this.f16133c);
            this.f16134d = new TextView(this.p);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
            int round2 = Math.round(f1.l(this.p) * 3.0f);
            int round3 = Math.round(f1.l(this.p) * 5.0f);
            layoutParams5.setMargins(round2, 0, 3, 3);
            layoutParams5.addRule(11);
            layoutParams5.addRule(15);
            this.f16134d.setLayoutParams(layoutParams5);
            this.f16134d.setPadding(round3, round3, round3, round3);
            this.f16134d.setId(View.generateViewId());
            b();
            this.k.addView(this.f16134d);
            TextView textView4 = new TextView(this.p);
            this.f16136f = textView4;
            TextView textView5 = textView4;
            textView4.setTextSize(2, 12.0f);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams6.setMargins(0, 0, 0, Math.round(f1.l(this.p) * 5.0f));
            layoutParams6.addRule(1, this.f16138h.getId());
            layoutParams6.addRule(0, this.f16134d.getId());
            layoutParams6.addRule(3, this.f16133c.getId());
            this.f16136f.setLayoutParams(layoutParams6);
            ((TextView) this.f16136f).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView) this.f16136f).setMaxLines(3);
            ((TextView) this.f16136f).setMinLines(3);
            this.f16136f.setId(View.generateViewId());
            this.k.addView(this.f16136f);
            RatingBar ratingBar = new RatingBar(this.p, (AttributeSet) null, 16842877);
            this.f16135e = ratingBar;
            ratingBar.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams7.addRule(1, this.f16138h.getId());
            layoutParams7.addRule(3, this.f16136f.getId());
            this.f16135e.setLayoutParams(layoutParams7);
            this.f16135e.setId(View.generateViewId());
            this.k.addView(this.f16135e);
            this.q = true;
        }
        NativeAd nativeAd = this.o;
        if (nativeAd != null) {
            ((TextView) this.f16133c).setText(nativeAd.getTitle());
            ((TextView) this.f16136f).setText(this.o.getDescription());
            if (this.o.getRating() > 0.0f) {
                ((RatingBar) this.f16135e).setRating(this.o.getRating());
                this.f16135e.setVisibility(0);
            } else {
                this.f16135e.setVisibility(8);
            }
            if (this.o.getCallToAction() == null || this.o.getCallToAction().isEmpty() || this.o.getCallToAction().equals("")) {
                this.f16134d.setVisibility(8);
            } else {
                ((TextView) this.f16134d).setText(this.o.getCallToAction());
                this.f16134d.setVisibility(0);
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
                RelativeLayout relativeLayout = this.l;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                }
            }
            registerView(this.o, this.t);
            this.k.setVisibility(0);
        }
    }
}
