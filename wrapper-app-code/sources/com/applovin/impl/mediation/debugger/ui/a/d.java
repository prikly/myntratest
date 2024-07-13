package com.applovin.impl.mediation.debugger.ui.a;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;

public class d extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f14782a;

    /* renamed from: b  reason: collision with root package name */
    private AppLovinSdkUtils.Size f14783b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f14784c;

    /* renamed from: d  reason: collision with root package name */
    private RelativeLayout f14785d;

    public d(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, 16973840);
        this.f14782a = viewGroup;
        this.f14783b = size;
        this.f14784c = activity;
        requestWindowFeature(1);
    }

    public void dismiss() {
        this.f14785d.removeView(this.f14782a);
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f14784c, this.f14783b.getWidth()), AppLovinSdkUtils.dpToPx(this.f14784c, this.f14783b.getHeight()));
        layoutParams.addRule(13);
        this.f14782a.setLayoutParams(layoutParams);
        int dpToPx = AppLovinSdkUtils.dpToPx(this.f14784c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f14784c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f14784c.getResources().getDrawable(R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground((Drawable) null);
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                d.this.dismiss();
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f14784c);
        this.f14785d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f14785d.setBackgroundColor(RecyclerView.UNDEFINED_DURATION);
        this.f14785d.addView(imageButton);
        this.f14785d.addView(this.f14782a);
        this.f14785d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                d.this.dismiss();
            }
        });
        setContentView(this.f14785d);
    }
}
