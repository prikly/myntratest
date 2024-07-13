package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzchh;
import com.google.android.gms.internal.ads.zzcho;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzet extends zzbm {
    final /* synthetic */ zzeu zza;

    /* synthetic */ zzet(zzeu zzeu, zzes zzes) {
        this.zza = zzeu;
    }

    public final String zze() throws RemoteException {
        return null;
    }

    public final String zzf() throws RemoteException {
        return null;
    }

    public final void zzg(zzl zzl) throws RemoteException {
        zzh(zzl, 1);
    }

    public final void zzh(zzl zzl, int i) throws RemoteException {
        zzcho.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzchh.zza.post(new zzer(this));
    }

    public final boolean zzi() throws RemoteException {
        return false;
    }
}
