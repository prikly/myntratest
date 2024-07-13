package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcgu extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzcgx zza;

    zzcgu(zzcgx zzcgx) {
        this.zza = zzcgx;
    }

    public final void onAvailable(Network network) {
        this.zza.zzn.set(true);
    }

    public final void onLost(Network network) {
        this.zza.zzn.set(false);
    }
}
