package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzoe {
    public static void zza(AudioTrack audioTrack, zzmz zzmz) {
        LogSessionId zza = zzmz.zza();
        if (!zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            audioTrack.setLogSessionId(zza);
        }
    }
}
