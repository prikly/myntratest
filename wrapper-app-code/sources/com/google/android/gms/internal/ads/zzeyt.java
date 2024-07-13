package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nonagon.signalgeneration.zzae;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeyt implements zzezm {
    private final String zza;
    private final zzgfc zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfjg zze;
    private final zzcpj zzf;

    zzeyt(zzgfc zzgfc, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfjg zzfjg, zzcpj zzcpj) {
        this.zzb = zzgfc;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzfjg;
        this.zzf = zzcpj;
    }

    public static /* synthetic */ zzgfb zzc(zzeyt zzeyt) {
        String str = zzeyt.zza;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzgB)).booleanValue()) {
            str = AdFormat.UNKNOWN.name();
        }
        zzg zzo = zzeyt.zzf.zzo();
        zzddx zzddx = new zzddx();
        zzddx.zzc(zzeyt.zzd);
        zzfje zzfje = new zzfje();
        zzfje.zzs("adUnitId");
        zzfje.zzE(zzeyt.zze.zzd);
        zzfje.zzr(new zzq());
        zzddx.zzf(zzfje.zzG());
        zzo.zza(zzddx.zzg());
        zzae zzae = new zzae();
        zzae.zza(str);
        zzo.zzb(zzae.zzb());
        new zzdjy();
        return zzger.zzf(zzger.zzm((zzgei) zzger.zzo(zzgei.zzv(zzo.zzc().zzc()), ((Long) zzba.zzc().zzb(zzbjj.zzgC)).longValue(), TimeUnit.MILLISECONDS, zzeyt.zzc), zzeyr.zza, zzeyt.zzb), Exception.class, zzeys.zza, zzeyt.zzb);
    }

    public final int zza() {
        return 33;
    }

    public final zzgfb zzb() {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzgA)).booleanValue() || "adUnitId".equals(this.zze.zzf)) {
            return this.zzb.zzb(zzeyp.zza);
        }
        return zzger.zzl(new zzeyq(this), this.zzb);
    }
}
