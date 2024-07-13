package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdta implements zzgdy {
    public final /* synthetic */ zzgfb zza;

    public /* synthetic */ zzdta(zzgfb zzgfb) {
        this.zza = zzgfb;
    }

    public final zzgfb zza(Object obj) {
        zzgfb zzgfb = this.zza;
        if (((zzcno) obj) != null) {
            return zzgfb;
        }
        throw new zzeom(1, "Retrieve Web View from image ad response failed.");
    }
}
