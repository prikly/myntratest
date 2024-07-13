package com.explorestack.iab.vast.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.explorestack.iab.utils.Assets;
import com.explorestack.iab.utils.IabElement;
import com.explorestack.iab.utils.IabElementStyle;

public class IabTextView extends TextView implements IabElement {

    /* renamed from: a  reason: collision with root package name */
    public final RectF f3324a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public GradientDrawable f3325b;

    /* renamed from: c  reason: collision with root package name */
    public Paint f3326c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3327d = false;

    public IabTextView(Context context) {
        super(context);
        a(context);
    }

    public void a(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f3325b = gradientDrawable;
        gradientDrawable.setColor(Assets.backgroundColor);
        this.f3325b.setShape(0);
        setBackgroundDrawable(this.f3325b);
        setGravity(17);
        setMaxLines(1);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3327d && this.f3326c != null) {
            float height = ((float) getHeight()) / 2.0f;
            canvas.drawRoundRect(this.f3324a, height, height, this.f3326c);
        }
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            float size = (float) ((View.MeasureSpec.getSize(i2) - getCompoundPaddingTop()) - getCompoundPaddingRight());
            if (getTextSize() != size) {
                setTextSize(0, size);
            }
        }
        if (mode == 1073741824 && getText() != null) {
            int size2 = (View.MeasureSpec.getSize(i) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            float measureText = getPaint().measureText(getText(), 0, getText().length());
            float f2 = (float) size2;
            if (f2 < measureText) {
                float textSize = (float) ((int) (getTextSize() * (f2 / measureText)));
                if (getTextSize() != textSize) {
                    setTextSize(0, textSize);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Paint paint;
        super.onSizeChanged(i, i2, i3, i4);
        GradientDrawable gradientDrawable = this.f3325b;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(((float) i2) / 2.0f);
        }
        if (this.f3327d && (paint = this.f3326c) != null) {
            float strokeWidth = paint.getStrokeWidth() / 2.0f;
            float f2 = 0.0f + strokeWidth;
            this.f3324a.set(f2, f2, ((float) i) - strokeWidth, ((float) i2) - strokeWidth);
        }
    }

    public void setBackgroundColor(int i) {
        GradientDrawable gradientDrawable = this.f3325b;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i);
        }
    }

    public void setStyle(IabElementStyle iabElementStyle) {
        boolean booleanValue = iabElementStyle.isOutlined().booleanValue();
        this.f3327d = booleanValue;
        if (booleanValue) {
            Paint paint = new Paint(1);
            this.f3326c = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f3326c.setColor(iabElementStyle.getStrokeColor().intValue());
            this.f3326c.setStrokeWidth(iabElementStyle.getStrokeWidth(getContext()).floatValue());
        }
        setTextColor(iabElementStyle.getStrokeColor().intValue());
        setBackgroundColor(iabElementStyle.getFillColor().intValue());
        setTextSize(0, iabElementStyle.getFontSize(getContext()).floatValue());
        setTypeface(Typeface.create(Typeface.DEFAULT, iabElementStyle.getFontStyle().intValue()));
        setAlpha(iabElementStyle.getOpacity().floatValue());
        setPadding(iabElementStyle.getPaddingLeft(getContext()).intValue(), iabElementStyle.getPaddingTop(getContext()).intValue(), iabElementStyle.getPaddingRight(getContext()).intValue(), iabElementStyle.getPaddingBottom(getContext()).intValue());
    }
}
