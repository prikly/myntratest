package com.github.barteksc.pdfviewer.util;

public class MathUtils {
    public static int ceil(float f2) {
        return ((int) (((double) f2) + 16384.999999999996d)) - 16384;
    }

    public static int floor(float f2) {
        return ((int) (((double) f2) + 16384.0d)) - 16384;
    }

    public static float limit(float f2, float f3, float f4) {
        return f2 <= f3 ? f3 : f2 >= f4 ? f4 : f2;
    }

    public static float max(float f2, float f3) {
        return f2 > f3 ? f3 : f2;
    }

    public static int max(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static int min(int i, int i2) {
        return i < i2 ? i2 : i;
    }
}
