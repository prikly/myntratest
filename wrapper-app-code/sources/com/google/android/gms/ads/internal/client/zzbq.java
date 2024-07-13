package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbnj;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbnp;
import com.google.android.gms.internal.ads.zzbns;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzbsl;
import com.google.android.gms.internal.ads.zzbsu;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public interface zzbq extends IInterface {
    zzbn zze() throws RemoteException;

    void zzf(zzbnj zzbnj) throws RemoteException;

    void zzg(zzbnm zzbnm) throws RemoteException;

    void zzh(String str, zzbns zzbns, zzbnp zzbnp) throws RemoteException;

    void zzi(zzbsu zzbsu) throws RemoteException;

    void zzj(zzbnw zzbnw, zzq zzq) throws RemoteException;

    void zzk(zzbnz zzbnz) throws RemoteException;

    void zzl(zzbh zzbh) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzbsl zzbsl) throws RemoteException;

    void zzo(zzblz zzblz) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcf zzcf) throws RemoteException;
}
