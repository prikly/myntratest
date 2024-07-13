package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdbb {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzgfb zzc;
    private volatile boolean zzd = true;

    public zzdbb(Executor executor, ScheduledExecutorService scheduledExecutorService, zzgfb zzgfb) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgfb;
    }

    static /* bridge */ /* synthetic */ void zzb(zzdbb zzdbb, List list, zzgen zzgen) {
        if (list == null || list.isEmpty()) {
            zzdbb.zza.execute(new zzdav(zzgen));
            return;
        }
        zzgfb zzi = zzger.zzi((Object) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzi = zzger.zzn(zzger.zzg(zzi, Throwable.class, new zzdaw(zzgen), zzdbb.zza), new zzdax(zzdbb, zzgen, (zzgfb) it.next()), zzdbb.zza);
        }
        zzger.zzr(zzi, new zzdba(zzdbb, zzgen), zzdbb.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zza(zzgen zzgen, zzgfb zzgfb, zzdan zzdan) throws Exception {
        if (zzdan != null) {
            zzgen.zzb(zzdan);
        }
        return zzger.zzo(zzgfb, ((Long) zzbll.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzgen zzgen) {
        zzger.zzr(this.zzc, new zzdaz(this, zzgen), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
