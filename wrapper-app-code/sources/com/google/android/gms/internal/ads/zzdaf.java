package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdaf {
    private final zzdhc zza;
    private final zzdjj zzb;

    public zzdaf(zzdhc zzdhc, zzdjj zzdjj) {
        this.zza = zzdhc;
        this.zzb = zzdjj;
    }

    public final zzdhc zza() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final zzdjj zzb() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final zzdlu zzc() {
        zzdjj zzdjj = this.zzb;
        if (zzdjj != null) {
            return new zzdlu(zzdjj, zzcib.zzf);
        }
        return new zzdlu(new zzdae(this), zzcib.zzf);
    }
}
