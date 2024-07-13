package androidx.core.graphics;

import android.graphics.Color;
import kotlin.KotlinVersion;

public final class ColorUtils {
    private static final ThreadLocal<double[]> TEMP_ARRAY = new ThreadLocal<>();

    private static int constrain(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static int compositeColors(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int compositeAlpha = compositeAlpha(alpha2, alpha);
        return Color.argb(compositeAlpha, compositeComponent(Color.red(i), alpha2, Color.red(i2), alpha, compositeAlpha), compositeComponent(Color.green(i), alpha2, Color.green(i2), alpha, compositeAlpha), compositeComponent(Color.blue(i), alpha2, Color.blue(i2), alpha, compositeAlpha));
    }

    private static int compositeAlpha(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / KotlinVersion.MAX_COMPONENT_VALUE);
    }

    private static int compositeComponent(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * KotlinVersion.MAX_COMPONENT_VALUE) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static int setAlphaComponent(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static int XYZToColor(double d2, double d3, double d4) {
        double d5 = (((3.2406d * d2) + (-1.5372d * d3)) + (-0.4986d * d4)) / 100.0d;
        double d6 = (((-0.9689d * d2) + (1.8758d * d3)) + (0.0415d * d4)) / 100.0d;
        double d7 = (((0.0557d * d2) + (-0.204d * d3)) + (1.057d * d4)) / 100.0d;
        return Color.rgb(constrain((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE), constrain((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE), constrain((int) Math.round((d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d) * 255.0d), 0, KotlinVersion.MAX_COMPONENT_VALUE));
    }
}
