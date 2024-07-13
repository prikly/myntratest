package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcss implements zzeaq {
    /* access modifiers changed from: private */
    public final Context zza;
    private final zzbra zzb;
    private final zzcre zzc;
    private final zzcss zzd = this;
    private final zzhfc zze;
    private final zzhfc zzf;
    private final zzhfc zzg;
    private final zzhfc zzh;

    /* synthetic */ zzcss(zzcre zzcre, Context context, zzbra zzbra, zzcsr zzcsr) {
        this.zzc = zzcre;
        this.zza = context;
        this.zzb = zzbra;
        this.zze = zzheq.zza(this);
        zzhep zza2 = zzheq.zza(zzbra);
        this.zzf = zza2;
        zzeam zzeam = new zzeam(zza2);
        this.zzg = zzeam;
        this.zzh = zzheo.zzc(new zzeao(this.zze, zzeam));
    }

    public final zzeah zzb() {
        return new zzcsm(this.zzc, this.zzd, (zzcsl) null);
    }

    public final zzean zzd() {
        return (zzean) this.zzh.zzb();
    }
}
