package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfff implements zzfln {
    public final zzffz zza;
    public final zzfgb zzb;
    public final zzl zzc;
    public final String zzd;
    public final Executor zze;
    public final zzw zzf;
    public final zzflc zzg;

    public zzfff(zzffz zzffz, zzfgb zzfgb, zzl zzl, String str, Executor executor, zzw zzw, zzflc zzflc) {
        this.zza = zzffz;
        this.zzb = zzfgb;
        this.zzc = zzl;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzw;
        this.zzg = zzflc;
    }

    public final zzflc zza() {
        return this.zzg;
    }

    public final Executor zzb() {
        return this.zze;
    }
}
