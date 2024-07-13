package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfps {
    private boolean zza;

    /* access modifiers changed from: package-private */
    public final void zza(Context context) {
        zzfra.zzb(context, "Application Context cannot be null");
        if (!this.zza) {
            this.zza = true;
            zzfqo.zzb().zzc(context);
            zzfqj zza2 = zzfqj.zza();
            if (context instanceof Application) {
                ((Application) context).registerActivityLifecycleCallbacks(zza2);
            }
            zzfqy.zzg(context);
            zzfql.zzb().zzc(context);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzb() {
        return this.zza;
    }
}
