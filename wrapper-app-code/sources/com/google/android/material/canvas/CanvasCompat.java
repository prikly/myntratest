package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.os.Build;

public class CanvasCompat {
    public static int saveLayerAlpha(Canvas canvas, float f2, float f3, float f4, float f5, int i) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f2, f3, f4, f5, i);
        }
        return canvas.saveLayerAlpha(f2, f3, f4, f5, i, 31);
    }
}
