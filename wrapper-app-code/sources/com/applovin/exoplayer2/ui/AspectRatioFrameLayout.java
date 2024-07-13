package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.applovin.sdk.R;

public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final b f13833a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public a f13834b;

    /* renamed from: c  reason: collision with root package name */
    private float f13835c;

    /* renamed from: d  reason: collision with root package name */
    private int f13836d;

    public interface a {
        void a(float f2, float f3, boolean z);
    }

    private final class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private float f13838b;

        /* renamed from: c  reason: collision with root package name */
        private float f13839c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f13840d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f13841e;

        private b() {
        }

        public void a(float f2, float f3, boolean z) {
            this.f13838b = f2;
            this.f13839c = f3;
            this.f13840d = z;
            if (!this.f13841e) {
                this.f13841e = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        public void run() {
            this.f13841e = false;
            if (AspectRatioFrameLayout.this.f13834b != null) {
                AspectRatioFrameLayout.this.f13834b.a(this.f13838b, this.f13839c, this.f13840d);
            }
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13836d = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AppLovinAspectRatioFrameLayout, 0, 0);
            try {
                this.f13836d = obtainStyledAttributes.getInt(R.styleable.AppLovinAspectRatioFrameLayout_al_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f13833a = new b();
    }

    public int getResizeMode() {
        return this.f13836d;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r4 > 0.0f) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r4 > 0.0f) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.f13835c
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto L_0x000b
            return
        L_0x000b:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.f13835c
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x0031
            com.applovin.exoplayer2.ui.AspectRatioFrameLayout$b r9 = r8.f13833a
            float r10 = r8.f13835c
            r0 = 0
            r9.a(r10, r3, r0)
            return
        L_0x0031:
            int r5 = r8.f13836d
            r6 = 1
            if (r5 == 0) goto L_0x004e
            if (r5 == r6) goto L_0x0049
            r7 = 2
            if (r5 == r7) goto L_0x0043
            r7 = 4
            if (r5 == r7) goto L_0x003f
            goto L_0x0053
        L_0x003f:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0049
        L_0x0043:
            float r9 = r8.f13835c
            float r2 = r2 * r9
            int r9 = (int) r2
            goto L_0x0053
        L_0x0049:
            float r10 = r8.f13835c
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L_0x0053
        L_0x004e:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0043
            goto L_0x0049
        L_0x0053:
            com.applovin.exoplayer2.ui.AspectRatioFrameLayout$b r10 = r8.f13833a
            float r1 = r8.f13835c
            r10.a(r1, r3, r6)
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f2) {
        if (this.f13835c != f2) {
            this.f13835c = f2;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
        this.f13834b = aVar;
    }

    public void setResizeMode(int i) {
        if (this.f13836d != i) {
            this.f13836d = i;
            requestLayout();
        }
    }
}
