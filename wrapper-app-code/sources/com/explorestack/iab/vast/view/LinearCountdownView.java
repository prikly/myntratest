package com.explorestack.iab.vast.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.explorestack.iab.utils.Assets;
import com.explorestack.iab.utils.IabElement;
import com.explorestack.iab.utils.IabElementStyle;
import com.explorestack.iab.utils.Utils;

public class LinearCountdownView extends View implements IabElement {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f3328a = new Paint(1);

    /* renamed from: b  reason: collision with root package name */
    public float f3329b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public float f3330c = 15.0f;

    /* renamed from: d  reason: collision with root package name */
    public int f3331d = Assets.mainAssetsColor;

    /* renamed from: e  reason: collision with root package name */
    public int f3332e = 0;

    public LinearCountdownView(Context context) {
        super(context);
        a();
    }

    public final void a() {
        this.f3330c = (float) Utils.dpToPx(getContext(), 4.0f);
    }

    public void changePercentage(float f2) {
        this.f3329b = f2;
        postInvalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (((float) getMeasuredHeight()) / 2.0f) + ((float) getPaddingTop());
        this.f3328a.setStrokeWidth(this.f3330c);
        this.f3328a.setColor(this.f3332e);
        float f2 = measuredHeight;
        float f3 = measuredHeight;
        canvas.drawLine((float) getPaddingLeft(), f2, (float) (getPaddingLeft() + width), f3, this.f3328a);
        this.f3328a.setColor(this.f3331d);
        Canvas canvas2 = canvas;
        canvas2.drawLine((float) getPaddingLeft(), f2, ((float) getPaddingLeft()) + ((((float) width) * this.f3329b) / 100.0f), f3, this.f3328a);
    }

    public void setStyle(IabElementStyle iabElementStyle) {
        this.f3331d = iabElementStyle.getStrokeColor().intValue();
        this.f3332e = iabElementStyle.getFillColor().intValue();
        this.f3330c = iabElementStyle.getStrokeWidth(getContext()).floatValue();
        setAlpha(iabElementStyle.getOpacity().floatValue());
        postInvalidate();
    }
}
