package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfsk {
    private final Context zza;
    private final Looper zzb;

    public zzfsk(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfsy zza2 = zzfta.zza();
        zza2.zza(this.zza.getPackageName());
        zza2.zzc(2);
        zzfsv zza3 = zzfsw.zza();
        zza3.zza(str);
        zza3.zzb(2);
        zza2.zzb(zza3);
        new zzfsl(this.zza, this.zzb, (zzfta) zza2.zzak()).zza();
    }
}
