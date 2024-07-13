package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public interface zzbdq extends IInterface {
    zzbu zze() throws RemoteException;

    zzdn zzf() throws RemoteException;

    void zzg(boolean z) throws RemoteException;

    void zzh(zzdg zzdg) throws RemoteException;

    void zzi(IObjectWrapper iObjectWrapper, zzbdx zzbdx) throws RemoteException;

    void zzj(zzbdu zzbdu) throws RemoteException;
}
