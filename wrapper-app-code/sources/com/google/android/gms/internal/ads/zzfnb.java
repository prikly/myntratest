package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzfnb {
    /* access modifiers changed from: private */
    public static final zzgfb zza = zzger.zzi((Object) null);
    /* access modifiers changed from: private */
    public final zzgfc zzb;
    /* access modifiers changed from: private */
    public final ScheduledExecutorService zzc;
    /* access modifiers changed from: private */
    public final zzfnc zzd;

    public zzfnb(zzgfc zzgfc, ScheduledExecutorService scheduledExecutorService, zzfnc zzfnc) {
        this.zzb = zzgfc;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfnc;
    }

    public final zzfmr zza(Object obj, zzgfb... zzgfbArr) {
        return new zzfmr(this, obj, Arrays.asList(zzgfbArr), (zzfmq) null);
    }

    public final zzfna zzb(Object obj, zzgfb zzgfb) {
        return new zzfna(this, obj, (String) null, zzgfb, Collections.singletonList(zzgfb), zzgfb, (zzfmz) null);
    }

    /* access modifiers changed from: protected */
    public abstract String zzf(Object obj);
}
