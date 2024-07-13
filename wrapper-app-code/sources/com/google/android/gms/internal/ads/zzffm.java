package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzffm implements zzfga {
    private final zzfks zza;
    private final Executor zzb;
    private final zzgen zzc = new zzffk(this);

    public zzffm(zzfks zzfks, Executor executor) {
        this.zza = zzfks;
        this.zzb = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zza(zzddw zzddw, zzffv zzffv) throws Exception {
        zzflc zzflc = zzffv.zzb;
        zzccb zzccb = zzffv.zza;
        zzflb zzb2 = zzflc != null ? this.zza.zzb(zzflc) : null;
        if (zzflc == null) {
            return zzger.zzi((Object) null);
        }
        if (!(zzb2 == null || zzccb == null)) {
            zzger.zzr(zzddw.zzb().zzh(zzccb), this.zzc, this.zzb);
        }
        return zzger.zzi(new zzffl(zzflc, zzccb, zzb2));
    }

    public final zzgfb zzb(zzfgb zzfgb, zzffz zzffz, zzddw zzddw) {
        return zzger.zzf(zzger.zzn(zzgei.zzv(new zzffw(this.zza, zzddw, this.zzb).zzc()), new zzffi(this, zzddw), this.zzb), Exception.class, new zzffj(this), this.zzb);
    }

    public final /* bridge */ /* synthetic */ zzgfb zzc(zzfgb zzfgb, zzffz zzffz, Object obj) {
        return zzb(zzfgb, zzffz, (zzddw) null);
    }

    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
