package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfna {
    final /* synthetic */ zzfnb zza;
    private final Object zzb;
    private final String zzc;
    private final zzgfb zzd;
    private final List zze;
    private final zzgfb zzf;

    private zzfna(zzfnb zzfnb, Object obj, String str, zzgfb zzgfb, List list, zzgfb zzgfb2) {
        this.zza = zzfnb;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = zzgfb;
        this.zze = list;
        this.zzf = zzgfb2;
    }

    /* synthetic */ zzfna(zzfnb zzfnb, Object obj, String str, zzgfb zzgfb, List list, zzgfb zzgfb2, zzfmz zzfmz) {
        this(zzfnb, obj, (String) null, zzgfb, list, zzgfb2);
    }

    public final zzfmo zza() {
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        zzfmo zzfmo = new zzfmo(obj, str, this.zzf);
        this.zza.zzd.zza(zzfmo);
        this.zzd.zzc(new zzfmu(this, zzfmo), zzcib.zzf);
        zzger.zzr(zzfmo, new zzfmy(this, zzfmo), zzcib.zzf);
        return zzfmo;
    }

    public final zzfna zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfna zzc(Class cls, zzgdy zzgdy) {
        zzfnb zzfnb = this.zza;
        return new zzfna(zzfnb, this.zzb, this.zzc, this.zzd, this.zze, zzger.zzg(this.zzf, cls, zzgdy, zzfnb.zzb));
    }

    public final zzfna zzd(zzgfb zzgfb) {
        return zzg(new zzfmv(zzgfb), zzcib.zzf);
    }

    public final zzfna zze(zzfmm zzfmm) {
        return zzf(new zzfmx(zzfmm));
    }

    public final zzfna zzf(zzgdy zzgdy) {
        return zzg(zzgdy, this.zza.zzb);
    }

    public final zzfna zzg(zzgdy zzgdy, Executor executor) {
        return new zzfna(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzger.zzn(this.zzf, zzgdy, executor));
    }

    public final zzfna zzh(String str) {
        return new zzfna(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfna zzi(long j, TimeUnit timeUnit) {
        zzfnb zzfnb = this.zza;
        return new zzfna(zzfnb, this.zzb, this.zzc, this.zzd, this.zze, zzger.zzo(this.zzf, j, timeUnit, zzfnb.zzc));
    }
}
