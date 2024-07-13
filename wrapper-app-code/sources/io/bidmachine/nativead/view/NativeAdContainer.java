package io.bidmachine.nativead.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import io.bidmachine.utils.ViewHelper;

class NativeAdContainer extends FrameLayout {
    FrameLayout innerContainer;
    View previousConfiguredAdContainer;

    public NativeAdContainer(Context context) {
        super(context);
        init(context);
    }

    public NativeAdContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public NativeAdContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public NativeAdContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }

    private void init(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.innerContainer = frameLayout;
        addView((View) frameLayout, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-1, -1));
    }

    public void addView(View view) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view);
        } else {
            super.addView(view);
        }
    }

    public void addView(View view, int i) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view, i);
        } else {
            super.addView(view, i);
        }
    }

    public void addView(View view, int i, int i2) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view, i, i2);
        } else {
            super.addView(view, i, i2);
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    public void removeView(View view) {
        if (view == this.previousConfiguredAdContainer) {
            removePreviousAdContainer();
            return;
        }
        FrameLayout frameLayout = this.innerContainer;
        if (frameLayout != null) {
            frameLayout.removeView(view);
        }
    }

    public void bringChildToFront(View view) {
        FrameLayout frameLayout = this.innerContainer;
        if (frameLayout != null) {
            frameLayout.bringChildToFront(view);
        }
    }

    public void removeAllViews() {
        FrameLayout frameLayout = this.innerContainer;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    /* access modifiers changed from: protected */
    public void configureContainer(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        super.removeView(this.innerContainer);
        ViewHelper.removeViewFromParent(this.innerContainer);
        ViewHelper.removeViewFromParent(viewGroup);
        removePreviousAdContainer();
        super.addView(viewGroup, 0, layoutParams);
        viewGroup.addView(this.innerContainer, 0, layoutParams);
        this.previousConfiguredAdContainer = viewGroup;
    }

    /* access modifiers changed from: protected */
    public void deConfigureContainer() {
        if (this.previousConfiguredAdContainer != null) {
            ViewHelper.removeViewFromParent(this.innerContainer);
            removePreviousAdContainer();
            super.addView(this.innerContainer, 0, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    /* access modifiers changed from: protected */
    public void removePreviousAdContainer() {
        View view = this.previousConfiguredAdContainer;
        if (view != null) {
            super.removeView(view);
            this.previousConfiguredAdContainer = null;
        }
    }
}
