package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzemn implements Callable {
    public final /* synthetic */ zzemq zza;
    public final /* synthetic */ zzfix zzb;
    public final /* synthetic */ zzfil zzc;

    public /* synthetic */ zzemn(zzemq zzemq, zzfix zzfix, zzfil zzfil) {
        this.zza = zzemq;
        this.zzb = zzfix;
        this.zzc = zzfil;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb, this.zzc);
    }
}
