package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdrj implements zzbqd {
    public final /* synthetic */ zzdrk zza;
    public final /* synthetic */ zzbof zzb;

    public /* synthetic */ zzdrj(zzdrk zzdrk, zzbof zzbof) {
        this.zza = zzdrk;
        this.zzb = zzbof;
    }

    public final void zza(Object obj, Map map) {
        zzdrk zzdrk = this.zza;
        zzbof zzbof = this.zzb;
        try {
            zzdrk.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            zze.zzg("Failed to call parse unconfirmedClickTimestamp.");
        }
        zzdrk.zza = (String) map.get(OSOutcomeConstants.OUTCOME_ID);
        String str = (String) map.get("asset_id");
        if (zzbof == null) {
            zze.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzbof.zzf(str);
        } catch (RemoteException e2) {
            zzcho.zzl("#007 Could not call remote method.", e2);
        }
    }
}
