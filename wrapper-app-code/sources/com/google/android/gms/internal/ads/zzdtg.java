package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdtg implements zzgdy {
    public final /* synthetic */ zzgfb zza;

    public /* synthetic */ zzdtg(zzgfb zzgfb) {
        this.zza = zzgfb;
    }

    public final zzgfb zza(Object obj) {
        zzgfb zzgfb = this.zza;
        zzcno zzcno = (zzcno) obj;
        if (zzcno != null && zzcno.zzs() != null) {
            return zzgfb;
        }
        throw new zzeom(1, "Retrieve video view in html5 ad response failed.");
    }
}
