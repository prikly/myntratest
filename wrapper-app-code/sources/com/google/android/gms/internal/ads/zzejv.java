package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzejv implements Callable {
    public final /* synthetic */ zzekc zza;

    public /* synthetic */ zzejv(zzekc zzekc) {
        this.zza = zzekc;
    }

    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}
