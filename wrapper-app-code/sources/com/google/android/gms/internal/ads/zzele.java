package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzele implements zzdoe {
    private final zzchu zza;
    private final zzgfb zzb;
    private final zzfil zzc;
    private final zzcno zzd;
    private final zzfjg zze;
    private final zzbqf zzf;
    private final boolean zzg;

    zzele(zzchu zzchu, zzgfb zzgfb, zzfil zzfil, zzcno zzcno, zzfjg zzfjg, boolean z, zzbqf zzbqf) {
        this.zza = zzchu;
        this.zzb = zzgfb;
        this.zzc = zzfil;
        this.zzd = zzcno;
        this.zze = zzfjg;
        this.zzg = z;
        this.zzf = zzbqf;
    }

    public final void zza(boolean z, Context context, zzdfa zzdfa) {
        int i;
        zzcxv zzcxv = (zzcxv) zzger.zzq(this.zzb);
        this.zzd.zzap(true);
        boolean zze2 = this.zzg ? this.zzf.zze(true) : true;
        boolean z2 = this.zzg;
        zzj zzj = new zzj(zze2, true, z2 ? this.zzf.zzd() : false, z2 ? this.zzf.zza() : 0.0f, -1, z, this.zzc.zzP, false);
        if (zzdfa != null) {
            zzdfa.zzf();
        }
        zzt.zzi();
        zzdnt zzg2 = zzcxv.zzg();
        zzcno zzcno = this.zzd;
        int i2 = this.zzc.zzR;
        if (i2 == -1) {
            zzw zzw = this.zze.zzj;
            if (zzw != null) {
                int i3 = zzw.zza;
                if (i3 == 1) {
                    i = 7;
                } else if (i3 == 2) {
                    i = 6;
                }
                zzchu zzchu = this.zza;
                zzfil zzfil = this.zzc;
                String str = zzfil.zzC;
                zzfiq zzfiq = zzfil.zzt;
                AdOverlayInfoParcel adOverlayInfoParcel = r4;
                AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((zza) null, (zzo) zzg2, (zzz) null, zzcno, i, zzchu, str, zzj, zzfiq.zzb, zzfiq.zza, this.zze.zzf, zzdfa);
                zzm.zza(context, adOverlayInfoParcel, true);
            }
            zze.zze("Error setting app open orientation; no targeting orientation available.");
            i2 = this.zzc.zzR;
        }
        i = i2;
        zzchu zzchu2 = this.zza;
        zzfil zzfil2 = this.zzc;
        String str2 = zzfil2.zzC;
        zzfiq zzfiq2 = zzfil2.zzt;
        AdOverlayInfoParcel adOverlayInfoParcel3 = adOverlayInfoParcel2;
        AdOverlayInfoParcel adOverlayInfoParcel22 = new AdOverlayInfoParcel((zza) null, (zzo) zzg2, (zzz) null, zzcno, i, zzchu2, str2, zzj, zzfiq2.zzb, zzfiq2.zza, this.zze.zzf, zzdfa);
        zzm.zza(context, adOverlayInfoParcel3, true);
    }
}
