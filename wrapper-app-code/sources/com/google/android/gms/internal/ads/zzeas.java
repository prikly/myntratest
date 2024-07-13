package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeas implements zzeag {
    /* access modifiers changed from: private */
    public final long zza;
    private final zzesj zzb;

    zzeas(long j, Context context, zzeal zzeal, zzcpj zzcpj, String str) {
        this.zza = j;
        zzfgq zzu = zzcpj.zzu();
        zzu.zzc(context);
        zzu.zza(new zzq());
        zzu.zzb(str);
        zzesj zza2 = zzu.zzd().zza();
        this.zzb = zza2;
        zza2.zzD(new zzear(this, zzeal));
    }

    public final void zza() {
        this.zzb.zzx();
    }

    public final void zzb(zzl zzl) {
        this.zzb.zzaa(zzl);
    }

    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
