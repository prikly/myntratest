package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcgo {
    public final zzgfb zza(Context context, int i) {
        zzcig zzcig = new zzcig();
        zzay.zzb();
        if (zzchh.zzu(context)) {
            zzcib.zza.execute(new zzcgn(this, context, zzcig));
        }
        return zzcig;
    }
}
