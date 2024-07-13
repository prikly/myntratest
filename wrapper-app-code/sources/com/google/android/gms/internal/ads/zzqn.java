package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzqn {
    public static void zza(zzqh zzqh, zzmz zzmz) {
        LogSessionId zza = zzmz.zza();
        if (!zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            zzqh.zzb.setString("log-session-id", zza.getStringId());
        }
    }
}
