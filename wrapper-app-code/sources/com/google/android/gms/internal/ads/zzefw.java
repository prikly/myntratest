package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzefw {
    private final zzgfc zza;
    private final zzgfc zzb;
    private final zzegq zzc;
    private final zzhej zzd;

    zzefw(zzgfc zzgfc, zzgfc zzgfc2, zzegq zzegq, zzhej zzhej) {
        this.zza = zzgfc;
        this.zzb = zzgfc2;
        this.zzc = zzegq;
        this.zzd = zzhej;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zza(zzcbj zzcbj) throws Exception {
        return this.zzc.zza(zzcbj, ((Long) zzba.zzc().zzb(zzbjj.zzjz)).longValue());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzb(zzcbj zzcbj, int i, zzefg zzefg) throws Exception {
        return ((zzehw) this.zzd.zzb()).zzb(zzcbj, i);
    }

    public final zzgfb zzc(zzcbj zzcbj) {
        zzgfb zzgfb;
        String str = zzcbj.zzf;
        zzt.zzp();
        if (zzs.zzy(str)) {
            zzgfb = zzger.zzh(new zzefg(1, "Ads service proxy force local"));
        } else {
            zzgfb = zzger.zzg(zzger.zzl(new zzeft(this, zzcbj), this.zza), ExecutionException.class, zzefu.zza, this.zzb);
        }
        return zzger.zzg(zzgfb, zzefg.class, new zzefv(this, zzcbj, Binder.getCallingUid()), this.zzb);
    }
}
