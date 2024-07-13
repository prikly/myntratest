package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbco implements Runnable {
    final /* synthetic */ zzbcp zza;

    zzbco(zzbcp zzbcp) {
        this.zza = zzbcp;
    }

    public final void run() {
        synchronized (this.zza.zzc) {
            zzbcp zzbcp = this.zza;
            if (!zzbcp.zzd || !zzbcp.zze) {
                zze.zze("App is still foreground");
            } else {
                zzbcp.zzd = false;
                zze.zze("App went background");
                for (zzbcq zza2 : this.zza.zzf) {
                    try {
                        zza2.zza(false);
                    } catch (Exception e2) {
                        zzcho.zzh("", e2);
                    }
                }
            }
        }
    }
}
