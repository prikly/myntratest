package androidx.constraintlayout.motion.widget;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

public class KeyCycle extends Key {
    private float mAlpha = Float.NaN;
    private int mCurveFit = 0;
    private String mCustomWaveShape = null;
    private float mElevation = Float.NaN;
    private float mProgress = Float.NaN;
    private float mRotation = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private String mTransitionEasing = null;
    private float mTransitionPathRotate = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;
    private float mWaveOffset = 0.0f;
    private float mWavePeriod = Float.NaN;
    private float mWavePhase = 0.0f;
    private int mWaveShape = -1;
    private int mWaveVariesBy = -1;

    public KeyCycle() {
        this.mType = 4;
        this.mCustomConstraints = new HashMap();
    }

    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.mAlpha)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.mElevation)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.mRotation)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.mRotationX)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.mRotationY)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.mTranslationX)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.mTranslationY)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            hashSet.add("translationZ");
        }
        if (this.mCustomConstraints.size() > 0) {
            for (String str : this.mCustomConstraints.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void addCycleValues(HashMap<String, ViewOscillator> hashMap) {
        ViewOscillator viewOscillator;
        ViewOscillator viewOscillator2;
        HashMap<String, ViewOscillator> hashMap2 = hashMap;
        for (String next : hashMap.keySet()) {
            if (next.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) this.mCustomConstraints.get(next.substring(7));
                if (!(constraintAttribute == null || constraintAttribute.getType() != ConstraintAttribute.AttributeType.FLOAT_TYPE || (viewOscillator2 = hashMap2.get(next)) == null)) {
                    viewOscillator2.setPoint(this.mFramePosition, this.mWaveShape, this.mCustomWaveShape, this.mWaveVariesBy, this.mWavePeriod, this.mWaveOffset, this.mWavePhase, constraintAttribute.getValueToInterpolate(), constraintAttribute);
                }
            } else {
                float value = getValue(next);
                if (!Float.isNaN(value) && (viewOscillator = hashMap2.get(next)) != null) {
                    viewOscillator.setPoint(this.mFramePosition, this.mWaveShape, this.mCustomWaveShape, this.mWaveVariesBy, this.mWavePeriod, this.mWaveOffset, this.mWavePhase, value);
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float getValue(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x0095;
                case -1249320805: goto L_0x008b;
                case -1225497657: goto L_0x0080;
                case -1225497656: goto L_0x0075;
                case -1225497655: goto L_0x006a;
                case -1001078227: goto L_0x005f;
                case -908189618: goto L_0x0055;
                case -908189617: goto L_0x004b;
                case -40300674: goto L_0x0041;
                case -4379043: goto L_0x0037;
                case 37232917: goto L_0x002c;
                case 92909918: goto L_0x0021;
                case 156108012: goto L_0x0015;
                case 1530034690: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x009f
        L_0x0009:
            java.lang.String r0 = "wavePhase"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 12
            goto L_0x00a0
        L_0x0015:
            java.lang.String r0 = "waveOffset"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 11
            goto L_0x00a0
        L_0x0021:
            java.lang.String r0 = "alpha"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 0
            goto L_0x00a0
        L_0x002c:
            java.lang.String r0 = "transitionPathRotate"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 5
            goto L_0x00a0
        L_0x0037:
            java.lang.String r0 = "elevation"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 1
            goto L_0x00a0
        L_0x0041:
            java.lang.String r0 = "rotation"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 2
            goto L_0x00a0
        L_0x004b:
            java.lang.String r0 = "scaleY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 7
            goto L_0x00a0
        L_0x0055:
            java.lang.String r0 = "scaleX"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 6
            goto L_0x00a0
        L_0x005f:
            java.lang.String r0 = "progress"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 13
            goto L_0x00a0
        L_0x006a:
            java.lang.String r0 = "translationZ"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 10
            goto L_0x00a0
        L_0x0075:
            java.lang.String r0 = "translationY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 9
            goto L_0x00a0
        L_0x0080:
            java.lang.String r0 = "translationX"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 8
            goto L_0x00a0
        L_0x008b:
            java.lang.String r0 = "rotationY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 4
            goto L_0x00a0
        L_0x0095:
            java.lang.String r0 = "rotationX"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 3
            goto L_0x00a0
        L_0x009f:
            r0 = -1
        L_0x00a0:
            switch(r0) {
                case 0: goto L_0x00e9;
                case 1: goto L_0x00e6;
                case 2: goto L_0x00e3;
                case 3: goto L_0x00e0;
                case 4: goto L_0x00dd;
                case 5: goto L_0x00da;
                case 6: goto L_0x00d7;
                case 7: goto L_0x00d4;
                case 8: goto L_0x00d1;
                case 9: goto L_0x00ce;
                case 10: goto L_0x00cb;
                case 11: goto L_0x00c8;
                case 12: goto L_0x00c5;
                case 13: goto L_0x00c2;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            java.lang.String r0 = "CUSTOM"
            boolean r0 = r3.startsWith(r0)
            if (r0 != 0) goto L_0x00ec
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "  UNKNOWN  "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "WARNING! KeyCycle"
            android.util.Log.v(r0, r3)
            goto L_0x00ec
        L_0x00c2:
            float r3 = r2.mProgress
            return r3
        L_0x00c5:
            float r3 = r2.mWavePhase
            return r3
        L_0x00c8:
            float r3 = r2.mWaveOffset
            return r3
        L_0x00cb:
            float r3 = r2.mTranslationZ
            return r3
        L_0x00ce:
            float r3 = r2.mTranslationY
            return r3
        L_0x00d1:
            float r3 = r2.mTranslationX
            return r3
        L_0x00d4:
            float r3 = r2.mScaleY
            return r3
        L_0x00d7:
            float r3 = r2.mScaleX
            return r3
        L_0x00da:
            float r3 = r2.mTransitionPathRotate
            return r3
        L_0x00dd:
            float r3 = r2.mRotationY
            return r3
        L_0x00e0:
            float r3 = r2.mRotationX
            return r3
        L_0x00e3:
            float r3 = r2.mRotation
            return r3
        L_0x00e6:
            float r3 = r2.mElevation
            return r3
        L_0x00e9:
            float r3 = r2.mAlpha
            return r3
        L_0x00ec:
            r3 = 2143289344(0x7fc00000, float:NaN)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyCycle.getValue(java.lang.String):float");
    }

    public void addValues(HashMap<String, ViewSpline> hashMap) {
        Debug.logStack("KeyCycle", "add " + hashMap.size() + " values", 2);
        for (String next : hashMap.keySet()) {
            SplineSet splineSet = hashMap.get(next);
            if (splineSet != null) {
                char c2 = 65535;
                switch (next.hashCode()) {
                    case -1249320806:
                        if (next.equals("rotationX")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (next.equals("rotationY")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (next.equals("translationX")) {
                            c2 = 8;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (next.equals("translationY")) {
                            c2 = 9;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (next.equals("translationZ")) {
                            c2 = 10;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (next.equals("progress")) {
                            c2 = 13;
                            break;
                        }
                        break;
                    case -908189618:
                        if (next.equals("scaleX")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (next.equals("scaleY")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (next.equals("rotation")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -4379043:
                        if (next.equals("elevation")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 37232917:
                        if (next.equals("transitionPathRotate")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 92909918:
                        if (next.equals("alpha")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 156108012:
                        if (next.equals("waveOffset")) {
                            c2 = 11;
                            break;
                        }
                        break;
                    case 1530034690:
                        if (next.equals("wavePhase")) {
                            c2 = 12;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        splineSet.setPoint(this.mFramePosition, this.mAlpha);
                        break;
                    case 1:
                        splineSet.setPoint(this.mFramePosition, this.mElevation);
                        break;
                    case 2:
                        splineSet.setPoint(this.mFramePosition, this.mRotation);
                        break;
                    case 3:
                        splineSet.setPoint(this.mFramePosition, this.mRotationX);
                        break;
                    case 4:
                        splineSet.setPoint(this.mFramePosition, this.mRotationY);
                        break;
                    case 5:
                        splineSet.setPoint(this.mFramePosition, this.mTransitionPathRotate);
                        break;
                    case 6:
                        splineSet.setPoint(this.mFramePosition, this.mScaleX);
                        break;
                    case 7:
                        splineSet.setPoint(this.mFramePosition, this.mScaleY);
                        break;
                    case 8:
                        splineSet.setPoint(this.mFramePosition, this.mTranslationX);
                        break;
                    case 9:
                        splineSet.setPoint(this.mFramePosition, this.mTranslationY);
                        break;
                    case 10:
                        splineSet.setPoint(this.mFramePosition, this.mTranslationZ);
                        break;
                    case 11:
                        splineSet.setPoint(this.mFramePosition, this.mWaveOffset);
                        break;
                    case 12:
                        splineSet.setPoint(this.mFramePosition, this.mWavePhase);
                        break;
                    case 13:
                        splineSet.setPoint(this.mFramePosition, this.mProgress);
                        break;
                    default:
                        if (next.startsWith("CUSTOM")) {
                            break;
                        } else {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + next);
                            break;
                        }
                }
            }
        }
    }

    public Key copy(Key key) {
        super.copy(key);
        KeyCycle keyCycle = (KeyCycle) key;
        this.mTransitionEasing = keyCycle.mTransitionEasing;
        this.mCurveFit = keyCycle.mCurveFit;
        this.mWaveShape = keyCycle.mWaveShape;
        this.mCustomWaveShape = keyCycle.mCustomWaveShape;
        this.mWavePeriod = keyCycle.mWavePeriod;
        this.mWaveOffset = keyCycle.mWaveOffset;
        this.mWavePhase = keyCycle.mWavePhase;
        this.mProgress = keyCycle.mProgress;
        this.mWaveVariesBy = keyCycle.mWaveVariesBy;
        this.mAlpha = keyCycle.mAlpha;
        this.mElevation = keyCycle.mElevation;
        this.mRotation = keyCycle.mRotation;
        this.mTransitionPathRotate = keyCycle.mTransitionPathRotate;
        this.mRotationX = keyCycle.mRotationX;
        this.mRotationY = keyCycle.mRotationY;
        this.mScaleX = keyCycle.mScaleX;
        this.mScaleY = keyCycle.mScaleY;
        this.mTranslationX = keyCycle.mTranslationX;
        this.mTranslationY = keyCycle.mTranslationY;
        this.mTranslationZ = keyCycle.mTranslationZ;
        return this;
    }

    public Key clone() {
        return new KeyCycle().copy(this);
    }
}
