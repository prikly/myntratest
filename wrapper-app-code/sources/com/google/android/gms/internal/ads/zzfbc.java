package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfbc implements zzezm {
    private final zzcgx zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzgfc zzd;
    private final zzbdz zze;

    zzfbc(String str, zzbdz zzbdz, zzcgx zzcgx, ScheduledExecutorService scheduledExecutorService, zzgfc zzgfc, byte[] bArr) {
        this.zzb = str;
        this.zze = zzbdz;
        this.zza = zzcgx;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgfc;
    }

    public final int zza() {
        return 43;
    }

    public final zzgfb zzb() {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzcp)).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzcu)).booleanValue()) {
                zzgfb zzn = zzger.zzn(zzfvj.zza(Tasks.forResult(null)), zzfba.zza, this.zzd);
                if (((Boolean) zzbko.zza.zze()).booleanValue()) {
                    zzn = zzger.zzo(zzn, ((Long) zzbko.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzger.zzf(zzn, Exception.class, new zzfbb(this), this.zzd);
            }
        }
        return zzger.zzi(new zzfbd((String) null, -1));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfbd zzc(Exception exc) {
        this.zza.zzu(exc, "AppSetIdInfoGmscoreSignal");
        return new zzfbd((String) null, -1);
    }
}
