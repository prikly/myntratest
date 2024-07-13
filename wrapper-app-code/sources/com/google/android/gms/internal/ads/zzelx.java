package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzas;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzelx implements zzekq {
    private final zzczi zza;
    private final Context zzb;
    private final zzdwp zzc;
    private final zzfjg zzd;
    private final Executor zze;
    private final zzfxt zzf;

    public zzelx(zzczi zzczi, Context context, Executor executor, zzdwp zzdwp, zzfjg zzfjg, zzfxt zzfxt) {
        this.zzb = context;
        this.zza = zzczi;
        this.zze = executor;
        this.zzc = zzdwp;
        this.zzd = zzfjg;
        this.zzf = zzfxt;
    }

    public final zzgfb zza(zzfix zzfix, zzfil zzfil) {
        return zzger.zzn(zzger.zzi((Object) null), new zzelr(this, zzfix, zzfil), this.zze);
    }

    public final boolean zzb(zzfix zzfix, zzfil zzfil) {
        zzfiq zzfiq = zzfil.zzt;
        return (zzfiq == null || zzfiq.zza == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzc(zzfix zzfix, zzfil zzfil, Object obj) throws Exception {
        View view;
        zzq zza2 = zzfjk.zza(this.zzb, zzfil.zzv);
        zzcno zza3 = this.zzc.zza(zza2, zzfil, zzfix.zzb.zzb);
        zza3.zzab(zzfil.zzX);
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzgZ)).booleanValue() || !zzfil.zzai) {
            view = new zzdws(this.zzb, (View) zza3, (zzas) this.zzf.apply(zzfil));
        } else {
            view = zzczz.zza(this.zzb, (View) zza3, zzfil);
        }
        zzcym zza4 = this.zza.zza(new zzdbc(zzfix, zzfil, (String) null), new zzcys(view, zza3, new zzels(zza3), zzfjk.zzc(zza2)));
        zza4.zzj().zzi(zza3, false, (zzbqf) null);
        zza4.zzc().zzj(new zzelt(zza3), zzcib.zzf);
        zza4.zzj();
        zzfiq zzfiq = zzfil.zzt;
        zzgfb zzj = zzdwo.zzj(zza3, zzfiq.zzb, zzfiq.zza);
        if (zzfil.zzN) {
            zzj.zzc(new zzelu(zza3), this.zze);
        }
        zzj.zzc(new zzelv(this, zza3), this.zze);
        return zzger.zzm(zzj, new zzelw(zza4), zzcib.zzf);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzcno zzcno) {
        zzcno.zzaa();
        zzcok zzs = zzcno.zzs();
        zzfl zzfl = this.zzd.zza;
        if (zzfl != null && zzs != null) {
            zzs.zzs(zzfl);
        }
    }
}
