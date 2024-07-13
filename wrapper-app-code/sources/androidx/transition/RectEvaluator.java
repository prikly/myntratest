package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

class RectEvaluator implements TypeEvaluator<Rect> {
    private Rect mRect;

    RectEvaluator() {
    }

    public Rect evaluate(float f2, Rect rect, Rect rect2) {
        int i = rect.left + ((int) (((float) (rect2.left - rect.left)) * f2));
        int i2 = rect.top + ((int) (((float) (rect2.top - rect.top)) * f2));
        int i3 = rect.right + ((int) (((float) (rect2.right - rect.right)) * f2));
        int i4 = rect.bottom + ((int) (((float) (rect2.bottom - rect.bottom)) * f2));
        Rect rect3 = this.mRect;
        if (rect3 == null) {
            return new Rect(i, i2, i3, i4);
        }
        rect3.set(i, i2, i3, i4);
        return this.mRect;
    }
}
