package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zznv extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzaf zzc;

    public zznv(int i, zzaf zzaf, boolean z) {
        super("AudioTrack write failed: " + i);
        this.zzb = z;
        this.zza = i;
        this.zzc = zzaf;
    }
}
