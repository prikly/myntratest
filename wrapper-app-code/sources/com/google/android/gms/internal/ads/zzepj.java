package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzepj implements zzdoe {
    public final /* synthetic */ zzekt zza;

    public /* synthetic */ zzepj(zzekt zzekt) {
        this.zza = zzekt;
    }

    public final void zza(boolean z, Context context, zzdfa zzdfa) {
        zzekt zzekt = this.zza;
        try {
            ((zzfkb) zzekt.zzb).zzv(z);
            ((zzfkb) zzekt.zzb).zzA();
        } catch (zzfjl e2) {
            zze.zzk("Cannot show rewarded video.", e2);
            throw new zzdod(e2.getCause());
        }
    }
}
