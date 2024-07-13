package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;

public abstract class AutoScrollHelper implements View.OnTouchListener {
    private static final int DEFAULT_ACTIVATION_DELAY = ViewConfiguration.getTapTimeout();
    private int mActivationDelay;
    private boolean mAlreadyDelayed;
    boolean mAnimating;
    private final Interpolator mEdgeInterpolator = new AccelerateInterpolator();
    private int mEdgeType;
    private boolean mEnabled;
    private boolean mExclusive;
    private float[] mMaximumEdges = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] mMaximumVelocity = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] mMinimumVelocity = {0.0f, 0.0f};
    boolean mNeedsCancel;
    boolean mNeedsReset;
    private float[] mRelativeEdges = {0.0f, 0.0f};
    private float[] mRelativeVelocity = {0.0f, 0.0f};
    private Runnable mRunnable;
    final ClampedScroller mScroller = new ClampedScroller();
    final View mTarget;

    static float constrain(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    static int constrain(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public abstract boolean canTargetScrollHorizontally(int i);

    public abstract boolean canTargetScrollVertically(int i);

    public abstract void scrollTargetBy(int i, int i2);

    public AutoScrollHelper(View view) {
        this.mTarget = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f2 = (float) ((int) ((displayMetrics.density * 1575.0f) + 0.5f));
        setMaximumVelocity(f2, f2);
        float f3 = (float) ((int) ((displayMetrics.density * 315.0f) + 0.5f));
        setMinimumVelocity(f3, f3);
        setEdgeType(1);
        setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
        setRelativeEdges(0.2f, 0.2f);
        setRelativeVelocity(1.0f, 1.0f);
        setActivationDelay(DEFAULT_ACTIVATION_DELAY);
        setRampUpDuration(500);
        setRampDownDuration(500);
    }

    public AutoScrollHelper setEnabled(boolean z) {
        if (this.mEnabled && !z) {
            requestStop();
        }
        this.mEnabled = z;
        return this;
    }

    public AutoScrollHelper setMaximumVelocity(float f2, float f3) {
        float[] fArr = this.mMaximumVelocity;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public AutoScrollHelper setMinimumVelocity(float f2, float f3) {
        float[] fArr = this.mMinimumVelocity;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public AutoScrollHelper setRelativeVelocity(float f2, float f3) {
        float[] fArr = this.mRelativeVelocity;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public AutoScrollHelper setEdgeType(int i) {
        this.mEdgeType = i;
        return this;
    }

    public AutoScrollHelper setRelativeEdges(float f2, float f3) {
        float[] fArr = this.mRelativeEdges;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public AutoScrollHelper setMaximumEdges(float f2, float f3) {
        float[] fArr = this.mMaximumEdges;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public AutoScrollHelper setActivationDelay(int i) {
        this.mActivationDelay = i;
        return this;
    }

    public AutoScrollHelper setRampUpDuration(int i) {
        this.mScroller.setRampUpDuration(i);
        return this;
    }

    public AutoScrollHelper setRampDownDuration(int i) {
        this.mScroller.setRampDownDuration(i);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.mEnabled
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.requestStop()
            goto L_0x0058
        L_0x001a:
            r5.mNeedsCancel = r2
            r5.mAlreadyDelayed = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.mTarget
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.computeTargetVelocity(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.mTarget
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.computeTargetVelocity(r2, r7, r6, r3)
            androidx.core.widget.AutoScrollHelper$ClampedScroller r7 = r5.mScroller
            r7.setTargetVelocity(r0, r6)
            boolean r6 = r5.mAnimating
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.shouldAnimate()
            if (r6 == 0) goto L_0x0058
            r5.startAnimating()
        L_0x0058:
            boolean r6 = r5.mExclusive
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.mAnimating
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AutoScrollHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean shouldAnimate() {
        ClampedScroller clampedScroller = this.mScroller;
        int verticalDirection = clampedScroller.getVerticalDirection();
        int horizontalDirection = clampedScroller.getHorizontalDirection();
        return (verticalDirection != 0 && canTargetScrollVertically(verticalDirection)) || (horizontalDirection != 0 && canTargetScrollHorizontally(horizontalDirection));
    }

    private void startAnimating() {
        int i;
        if (this.mRunnable == null) {
            this.mRunnable = new ScrollAnimationRunnable();
        }
        this.mAnimating = true;
        this.mNeedsReset = true;
        if (this.mAlreadyDelayed || (i = this.mActivationDelay) <= 0) {
            this.mRunnable.run();
        } else {
            ViewCompat.postOnAnimationDelayed(this.mTarget, this.mRunnable, (long) i);
        }
        this.mAlreadyDelayed = true;
    }

    private void requestStop() {
        if (this.mNeedsReset) {
            this.mAnimating = false;
        } else {
            this.mScroller.requestStop();
        }
    }

    private float computeTargetVelocity(int i, float f2, float f3, float f4) {
        float edgeValue = getEdgeValue(this.mRelativeEdges[i], f3, this.mMaximumEdges[i], f2);
        int i2 = (edgeValue > 0.0f ? 1 : (edgeValue == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f5 = this.mRelativeVelocity[i];
        float f6 = this.mMinimumVelocity[i];
        float f7 = this.mMaximumVelocity[i];
        float f8 = f5 * f4;
        if (i2 > 0) {
            return constrain(edgeValue * f8, f6, f7);
        }
        return -constrain((-edgeValue) * f8, f6, f7);
    }

    private float getEdgeValue(float f2, float f3, float f4, float f5) {
        float f6;
        float constrain = constrain(f2 * f3, 0.0f, f4);
        float constrainEdgeValue = constrainEdgeValue(f3 - f5, constrain) - constrainEdgeValue(f5, constrain);
        if (constrainEdgeValue < 0.0f) {
            f6 = -this.mEdgeInterpolator.getInterpolation(-constrainEdgeValue);
        } else if (constrainEdgeValue <= 0.0f) {
            return 0.0f;
        } else {
            f6 = this.mEdgeInterpolator.getInterpolation(constrainEdgeValue);
        }
        return constrain(f6, -1.0f, 1.0f);
    }

    private float constrainEdgeValue(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i = this.mEdgeType;
        if (i == 0 || i == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                return (!this.mAnimating || this.mEdgeType != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
    }

    /* access modifiers changed from: package-private */
    public void cancelTargetTouch() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.mTarget.onTouchEvent(obtain);
        obtain.recycle();
    }

    private class ScrollAnimationRunnable implements Runnable {
        ScrollAnimationRunnable() {
        }

        public void run() {
            if (AutoScrollHelper.this.mAnimating) {
                if (AutoScrollHelper.this.mNeedsReset) {
                    AutoScrollHelper.this.mNeedsReset = false;
                    AutoScrollHelper.this.mScroller.start();
                }
                ClampedScroller clampedScroller = AutoScrollHelper.this.mScroller;
                if (clampedScroller.isFinished() || !AutoScrollHelper.this.shouldAnimate()) {
                    AutoScrollHelper.this.mAnimating = false;
                    return;
                }
                if (AutoScrollHelper.this.mNeedsCancel) {
                    AutoScrollHelper.this.mNeedsCancel = false;
                    AutoScrollHelper.this.cancelTargetTouch();
                }
                clampedScroller.computeScrollDelta();
                AutoScrollHelper.this.scrollTargetBy(clampedScroller.getDeltaX(), clampedScroller.getDeltaY());
                ViewCompat.postOnAnimation(AutoScrollHelper.this.mTarget, this);
            }
        }
    }

    private static class ClampedScroller {
        private long mDeltaTime = 0;
        private int mDeltaX = 0;
        private int mDeltaY = 0;
        private int mEffectiveRampDown;
        private int mRampDownDuration;
        private int mRampUpDuration;
        private long mStartTime = Long.MIN_VALUE;
        private long mStopTime = -1;
        private float mStopValue;
        private float mTargetVelocityX;
        private float mTargetVelocityY;

        private float interpolateValue(float f2) {
            return (-4.0f * f2 * f2) + (f2 * 4.0f);
        }

        ClampedScroller() {
        }

        public void setRampUpDuration(int i) {
            this.mRampUpDuration = i;
        }

        public void setRampDownDuration(int i) {
            this.mRampDownDuration = i;
        }

        public void start() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.mStartTime = currentAnimationTimeMillis;
            this.mStopTime = -1;
            this.mDeltaTime = currentAnimationTimeMillis;
            this.mStopValue = 0.5f;
            this.mDeltaX = 0;
            this.mDeltaY = 0;
        }

        public void requestStop() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.mEffectiveRampDown = AutoScrollHelper.constrain((int) (currentAnimationTimeMillis - this.mStartTime), 0, this.mRampDownDuration);
            this.mStopValue = getValueAt(currentAnimationTimeMillis);
            this.mStopTime = currentAnimationTimeMillis;
        }

        public boolean isFinished() {
            return this.mStopTime > 0 && AnimationUtils.currentAnimationTimeMillis() > this.mStopTime + ((long) this.mEffectiveRampDown);
        }

        private float getValueAt(long j) {
            if (j < this.mStartTime) {
                return 0.0f;
            }
            long j2 = this.mStopTime;
            if (j2 < 0 || j < j2) {
                return AutoScrollHelper.constrain(((float) (j - this.mStartTime)) / ((float) this.mRampUpDuration), 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f2 = this.mStopValue;
            return (1.0f - f2) + (f2 * AutoScrollHelper.constrain(((float) j3) / ((float) this.mEffectiveRampDown), 0.0f, 1.0f));
        }

        public void computeScrollDelta() {
            if (this.mDeltaTime != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float interpolateValue = interpolateValue(getValueAt(currentAnimationTimeMillis));
                this.mDeltaTime = currentAnimationTimeMillis;
                float f2 = ((float) (currentAnimationTimeMillis - this.mDeltaTime)) * interpolateValue;
                this.mDeltaX = (int) (this.mTargetVelocityX * f2);
                this.mDeltaY = (int) (f2 * this.mTargetVelocityY);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public void setTargetVelocity(float f2, float f3) {
            this.mTargetVelocityX = f2;
            this.mTargetVelocityY = f3;
        }

        public int getHorizontalDirection() {
            float f2 = this.mTargetVelocityX;
            return (int) (f2 / Math.abs(f2));
        }

        public int getVerticalDirection() {
            float f2 = this.mTargetVelocityY;
            return (int) (f2 / Math.abs(f2));
        }

        public int getDeltaX() {
            return this.mDeltaX;
        }

        public int getDeltaY() {
            return this.mDeltaY;
        }
    }
}
