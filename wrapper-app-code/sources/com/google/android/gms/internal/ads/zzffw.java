package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzffw {
    private final zzfks zza;
    private final zzddw zzb;
    private final Executor zzc;
    /* access modifiers changed from: private */
    public zzffv zzd;

    public zzffw(zzfks zzfks, zzddw zzddw, Executor executor) {
        this.zza = zzfks;
        this.zzb = zzddw;
        this.zzc = executor;
    }

    /* access modifiers changed from: private */
    @Deprecated
    public final zzflc zze() {
        zzfjg zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final zzgfb zzc() {
        zzgfb zzgfb;
        zzffv zzffv = this.zzd;
        if (zzffv != null) {
            return zzger.zzi(zzffv);
        }
        if (!((Boolean) zzblf.zza.zze()).booleanValue()) {
            zzffv zzffv2 = new zzffv((zzccb) null, zze(), (zzffu) null);
            this.zzd = zzffv2;
            zzgfb = zzger.zzi(zzffv2);
        } else {
            zzgfb = zzger.zzf(zzger.zzm(zzgei.zzv(this.zzb.zzb().zze(this.zza.zza())), new zzfft(this), this.zzc), zzefg.class, new zzffs(this), this.zzc);
        }
        return zzger.zzm(zzgfb, zzffr.zza, this.zzc);
    }
}
