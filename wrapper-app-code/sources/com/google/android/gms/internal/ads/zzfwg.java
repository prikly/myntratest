package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfwg extends zzfws {
    final /* synthetic */ zzfwh zza;
    private final zzfwm zzb;

    zzfwg(zzfwh zzfwh, zzfwm zzfwm) {
        this.zza = zzfwh;
        this.zzb = zzfwm;
    }

    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfwk zzc = zzfwl.zzc();
        zzc.zzb(i);
        if (string != null) {
            zzc.zza(string);
        }
        this.zzb.zza(zzc.zzc());
        if (i == 8157) {
            this.zza.zzc();
        }
    }
}
