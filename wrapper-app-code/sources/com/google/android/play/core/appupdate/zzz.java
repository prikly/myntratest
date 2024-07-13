package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.internal.zzad;
import com.google.android.play.core.appupdate.internal.zzaf;

/* compiled from: com.google.android.play:app-update@@2.0.0 */
final class zzz implements zza {
    private final zzz zza = this;
    private final zzaf zzb;
    private final zzaf zzc;
    private final zzaf zzd;
    private final zzaf zze;
    private final zzaf zzf;
    private final zzaf zzg;

    /* synthetic */ zzz(zzi zzi, zzy zzy) {
        zzk zzk = new zzk(zzi);
        this.zzb = zzk;
        zzaf zzb2 = zzad.zzb(new zzu(zzk));
        this.zzc = zzb2;
        this.zzd = zzad.zzb(new zzs(this.zzb, zzb2));
        zzaf zzb3 = zzad.zzb(new zzd(this.zzb));
        this.zze = zzb3;
        zzaf zzb4 = zzad.zzb(new zzh(this.zzd, zzb3, this.zzb));
        this.zzf = zzb4;
        this.zzg = zzad.zzb(new zzj(zzb4));
    }

    public final AppUpdateManager zza() {
        return (AppUpdateManager) this.zzg.zza();
    }
}
