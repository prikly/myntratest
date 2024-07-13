package androidx.core.content.res;

final class ViewingConditions {
    static final ViewingConditions DEFAULT = make(CamUtils.WHITE_POINT_D65, (float) ((((double) CamUtils.yFromLStar(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float mAw;
    private final float mC;
    private final float mFl;
    private final float mFlRoot;
    private final float mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;
    private final float mZ;

    /* access modifiers changed from: package-private */
    public float getAw() {
        return this.mAw;
    }

    /* access modifiers changed from: package-private */
    public float getN() {
        return this.mN;
    }

    /* access modifiers changed from: package-private */
    public float getNbb() {
        return this.mNbb;
    }

    /* access modifiers changed from: package-private */
    public float getNcb() {
        return this.mNcb;
    }

    /* access modifiers changed from: package-private */
    public float getC() {
        return this.mC;
    }

    /* access modifiers changed from: package-private */
    public float getNc() {
        return this.mNc;
    }

    /* access modifiers changed from: package-private */
    public float[] getRgbD() {
        return this.mRgbD;
    }

    /* access modifiers changed from: package-private */
    public float getFl() {
        return this.mFl;
    }

    /* access modifiers changed from: package-private */
    public float getFlRoot() {
        return this.mFlRoot;
    }

    /* access modifiers changed from: package-private */
    public float getZ() {
        return this.mZ;
    }

    private ViewingConditions(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.mN = f2;
        this.mAw = f3;
        this.mNbb = f4;
        this.mNcb = f5;
        this.mC = f6;
        this.mNc = f7;
        this.mRgbD = fArr;
        this.mFl = f8;
        this.mFlRoot = f9;
        this.mZ = f10;
    }

    static ViewingConditions make(float[] fArr, float f2, float f3, float f4, boolean z) {
        float f5;
        float f6 = f2;
        float[][] fArr2 = CamUtils.XYZ_TO_CAM16RGB;
        float f7 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f8 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f9 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f10 = (f4 / 10.0f) + 0.8f;
        float lerp = ((double) f10) >= 0.9d ? CamUtils.lerp(0.59f, 0.69f, (f10 - 0.9f) * 10.0f) : CamUtils.lerp(0.525f, 0.59f, (f10 - 0.8f) * 10.0f);
        if (z) {
            f5 = 1.0f;
        } else {
            f5 = (1.0f - (((float) Math.exp((double) (((-f6) - 42.0f) / 92.0f))) * 0.2777778f)) * f10;
        }
        double d2 = (double) f5;
        if (d2 > 1.0d) {
            f5 = 1.0f;
        } else if (d2 < 0.0d) {
            f5 = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f7) * f5) + 1.0f) - f5, (((100.0f / f8) * f5) + 1.0f) - f5, (((100.0f / f9) * f5) + 1.0f) - f5};
        float f11 = 1.0f / ((5.0f * f6) + 1.0f);
        float f12 = f11 * f11 * f11 * f11;
        float f13 = 1.0f - f12;
        float cbrt = (f12 * f6) + (0.1f * f13 * f13 * ((float) Math.cbrt(((double) f6) * 5.0d)));
        float yFromLStar = CamUtils.yFromLStar(f3) / fArr[1];
        double d3 = (double) yFromLStar;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * cbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * cbrt) * f8)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * cbrt) * f9)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new ViewingConditions(yFromLStar, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, lerp, f10, fArr3, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }
}
