package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzevl implements Callable {
    public final /* synthetic */ zzevm zza;

    public /* synthetic */ zzevl(zzevm zzevm) {
        this.zza = zzevm;
    }

    public final Object call() {
        return new zzevn(Long.valueOf(zzt.zzB().currentTimeMillis() - zzt.zzo().zzh().zzh().zza()).longValue());
    }
}
