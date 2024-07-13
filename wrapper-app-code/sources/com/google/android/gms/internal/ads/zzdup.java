package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdup implements zzbqd {
    private final zzbnp zza;
    private final zzdve zzb;
    private final zzhej zzc;

    public zzdup(zzdqr zzdqr, zzdqg zzdqg, zzdve zzdve, zzhej zzhej) {
        this.zza = zzdqr.zzc(zzdqg.zzy());
        this.zzb = zzdve;
        this.zzc = zzhej;
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbnf) this.zzc.zzb(), str);
        } catch (RemoteException e2) {
            zze.zzk("Failed to call onCustomClick for asset " + str + ".", e2);
        }
    }

    public final void zzb() {
        if (this.zza != null) {
            this.zzb.zzi("/nativeAdCustomClick", this);
        }
    }
}
