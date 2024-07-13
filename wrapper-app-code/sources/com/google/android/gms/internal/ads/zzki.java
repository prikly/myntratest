package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzki extends BroadcastReceiver {
    final /* synthetic */ zzkj zza;

    /* synthetic */ zzki(zzkj zzkj, zzkh zzkh) {
        this.zza = zzkj;
    }

    public final void onReceive(Context context, Intent intent) {
        zzkj zzkj = this.zza;
        zzkj.zzb.post(new zzkg(zzkj));
    }
}
