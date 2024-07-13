package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzapm extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzapn zza;

    zzapm(zzapn zzapn) {
        this.zza = zzapn;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzapn.class) {
            this.zza.zza = networkCapabilities;
        }
    }

    public final void onLost(Network network) {
        synchronized (zzapn.class) {
            this.zza.zza = null;
        }
    }
}
