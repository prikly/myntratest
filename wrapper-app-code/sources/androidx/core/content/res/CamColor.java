package androidx.core.content.res;

import androidx.core.graphics.ColorUtils;

class CamColor {
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;
    private final float mJ;
    private final float mJstar;
    private final float mM;
    private final float mQ;
    private final float mS;

    /* access modifiers changed from: package-private */
    public float getHue() {
        return this.mHue;
    }

    /* access modifiers changed from: package-private */
    public float getChroma() {
        return this.mChroma;
    }

    /* access modifiers changed from: package-private */
    public float getJ() {
        return this.mJ;
    }

    /* access modifiers changed from: package-private */
    public float getJStar() {
        return this.mJstar;
    }

    /* access modifiers changed from: package-private */
    public float getAStar() {
        return this.mAstar;
    }

    /* access modifiers changed from: package-private */
    public float getBStar() {
        return this.mBstar;
    }

    CamColor(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.mHue = f2;
        this.mChroma = f3;
        this.mJ = f4;
        this.mQ = f5;
        this.mM = f6;
        this.mS = f7;
        this.mJstar = f8;
        this.mAstar = f9;
        this.mBstar = f10;
    }

    static int toColor(float f2, float f3, float f4) {
        return toColor(f2, f3, f4, ViewingConditions.DEFAULT);
    }

    static CamColor fromColor(int i) {
        return fromColorInViewingConditions(i, ViewingConditions.DEFAULT);
    }

    static CamColor fromColorInViewingConditions(int i, ViewingConditions viewingConditions) {
        float[] xyzFromInt = CamUtils.xyzFromInt(i);
        float[][] fArr = CamUtils.XYZ_TO_CAM16RGB;
        float f2 = (xyzFromInt[0] * fArr[0][0]) + (xyzFromInt[1] * fArr[0][1]) + (xyzFromInt[2] * fArr[0][2]);
        float f3 = (xyzFromInt[0] * fArr[1][0]) + (xyzFromInt[1] * fArr[1][1]) + (xyzFromInt[2] * fArr[1][2]);
        float f4 = (xyzFromInt[0] * fArr[2][0]) + (xyzFromInt[1] * fArr[2][1]) + (xyzFromInt[2] * fArr[2][2]);
        float f5 = viewingConditions.getRgbD()[0] * f2;
        float f6 = viewingConditions.getRgbD()[1] * f3;
        float f7 = viewingConditions.getRgbD()[2] * f4;
        float pow = (float) Math.pow(((double) (viewingConditions.getFl() * Math.abs(f5))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (viewingConditions.getFl() * Math.abs(f6))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (viewingConditions.getFl() * Math.abs(f7))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f5) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f6) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f7) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d2 = (double) signum3;
        float f8 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d2)) / 11.0f;
        float f9 = ((float) (((double) (signum + signum2)) - (d2 * 2.0d))) / 9.0f;
        float f10 = signum2 * 20.0f;
        float f11 = (((signum * 20.0f) + f10) + (21.0f * signum3)) / 20.0f;
        float f12 = (((signum * 40.0f) + f10) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f9, (double) f8)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f13 = atan2;
        float f14 = (3.1415927f * f13) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f12 * viewingConditions.getNbb()) / viewingConditions.getAw()), (double) (viewingConditions.getC() * viewingConditions.getZ()))) * 100.0f;
        float flRoot = viewingConditions.getFlRoot() * (4.0f / viewingConditions.getC()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (viewingConditions.getAw() + 4.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) viewingConditions.getN()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) f13) < 20.14d ? 360.0f + f13 : f13)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.sqrt((double) ((f8 * f8) + (f9 * f9))))) / (f11 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float flRoot2 = sqrt * viewingConditions.getFlRoot();
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f)))) * 50.0f;
        float f15 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * flRoot2) + 1.0f))) * 43.85965f;
        double d3 = (double) f14;
        return new CamColor(f13, sqrt, pow4, flRoot, flRoot2, sqrt2, f15, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    private static CamColor fromJch(float f2, float f3, float f4) {
        return fromJchInFrame(f2, f3, f4, ViewingConditions.DEFAULT);
    }

    private static CamColor fromJchInFrame(float f2, float f3, float f4, ViewingConditions viewingConditions) {
        float f5 = f2;
        double d2 = ((double) f5) / 100.0d;
        float c2 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(d2)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float flRoot = f3 * viewingConditions.getFlRoot();
        float sqrt = ((float) Math.sqrt((double) (((f3 / ((float) Math.sqrt(d2))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f)))) * 50.0f;
        float f6 = (1.7f * f5) / ((0.007f * f5) + 1.0f);
        float log = ((float) Math.log((((double) flRoot) * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (double) ((3.1415927f * f4) / 180.0f);
        return new CamColor(f4, f3, f5, c2, flRoot, sqrt, f6, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    /* access modifiers changed from: package-private */
    public float distance(CamColor camColor) {
        float jStar = getJStar() - camColor.getJStar();
        float aStar = getAStar() - camColor.getAStar();
        float bStar = getBStar() - camColor.getBStar();
        return (float) (Math.pow(Math.sqrt((double) ((jStar * jStar) + (aStar * aStar) + (bStar * bStar))), 0.63d) * 1.41d);
    }

    /* access modifiers changed from: package-private */
    public int viewedInSrgb() {
        return viewed(ViewingConditions.DEFAULT);
    }

    /* access modifiers changed from: package-private */
    public int viewed(ViewingConditions viewingConditions) {
        float pow = (float) Math.pow(((double) ((((double) getChroma()) == 0.0d || ((double) getJ()) == 0.0d) ? 0.0f : getChroma() / ((float) Math.sqrt(((double) getJ()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, (double) viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue = (double) ((getHue() * 3.1415927f) / 180.0f);
        float aw = viewingConditions.getAw() * ((float) Math.pow(((double) getJ()) / 100.0d, (1.0d / ((double) viewingConditions.getC())) / ((double) viewingConditions.getZ())));
        float cos = ((float) (Math.cos(2.0d + hue) + 3.8d)) * 0.25f * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float nbb = aw / viewingConditions.getNbb();
        float sin = (float) Math.sin(hue);
        float cos2 = (float) Math.cos(hue);
        float f2 = (((0.305f + nbb) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f3 = cos2 * f2;
        float f4 = f2 * sin;
        float f5 = nbb * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float f8 = ((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f;
        float signum = Math.signum(f6) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6))))), 2.380952380952381d));
        float signum2 = Math.signum(f7) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7))))), 2.380952380952381d));
        float signum3 = Math.signum(f8) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f8)) * 27.13d) / (400.0d - ((double) Math.abs(f8))))), 2.380952380952381d));
        float f9 = signum / viewingConditions.getRgbD()[0];
        float f10 = signum2 / viewingConditions.getRgbD()[1];
        float f11 = signum3 / viewingConditions.getRgbD()[2];
        float[][] fArr = CamUtils.CAM16RGB_TO_XYZ;
        return ColorUtils.XYZToColor((double) ((fArr[0][0] * f9) + (fArr[0][1] * f10) + (fArr[0][2] * f11)), (double) ((fArr[1][0] * f9) + (fArr[1][1] * f10) + (fArr[1][2] * f11)), (double) ((f9 * fArr[2][0]) + (f10 * fArr[2][1]) + (f11 * fArr[2][2])));
    }

    static int toColor(float f2, float f3, float f4, ViewingConditions viewingConditions) {
        float f5;
        if (((double) f3) < 1.0d || ((double) Math.round(f4)) <= 0.0d || ((double) Math.round(f4)) >= 100.0d) {
            return CamUtils.intFromLStar(f4);
        }
        if (f2 < 0.0f) {
            f5 = 0.0f;
        } else {
            f5 = Math.min(360.0f, f2);
        }
        float f6 = f3;
        CamColor camColor = null;
        float f7 = 0.0f;
        boolean z = true;
        while (Math.abs(f7 - f3) >= 0.4f) {
            CamColor findCamByJ = findCamByJ(f5, f6, f4);
            if (z) {
                if (findCamByJ != null) {
                    return findCamByJ.viewed(viewingConditions);
                }
                z = false;
            } else if (findCamByJ == null) {
                f3 = f6;
            } else {
                f7 = f6;
                camColor = findCamByJ;
            }
            f6 = ((f3 - f7) / 2.0f) + f7;
        }
        if (camColor == null) {
            return CamUtils.intFromLStar(f4);
        }
        return camColor.viewed(viewingConditions);
    }

    private static CamColor findCamByJ(float f2, float f3, float f4) {
        float f5 = 1000.0f;
        CamColor camColor = null;
        float f6 = 1000.0f;
        float f7 = 100.0f;
        float f8 = 0.0f;
        while (Math.abs(f8 - f7) > 0.01f) {
            float f9 = ((f7 - f8) / 2.0f) + f8;
            int viewedInSrgb = fromJch(f9, f3, f2).viewedInSrgb();
            float lStarFromInt = CamUtils.lStarFromInt(viewedInSrgb);
            float abs = Math.abs(f4 - lStarFromInt);
            if (abs < 0.2f) {
                CamColor fromColor = fromColor(viewedInSrgb);
                float distance = fromColor.distance(fromJch(fromColor.getJ(), fromColor.getChroma(), f2));
                if (distance <= 1.0f) {
                    camColor = fromColor;
                    f5 = abs;
                    f6 = distance;
                }
            }
            if (f5 == 0.0f && f6 == 0.0f) {
                break;
            } else if (lStarFromInt < f4) {
                f8 = f9;
            } else {
                f7 = f9;
            }
        }
        return camColor;
    }
}
