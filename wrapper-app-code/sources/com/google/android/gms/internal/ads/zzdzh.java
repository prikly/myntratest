package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdzh {
    /* access modifiers changed from: private */
    public final zzdzm zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    /* access modifiers changed from: private */
    public final Map zzc;

    public zzdzh(zzdzm zzdzm, Executor executor) {
        this.zza = zzdzm;
        this.zzc = zzdzm.zza();
        this.zzb = executor;
    }

    public final zzdzg zza() {
        zzdzg zzdzg = new zzdzg(this);
        zzdzg unused = zzdzg.zzb.putAll(zzdzg.zza.zzc);
        return zzdzg;
    }
}
