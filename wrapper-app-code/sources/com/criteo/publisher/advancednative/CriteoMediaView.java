package com.criteo.publisher.advancednative;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class CriteoMediaView extends FrameLayout {
    private final ImageView imageView;
    private Drawable placeholder;

    public CriteoMediaView(Context context) {
        super(context);
        this.imageView = initImageView(context);
    }

    public CriteoMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CriteoMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.imageView = initImageView(context, attributeSet, i, 0);
    }

    public CriteoMediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.imageView = initImageView(context, attributeSet, i, i2);
    }

    private ImageView initImageView(Context context) {
        ImageView imageView2 = new ImageView(context);
        addView(imageView2);
        return imageView2;
    }

    private ImageView initImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        ImageView initImageView = initImageView(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843033}, i, i2);
        try {
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                initImageView.setImageDrawable(drawable);
                this.placeholder = drawable;
            }
            return initImageView;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setPlaceholder(Drawable drawable) {
        this.placeholder = drawable;
    }

    public Drawable getPlaceholder() {
        return this.placeholder;
    }

    /* access modifiers changed from: package-private */
    public ImageView getImageView() {
        return this.imageView;
    }
}
