package com.appodeal.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B3\b\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\u0011"}, d2 = {"Lcom/appodeal/ads/NativeMediaView;", "Landroid/widget/RelativeLayout;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Companion", "a", "apd_public"}, k = 1, mv = {1, 6, 0})
public final class NativeMediaView extends RelativeLayout {
    private static final float ASPECT_MULTIPLIER_HEIGHT_TO_WIDTH = 1.7777778f;
    private static final float ASPECT_MULTIPLIER_WIDTH_TO_HEIGHT = 0.5625f;
    public static final a Companion = new a();

    public static final class a {
    }

    public NativeMediaView(Context context) {
        this(context, (AttributeSet) null, 0, 0, 14, (DefaultConstructorMarker) null);
    }

    public NativeMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, (DefaultConstructorMarker) null);
    }

    public NativeMediaView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, (DefaultConstructorMarker) null);
    }

    public NativeMediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NativeMediaView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, measuredWidth);
        } else if (mode != 1073741824) {
            size = measuredWidth;
        }
        int i3 = (int) (((float) size) * ASPECT_MULTIPLIER_WIDTH_TO_HEIGHT);
        if (mode2 != 1073741824 || size2 >= i3) {
            size2 = i3;
        } else {
            size = (int) (((float) size2) * ASPECT_MULTIPLIER_HEIGHT_TO_WIDTH);
        }
        if (Math.abs(size2 - measuredHeight) >= 2 || Math.abs(size - measuredWidth) >= 2) {
            getLayoutParams().width = size;
            getLayoutParams().height = size2;
        }
        super.onMeasure(i, i2);
    }
}
