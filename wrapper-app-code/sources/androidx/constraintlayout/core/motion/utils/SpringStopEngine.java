package androidx.constraintlayout.core.motion.utils;

public class SpringStopEngine implements StopEngine {
    private int mBoundaryMode = 0;
    double mDamping = 0.5d;
    private boolean mInitialized = false;
    private float mLastTime;
    private double mLastVelocity;
    private float mMass;
    private float mPos;
    private double mStiffness;
    private float mStopThreshold;
    private double mTargetPos;
    private float mV;

    public float getVelocity() {
        return 0.0f;
    }

    public void springConfig(float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        this.mTargetPos = (double) f3;
        this.mDamping = (double) f7;
        this.mInitialized = false;
        this.mPos = f2;
        this.mLastVelocity = (double) f4;
        this.mStiffness = (double) f6;
        this.mMass = f5;
        this.mStopThreshold = f8;
        this.mBoundaryMode = i;
        this.mLastTime = 0.0f;
    }

    public float getInterpolation(float f2) {
        compute((double) (f2 - this.mLastTime));
        this.mLastTime = f2;
        return this.mPos;
    }

    public boolean isStopped() {
        double d2 = ((double) this.mPos) - this.mTargetPos;
        double d3 = this.mStiffness;
        double d4 = (double) this.mV;
        return Math.sqrt((((d4 * d4) * ((double) this.mMass)) + ((d3 * d2) * d2)) / d3) <= ((double) this.mStopThreshold);
    }

    private void compute(double d2) {
        double d3 = this.mStiffness;
        double d4 = this.mDamping;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d3 / ((double) this.mMass)) * d2) * 4.0d)) + 1.0d);
        double d5 = d2 / ((double) sqrt);
        int i = 0;
        while (i < sqrt) {
            float f2 = this.mPos;
            double d6 = this.mTargetPos;
            float f3 = this.mV;
            double d7 = d3;
            float f4 = this.mMass;
            double d8 = d4;
            double d9 = ((double) f3) + ((((((-d3) * (((double) f2) - d6)) - (((double) f3) * d4)) / ((double) f4)) * d5) / 2.0d);
            double d10 = ((((-((((double) f2) + ((d5 * d9) / 2.0d)) - d6)) * d7) - (d9 * d8)) / ((double) f4)) * d5;
            float f5 = (float) (((double) f3) + d10);
            this.mV = f5;
            float f6 = (float) (((double) f2) + ((((double) f3) + (d10 / 2.0d)) * d5));
            this.mPos = f6;
            int i2 = this.mBoundaryMode;
            if (i2 > 0) {
                if (f6 < 0.0f && (i2 & 1) == 1) {
                    this.mPos = -f6;
                    this.mV = -f5;
                }
                float f7 = this.mPos;
                if (f7 > 1.0f && (this.mBoundaryMode & 2) == 2) {
                    this.mPos = 2.0f - f7;
                    this.mV = -this.mV;
                }
            }
            i++;
            d3 = d7;
            d4 = d8;
        }
    }
}
