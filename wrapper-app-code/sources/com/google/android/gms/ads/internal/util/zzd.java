package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzchn;
import com.google.android.gms.internal.ads.zzcie;
import com.google.android.gms.internal.ads.zzgfb;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzd {
    public static void zza(Context context) {
        if (zzchn.zzk(context) && !zzchn.zzm()) {
            zzgfb zzb = new zzc(context).zzb();
            zze.zzi("Updating ad debug logging enablement.");
            zzcie.zza(zzb, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
