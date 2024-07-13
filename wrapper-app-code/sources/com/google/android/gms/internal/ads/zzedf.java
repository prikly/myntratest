package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzedf implements Callable {
    public final /* synthetic */ zzedi zza;
    public final /* synthetic */ zzccb zzb;

    public /* synthetic */ zzedf(zzedi zzedi, zzccb zzccb) {
        this.zza = zzedi;
        this.zzb = zzccb;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb);
    }
}
