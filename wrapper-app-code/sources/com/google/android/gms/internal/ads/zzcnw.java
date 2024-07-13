package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzcnw implements zzfyu {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzcpd zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ zzapj zzf;
    public final /* synthetic */ zzbki zzg;
    public final /* synthetic */ zzchu zzh;
    public final /* synthetic */ zzl zzi;
    public final /* synthetic */ zza zzj;
    public final /* synthetic */ zzbew zzk;
    public final /* synthetic */ zzfil zzl;
    public final /* synthetic */ zzfio zzm;

    public /* synthetic */ zzcnw(Context context, zzcpd zzcpd, String str, boolean z, boolean z2, zzapj zzapj, zzbki zzbki, zzchu zzchu, zzbjy zzbjy, zzl zzl2, zza zza2, zzbew zzbew, zzfil zzfil, zzfio zzfio) {
        this.zza = context;
        this.zzb = zzcpd;
        this.zzc = str;
        this.zzd = z;
        this.zze = z2;
        this.zzf = zzapj;
        this.zzg = zzbki;
        this.zzh = zzchu;
        this.zzi = zzl2;
        this.zzj = zza2;
        this.zzk = zzbew;
        this.zzl = zzfil;
        this.zzm = zzfio;
    }

    public final Object zza() {
        Context context = this.zza;
        zzcpd zzcpd = this.zzb;
        String str = this.zzc;
        boolean z = this.zzd;
        boolean z2 = this.zze;
        zzapj zzapj = this.zzf;
        zzbki zzbki = this.zzg;
        zzchu zzchu = this.zzh;
        zzl zzl2 = this.zzi;
        zza zza2 = this.zzj;
        zzbew zzbew = this.zzk;
        zzfil zzfil = this.zzl;
        zzfio zzfio = this.zzm;
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = zzcoh.zza;
            zzcod zzcod = new zzcod(new zzcoh(new zzcpc(context), zzcpd, str, z, z2, zzapj, zzbki, zzchu, (zzbjy) null, zzl2, zza2, zzbew, zzfil, zzfio));
            zzcod.setWebViewClient(zzt.zzq().zzd(zzcod, zzbew, z2));
            zzcod.setWebChromeClient(new zzcnn(zzcod));
            return zzcod;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
