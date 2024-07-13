package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import kotlin.KotlinVersion;

public class ArgbEvaluatorCompat implements TypeEvaluator<Integer> {
    private static final ArgbEvaluatorCompat instance = new ArgbEvaluatorCompat();

    public static ArgbEvaluatorCompat getInstance() {
        return instance;
    }

    public Integer evaluate(float f2, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f3 = ((float) ((intValue >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & KotlinVersion.MAX_COMPONENT_VALUE)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & KotlinVersion.MAX_COMPONENT_VALUE)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)) / 255.0f), 2.2d);
        float pow5 = pow3 + (f2 * (((float) Math.pow((double) (((float) (intValue2 & KotlinVersion.MAX_COMPONENT_VALUE)) / 255.0f), 2.2d)) - pow3));
        return Integer.valueOf((Math.round(((float) Math.pow((double) (pow + ((pow4 - pow) * f2)), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f3 + (((((float) ((intValue2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)) / 255.0f) - f3) * f2)) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (pow2 + ((((float) Math.pow((double) (((float) ((intValue2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE)) / 255.0f), 2.2d)) - pow2) * f2)), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) pow5, 0.45454545454545453d)) * 255.0f));
    }
}
