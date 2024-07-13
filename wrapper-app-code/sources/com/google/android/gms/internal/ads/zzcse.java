package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcse implements zzfey {
    private final Context zza;
    private final zzq zzb;
    private final String zzc;
    private final zzcre zzd;
    private final zzcse zze = this;
    private final zzhfc zzf;
    private final zzhfc zzg;
    private final zzhfc zzh;
    private final zzhfc zzi;
    private final zzhfc zzj;
    private final zzhfc zzk;

    /* synthetic */ zzcse(zzcre zzcre, Context context, String str, zzq zzq, zzcsd zzcsd) {
        this.zzd = zzcre;
        this.zza = context;
        this.zzb = zzq;
        this.zzc = str;
        this.zzf = zzheq.zza(context);
        this.zzg = zzheq.zza(zzq);
        this.zzh = zzheo.zzc(new zzesc(this.zzd.zzo));
        this.zzi = zzheo.zzc(zzesh.zza());
        this.zzj = zzheo.zzc(zzdjl.zza());
        zzhfc zzhfc = this.zzf;
        zzcre zzcre2 = this.zzd;
        this.zzk = zzheo.zzc(new zzfew(zzhfc, zzcre2.zzp, this.zzg, zzcre2.zzT, this.zzh, this.zzi, zzfji.zza(), this.zzj));
    }

    public final zzerh zza() {
        zzchu zzd2 = this.zzd.zza.zzd();
        zzhex.zzb(zzd2);
        return new zzerh(this.zza, this.zzb, this.zzc, (zzfev) this.zzk.zzb(), (zzesb) this.zzh.zzb(), zzd2);
    }
}
