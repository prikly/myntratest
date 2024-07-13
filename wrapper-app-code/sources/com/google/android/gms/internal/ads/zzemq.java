package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzemq implements zzekq {
    /* access modifiers changed from: private */
    public final zzczi zza;
    private final zzelx zzb;
    private final zzgfc zzc;
    /* access modifiers changed from: private */
    public final zzdep zzd;
    private final ScheduledExecutorService zze;

    public zzemq(zzczi zzczi, zzelx zzelx, zzdep zzdep, ScheduledExecutorService scheduledExecutorService, zzgfc zzgfc) {
        this.zza = zzczi;
        this.zzb = zzelx;
        this.zzd = zzdep;
        this.zze = scheduledExecutorService;
        this.zzc = zzgfc;
    }

    public final zzgfb zza(zzfix zzfix, zzfil zzfil) {
        return this.zzc.zzb(new zzemn(this, zzfix, zzfil));
    }

    public final boolean zzb(zzfix zzfix, zzfil zzfil) {
        return zzfix.zza.zza.zza() != null && this.zzb.zzb(zzfix, zzfil);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcyl zzc(zzfix zzfix, zzfil zzfil) throws Exception {
        return this.zza.zzb(new zzdbc(zzfix, zzfil, (String) null), new zzczv(zzfix.zza.zza.zza(), new zzemo(this, zzfix, zzfil))).zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzfix zzfix, zzfil zzfil) {
        zzger.zzr(zzger.zzo(this.zzb.zza(zzfix, zzfil), (long) zzfil.zzS, TimeUnit.SECONDS, this.zze), new zzemp(this), this.zzc);
    }
}
