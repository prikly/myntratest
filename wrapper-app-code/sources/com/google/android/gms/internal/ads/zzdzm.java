package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdzm extends zzdzo {
    private final zzfob zzf;

    public zzdzm(Executor executor, zzcht zzcht, zzfob zzfob, zzfod zzfod) {
        super(executor, zzcht, zzfod);
        this.zzf = zzfob;
        zzfob.zza(this.zzb);
    }

    public final Map zza() {
        return new HashMap(this.zzb);
    }
}
