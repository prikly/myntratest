package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzesz implements zzezm {
    private final Context zza;

    zzesz(Context context) {
        this.zza = context;
    }

    public final int zza() {
        return 2;
    }

    public final zzgfb zzb() {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzcw)).booleanValue()) {
            return zzger.zzi((Object) null);
        }
        return zzger.zzi(new zzeta(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
