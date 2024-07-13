package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzog {
    final zzof zza = zzof.zza;
    /* access modifiers changed from: private */
    public zznb zzb = zznb.zza;
    /* access modifiers changed from: private */
    public zzoi zzc;

    public final zzog zzb(zznb zznb) {
        this.zzb = zznb;
        return this;
    }

    public final zzog zzc(zzne[] zzneArr) {
        this.zzc = new zzoi(zzneArr);
        return this;
    }

    public final zzos zzd() {
        if (this.zzc == null) {
            this.zzc = new zzoi(new zzne[0]);
        }
        return new zzos(this, (zzor) null);
    }
}
