package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeeh implements zzeff {
    /* access modifiers changed from: private */
    public static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzedi zzb;
    private final zzgfc zzc;
    private final zzfjg zzd;
    private final ScheduledExecutorService zze;
    /* access modifiers changed from: private */
    public final zzejc zzf;
    private final zzfow zzg;
    private final Context zzh;

    zzeeh(Context context, zzfjg zzfjg, zzedi zzedi, zzgfc zzgfc, ScheduledExecutorService scheduledExecutorService, zzejc zzejc, zzfow zzfow) {
        this.zzh = context;
        this.zzd = zzfjg;
        this.zzb = zzedi;
        this.zzc = zzgfc;
        this.zze = scheduledExecutorService;
        this.zzf = zzejc;
        this.zzg = zzfow;
    }

    public final zzgfb zzb(zzccb zzccb) {
        zzgfb zzb2 = this.zzb.zzb(zzccb);
        zzfol zza2 = zzfok.zza(this.zzh, 11);
        zzfov.zzd(zzb2, zza2);
        zzgfb zzn = zzger.zzn(zzb2, new zzeee(this), this.zzc);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzeV)).booleanValue()) {
            zzn = zzger.zzg(zzger.zzo(zzn, (long) ((Integer) zzba.zzc().zzb(zzbjj.zzeW)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, zzeef.zza, zzcib.zzf);
        }
        zzfov.zza(zzn, this.zzg, zza2);
        zzger.zzr(zzn, new zzeeg(this), zzcib.zzf);
        return zzn;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzc(InputStream inputStream) throws Exception {
        return zzger.zzi(new zzfix(new zzfiu(this.zzd), zzfiw.zza(new InputStreamReader(inputStream))));
    }
}
