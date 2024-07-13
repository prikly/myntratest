package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfwx implements IBinder.DeathRecipient {
    public final /* synthetic */ zzfxf zza;

    public /* synthetic */ zzfwx(zzfxf zzfxf) {
        this.zza = zzfxf;
    }

    public final void binderDied() {
        zzfxf.zzh(this.zza);
    }
}
