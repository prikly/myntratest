package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdty {
    private final Executor zza;
    private final zzcxc zzb;
    private final zzdlw zzc;

    zzdty(Executor executor, zzcxc zzcxc, zzdlw zzdlw) {
        this.zza = executor;
        this.zzc = zzdlw;
        this.zzb = zzcxc;
    }

    public final void zza(zzcno zzcno) {
        if (zzcno != null) {
            this.zzc.zza(zzcno.zzH());
            this.zzc.zzj(new zzdtu(zzcno), this.zza);
            this.zzc.zzj(new zzdtv(zzcno), this.zza);
            this.zzc.zzj(this.zzb, this.zza);
            this.zzb.zzf(zzcno);
            zzcno.zzaf("/trackActiveViewUnit", new zzdtw(this));
            zzcno.zzaf("/untrackActiveViewUnit", new zzdtx(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcno zzcno, Map map) {
        this.zzb.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcno zzcno, Map map) {
        this.zzb.zza();
    }
}
