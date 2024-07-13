package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.dynamic.d;

public class DynamicVideoView extends DynamicBaseWidgetImp implements d {

    /* renamed from: a  reason: collision with root package name */
    TextView f18624a;

    /* renamed from: b  reason: collision with root package name */
    boolean f18625b = false;

    public boolean e() {
        return true;
    }

    public DynamicVideoView(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        this.o = new View(context);
        this.o.setTag(Integer.valueOf(getClickArea()));
        this.f18624a = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) b.a(context, 40.0f), (int) b.a(context, 15.0f));
        layoutParams.gravity = 85;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.f18624a.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f18624a.setBackground(gradientDrawable);
        this.f18624a.setTextSize(10.0f);
        this.f18624a.setGravity(17);
        this.f18624a.setTextColor(-1);
        this.f18624a.setVisibility(8);
        addView(this.f18624a);
        addView(this.o, getWidgetLayoutParams());
        dynamicRootView.setVideoListener(this);
    }

    public boolean h() {
        super.h();
        double d2 = 0.0d;
        double d3 = 0.0d;
        for (h hVar = this.m; hVar != null; hVar = hVar.k()) {
            double e2 = d3 + ((double) hVar.e());
            double f2 = d2 + ((double) hVar.f());
            d3 = e2 - ((double) hVar.c());
            d2 = f2 - ((double) hVar.d());
        }
        try {
            float f3 = (float) d3;
            float f4 = (float) d2;
            ((DynamicRoot) this.n.getChildAt(0)).f18606a.a((int) b.a(getContext(), f3), (int) b.a(getContext(), f4), (int) b.a(getContext(), f3 + this.f18590e), (int) b.a(getContext(), f4 + this.f18591f));
        } catch (Exception unused) {
        }
        this.n.a(d3, d2, (double) this.f18590e, (double) this.f18591f, this.l.o());
        return true;
    }

    public void setTimeUpdate(int i) {
        String str;
        String str2;
        if (!this.m.i().e().ah() || i <= 0 || this.f18625b) {
            this.f18625b = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                b(getChildAt(i2));
            }
            this.f18624a.setVisibility(8);
            return;
        }
        if (i >= 60) {
            str = "" + BuildConfig.ADAPTER_VERSION + (i / 60);
        } else {
            str = "00";
        }
        String str3 = str + ":";
        int i3 = i % 60;
        if (i3 > 9) {
            str2 = str3 + i3;
        } else {
            str2 = str3 + BuildConfig.ADAPTER_VERSION + i3;
        }
        this.f18624a.setText(str2);
        this.f18624a.setVisibility(0);
    }

    private void b(View view) {
        if (view != this.f18624a) {
            int i = 0;
            view.setVisibility(0);
            if (view instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i < viewGroup.getChildCount()) {
                        b(viewGroup.getChildAt(i));
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void a() {
        this.f18624a.setVisibility(8);
    }
}
