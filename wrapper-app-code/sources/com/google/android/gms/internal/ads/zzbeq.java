package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbeq implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbei zza;
    final /* synthetic */ zzcig zzb;
    final /* synthetic */ zzbes zzc;

    zzbeq(zzbes zzbes, zzbei zzbei, zzcig zzcig) {
        this.zzc = zzbes;
        this.zza = zzbei;
        this.zzb = zzcig;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc.zzd) {
            zzbes zzbes = this.zzc;
            if (!zzbes.zzb) {
                zzbes.zzb = true;
                zzbeh zza2 = this.zzc.zza;
                if (zza2 != null) {
                    zzgfb zza3 = zzcib.zza.zza(new zzben(this, zza2, this.zza, this.zzb));
                    zzcig zzcig = this.zzb;
                    zzcig.zzc(new zzbeo(zzcig, zza3), zzcib.zzf);
                }
            }
        }
    }

    public final void onConnectionSuspended(int i) {
    }
}
