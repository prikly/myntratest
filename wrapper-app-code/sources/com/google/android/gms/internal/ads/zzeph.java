package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeph implements zzekq {
    private final Context zza;
    private final zzdwp zzb;
    private final zzdvy zzc;
    private final zzfjg zzd;
    private final Executor zze;
    private final zzchu zzf;
    private final zzbqf zzg;
    private final boolean zzh = ((Boolean) zzba.zzc().zzb(zzbjj.zzhW)).booleanValue();

    public zzeph(Context context, zzchu zzchu, zzfjg zzfjg, Executor executor, zzdvy zzdvy, zzdwp zzdwp, zzbqf zzbqf) {
        this.zza = context;
        this.zzd = zzfjg;
        this.zzc = zzdvy;
        this.zze = executor;
        this.zzf = zzchu;
        this.zzb = zzdwp;
        this.zzg = zzbqf;
    }

    public final zzgfb zza(zzfix zzfix, zzfil zzfil) {
        zzdwt zzdwt = new zzdwt();
        zzgfb zzn = zzger.zzn(zzger.zzi((Object) null), new zzepa(this, zzfil, zzfix, zzdwt), this.zze);
        zzn.zzc(new zzepb(zzdwt), this.zze);
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
        zzdvy zzdvy = this.zzc;
        zzdbc zzdbc = new zzdbc(zzfix2, zzfil2, (String) null);
        zzepg zzepg = r1;
        zzepg zzepg2 = new zzepg(this.zza, this.zzb, this.zzd, this.zzf, zzfil, zzcig, zza2, this.zzg, this.zzh);
        zzdvu zze2 = zzdvy.zze(zzdbc, new zzdvv(zzepg, zza2));
        zzcig.zzd(zze2);
        zzbqt.zzb(zza2, zze2.zzg());
        zze2.zzc().zzj(new zzepc(zza2), zzcib.zzf);
        zze2.zzl().zzi(zza2, true, this.zzh ? this.zzg : null);
        zze2.zzl();
        zzfil zzfil3 = zzfil;
        zzfiq zzfiq = zzfil3.zzt;
        return zzger.zzm(zzdwo.zzj(zza2, zzfiq.zzb, zzfiq.zza), new zzepd(this, zza2, zzfil3, zze2), this.zze);
    }
}
