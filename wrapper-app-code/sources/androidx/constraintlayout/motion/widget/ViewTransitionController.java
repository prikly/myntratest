package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ViewTransitionController {
    private String TAG;
    ArrayList<ViewTransition.Animate> animations;
    private final MotionLayout mMotionLayout;
    private HashSet<View> mRelatedViews;
    ArrayList<ViewTransition.Animate> removeList;
    private ArrayList<ViewTransition> viewTransitions;

    private void viewTransition(ViewTransition viewTransition, View... viewArr) {
        int currentState = this.mMotionLayout.getCurrentState();
        if (viewTransition.mViewTransitionMode == 2) {
            viewTransition.applyTransition(this, this.mMotionLayout, currentState, (ConstraintSet) null, viewArr);
        } else if (currentState == -1) {
            String str = this.TAG;
            Log.w(str, "No support for ViewTransition within transition yet. Currently: " + this.mMotionLayout.toString());
        } else {
            ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(currentState);
            if (constraintSet != null) {
                viewTransition.applyTransition(this, this.mMotionLayout, currentState, constraintSet, viewArr);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void viewTransition(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<ViewTransition> it = this.viewTransitions.iterator();
        ViewTransition viewTransition = null;
        while (it.hasNext()) {
            ViewTransition next = it.next();
            if (next.getId() == i) {
                for (View view : viewArr) {
                    if (next.checkTags(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    viewTransition(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                viewTransition = next;
            }
        }
        if (viewTransition == null) {
            Log.e(this.TAG, " Could not find ViewTransition");
        }
    }

    /* access modifiers changed from: package-private */
    public void touchEvent(MotionEvent motionEvent) {
        ViewTransition viewTransition;
        int currentState = this.mMotionLayout.getCurrentState();
        if (currentState != -1) {
            if (this.mRelatedViews == null) {
                this.mRelatedViews = new HashSet<>();
                Iterator<ViewTransition> it = this.viewTransitions.iterator();
                while (it.hasNext()) {
                    ViewTransition next = it.next();
                    int childCount = this.mMotionLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = this.mMotionLayout.getChildAt(i);
                        if (next.matchesView(childAt)) {
                            childAt.getId();
                            this.mRelatedViews.add(childAt);
                        }
                    }
                }
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList<ViewTransition.Animate> arrayList = this.animations;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<ViewTransition.Animate> it2 = this.animations.iterator();
                while (it2.hasNext()) {
                    it2.next().reactTo(action, x, y);
                }
            }
            if (action == 0 || action == 1) {
                ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(currentState);
                Iterator<ViewTransition> it3 = this.viewTransitions.iterator();
                while (it3.hasNext()) {
                    ViewTransition next2 = it3.next();
                    if (next2.supports(action)) {
                        Iterator<View> it4 = this.mRelatedViews.iterator();
                        while (it4.hasNext()) {
                            View next3 = it4.next();
                            if (next2.matchesView(next3)) {
                                next3.getHitRect(rect);
                                if (rect.contains((int) x, (int) y)) {
                                    viewTransition = next2;
                                    next2.applyTransition(this, this.mMotionLayout, currentState, constraintSet, next3);
                                } else {
                                    viewTransition = next2;
                                }
                                next2 = viewTransition;
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void addAnimation(ViewTransition.Animate animate) {
        if (this.animations == null) {
            this.animations = new ArrayList<>();
        }
        this.animations.add(animate);
    }

    /* access modifiers changed from: package-private */
    public void removeAnimation(ViewTransition.Animate animate) {
        this.removeList.add(animate);
    }

    /* access modifiers changed from: package-private */
    public void animate() {
        ArrayList<ViewTransition.Animate> arrayList = this.animations;
        if (arrayList != null) {
            Iterator<ViewTransition.Animate> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mutate();
            }
            this.animations.removeAll(this.removeList);
            this.removeList.clear();
            if (this.animations.isEmpty()) {
                this.animations = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void invalidate() {
        this.mMotionLayout.invalidate();
    }
}
