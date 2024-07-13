package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdwu implements zzdfi {
    private final zzcno zza;

    zzdwu(zzcno zzcno) {
        this.zza = zzcno;
    }

    public final void zzbr(Context context) {
        zzcno zzcno = this.zza;
        if (zzcno != null) {
            zzcno.destroy();
        }
    }

    public final void zzbt(Context context) {
        zzcno zzcno = this.zza;
        if (zzcno != null) {
            zzcno.onPause();
        }
    }

    public final void zzbu(Context context) {
        zzcno zzcno = this.zza;
        if (zzcno != null) {
            zzcno.onResume();
        }
    }
}
