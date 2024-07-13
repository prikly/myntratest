package com.appodeal.ads.native_ad.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class NativeAdViewContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f16840a;

    /* renamed from: b  reason: collision with root package name */
    public FrameLayout f16841b;

    public NativeAdViewContainer(Context context) {
        super(context);
        a(context);
    }

    public NativeAdViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public NativeAdViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public NativeAdViewContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context);
    }

    public final void a(Context context) {
        this.f16841b = new FrameLayout(context);
        addView((View) this.f16841b, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-1, -1));
    }

    public void addView(View view) {
        FrameLayout frameLayout = this.f16841b;
        if (view != frameLayout) {
            frameLayout.addView(view);
        } else {
            super.addView(view);
        }
    }

    public void addView(View view, int i) {
        FrameLayout frameLayout = this.f16841b;
        if (view != frameLayout) {
            frameLayout.addView(view, i);
        } else {
            super.addView(view, i);
        }
    }

    public void addView(View view, int i, int i2) {
        FrameLayout frameLayout = this.f16841b;
        if (view != frameLayout) {
            frameLayout.addView(view, i, i2);
        } else {
            super.addView(view, i, i2);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = this.f16841b;
        if (view != frameLayout) {
            frameLayout.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = this.f16841b;
        if (view != frameLayout) {
            frameLayout.addView(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
        }
    }

    public void bringChildToFront(View view) {
        FrameLayout frameLayout = this.f16841b;
        if (frameLayout != null) {
            frameLayout.bringChildToFront(view);
        }
    }

    public void configureContainer(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        super.removeView(this.f16841b);
        FrameLayout frameLayout = this.f16841b;
        if (!(frameLayout == null || frameLayout.getParent() == null)) {
            ((ViewGroup) this.f16841b.getParent()).removeView(this.f16841b);
        }
        if (!(viewGroup == null || viewGroup.getParent() == null)) {
            ((ViewGroup) viewGroup.getParent()).removeView(viewGroup);
        }
        ViewGroup viewGroup2 = this.f16840a;
        if (viewGroup2 != null) {
            super.removeView(viewGroup2);
            this.f16840a = null;
        }
        super.addView(viewGroup, 0, layoutParams);
        viewGroup.addView(this.f16841b, 0, layoutParams);
        this.f16840a = viewGroup;
    }

    public void deconfigureContainer() {
        if (this.f16840a != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            FrameLayout frameLayout = this.f16841b;
            if (!(frameLayout == null || frameLayout.getParent() == null)) {
                ((ViewGroup) this.f16841b.getParent()).removeView(this.f16841b);
            }
            ViewGroup viewGroup = this.f16840a;
            if (viewGroup != null) {
                super.removeView(viewGroup);
                this.f16840a = null;
            }
            super.addView(this.f16841b, 0, layoutParams);
        }
    }

    public void removeAllViews() {
        FrameLayout frameLayout = this.f16841b;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    public void removeView(View view) {
        ViewGroup viewGroup = this.f16840a;
        if (view != viewGroup) {
            FrameLayout frameLayout = this.f16841b;
            if (frameLayout != null) {
                frameLayout.removeView(view);
            }
        } else if (viewGroup != null) {
            super.removeView(viewGroup);
            this.f16840a = null;
        }
    }
}
