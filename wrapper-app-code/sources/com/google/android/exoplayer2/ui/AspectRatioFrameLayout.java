package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public final class AspectRatioFrameLayout extends FrameLayout {
    /* access modifiers changed from: private */
    public AspectRatioListener aspectRatioListener;
    private final AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher;
    private int resizeMode = 0;
    private float videoAspectRatio;

    public interface AspectRatioListener {
        void onAspectRatioUpdated(float f2, float f3, boolean z);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AspectRatioFrameLayout, 0, 0);
            try {
                this.resizeMode = obtainStyledAttributes.getInt(R.styleable.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.aspectRatioUpdateDispatcher = new AspectRatioUpdateDispatcher();
    }

    public void setAspectRatio(float f2) {
        if (this.videoAspectRatio != f2) {
            this.videoAspectRatio = f2;
            requestLayout();
        }
    }

    public void setAspectRatioListener(AspectRatioListener aspectRatioListener2) {
        this.aspectRatioListener = aspectRatioListener2;
    }

    public int getResizeMode() {
        return this.resizeMode;
    }

    public void setResizeMode(int i) {
        if (this.resizeMode != i) {
            this.resizeMode = i;
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        float f2;
        float f3;
        super.onMeasure(i, i2);
        if (this.videoAspectRatio > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f4 = (float) measuredWidth;
            float f5 = (float) measuredHeight;
            float f6 = f4 / f5;
            float f7 = (this.videoAspectRatio / f6) - 1.0f;
            if (Math.abs(f7) <= 0.01f) {
                this.aspectRatioUpdateDispatcher.scheduleUpdate(this.videoAspectRatio, f6, false);
                return;
            }
            int i3 = this.resizeMode;
            if (i3 != 0) {
                if (i3 == 1) {
                    f3 = this.videoAspectRatio;
                } else if (i3 != 2) {
                    if (i3 == 4) {
                        if (f7 > 0.0f) {
                            f2 = this.videoAspectRatio;
                        } else {
                            f3 = this.videoAspectRatio;
                        }
                    }
                    this.aspectRatioUpdateDispatcher.scheduleUpdate(this.videoAspectRatio, f6, true);
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
                } else {
                    f2 = this.videoAspectRatio;
                }
                measuredHeight = (int) (f4 / f3);
                this.aspectRatioUpdateDispatcher.scheduleUpdate(this.videoAspectRatio, f6, true);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            } else if (f7 > 0.0f) {
                f3 = this.videoAspectRatio;
                measuredHeight = (int) (f4 / f3);
                this.aspectRatioUpdateDispatcher.scheduleUpdate(this.videoAspectRatio, f6, true);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            } else {
                f2 = this.videoAspectRatio;
            }
            measuredWidth = (int) (f5 * f2);
            this.aspectRatioUpdateDispatcher.scheduleUpdate(this.videoAspectRatio, f6, true);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    private final class AspectRatioUpdateDispatcher implements Runnable {
        private boolean aspectRatioMismatch;
        private boolean isScheduled;
        private float naturalAspectRatio;
        private float targetAspectRatio;

        private AspectRatioUpdateDispatcher() {
        }

        public void scheduleUpdate(float f2, float f3, boolean z) {
            this.targetAspectRatio = f2;
            this.naturalAspectRatio = f3;
            this.aspectRatioMismatch = z;
            if (!this.isScheduled) {
                this.isScheduled = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        public void run() {
            this.isScheduled = false;
            if (AspectRatioFrameLayout.this.aspectRatioListener != null) {
                AspectRatioFrameLayout.this.aspectRatioListener.onAspectRatioUpdated(this.targetAspectRatio, this.naturalAspectRatio, this.aspectRatioMismatch);
            }
        }
    }
}
