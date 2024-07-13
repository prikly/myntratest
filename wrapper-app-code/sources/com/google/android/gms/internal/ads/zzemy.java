package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzemy implements zzdoe {
    private final Context zza;
    private final zzchu zzb;
    private final zzgfb zzc;
    private final zzfil zzd;
    private final zzcno zze;
    private final zzfjg zzf;
    private final zzbqf zzg;
    private final boolean zzh;

    zzemy(Context context, zzchu zzchu, zzgfb zzgfb, zzfil zzfil, zzcno zzcno, zzfjg zzfjg, boolean z, zzbqf zzbqf) {
        this.zza = context;
        this.zzb = zzchu;
        this.zzc = zzgfb;
        this.zzd = zzfil;
        this.zze = zzcno;
        this.zzf = zzfjg;
        this.zzg = zzbqf;
        this.zzh = z;
    }

    public final void zza(boolean z, Context context, zzdfa zzdfa) {
        zzdmw zzdmw = (zzdmw) zzger.zzq(this.zzc);
        this.zze.zzap(true);
        boolean zze2 = this.zzh ? this.zzg.zze(false) : false;
        zzt.zzp();
        boolean zzE = zzs.zzE(this.zza);
        boolean z2 = this.zzh;
        zzj zzj = new zzj(zze2, zzE, z2 ? this.zzg.zzd() : false, z2 ? this.zzg.zza() : 0.0f, -1, z, this.zzd.zzP, false);
        if (zzdfa != null) {
            zzdfa.zzf();
        }
        zzt.zzi();
        zzdnt zzj2 = zzdmw.zzj();
        zzcno zzcno = this.zze;
        zzfil zzfil = this.zzd;
        int i = zzfil.zzR;
        zzchu zzchu = this.zzb;
        String str = zzfil.zzC;
        zzfiq zzfiq = zzfil.zzt;
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((zza) null, (zzo) zzj2, (zzz) null, zzcno, i, zzchu, str, zzj, zzfiq.zzb, zzfiq.zza, this.zzf.zzf, zzdfa);
        zzm.zza(context, adOverlayInfoParcel, true);
    }
}
