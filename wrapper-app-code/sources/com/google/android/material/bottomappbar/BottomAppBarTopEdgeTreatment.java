package com.google.android.material.bottomappbar;

import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    private float cradleVerticalOffset;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public void getEdgePath(float f2, float f3, float f4, ShapePath shapePath) {
        float f5 = f2;
        ShapePath shapePath2 = shapePath;
        float f6 = this.fabDiameter;
        if (f6 == 0.0f) {
            shapePath2.lineTo(f5, 0.0f);
            return;
        }
        float f7 = ((this.fabMargin * 2.0f) + f6) / 2.0f;
        float f8 = f4 * this.roundedCornerRadius;
        float f9 = f3 + this.horizontalOffset;
        float f10 = (this.cradleVerticalOffset * f4) + ((1.0f - f4) * f7);
        if (f10 / f7 >= 1.0f) {
            shapePath2.lineTo(f5, 0.0f);
            return;
        }
        float f11 = f7 + f8;
        float f12 = f10 + f8;
        float sqrt = (float) Math.sqrt((double) ((f11 * f11) - (f12 * f12)));
        float f13 = f9 - sqrt;
        float f14 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f12)));
        float f15 = 90.0f - degrees;
        shapePath2.lineTo(f13, 0.0f);
        float f16 = f8 * 2.0f;
        float f17 = degrees;
        shapePath.addArc(f13 - f8, 0.0f, f13 + f8, f16, 270.0f, degrees);
        shapePath.addArc(f9 - f7, (-f7) - f10, f9 + f7, f7 - f10, 180.0f - f15, (f15 * 2.0f) - 180.0f);
        shapePath.addArc(f14 - f8, 0.0f, f14 + f8, f16, 270.0f - f17, f17);
        shapePath2.lineTo(f5, 0.0f);
    }

    public float getFabDiameter() {
        return this.fabDiameter;
    }

    public void setFabDiameter(float f2) {
        this.fabDiameter = f2;
    }

    /* access modifiers changed from: package-private */
    public void setHorizontalOffset(float f2) {
        this.horizontalOffset = f2;
    }

    /* access modifiers changed from: package-private */
    public float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    /* access modifiers changed from: package-private */
    public void setCradleVerticalOffset(float f2) {
        this.cradleVerticalOffset = f2;
    }

    /* access modifiers changed from: package-private */
    public float getFabCradleMargin() {
        return this.fabMargin;
    }

    /* access modifiers changed from: package-private */
    public void setFabCradleMargin(float f2) {
        this.fabMargin = f2;
    }

    /* access modifiers changed from: package-private */
    public float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    /* access modifiers changed from: package-private */
    public void setFabCradleRoundedCornerRadius(float f2) {
        this.roundedCornerRadius = f2;
    }
}
