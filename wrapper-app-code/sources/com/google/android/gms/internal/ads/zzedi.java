package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzedi {
    private final zzgfc zza;
    private final zzgfc zzb;
    private final zzeep zzc;
    private final zzhej zzd;

    public zzedi(zzgfc zzgfc, zzgfc zzgfc2, zzeep zzeep, zzhej zzhej) {
        this.zza = zzgfc;
        this.zzb = zzgfc2;
        this.zzc = zzeep;
        this.zzd = zzhej;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zza(zzccb zzccb, int i, zzefg zzefg) throws Exception {
        return ((zzehm) this.zzd.zzb()).zzc(zzccb, i);
    }

    public final zzgfb zzb(zzccb zzccb) {
        zzgfb zzgfb;
        String str = zzccb.zzd;
        zzt.zzp();
        if (zzs.zzy(str)) {
            zzgfb = zzger.zzh(new zzefg(1));
        } else {
            zzgfb = zzger.zzg(this.zza.zzb(new zzedf(this, zzccb)), ExecutionException.class, zzedg.zza, this.zzb);
        }
        return zzger.zzg(zzgfb, zzefg.class, new zzedh(this, zzccb, Binder.getCallingUid()), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzc(zzccb zzccb) throws Exception {
        zzcig zzcig;
        zzeep zzeep = this.zzc;
        synchronized (zzeep.zzb) {
            if (zzeep.zzc) {
                zzcig = zzeep.zza;
            } else {
                zzeep.zzc = true;
                zzeep.zze = zzccb;
                zzeep.zzf.checkAvailabilityAndConnect();
                zzeep.zza.zzc(new zzeeo(zzeep), zzcib.zzf);
                zzcig = zzeep.zza;
            }
        }
        return (InputStream) zzcig.get((long) ((Integer) zzba.zzc().zzb(zzbjj.zzeW)).intValue(), TimeUnit.SECONDS);
    }
}
