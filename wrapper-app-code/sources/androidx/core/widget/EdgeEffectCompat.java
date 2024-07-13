package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.core.os.BuildCompat;

public final class EdgeEffectCompat {
    public static EdgeEffect create(Context context, AttributeSet attributeSet) {
        if (BuildCompat.isAtLeastS()) {
            return Api31Impl.create(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static float getDistance(EdgeEffect edgeEffect) {
        if (BuildCompat.isAtLeastS()) {
            return Api31Impl.getDistance(edgeEffect);
        }
        return 0.0f;
    }

    public static void onPull(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f2, f3);
        } else {
            edgeEffect.onPull(f2);
        }
    }

    public static float onPullDistance(EdgeEffect edgeEffect, float f2, float f3) {
        if (BuildCompat.isAtLeastS()) {
            return Api31Impl.onPullDistance(edgeEffect, f2, f3);
        }
        onPull(edgeEffect, f2, f3);
        return f2;
    }

    private static class Api31Impl {
        public static EdgeEffect create(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float onPullDistance(EdgeEffect edgeEffect, float f2, float f3) {
            try {
                return edgeEffect.onPullDistance(f2, f3);
            } catch (Throwable unused) {
                edgeEffect.onPull(f2, f3);
                return 0.0f;
            }
        }

        public static float getDistance(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }
    }
}
