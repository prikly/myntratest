package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeus implements zzezm {
    final zzcgx zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgfc zzd;
    private final Context zze;

    zzeus(Context context, zzcgx zzcgx, ScheduledExecutorService scheduledExecutorService, zzgfc zzgfc) {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzct)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcgx;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgfc;
    }

    public final int zza() {
        return 11;
    }

    public final zzgfb zzb() {
        Task<AppSetIdInfo> task;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzcp)).booleanValue()) {
            if (!((Boolean) zzba.zzc().zzb(zzbjj.zzcu)).booleanValue()) {
                if (!((Boolean) zzba.zzc().zzb(zzbjj.zzcq)).booleanValue()) {
                    return zzger.zzm(zzfvj.zza(this.zzb.getAppSetIdInfo()), zzeup.zza, zzcib.zzf);
                }
                if (((Boolean) zzba.zzc().zzb(zzbjj.zzct)).booleanValue()) {
                    task = zzfkj.zza(this.zze);
                } else {
                    task = this.zzb.getAppSetIdInfo();
                }
                if (task == null) {
                    return zzger.zzi(new zzeut((String) null, -1));
                }
                zzgfb zzn = zzger.zzn(zzfvj.zza(task), zzeuq.zza, zzcib.zzf);
                if (((Boolean) zzba.zzc().zzb(zzbjj.zzcr)).booleanValue()) {
                    zzn = zzger.zzo(zzn, ((Long) zzba.zzc().zzb(zzbjj.zzcs)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzger.zzf(zzn, Exception.class, new zzeur(this), this.zzd);
            }
        }
        return zzger.zzi(new zzeut((String) null, -1));
    }
}
