package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import kotlin.KotlinVersion;

public class ElevationOverlayProvider {
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(Context context) {
        this.elevationOverlayEnabled = MaterialAttributes.resolveBoolean(context, R.attr.elevationOverlayEnabled, false);
        this.elevationOverlayColor = MaterialColors.getColor(context, R.attr.elevationOverlayColor, 0);
        this.colorSurface = MaterialColors.getColor(context, R.attr.colorSurface, 0);
        this.displayDensity = context.getResources().getDisplayMetrics().density;
    }

    public int compositeOverlayIfNeeded(int i, float f2) {
        return (!this.elevationOverlayEnabled || !isThemeSurfaceColor(i)) ? i : compositeOverlay(i, f2);
    }

    public int compositeOverlay(int i, float f2) {
        float calculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f2);
        return ColorUtils.setAlphaComponent(MaterialColors.layer(ColorUtils.setAlphaComponent(i, KotlinVersion.MAX_COMPONENT_VALUE), this.elevationOverlayColor, calculateOverlayAlphaFraction), Color.alpha(i));
    }

    public float calculateOverlayAlphaFraction(float f2) {
        float f3 = this.displayDensity;
        if (f3 <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f2 / f3))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    private boolean isThemeSurfaceColor(int i) {
        return ColorUtils.setAlphaComponent(i, KotlinVersion.MAX_COMPONENT_VALUE) == this.colorSurface;
    }
}
