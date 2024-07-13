package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzegc {
    private final zzgfc zza;
    private final zzgfc zzb;
    private final zzegt zzc;

    zzegc(zzgfc zzgfc, zzgfc zzgfc2, zzegt zzegt) {
        this.zza = zzgfc;
        this.zzb = zzgfc2;
        this.zzc = zzegt;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zza(zzcbf zzcbf) throws Exception {
        return this.zzc.zza(zzcbf, ((Long) zzba.zzc().zzb(zzbjj.zzjy)).longValue());
    }

    public final zzgfb zzb(zzcbf zzcbf) {
        zzgfb zzgfb;
        String str = zzcbf.zzb;
        zzt.zzp();
        if (zzs.zzy(str)) {
            zzgfb = zzger.zzh(new zzefg(1, "Ads signal service force local"));
        } else {
            zzgfb = zzger.zzg(zzger.zzl(new zzefy(this, zzcbf), this.zza), ExecutionException.class, zzefz.zza, this.zzb);
        }
        return zzger.zzn(zzger.zzg(zzgei.zzv(zzgfb), zzefg.class, zzega.zza, this.zzb), zzegb.zza, this.zzb);
    }
}
