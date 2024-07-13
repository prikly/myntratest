package androidx.constraintlayout.motion.widget;

import java.util.HashMap;
import java.util.HashSet;

public class KeyAttributes extends Key {
    private float mAlpha = Float.NaN;
    private int mCurveFit = -1;
    private float mElevation = Float.NaN;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float mProgress = Float.NaN;
    private float mRotation = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private float mTransitionPathRotate = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;
    private boolean mVisibility = false;

    public KeyAttributes() {
        this.mType = 1;
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
        if (!Float.isNaN(this.mPivotX)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.mPivotY)) {
            hashSet.add("transformPivotY");
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
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.mProgress)) {
            hashSet.add("progress");
        }
        if (this.mCustomConstraints.size() > 0) {
            for (String str : this.mCustomConstraints.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void setInterpolation(HashMap<String, Integer> hashMap) {
        if (this.mCurveFit != -1) {
            if (!Float.isNaN(this.mAlpha)) {
                hashMap.put("alpha", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mElevation)) {
                hashMap.put("elevation", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mRotation)) {
                hashMap.put("rotation", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mRotationX)) {
                hashMap.put("rotationX", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mRotationY)) {
                hashMap.put("rotationY", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mPivotX)) {
                hashMap.put("transformPivotX", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mPivotY)) {
                hashMap.put("transformPivotY", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTranslationX)) {
                hashMap.put("translationX", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTranslationY)) {
                hashMap.put("translationY", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTranslationZ)) {
                hashMap.put("translationZ", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mTransitionPathRotate)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mScaleX)) {
                hashMap.put("scaleX", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mScaleY)) {
                hashMap.put("scaleY", Integer.valueOf(this.mCurveFit));
            }
            if (!Float.isNaN(this.mProgress)) {
                hashMap.put("progress", Integer.valueOf(this.mCurveFit));
            }
            if (this.mCustomConstraints.size() > 0) {
                for (String str : this.mCustomConstraints.keySet()) {
                    hashMap.put("CUSTOM," + str, Integer.valueOf(this.mCurveFit));
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        if (r1.equals("transitionPathRotate") != false) goto L_0x00dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> r7) {
        /*
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01cf
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            androidx.constraintlayout.core.motion.utils.SplineSet r2 = (androidx.constraintlayout.core.motion.utils.SplineSet) r2
            if (r2 != 0) goto L_0x001d
            goto L_0x0008
        L_0x001d:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L_0x003c
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap r3 = r6.mCustomConstraints
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            if (r1 == 0) goto L_0x0008
            androidx.constraintlayout.motion.utils.ViewSpline$CustomSet r2 = (androidx.constraintlayout.motion.utils.ViewSpline.CustomSet) r2
            int r3 = r6.mFramePosition
            r2.setPoint((int) r3, (androidx.constraintlayout.widget.ConstraintAttribute) r1)
            goto L_0x0008
        L_0x003c:
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00d1;
                case -1249320805: goto L_0x00c7;
                case -1225497657: goto L_0x00bc;
                case -1225497656: goto L_0x00b1;
                case -1225497655: goto L_0x00a6;
                case -1001078227: goto L_0x009b;
                case -908189618: goto L_0x0090;
                case -908189617: goto L_0x0085;
                case -760884510: goto L_0x007b;
                case -760884509: goto L_0x0071;
                case -40300674: goto L_0x0066;
                case -4379043: goto L_0x005b;
                case 37232917: goto L_0x0051;
                case 92909918: goto L_0x0046;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x00db
        L_0x0046:
            java.lang.String r4 = "alpha"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00db
            r4 = 0
            goto L_0x00dc
        L_0x0051:
            java.lang.String r5 = "transitionPathRotate"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00db
            goto L_0x00dc
        L_0x005b:
            java.lang.String r4 = "elevation"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00db
            r4 = 1
            goto L_0x00dc
        L_0x0066:
            java.lang.String r4 = "rotation"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00db
            r4 = 2
            goto L_0x00dc
        L_0x0071:
            java.lang.String r4 = "transformPivotY"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00db
            r4 = 6
            goto L_0x00dc
        L_0x007b:
            java.lang.String r4 = "transformPivotX"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00db
            r4 = 5
            goto L_0x00dc
        L_0x0085:
            java.lang.String r4 = "scaleY"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00db
            r4 = 9
            goto L_0x00dc
        L_0x0090:
            java.lang.String r4 = "scaleX"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00db
            r4 = 8
            goto L_0x00dc
        L_0x009b:
            java.lang.String r4 = "progress"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00db
            r4 = 13
            goto L_0x00dc
        L_0x00a6:
            java.lang.String r4 = "translationZ"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00db
            r4 = 12
            goto L_0x00dc
        L_0x00b1:
            java.lang.String r4 = "translationY"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00db
            r4 = 11
            goto L_0x00dc
        L_0x00bc:
            java.lang.String r4 = "translationX"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00db
            r4 = 10
            goto L_0x00dc
        L_0x00c7:
            java.lang.String r4 = "rotationY"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00db
            r4 = 4
            goto L_0x00dc
        L_0x00d1:
            java.lang.String r4 = "rotationX"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00db
            r4 = 3
            goto L_0x00dc
        L_0x00db:
            r4 = -1
        L_0x00dc:
            switch(r4) {
                case 0: goto L_0x01be;
                case 1: goto L_0x01ad;
                case 2: goto L_0x019c;
                case 3: goto L_0x018b;
                case 4: goto L_0x017a;
                case 5: goto L_0x0169;
                case 6: goto L_0x0158;
                case 7: goto L_0x0147;
                case 8: goto L_0x0136;
                case 9: goto L_0x0125;
                case 10: goto L_0x0114;
                case 11: goto L_0x0103;
                case 12: goto L_0x00f2;
                case 13: goto L_0x00e1;
                default: goto L_0x00df;
            }
        L_0x00df:
            goto L_0x0008
        L_0x00e1:
            float r1 = r6.mProgress
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.mFramePosition
            float r3 = r6.mProgress
            r2.setPoint(r1, r3)
            goto L_0x0008
        L_0x00f2:
            float r1 = r6.mTranslationZ
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationZ
            r2.setPoint(r1, r3)
            goto L_0x0008
        L_0x0103:
            float r1 = r6.mTranslationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationY
            r2.setPoint(r1, r3)
            goto L_0x0008
        L_0x0114:
            float r1 = r6.mTranslationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.mFramePosition
            float r3 = r6.mTranslationX
            r2.setPoint(r1, r3)
            goto L_0x0008
        L_0x0125:
            float r1 = r6.mScaleY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.mFramePosition
            float r3 = r6.mScaleY
            r2.setPoint(r1, r3)
            goto L_0x0008
        L_0x0136:
            float r1 = r6.mScaleX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.mFramePosition
            float r3 = r6.mScaleX
            r2.setPoint(r1, r3)
            goto L_0x0008
        L_0x0147:
            float r1 = r6.mTransitionPathRotate
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.mFramePosition
            float r3 = r6.mTransitionPathRotate
            r2.setPoint(r1, r3)
            goto L_0x0008
        L_0x0158:
            float r1 = r6.mRotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.mFramePosition
            float r3 = r6.mPivotY
            r2.setPoint(r1, r3)
            goto L_0x0008
        L_0x0169:
            float r1 = r6.mRotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.mFramePosition
            float r3 = r6.mPivotX
            r2.setPoint(r1, r3)
            goto L_0x0008
        L_0x017a:
            float r1 = r6.mRotationY
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.mFramePosition
            float r3 = r6.mRotationY
            r2.setPoint(r1, r3)
            goto L_0x0008
        L_0x018b:
            float r1 = r6.mRotationX
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.mFramePosition
            float r3 = r6.mRotationX
            r2.setPoint(r1, r3)
            goto L_0x0008
        L_0x019c:
            float r1 = r6.mRotation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.mFramePosition
            float r3 = r6.mRotation
            r2.setPoint(r1, r3)
            goto L_0x0008
        L_0x01ad:
            float r1 = r6.mElevation
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.mFramePosition
            float r3 = r6.mElevation
            r2.setPoint(r1, r3)
            goto L_0x0008
        L_0x01be:
            float r1 = r6.mAlpha
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.mFramePosition
            float r3 = r6.mAlpha
            r2.setPoint(r1, r3)
            goto L_0x0008
        L_0x01cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyAttributes.addValues(java.util.HashMap):void");
    }

    public Key copy(Key key) {
        super.copy(key);
        KeyAttributes keyAttributes = (KeyAttributes) key;
        this.mCurveFit = keyAttributes.mCurveFit;
        this.mVisibility = keyAttributes.mVisibility;
        this.mAlpha = keyAttributes.mAlpha;
        this.mElevation = keyAttributes.mElevation;
        this.mRotation = keyAttributes.mRotation;
        this.mRotationX = keyAttributes.mRotationX;
        this.mRotationY = keyAttributes.mRotationY;
        this.mPivotX = keyAttributes.mPivotX;
        this.mPivotY = keyAttributes.mPivotY;
        this.mTransitionPathRotate = keyAttributes.mTransitionPathRotate;
        this.mScaleX = keyAttributes.mScaleX;
        this.mScaleY = keyAttributes.mScaleY;
        this.mTranslationX = keyAttributes.mTranslationX;
        this.mTranslationY = keyAttributes.mTranslationY;
        this.mTranslationZ = keyAttributes.mTranslationZ;
        this.mProgress = keyAttributes.mProgress;
        return this;
    }

    public Key clone() {
        return new KeyAttributes().copy(this);
    }
}
