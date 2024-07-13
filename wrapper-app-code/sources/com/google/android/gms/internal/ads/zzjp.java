package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzjp implements zzjl {
    public final zzsc zza;
    public final Object zzb = new Object();
    public final List zzc = new ArrayList();
    public int zzd;
    public boolean zze;

    public zzjp(zzsj zzsj, boolean z) {
        this.zza = new zzsc(zzsj, z);
    }

    public final zzcn zza() {
        return this.zza.zzB();
    }

    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}
