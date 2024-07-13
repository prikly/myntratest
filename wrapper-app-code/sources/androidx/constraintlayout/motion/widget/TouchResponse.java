package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.widget.NestedScrollView;

class TouchResponse {
    private static final float[][] TOUCH_DIRECTION = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    private static final float[][] TOUCH_SIDES = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private float[] mAnchorDpDt;
    private int mAutoCompleteMode;
    private float mDragScale;
    private boolean mDragStarted;
    private float mDragThreshold;
    private int mFlags;
    boolean mIsRotateMode;
    private float mLastTouchX;
    private float mLastTouchY;
    private int mLimitBoundsTo;
    private float mMaxAcceleration;
    private float mMaxVelocity;
    private final MotionLayout mMotionLayout;
    private boolean mMoveWhenScrollAtTop;
    private int mOnTouchUp;
    float mRotateCenterX;
    float mRotateCenterY;
    private int mRotationCenterId;
    private int mSpringBoundary;
    private float mSpringDamping;
    private float mSpringMass;
    private float mSpringStiffness;
    private float mSpringStopThreshold;
    private int[] mTempLoc;
    private int mTouchAnchorId;
    private int mTouchAnchorSide;
    private float mTouchAnchorX;
    private float mTouchAnchorY;
    private float mTouchDirectionX;
    private float mTouchDirectionY;
    private int mTouchRegionId;
    private int mTouchSide;

    public void setRTL(boolean z) {
        if (z) {
            float[][] fArr = TOUCH_DIRECTION;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = TOUCH_SIDES;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = TOUCH_DIRECTION;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = TOUCH_SIDES;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = TOUCH_SIDES;
        int i = this.mTouchAnchorSide;
        this.mTouchAnchorX = fArr5[i][0];
        this.mTouchAnchorY = fArr5[i][1];
        int i2 = this.mTouchSide;
        float[][] fArr6 = TOUCH_DIRECTION;
        if (i2 < fArr6.length) {
            this.mTouchDirectionX = fArr6[i2][0];
            this.mTouchDirectionY = fArr6[i2][1];
        }
    }

    /* access modifiers changed from: package-private */
    public void setUpTouchEvent(float f2, float f3) {
        this.mLastTouchX = f2;
        this.mLastTouchY = f3;
        this.mDragStarted = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0328  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void processTouchRotateEvent(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker r25, int r26, androidx.constraintlayout.motion.widget.MotionScene r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r2 = r24
            r1.addMovement(r2)
            int r3 = r24.getAction()
            r4 = 0
            if (r3 == 0) goto L_0x033b
            r5 = 1135869952(0x43b40000, float:360.0)
            r6 = -1
            r9 = 1073741824(0x40000000, float:2.0)
            r10 = 1
            if (r3 == r10) goto L_0x01c4
            r11 = 2
            if (r3 == r11) goto L_0x001d
            goto L_0x0349
        L_0x001d:
            r24.getRawY()
            r24.getRawX()
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r3 = r3 / r9
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r9
            int r12 = r0.mRotationCenterId
            if (r12 == r6) goto L_0x006c
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            android.view.View r3 = r3.findViewById(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            int[] r12 = r0.mTempLoc
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.mTempLoc
            r11 = r11[r4]
            float r11 = (float) r11
            int r12 = r3.getLeft()
            int r13 = r3.getRight()
            int r12 = r12 + r13
            float r12 = (float) r12
            float r12 = r12 / r9
            float r11 = r11 + r12
            int[] r12 = r0.mTempLoc
            r12 = r12[r10]
            float r12 = (float) r12
            int r13 = r3.getTop()
            int r3 = r3.getBottom()
            int r13 = r13 + r3
            float r3 = (float) r13
            float r3 = r3 / r9
            float r3 = r3 + r12
            r22 = r11
            r11 = r3
            r3 = r22
            goto L_0x00b3
        L_0x006c:
            int r12 = r0.mTouchAnchorId
            if (r12 == r6) goto L_0x00b3
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionController r12 = r13.getMotionController(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.mMotionLayout
            int r12 = r12.getAnimateRelativeTo()
            android.view.View r12 = r13.findViewById(r12)
            if (r12 != 0) goto L_0x008a
            java.lang.String r9 = "TouchResponse"
            java.lang.String r12 = "could not find view to animate to"
            android.util.Log.e(r9, r12)
            goto L_0x00b3
        L_0x008a:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            int[] r11 = r0.mTempLoc
            r3.getLocationOnScreen(r11)
            int[] r3 = r0.mTempLoc
            r3 = r3[r4]
            float r3 = (float) r3
            int r11 = r12.getLeft()
            int r13 = r12.getRight()
            int r11 = r11 + r13
            float r11 = (float) r11
            float r11 = r11 / r9
            float r3 = r3 + r11
            int[] r11 = r0.mTempLoc
            r11 = r11[r10]
            float r11 = (float) r11
            int r13 = r12.getTop()
            int r12 = r12.getBottom()
            int r13 = r13 + r12
            float r12 = (float) r13
            float r12 = r12 / r9
            float r11 = r11 + r12
        L_0x00b3:
            float r9 = r24.getRawX()
            float r9 = r9 - r3
            float r12 = r24.getRawY()
            float r12 = r12 - r11
            float r13 = r24.getRawY()
            float r13 = r13 - r11
            double r13 = (double) r13
            float r15 = r24.getRawX()
            float r15 = r15 - r3
            r27 = r9
            double r8 = (double) r15
            double r8 = java.lang.Math.atan2(r13, r8)
            float r13 = r0.mLastTouchY
            float r13 = r13 - r11
            double r13 = (double) r13
            float r11 = r0.mLastTouchX
            float r11 = r11 - r3
            double r6 = (double) r11
            double r6 = java.lang.Math.atan2(r13, r6)
            double r6 = r8 - r6
            r13 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r6 = r6 * r13
            r13 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r6 = r6 / r13
            float r6 = (float) r6
            r7 = 1134886912(0x43a50000, float:330.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f3
            float r6 = r6 - r5
            goto L_0x00fa
        L_0x00f3:
            r7 = -1012596736(0xffffffffc3a50000, float:-330.0)
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x00fa
            float r6 = r6 + r5
        L_0x00fa:
            float r7 = java.lang.Math.abs(r6)
            double r13 = (double) r7
            r16 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r7 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r7 > 0) goto L_0x010c
            boolean r7 = r0.mDragStarted
            if (r7 == 0) goto L_0x0349
        L_0x010c:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.mMotionLayout
            float r7 = r7.getProgress()
            boolean r11 = r0.mDragStarted
            if (r11 != 0) goto L_0x011d
            r0.mDragStarted = r10
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            r11.setProgress(r7)
        L_0x011d:
            int r11 = r0.mTouchAnchorId
            r3 = -1
            if (r11 == r3) goto L_0x0146
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            float r5 = r0.mTouchAnchorX
            float r13 = r0.mTouchAnchorY
            float[] r14 = r0.mAnchorDpDt
            r16 = r3
            r17 = r11
            r18 = r7
            r19 = r5
            r20 = r13
            r21 = r14
            r16.getAnchorDpDt(r17, r18, r19, r20, r21)
            float[] r3 = r0.mAnchorDpDt
            r5 = r3[r10]
            double r13 = (double) r5
            double r13 = java.lang.Math.toDegrees(r13)
            float r5 = (float) r13
            r3[r10] = r5
            goto L_0x014a
        L_0x0146:
            float[] r3 = r0.mAnchorDpDt
            r3[r10] = r5
        L_0x014a:
            float r3 = r0.mDragScale
            float r6 = r6 * r3
            float[] r3 = r0.mAnchorDpDt
            r3 = r3[r10]
            float r6 = r6 / r3
            float r7 = r7 + r6
            r3 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r7, r3)
            r6 = 0
            float r5 = java.lang.Math.max(r5, r6)
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.mMotionLayout
            float r7 = r7.getProgress()
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x01b1
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0171
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0179
        L_0x0171:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            if (r6 != 0) goto L_0x0176
            r4 = 1
        L_0x0176:
            r3.endTrigger(r4)
        L_0x0179:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            r3.setProgress(r5)
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            float r3 = r25.getXVelocity()
            float r1 = r25.getYVelocity()
            double r4 = (double) r1
            double r6 = (double) r3
            double r10 = java.lang.Math.hypot(r4, r6)
            double r3 = java.lang.Math.atan2(r4, r6)
            double r3 = r3 - r8
            double r3 = java.lang.Math.sin(r3)
            double r10 = r10 * r3
            r9 = r27
            double r3 = (double) r9
            double r5 = (double) r12
            double r3 = java.lang.Math.hypot(r3, r5)
            double r10 = r10 / r3
            float r1 = (float) r10
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            double r4 = (double) r1
            double r4 = java.lang.Math.toDegrees(r4)
            float r1 = (float) r4
            r3.mLastVelocity = r1
            goto L_0x01b6
        L_0x01b1:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            r3 = 0
            r1.mLastVelocity = r3
        L_0x01b6:
            float r1 = r24.getRawX()
            r0.mLastTouchX = r1
            float r1 = r24.getRawY()
            r0.mLastTouchY = r1
            goto L_0x0349
        L_0x01c4:
            r0.mDragStarted = r4
            r6 = 16
            r1.computeCurrentVelocity(r6)
            float r6 = r25.getXVelocity()
            float r1 = r25.getYVelocity()
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.mMotionLayout
            float r7 = r7.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.mMotionLayout
            int r8 = r8.getWidth()
            float r8 = (float) r8
            float r8 = r8 / r9
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r11 = r11 / r9
            int r12 = r0.mRotationCenterId
            r3 = -1
            if (r12 == r3) goto L_0x021f
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.mMotionLayout
            android.view.View r8 = r8.findViewById(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            int[] r12 = r0.mTempLoc
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.mTempLoc
            r4 = r11[r4]
            float r4 = (float) r4
            int r11 = r8.getLeft()
            int r12 = r8.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r9
            float r4 = r4 + r11
            int[] r11 = r0.mTempLoc
            r11 = r11[r10]
            float r11 = (float) r11
            int r12 = r8.getTop()
            int r8 = r8.getBottom()
        L_0x0219:
            int r12 = r12 + r8
            float r8 = (float) r12
            float r8 = r8 / r9
            float r11 = r11 + r8
            r8 = r4
            goto L_0x025a
        L_0x021f:
            int r12 = r0.mTouchAnchorId
            r3 = -1
            if (r12 == r3) goto L_0x025a
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionController r8 = r8.getMotionController(r12)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            int r8 = r8.getAnimateRelativeTo()
            android.view.View r8 = r11.findViewById(r8)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r0.mMotionLayout
            int[] r12 = r0.mTempLoc
            r11.getLocationOnScreen(r12)
            int[] r11 = r0.mTempLoc
            r4 = r11[r4]
            float r4 = (float) r4
            int r11 = r8.getLeft()
            int r12 = r8.getRight()
            int r11 = r11 + r12
            float r11 = (float) r11
            float r11 = r11 / r9
            float r4 = r4 + r11
            int[] r11 = r0.mTempLoc
            r11 = r11[r10]
            float r11 = (float) r11
            int r12 = r8.getTop()
            int r8 = r8.getBottom()
            goto L_0x0219
        L_0x025a:
            float r4 = r24.getRawX()
            float r4 = r4 - r8
            float r2 = r24.getRawY()
            float r2 = r2 - r11
            double r8 = (double) r2
            double r11 = (double) r4
            double r8 = java.lang.Math.atan2(r8, r11)
            double r8 = java.lang.Math.toDegrees(r8)
            int r11 = r0.mTouchAnchorId
            r3 = -1
            if (r11 == r3) goto L_0x0297
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            float r5 = r0.mTouchAnchorX
            float r12 = r0.mTouchAnchorY
            float[] r13 = r0.mAnchorDpDt
            r16 = r3
            r17 = r11
            r18 = r7
            r19 = r5
            r20 = r12
            r21 = r13
            r16.getAnchorDpDt(r17, r18, r19, r20, r21)
            float[] r3 = r0.mAnchorDpDt
            r5 = r3[r10]
            double r11 = (double) r5
            double r11 = java.lang.Math.toDegrees(r11)
            float r5 = (float) r11
            r3[r10] = r5
            goto L_0x029b
        L_0x0297:
            float[] r3 = r0.mAnchorDpDt
            r3[r10] = r5
        L_0x029b:
            float r1 = r1 + r2
            double r1 = (double) r1
            float r6 = r6 + r4
            double r3 = (double) r6
            double r1 = java.lang.Math.atan2(r1, r3)
            double r1 = java.lang.Math.toDegrees(r1)
            double r1 = r1 - r8
            float r1 = (float) r1
            r2 = 1115291648(0x427a0000, float:62.5)
            float r1 = r1 * r2
            boolean r2 = java.lang.Float.isNaN(r1)
            r3 = 1077936128(0x40400000, float:3.0)
            if (r2 != 0) goto L_0x02c2
            float r2 = r1 * r3
            float r4 = r0.mDragScale
            float r2 = r2 * r4
            float[] r4 = r0.mAnchorDpDt
            r4 = r4[r10]
            float r2 = r2 / r4
            float r2 = r2 + r7
            goto L_0x02c3
        L_0x02c2:
            r2 = r7
        L_0x02c3:
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0328
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x0328
            int r4 = r0.mOnTouchUp
            r5 = 3
            if (r4 == r5) goto L_0x0328
            float r4 = r0.mDragScale
            float r1 = r1 * r4
            float[] r4 = r0.mAnchorDpDt
            r4 = r4[r10]
            float r1 = r1 / r4
            double r4 = (double) r2
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x02e5
            r2 = 0
            goto L_0x02e7
        L_0x02e5:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x02e7:
            int r4 = r0.mOnTouchUp
            r5 = 6
            if (r4 != r5) goto L_0x02f9
            float r2 = r7 + r1
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x02f7
            float r1 = java.lang.Math.abs(r1)
        L_0x02f7:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x02f9:
            int r4 = r0.mOnTouchUp
            r5 = 7
            if (r4 != r5) goto L_0x030c
            float r2 = r7 + r1
            r4 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x030b
            float r1 = java.lang.Math.abs(r1)
            float r1 = -r1
        L_0x030b:
            r2 = 0
        L_0x030c:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.mMotionLayout
            int r5 = r0.mOnTouchUp
            float r1 = r1 * r3
            r4.touchAnimateTo(r5, r2, r1)
            r1 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0320
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x0349
        L_0x0320:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L_0x0349
        L_0x0328:
            r1 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0333
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0349
        L_0x0333:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L_0x0349
        L_0x033b:
            float r1 = r24.getRawX()
            r0.mLastTouchX = r1
            float r1 = r24.getRawY()
            r0.mLastTouchY = r1
            r0.mDragStarted = r4
        L_0x0349:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.TouchResponse.processTouchRotateEvent(android.view.MotionEvent, androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker, int, androidx.constraintlayout.motion.widget.MotionScene):void");
    }

    /* access modifiers changed from: package-private */
    public void processTouchEvent(MotionEvent motionEvent, MotionLayout.MotionTracker motionTracker, int i, MotionScene motionScene) {
        float f2;
        float f3;
        MotionLayout.MotionTracker motionTracker2 = motionTracker;
        if (this.mIsRotateMode) {
            processTouchRotateEvent(motionEvent, motionTracker, i, motionScene);
            return;
        }
        motionTracker2.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mLastTouchX = motionEvent.getRawX();
            this.mLastTouchY = motionEvent.getRawY();
            this.mDragStarted = false;
        } else if (action == 1) {
            this.mDragStarted = false;
            motionTracker2.computeCurrentVelocity(1000);
            float xVelocity = motionTracker.getXVelocity();
            float yVelocity = motionTracker.getYVelocity();
            float progress = this.mMotionLayout.getProgress();
            int i2 = this.mTouchAnchorId;
            if (i2 != -1) {
                this.mMotionLayout.getAnchorDpDt(i2, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
            } else {
                float min = (float) Math.min(this.mMotionLayout.getWidth(), this.mMotionLayout.getHeight());
                float[] fArr = this.mAnchorDpDt;
                fArr[1] = this.mTouchDirectionY * min;
                fArr[0] = min * this.mTouchDirectionX;
            }
            float f4 = this.mTouchDirectionX;
            float[] fArr2 = this.mAnchorDpDt;
            float f5 = fArr2[0];
            float f6 = fArr2[1];
            if (f4 != 0.0f) {
                f2 = xVelocity / fArr2[0];
            } else {
                f2 = yVelocity / fArr2[1];
            }
            float f7 = !Float.isNaN(f2) ? (f2 / 3.0f) + progress : progress;
            if (f7 != 0.0f && f7 != 1.0f && this.mOnTouchUp != 3) {
                float f8 = ((double) f7) < 0.5d ? 0.0f : 1.0f;
                if (this.mOnTouchUp == 6) {
                    if (progress + f2 < 0.0f) {
                        f2 = Math.abs(f2);
                    }
                    f8 = 1.0f;
                }
                if (this.mOnTouchUp == 7) {
                    if (progress + f2 > 1.0f) {
                        f2 = -Math.abs(f2);
                    }
                    f8 = 0.0f;
                }
                this.mMotionLayout.touchAnimateTo(this.mOnTouchUp, f8, f2);
                if (0.0f >= progress || 1.0f <= progress) {
                    this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                }
            } else if (0.0f >= f7 || 1.0f <= f7) {
                this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
            }
        } else if (action == 2) {
            float rawY = motionEvent.getRawY() - this.mLastTouchY;
            float rawX = motionEvent.getRawX() - this.mLastTouchX;
            if (Math.abs((this.mTouchDirectionX * rawX) + (this.mTouchDirectionY * rawY)) > this.mDragThreshold || this.mDragStarted) {
                float progress2 = this.mMotionLayout.getProgress();
                if (!this.mDragStarted) {
                    this.mDragStarted = true;
                    this.mMotionLayout.setProgress(progress2);
                }
                int i3 = this.mTouchAnchorId;
                if (i3 != -1) {
                    this.mMotionLayout.getAnchorDpDt(i3, progress2, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                } else {
                    float min2 = (float) Math.min(this.mMotionLayout.getWidth(), this.mMotionLayout.getHeight());
                    float[] fArr3 = this.mAnchorDpDt;
                    fArr3[1] = this.mTouchDirectionY * min2;
                    fArr3[0] = min2 * this.mTouchDirectionX;
                }
                float f9 = this.mTouchDirectionX;
                float[] fArr4 = this.mAnchorDpDt;
                if (((double) Math.abs(((f9 * fArr4[0]) + (this.mTouchDirectionY * fArr4[1])) * this.mDragScale)) < 0.01d) {
                    float[] fArr5 = this.mAnchorDpDt;
                    fArr5[0] = 0.01f;
                    fArr5[1] = 0.01f;
                }
                if (this.mTouchDirectionX != 0.0f) {
                    f3 = rawX / this.mAnchorDpDt[0];
                } else {
                    f3 = rawY / this.mAnchorDpDt[1];
                }
                float max = Math.max(Math.min(progress2 + f3, 1.0f), 0.0f);
                if (this.mOnTouchUp == 6) {
                    max = Math.max(max, 0.01f);
                }
                if (this.mOnTouchUp == 7) {
                    max = Math.min(max, 0.99f);
                }
                float progress3 = this.mMotionLayout.getProgress();
                if (max != progress3) {
                    int i4 = (progress3 > 0.0f ? 1 : (progress3 == 0.0f ? 0 : -1));
                    if (i4 == 0 || progress3 == 1.0f) {
                        this.mMotionLayout.endTrigger(i4 == 0);
                    }
                    this.mMotionLayout.setProgress(max);
                    motionTracker2.computeCurrentVelocity(1000);
                    this.mMotionLayout.mLastVelocity = this.mTouchDirectionX != 0.0f ? motionTracker.getXVelocity() / this.mAnchorDpDt[0] : motionTracker.getYVelocity() / this.mAnchorDpDt[1];
                } else {
                    this.mMotionLayout.mLastVelocity = 0.0f;
                }
                this.mLastTouchX = motionEvent.getRawX();
                this.mLastTouchY = motionEvent.getRawY();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setDown(float f2, float f3) {
        this.mLastTouchX = f2;
        this.mLastTouchY = f3;
    }

    /* access modifiers changed from: package-private */
    public float getProgressDirection(float f2, float f3) {
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, this.mMotionLayout.getProgress(), this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        if (this.mTouchDirectionX != 0.0f) {
            float[] fArr = this.mAnchorDpDt;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f2 * this.mTouchDirectionX) / this.mAnchorDpDt[0];
        }
        float[] fArr2 = this.mAnchorDpDt;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f3 * this.mTouchDirectionY) / this.mAnchorDpDt[1];
    }

    /* access modifiers changed from: package-private */
    public void scrollUp(float f2, float f3) {
        float f4;
        boolean z = false;
        this.mDragStarted = false;
        float progress = this.mMotionLayout.getProgress();
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f5 = this.mTouchDirectionX;
        float[] fArr = this.mAnchorDpDt;
        float f6 = fArr[0];
        float f7 = this.mTouchDirectionY;
        float f8 = fArr[1];
        float f9 = 0.0f;
        if (f5 != 0.0f) {
            f4 = (f2 * f5) / fArr[0];
        } else {
            f4 = (f3 * f7) / fArr[1];
        }
        if (!Float.isNaN(f4)) {
            progress += f4 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z2 = progress != 1.0f;
            if (this.mOnTouchUp != 3) {
                z = true;
            }
            if (z && z2) {
                MotionLayout motionLayout = this.mMotionLayout;
                int i = this.mOnTouchUp;
                if (((double) progress) >= 0.5d) {
                    f9 = 1.0f;
                }
                motionLayout.touchAnimateTo(i, f9, f4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void scrollMove(float f2, float f3) {
        float f4;
        float progress = this.mMotionLayout.getProgress();
        if (!this.mDragStarted) {
            this.mDragStarted = true;
            this.mMotionLayout.setProgress(progress);
        }
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, progress, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f5 = this.mTouchDirectionX;
        float[] fArr = this.mAnchorDpDt;
        if (((double) Math.abs((f5 * fArr[0]) + (this.mTouchDirectionY * fArr[1]))) < 0.01d) {
            float[] fArr2 = this.mAnchorDpDt;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f6 = this.mTouchDirectionX;
        if (f6 != 0.0f) {
            f4 = (f2 * f6) / this.mAnchorDpDt[0];
        } else {
            f4 = (f3 * this.mTouchDirectionY) / this.mAnchorDpDt[1];
        }
        float max = Math.max(Math.min(progress + f4, 1.0f), 0.0f);
        if (max != this.mMotionLayout.getProgress()) {
            this.mMotionLayout.setProgress(max);
        }
    }

    /* access modifiers changed from: package-private */
    public void setupTouch() {
        View view;
        int i = this.mTouchAnchorId;
        if (i != -1) {
            view = this.mMotionLayout.findViewById(i);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + Debug.getName(this.mMotionLayout.getContext(), this.mTouchAnchorId));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new View.OnTouchListener(this) {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return false;
                }
            });
            nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener(this) {
                public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public float getMaxAcceleration() {
        return this.mMaxAcceleration;
    }

    public float getMaxVelocity() {
        return this.mMaxVelocity;
    }

    /* access modifiers changed from: package-private */
    public boolean getMoveWhenScrollAtTop() {
        return this.mMoveWhenScrollAtTop;
    }

    public int getAutoCompleteMode() {
        return this.mAutoCompleteMode;
    }

    /* access modifiers changed from: package-private */
    public RectF getTouchRegion(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.mTouchRegionId;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    public int getTouchRegionId() {
        return this.mTouchRegionId;
    }

    /* access modifiers changed from: package-private */
    public RectF getLimitBoundsTo(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.mLimitBoundsTo;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    public float dot(float f2, float f3) {
        return (f2 * this.mTouchDirectionX) + (f3 * this.mTouchDirectionY);
    }

    public String toString() {
        if (Float.isNaN(this.mTouchDirectionX)) {
            return "rotation";
        }
        return this.mTouchDirectionX + " , " + this.mTouchDirectionY;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public float getSpringStiffness() {
        return this.mSpringStiffness;
    }

    public float getSpringMass() {
        return this.mSpringMass;
    }

    public float getSpringDamping() {
        return this.mSpringDamping;
    }

    public float getSpringStopThreshold() {
        return this.mSpringStopThreshold;
    }

    public int getSpringBoundary() {
        return this.mSpringBoundary;
    }

    /* access modifiers changed from: package-private */
    public boolean isDragStarted() {
        return this.mDragStarted;
    }
}
