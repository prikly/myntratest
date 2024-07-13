package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzkk {
    private final PowerManager zza;

    public zzkk(Context context) {
        this.zza = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
