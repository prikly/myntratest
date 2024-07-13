package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdjv implements Runnable {
    public final /* synthetic */ zzdjw zza;
    public final /* synthetic */ Object zzb;

    public /* synthetic */ zzdjv(zzdjw zzdjw, Object obj) {
        this.zza = zzdjw;
        this.zzb = obj;
    }

    public final void run() {
        try {
            this.zza.zza(this.zzb);
        } catch (Throwable th) {
            zzt.zzo().zzt(th, "EventEmitter.notify");
            zze.zzb("Event emitter exception.", th);
        }
    }
}
