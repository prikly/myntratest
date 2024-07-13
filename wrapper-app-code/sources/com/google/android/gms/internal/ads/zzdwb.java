package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdwb implements zzhep {
    private final zzhfc zza;

    public zzdwb(zzhfc zzhfc) {
        this.zza = zzhfc;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbfg zzbfg;
        if (((zzdee) this.zza).zza().zzo.zza == 3) {
            zzbfg = zzbfg.REWARDED_INTERSTITIAL;
        } else {
            zzbfg = zzbfg.REWARD_BASED_VIDEO_AD;
        }
        zzhex.zzb(zzbfg);
        return zzbfg;
    }
}
