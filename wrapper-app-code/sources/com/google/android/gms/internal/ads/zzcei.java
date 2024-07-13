package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzcei implements Runnable {
    public final /* synthetic */ zzcek zza;
    public final /* synthetic */ Bitmap zzb;

    public /* synthetic */ zzcei(zzcek zzcek, Bitmap bitmap) {
        this.zza = zzcek;
        this.zzb = bitmap;
    }

    public final void run() {
        this.zza.zzf(this.zzb);
    }
}
