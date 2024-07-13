package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzeiw implements Callable {
    public final /* synthetic */ zzeiu zza;

    public /* synthetic */ zzeiw(zzeiu zzeiu) {
        this.zza = zzeiu;
    }

    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}
