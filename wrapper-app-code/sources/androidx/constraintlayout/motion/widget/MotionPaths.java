package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import io.bidmachine.utils.IabUtils;
import java.util.Arrays;
import java.util.LinkedHashMap;

class MotionPaths implements Comparable<MotionPaths> {
    static String[] names = {"position", "x", "y", IabUtils.KEY_WIDTH, IabUtils.KEY_HEIGHT, "pathRotate"};
    LinkedHashMap<String, ConstraintAttribute> attributes = new LinkedHashMap<>();
    float height;
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo = Key.UNSET;
    int mDrawPath = 0;
    Easing mKeyFrameEasing;
    int mMode = 0;
    int mPathMotionArc = Key.UNSET;
    float mPathRotate = Float.NaN;
    float mProgress = Float.NaN;
    float mRelativeAngle = Float.NaN;
    MotionController mRelativeToController = null;
    double[] mTempDelta = new double[18];
    double[] mTempValue = new double[18];
    float position;
    float time;
    float width;
    float x;
    float y;

    private static final float xRotate(float f2, float f3, float f4, float f5, float f6, float f7) {
        return (((f6 - f4) * f3) - ((f7 - f5) * f2)) + f4;
    }

    private static final float yRotate(float f2, float f3, float f4, float f5, float f6, float f7) {
        return ((f6 - f4) * f2) + ((f7 - f5) * f3) + f5;
    }

    public MotionPaths() {
    }

    /* access modifiers changed from: package-private */
    public void initCartesian(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        KeyPosition keyPosition2 = keyPosition;
        MotionPaths motionPaths3 = motionPaths;
        MotionPaths motionPaths4 = motionPaths2;
        float f2 = ((float) keyPosition2.mFramePosition) / 100.0f;
        this.time = f2;
        this.mDrawPath = keyPosition2.mDrawPath;
        float f3 = Float.isNaN(keyPosition2.mPercentWidth) ? f2 : keyPosition2.mPercentWidth;
        float f4 = Float.isNaN(keyPosition2.mPercentHeight) ? f2 : keyPosition2.mPercentHeight;
        float f5 = motionPaths4.width;
        float f6 = motionPaths3.width;
        float f7 = motionPaths4.height;
        float f8 = motionPaths3.height;
        this.position = this.time;
        float f9 = motionPaths3.x;
        float f10 = motionPaths3.y;
        float f11 = (motionPaths4.x + (f5 / 2.0f)) - ((f6 / 2.0f) + f9);
        float f12 = (motionPaths4.y + (f7 / 2.0f)) - (f10 + (f8 / 2.0f));
        float f13 = (f5 - f6) * f3;
        float f14 = f13 / 2.0f;
        this.x = (float) ((int) ((f9 + (f11 * f2)) - f14));
        float f15 = (f7 - f8) * f4;
        float f16 = f15 / 2.0f;
        this.y = (float) ((int) ((f10 + (f12 * f2)) - f16));
        this.width = (float) ((int) (f6 + f13));
        this.height = (float) ((int) (f8 + f15));
        KeyPosition keyPosition3 = keyPosition;
        float f17 = Float.isNaN(keyPosition3.mPercentX) ? f2 : keyPosition3.mPercentX;
        float f18 = 0.0f;
        float f19 = Float.isNaN(keyPosition3.mAltPercentY) ? 0.0f : keyPosition3.mAltPercentY;
        if (!Float.isNaN(keyPosition3.mPercentY)) {
            f2 = keyPosition3.mPercentY;
        }
        if (!Float.isNaN(keyPosition3.mAltPercentX)) {
            f18 = keyPosition3.mAltPercentX;
        }
        this.mMode = 0;
        MotionPaths motionPaths5 = motionPaths;
        this.x = (float) ((int) (((motionPaths5.x + (f17 * f11)) + (f18 * f12)) - f14));
        this.y = (float) ((int) (((motionPaths5.y + (f11 * f19)) + (f12 * f2)) - f16));
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition3.mTransitionEasing);
        this.mPathMotionArc = keyPosition3.mPathMotionArc;
    }

    public MotionPaths(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        if (motionPaths.mAnimateRelativeTo != Key.UNSET) {
            initPolar(i, i2, keyPosition, motionPaths, motionPaths2);
            return;
        }
        int i3 = keyPosition.mPositionType;
        if (i3 == 1) {
            initPath(keyPosition, motionPaths, motionPaths2);
        } else if (i3 != 2) {
            initCartesian(keyPosition, motionPaths, motionPaths2);
        } else {
            initScreen(i, i2, keyPosition, motionPaths, motionPaths2);
        }
    }

    /* access modifiers changed from: package-private */
    public void initPolar(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f2;
        float f3;
        float f4 = ((float) keyPosition.mFramePosition) / 100.0f;
        this.time = f4;
        this.mDrawPath = keyPosition.mDrawPath;
        this.mMode = keyPosition.mPositionType;
        float f5 = Float.isNaN(keyPosition.mPercentWidth) ? f4 : keyPosition.mPercentWidth;
        float f6 = Float.isNaN(keyPosition.mPercentHeight) ? f4 : keyPosition.mPercentHeight;
        float f7 = motionPaths2.width;
        float f8 = motionPaths.width;
        float f9 = motionPaths2.height;
        float f10 = motionPaths.height;
        this.position = this.time;
        this.width = (float) ((int) (f8 + ((f7 - f8) * f5)));
        this.height = (float) ((int) (f10 + ((f9 - f10) * f6)));
        int i3 = keyPosition.mPositionType;
        if (i3 == 1) {
            float f11 = Float.isNaN(keyPosition.mPercentX) ? f4 : keyPosition.mPercentX;
            float f12 = motionPaths2.x;
            float f13 = motionPaths.x;
            this.x = (f11 * (f12 - f13)) + f13;
            if (!Float.isNaN(keyPosition.mPercentY)) {
                f4 = keyPosition.mPercentY;
            }
            float f14 = motionPaths2.y;
            float f15 = motionPaths.y;
            this.y = (f4 * (f14 - f15)) + f15;
        } else if (i3 != 2) {
            float f16 = Float.isNaN(keyPosition.mPercentX) ? f4 : keyPosition.mPercentX;
            float f17 = motionPaths2.x;
            float f18 = motionPaths.x;
            this.x = (f16 * (f17 - f18)) + f18;
            if (!Float.isNaN(keyPosition.mPercentY)) {
                f4 = keyPosition.mPercentY;
            }
            float f19 = motionPaths2.y;
            float f20 = motionPaths.y;
            this.y = (f4 * (f19 - f20)) + f20;
        } else {
            if (Float.isNaN(keyPosition.mPercentX)) {
                float f21 = motionPaths2.x;
                float f22 = motionPaths.x;
                f2 = ((f21 - f22) * f4) + f22;
            } else {
                f2 = Math.min(f6, f5) * keyPosition.mPercentX;
            }
            this.x = f2;
            if (Float.isNaN(keyPosition.mPercentY)) {
                float f23 = motionPaths2.y;
                float f24 = motionPaths.y;
                f3 = (f4 * (f23 - f24)) + f24;
            } else {
                f3 = keyPosition.mPercentY;
            }
            this.y = f3;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void setupRelative(MotionController motionController, MotionPaths motionPaths) {
        double d2 = (double) (((this.x + (this.width / 2.0f)) - motionPaths.x) - (motionPaths.width / 2.0f));
        double d3 = (double) (((this.y + (this.height / 2.0f)) - motionPaths.y) - (motionPaths.height / 2.0f));
        this.mRelativeToController = motionController;
        this.x = (float) Math.hypot(d3, d2);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.y = (float) (Math.atan2(d3, d2) + 1.5707963267948966d);
        } else {
            this.y = (float) Math.toRadians((double) this.mRelativeAngle);
        }
    }

    /* access modifiers changed from: package-private */
    public void initScreen(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        KeyPosition keyPosition2 = keyPosition;
        MotionPaths motionPaths3 = motionPaths;
        MotionPaths motionPaths4 = motionPaths2;
        float f2 = ((float) keyPosition2.mFramePosition) / 100.0f;
        this.time = f2;
        this.mDrawPath = keyPosition2.mDrawPath;
        float f3 = Float.isNaN(keyPosition2.mPercentWidth) ? f2 : keyPosition2.mPercentWidth;
        float f4 = Float.isNaN(keyPosition2.mPercentHeight) ? f2 : keyPosition2.mPercentHeight;
        float f5 = motionPaths4.width;
        float f6 = motionPaths3.width;
        float f7 = motionPaths4.height;
        float f8 = motionPaths3.height;
        this.position = this.time;
        float f9 = motionPaths3.x;
        float f10 = motionPaths3.y;
        float f11 = motionPaths4.x + (f5 / 2.0f);
        float f12 = motionPaths4.y + (f7 / 2.0f);
        float f13 = (f5 - f6) * f3;
        this.x = (float) ((int) ((f9 + ((f11 - ((f6 / 2.0f) + f9)) * f2)) - (f13 / 2.0f)));
        float f14 = (f7 - f8) * f4;
        this.y = (float) ((int) ((f10 + ((f12 - (f10 + (f8 / 2.0f))) * f2)) - (f14 / 2.0f)));
        this.width = (float) ((int) (f6 + f13));
        this.height = (float) ((int) (f8 + f14));
        this.mMode = 2;
        KeyPosition keyPosition3 = keyPosition;
        if (!Float.isNaN(keyPosition3.mPercentX)) {
            this.x = (float) ((int) (keyPosition3.mPercentX * ((float) ((int) (((float) i) - this.width)))));
        }
        if (!Float.isNaN(keyPosition3.mPercentY)) {
            this.y = (float) ((int) (keyPosition3.mPercentY * ((float) ((int) (((float) i2) - this.height)))));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition3.mTransitionEasing);
        this.mPathMotionArc = keyPosition3.mPathMotionArc;
    }

    /* access modifiers changed from: package-private */
    public void initPath(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        KeyPosition keyPosition2 = keyPosition;
        MotionPaths motionPaths3 = motionPaths;
        MotionPaths motionPaths4 = motionPaths2;
        float f2 = ((float) keyPosition2.mFramePosition) / 100.0f;
        this.time = f2;
        this.mDrawPath = keyPosition2.mDrawPath;
        float f3 = Float.isNaN(keyPosition2.mPercentWidth) ? f2 : keyPosition2.mPercentWidth;
        float f4 = Float.isNaN(keyPosition2.mPercentHeight) ? f2 : keyPosition2.mPercentHeight;
        float f5 = motionPaths4.width - motionPaths3.width;
        float f6 = motionPaths4.height - motionPaths3.height;
        this.position = this.time;
        if (!Float.isNaN(keyPosition2.mPercentX)) {
            f2 = keyPosition2.mPercentX;
        }
        float f7 = motionPaths3.x;
        float f8 = motionPaths3.width;
        float f9 = motionPaths3.y;
        float f10 = motionPaths3.height;
        float f11 = (motionPaths4.x + (motionPaths4.width / 2.0f)) - ((f8 / 2.0f) + f7);
        float f12 = (motionPaths4.y + (motionPaths4.height / 2.0f)) - ((f10 / 2.0f) + f9);
        float f13 = f11 * f2;
        float f14 = f5 * f3;
        float f15 = f14 / 2.0f;
        this.x = (float) ((int) ((f7 + f13) - f15));
        float f16 = f2 * f12;
        float f17 = f6 * f4;
        float f18 = f17 / 2.0f;
        this.y = (float) ((int) ((f9 + f16) - f18));
        this.width = (float) ((int) (f8 + f14));
        this.height = (float) ((int) (f10 + f17));
        KeyPosition keyPosition3 = keyPosition;
        float f19 = Float.isNaN(keyPosition3.mPercentY) ? 0.0f : keyPosition3.mPercentY;
        float f20 = (-f12) * f19;
        float f21 = f11 * f19;
        this.mMode = 1;
        MotionPaths motionPaths5 = motionPaths;
        float f22 = (float) ((int) ((motionPaths5.x + f13) - f15));
        this.x = f22;
        float f23 = (float) ((int) ((motionPaths5.y + f16) - f18));
        this.y = f23;
        this.x = f22 + f20;
        this.y = f23 + f21;
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition3.mTransitionEasing);
        this.mPathMotionArc = keyPosition3.mPathMotionArc;
    }

    private boolean diff(float f2, float f3) {
        if (Float.isNaN(f2) || Float.isNaN(f3)) {
            if (Float.isNaN(f2) != Float.isNaN(f3)) {
                return true;
            }
            return false;
        } else if (Math.abs(f2 - f3) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z) {
        boolean diff = diff(this.x, motionPaths.x);
        boolean diff2 = diff(this.y, motionPaths.y);
        zArr[0] = zArr[0] | diff(this.position, motionPaths.position);
        boolean z2 = diff | diff2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | diff(this.width, motionPaths.width);
        zArr[4] = diff(this.height, motionPaths.height) | zArr[4];
    }

    /* access modifiers changed from: package-private */
    public void getCenter(double d2, int[] iArr, double[] dArr, float[] fArr, int i) {
        int[] iArr2 = iArr;
        float f2 = this.x;
        float f3 = this.y;
        float f4 = this.width;
        float f5 = this.height;
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            float f6 = (float) dArr[i2];
            int i3 = iArr2[i2];
            if (i3 == 1) {
                f2 = f6;
            } else if (i3 == 2) {
                f3 = f6;
            } else if (i3 == 3) {
                f4 = f6;
            } else if (i3 == 4) {
                f5 = f6;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d2, fArr2, new float[2]);
            float f7 = fArr2[0];
            float f8 = fArr2[1];
            double d3 = (double) f7;
            double d4 = (double) f2;
            double d5 = (double) f3;
            f2 = (float) ((d3 + (Math.sin(d5) * d4)) - ((double) (f4 / 2.0f)));
            f3 = (float) ((((double) f8) - (d4 * Math.cos(d5))) - ((double) (f5 / 2.0f)));
        }
        fArr[i] = f2 + (f4 / 2.0f) + 0.0f;
        fArr[i + 1] = f3 + (f5 / 2.0f) + 0.0f;
    }

    /* access modifiers changed from: package-private */
    public void getCenter(double d2, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f2;
        int[] iArr2 = iArr;
        float f3 = this.x;
        float f4 = this.y;
        float f5 = this.width;
        float f6 = this.height;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f11 = (float) dArr[i];
            float f12 = (float) dArr2[i];
            int i2 = iArr2[i];
            if (i2 == 1) {
                f3 = f11;
                f7 = f12;
            } else if (i2 == 2) {
                f4 = f11;
                f9 = f12;
            } else if (i2 == 3) {
                f5 = f11;
                f8 = f12;
            } else if (i2 == 4) {
                f6 = f11;
                f10 = f12;
            }
        }
        float f13 = 2.0f;
        float f14 = (f8 / 2.0f) + f7;
        float f15 = (f10 / 2.0f) + f9;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.getCenter(d2, fArr3, fArr4);
            float f16 = fArr3[0];
            float f17 = fArr3[1];
            float f18 = fArr4[0];
            double d3 = (double) f3;
            float f19 = fArr4[1];
            double d4 = (double) f4;
            f2 = f5;
            double d5 = (double) f7;
            double d6 = (double) f9;
            float sin = (float) (((double) f18) + (Math.sin(d4) * d5) + (Math.cos(d4) * d6));
            f15 = (float) ((((double) f19) - (d5 * Math.cos(d4))) + (Math.sin(d4) * d6));
            f14 = sin;
            f3 = (float) ((((double) f16) + (Math.sin(d4) * d3)) - ((double) (f5 / 2.0f)));
            f4 = (float) ((((double) f17) - (d3 * Math.cos(d4))) - ((double) (f6 / 2.0f)));
            f13 = 2.0f;
        } else {
            f2 = f5;
        }
        fArr[0] = f3 + (f2 / f13) + 0.0f;
        fArr[1] = f4 + (f6 / f13) + 0.0f;
        fArr2[0] = f14;
        fArr2[1] = f15;
    }

    /* access modifiers changed from: package-private */
    public void setView(float f2, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f3;
        boolean z2;
        float f4;
        View view2 = view;
        int[] iArr2 = iArr;
        double[] dArr4 = dArr2;
        float f5 = this.x;
        float f6 = this.y;
        float f7 = this.width;
        float f8 = this.height;
        if (iArr2.length != 0 && this.mTempValue.length <= iArr2[iArr2.length - 1]) {
            int i = iArr2[iArr2.length - 1] + 1;
            this.mTempValue = new double[i];
            this.mTempDelta = new double[i];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            this.mTempValue[iArr2[i2]] = dArr[i2];
            this.mTempDelta[iArr2[i2]] = dArr4[i2];
        }
        float f9 = Float.NaN;
        int i3 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i3 >= dArr5.length) {
                break;
            }
            double d2 = 0.0d;
            if (!Double.isNaN(dArr5[i3]) || !(dArr3 == null || dArr3[i3] == 0.0d)) {
                if (dArr3 != null) {
                    d2 = dArr3[i3];
                }
                if (!Double.isNaN(this.mTempValue[i3])) {
                    d2 = this.mTempValue[i3] + d2;
                }
                f4 = f9;
                float f14 = (float) d2;
                float f15 = (float) this.mTempDelta[i3];
                if (i3 == 1) {
                    f9 = f4;
                    f10 = f15;
                    f5 = f14;
                } else if (i3 == 2) {
                    f9 = f4;
                    f11 = f15;
                    f6 = f14;
                } else if (i3 == 3) {
                    f9 = f4;
                    f12 = f15;
                    f7 = f14;
                } else if (i3 == 4) {
                    f9 = f4;
                    f13 = f15;
                    f8 = f14;
                } else if (i3 == 5) {
                    f9 = f14;
                }
                i3++;
                double[] dArr6 = dArr2;
            } else {
                f4 = f9;
            }
            f9 = f4;
            i3++;
            double[] dArr62 = dArr2;
        }
        float f16 = f9;
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter((double) f2, fArr, fArr2);
            float f17 = fArr[0];
            float f18 = fArr[1];
            float f19 = fArr2[0];
            float f20 = fArr2[1];
            double d3 = (double) f5;
            double d4 = (double) f6;
            double sin = ((double) f17) + (Math.sin(d4) * d3);
            f3 = f8;
            float f21 = (float) (sin - ((double) (f7 / 2.0f)));
            float cos = (float) ((((double) f18) - (Math.cos(d4) * d3)) - ((double) (f8 / 2.0f)));
            double d5 = (double) f10;
            double d6 = (double) f11;
            float sin2 = (float) (((double) f19) + (Math.sin(d4) * d5) + (Math.cos(d4) * d3 * d6));
            float f22 = f21;
            float cos2 = (float) ((((double) f20) - (d5 * Math.cos(d4))) + (d3 * Math.sin(d4) * d6));
            double[] dArr7 = dArr2;
            if (dArr7.length >= 2) {
                z2 = false;
                dArr7[0] = (double) sin2;
                dArr7[1] = (double) cos2;
            } else {
                z2 = false;
            }
            if (!Float.isNaN(f16)) {
                view2.setRotation((float) (((double) f16) + Math.toDegrees(Math.atan2((double) cos2, (double) sin2))));
            }
            f5 = f22;
            f6 = cos;
        } else {
            float f23 = f16;
            f3 = f8;
            z2 = false;
            if (!Float.isNaN(f23)) {
                view2.setRotation((float) (((double) 0.0f) + ((double) f23) + Math.toDegrees(Math.atan2((double) (f11 + (f13 / 2.0f)), (double) (f10 + (f12 / 2.0f))))));
            }
        }
        if (view2 instanceof FloatLayout) {
            ((FloatLayout) view2).layout(f5, f6, f7 + f5, f6 + f3);
            return;
        }
        float f24 = f5 + 0.5f;
        int i4 = (int) f24;
        float f25 = f6 + 0.5f;
        int i5 = (int) f25;
        int i6 = (int) (f24 + f7);
        int i7 = (int) (f25 + f3);
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        if (!(i8 == view.getMeasuredWidth() && i9 == view.getMeasuredHeight())) {
            z2 = true;
        }
        if (z2 || z) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
        }
        view2.layout(i4, i5, i6, i7);
    }

    /* access modifiers changed from: package-private */
    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f2 = this.x;
        float f3 = this.y;
        float f4 = this.width;
        float f5 = this.height;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f6 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f2 = f6;
            } else if (i3 == 2) {
                f3 = f6;
            } else if (i3 == 3) {
                f4 = f6;
            } else if (i3 == 4) {
                f5 = f6;
            }
        }
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
            double d2 = (double) f2;
            double d3 = (double) f3;
            f3 = (float) ((((double) this.mRelativeToController.getCenterY()) - (d2 * Math.cos(d3))) - ((double) (f5 / 2.0f)));
            f2 = (float) ((((double) centerX) + (Math.sin(d3) * d2)) - ((double) (f4 / 2.0f)));
        }
        float f7 = f4 + f2;
        float f8 = f5 + f3;
        boolean isNaN = Float.isNaN(Float.NaN);
        boolean isNaN2 = Float.isNaN(Float.NaN);
        int i4 = i + 1;
        fArr[i] = f2 + 0.0f;
        int i5 = i4 + 1;
        fArr[i4] = f3 + 0.0f;
        int i6 = i5 + 1;
        fArr[i5] = f7 + 0.0f;
        int i7 = i6 + 1;
        fArr[i6] = f3 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f7 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f8 + 0.0f;
        fArr[i9] = f2 + 0.0f;
        fArr[i9 + 1] = f8 + 0.0f;
    }

    /* access modifiers changed from: package-private */
    public void setDpDt(float f2, float f3, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f8 = (float) dArr[i];
            double d2 = dArr2[i];
            int i2 = iArr2[i];
            if (i2 == 1) {
                f4 = f8;
            } else if (i2 == 2) {
                f6 = f8;
            } else if (i2 == 3) {
                f5 = f8;
            } else if (i2 == 4) {
                f7 = f8;
            }
        }
        float f9 = f4 - ((0.0f * f5) / 2.0f);
        float f10 = f6 - ((0.0f * f7) / 2.0f);
        fArr[0] = (f9 * (1.0f - f2)) + (((f5 * 1.0f) + f9) * f2) + 0.0f;
        fArr[1] = (f10 * (1.0f - f3)) + (((f7 * 1.0f) + f10) * f3) + 0.0f;
    }

    /* access modifiers changed from: package-private */
    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.x, this.y, this.width, this.height, this.mPathRotate};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 6) {
                dArr[i] = (double) fArr[iArr[i2]];
                i++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean hasCustomData(String str) {
        return this.attributes.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public int getCustomDataCount(String str) {
        ConstraintAttribute constraintAttribute = this.attributes.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.numberOfInterpolatedValues();
    }

    /* access modifiers changed from: package-private */
    public int getCustomData(String str, double[] dArr, int i) {
        ConstraintAttribute constraintAttribute = this.attributes.get(str);
        int i2 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[i] = (double) constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        float[] fArr = new float[numberOfInterpolatedValues];
        constraintAttribute.getValuesToInterpolate(fArr);
        while (i2 < numberOfInterpolatedValues) {
            dArr[i] = (double) fArr[i2];
            i2++;
            i++;
        }
        return numberOfInterpolatedValues;
    }

    /* access modifiers changed from: package-private */
    public void setBounds(float f2, float f3, float f4, float f5) {
        this.x = f2;
        this.y = f3;
        this.width = f4;
        this.height = f5;
    }

    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.position, motionPaths.position);
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        this.mPathMotionArc = constraint.motion.mPathMotionArc;
        this.mAnimateRelativeTo = constraint.motion.mAnimateRelativeTo;
        this.mPathRotate = constraint.motion.mPathRotate;
        this.mDrawPath = constraint.motion.mDrawPath;
        this.mAnimateCircleAngleTo = constraint.motion.mAnimateCircleAngleTo;
        this.mProgress = constraint.propertySet.mProgress;
        this.mRelativeAngle = constraint.layout.circleAngle;
        for (String next : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(next);
            if (constraintAttribute != null && constraintAttribute.isContinuous()) {
                this.attributes.put(next, constraintAttribute);
            }
        }
    }
}
