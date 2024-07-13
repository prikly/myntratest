package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.RoundRectDrawableWithShadow;

class CardViewBaseImpl implements CardViewImpl {
    final RectF mCornerRect = new RectF();

    public void onCompatPaddingChanged(CardViewDelegate cardViewDelegate) {
    }

    CardViewBaseImpl() {
    }

    public void initStatic() {
        RoundRectDrawableWithShadow.sRoundRectHelper = new RoundRectDrawableWithShadow.RoundRectHelper() {
            public void drawRoundRect(Canvas canvas, RectF rectF, float f2, Paint paint) {
                Canvas canvas2 = canvas;
                RectF rectF2 = rectF;
                float f3 = 2.0f * f2;
                float width = (rectF.width() - f3) - 1.0f;
                float height = (rectF.height() - f3) - 1.0f;
                if (f2 >= 1.0f) {
                    float f4 = f2 + 0.5f;
                    float f5 = -f4;
                    CardViewBaseImpl.this.mCornerRect.set(f5, f5, f4, f4);
                    int save = canvas.save();
                    canvas2.translate(rectF2.left + f4, rectF2.top + f4);
                    Paint paint2 = paint;
                    canvas.drawArc(CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(height, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint2);
                    canvas2.restoreToCount(save);
                    canvas.drawRect((rectF2.left + f4) - 1.0f, rectF2.top, (rectF2.right - f4) + 1.0f, rectF2.top + f4, paint2);
                    canvas.drawRect((rectF2.left + f4) - 1.0f, rectF2.bottom - f4, (rectF2.right - f4) + 1.0f, rectF2.bottom, paint2);
                }
                canvas.drawRect(rectF2.left, rectF2.top + f2, rectF2.right, rectF2.bottom - f2, paint);
            }
        };
    }

    public void initialize(CardViewDelegate cardViewDelegate, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        RoundRectDrawableWithShadow createBackground = createBackground(context, colorStateList, f2, f3, f4);
        createBackground.setAddPaddingForCorners(cardViewDelegate.getPreventCornerOverlap());
        cardViewDelegate.setCardBackground(createBackground);
        updatePadding(cardViewDelegate);
    }

    private RoundRectDrawableWithShadow createBackground(Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        return new RoundRectDrawableWithShadow(context.getResources(), colorStateList, f2, f3, f4);
    }

    public void updatePadding(CardViewDelegate cardViewDelegate) {
        Rect rect = new Rect();
        getShadowBackground(cardViewDelegate).getMaxShadowAndCornerPadding(rect);
        cardViewDelegate.setMinWidthHeightInternal((int) Math.ceil((double) getMinWidth(cardViewDelegate)), (int) Math.ceil((double) getMinHeight(cardViewDelegate)));
        cardViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void onPreventCornerOverlapChanged(CardViewDelegate cardViewDelegate) {
        getShadowBackground(cardViewDelegate).setAddPaddingForCorners(cardViewDelegate.getPreventCornerOverlap());
        updatePadding(cardViewDelegate);
    }

    public void setBackgroundColor(CardViewDelegate cardViewDelegate, ColorStateList colorStateList) {
        getShadowBackground(cardViewDelegate).setColor(colorStateList);
    }

    public ColorStateList getBackgroundColor(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getColor();
    }

    public void setRadius(CardViewDelegate cardViewDelegate, float f2) {
        getShadowBackground(cardViewDelegate).setCornerRadius(f2);
        updatePadding(cardViewDelegate);
    }

    public float getRadius(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getCornerRadius();
    }

    public void setElevation(CardViewDelegate cardViewDelegate, float f2) {
        getShadowBackground(cardViewDelegate).setShadowSize(f2);
    }

    public float getElevation(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getShadowSize();
    }

    public void setMaxElevation(CardViewDelegate cardViewDelegate, float f2) {
        getShadowBackground(cardViewDelegate).setMaxShadowSize(f2);
        updatePadding(cardViewDelegate);
    }

    public float getMaxElevation(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getMaxShadowSize();
    }

    public float getMinWidth(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getMinWidth();
    }

    public float getMinHeight(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getMinHeight();
    }

    private RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate cardViewDelegate) {
        return (RoundRectDrawableWithShadow) cardViewDelegate.getCardBackground();
    }
}
