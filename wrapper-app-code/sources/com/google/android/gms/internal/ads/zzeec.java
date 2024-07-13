package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeec {
    private final ScheduledExecutorService zza;
    private final zzgfc zzb;
    private final zzeet zzc;
    private final zzhej zzd;

    public zzeec(ScheduledExecutorService scheduledExecutorService, zzgfc zzgfc, zzeet zzeet, zzhej zzhej) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgfc;
        this.zzc = zzeet;
        this.zzd = zzhej;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zza(zzccb zzccb, int i, Throwable th) throws Exception {
        return ((zzehm) this.zzd.zzb()).zzd(zzccb, i);
    }

    public final zzgfb zzb(zzccb zzccb) {
        zzgfb zzgfb;
        String str = zzccb.zzd;
        zzt.zzp();
        if (zzs.zzy(str)) {
            zzgfb = zzger.zzh(new zzefg(1));
        } else {
            zzeet zzeet = this.zzc;
            synchronized (zzeet.zzb) {
                if (zzeet.zzc) {
                    zzgfb = zzeet.zza;
                } else {
                    zzeet.zzc = true;
                    zzeet.zze = zzccb;
                    zzeet.zzf.checkAvailabilityAndConnect();
                    zzeet.zza.zzc(new zzees(zzeet), zzcib.zzf);
                    zzgfb = zzeet.zza;
                }
            }
        }
        int callingUid = Binder.getCallingUid();
        zzgei zzv = zzgei.zzv(zzgfb);
        long intValue = (long) ((Integer) zzba.zzc().zzb(zzbjj.zzeW)).intValue();
        return zzger.zzg((zzgei) zzger.zzo(zzv, intValue, TimeUnit.SECONDS, this.zza), Throwable.class, new zzeeb(this, zzccb, callingUid), this.zzb);
    }
}
