package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfnz implements zzfnt {
    private final zzfod zza;
    private final zzfob zzb;
    private final zzfnq zzc;

    public zzfnz(zzfnq zzfnq, zzfod zzfod, zzfob zzfob, byte[] bArr) {
        this.zzc = zzfnq;
        this.zza = zzfod;
        this.zzb = zzfob;
    }

    public final String zza(zzfns zzfns) {
        zzfod zzfod = this.zza;
        Map zzj = zzfns.zzj();
        this.zzb.zza(zzj);
        return zzfod.zza(zzj);
    }

    public final void zzb(zzfns zzfns) {
        this.zzc.zzb(zza(zzfns));
    }
}
