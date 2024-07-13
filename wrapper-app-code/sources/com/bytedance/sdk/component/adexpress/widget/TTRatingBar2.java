package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.utils.t;

public class TTRatingBar2 extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    LinearLayout f18802a = new LinearLayout(getContext());

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f18803b = new LinearLayout(getContext());

    /* renamed from: c  reason: collision with root package name */
    private float f18804c;

    /* renamed from: d  reason: collision with root package name */
    private float f18805d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f18806e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f18807f;

    /* renamed from: g  reason: collision with root package name */
    private double f18808g;

    public TTRatingBar2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18802a.setOrientation(0);
        this.f18802a.setGravity(8388611);
        this.f18803b.setOrientation(0);
        this.f18803b.setGravity(8388611);
        this.f18806e = t.c(context, "tt_star_thick");
        this.f18807f = t.c(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.f18806e;
    }

    public Drawable getStarFillDrawable() {
        return this.f18807f;
    }

    public void a(double d2, int i, int i2) {
        float f2 = (float) i2;
        this.f18804c = b.c(getContext(), f2);
        this.f18805d = b.c(getContext(), f2);
        this.f18808g = d2;
        removeAllViews();
        for (int i3 = 0; i3 < 5; i3++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f18803b.addView(starImageView);
        }
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.f18802a.addView(starImageView2);
        }
        addView(this.f18802a);
        addView(this.f18803b);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.f18804c, (int) this.f18805d));
        imageView.setPadding(1, 4, 1, 0);
        return imageView;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f18802a.measure(i, i2);
        double d2 = this.f18808g;
        float f2 = this.f18804c;
        this.f18803b.measure(View.MeasureSpec.makeMeasureSpec((int) (((double) ((((float) ((int) d2)) * f2) + 1.0f)) + (((double) (f2 - 2.0f)) * (d2 - ((double) ((int) d2))))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f18802a.getMeasuredHeight(), 1073741824));
    }
}
