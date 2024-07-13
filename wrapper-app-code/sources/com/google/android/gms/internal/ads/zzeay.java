package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzeay implements Runnable {
    public final /* synthetic */ zzebj zza;
    public final /* synthetic */ zzcig zzb;

    public /* synthetic */ zzeay(zzebj zzebj, zzcig zzcig) {
        this.zza = zzebj;
        this.zzb = zzcig;
    }

    public final void run() {
        zzcig zzcig = this.zzb;
        String zzc = zzt.zzo().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            zzcig.zzd(zzc);
        } else {
            zzcig.zze(new Exception());
        }
    }
}
