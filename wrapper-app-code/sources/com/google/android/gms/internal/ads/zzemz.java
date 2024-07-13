package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzemz implements zzekq {
    private final Context zza;
    private final zzdwp zzb;
    private final zzdnw zzc;
    private final zzfjg zzd;
    private final Executor zze;
    private final zzchu zzf;
    private final zzbqf zzg;
    private final boolean zzh = ((Boolean) zzba.zzc().zzb(zzbjj.zzhW)).booleanValue();

    public zzemz(Context context, zzchu zzchu, zzfjg zzfjg, Executor executor, zzdnw zzdnw, zzdwp zzdwp, zzbqf zzbqf) {
        this.zza = context;
        this.zzd = zzfjg;
        this.zzc = zzdnw;
        this.zze = executor;
        this.zzf = zzchu;
        this.zzb = zzdwp;
        this.zzg = zzbqf;
    }

    public final zzgfb zza(zzfix zzfix, zzfil zzfil) {
        zzdwt zzdwt = new zzdwt();
        zzgfb zzn = zzger.zzn(zzger.zzi((Object) null), new zzemu(this, zzfil, zzfix, zzdwt), this.zze);
        zzn.zzc(new zzemv(zzdwt), this.zze);
        return zzn;
    }

    public final boolean zzb(zzfix zzfix, zzfil zzfil) {
        zzfiq zzfiq = zzfil.zzt;
        return (zzfiq == null || zzfiq.zza == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzc(zzfil zzfil, zzfix zzfix, zzdwt zzdwt, Object obj) throws Exception {
        zzfil zzfil2 = zzfil;
        zzfix zzfix2 = zzfix;
        zzcno zza2 = this.zzb.zza(this.zzd.zze, zzfil2, zzfix2.zzb.zzb);
        zza2.zzab(zzfil2.zzX);
        zzdwt.zza(this.zza, (View) zza2);
        zzcig zzcig = new zzcig();
        zzdnw zzdnw = this.zzc;
        zzdbc zzdbc = new zzdbc(zzfix2, zzfil2, (String) null);
        zzemy zzemy = r1;
        zzemy zzemy2 = new zzemy(this.zza, this.zzf, zzcig, zzfil, zza2, this.zzd, this.zzh, this.zzg);
        zzdmw zze2 = zzdnw.zze(zzdbc, new zzdmz(zzemy, zza2));
        zzcig.zzd(zze2);
        zze2.zzc().zzj(new zzemw(zza2), zzcib.zzf);
        zze2.zzk().zzi(zza2, true, this.zzh ? this.zzg : null);
        zze2.zzk();
        zzfil zzfil3 = zzfil;
        zzfiq zzfiq = zzfil3.zzt;
        return zzger.zzm(zzdwo.zzj(zza2, zzfiq.zzb, zzfiq.zza), new zzemx(this, zza2, zzfil3, zze2), this.zze);
    }
}
