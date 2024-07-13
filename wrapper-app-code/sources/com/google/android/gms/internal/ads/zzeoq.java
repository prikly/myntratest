package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzeoq implements zzdoe {
    public final /* synthetic */ zzekt zza;

    public /* synthetic */ zzeoq(zzekt zzekt) {
        this.zza = zzekt;
    }

    public final void zza(boolean z, Context context, zzdfa zzdfa) {
        zzekt zzekt = this.zza;
        try {
            ((zzfkb) zzekt.zzb).zzv(z);
            ((zzfkb) zzekt.zzb).zzz(context);
        } catch (zzfjl e2) {
            throw new zzdod(e2.getCause());
        }
    }
}
