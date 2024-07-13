package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzbon extends zzbno {
    final /* synthetic */ zzboq zza;

    /* synthetic */ zzbon(zzboq zzboq, zzbom zzbom) {
        this.zza = zzboq;
    }

    public final void zze(zzbnf zzbnf, String str) {
        zzboq zzboq = this.zza;
        if (zzboq.zzb != null) {
            zzboq.zzb.onCustomClick(zzboq.zzf(zzbnf), str);
        }
    }
}
