package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzql {
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d2) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d2);
        for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
            if (supportedPerformancePoints.get(i3).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
