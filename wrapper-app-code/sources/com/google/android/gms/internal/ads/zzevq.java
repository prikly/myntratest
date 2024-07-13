package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzevq implements zzezm {
    private final zzgfc zza;
    private final zzdxh zzb;
    private final String zzc;
    private final zzfjg zzd;

    public zzevq(zzgfc zzgfc, zzdxh zzdxh, zzfjg zzfjg, String str) {
        this.zza = zzgfc;
        this.zzb = zzdxh;
        this.zzd = zzfjg;
        this.zzc = str;
    }

    public final int zza() {
        return 17;
    }

    public final zzgfb zzb() {
        return this.zza.zzb(new zzevp(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzevr zzc() throws Exception {
        return new zzevr(this.zzb.zzb(this.zzd.zzf, this.zzc), this.zzb.zza());
    }
}
