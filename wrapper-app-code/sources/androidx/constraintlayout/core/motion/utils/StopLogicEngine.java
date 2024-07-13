package androidx.constraintlayout.core.motion.utils;

public class StopLogicEngine implements StopEngine {
    private boolean mBackwards = false;
    private boolean mDone = false;
    private float mLastPosition;
    private int mNumberOfStages;
    private float mStage1Duration;
    private float mStage1EndPosition;
    private float mStage1Velocity;
    private float mStage2Duration;
    private float mStage2EndPosition;
    private float mStage2Velocity;
    private float mStage3Duration;
    private float mStage3EndPosition;
    private float mStage3Velocity;
    private float mStartPosition;
    private String mType;

    public float getVelocity(float f2) {
        float f3 = this.mStage1Duration;
        if (f2 <= f3) {
            float f4 = this.mStage1Velocity;
            return f4 + (((this.mStage2Velocity - f4) * f2) / f3);
        }
        int i = this.mNumberOfStages;
        if (i == 1) {
            return 0.0f;
        }
        float f5 = f2 - f3;
        float f6 = this.mStage2Duration;
        if (f5 < f6) {
            float f7 = this.mStage2Velocity;
            return f7 + (((this.mStage3Velocity - f7) * f5) / f6);
        } else if (i == 2) {
            return this.mStage2EndPosition;
        } else {
            float f8 = f5 - f6;
            float f9 = this.mStage3Duration;
            if (f8 >= f9) {
                return this.mStage3EndPosition;
            }
            float f10 = this.mStage3Velocity;
            return f10 - ((f8 * f10) / f9);
        }
    }

    private float calcY(float f2) {
        this.mDone = false;
        float f3 = this.mStage1Duration;
        if (f2 <= f3) {
            float f4 = this.mStage1Velocity;
            return (f4 * f2) + ((((this.mStage2Velocity - f4) * f2) * f2) / (f3 * 2.0f));
        }
        int i = this.mNumberOfStages;
        if (i == 1) {
            return this.mStage1EndPosition;
        }
        float f5 = f2 - f3;
        float f6 = this.mStage2Duration;
        if (f5 < f6) {
            float f7 = this.mStage1EndPosition;
            float f8 = this.mStage2Velocity;
            return f7 + (f8 * f5) + ((((this.mStage3Velocity - f8) * f5) * f5) / (f6 * 2.0f));
        } else if (i == 2) {
            return this.mStage2EndPosition;
        } else {
            float f9 = f5 - f6;
            float f10 = this.mStage3Duration;
            if (f9 <= f10) {
                float f11 = this.mStage2EndPosition;
                float f12 = this.mStage3Velocity;
                return (f11 + (f12 * f9)) - (((f12 * f9) * f9) / (f10 * 2.0f));
            }
            this.mDone = true;
            return this.mStage3EndPosition;
        }
    }

    public void config(float f2, float f3, float f4, float f5, float f6, float f7) {
        boolean z = false;
        this.mDone = false;
        this.mStartPosition = f2;
        if (f2 > f3) {
            z = true;
        }
        this.mBackwards = z;
        if (z) {
            setup(-f4, f2 - f3, f6, f7, f5);
            return;
        }
        setup(f4, f3 - f2, f6, f7, f5);
    }

    public float getInterpolation(float f2) {
        float calcY = calcY(f2);
        this.mLastPosition = f2;
        return this.mBackwards ? this.mStartPosition - calcY : this.mStartPosition + calcY;
    }

    public float getVelocity() {
        return this.mBackwards ? -getVelocity(this.mLastPosition) : getVelocity(this.mLastPosition);
    }

    public boolean isStopped() {
        return getVelocity() < 1.0E-5f && Math.abs(this.mStage3EndPosition - this.mLastPosition) < 1.0E-5f;
    }

    private void setup(float f2, float f3, float f4, float f5, float f6) {
        this.mDone = false;
        if (f2 == 0.0f) {
            f2 = 1.0E-4f;
        }
        this.mStage1Velocity = f2;
        float f7 = f2 / f4;
        float f8 = (f7 * f2) / 2.0f;
        if (f2 < 0.0f) {
            float sqrt = (float) Math.sqrt((double) ((f3 - ((((-f2) / f4) * f2) / 2.0f)) * f4));
            if (sqrt < f5) {
                this.mType = "backward accelerate, decelerate";
                this.mNumberOfStages = 2;
                this.mStage1Velocity = f2;
                this.mStage2Velocity = sqrt;
                this.mStage3Velocity = 0.0f;
                float f9 = (sqrt - f2) / f4;
                this.mStage1Duration = f9;
                this.mStage2Duration = sqrt / f4;
                this.mStage1EndPosition = ((f2 + sqrt) * f9) / 2.0f;
                this.mStage2EndPosition = f3;
                this.mStage3EndPosition = f3;
                return;
            }
            this.mType = "backward accelerate cruse decelerate";
            this.mNumberOfStages = 3;
            this.mStage1Velocity = f2;
            this.mStage2Velocity = f5;
            this.mStage3Velocity = f5;
            float f10 = (f5 - f2) / f4;
            this.mStage1Duration = f10;
            float f11 = f5 / f4;
            this.mStage3Duration = f11;
            float f12 = ((f2 + f5) * f10) / 2.0f;
            float f13 = (f11 * f5) / 2.0f;
            this.mStage2Duration = ((f3 - f12) - f13) / f5;
            this.mStage1EndPosition = f12;
            this.mStage2EndPosition = f3 - f13;
            this.mStage3EndPosition = f3;
        } else if (f8 >= f3) {
            this.mType = "hard stop";
            this.mNumberOfStages = 1;
            this.mStage1Velocity = f2;
            this.mStage2Velocity = 0.0f;
            this.mStage1EndPosition = f3;
            this.mStage1Duration = (2.0f * f3) / f2;
        } else {
            float f14 = f3 - f8;
            float f15 = f14 / f2;
            if (f15 + f7 < f6) {
                this.mType = "cruse decelerate";
                this.mNumberOfStages = 2;
                this.mStage1Velocity = f2;
                this.mStage2Velocity = f2;
                this.mStage3Velocity = 0.0f;
                this.mStage1EndPosition = f14;
                this.mStage2EndPosition = f3;
                this.mStage1Duration = f15;
                this.mStage2Duration = f7;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) ((f4 * f3) + ((f2 * f2) / 2.0f)));
            float f16 = (sqrt2 - f2) / f4;
            this.mStage1Duration = f16;
            float f17 = sqrt2 / f4;
            this.mStage2Duration = f17;
            if (sqrt2 < f5) {
                this.mType = "accelerate decelerate";
                this.mNumberOfStages = 2;
                this.mStage1Velocity = f2;
                this.mStage2Velocity = sqrt2;
                this.mStage3Velocity = 0.0f;
                this.mStage1Duration = f16;
                this.mStage2Duration = f17;
                this.mStage1EndPosition = ((f2 + sqrt2) * f16) / 2.0f;
                this.mStage2EndPosition = f3;
                return;
            }
            this.mType = "accelerate cruse decelerate";
            this.mNumberOfStages = 3;
            this.mStage1Velocity = f2;
            this.mStage2Velocity = f5;
            this.mStage3Velocity = f5;
            float f18 = (f5 - f2) / f4;
            this.mStage1Duration = f18;
            float f19 = f5 / f4;
            this.mStage3Duration = f19;
            float f20 = ((f2 + f5) * f18) / 2.0f;
            float f21 = (f19 * f5) / 2.0f;
            this.mStage2Duration = ((f3 - f20) - f21) / f5;
            this.mStage1EndPosition = f20;
            this.mStage2EndPosition = f3 - f21;
            this.mStage3EndPosition = f3;
        }
    }
}
