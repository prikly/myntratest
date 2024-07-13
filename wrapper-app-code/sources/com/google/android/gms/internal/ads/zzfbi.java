package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfbi implements zzezm {
    private final Context zza;
    private final zzcgx zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final String zze;
    private final zzcgo zzf;

    public zzfbi(zzcgo zzcgo, int i, Context context, zzcgx zzcgx, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.zzf = zzcgo;
        this.zza = context;
        this.zzb = zzcgx;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zze = str;
    }

    public final int zza() {
        return 44;
    }

    public final zzgfb zzb() {
        return zzger.zzf((zzgei) zzger.zzo(zzger.zzm(zzgei.zzv(zzger.zzl(new zzfbf(this), this.zzd)), zzfbg.zza, this.zzd), ((Long) zzba.zzc().zzb(zzbjj.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzfbh(this), zzgfi.zzb());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfbj zzc(Exception exc) {
        this.zzb.zzu(exc, "AttestationTokenSignal");
        return null;
    }
}
