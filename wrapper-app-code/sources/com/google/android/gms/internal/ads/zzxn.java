package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzxn {
    public static void zza(Surface surface, float f2) {
        try {
            surface.setFrameRate(f2, f2 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e2) {
            zzdw.zzc("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
        }
    }
}
