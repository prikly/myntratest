package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzig implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzie zzb;
    final /* synthetic */ zzie zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzim zze;

    zzig(zzim zzim, Bundle bundle, zzie zzie, zzie zzie2, long j) {
        this.zze = zzim;
        this.zza = bundle;
        this.zzb = zzie;
        this.zzc = zzie2;
        this.zzd = j;
    }

    public final void run() {
        zzim.zzp(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
