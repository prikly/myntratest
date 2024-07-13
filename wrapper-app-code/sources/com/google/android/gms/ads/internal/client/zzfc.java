package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzcdh;
import com.google.android.gms.internal.ads.zzcdj;
import com.google.android.gms.internal.ads.zzcdn;
import com.google.android.gms.internal.ads.zzcdr;
import com.google.android.gms.internal.ads.zzcds;
import com.google.android.gms.internal.ads.zzcdy;
import com.google.android.gms.internal.ads.zzchh;
import com.google.android.gms.internal.ads.zzcho;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzfc extends zzcdj {
    private static void zzr(zzcdr zzcdr) {
        zzcho.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzchh.zza.post(new zzfb(zzcdr));
    }

    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    public final zzdn zzc() {
        return null;
    }

    public final zzcdh zzd() {
        return null;
    }

    public final String zze() throws RemoteException {
        return "";
    }

    public final void zzf(zzl zzl, zzcdr zzcdr) throws RemoteException {
        zzr(zzcdr);
    }

    public final void zzg(zzl zzl, zzcdr zzcdr) throws RemoteException {
        zzr(zzcdr);
    }

    public final void zzh(boolean z) {
    }

    public final void zzi(zzdd zzdd) throws RemoteException {
    }

    public final void zzj(zzdg zzdg) {
    }

    public final void zzk(zzcdn zzcdn) throws RemoteException {
    }

    public final void zzl(zzcdy zzcdy) {
    }

    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) {
    }

    public final boolean zzo() throws RemoteException {
        return false;
    }

    public final void zzp(zzcds zzcds) throws RemoteException {
    }
}
