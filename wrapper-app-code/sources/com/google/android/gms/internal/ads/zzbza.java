package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzbza extends zzbno {
    final /* synthetic */ zzbzd zza;

    /* synthetic */ zzbza(zzbzd zzbzd, zzbyz zzbyz) {
        this.zza = zzbzd;
    }

    public final void zze(zzbnf zzbnf, String str) {
        zzbzd zzbzd = this.zza;
        if (zzbzd.zzb != null) {
            zzbzd.zzb.onCustomClick(zzbzd.zzf(zzbnf), str);
        }
    }
}
