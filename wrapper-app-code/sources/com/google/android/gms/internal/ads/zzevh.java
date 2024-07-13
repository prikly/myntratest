package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzevh implements zzezm {
    private final zzffh zza;

    zzevh(zzffh zzffh) {
        this.zza = zzffh;
    }

    public final int zza() {
        return 15;
    }

    public final zzgfb zzb() {
        zzffh zzffh = this.zza;
        zzevg zzevg = null;
        if (!(zzffh == null || zzffh.zza() == null || zzffh.zza().isEmpty())) {
            zzevg = new zzevg(this);
        }
        return zzger.zzi(zzevg);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
