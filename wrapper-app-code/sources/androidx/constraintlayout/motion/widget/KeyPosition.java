package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.utils.ViewSpline;
import java.util.HashMap;

public class KeyPosition extends KeyPositionBase {
    float mAltPercentX = Float.NaN;
    float mAltPercentY = Float.NaN;
    private float mCalculatedPositionX = Float.NaN;
    private float mCalculatedPositionY = Float.NaN;
    int mDrawPath = 0;
    int mPathMotionArc = UNSET;
    float mPercentHeight = Float.NaN;
    float mPercentWidth = Float.NaN;
    float mPercentX = Float.NaN;
    float mPercentY = Float.NaN;
    int mPositionType = 0;
    String mTransitionEasing = null;

    public void addValues(HashMap<String, ViewSpline> hashMap) {
    }

    public KeyPosition() {
        this.mType = 2;
    }

    public Key copy(Key key) {
        super.copy(key);
        KeyPosition keyPosition = (KeyPosition) key;
        this.mTransitionEasing = keyPosition.mTransitionEasing;
        this.mPathMotionArc = keyPosition.mPathMotionArc;
        this.mDrawPath = keyPosition.mDrawPath;
        this.mPercentWidth = keyPosition.mPercentWidth;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = keyPosition.mPercentX;
        this.mPercentY = keyPosition.mPercentY;
        this.mAltPercentX = keyPosition.mAltPercentX;
        this.mAltPercentY = keyPosition.mAltPercentY;
        this.mCalculatedPositionX = keyPosition.mCalculatedPositionX;
        this.mCalculatedPositionY = keyPosition.mCalculatedPositionY;
        return this;
    }

    public Key clone() {
        return new KeyPosition().copy(this);
    }
}
