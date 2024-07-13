package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfwz extends zzfwv {
    final /* synthetic */ zzfxf zza;

    zzfwz(zzfxf zzfxf) {
        this.zza = zzfxf;
    }

    public final void zza() {
        zzfxf zzfxf = this.zza;
        if (zzfxf.zzn != null) {
            zzfxf.zzc.zzd("Unbind from service.", new Object[0]);
            zzfxf zzfxf2 = this.zza;
            zzfxf2.zzb.unbindService(zzfxf2.zzm);
            this.zza.zzh = false;
            this.zza.zzn = null;
            this.zza.zzm = null;
        }
        this.zza.zzt();
    }
}
