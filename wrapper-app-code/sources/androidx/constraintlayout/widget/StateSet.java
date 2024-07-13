package androidx.constraintlayout.widget;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;

public class StateSet {
    int mCurrentConstraintNumber;
    int mCurrentStateId;
    private SparseArray<State> mStateList;

    public int stateGetConstraintID(int i, int i2, int i3) {
        return updateConstraints(-1, i, (float) i2, (float) i3);
    }

    public int convertToConstraintSet(int i, int i2, float f2, float f3) {
        State state = this.mStateList.get(i2);
        if (state == null) {
            return i2;
        }
        if (f2 != -1.0f && f3 != -1.0f) {
            Variant variant = null;
            Iterator<Variant> it = state.mVariants.iterator();
            while (it.hasNext()) {
                Variant next = it.next();
                if (next.match(f2, f3)) {
                    if (i == next.mConstraintID) {
                        return i;
                    }
                    variant = next;
                }
            }
            if (variant != null) {
                return variant.mConstraintID;
            }
            return state.mConstraintID;
        } else if (state.mConstraintID == i) {
            return i;
        } else {
            Iterator<Variant> it2 = state.mVariants.iterator();
            while (it2.hasNext()) {
                if (i == it2.next().mConstraintID) {
                    return i;
                }
            }
            return state.mConstraintID;
        }
    }

    public int updateConstraints(int i, int i2, float f2, float f3) {
        State state;
        int findMatch;
        if (i == i2) {
            if (i2 == -1) {
                state = this.mStateList.valueAt(0);
            } else {
                state = this.mStateList.get(this.mCurrentStateId);
            }
            if (state == null) {
                return -1;
            }
            if ((this.mCurrentConstraintNumber == -1 || !state.mVariants.get(i).match(f2, f3)) && i != (findMatch = state.findMatch(f2, f3))) {
                return findMatch == -1 ? state.mConstraintID : state.mVariants.get(findMatch).mConstraintID;
            }
            return i;
        }
        State state2 = this.mStateList.get(i2);
        if (state2 == null) {
            return -1;
        }
        int findMatch2 = state2.findMatch(f2, f3);
        return findMatch2 == -1 ? state2.mConstraintID : state2.mVariants.get(findMatch2).mConstraintID;
    }

    static class State {
        int mConstraintID;
        ArrayList<Variant> mVariants;

        public int findMatch(float f2, float f3) {
            for (int i = 0; i < this.mVariants.size(); i++) {
                if (this.mVariants.get(i).match(f2, f3)) {
                    return i;
                }
            }
            return -1;
        }
    }

    static class Variant {
        int mConstraintID;
        float mMaxHeight;
        float mMaxWidth;
        float mMinHeight;
        float mMinWidth;

        /* access modifiers changed from: package-private */
        public boolean match(float f2, float f3) {
            if (!Float.isNaN(this.mMinWidth) && f2 < this.mMinWidth) {
                return false;
            }
            if (!Float.isNaN(this.mMinHeight) && f3 < this.mMinHeight) {
                return false;
            }
            if (!Float.isNaN(this.mMaxWidth) && f2 > this.mMaxWidth) {
                return false;
            }
            if (Float.isNaN(this.mMaxHeight) || f3 <= this.mMaxHeight) {
                return true;
            }
            return false;
        }
    }
}
