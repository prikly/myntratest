package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import java.util.ArrayList;
import java.util.Iterator;

public class ViewTransition {
    private static String TAG = "ViewTransition";
    private int mClearsTag;
    ConstraintSet.Constraint mConstraintDelta;
    Context mContext;
    private int mDefaultInterpolator;
    private int mDefaultInterpolatorID;
    private String mDefaultInterpolatorString;
    private boolean mDisabled;
    private int mDuration;
    private int mId;
    private int mIfTagNotSet;
    private int mIfTagSet;
    KeyFrames mKeyFrames;
    private int mOnStateTransition;
    private int mPathMotionArc;
    private int mSetsTag;
    private int mTargetId;
    private String mTargetString;
    private int mUpDuration;
    int mViewTransitionMode;

    public String toString() {
        return "ViewTransition(" + Debug.getName(this.mContext, this.mId) + ")";
    }

    /* access modifiers changed from: package-private */
    public Interpolator getInterpolator(Context context) {
        int i = this.mDefaultInterpolator;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, this.mDefaultInterpolatorID);
        }
        if (i == -1) {
            final Easing interpolator = Easing.getInterpolator(this.mDefaultInterpolatorString);
            return new Interpolator(this) {
                public float getInterpolation(float f2) {
                    return (float) interpolator.get((double) f2);
                }
            };
        } else if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        } else {
            if (i == 1) {
                return new AccelerateInterpolator();
            }
            if (i == 2) {
                return new DecelerateInterpolator();
            }
            if (i == 4) {
                return new BounceInterpolator();
            }
            if (i == 5) {
                return new OvershootInterpolator();
            }
            if (i != 6) {
                return null;
            }
            return new AnticipateInterpolator();
        }
    }

    /* access modifiers changed from: package-private */
    public void applyIndependentTransition(ViewTransitionController viewTransitionController, MotionLayout motionLayout, View view) {
        MotionController motionController = new MotionController(view);
        motionController.setBothStates(view);
        this.mKeyFrames.addAllFrames(motionController);
        motionController.setup(motionLayout.getWidth(), motionLayout.getHeight(), (float) this.mDuration, System.nanoTime());
        ViewTransitionController viewTransitionController2 = viewTransitionController;
        MotionController motionController2 = motionController;
        new Animate(viewTransitionController2, motionController2, this.mDuration, this.mUpDuration, this.mOnStateTransition, getInterpolator(motionLayout.getContext()), this.mSetsTag, this.mClearsTag);
    }

    static class Animate {
        boolean hold_at_100 = false;
        KeyCache mCache = new KeyCache();
        private final int mClearsTag;
        float mDpositionDt;
        int mDuration;
        Interpolator mInterpolator;
        long mLastRender;
        MotionController mMC;
        float mPosition;
        private final int mSetsTag;
        long mStart;
        Rect mTempRec = new Rect();
        int mUpDuration;
        ViewTransitionController mVtController;
        boolean reverse = false;

        Animate(ViewTransitionController viewTransitionController, MotionController motionController, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            this.mVtController = viewTransitionController;
            this.mMC = motionController;
            this.mDuration = i;
            this.mUpDuration = i2;
            long nanoTime = System.nanoTime();
            this.mStart = nanoTime;
            this.mLastRender = nanoTime;
            this.mVtController.addAnimation(this);
            this.mInterpolator = interpolator;
            this.mSetsTag = i4;
            this.mClearsTag = i5;
            if (i3 == 3) {
                this.hold_at_100 = true;
            }
            this.mDpositionDt = i == 0 ? Float.MAX_VALUE : 1.0f / ((float) i);
            mutate();
        }

        /* access modifiers changed from: package-private */
        public void reverse(boolean z) {
            int i;
            this.reverse = z;
            if (z && (i = this.mUpDuration) != -1) {
                this.mDpositionDt = i == 0 ? Float.MAX_VALUE : 1.0f / ((float) i);
            }
            this.mVtController.invalidate();
            this.mLastRender = System.nanoTime();
        }

        /* access modifiers changed from: package-private */
        public void mutate() {
            if (this.reverse) {
                mutateReverse();
            } else {
                mutateForward();
            }
        }

        /* access modifiers changed from: package-private */
        public void mutateReverse() {
            long nanoTime = System.nanoTime();
            this.mLastRender = nanoTime;
            float f2 = this.mPosition - (((float) (((double) (nanoTime - this.mLastRender)) * 1.0E-6d)) * this.mDpositionDt);
            this.mPosition = f2;
            if (f2 < 0.0f) {
                this.mPosition = 0.0f;
            }
            Interpolator interpolator = this.mInterpolator;
            float interpolation = interpolator == null ? this.mPosition : interpolator.getInterpolation(this.mPosition);
            MotionController motionController = this.mMC;
            boolean interpolate = motionController.interpolate(motionController.mView, interpolation, nanoTime, this.mCache);
            if (this.mPosition <= 0.0f) {
                if (this.mSetsTag != -1) {
                    this.mMC.getView().setTag(this.mSetsTag, Long.valueOf(System.nanoTime()));
                }
                if (this.mClearsTag != -1) {
                    this.mMC.getView().setTag(this.mClearsTag, (Object) null);
                }
                this.mVtController.removeAnimation(this);
            }
            if (this.mPosition > 0.0f || interpolate) {
                this.mVtController.invalidate();
            }
        }

        /* access modifiers changed from: package-private */
        public void mutateForward() {
            long nanoTime = System.nanoTime();
            this.mLastRender = nanoTime;
            float f2 = this.mPosition + (((float) (((double) (nanoTime - this.mLastRender)) * 1.0E-6d)) * this.mDpositionDt);
            this.mPosition = f2;
            if (f2 >= 1.0f) {
                this.mPosition = 1.0f;
            }
            Interpolator interpolator = this.mInterpolator;
            float interpolation = interpolator == null ? this.mPosition : interpolator.getInterpolation(this.mPosition);
            MotionController motionController = this.mMC;
            boolean interpolate = motionController.interpolate(motionController.mView, interpolation, nanoTime, this.mCache);
            if (this.mPosition >= 1.0f) {
                if (this.mSetsTag != -1) {
                    this.mMC.getView().setTag(this.mSetsTag, Long.valueOf(System.nanoTime()));
                }
                if (this.mClearsTag != -1) {
                    this.mMC.getView().setTag(this.mClearsTag, (Object) null);
                }
                if (!this.hold_at_100) {
                    this.mVtController.removeAnimation(this);
                }
            }
            if (this.mPosition < 1.0f || interpolate) {
                this.mVtController.invalidate();
            }
        }

        public void reactTo(int i, float f2, float f3) {
            if (i != 1) {
                if (i == 2) {
                    this.mMC.getView().getHitRect(this.mTempRec);
                    if (!this.mTempRec.contains((int) f2, (int) f3) && !this.reverse) {
                        reverse(true);
                    }
                }
            } else if (!this.reverse) {
                reverse(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void applyTransition(ViewTransitionController viewTransitionController, MotionLayout motionLayout, int i, ConstraintSet constraintSet, View... viewArr) {
        if (!this.mDisabled) {
            int i2 = this.mViewTransitionMode;
            if (i2 == 2) {
                applyIndependentTransition(viewTransitionController, motionLayout, viewArr[0]);
                return;
            }
            if (i2 == 1) {
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                for (int i3 : constraintSetIds) {
                    if (i3 != i) {
                        ConstraintSet constraintSet2 = motionLayout.getConstraintSet(i3);
                        for (View id : viewArr) {
                            ConstraintSet.Constraint constraint = constraintSet2.getConstraint(id.getId());
                            ConstraintSet.Constraint constraint2 = this.mConstraintDelta;
                            if (constraint2 != null) {
                                constraint2.applyDelta(constraint);
                                constraint.mCustomConstraints.putAll(this.mConstraintDelta.mCustomConstraints);
                            }
                        }
                    }
                }
            }
            ConstraintSet constraintSet3 = new ConstraintSet();
            constraintSet3.clone(constraintSet);
            for (View id2 : viewArr) {
                ConstraintSet.Constraint constraint3 = constraintSet3.getConstraint(id2.getId());
                ConstraintSet.Constraint constraint4 = this.mConstraintDelta;
                if (constraint4 != null) {
                    constraint4.applyDelta(constraint3);
                    constraint3.mCustomConstraints.putAll(this.mConstraintDelta.mCustomConstraints);
                }
            }
            motionLayout.updateState(i, constraintSet3);
            motionLayout.updateState(R.id.view_transition, constraintSet);
            motionLayout.setState(R.id.view_transition, -1, -1);
            MotionScene.Transition transition = new MotionScene.Transition(-1, motionLayout.mScene, R.id.view_transition, i);
            for (View updateTransition : viewArr) {
                updateTransition(transition, updateTransition);
            }
            motionLayout.setTransition(transition);
            motionLayout.transitionToEnd(new Runnable(viewArr) {
                public final /* synthetic */ View[] f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    ViewTransition.this.lambda$applyTransition$0$ViewTransition(this.f$1);
                }
            });
        }
    }

    public /* synthetic */ void lambda$applyTransition$0$ViewTransition(View[] viewArr) {
        if (this.mSetsTag != -1) {
            for (View tag : viewArr) {
                tag.setTag(this.mSetsTag, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.mClearsTag != -1) {
            for (View tag2 : viewArr) {
                tag2.setTag(this.mClearsTag, (Object) null);
            }
        }
    }

    private void updateTransition(MotionScene.Transition transition, View view) {
        int i = this.mDuration;
        if (i != -1) {
            transition.setDuration(i);
        }
        transition.setPathMotionArc(this.mPathMotionArc);
        transition.setInterpolatorInfo(this.mDefaultInterpolator, this.mDefaultInterpolatorString, this.mDefaultInterpolatorID);
        int id = view.getId();
        KeyFrames keyFrames = this.mKeyFrames;
        if (keyFrames != null) {
            ArrayList<Key> keyFramesForView = keyFrames.getKeyFramesForView(-1);
            KeyFrames keyFrames2 = new KeyFrames();
            Iterator<Key> it = keyFramesForView.iterator();
            while (it.hasNext()) {
                keyFrames2.addKey(it.next().clone().setViewId(id));
            }
            transition.addKeyFrame(keyFrames2);
        }
    }

    /* access modifiers changed from: package-private */
    public int getId() {
        return this.mId;
    }

    /* access modifiers changed from: package-private */
    public boolean matchesView(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.mTargetId == -1 && this.mTargetString == null) || !checkTags(view)) {
            return false;
        }
        if (view.getId() == this.mTargetId) {
            return true;
        }
        if (this.mTargetString != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).constraintTag) != null && str.matches(this.mTargetString)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean supports(int i) {
        int i2 = this.mOnStateTransition;
        return i2 == 1 ? i == 0 : i2 == 2 ? i == 1 : i2 == 3 && i == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean checkTags(View view) {
        int i = this.mIfTagSet;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.mIfTagNotSet;
        boolean z2 = i2 == -1 || view.getTag(i2) == null;
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
