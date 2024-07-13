package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import io.bidmachine.utils.IabUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {
    static String[] names = {"position", "x", "y", IabUtils.KEY_WIDTH, IabUtils.KEY_HEIGHT, "pathRotate"};
    private float alpha = 1.0f;
    private boolean applyElevation = false;
    LinkedHashMap<String, ConstraintAttribute> attributes = new LinkedHashMap<>();
    private float elevation = 0.0f;
    private float height;
    private int mAnimateRelativeTo = -1;
    private int mDrawPath = 0;
    private Easing mKeyFrameEasing;
    int mMode = 0;
    private float mPathRotate = Float.NaN;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float mProgress = Float.NaN;
    double[] mTempDelta = new double[18];
    double[] mTempValue = new double[18];
    int mVisibilityMode = 0;
    private float position;
    private float rotation = 0.0f;
    private float rotationX = 0.0f;
    public float rotationY = 0.0f;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float translationX = 0.0f;
    private float translationY = 0.0f;
    private float translationZ = 0.0f;
    int visibility;
    private float width;
    private float x;
    private float y;

    private boolean diff(float f2, float f3) {
        if (Float.isNaN(f2) || Float.isNaN(f3)) {
            if (Float.isNaN(f2) != Float.isNaN(f3)) {
                return true;
            }
            return false;
        } else if (Math.abs(f2 - f3) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void different(MotionConstrainedPoint motionConstrainedPoint, HashSet<String> hashSet) {
        if (diff(this.alpha, motionConstrainedPoint.alpha)) {
            hashSet.add("alpha");
        }
        if (diff(this.elevation, motionConstrainedPoint.elevation)) {
            hashSet.add("elevation");
        }
        int i = this.visibility;
        int i2 = motionConstrainedPoint.visibility;
        if (i != i2 && this.mVisibilityMode == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (diff(this.rotation, motionConstrainedPoint.rotation)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.mPathRotate) || !Float.isNaN(motionConstrainedPoint.mPathRotate)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.mProgress) || !Float.isNaN(motionConstrainedPoint.mProgress)) {
            hashSet.add("progress");
        }
        if (diff(this.rotationX, motionConstrainedPoint.rotationX)) {
            hashSet.add("rotationX");
        }
        if (diff(this.rotationY, motionConstrainedPoint.rotationY)) {
            hashSet.add("rotationY");
        }
        if (diff(this.mPivotX, motionConstrainedPoint.mPivotX)) {
            hashSet.add("transformPivotX");
        }
        if (diff(this.mPivotY, motionConstrainedPoint.mPivotY)) {
            hashSet.add("transformPivotY");
        }
        if (diff(this.scaleX, motionConstrainedPoint.scaleX)) {
            hashSet.add("scaleX");
        }
        if (diff(this.scaleY, motionConstrainedPoint.scaleY)) {
            hashSet.add("scaleY");
        }
        if (diff(this.translationX, motionConstrainedPoint.translationX)) {
            hashSet.add("translationX");
        }
        if (diff(this.translationY, motionConstrainedPoint.translationY)) {
            hashSet.add("translationY");
        }
        if (diff(this.translationZ, motionConstrainedPoint.translationZ)) {
            hashSet.add("translationZ");
        }
    }

    /* access modifiers changed from: package-private */
    public void setBounds(float f2, float f3, float f4, float f5) {
        this.x = f2;
        this.y = f3;
        this.width = f4;
        this.height = f5;
    }

    public int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        return Float.compare(this.position, motionConstrainedPoint.position);
    }

    public void applyParameters(View view) {
        this.visibility = view.getVisibility();
        this.alpha = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.applyElevation = false;
        if (Build.VERSION.SDK_INT >= 21) {
            this.elevation = view.getElevation();
        }
        this.rotation = view.getRotation();
        this.rotationX = view.getRotationX();
        this.rotationY = view.getRotationY();
        this.scaleX = view.getScaleX();
        this.scaleY = view.getScaleY();
        this.mPivotX = view.getPivotX();
        this.mPivotY = view.getPivotY();
        this.translationX = view.getTranslationX();
        this.translationY = view.getTranslationY();
        if (Build.VERSION.SDK_INT >= 21) {
            this.translationZ = view.getTranslationZ();
        }
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        float f2;
        this.mVisibilityMode = constraint.propertySet.mVisibilityMode;
        this.visibility = constraint.propertySet.visibility;
        if (constraint.propertySet.visibility == 0 || this.mVisibilityMode != 0) {
            f2 = constraint.propertySet.alpha;
        } else {
            f2 = 0.0f;
        }
        this.alpha = f2;
        this.applyElevation = constraint.transform.applyElevation;
        this.elevation = constraint.transform.elevation;
        this.rotation = constraint.transform.rotation;
        this.rotationX = constraint.transform.rotationX;
        this.rotationY = constraint.transform.rotationY;
        this.scaleX = constraint.transform.scaleX;
        this.scaleY = constraint.transform.scaleY;
        this.mPivotX = constraint.transform.transformPivotX;
        this.mPivotY = constraint.transform.transformPivotY;
        this.translationX = constraint.transform.translationX;
        this.translationY = constraint.transform.translationY;
        this.translationZ = constraint.transform.translationZ;
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        this.mPathRotate = constraint.motion.mPathRotate;
        this.mDrawPath = constraint.motion.mDrawPath;
        this.mAnimateRelativeTo = constraint.motion.mAnimateRelativeTo;
        this.mProgress = constraint.propertySet.mProgress;
        for (String next : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(next);
            if (constraintAttribute.isContinuous()) {
                this.attributes.put(next, constraintAttribute);
            }
        }
    }

    public void addValues(HashMap<String, ViewSpline> hashMap, int i) {
        for (String next : hashMap.keySet()) {
            ViewSpline viewSpline = hashMap.get(next);
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
                        c2 = 11;
                        break;
                    }
                    break;
                case -1225497656:
                    if (next.equals("translationY")) {
                        c2 = 12;
                        break;
                    }
                    break;
                case -1225497655:
                    if (next.equals("translationZ")) {
                        c2 = 13;
                        break;
                    }
                    break;
                case -1001078227:
                    if (next.equals("progress")) {
                        c2 = 8;
                        break;
                    }
                    break;
                case -908189618:
                    if (next.equals("scaleX")) {
                        c2 = 9;
                        break;
                    }
                    break;
                case -908189617:
                    if (next.equals("scaleY")) {
                        c2 = 10;
                        break;
                    }
                    break;
                case -760884510:
                    if (next.equals("transformPivotX")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -760884509:
                    if (next.equals("transformPivotY")) {
                        c2 = 6;
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
                        c2 = 7;
                        break;
                    }
                    break;
                case 92909918:
                    if (next.equals("alpha")) {
                        c2 = 0;
                        break;
                    }
                    break;
            }
            float f2 = 1.0f;
            float f3 = 0.0f;
            switch (c2) {
                case 0:
                    if (!Float.isNaN(this.alpha)) {
                        f2 = this.alpha;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case 1:
                    if (!Float.isNaN(this.elevation)) {
                        f3 = this.elevation;
                    }
                    viewSpline.setPoint(i, f3);
                    break;
                case 2:
                    if (!Float.isNaN(this.rotation)) {
                        f3 = this.rotation;
                    }
                    viewSpline.setPoint(i, f3);
                    break;
                case 3:
                    if (!Float.isNaN(this.rotationX)) {
                        f3 = this.rotationX;
                    }
                    viewSpline.setPoint(i, f3);
                    break;
                case 4:
                    if (!Float.isNaN(this.rotationY)) {
                        f3 = this.rotationY;
                    }
                    viewSpline.setPoint(i, f3);
                    break;
                case 5:
                    if (!Float.isNaN(this.mPivotX)) {
                        f3 = this.mPivotX;
                    }
                    viewSpline.setPoint(i, f3);
                    break;
                case 6:
                    if (!Float.isNaN(this.mPivotY)) {
                        f3 = this.mPivotY;
                    }
                    viewSpline.setPoint(i, f3);
                    break;
                case 7:
                    if (!Float.isNaN(this.mPathRotate)) {
                        f3 = this.mPathRotate;
                    }
                    viewSpline.setPoint(i, f3);
                    break;
                case 8:
                    if (!Float.isNaN(this.mProgress)) {
                        f3 = this.mProgress;
                    }
                    viewSpline.setPoint(i, f3);
                    break;
                case 9:
                    if (!Float.isNaN(this.scaleX)) {
                        f2 = this.scaleX;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case 10:
                    if (!Float.isNaN(this.scaleY)) {
                        f2 = this.scaleY;
                    }
                    viewSpline.setPoint(i, f2);
                    break;
                case 11:
                    if (!Float.isNaN(this.translationX)) {
                        f3 = this.translationX;
                    }
                    viewSpline.setPoint(i, f3);
                    break;
                case 12:
                    if (!Float.isNaN(this.translationY)) {
                        f3 = this.translationY;
                    }
                    viewSpline.setPoint(i, f3);
                    break;
                case 13:
                    if (!Float.isNaN(this.translationZ)) {
                        f3 = this.translationZ;
                    }
                    viewSpline.setPoint(i, f3);
                    break;
                default:
                    if (!next.startsWith("CUSTOM")) {
                        Log.e("MotionPaths", "UNKNOWN spline " + next);
                        break;
                    } else {
                        String str = next.split(",")[1];
                        if (!this.attributes.containsKey(str)) {
                            break;
                        } else {
                            ConstraintAttribute constraintAttribute = this.attributes.get(str);
                            if (!(viewSpline instanceof ViewSpline.CustomSet)) {
                                Log.e("MotionPaths", next + " ViewSpline not a CustomSet frame = " + i + ", value" + constraintAttribute.getValueToInterpolate() + viewSpline);
                                break;
                            } else {
                                ((ViewSpline.CustomSet) viewSpline).setPoint(i, constraintAttribute);
                                break;
                            }
                        }
                    }
            }
        }
    }

    public void setState(View view) {
        setBounds(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        applyParameters(view);
    }

    public void setState(Rect rect, View view, int i, float f2) {
        setBounds((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        applyParameters(view);
        this.mPivotX = Float.NaN;
        this.mPivotY = Float.NaN;
        if (i == 1) {
            this.rotation = f2 - 90.0f;
        } else if (i == 2) {
            this.rotation = f2 + 90.0f;
        }
    }

    public void setState(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        setBounds((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
        applyParameters(constraintSet.getParameters(i2));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f2 = this.rotation + 90.0f;
            this.rotation = f2;
            if (f2 > 180.0f) {
                this.rotation = f2 - 360.0f;
                return;
            }
            return;
        }
        this.rotation -= 90.0f;
    }
}
