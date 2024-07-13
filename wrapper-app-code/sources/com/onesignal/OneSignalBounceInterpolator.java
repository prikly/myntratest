package com.onesignal;

import android.view.animation.Interpolator;

class OneSignalBounceInterpolator implements Interpolator {
    private double mAmplitude = 1.0d;
    private double mFrequency = 10.0d;

    OneSignalBounceInterpolator(double d2, double d3) {
        this.mAmplitude = d2;
        this.mFrequency = d3;
    }

    public float getInterpolation(float f2) {
        return (float) ((Math.pow(2.718281828459045d, ((double) (-f2)) / this.mAmplitude) * -1.0d * Math.cos(this.mFrequency * ((double) f2))) + 1.0d);
    }
}
