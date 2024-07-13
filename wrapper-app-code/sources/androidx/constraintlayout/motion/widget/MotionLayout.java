package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import androidx.core.view.NestedScrollingParent3;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    public static boolean IS_IN_EDIT_MODE;
    private float lastPos;
    private float lastY;
    private long mAnimationStartTime;
    /* access modifiers changed from: private */
    public int mBeginState;
    private RectF mBoundsCheck;
    int mCurrentState;
    int mDebugPath;
    private DecelerateInterpolator mDecelerateLogic;
    private ArrayList<MotionHelper> mDecoratorsHelpers;
    private boolean mDelayedApply;
    private DesignTool mDesignTool;
    DevModeDraw mDevModeDraw;
    /* access modifiers changed from: private */
    public int mEndState;
    int mEndWrapHeight;
    int mEndWrapWidth;
    HashMap<View, MotionController> mFrameArrayList;
    private int mFrames;
    int mHeightMeasureMode;
    private boolean mInLayout;
    /* access modifiers changed from: private */
    public boolean mInRotation;
    boolean mInTransition;
    private boolean mInteractionEnabled;
    Interpolator mInterpolator;
    private Matrix mInverseMatrix;
    boolean mIsAnimating;
    private boolean mKeepAnimating;
    private KeyCache mKeyCache;
    private long mLastDrawTime;
    private float mLastFps;
    /* access modifiers changed from: private */
    public int mLastHeightMeasureSpec;
    int mLastLayoutHeight;
    int mLastLayoutWidth;
    float mLastVelocity;
    /* access modifiers changed from: private */
    public int mLastWidthMeasureSpec;
    private float mListenerPosition;
    private int mListenerState;
    protected boolean mMeasureDuringTransition;
    Model mModel;
    private boolean mNeedsFireTransitionCompleted;
    int mOldHeight;
    int mOldWidth;
    private Runnable mOnComplete;
    private ArrayList<MotionHelper> mOnHideHelpers;
    private ArrayList<MotionHelper> mOnShowHelpers;
    float mPostInterpolationPosition;
    HashMap<View, ViewState> mPreRotate;
    /* access modifiers changed from: private */
    public int mPreRotateHeight;
    /* access modifiers changed from: private */
    public int mPreRotateWidth;
    private int mPreviouseRotation;
    Interpolator mProgressInterpolator;
    private View mRegionView;
    int mRotatMode;
    MotionScene mScene;
    private int[] mScheduledTransitionTo;
    int mScheduledTransitions;
    float mScrollTargetDT;
    float mScrollTargetDX;
    float mScrollTargetDY;
    long mScrollTargetTime;
    int mStartWrapHeight;
    int mStartWrapWidth;
    /* access modifiers changed from: private */
    public StateCache mStateCache;
    private StopLogic mStopLogic;
    Rect mTempRect;
    private boolean mTemporalInterpolator;
    ArrayList<Integer> mTransitionCompleted;
    private float mTransitionDuration;
    float mTransitionGoalPosition;
    private boolean mTransitionInstantly;
    float mTransitionLastPosition;
    private long mTransitionLastTime;
    private TransitionListener mTransitionListener;
    private CopyOnWriteArrayList<TransitionListener> mTransitionListeners;
    float mTransitionPosition;
    TransitionState mTransitionState;
    boolean mUndergoingMotion;
    int mWidthMeasureMode;

    protected interface MotionTracker {
        void addMovement(MotionEvent motionEvent);

        void computeCurrentVelocity(int i);

        float getXVelocity();

        float getYVelocity();

        void recycle();
    }

    public interface TransitionListener {
        void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f2);

        void onTransitionCompleted(MotionLayout motionLayout, int i);

        void onTransitionStarted(MotionLayout motionLayout, int i, int i2);

        void onTransitionTrigger(MotionLayout motionLayout, int i, boolean z, float f2);
    }

    enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private static boolean willJump(float f2, float f3, float f4) {
        if (f2 > 0.0f) {
            float f5 = f2 / f4;
            return f3 + ((f2 * f5) - (((f4 * f5) * f5) / 2.0f)) > 1.0f;
        }
        float f6 = (-f2) / f4;
        return f3 + ((f2 * f6) + (((f4 * f6) * f6) / 2.0f)) < 0.0f;
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    /* access modifiers changed from: package-private */
    public MotionController getMotionController(int i) {
        return this.mFrameArrayList.get(findViewById(i));
    }

    /* access modifiers changed from: protected */
    public long getNanoTime() {
        return System.nanoTime();
    }

    /* access modifiers changed from: protected */
    public MotionTracker obtainVelocityTracker() {
        return MyTracker.obtain();
    }

    /* access modifiers changed from: package-private */
    public void setState(TransitionState transitionState) {
        if (transitionState != TransitionState.FINISHED || this.mCurrentState != -1) {
            TransitionState transitionState2 = this.mTransitionState;
            this.mTransitionState = transitionState;
            if (transitionState2 == TransitionState.MOVING && transitionState == TransitionState.MOVING) {
                fireTransitionChange();
            }
            int i = AnonymousClass5.$SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[transitionState2.ordinal()];
            if (i == 1 || i == 2) {
                if (transitionState == TransitionState.MOVING) {
                    fireTransitionChange();
                }
                if (transitionState == TransitionState.FINISHED) {
                    fireTransitionCompleted();
                }
            } else if (i == 3 && transitionState == TransitionState.FINISHED) {
                fireTransitionCompleted();
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState = r0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.AnonymousClass5.<clinit>():void");
        }
    }

    private static class MyTracker implements MotionTracker {
        private static MyTracker me = new MyTracker();
        VelocityTracker tracker;

        private MyTracker() {
        }

        public static MyTracker obtain() {
            me.tracker = VelocityTracker.obtain();
            return me;
        }

        public void recycle() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.tracker = null;
            }
        }

        public void addMovement(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        public void computeCurrentVelocity(int i) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }

        public float getXVelocity() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        public float getYVelocity() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }
    }

    /* access modifiers changed from: package-private */
    public void setStartState(int i) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setStartState(i);
            this.mStateCache.setEndState(i);
            return;
        }
        this.mCurrentState = i;
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setStartState(i);
            this.mStateCache.setEndState(i2);
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            this.mBeginState = i;
            this.mEndState = i2;
            motionScene.setTransition(i, i2);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(i), this.mScene.getConstraintSet(i2));
            rebuildScene();
            this.mTransitionLastPosition = 0.0f;
            transitionToStart();
        }
    }

    public void setTransition(int i) {
        if (this.mScene != null) {
            MotionScene.Transition transition = getTransition(i);
            this.mBeginState = transition.getStartConstraintSetId();
            this.mEndState = transition.getEndConstraintSetId();
            if (!isAttachedToWindow()) {
                if (this.mStateCache == null) {
                    this.mStateCache = new StateCache();
                }
                this.mStateCache.setStartState(this.mBeginState);
                this.mStateCache.setEndState(this.mEndState);
                return;
            }
            float f2 = Float.NaN;
            int i2 = this.mCurrentState;
            float f3 = 0.0f;
            if (i2 == this.mBeginState) {
                f2 = 0.0f;
            } else if (i2 == this.mEndState) {
                f2 = 1.0f;
            }
            this.mScene.setTransition(transition);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
            rebuildScene();
            if (this.mTransitionLastPosition != f2) {
                if (f2 == 0.0f) {
                    endTrigger(true);
                    this.mScene.getConstraintSet(this.mBeginState).applyTo(this);
                } else if (f2 == 1.0f) {
                    endTrigger(false);
                    this.mScene.getConstraintSet(this.mEndState).applyTo(this);
                }
            }
            if (!Float.isNaN(f2)) {
                f3 = f2;
            }
            this.mTransitionLastPosition = f3;
            if (Float.isNaN(f2)) {
                Log.v("MotionLayout", Debug.getLocation() + " transitionToStart ");
                transitionToStart();
                return;
            }
            setProgress(f2);
        }
    }

    /* access modifiers changed from: protected */
    public void setTransition(MotionScene.Transition transition) {
        this.mScene.setTransition(transition);
        setState(TransitionState.SETUP);
        if (this.mCurrentState == this.mScene.getEndId()) {
            this.mTransitionLastPosition = 1.0f;
            this.mTransitionPosition = 1.0f;
            this.mTransitionGoalPosition = 1.0f;
        } else {
            this.mTransitionLastPosition = 0.0f;
            this.mTransitionPosition = 0.0f;
            this.mTransitionGoalPosition = 0.0f;
        }
        this.mTransitionLastTime = transition.isTransitionFlag(1) ? -1 : getNanoTime();
        int startId = this.mScene.getStartId();
        int endId = this.mScene.getEndId();
        if (startId != this.mBeginState || endId != this.mEndState) {
            this.mBeginState = startId;
            this.mEndState = endId;
            this.mScene.setTransition(startId, endId);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
            this.mModel.setMeasuredId(this.mBeginState, this.mEndState);
            this.mModel.reEvaluateState();
            rebuildScene();
        }
    }

    public boolean isAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 19) {
            return super.isAttachedToWindow();
        }
        return getWindowToken() != null;
    }

    public void setState(int i, int i2, int i3) {
        setState(TransitionState.SETUP);
        this.mCurrentState = i;
        this.mBeginState = -1;
        this.mEndState = -1;
        if (this.mConstraintLayoutSpec != null) {
            this.mConstraintLayoutSpec.updateConstraints(i, (float) i2, (float) i3);
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.getConstraintSet(i).applyTo(this);
        }
    }

    public void setInterpolatedProgress(float f2) {
        if (this.mScene != null) {
            setState(TransitionState.MOVING);
            Interpolator interpolator = this.mScene.getInterpolator();
            if (interpolator != null) {
                setProgress(interpolator.getInterpolation(f2));
                return;
            }
        }
        setProgress(f2);
    }

    public void setProgress(float f2, float f3) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setProgress(f2);
            this.mStateCache.setVelocity(f3);
            return;
        }
        setProgress(f2);
        setState(TransitionState.MOVING);
        this.mLastVelocity = f3;
        float f4 = 1.0f;
        int i = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if (i != 0) {
            if (i <= 0) {
                f4 = 0.0f;
            }
            animateTo(f4);
        } else if (f2 != 0.0f && f2 != 1.0f) {
            if (f2 <= 0.5f) {
                f4 = 0.0f;
            }
            animateTo(f4);
        }
    }

    class StateCache {
        final String KeyEndState = "motion.EndState";
        final String KeyProgress = "motion.progress";
        final String KeyStartState = "motion.StartState";
        final String KeyVelocity = "motion.velocity";
        int endState = -1;
        float mProgress = Float.NaN;
        float mVelocity = Float.NaN;
        int startState = -1;

        StateCache() {
        }

        /* access modifiers changed from: package-private */
        public void apply() {
            if (!(this.startState == -1 && this.endState == -1)) {
                int i = this.startState;
                if (i == -1) {
                    MotionLayout.this.transitionToState(this.endState);
                } else {
                    int i2 = this.endState;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i, i2);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (!Float.isNaN(this.mVelocity)) {
                MotionLayout.this.setProgress(this.mProgress, this.mVelocity);
                this.mProgress = Float.NaN;
                this.mVelocity = Float.NaN;
                this.startState = -1;
                this.endState = -1;
            } else if (!Float.isNaN(this.mProgress)) {
                MotionLayout.this.setProgress(this.mProgress);
            }
        }

        public Bundle getTransitionState() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.mProgress);
            bundle.putFloat("motion.velocity", this.mVelocity);
            bundle.putInt("motion.StartState", this.startState);
            bundle.putInt("motion.EndState", this.endState);
            return bundle;
        }

        public void setTransitionState(Bundle bundle) {
            this.mProgress = bundle.getFloat("motion.progress");
            this.mVelocity = bundle.getFloat("motion.velocity");
            this.startState = bundle.getInt("motion.StartState");
            this.endState = bundle.getInt("motion.EndState");
        }

        public void setProgress(float f2) {
            this.mProgress = f2;
        }

        public void setEndState(int i) {
            this.endState = i;
        }

        public void setVelocity(float f2) {
            this.mVelocity = f2;
        }

        public void setStartState(int i) {
            this.startState = i;
        }

        public void recordState() {
            this.endState = MotionLayout.this.mEndState;
            this.startState = MotionLayout.this.mBeginState;
            this.mVelocity = MotionLayout.this.getVelocity();
            this.mProgress = MotionLayout.this.getProgress();
        }
    }

    public void setTransitionState(Bundle bundle) {
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        this.mStateCache.setTransitionState(bundle);
        if (isAttachedToWindow()) {
            this.mStateCache.apply();
        }
    }

    public Bundle getTransitionState() {
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        this.mStateCache.recordState();
        return this.mStateCache.getTransitionState();
    }

    public void setProgress(float f2) {
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i < 0 || f2 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setProgress(f2);
            return;
        }
        if (i <= 0) {
            if (this.mTransitionLastPosition == 1.0f && this.mCurrentState == this.mEndState) {
                setState(TransitionState.MOVING);
            }
            this.mCurrentState = this.mBeginState;
            if (this.mTransitionLastPosition == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f2 >= 1.0f) {
            if (this.mTransitionLastPosition == 0.0f && this.mCurrentState == this.mBeginState) {
                setState(TransitionState.MOVING);
            }
            this.mCurrentState = this.mEndState;
            if (this.mTransitionLastPosition == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.mCurrentState = -1;
            setState(TransitionState.MOVING);
        }
        if (this.mScene != null) {
            this.mTransitionInstantly = true;
            this.mTransitionGoalPosition = f2;
            this.mTransitionPosition = f2;
            this.mTransitionLastTime = -1;
            this.mAnimationStartTime = -1;
            this.mInterpolator = null;
            this.mInTransition = true;
            invalidate();
        }
    }

    /* access modifiers changed from: private */
    public void setupMotionViews() {
        int childCount = getChildCount();
        this.mModel.build();
        boolean z = true;
        this.mInTransition = true;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            sparseArray.put(childAt.getId(), this.mFrameArrayList.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int gatPathMotionArc = this.mScene.gatPathMotionArc();
        if (gatPathMotionArc != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                MotionController motionController = this.mFrameArrayList.get(getChildAt(i3));
                if (motionController != null) {
                    motionController.setPathMotionArc(gatPathMotionArc);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.mFrameArrayList.size()];
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            MotionController motionController2 = this.mFrameArrayList.get(getChildAt(i5));
            if (motionController2.getAnimateRelativeTo() != -1) {
                sparseBooleanArray.put(motionController2.getAnimateRelativeTo(), true);
                iArr[i4] = motionController2.getAnimateRelativeTo();
                i4++;
            }
        }
        if (this.mDecoratorsHelpers != null) {
            for (int i6 = 0; i6 < i4; i6++) {
                MotionController motionController3 = this.mFrameArrayList.get(findViewById(iArr[i6]));
                if (motionController3 != null) {
                    this.mScene.getKeyFrames(motionController3);
                }
            }
            Iterator<MotionHelper> it = this.mDecoratorsHelpers.iterator();
            while (it.hasNext()) {
                it.next().onPreSetup(this, this.mFrameArrayList);
            }
            for (int i7 = 0; i7 < i4; i7++) {
                MotionController motionController4 = this.mFrameArrayList.get(findViewById(iArr[i7]));
                if (motionController4 != null) {
                    motionController4.setup(width, height, this.mTransitionDuration, getNanoTime());
                }
            }
        } else {
            for (int i8 = 0; i8 < i4; i8++) {
                MotionController motionController5 = this.mFrameArrayList.get(findViewById(iArr[i8]));
                if (motionController5 != null) {
                    this.mScene.getKeyFrames(motionController5);
                    motionController5.setup(width, height, this.mTransitionDuration, getNanoTime());
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            MotionController motionController6 = this.mFrameArrayList.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && motionController6 != null) {
                this.mScene.getKeyFrames(motionController6);
                motionController6.setup(width, height, this.mTransitionDuration, getNanoTime());
            }
        }
        float staggered = this.mScene.getStaggered();
        if (staggered != 0.0f) {
            boolean z2 = ((double) staggered) < 0.0d;
            float abs = Math.abs(staggered);
            float f2 = -3.4028235E38f;
            float f3 = Float.MAX_VALUE;
            int i10 = 0;
            float f4 = Float.MAX_VALUE;
            float f5 = -3.4028235E38f;
            while (true) {
                if (i10 >= childCount) {
                    z = false;
                    break;
                }
                MotionController motionController7 = this.mFrameArrayList.get(getChildAt(i10));
                if (!Float.isNaN(motionController7.mMotionStagger)) {
                    break;
                }
                float finalX = motionController7.getFinalX();
                float finalY = motionController7.getFinalY();
                float f6 = z2 ? finalY - finalX : finalY + finalX;
                f4 = Math.min(f4, f6);
                f5 = Math.max(f5, f6);
                i10++;
            }
            if (z) {
                for (int i11 = 0; i11 < childCount; i11++) {
                    MotionController motionController8 = this.mFrameArrayList.get(getChildAt(i11));
                    if (!Float.isNaN(motionController8.mMotionStagger)) {
                        f3 = Math.min(f3, motionController8.mMotionStagger);
                        f2 = Math.max(f2, motionController8.mMotionStagger);
                    }
                }
                while (i < childCount) {
                    MotionController motionController9 = this.mFrameArrayList.get(getChildAt(i));
                    if (!Float.isNaN(motionController9.mMotionStagger)) {
                        motionController9.mStaggerScale = 1.0f / (1.0f - abs);
                        if (z2) {
                            motionController9.mStaggerOffset = abs - (((f2 - motionController9.mMotionStagger) / (f2 - f3)) * abs);
                        } else {
                            motionController9.mStaggerOffset = abs - (((motionController9.mMotionStagger - f3) * abs) / (f2 - f3));
                        }
                    }
                    i++;
                }
                return;
            }
            while (i < childCount) {
                MotionController motionController10 = this.mFrameArrayList.get(getChildAt(i));
                float finalX2 = motionController10.getFinalX();
                float finalY2 = motionController10.getFinalY();
                float f7 = z2 ? finalY2 - finalX2 : finalY2 + finalX2;
                motionController10.mStaggerScale = 1.0f / (1.0f - abs);
                motionController10.mStaggerOffset = abs - (((f7 - f4) * abs) / (f5 - f4));
                i++;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r10 != 7) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void touchAnimateTo(int r10, float r11, float r12) {
        /*
            r9 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r9.mScene
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            float r0 = r9.mTransitionLastPosition
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            r0 = 1
            r9.mTemporalInterpolator = r0
            long r1 = r9.getNanoTime()
            r9.mAnimationStartTime = r1
            androidx.constraintlayout.motion.widget.MotionScene r1 = r9.mScene
            int r1 = r1.getDuration()
            float r1 = (float) r1
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            r9.mTransitionDuration = r1
            r9.mTransitionGoalPosition = r11
            r9.mInTransition = r0
            r1 = 0
            r2 = 7
            r3 = 6
            r4 = 2
            if (r10 == 0) goto L_0x0093
            if (r10 == r0) goto L_0x0093
            if (r10 == r4) goto L_0x0093
            r5 = 4
            if (r10 == r5) goto L_0x0081
            r5 = 5
            if (r10 == r5) goto L_0x003b
            if (r10 == r3) goto L_0x0093
            if (r10 == r2) goto L_0x0093
            goto L_0x00f1
        L_0x003b:
            float r10 = r9.mTransitionLastPosition
            androidx.constraintlayout.motion.widget.MotionScene r0 = r9.mScene
            float r0 = r0.getMaxAcceleration()
            boolean r10 = willJump(r12, r10, r0)
            if (r10 == 0) goto L_0x005c
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r10 = r9.mDecelerateLogic
            float r11 = r9.mTransitionLastPosition
            androidx.constraintlayout.motion.widget.MotionScene r0 = r9.mScene
            float r0 = r0.getMaxAcceleration()
            r10.config(r12, r11, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r10 = r9.mDecelerateLogic
            r9.mInterpolator = r10
            goto L_0x00f1
        L_0x005c:
            androidx.constraintlayout.motion.utils.StopLogic r2 = r9.mStopLogic
            float r3 = r9.mTransitionLastPosition
            float r6 = r9.mTransitionDuration
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r7 = r10.getMaxAcceleration()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r8 = r10.getMaxVelocity()
            r4 = r11
            r5 = r12
            r2.config(r3, r4, r5, r6, r7, r8)
            r9.mLastVelocity = r1
            int r10 = r9.mCurrentState
            r9.mTransitionGoalPosition = r11
            r9.mCurrentState = r10
            androidx.constraintlayout.motion.utils.StopLogic r10 = r9.mStopLogic
            r9.mInterpolator = r10
            goto L_0x00f1
        L_0x0081:
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r10 = r9.mDecelerateLogic
            float r11 = r9.mTransitionLastPosition
            androidx.constraintlayout.motion.widget.MotionScene r0 = r9.mScene
            float r0 = r0.getMaxAcceleration()
            r10.config(r12, r11, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r10 = r9.mDecelerateLogic
            r9.mInterpolator = r10
            goto L_0x00f1
        L_0x0093:
            if (r10 == r0) goto L_0x009f
            if (r10 != r2) goto L_0x0098
            goto L_0x009f
        L_0x0098:
            if (r10 == r4) goto L_0x009c
            if (r10 != r3) goto L_0x00a0
        L_0x009c:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00a0
        L_0x009f:
            r11 = 0
        L_0x00a0:
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            int r10 = r10.getAutoCompleteMode()
            if (r10 != 0) goto L_0x00c0
            androidx.constraintlayout.motion.utils.StopLogic r0 = r9.mStopLogic
            float r1 = r9.mTransitionLastPosition
            float r4 = r9.mTransitionDuration
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r5 = r10.getMaxAcceleration()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r6 = r10.getMaxVelocity()
            r2 = r11
            r3 = r12
            r0.config(r1, r2, r3, r4, r5, r6)
            goto L_0x00e7
        L_0x00c0:
            androidx.constraintlayout.motion.utils.StopLogic r0 = r9.mStopLogic
            float r1 = r9.mTransitionLastPosition
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r4 = r10.getSpringMass()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r5 = r10.getSpringStiffiness()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r6 = r10.getSpringDamping()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r7 = r10.getSpringStopThreshold()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            int r8 = r10.getSpringBoundary()
            r2 = r11
            r3 = r12
            r0.springConfig(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00e7:
            int r10 = r9.mCurrentState
            r9.mTransitionGoalPosition = r11
            r9.mCurrentState = r10
            androidx.constraintlayout.motion.utils.StopLogic r10 = r9.mStopLogic
            r9.mInterpolator = r10
        L_0x00f1:
            r10 = 0
            r9.mTransitionInstantly = r10
            long r10 = r9.getNanoTime()
            r9.mAnimationStartTime = r10
            r9.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.touchAnimateTo(int, float, float):void");
    }

    class DecelerateInterpolator extends MotionInterpolator {
        float currentP;
        float initalV;
        float maxA;
        final /* synthetic */ MotionLayout this$0;

        public void config(float f2, float f3, float f4) {
            this.initalV = f2;
            this.currentP = f3;
            this.maxA = f4;
        }

        public float getInterpolation(float f2) {
            float f3;
            float f4;
            float f5 = this.initalV;
            if (f5 > 0.0f) {
                float f6 = this.maxA;
                if (f5 / f6 < f2) {
                    f2 = f5 / f6;
                }
                this.this$0.mLastVelocity = this.initalV - (this.maxA * f2);
                f3 = (this.initalV * f2) - (((this.maxA * f2) * f2) / 2.0f);
                f4 = this.currentP;
            } else {
                float f7 = this.maxA;
                if ((-f5) / f7 < f2) {
                    f2 = (-f5) / f7;
                }
                this.this$0.mLastVelocity = this.initalV + (this.maxA * f2);
                f3 = (this.initalV * f2) + (((this.maxA * f2) * f2) / 2.0f);
                f4 = this.currentP;
            }
            return f3 + f4;
        }

        public float getVelocity() {
            return this.this$0.mLastVelocity;
        }
    }

    /* access modifiers changed from: package-private */
    public void animateTo(float f2) {
        if (this.mScene != null) {
            float f3 = this.mTransitionLastPosition;
            float f4 = this.mTransitionPosition;
            if (f3 != f4 && this.mTransitionInstantly) {
                this.mTransitionLastPosition = f4;
            }
            float f5 = this.mTransitionLastPosition;
            if (f5 != f2) {
                this.mTemporalInterpolator = false;
                this.mTransitionGoalPosition = f2;
                this.mTransitionDuration = ((float) this.mScene.getDuration()) / 1000.0f;
                setProgress(this.mTransitionGoalPosition);
                this.mInterpolator = null;
                this.mProgressInterpolator = this.mScene.getInterpolator();
                this.mTransitionInstantly = false;
                this.mAnimationStartTime = getNanoTime();
                this.mInTransition = true;
                this.mTransitionPosition = f5;
                this.mTransitionLastPosition = f5;
                invalidate();
            }
        }
    }

    private void computeCurrentPositions() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            MotionController motionController = this.mFrameArrayList.get(childAt);
            if (motionController != null) {
                motionController.setStartCurrentState(childAt);
            }
        }
    }

    public void transitionToStart() {
        animateTo(0.0f);
    }

    public void transitionToEnd() {
        animateTo(1.0f);
        this.mOnComplete = null;
    }

    public void transitionToEnd(Runnable runnable) {
        animateTo(1.0f);
        this.mOnComplete = runnable;
    }

    public void transitionToState(int i) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setEndState(i);
            return;
        }
        transitionToState(i, -1, -1);
    }

    public void transitionToState(int i, int i2, int i3) {
        transitionToState(i, i2, i3, -1);
    }

    public void transitionToState(int i, int i2, int i3, int i4) {
        int convertToConstraintSet;
        MotionScene motionScene = this.mScene;
        if (!(motionScene == null || motionScene.mStateSet == null || (convertToConstraintSet = this.mScene.mStateSet.convertToConstraintSet(this.mCurrentState, i, (float) i2, (float) i3)) == -1)) {
            i = convertToConstraintSet;
        }
        int i5 = this.mCurrentState;
        if (i5 != i) {
            if (this.mBeginState == i) {
                animateTo(0.0f);
                if (i4 > 0) {
                    this.mTransitionDuration = ((float) i4) / 1000.0f;
                }
            } else if (this.mEndState == i) {
                animateTo(1.0f);
                if (i4 > 0) {
                    this.mTransitionDuration = ((float) i4) / 1000.0f;
                }
            } else {
                this.mEndState = i;
                if (i5 != -1) {
                    setTransition(i5, i);
                    animateTo(1.0f);
                    this.mTransitionLastPosition = 0.0f;
                    transitionToEnd();
                    if (i4 > 0) {
                        this.mTransitionDuration = ((float) i4) / 1000.0f;
                        return;
                    }
                    return;
                }
                this.mTemporalInterpolator = false;
                this.mTransitionGoalPosition = 1.0f;
                this.mTransitionPosition = 0.0f;
                this.mTransitionLastPosition = 0.0f;
                this.mTransitionLastTime = getNanoTime();
                this.mAnimationStartTime = getNanoTime();
                this.mTransitionInstantly = false;
                this.mInterpolator = null;
                if (i4 == -1) {
                    this.mTransitionDuration = ((float) this.mScene.getDuration()) / 1000.0f;
                }
                this.mBeginState = -1;
                this.mScene.setTransition(-1, this.mEndState);
                SparseArray sparseArray = new SparseArray();
                if (i4 == 0) {
                    this.mTransitionDuration = ((float) this.mScene.getDuration()) / 1000.0f;
                } else if (i4 > 0) {
                    this.mTransitionDuration = ((float) i4) / 1000.0f;
                }
                int childCount = getChildCount();
                this.mFrameArrayList.clear();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    this.mFrameArrayList.put(childAt, new MotionController(childAt));
                    sparseArray.put(childAt.getId(), this.mFrameArrayList.get(childAt));
                }
                this.mInTransition = true;
                this.mModel.initFrom(this.mLayoutWidget, (ConstraintSet) null, this.mScene.getConstraintSet(i));
                rebuildScene();
                this.mModel.build();
                computeCurrentPositions();
                int width = getWidth();
                int height = getHeight();
                if (this.mDecoratorsHelpers != null) {
                    for (int i7 = 0; i7 < childCount; i7++) {
                        MotionController motionController = this.mFrameArrayList.get(getChildAt(i7));
                        if (motionController != null) {
                            this.mScene.getKeyFrames(motionController);
                        }
                    }
                    Iterator<MotionHelper> it = this.mDecoratorsHelpers.iterator();
                    while (it.hasNext()) {
                        it.next().onPreSetup(this, this.mFrameArrayList);
                    }
                    for (int i8 = 0; i8 < childCount; i8++) {
                        MotionController motionController2 = this.mFrameArrayList.get(getChildAt(i8));
                        if (motionController2 != null) {
                            motionController2.setup(width, height, this.mTransitionDuration, getNanoTime());
                        }
                    }
                } else {
                    for (int i9 = 0; i9 < childCount; i9++) {
                        MotionController motionController3 = this.mFrameArrayList.get(getChildAt(i9));
                        if (motionController3 != null) {
                            this.mScene.getKeyFrames(motionController3);
                            motionController3.setup(width, height, this.mTransitionDuration, getNanoTime());
                        }
                    }
                }
                float staggered = this.mScene.getStaggered();
                if (staggered != 0.0f) {
                    float f2 = Float.MAX_VALUE;
                    float f3 = -3.4028235E38f;
                    for (int i10 = 0; i10 < childCount; i10++) {
                        MotionController motionController4 = this.mFrameArrayList.get(getChildAt(i10));
                        float finalY = motionController4.getFinalY() + motionController4.getFinalX();
                        f2 = Math.min(f2, finalY);
                        f3 = Math.max(f3, finalY);
                    }
                    for (int i11 = 0; i11 < childCount; i11++) {
                        MotionController motionController5 = this.mFrameArrayList.get(getChildAt(i11));
                        float finalX = motionController5.getFinalX();
                        float finalY2 = motionController5.getFinalY();
                        motionController5.mStaggerScale = 1.0f / (1.0f - staggered);
                        motionController5.mStaggerOffset = staggered - ((((finalX + finalY2) - f2) * staggered) / (f3 - f2));
                    }
                }
                this.mTransitionPosition = 0.0f;
                this.mTransitionLastPosition = 0.0f;
                this.mInTransition = true;
                invalidate();
            }
        }
    }

    public float getVelocity() {
        return this.mLastVelocity;
    }

    class Model {
        ConstraintSet mEnd;
        int mEndId;
        ConstraintWidgetContainer mLayoutEnd;
        ConstraintWidgetContainer mLayoutStart;
        ConstraintSet mStart;
        int mStartId;
        final /* synthetic */ MotionLayout this$0;

        /* access modifiers changed from: package-private */
        public void copy(ConstraintWidgetContainer constraintWidgetContainer, ConstraintWidgetContainer constraintWidgetContainer2) {
            ConstraintWidget constraintWidget;
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            HashMap hashMap = new HashMap();
            hashMap.put(constraintWidgetContainer, constraintWidgetContainer2);
            constraintWidgetContainer2.getChildren().clear();
            constraintWidgetContainer2.copy(constraintWidgetContainer, hashMap);
            Iterator<ConstraintWidget> it = children.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                if (next instanceof Barrier) {
                    constraintWidget = new Barrier();
                } else if (next instanceof Guideline) {
                    constraintWidget = new Guideline();
                } else if (next instanceof Flow) {
                    constraintWidget = new Flow();
                } else if (next instanceof Placeholder) {
                    constraintWidget = new Placeholder();
                } else if (next instanceof Helper) {
                    constraintWidget = new HelperWidget();
                } else {
                    constraintWidget = new ConstraintWidget();
                }
                constraintWidgetContainer2.add(constraintWidget);
                hashMap.put(next, constraintWidget);
            }
            Iterator<ConstraintWidget> it2 = children.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                ((ConstraintWidget) hashMap.get(next2)).copy(next2, hashMap);
            }
        }

        /* access modifiers changed from: package-private */
        public void initFrom(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet, ConstraintSet constraintSet2) {
            this.mStart = constraintSet;
            this.mEnd = constraintSet2;
            this.mLayoutStart = new ConstraintWidgetContainer();
            this.mLayoutEnd = new ConstraintWidgetContainer();
            this.mLayoutStart.setMeasurer(this.this$0.mLayoutWidget.getMeasurer());
            this.mLayoutEnd.setMeasurer(this.this$0.mLayoutWidget.getMeasurer());
            this.mLayoutStart.removeAllChildren();
            this.mLayoutEnd.removeAllChildren();
            copy(this.this$0.mLayoutWidget, this.mLayoutStart);
            copy(this.this$0.mLayoutWidget, this.mLayoutEnd);
            if (((double) this.this$0.mTransitionLastPosition) > 0.5d) {
                if (constraintSet != null) {
                    setupConstraintWidget(this.mLayoutStart, constraintSet);
                }
                setupConstraintWidget(this.mLayoutEnd, constraintSet2);
            } else {
                setupConstraintWidget(this.mLayoutEnd, constraintSet2);
                if (constraintSet != null) {
                    setupConstraintWidget(this.mLayoutStart, constraintSet);
                }
            }
            this.mLayoutStart.setRtl(this.this$0.isRtl());
            this.mLayoutStart.updateHierarchy();
            this.mLayoutEnd.setRtl(this.this$0.isRtl());
            this.mLayoutEnd.updateHierarchy();
            ViewGroup.LayoutParams layoutParams = this.this$0.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    this.mLayoutStart.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                    this.mLayoutEnd.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
                if (layoutParams.height == -2) {
                    this.mLayoutStart.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                    this.mLayoutEnd.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
            }
        }

        private void setupConstraintWidget(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet) {
            SparseArray sparseArray = new SparseArray();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, constraintWidgetContainer);
            sparseArray.put(this.this$0.getId(), constraintWidgetContainer);
            if (!(constraintSet == null || constraintSet.mRotate == 0)) {
                MotionLayout motionLayout = this.this$0;
                motionLayout.resolveSystem(this.mLayoutEnd, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(this.this$0.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.this$0.getWidth(), 1073741824));
            }
            Iterator<ConstraintWidget> it = constraintWidgetContainer.getChildren().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.setAnimated(true);
                sparseArray.put(((View) next.getCompanionWidget()).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = constraintWidgetContainer.getChildren().iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.getCompanionWidget();
                constraintSet.applyToLayoutParams(view.getId(), layoutParams);
                next2.setWidth(constraintSet.getWidth(view.getId()));
                next2.setHeight(constraintSet.getHeight(view.getId()));
                if (view instanceof ConstraintHelper) {
                    constraintSet.applyToHelper((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof androidx.constraintlayout.widget.Barrier) {
                        ((androidx.constraintlayout.widget.Barrier) view).validateParams();
                    }
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.resolveLayoutDirection(this.this$0.getLayoutDirection());
                } else {
                    layoutParams.resolveLayoutDirection(0);
                }
                this.this$0.applyConstraintsFromLayoutParams(false, view, next2, layoutParams, sparseArray);
                if (constraintSet.getVisibilityMode(view.getId()) == 1) {
                    next2.setVisibility(view.getVisibility());
                } else {
                    next2.setVisibility(constraintSet.getVisibility(view.getId()));
                }
            }
            Iterator<ConstraintWidget> it3 = constraintWidgetContainer.getChildren().iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof VirtualLayout) {
                    Helper helper = (Helper) next3;
                    ((ConstraintHelper) next3.getCompanionWidget()).updatePreLayout(constraintWidgetContainer, helper, sparseArray);
                    ((VirtualLayout) helper).captureWidgets();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public ConstraintWidget getWidget(ConstraintWidgetContainer constraintWidgetContainer, View view) {
            if (constraintWidgetContainer.getCompanionWidget() == view) {
                return constraintWidgetContainer;
            }
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            int size = children.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = children.get(i);
                if (constraintWidget.getCompanionWidget() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public void reEvaluateState() {
            measure(this.this$0.mLastWidthMeasureSpec, this.this$0.mLastHeightMeasureSpec);
            this.this$0.setupMotionViews();
        }

        public void measure(int i, int i2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.this$0.mWidthMeasureMode = mode;
            this.this$0.mHeightMeasureMode = mode2;
            this.this$0.getOptimizationLevel();
            computeStartEndSize(i, i2);
            if (((this.this$0.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                computeStartEndSize(i, i2);
                this.this$0.mStartWrapWidth = this.mLayoutStart.getWidth();
                this.this$0.mStartWrapHeight = this.mLayoutStart.getHeight();
                this.this$0.mEndWrapWidth = this.mLayoutEnd.getWidth();
                this.this$0.mEndWrapHeight = this.mLayoutEnd.getHeight();
                MotionLayout motionLayout = this.this$0;
                motionLayout.mMeasureDuringTransition = (motionLayout.mStartWrapWidth == this.this$0.mEndWrapWidth && this.this$0.mStartWrapHeight == this.this$0.mEndWrapHeight) ? false : true;
            }
            int i3 = this.this$0.mStartWrapWidth;
            int i4 = this.this$0.mStartWrapHeight;
            if (this.this$0.mWidthMeasureMode == Integer.MIN_VALUE || this.this$0.mWidthMeasureMode == 0) {
                i3 = (int) (((float) this.this$0.mStartWrapWidth) + (this.this$0.mPostInterpolationPosition * ((float) (this.this$0.mEndWrapWidth - this.this$0.mStartWrapWidth))));
            }
            int i5 = i3;
            if (this.this$0.mHeightMeasureMode == Integer.MIN_VALUE || this.this$0.mHeightMeasureMode == 0) {
                i4 = (int) (((float) this.this$0.mStartWrapHeight) + (this.this$0.mPostInterpolationPosition * ((float) (this.this$0.mEndWrapHeight - this.this$0.mStartWrapHeight))));
            }
            this.this$0.resolveMeasuredDimension(i, i2, i5, i4, this.mLayoutStart.isWidthMeasuredTooSmall() || this.mLayoutEnd.isWidthMeasuredTooSmall(), this.mLayoutStart.isHeightMeasuredTooSmall() || this.mLayoutEnd.isHeightMeasuredTooSmall());
        }

        private void computeStartEndSize(int i, int i2) {
            int optimizationLevel = this.this$0.getOptimizationLevel();
            if (this.this$0.mCurrentState == this.this$0.getStartState()) {
                MotionLayout motionLayout = this.this$0;
                ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutEnd;
                ConstraintSet constraintSet = this.mEnd;
                int i3 = (constraintSet == null || constraintSet.mRotate == 0) ? i : i2;
                ConstraintSet constraintSet2 = this.mEnd;
                motionLayout.resolveSystem(constraintWidgetContainer, optimizationLevel, i3, (constraintSet2 == null || constraintSet2.mRotate == 0) ? i2 : i);
                ConstraintSet constraintSet3 = this.mStart;
                if (constraintSet3 != null) {
                    MotionLayout motionLayout2 = this.this$0;
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutStart;
                    int i4 = constraintSet3.mRotate == 0 ? i : i2;
                    if (this.mStart.mRotate == 0) {
                        i = i2;
                    }
                    motionLayout2.resolveSystem(constraintWidgetContainer2, optimizationLevel, i4, i);
                    return;
                }
                return;
            }
            ConstraintSet constraintSet4 = this.mStart;
            if (constraintSet4 != null) {
                this.this$0.resolveSystem(this.mLayoutStart, optimizationLevel, constraintSet4.mRotate == 0 ? i : i2, this.mStart.mRotate == 0 ? i2 : i);
            }
            MotionLayout motionLayout3 = this.this$0;
            ConstraintWidgetContainer constraintWidgetContainer3 = this.mLayoutEnd;
            ConstraintSet constraintSet5 = this.mEnd;
            int i5 = (constraintSet5 == null || constraintSet5.mRotate == 0) ? i : i2;
            ConstraintSet constraintSet6 = this.mEnd;
            if (constraintSet6 == null || constraintSet6.mRotate == 0) {
                i = i2;
            }
            motionLayout3.resolveSystem(constraintWidgetContainer3, optimizationLevel, i5, i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x013f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void build() {
            /*
                r18 = this;
                r0 = r18
                androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.this$0
                int r1 = r1.getChildCount()
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r0.this$0
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r2 = r2.mFrameArrayList
                r2.clear()
                android.util.SparseArray r2 = new android.util.SparseArray
                r2.<init>()
                int[] r3 = new int[r1]
                r5 = 0
            L_0x0017:
                if (r5 >= r1) goto L_0x0037
                androidx.constraintlayout.motion.widget.MotionLayout r6 = r0.this$0
                android.view.View r6 = r6.getChildAt(r5)
                androidx.constraintlayout.motion.widget.MotionController r7 = new androidx.constraintlayout.motion.widget.MotionController
                r7.<init>(r6)
                int r8 = r6.getId()
                r3[r5] = r8
                r2.put(r8, r7)
                androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.this$0
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r8 = r8.mFrameArrayList
                r8.put(r6, r7)
                int r5 = r5 + 1
                goto L_0x0017
            L_0x0037:
                r5 = 0
            L_0x0038:
                if (r5 >= r1) goto L_0x0145
                androidx.constraintlayout.motion.widget.MotionLayout r6 = r0.this$0
                android.view.View r6 = r6.getChildAt(r5)
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r7 = r7.mFrameArrayList
                java.lang.Object r7 = r7.get(r6)
                r13 = r7
                androidx.constraintlayout.motion.widget.MotionController r13 = (androidx.constraintlayout.motion.widget.MotionController) r13
                if (r13 != 0) goto L_0x0051
                r16 = r2
                goto L_0x013f
            L_0x0051:
                androidx.constraintlayout.widget.ConstraintSet r7 = r0.mStart
                java.lang.String r14 = ")"
                java.lang.String r15 = " ("
                java.lang.String r12 = "no widget for  "
                java.lang.String r11 = "MotionLayout"
                if (r7 == 0) goto L_0x00b2
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = r0.mLayoutStart
                androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r0.getWidget(r7, r6)
                if (r7 == 0) goto L_0x007d
                androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.this$0
                android.graphics.Rect r7 = r8.toRect(r7)
                androidx.constraintlayout.widget.ConstraintSet r8 = r0.mStart
                androidx.constraintlayout.motion.widget.MotionLayout r9 = r0.this$0
                int r9 = r9.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r10 = r0.this$0
                int r10 = r10.getHeight()
                r13.setStartState(r7, r8, r9, r10)
                goto L_0x00e3
            L_0x007d:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                int r7 = r7.mDebugPath
                if (r7 == 0) goto L_0x00e3
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = androidx.constraintlayout.motion.widget.Debug.getLocation()
                r7.append(r8)
                r7.append(r12)
                java.lang.String r8 = androidx.constraintlayout.motion.widget.Debug.getName(r6)
                r7.append(r8)
                r7.append(r15)
                java.lang.Class r8 = r6.getClass()
                java.lang.String r8 = r8.getName()
                r7.append(r8)
                r7.append(r14)
                java.lang.String r7 = r7.toString()
                android.util.Log.e(r11, r7)
                goto L_0x00e3
            L_0x00b2:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                boolean r7 = r7.mInRotation
                if (r7 == 0) goto L_0x00e3
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.utils.ViewState> r7 = r7.mPreRotate
                java.lang.Object r7 = r7.get(r6)
                r8 = r7
                androidx.constraintlayout.motion.utils.ViewState r8 = (androidx.constraintlayout.motion.utils.ViewState) r8
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                int r10 = r7.mRotatMode
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                int r16 = r7.mPreRotateWidth
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                int r17 = r7.mPreRotateHeight
                r7 = r13
                r9 = r6
                r4 = r11
                r11 = r16
                r16 = r2
                r2 = r12
                r12 = r17
                r7.setStartState(r8, r9, r10, r11, r12)
                goto L_0x00e7
            L_0x00e3:
                r16 = r2
                r4 = r11
                r2 = r12
            L_0x00e7:
                androidx.constraintlayout.widget.ConstraintSet r7 = r0.mEnd
                if (r7 == 0) goto L_0x013f
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = r0.mLayoutEnd
                androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r0.getWidget(r7, r6)
                if (r7 == 0) goto L_0x010b
                androidx.constraintlayout.motion.widget.MotionLayout r2 = r0.this$0
                android.graphics.Rect r2 = r2.toRect(r7)
                androidx.constraintlayout.widget.ConstraintSet r4 = r0.mEnd
                androidx.constraintlayout.motion.widget.MotionLayout r6 = r0.this$0
                int r6 = r6.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                int r7 = r7.getHeight()
                r13.setEndState(r2, r4, r6, r7)
                goto L_0x013f
            L_0x010b:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.this$0
                int r7 = r7.mDebugPath
                if (r7 == 0) goto L_0x013f
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = androidx.constraintlayout.motion.widget.Debug.getLocation()
                r7.append(r8)
                r7.append(r2)
                java.lang.String r2 = androidx.constraintlayout.motion.widget.Debug.getName(r6)
                r7.append(r2)
                r7.append(r15)
                java.lang.Class r2 = r6.getClass()
                java.lang.String r2 = r2.getName()
                r7.append(r2)
                r7.append(r14)
                java.lang.String r2 = r7.toString()
                android.util.Log.e(r4, r2)
            L_0x013f:
                int r5 = r5 + 1
                r2 = r16
                goto L_0x0038
            L_0x0145:
                r16 = r2
                r4 = 0
            L_0x0148:
                if (r4 >= r1) goto L_0x0169
                r2 = r3[r4]
                r5 = r16
                java.lang.Object r2 = r5.get(r2)
                androidx.constraintlayout.motion.widget.MotionController r2 = (androidx.constraintlayout.motion.widget.MotionController) r2
                int r6 = r2.getAnimateRelativeTo()
                r7 = -1
                if (r6 == r7) goto L_0x0164
                java.lang.Object r6 = r5.get(r6)
                androidx.constraintlayout.motion.widget.MotionController r6 = (androidx.constraintlayout.motion.widget.MotionController) r6
                r2.setupRelative(r6)
            L_0x0164:
                int r4 = r4 + 1
                r16 = r5
                goto L_0x0148
            L_0x0169:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.Model.build():void");
        }

        public void setMeasuredId(int i, int i2) {
            this.mStartId = i;
            this.mEndId = i2;
        }

        public boolean isNotConfiguredWith(int i, int i2) {
            return (i == this.mStartId && i2 == this.mEndId) ? false : true;
        }
    }

    /* access modifiers changed from: private */
    public Rect toRect(ConstraintWidget constraintWidget) {
        this.mTempRect.top = constraintWidget.getY();
        this.mTempRect.left = constraintWidget.getX();
        this.mTempRect.right = constraintWidget.getWidth() + this.mTempRect.left;
        this.mTempRect.bottom = constraintWidget.getHeight() + this.mTempRect.top;
        return this.mTempRect;
    }

    public void requestLayout() {
        MotionScene motionScene;
        if (!this.mMeasureDuringTransition && this.mCurrentState == -1 && (motionScene = this.mScene) != null && motionScene.mCurrentTransition != null) {
            int layoutDuringTransition = this.mScene.mCurrentTransition.getLayoutDuringTransition();
            if (layoutDuringTransition != 0) {
                if (layoutDuringTransition == 2) {
                    int childCount = getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        this.mFrameArrayList.get(getChildAt(i)).remeasure();
                    }
                    return;
                }
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    public String toString() {
        Context context = getContext();
        return Debug.getName(context, this.mBeginState) + "->" + Debug.getName(context, this.mEndState) + " (pos:" + this.mTransitionLastPosition + " Dpos/Dt:" + this.mLastVelocity;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.mScene == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z = false;
        boolean z2 = (this.mLastWidthMeasureSpec == i && this.mLastHeightMeasureSpec == i2) ? false : true;
        if (this.mNeedsFireTransitionCompleted) {
            this.mNeedsFireTransitionCompleted = false;
            onNewStateAttachHandlers();
            processTransitionCompleted();
            z2 = true;
        }
        if (this.mDirtyHierarchy) {
            z2 = true;
        }
        this.mLastWidthMeasureSpec = i;
        this.mLastHeightMeasureSpec = i2;
        int startId = this.mScene.getStartId();
        int endId = this.mScene.getEndId();
        if ((z2 || this.mModel.isNotConfiguredWith(startId, endId)) && this.mBeginState != -1) {
            super.onMeasure(i, i2);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(startId), this.mScene.getConstraintSet(endId));
            this.mModel.reEvaluateState();
            this.mModel.setMeasuredId(startId, endId);
        } else {
            if (z2) {
                super.onMeasure(i, i2);
            }
            z = true;
        }
        if (this.mMeasureDuringTransition || z) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int width = this.mLayoutWidget.getWidth() + getPaddingLeft() + getPaddingRight();
            int height = this.mLayoutWidget.getHeight() + paddingTop;
            int i3 = this.mWidthMeasureMode;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                int i4 = this.mStartWrapWidth;
                width = (int) (((float) i4) + (this.mPostInterpolationPosition * ((float) (this.mEndWrapWidth - i4))));
                requestLayout();
            }
            int i5 = this.mHeightMeasureMode;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                int i6 = this.mStartWrapHeight;
                height = (int) (((float) i6) + (this.mPostInterpolationPosition * ((float) (this.mEndWrapHeight - i6))));
                requestLayout();
            }
            setMeasuredDimension(width, height);
        }
        evaluateLayout();
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        MotionScene motionScene = this.mScene;
        return (motionScene == null || motionScene.mCurrentTransition == null || this.mScene.mCurrentTransition.getTouchResponse() == null || (this.mScene.mCurrentTransition.getTouchResponse().getFlags() & 2) != 0) ? false : true;
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.mScrollTargetTime = getNanoTime();
        this.mScrollTargetDT = 0.0f;
        this.mScrollTargetDX = 0.0f;
        this.mScrollTargetDY = 0.0f;
    }

    public void onStopNestedScroll(View view, int i) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            float f2 = this.mScrollTargetDT;
            if (f2 != 0.0f) {
                motionScene.processScrollUp(this.mScrollTargetDX / f2, this.mScrollTargetDY / f2);
            }
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!(!this.mUndergoingMotion && i == 0 && i2 == 0)) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.mUndergoingMotion = false;
    }

    public void onNestedPreScroll(final View view, int i, int i2, int[] iArr, int i3) {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        int touchRegionId;
        MotionScene motionScene = this.mScene;
        if (motionScene != null && (transition = motionScene.mCurrentTransition) != null && transition.isEnabled()) {
            int i4 = -1;
            if (!transition.isEnabled() || (touchResponse = transition.getTouchResponse()) == null || (touchRegionId = touchResponse.getTouchRegionId()) == -1 || view.getId() == touchRegionId) {
                if (motionScene.getMoveWhenScrollAtTop()) {
                    TouchResponse touchResponse2 = transition.getTouchResponse();
                    if (!(touchResponse2 == null || (touchResponse2.getFlags() & 4) == 0)) {
                        i4 = i2;
                    }
                    float f2 = this.mTransitionPosition;
                    if ((f2 == 1.0f || f2 == 0.0f) && view.canScrollVertically(i4)) {
                        return;
                    }
                }
                if (!(transition.getTouchResponse() == null || (transition.getTouchResponse().getFlags() & 1) == 0)) {
                    float progressDirection = motionScene.getProgressDirection((float) i, (float) i2);
                    if ((this.mTransitionLastPosition <= 0.0f && progressDirection < 0.0f) || (this.mTransitionLastPosition >= 1.0f && progressDirection > 0.0f)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            view.setNestedScrollingEnabled(false);
                            view.post(new Runnable(this) {
                                public void run() {
                                    view.setNestedScrollingEnabled(true);
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
                float f3 = this.mTransitionPosition;
                long nanoTime = getNanoTime();
                float f4 = (float) i;
                this.mScrollTargetDX = f4;
                float f5 = (float) i2;
                this.mScrollTargetDY = f5;
                this.mScrollTargetDT = (float) (((double) (nanoTime - this.mScrollTargetTime)) * 1.0E-9d);
                this.mScrollTargetTime = nanoTime;
                motionScene.processScrollMove(f4, f5);
                if (f3 != this.mTransitionPosition) {
                    iArr[0] = i;
                    iArr[1] = i2;
                }
                evaluate(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.mUndergoingMotion = true;
                }
            }
        }
    }

    private class DevModeDraw {
        final int DIAMOND_SIZE = 10;
        final int GRAPH_COLOR = -13391360;
        final int KEYFRAME_COLOR = -2067046;
        final int RED_COLOR = -21965;
        final int SHADOW_COLOR = 1996488704;
        Rect mBounds = new Rect();
        DashPathEffect mDashPathEffect;
        Paint mFillPaint;
        int mKeyFrameCount;
        float[] mKeyFramePoints;
        Paint mPaint;
        Paint mPaintGraph;
        Paint mPaintKeyframes;
        Path mPath;
        int[] mPathMode;
        float[] mPoints;
        boolean mPresentationMode = false;
        private float[] mRectangle;
        int mShadowTranslate = 1;
        Paint mTextPaint;

        public DevModeDraw() {
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            this.mPaint.setColor(-21965);
            this.mPaint.setStrokeWidth(2.0f);
            this.mPaint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.mPaintKeyframes = paint2;
            paint2.setAntiAlias(true);
            this.mPaintKeyframes.setColor(-2067046);
            this.mPaintKeyframes.setStrokeWidth(2.0f);
            this.mPaintKeyframes.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.mPaintGraph = paint3;
            paint3.setAntiAlias(true);
            this.mPaintGraph.setColor(-13391360);
            this.mPaintGraph.setStrokeWidth(2.0f);
            this.mPaintGraph.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.mTextPaint = paint4;
            paint4.setAntiAlias(true);
            this.mTextPaint.setColor(-13391360);
            this.mTextPaint.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.mRectangle = new float[8];
            Paint paint5 = new Paint();
            this.mFillPaint = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.mDashPathEffect = dashPathEffect;
            this.mPaintGraph.setPathEffect(dashPathEffect);
            this.mKeyFramePoints = new float[100];
            this.mPathMode = new int[50];
            if (this.mPresentationMode) {
                this.mPaint.setStrokeWidth(8.0f);
                this.mFillPaint.setStrokeWidth(8.0f);
                this.mPaintKeyframes.setStrokeWidth(8.0f);
                this.mShadowTranslate = 4;
            }
        }

        public void draw(Canvas canvas, HashMap<View, MotionController> hashMap, int i, int i2) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.mEndState) + ":" + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, (float) (MotionLayout.this.getHeight() - 30), this.mTextPaint);
                    canvas.drawText(str, 11.0f, (float) (MotionLayout.this.getHeight() - 29), this.mPaint);
                }
                for (MotionController next : hashMap.values()) {
                    int drawPath = next.getDrawPath();
                    if (i2 > 0 && drawPath == 0) {
                        drawPath = 1;
                    }
                    if (drawPath != 0) {
                        this.mKeyFrameCount = next.buildKeyFrames(this.mKeyFramePoints, this.mPathMode);
                        if (drawPath >= 1) {
                            int i3 = i / 16;
                            float[] fArr = this.mPoints;
                            if (fArr == null || fArr.length != i3 * 2) {
                                this.mPoints = new float[(i3 * 2)];
                                this.mPath = new Path();
                            }
                            int i4 = this.mShadowTranslate;
                            canvas.translate((float) i4, (float) i4);
                            this.mPaint.setColor(1996488704);
                            this.mFillPaint.setColor(1996488704);
                            this.mPaintKeyframes.setColor(1996488704);
                            this.mPaintGraph.setColor(1996488704);
                            next.buildPath(this.mPoints, i3);
                            drawAll(canvas, drawPath, this.mKeyFrameCount, next);
                            this.mPaint.setColor(-21965);
                            this.mPaintKeyframes.setColor(-2067046);
                            this.mFillPaint.setColor(-2067046);
                            this.mPaintGraph.setColor(-13391360);
                            int i5 = this.mShadowTranslate;
                            canvas.translate((float) (-i5), (float) (-i5));
                            drawAll(canvas, drawPath, this.mKeyFrameCount, next);
                            if (drawPath == 5) {
                                drawRectangle(canvas, next);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        public void drawAll(Canvas canvas, int i, int i2, MotionController motionController) {
            if (i == 4) {
                drawPathAsConfigured(canvas);
            }
            if (i == 2) {
                drawPathRelative(canvas);
            }
            if (i == 3) {
                drawPathCartesian(canvas);
            }
            drawBasicPath(canvas);
            drawTicks(canvas, i, i2, motionController);
        }

        private void drawBasicPath(Canvas canvas) {
            canvas.drawLines(this.mPoints, this.mPaint);
        }

        private void drawTicks(Canvas canvas, int i, int i2, MotionController motionController) {
            int i3;
            int i4;
            float f2;
            float f3;
            Canvas canvas2 = canvas;
            int i5 = i;
            MotionController motionController2 = motionController;
            if (motionController2.mView != null) {
                i4 = motionController2.mView.getWidth();
                i3 = motionController2.mView.getHeight();
            } else {
                i4 = 0;
                i3 = 0;
            }
            for (int i6 = 1; i6 < i2 - 1; i6++) {
                if (i5 != 4 || this.mPathMode[i6 - 1] != 0) {
                    float[] fArr = this.mKeyFramePoints;
                    int i7 = i6 * 2;
                    float f4 = fArr[i7];
                    float f5 = fArr[i7 + 1];
                    this.mPath.reset();
                    this.mPath.moveTo(f4, f5 + 10.0f);
                    this.mPath.lineTo(f4 + 10.0f, f5);
                    this.mPath.lineTo(f4, f5 - 10.0f);
                    this.mPath.lineTo(f4 - 10.0f, f5);
                    this.mPath.close();
                    int i8 = i6 - 1;
                    motionController2.getKeyFrame(i8);
                    if (i5 == 4) {
                        int[] iArr = this.mPathMode;
                        if (iArr[i8] == 1) {
                            drawPathRelativeTicks(canvas2, f4 - 0.0f, f5 - 0.0f);
                        } else if (iArr[i8] == 0) {
                            drawPathCartesianTicks(canvas2, f4 - 0.0f, f5 - 0.0f);
                        } else if (iArr[i8] == 2) {
                            f3 = f5;
                            f2 = f4;
                            drawPathScreenTicks(canvas, f4 - 0.0f, f5 - 0.0f, i4, i3);
                            canvas2.drawPath(this.mPath, this.mFillPaint);
                        }
                        f3 = f5;
                        f2 = f4;
                        canvas2.drawPath(this.mPath, this.mFillPaint);
                    } else {
                        f3 = f5;
                        f2 = f4;
                    }
                    if (i5 == 2) {
                        drawPathRelativeTicks(canvas2, f2 - 0.0f, f3 - 0.0f);
                    }
                    if (i5 == 3) {
                        drawPathCartesianTicks(canvas2, f2 - 0.0f, f3 - 0.0f);
                    }
                    if (i5 == 6) {
                        drawPathScreenTicks(canvas, f2 - 0.0f, f3 - 0.0f, i4, i3);
                    }
                    canvas2.drawPath(this.mPath, this.mFillPaint);
                }
            }
            float[] fArr2 = this.mPoints;
            if (fArr2.length > 1) {
                canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.mPaintKeyframes);
                float[] fArr3 = this.mPoints;
                canvas2.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.mPaintKeyframes);
            }
        }

        private void drawTranslation(Canvas canvas, float f2, float f3, float f4, float f5) {
            canvas.drawRect(f2, f3, f4, f5, this.mPaintGraph);
            canvas.drawLine(f2, f3, f4, f5, this.mPaintGraph);
        }

        private void drawPathRelative(Canvas canvas) {
            float[] fArr = this.mPoints;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.mPaintGraph);
        }

        private void drawPathAsConfigured(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.mKeyFrameCount; i++) {
                if (this.mPathMode[i] == 1) {
                    z = true;
                }
                if (this.mPathMode[i] == 0) {
                    z2 = true;
                }
            }
            if (z) {
                drawPathRelative(canvas);
            }
            if (z2) {
                drawPathCartesian(canvas);
            }
        }

        private void drawPathRelativeTicks(Canvas canvas, float f2, float f3) {
            float[] fArr = this.mPoints;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f4 - f6), (double) (f5 - f7));
            float f8 = f6 - f4;
            float f9 = f7 - f5;
            float f10 = (((f2 - f4) * f8) + ((f3 - f5) * f9)) / (hypot * hypot);
            float f11 = f4 + (f8 * f10);
            float f12 = f5 + (f10 * f9);
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f11, f12);
            float hypot2 = (float) Math.hypot((double) (f11 - f2), (double) (f12 - f3));
            String str = "" + (((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            getTextBounds(str, this.mTextPaint);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - ((float) (this.mBounds.width() / 2)), -20.0f, this.mTextPaint);
            canvas.drawLine(f2, f3, f11, f12, this.mPaintGraph);
        }

        /* access modifiers changed from: package-private */
        public void getTextBounds(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.mBounds);
        }

        private void drawPathCartesian(Canvas canvas) {
            float[] fArr = this.mPoints;
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[fArr.length - 2];
            float f5 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f2, f4), Math.max(f3, f5), Math.max(f2, f4), Math.max(f3, f5), this.mPaintGraph);
            canvas.drawLine(Math.min(f2, f4), Math.min(f3, f5), Math.min(f2, f4), Math.max(f3, f5), this.mPaintGraph);
        }

        private void drawPathCartesianTicks(Canvas canvas, float f2, float f3) {
            Canvas canvas2 = canvas;
            float[] fArr = this.mPoints;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            float min = Math.min(f4, f6);
            float max = Math.max(f5, f7);
            float min2 = f2 - Math.min(f4, f6);
            float max2 = Math.max(f5, f7) - f3;
            String str = "" + (((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d))) / 100.0f);
            getTextBounds(str, this.mTextPaint);
            canvas2.drawText(str, ((min2 / 2.0f) - ((float) (this.mBounds.width() / 2))) + min, f3 - 20.0f, this.mTextPaint);
            canvas.drawLine(f2, f3, Math.min(f4, f6), f3, this.mPaintGraph);
            String str2 = "" + (((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f7 - f5))) + 0.5d))) / 100.0f);
            getTextBounds(str2, this.mTextPaint);
            canvas2.drawText(str2, f2 + 5.0f, max - ((max2 / 2.0f) - ((float) (this.mBounds.height() / 2))), this.mTextPaint);
            canvas.drawLine(f2, f3, f2, Math.max(f5, f7), this.mPaintGraph);
        }

        private void drawPathScreenTicks(Canvas canvas, float f2, float f3, int i, int i2) {
            Canvas canvas2 = canvas;
            String str = "" + (((float) ((int) (((double) (((f2 - ((float) (i / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i)))) + 0.5d))) / 100.0f);
            getTextBounds(str, this.mTextPaint);
            canvas2.drawText(str, ((f2 / 2.0f) - ((float) (this.mBounds.width() / 2))) + 0.0f, f3 - 20.0f, this.mTextPaint);
            canvas.drawLine(f2, f3, Math.min(0.0f, 1.0f), f3, this.mPaintGraph);
            String str2 = "" + (((float) ((int) (((double) (((f3 - ((float) (i2 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i2)))) + 0.5d))) / 100.0f);
            getTextBounds(str2, this.mTextPaint);
            canvas2.drawText(str2, f2 + 5.0f, 0.0f - ((f3 / 2.0f) - ((float) (this.mBounds.height() / 2))), this.mTextPaint);
            canvas.drawLine(f2, f3, f2, Math.max(0.0f, 1.0f), this.mPaintGraph);
        }

        private void drawRectangle(Canvas canvas, MotionController motionController) {
            this.mPath.reset();
            for (int i = 0; i <= 50; i++) {
                motionController.buildRect(((float) i) / ((float) 50), this.mRectangle, 0);
                Path path = this.mPath;
                float[] fArr = this.mRectangle;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.mPath;
                float[] fArr2 = this.mRectangle;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.mPath;
                float[] fArr3 = this.mRectangle;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.mPath;
                float[] fArr4 = this.mRectangle;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.mPath.close();
            }
            this.mPaint.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.mPath, this.mPaint);
            canvas.translate(-2.0f, -2.0f);
            this.mPaint.setColor(-65536);
            canvas.drawPath(this.mPath, this.mPaint);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        ArrayList<MotionHelper> arrayList = this.mDecoratorsHelpers;
        if (arrayList != null) {
            Iterator<MotionHelper> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onPreDraw(canvas);
            }
        }
        evaluate(false);
        MotionScene motionScene = this.mScene;
        if (!(motionScene == null || motionScene.mViewTransitionController == null)) {
            this.mScene.mViewTransitionController.animate();
        }
        super.dispatchDraw(canvas);
        if (this.mScene != null) {
            if ((this.mDebugPath & 1) == 1 && !isInEditMode()) {
                this.mFrames++;
                long nanoTime = getNanoTime();
                long j = this.mLastDrawTime;
                if (j != -1) {
                    long j2 = nanoTime - j;
                    if (j2 > 200000000) {
                        this.mLastFps = ((float) ((int) ((((float) this.mFrames) / (((float) j2) * 1.0E-9f)) * 100.0f))) / 100.0f;
                        this.mFrames = 0;
                        this.mLastDrawTime = nanoTime;
                    }
                } else {
                    this.mLastDrawTime = nanoTime;
                }
                Paint paint = new Paint();
                paint.setTextSize(42.0f);
                StringBuilder sb = new StringBuilder();
                sb.append(this.mLastFps + " fps " + Debug.getState(this, this.mBeginState) + " -> ");
                sb.append(Debug.getState(this, this.mEndState));
                sb.append(" (progress: ");
                sb.append(((float) ((int) (getProgress() * 1000.0f))) / 10.0f);
                sb.append(" ) state=");
                int i = this.mCurrentState;
                sb.append(i == -1 ? AdError.UNDEFINED_DOMAIN : Debug.getState(this, i));
                String sb2 = sb.toString();
                paint.setColor(-16777216);
                canvas.drawText(sb2, 11.0f, (float) (getHeight() - 29), paint);
                paint.setColor(-7864184);
                canvas.drawText(sb2, 10.0f, (float) (getHeight() - 30), paint);
            }
            if (this.mDebugPath > 1) {
                if (this.mDevModeDraw == null) {
                    this.mDevModeDraw = new DevModeDraw();
                }
                this.mDevModeDraw.draw(canvas, this.mFrameArrayList, this.mScene.getDuration(), this.mDebugPath);
            }
            ArrayList<MotionHelper> arrayList2 = this.mDecoratorsHelpers;
            if (arrayList2 != null) {
                Iterator<MotionHelper> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().onPostDraw(canvas);
                }
            }
        }
    }

    private void evaluateLayout() {
        boolean z;
        float signum = Math.signum(this.mTransitionGoalPosition - this.mTransitionLastPosition);
        long nanoTime = getNanoTime();
        float f2 = this.mTransitionLastPosition + (!(this.mInterpolator instanceof StopLogic) ? ((((float) (nanoTime - this.mTransitionLastTime)) * signum) * 1.0E-9f) / this.mTransitionDuration : 0.0f);
        if (this.mTransitionInstantly) {
            f2 = this.mTransitionGoalPosition;
        }
        int i = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i <= 0 || f2 < this.mTransitionGoalPosition) && (signum > 0.0f || f2 > this.mTransitionGoalPosition)) {
            z = false;
        } else {
            f2 = this.mTransitionGoalPosition;
            z = true;
        }
        Interpolator interpolator = this.mInterpolator;
        if (interpolator != null && !z) {
            if (this.mTemporalInterpolator) {
                f2 = interpolator.getInterpolation(((float) (nanoTime - this.mAnimationStartTime)) * 1.0E-9f);
            } else {
                f2 = interpolator.getInterpolation(f2);
            }
        }
        if ((i > 0 && f2 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f2 <= this.mTransitionGoalPosition)) {
            f2 = this.mTransitionGoalPosition;
        }
        this.mPostInterpolationPosition = f2;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.mProgressInterpolator;
        if (interpolator2 != null) {
            f2 = interpolator2.getInterpolation(f2);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            MotionController motionController = this.mFrameArrayList.get(childAt);
            if (motionController != null) {
                motionController.interpolate(childAt, f2, nanoTime2, this.mKeyCache);
            }
        }
        if (this.mMeasureDuringTransition) {
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void endTrigger(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            MotionController motionController = this.mFrameArrayList.get(getChildAt(i));
            if (motionController != null) {
                motionController.endTrigger(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void evaluate(boolean r24) {
        /*
            r23 = this;
            r0 = r23
            long r1 = r0.mTransitionLastTime
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0010
            long r1 = r23.getNanoTime()
            r0.mTransitionLastTime = r1
        L_0x0010:
            float r1 = r0.mTransitionLastPosition
            r2 = -1
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0020
            r0.mCurrentState = r2
        L_0x0020:
            boolean r1 = r0.mKeepAnimating
            r5 = 1
            r6 = 0
            if (r1 != 0) goto L_0x0034
            boolean r1 = r0.mInTransition
            if (r1 == 0) goto L_0x024a
            if (r24 != 0) goto L_0x0034
            float r1 = r0.mTransitionGoalPosition
            float r7 = r0.mTransitionLastPosition
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x024a
        L_0x0034:
            float r1 = r0.mTransitionGoalPosition
            float r7 = r0.mTransitionLastPosition
            float r1 = r1 - r7
            float r1 = java.lang.Math.signum(r1)
            long r7 = r23.getNanoTime()
            android.view.animation.Interpolator r9 = r0.mInterpolator
            boolean r9 = r9 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator
            r10 = 814313567(0x3089705f, float:1.0E-9)
            if (r9 != 0) goto L_0x0057
            long r11 = r0.mTransitionLastTime
            long r11 = r7 - r11
            float r9 = (float) r11
            float r9 = r9 * r1
            float r9 = r9 * r10
            float r11 = r0.mTransitionDuration
            float r9 = r9 / r11
            goto L_0x0058
        L_0x0057:
            r9 = 0
        L_0x0058:
            float r11 = r0.mTransitionLastPosition
            float r11 = r11 + r9
            boolean r12 = r0.mTransitionInstantly
            if (r12 == 0) goto L_0x0061
            float r11 = r0.mTransitionGoalPosition
        L_0x0061:
            int r12 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x006b
            float r13 = r0.mTransitionGoalPosition
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x0075
        L_0x006b:
            int r13 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r13 > 0) goto L_0x007b
            float r13 = r0.mTransitionGoalPosition
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 > 0) goto L_0x007b
        L_0x0075:
            float r11 = r0.mTransitionGoalPosition
            r0.mInTransition = r6
            r13 = 1
            goto L_0x007c
        L_0x007b:
            r13 = 0
        L_0x007c:
            r0.mTransitionLastPosition = r11
            r0.mTransitionPosition = r11
            r0.mTransitionLastTime = r7
            r14 = 2
            android.view.animation.Interpolator r15 = r0.mInterpolator
            r16 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r15 == 0) goto L_0x010e
            if (r13 != 0) goto L_0x010e
            boolean r13 = r0.mTemporalInterpolator
            if (r13 == 0) goto L_0x00ee
            long r2 = r0.mAnimationStartTime
            long r2 = r7 - r2
            float r2 = (float) r2
            float r2 = r2 * r10
            float r2 = r15.getInterpolation(r2)
            android.view.animation.Interpolator r3 = r0.mInterpolator
            androidx.constraintlayout.motion.utils.StopLogic r9 = r0.mStopLogic
            if (r3 != r9) goto L_0x00ab
            boolean r3 = r9.isStopped()
            if (r3 == 0) goto L_0x00a9
            r3 = 2
            goto L_0x00ac
        L_0x00a9:
            r3 = 1
            goto L_0x00ac
        L_0x00ab:
            r3 = 0
        L_0x00ac:
            r0.mTransitionLastPosition = r2
            r0.mTransitionLastTime = r7
            android.view.animation.Interpolator r7 = r0.mInterpolator
            boolean r8 = r7 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator
            if (r8 == 0) goto L_0x00ec
            androidx.constraintlayout.motion.widget.MotionInterpolator r7 = (androidx.constraintlayout.motion.widget.MotionInterpolator) r7
            float r7 = r7.getVelocity()
            r0.mLastVelocity = r7
            float r8 = java.lang.Math.abs(r7)
            float r9 = r0.mTransitionDuration
            float r8 = r8 * r9
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 > 0) goto L_0x00ce
            if (r3 != r14) goto L_0x00ce
            r0.mInTransition = r6
        L_0x00ce:
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x00de
            r8 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x00de
            r0.mTransitionLastPosition = r8
            r0.mInTransition = r6
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x00de:
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ec
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x00ec
            r0.mTransitionLastPosition = r4
            r0.mInTransition = r6
            r11 = 0
            goto L_0x0111
        L_0x00ec:
            r11 = r2
            goto L_0x0111
        L_0x00ee:
            float r2 = r15.getInterpolation(r11)
            android.view.animation.Interpolator r3 = r0.mInterpolator
            boolean r7 = r3 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator
            if (r7 == 0) goto L_0x0101
            androidx.constraintlayout.motion.widget.MotionInterpolator r3 = (androidx.constraintlayout.motion.widget.MotionInterpolator) r3
            float r3 = r3.getVelocity()
            r0.mLastVelocity = r3
            goto L_0x010c
        L_0x0101:
            float r11 = r11 + r9
            float r3 = r3.getInterpolation(r11)
            float r3 = r3 - r2
            float r3 = r3 * r1
            float r3 = r3 / r9
            r0.mLastVelocity = r3
        L_0x010c:
            r11 = r2
            goto L_0x0110
        L_0x010e:
            r0.mLastVelocity = r9
        L_0x0110:
            r3 = 0
        L_0x0111:
            float r2 = r0.mLastVelocity
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x0120
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r0.setState(r2)
        L_0x0120:
            if (r3 == r5) goto L_0x0149
            if (r12 <= 0) goto L_0x012a
            float r2 = r0.mTransitionGoalPosition
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0134
        L_0x012a:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0138
            float r2 = r0.mTransitionGoalPosition
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0138
        L_0x0134:
            float r11 = r0.mTransitionGoalPosition
            r0.mInTransition = r6
        L_0x0138:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0142
            int r2 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0149
        L_0x0142:
            r0.mInTransition = r6
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r2)
        L_0x0149:
            int r2 = r23.getChildCount()
            r0.mKeepAnimating = r6
            long r7 = r23.getNanoTime()
            r0.mPostInterpolationPosition = r11
            android.view.animation.Interpolator r3 = r0.mProgressInterpolator
            if (r3 != 0) goto L_0x015b
            r3 = r11
            goto L_0x015f
        L_0x015b:
            float r3 = r3.getInterpolation(r11)
        L_0x015f:
            android.view.animation.Interpolator r9 = r0.mProgressInterpolator
            if (r9 == 0) goto L_0x0177
            float r10 = r0.mTransitionDuration
            float r10 = r1 / r10
            float r10 = r10 + r11
            float r9 = r9.getInterpolation(r10)
            r0.mLastVelocity = r9
            android.view.animation.Interpolator r10 = r0.mProgressInterpolator
            float r10 = r10.getInterpolation(r11)
            float r9 = r9 - r10
            r0.mLastVelocity = r9
        L_0x0177:
            r9 = 0
        L_0x0178:
            if (r9 >= r2) goto L_0x01a0
            android.view.View r10 = r0.getChildAt(r9)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r14 = r0.mFrameArrayList
            java.lang.Object r14 = r14.get(r10)
            r17 = r14
            androidx.constraintlayout.motion.widget.MotionController r17 = (androidx.constraintlayout.motion.widget.MotionController) r17
            if (r17 == 0) goto L_0x019d
            boolean r14 = r0.mKeepAnimating
            androidx.constraintlayout.core.motion.utils.KeyCache r15 = r0.mKeyCache
            r18 = r10
            r19 = r3
            r20 = r7
            r22 = r15
            boolean r10 = r17.interpolate(r18, r19, r20, r22)
            r10 = r10 | r14
            r0.mKeepAnimating = r10
        L_0x019d:
            int r9 = r9 + 1
            goto L_0x0178
        L_0x01a0:
            if (r12 <= 0) goto L_0x01a8
            float r2 = r0.mTransitionGoalPosition
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x01b2
        L_0x01a8:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x01b4
            float r2 = r0.mTransitionGoalPosition
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01b4
        L_0x01b2:
            r2 = 1
            goto L_0x01b5
        L_0x01b4:
            r2 = 0
        L_0x01b5:
            boolean r3 = r0.mKeepAnimating
            if (r3 != 0) goto L_0x01c4
            boolean r3 = r0.mInTransition
            if (r3 != 0) goto L_0x01c4
            if (r2 == 0) goto L_0x01c4
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
        L_0x01c4:
            boolean r3 = r0.mMeasureDuringTransition
            if (r3 == 0) goto L_0x01cb
            r23.requestLayout()
        L_0x01cb:
            boolean r3 = r0.mKeepAnimating
            r2 = r2 ^ r5
            r2 = r2 | r3
            r0.mKeepAnimating = r2
            int r2 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x01ef
            int r2 = r0.mBeginState
            r3 = -1
            if (r2 == r3) goto L_0x01ef
            int r3 = r0.mCurrentState
            if (r3 == r2) goto L_0x01ef
            r0.mCurrentState = r2
            androidx.constraintlayout.motion.widget.MotionScene r3 = r0.mScene
            androidx.constraintlayout.widget.ConstraintSet r2 = r3.getConstraintSet(r2)
            r2.applyCustomAttributes(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r2)
            r6 = 1
        L_0x01ef:
            double r2 = (double) r11
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x020d
            int r2 = r0.mCurrentState
            int r3 = r0.mEndState
            if (r2 == r3) goto L_0x020d
            r0.mCurrentState = r3
            androidx.constraintlayout.motion.widget.MotionScene r2 = r0.mScene
            androidx.constraintlayout.widget.ConstraintSet r2 = r2.getConstraintSet(r3)
            r2.applyCustomAttributes(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r2)
            r6 = 1
        L_0x020d:
            boolean r2 = r0.mKeepAnimating
            if (r2 != 0) goto L_0x022c
            boolean r2 = r0.mInTransition
            if (r2 == 0) goto L_0x0216
            goto L_0x022c
        L_0x0216:
            if (r12 <= 0) goto L_0x021e
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0226
        L_0x021e:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x022f
            int r2 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x022f
        L_0x0226:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r2)
            goto L_0x022f
        L_0x022c:
            r23.invalidate()
        L_0x022f:
            boolean r2 = r0.mKeepAnimating
            if (r2 != 0) goto L_0x024a
            boolean r2 = r0.mInTransition
            if (r2 != 0) goto L_0x024a
            if (r12 <= 0) goto L_0x023f
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0247
        L_0x023f:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x024a
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x024a
        L_0x0247:
            r23.onNewStateAttachHandlers()
        L_0x024a:
            float r1 = r0.mTransitionLastPosition
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0260
            int r1 = r0.mCurrentState
            int r2 = r0.mEndState
            if (r1 == r2) goto L_0x0259
            goto L_0x025a
        L_0x0259:
            r5 = r6
        L_0x025a:
            int r1 = r0.mEndState
            r0.mCurrentState = r1
        L_0x025e:
            r6 = r5
            goto L_0x0271
        L_0x0260:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0271
            int r1 = r0.mCurrentState
            int r2 = r0.mBeginState
            if (r1 == r2) goto L_0x026b
            goto L_0x026c
        L_0x026b:
            r5 = r6
        L_0x026c:
            int r1 = r0.mBeginState
            r0.mCurrentState = r1
            goto L_0x025e
        L_0x0271:
            boolean r1 = r0.mNeedsFireTransitionCompleted
            r1 = r1 | r6
            r0.mNeedsFireTransitionCompleted = r1
            if (r6 == 0) goto L_0x027f
            boolean r1 = r0.mInLayout
            if (r1 != 0) goto L_0x027f
            r23.requestLayout()
        L_0x027f:
            float r1 = r0.mTransitionLastPosition
            r0.mTransitionPosition = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.evaluate(boolean):void");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.mInLayout = true;
        try {
            if (this.mScene == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (!(this.mLastLayoutWidth == i5 && this.mLastLayoutHeight == i6)) {
                rebuildScene();
                evaluate(true);
            }
            this.mLastLayoutWidth = i5;
            this.mLastLayoutHeight = i6;
            this.mOldWidth = i5;
            this.mOldHeight = i6;
            this.mInLayout = false;
        } finally {
            this.mInLayout = false;
        }
    }

    /* access modifiers changed from: protected */
    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    public void setScene(MotionScene motionScene) {
        this.mScene = motionScene;
        motionScene.setRtl(isRtl());
        rebuildScene();
    }

    public MotionScene getScene() {
        return this.mScene;
    }

    public void setDebugMode(int i) {
        this.mDebugPath = i;
        invalidate();
    }

    private boolean callTransformedTouchEvent(View view, MotionEvent motionEvent, float f2, float f3) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f2, f3);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f2, -f3);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f2, f3);
        if (this.mInverseMatrix == null) {
            this.mInverseMatrix = new Matrix();
        }
        matrix.invert(this.mInverseMatrix);
        obtain.transform(this.mInverseMatrix);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean handlesTouchEvent(float r8, float r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L_0x0036
            r0 = r10
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            int r2 = r2 - r1
        L_0x000d:
            if (r2 < 0) goto L_0x0036
            android.view.View r3 = r0.getChildAt(r2)
            int r4 = r3.getLeft()
            float r4 = (float) r4
            float r4 = r4 + r8
            int r5 = r10.getScrollX()
            float r5 = (float) r5
            float r4 = r4 - r5
            int r5 = r3.getTop()
            float r5 = (float) r5
            float r5 = r5 + r9
            int r6 = r10.getScrollY()
            float r6 = (float) r6
            float r5 = r5 - r6
            boolean r3 = r7.handlesTouchEvent(r4, r5, r3, r11)
            if (r3 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0037
        L_0x0033:
            int r2 = r2 + -1
            goto L_0x000d
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 != 0) goto L_0x0075
            android.graphics.RectF r2 = r7.mBoundsCheck
            int r3 = r10.getRight()
            float r3 = (float) r3
            float r3 = r3 + r8
            int r4 = r10.getLeft()
            float r4 = (float) r4
            float r3 = r3 - r4
            int r4 = r10.getBottom()
            float r4 = (float) r4
            float r4 = r4 + r9
            int r5 = r10.getTop()
            float r5 = (float) r5
            float r4 = r4 - r5
            r2.set(r8, r9, r3, r4)
            int r2 = r11.getAction()
            if (r2 != 0) goto L_0x006c
            android.graphics.RectF r2 = r7.mBoundsCheck
            float r3 = r11.getX()
            float r4 = r11.getY()
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L_0x0075
        L_0x006c:
            float r8 = -r8
            float r9 = -r9
            boolean r8 = r7.callTransformedTouchEvent(r10, r11, r8, r9)
            if (r8 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r1 = r0
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.handlesTouchEvent(float, float, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        TouchResponse touchResponse;
        int touchRegionId;
        RectF touchRegion;
        MotionScene motionScene = this.mScene;
        if (motionScene != null && this.mInteractionEnabled) {
            if (motionScene.mViewTransitionController != null) {
                this.mScene.mViewTransitionController.touchEvent(motionEvent);
            }
            MotionScene.Transition transition = this.mScene.mCurrentTransition;
            if (transition != null && transition.isEnabled() && (touchResponse = transition.getTouchResponse()) != null && ((motionEvent.getAction() != 0 || (touchRegion = touchResponse.getTouchRegion(this, new RectF())) == null || touchRegion.contains(motionEvent.getX(), motionEvent.getY())) && (touchRegionId = touchResponse.getTouchRegionId()) != -1)) {
                View view = this.mRegionView;
                if (view == null || view.getId() != touchRegionId) {
                    this.mRegionView = findViewById(touchRegionId);
                }
                View view2 = this.mRegionView;
                if (view2 != null) {
                    this.mBoundsCheck.set((float) view2.getLeft(), (float) this.mRegionView.getTop(), (float) this.mRegionView.getRight(), (float) this.mRegionView.getBottom());
                    if (this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY()) && !handlesTouchEvent((float) this.mRegionView.getLeft(), (float) this.mRegionView.getTop(), this.mRegionView, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null || !this.mInteractionEnabled || !motionScene.supportTouch()) {
            return super.onTouchEvent(motionEvent);
        }
        MotionScene.Transition transition = this.mScene.mCurrentTransition;
        if (transition != null && !transition.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        this.mScene.processTouchEvent(motionEvent, getCurrentState(), this);
        if (this.mScene.mCurrentTransition.isTransitionFlag(4)) {
            return this.mScene.mCurrentTransition.getTouchResponse().isDragStarted();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        int i;
        Display display;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 17 && (display = getDisplay()) != null) {
            this.mPreviouseRotation = display.getRotation();
        }
        MotionScene motionScene = this.mScene;
        if (!(motionScene == null || (i = this.mCurrentState) == -1)) {
            ConstraintSet constraintSet = motionScene.getConstraintSet(i);
            this.mScene.readFallback(this);
            ArrayList<MotionHelper> arrayList = this.mDecoratorsHelpers;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onFinishedMotionScene(this);
                }
            }
            if (constraintSet != null) {
                constraintSet.applyTo(this);
            }
            this.mBeginState = this.mCurrentState;
        }
        onNewStateAttachHandlers();
        StateCache stateCache = this.mStateCache;
        if (stateCache == null) {
            MotionScene motionScene2 = this.mScene;
            if (motionScene2 != null && motionScene2.mCurrentTransition != null && this.mScene.mCurrentTransition.getAutoTransition() == 4) {
                transitionToEnd();
                setState(TransitionState.SETUP);
                setState(TransitionState.MOVING);
            }
        } else if (this.mDelayedApply) {
            post(new Runnable() {
                public void run() {
                    MotionLayout.this.mStateCache.apply();
                }
            });
        } else {
            stateCache.apply();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.setRtl(isRtl());
        }
    }

    /* access modifiers changed from: package-private */
    public void onNewStateAttachHandlers() {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            if (motionScene.autoTransition(this, this.mCurrentState)) {
                requestLayout();
                return;
            }
            int i = this.mCurrentState;
            if (i != -1) {
                this.mScene.addOnClickListeners(this, i);
            }
            if (this.mScene.supportTouch()) {
                this.mScene.setupTouch();
            }
        }
    }

    public int getCurrentState() {
        return this.mCurrentState;
    }

    public float getProgress() {
        return this.mTransitionLastPosition;
    }

    /* access modifiers changed from: package-private */
    public void getAnchorDpDt(int i, float f2, float f3, float f4, float[] fArr) {
        String str;
        HashMap<View, MotionController> hashMap = this.mFrameArrayList;
        View viewById = getViewById(i);
        MotionController motionController = hashMap.get(viewById);
        if (motionController != null) {
            motionController.getDpDt(f2, f3, f4, fArr);
            float y = viewById.getY();
            int i2 = ((f2 - this.lastPos) > 0.0f ? 1 : ((f2 - this.lastPos) == 0.0f ? 0 : -1));
            this.lastPos = f2;
            this.lastY = y;
            return;
        }
        if (viewById == null) {
            str = "" + i;
        } else {
            str = viewById.getContext().getResources().getResourceName(i);
        }
        Log.w("MotionLayout", "WARNING could not find view id " + str);
    }

    public long getTransitionTimeMs() {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            this.mTransitionDuration = ((float) motionScene.getDuration()) / 1000.0f;
        }
        return (long) (this.mTransitionDuration * 1000.0f);
    }

    public void setTransitionListener(TransitionListener transitionListener) {
        this.mTransitionListener = transitionListener;
    }

    public void fireTrigger(int i, boolean z, float f2) {
        TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionTrigger(this, i, z, f2);
        }
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList != null) {
            Iterator<TransitionListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionTrigger(this, i, z, f2);
            }
        }
    }

    private void fireTransitionChange() {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        if ((this.mTransitionListener != null || ((copyOnWriteArrayList = this.mTransitionListeners) != null && !copyOnWriteArrayList.isEmpty())) && this.mListenerPosition != this.mTransitionPosition) {
            if (this.mListenerState != -1) {
                TransitionListener transitionListener = this.mTransitionListener;
                if (transitionListener != null) {
                    transitionListener.onTransitionStarted(this, this.mBeginState, this.mEndState);
                }
                CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList2 = this.mTransitionListeners;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<TransitionListener> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().onTransitionStarted(this, this.mBeginState, this.mEndState);
                    }
                }
                this.mIsAnimating = true;
            }
            this.mListenerState = -1;
            float f2 = this.mTransitionPosition;
            this.mListenerPosition = f2;
            TransitionListener transitionListener2 = this.mTransitionListener;
            if (transitionListener2 != null) {
                transitionListener2.onTransitionChange(this, this.mBeginState, this.mEndState, f2);
            }
            CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList3 = this.mTransitionListeners;
            if (copyOnWriteArrayList3 != null) {
                Iterator<TransitionListener> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().onTransitionChange(this, this.mBeginState, this.mEndState, this.mTransitionPosition);
                }
            }
            this.mIsAnimating = true;
        }
    }

    /* access modifiers changed from: protected */
    public void fireTransitionCompleted() {
        int i;
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        if ((this.mTransitionListener != null || ((copyOnWriteArrayList = this.mTransitionListeners) != null && !copyOnWriteArrayList.isEmpty())) && this.mListenerState == -1) {
            this.mListenerState = this.mCurrentState;
            if (!this.mTransitionCompleted.isEmpty()) {
                ArrayList<Integer> arrayList = this.mTransitionCompleted;
                i = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i = -1;
            }
            int i2 = this.mCurrentState;
            if (!(i == i2 || i2 == -1)) {
                this.mTransitionCompleted.add(Integer.valueOf(i2));
            }
        }
        processTransitionCompleted();
        Runnable runnable = this.mOnComplete;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.mScheduledTransitionTo;
        if (iArr != null && this.mScheduledTransitions > 0) {
            transitionToState(iArr[0]);
            int[] iArr2 = this.mScheduledTransitionTo;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.mScheduledTransitions--;
        }
    }

    private void processTransitionCompleted() {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        if (this.mTransitionListener != null || ((copyOnWriteArrayList = this.mTransitionListeners) != null && !copyOnWriteArrayList.isEmpty())) {
            this.mIsAnimating = false;
            Iterator<Integer> it = this.mTransitionCompleted.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                TransitionListener transitionListener = this.mTransitionListener;
                if (transitionListener != null) {
                    transitionListener.onTransitionCompleted(this, next.intValue());
                }
                CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList2 = this.mTransitionListeners;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<TransitionListener> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().onTransitionCompleted(this, next.intValue());
                    }
                }
            }
            this.mTransitionCompleted.clear();
        }
    }

    public DesignTool getDesignTool() {
        if (this.mDesignTool == null) {
            this.mDesignTool = new DesignTool(this);
        }
        return this.mDesignTool;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.mTransitionListeners == null) {
                this.mTransitionListeners = new CopyOnWriteArrayList<>();
            }
            this.mTransitionListeners.add(motionHelper);
            if (motionHelper.isUsedOnShow()) {
                if (this.mOnShowHelpers == null) {
                    this.mOnShowHelpers = new ArrayList<>();
                }
                this.mOnShowHelpers.add(motionHelper);
            }
            if (motionHelper.isUseOnHide()) {
                if (this.mOnHideHelpers == null) {
                    this.mOnHideHelpers = new ArrayList<>();
                }
                this.mOnHideHelpers.add(motionHelper);
            }
            if (motionHelper.isDecorator()) {
                if (this.mDecoratorsHelpers == null) {
                    this.mDecoratorsHelpers = new ArrayList<>();
                }
                this.mDecoratorsHelpers.add(motionHelper);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.mOnHideHelpers;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void setOnShow(float f2) {
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mOnShowHelpers.get(i).setProgress(f2);
            }
        }
    }

    public void setOnHide(float f2) {
        ArrayList<MotionHelper> arrayList = this.mOnHideHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mOnHideHelpers.get(i).setProgress(f2);
            }
        }
    }

    public int[] getConstraintSetIds() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSetIds();
    }

    public ConstraintSet getConstraintSet(int i) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSet(i);
    }

    public void rebuildScene() {
        this.mModel.reEvaluateState();
        invalidate();
    }

    public void updateState(int i, ConstraintSet constraintSet) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.setConstraintSet(i, constraintSet);
        }
        updateState();
        if (this.mCurrentState == i) {
            constraintSet.applyTo(this);
        }
    }

    public void updateState() {
        this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
        rebuildScene();
    }

    public ArrayList<MotionScene.Transition> getDefinedTransitions() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getDefinedTransitions();
    }

    public int getStartState() {
        return this.mBeginState;
    }

    public int getEndState() {
        return this.mEndState;
    }

    public float getTargetPosition() {
        return this.mTransitionGoalPosition;
    }

    public void setTransitionDuration(int i) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            motionScene.setDuration(i);
        }
    }

    public MotionScene.Transition getTransition(int i) {
        return this.mScene.getTransitionById(i);
    }

    public void setInteractionEnabled(boolean z) {
        this.mInteractionEnabled = z;
    }

    public boolean isInteractionEnabled() {
        return this.mInteractionEnabled;
    }

    public void viewTransition(int i, View... viewArr) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.viewTransition(i, viewArr);
        } else {
            Log.e("MotionLayout", " no motionScene");
        }
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.mDelayedApply = z;
    }
}
