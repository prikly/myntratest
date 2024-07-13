package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzelc implements zzekq {
    private final zzcxy zza;
    private final Context zzb;
    private final zzdwp zzc;
    private final zzfjg zzd;
    private final Executor zze;
    private final zzchu zzf;
    private final zzbqf zzg;
    private final boolean zzh = ((Boolean) zzba.zzc().zzb(zzbjj.zzhW)).booleanValue();

    public zzelc(zzcxy zzcxy, Context context, Executor executor, zzdwp zzdwp, zzfjg zzfjg, zzchu zzchu, zzbqf zzbqf) {
        this.zzb = context;
        this.zza = zzcxy;
        this.zze = executor;
        this.zzc = zzdwp;
        this.zzd = zzfjg;
        this.zzf = zzchu;
        this.zzg = zzbqf;
    }

    public final zzgfb zza(zzfix zzfix, zzfil zzfil) {
        zzdwt zzdwt = new zzdwt();
        zzgfb zzn = zzger.zzn(zzger.zzi((Object) null), new zzela(this, zzfil, zzfix, zzdwt), this.zze);
        zzn.zzc(new zzelb(zzdwt), this.zze);
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
        zzcno zza2 = this.zzc.zza(this.zzd.zze, zzfil2, zzfix2.zzb.zzb);
        zza2.zzab(zzfil2.zzX);
        zzdwt.zza(this.zzb, (View) zza2);
        zzcig zzcig = new zzcig();
        zzcxy zzcxy = this.zza;
        zzdbc zzdbc = new zzdbc(zzfix2, zzfil2, (String) null);
        zzele zzele = r1;
        zzele zzele2 = new zzele(this.zzf, zzcig, zzfil, zza2, this.zzd, this.zzh, this.zzg);
        zzcxv zza3 = zzcxy.zza(zzdbc, new zzdmz(zzele, zza2), new zzcxw(zzfil2.zzab));
        zza3.zzj().zzi(zza2, false, this.zzh ? this.zzg : null);
        zzcig.zzd(zza3);
        zza3.zzc().zzj(new zzeky(zza2), zzcib.zzf);
        zza3.zzj();
        zzfiq zzfiq = zzfil2.zzt;
        return zzger.zzm(zzdwo.zzj(zza2, zzfiq.zzb, zzfiq.zza), new zzekz(this, zza2, zzfil2, zza3), this.zze);
    }
}
