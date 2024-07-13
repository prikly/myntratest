package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfxb extends zzfwv {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzfxe zzb;

    zzfxb(zzfxe zzfxe, IBinder iBinder) {
        this.zzb = zzfxe;
        this.zza = iBinder;
    }

    public final void zza() {
        this.zzb.zza.zzn = zzfwq.zzb(this.zza);
        zzfxf.zzn(this.zzb.zza);
        this.zzb.zza.zzh = false;
        for (Runnable run : this.zzb.zza.zze) {
            run.run();
        }
        this.zzb.zza.zze.clear();
    }
}
