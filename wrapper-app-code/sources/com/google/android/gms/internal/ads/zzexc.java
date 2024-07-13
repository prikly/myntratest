package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzexc implements zzezl {
    public final zzfik zza;

    public zzexc(zzfik zzfik) {
        this.zza = zzfik;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfik zzfik = this.zza;
        if (zzfik != null) {
            bundle.putBoolean("render_in_browser", zzfik.zzd());
            bundle.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}
