package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzerg implements zzesq {
    final /* synthetic */ zzerh zza;

    zzerg(zzerh zzerh) {
        this.zza = zzerh;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcyl zzcyl = (zzcyl) obj;
        synchronized (this.zza) {
            zzerh zzerh = this.zza;
            if (zzerh.zzh != null) {
                zzerh.zzh.zzaa();
            }
            this.zza.zzh = zzcyl;
            this.zza.zzh.zzab();
        }
    }
}
