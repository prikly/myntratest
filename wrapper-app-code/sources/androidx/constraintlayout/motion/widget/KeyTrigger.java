package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class KeyTrigger extends Key {
    RectF mCollisionRect = new RectF();
    private String mCross = null;
    private int mCurveFit = -1;
    private boolean mFireCrossReset = true;
    private float mFireLastPos;
    private boolean mFireNegativeReset = true;
    private boolean mFirePositiveReset = true;
    private float mFireThreshold = Float.NaN;
    HashMap<String, Method> mMethodHashMap = new HashMap<>();
    private String mNegativeCross = null;
    private String mPositiveCross = null;
    private boolean mPostLayout = false;
    RectF mTargetRect = new RectF();
    private int mTriggerCollisionId = UNSET;
    private View mTriggerCollisionView = null;
    private int mTriggerID = UNSET;
    private int mTriggerReceiver = UNSET;
    float mTriggerSlack = 0.1f;
    int mViewTransitionOnCross = UNSET;
    int mViewTransitionOnNegativeCross = UNSET;
    int mViewTransitionOnPositiveCross = UNSET;

    public void addValues(HashMap<String, ViewSpline> hashMap) {
    }

    public void getAttributeNames(HashSet<String> hashSet) {
    }

    public KeyTrigger() {
        this.mType = 5;
        this.mCustomConstraints = new HashMap();
    }

    private void setUpRect(RectF rectF, View view, boolean z) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void conditionallyFire(float r10, android.view.View r11) {
        /*
            r9 = this;
            int r0 = r9.mTriggerCollisionId
            int r1 = UNSET
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0062
            android.view.View r0 = r9.mTriggerCollisionView
            if (r0 != 0) goto L_0x001a
            android.view.ViewParent r0 = r11.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r9.mTriggerCollisionId
            android.view.View r0 = r0.findViewById(r1)
            r9.mTriggerCollisionView = r0
        L_0x001a:
            android.graphics.RectF r0 = r9.mCollisionRect
            android.view.View r1 = r9.mTriggerCollisionView
            boolean r4 = r9.mPostLayout
            r9.setUpRect(r0, r1, r4)
            android.graphics.RectF r0 = r9.mTargetRect
            boolean r1 = r9.mPostLayout
            r9.setUpRect(r0, r11, r1)
            android.graphics.RectF r0 = r9.mCollisionRect
            android.graphics.RectF r1 = r9.mTargetRect
            boolean r0 = r0.intersect(r1)
            if (r0 == 0) goto L_0x004c
            boolean r0 = r9.mFireCrossReset
            if (r0 == 0) goto L_0x003c
            r9.mFireCrossReset = r2
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            boolean r1 = r9.mFirePositiveReset
            if (r1 == 0) goto L_0x0045
            r9.mFirePositiveReset = r2
            r1 = 1
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            r9.mFireNegativeReset = r3
            r4 = r1
            r1 = 0
            goto L_0x00e3
        L_0x004c:
            boolean r0 = r9.mFireCrossReset
            if (r0 != 0) goto L_0x0054
            r9.mFireCrossReset = r3
            r0 = 1
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            boolean r1 = r9.mFireNegativeReset
            if (r1 == 0) goto L_0x005d
            r9.mFireNegativeReset = r2
            r1 = 1
            goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            r9.mFirePositiveReset = r3
            goto L_0x00e2
        L_0x0062:
            boolean r0 = r9.mFireCrossReset
            r1 = 0
            if (r0 == 0) goto L_0x0078
            float r0 = r9.mFireThreshold
            float r4 = r10 - r0
            float r5 = r9.mFireLastPos
            float r5 = r5 - r0
            float r4 = r4 * r5
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0088
            r9.mFireCrossReset = r2
            r0 = 1
            goto L_0x0089
        L_0x0078:
            float r0 = r9.mFireThreshold
            float r0 = r10 - r0
            float r0 = java.lang.Math.abs(r0)
            float r4 = r9.mTriggerSlack
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
            r9.mFireCrossReset = r3
        L_0x0088:
            r0 = 0
        L_0x0089:
            boolean r4 = r9.mFireNegativeReset
            if (r4 == 0) goto L_0x00a2
            float r4 = r9.mFireThreshold
            float r5 = r10 - r4
            float r6 = r9.mFireLastPos
            float r6 = r6 - r4
            float r6 = r6 * r5
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b2
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b2
            r9.mFireNegativeReset = r2
            r4 = 1
            goto L_0x00b3
        L_0x00a2:
            float r4 = r9.mFireThreshold
            float r4 = r10 - r4
            float r4 = java.lang.Math.abs(r4)
            float r5 = r9.mTriggerSlack
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b2
            r9.mFireNegativeReset = r3
        L_0x00b2:
            r4 = 0
        L_0x00b3:
            boolean r5 = r9.mFirePositiveReset
            if (r5 == 0) goto L_0x00d1
            float r5 = r9.mFireThreshold
            float r6 = r10 - r5
            float r7 = r9.mFireLastPos
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x00cc
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00cc
            r9.mFirePositiveReset = r2
            r1 = 1
            goto L_0x00cd
        L_0x00cc:
            r1 = 0
        L_0x00cd:
            r8 = r4
            r4 = r1
            r1 = r8
            goto L_0x00e3
        L_0x00d1:
            float r1 = r9.mFireThreshold
            float r1 = r10 - r1
            float r1 = java.lang.Math.abs(r1)
            float r5 = r9.mTriggerSlack
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00e1
            r9.mFirePositiveReset = r3
        L_0x00e1:
            r1 = r4
        L_0x00e2:
            r4 = 0
        L_0x00e3:
            r9.mFireLastPos = r10
            if (r1 != 0) goto L_0x00eb
            if (r0 != 0) goto L_0x00eb
            if (r4 == 0) goto L_0x00f6
        L_0x00eb:
            android.view.ViewParent r5 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r5 = (androidx.constraintlayout.motion.widget.MotionLayout) r5
            int r6 = r9.mTriggerID
            r5.fireTrigger(r6, r4, r10)
        L_0x00f6:
            int r10 = r9.mTriggerReceiver
            int r5 = UNSET
            if (r10 != r5) goto L_0x00fe
            r10 = r11
            goto L_0x010a
        L_0x00fe:
            android.view.ViewParent r10 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
            int r5 = r9.mTriggerReceiver
            android.view.View r10 = r10.findViewById(r5)
        L_0x010a:
            if (r1 == 0) goto L_0x0128
            java.lang.String r1 = r9.mNegativeCross
            if (r1 == 0) goto L_0x0113
            r9.fire(r1, r10)
        L_0x0113:
            int r1 = r9.mViewTransitionOnNegativeCross
            int r5 = UNSET
            if (r1 == r5) goto L_0x0128
            android.view.ViewParent r1 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r5 = r9.mViewTransitionOnNegativeCross
            android.view.View[] r6 = new android.view.View[r3]
            r6[r2] = r10
            r1.viewTransition(r5, r6)
        L_0x0128:
            if (r4 == 0) goto L_0x0146
            java.lang.String r1 = r9.mPositiveCross
            if (r1 == 0) goto L_0x0131
            r9.fire(r1, r10)
        L_0x0131:
            int r1 = r9.mViewTransitionOnPositiveCross
            int r4 = UNSET
            if (r1 == r4) goto L_0x0146
            android.view.ViewParent r1 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r4 = r9.mViewTransitionOnPositiveCross
            android.view.View[] r5 = new android.view.View[r3]
            r5[r2] = r10
            r1.viewTransition(r4, r5)
        L_0x0146:
            if (r0 == 0) goto L_0x0164
            java.lang.String r0 = r9.mCross
            if (r0 == 0) goto L_0x014f
            r9.fire(r0, r10)
        L_0x014f:
            int r0 = r9.mViewTransitionOnCross
            int r1 = UNSET
            if (r0 == r1) goto L_0x0164
            android.view.ViewParent r11 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = (androidx.constraintlayout.motion.widget.MotionLayout) r11
            int r0 = r9.mViewTransitionOnCross
            android.view.View[] r1 = new android.view.View[r3]
            r1[r2] = r10
            r11.viewTransition(r0, r1)
        L_0x0164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyTrigger.conditionallyFire(float, android.view.View):void");
    }

    private void fire(String str, View view) {
        Method method;
        if (str != null) {
            if (str.startsWith(".")) {
                fireCustom(str, view);
                return;
            }
            if (this.mMethodHashMap.containsKey(str)) {
                method = this.mMethodHashMap.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.mMethodHashMap.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.mMethodHashMap.put(str, (Object) null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + Debug.getName(view));
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.mCross + "\"on class " + view.getClass().getSimpleName() + " " + Debug.getName(view));
            }
        }
    }

    private void fireCustom(String str, View view) {
        ConstraintAttribute constraintAttribute;
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.mCustomConstraints.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if ((z || lowerCase.matches(str)) && (constraintAttribute = (ConstraintAttribute) this.mCustomConstraints.get(str2)) != null) {
                constraintAttribute.applyCustom(view);
            }
        }
    }

    public Key copy(Key key) {
        super.copy(key);
        KeyTrigger keyTrigger = (KeyTrigger) key;
        this.mCurveFit = keyTrigger.mCurveFit;
        this.mCross = keyTrigger.mCross;
        this.mTriggerReceiver = keyTrigger.mTriggerReceiver;
        this.mNegativeCross = keyTrigger.mNegativeCross;
        this.mPositiveCross = keyTrigger.mPositiveCross;
        this.mTriggerID = keyTrigger.mTriggerID;
        this.mTriggerCollisionId = keyTrigger.mTriggerCollisionId;
        this.mTriggerCollisionView = keyTrigger.mTriggerCollisionView;
        this.mTriggerSlack = keyTrigger.mTriggerSlack;
        this.mFireCrossReset = keyTrigger.mFireCrossReset;
        this.mFireNegativeReset = keyTrigger.mFireNegativeReset;
        this.mFirePositiveReset = keyTrigger.mFirePositiveReset;
        this.mFireThreshold = keyTrigger.mFireThreshold;
        this.mFireLastPos = keyTrigger.mFireLastPos;
        this.mPostLayout = keyTrigger.mPostLayout;
        this.mCollisionRect = keyTrigger.mCollisionRect;
        this.mTargetRect = keyTrigger.mTargetRect;
        this.mMethodHashMap = keyTrigger.mMethodHashMap;
        return this;
    }

    public Key clone() {
        return new KeyTrigger().copy(this);
    }
}
