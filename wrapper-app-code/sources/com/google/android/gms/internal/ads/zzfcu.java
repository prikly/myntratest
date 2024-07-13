package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfcu implements zzezm {
    private final zzcgx zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzgfc zze;
    private final String zzf;
    private final zzcgm zzg;

    zzfcu(zzcgx zzcgx, boolean z, boolean z2, zzcgm zzcgm, zzgfc zzgfc, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.zza = zzcgx;
        this.zzb = z;
        this.zzc = z2;
        this.zzg = zzcgm;
        this.zze = zzgfc;
        this.zzf = str;
        this.zzd = scheduledExecutorService;
    }

    public final int zza() {
        return 50;
    }

    public final zzgfb zzb() {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzgD)).booleanValue() && this.zzc) {
            return zzger.zzi((Object) null);
        }
        if (!this.zzb) {
            return zzger.zzi((Object) null);
        }
        return zzger.zzf(zzger.zzo(zzger.zzm(zzger.zzi((Object) null), zzfcs.zza, this.zze), ((Long) zzblm.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzfct(this), this.zze);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfcv zzc(Exception exc) {
        this.zza.zzu(exc, "TrustlessTokenSignal");
        return null;
    }
}
