package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfxe implements ServiceConnection {
    final /* synthetic */ zzfxf zza;

    /* synthetic */ zzfxe(zzfxf zzfxf, zzfxd zzfxd) {
        this.zza = zzfxf;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zza.zzc.zzd("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        zzfxf zzfxf = this.zza;
        zzfxf.zzc().post(new zzfxb(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zzc.zzd("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        zzfxf zzfxf = this.zza;
        zzfxf.zzc().post(new zzfxc(this));
    }
}
