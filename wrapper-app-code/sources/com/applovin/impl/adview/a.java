package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

public class a extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private final ProgressBar f14005a;

    public a(Context context, int i, int i2) {
        super(context);
        RelativeLayout.LayoutParams layoutParams;
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, (AttributeSet) null, i2);
        this.f14005a = progressBar;
        progressBar.setIndeterminate(true);
        this.f14005a.setClickable(false);
        if (i == -2 || i == -1) {
            layoutParams = new RelativeLayout.LayoutParams(i, i);
        } else {
            int dpToPx = AppLovinSdkUtils.dpToPx(context, i);
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        }
        layoutParams.addRule(13);
        this.f14005a.setLayoutParams(layoutParams);
        addView(this.f14005a);
    }

    public void a() {
        setVisibility(0);
    }

    public void b() {
        setVisibility(8);
    }

    public void setColor(int i) {
        this.f14005a.getIndeterminateDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}
