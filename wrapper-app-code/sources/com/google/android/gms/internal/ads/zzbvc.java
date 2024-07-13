package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbvc {
    private final zzbuf zza;
    private zzgfb zzb;

    zzbvc(zzbuf zzbuf) {
        this.zza = zzbuf;
    }

    private final void zzd() {
        if (this.zzb == null) {
            zzcig zzcig = new zzcig();
            this.zzb = zzcig;
            this.zza.zzb((zzapj) null).zzi(new zzbva(zzcig), new zzbvb(zzcig));
        }
    }

    public final zzbvf zza(String str, zzbum zzbum, zzbul zzbul) {
        zzd();
        return new zzbvf(this.zzb, "google.afma.activeView.handleUpdate", zzbum, zzbul);
    }

    public final void zzb(String str, zzbqd zzbqd) {
        zzd();
        this.zzb = zzger.zzn(this.zzb, new zzbuy(str, zzbqd), zzcib.zzf);
    }

    public final void zzc(String str, zzbqd zzbqd) {
        this.zzb = zzger.zzm(this.zzb, new zzbuz(str, zzbqd), zzcib.zzf);
    }
}
