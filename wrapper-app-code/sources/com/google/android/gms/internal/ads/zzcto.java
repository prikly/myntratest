package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzag;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import com.google.android.gms.ads.nonagon.signalgeneration.zzh;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcto implements zzg {
    private final zzcre zza;
    private zzddz zzb;
    private zzag zzc;

    /* synthetic */ zzcto(zzcre zzcre, zzctn zzctn) {
        this.zza = zzcre;
    }

    public final /* synthetic */ zzg zza(zzddz zzddz) {
        this.zzb = zzddz;
        return this;
    }

    public final /* synthetic */ zzg zzb(zzag zzag) {
        this.zzc = zzag;
        return this;
    }

    public final zzh zzc() {
        zzhex.zzc(this.zzb, zzddz.class);
        zzhex.zzc(this.zzc, zzag.class);
        return new zzctq(this.zza, this.zzc, new zzdbw(), new zzdzu(), this.zzb, (zzfgg) null, (zzffh) null, (zzctp) null);
    }
}
