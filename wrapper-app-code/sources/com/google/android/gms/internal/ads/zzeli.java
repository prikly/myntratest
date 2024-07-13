package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeli implements zzekq {
    private final zzcxn zza;
    private final Context zzb;
    private final zzdwp zzc;
    private final Executor zzd;

    public zzeli(zzcxn zzcxn, Context context, Executor executor, zzdwp zzdwp) {
        this.zzb = context;
        this.zza = zzcxn;
        this.zzd = executor;
        this.zzc = zzdwp;
    }

    public final zzgfb zza(zzfix zzfix, zzfil zzfil) {
        return zzger.zzn(zzger.zzi((Object) null), new zzelf(this, zzfix, zzfil), this.zzd);
    }

    public final boolean zzb(zzfix zzfix, zzfil zzfil) {
        zzfiq zzfiq = zzfil.zzt;
        return (zzfiq == null || zzfiq.zza == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzc(zzfix zzfix, zzfil zzfil, Object obj) throws Exception {
        zzq zza2 = zzfjk.zza(this.zzb, zzfil.zzv);
        zzcno zza3 = this.zzc.zza(zza2, zzfil, zzfix.zzb.zzb);
        zzcxf zza4 = this.zza.zza(new zzdbc(zzfix, zzfil, (String) null), new zzcxg((View) zza3, zza3, zzfjk.zzc(zza2), zzfil.zzab, zzfil.zzaf, zzfil.zzP));
        zza4.zzg().zzi(zza3, false, (zzbqf) null);
        zza4.zzc().zzj(new zzelg(zza3), zzcib.zzf);
        zza4.zzg();
        zzfiq zzfiq = zzfil.zzt;
        return zzger.zzm(zzdwo.zzj(zza3, zzfiq.zzb, zzfiq.zza), new zzelh(zza4), zzcib.zzf);
    }
}
