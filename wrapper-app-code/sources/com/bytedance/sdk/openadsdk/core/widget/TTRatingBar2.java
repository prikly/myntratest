package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;

public class TTRatingBar2 extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    private static final int f1756h = ((int) v.c(m.a(), 1.0f));
    private static final int i = ((int) v.c(m.a(), 0.0f));
    private static final int j = ((int) v.c(m.a(), 1.0f));
    private static final int k = ((int) v.c(m.a(), 3.0f));

    /* renamed from: a  reason: collision with root package name */
    LinearLayout f1757a = new LinearLayout(getContext());

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f1758b = new LinearLayout(getContext());

    /* renamed from: c  reason: collision with root package name */
    private float f1759c;

    /* renamed from: d  reason: collision with root package name */
    private float f1760d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1761e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1762f;

    /* renamed from: g  reason: collision with root package name */
    private double f1763g;

    public TTRatingBar2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1757a.setOrientation(0);
        this.f1757a.setGravity(8388611);
        this.f1758b.setOrientation(0);
        this.f1758b.setGravity(8388611);
        this.f1761e = t.c(context, "tt_star_thick");
        this.f1762f = t.c(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.f1761e;
    }

    public Drawable getStarFillDrawable() {
        return this.f1762f;
    }

    public void a(double d2, int i2, int i3) {
        float f2 = (float) i3;
        this.f1759c = (float) ((int) v.c(m.a(), f2));
        this.f1760d = (float) ((int) v.c(m.a(), f2));
        this.f1763g = d2;
        this.f1757a.removeAllViews();
        this.f1758b.removeAllViews();
        removeAllViews();
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i2);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f1758b.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.f1757a.addView(starImageView2);
        }
        addView(this.f1757a);
        addView(this.f1758b);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.f1759c, (int) this.f1760d));
        imageView.setPadding(f1756h, i, j, k);
        return imageView;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f1757a.measure(i2, i3);
        double d2 = this.f1763g;
        float f2 = this.f1759c;
        int i4 = f1756h;
        this.f1758b.measure(View.MeasureSpec.makeMeasureSpec((int) (((double) ((((float) ((int) d2)) * f2) + ((float) i4))) + (((double) (f2 - ((float) (i4 + j)))) * (d2 - ((double) ((int) d2))))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f1757a.getMeasuredHeight(), 1073741824));
    }
}
