package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbwf extends zzasg implements IInterface {
    zzbwf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() throws RemoteException {
        Parcel zzbk = zzbk(13, zza());
        Bundle bundle = (Bundle) zzasi.zza(zzbk, Bundle.CREATOR);
        zzbk.recycle();
        return bundle;
    }

    public final zzdq zzf() throws RemoteException {
        Parcel zzbk = zzbk(16, zza());
        zzdq zzb = zzdp.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    public final zzbmd zzg() throws RemoteException {
        Parcel zzbk = zzbk(19, zza());
        zzbmd zzj = zzbmc.zzj(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzj;
    }

    public final zzbml zzh() throws RemoteException {
        Parcel zzbk = zzbk(5, zza());
        zzbml zzg = zzbmk.zzg(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzg;
    }

    public final IObjectWrapper zzi() throws RemoteException {
        Parcel zzbk = zzbk(15, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzj() throws RemoteException {
        Parcel zzbk = zzbk(20, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzk() throws RemoteException {
        Parcel zzbk = zzbk(21, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    public final String zzl() throws RemoteException {
        Parcel zzbk = zzbk(7, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzm() throws RemoteException {
        Parcel zzbk = zzbk(4, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzn() throws RemoteException {
        Parcel zzbk = zzbk(6, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzo() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final List zzp() throws RemoteException {
        Parcel zzbk = zzbk(3, zza());
        ArrayList zzb = zzasi.zzb(zzbk);
        zzbk.recycle();
        return zzb;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzbl(9, zza);
    }

    public final void zzr() throws RemoteException {
        zzbl(8, zza());
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzbl(10, zza);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zzg(zza, iObjectWrapper2);
        zzasi.zzg(zza, iObjectWrapper3);
        zzbl(22, zza);
    }

    public final void zzu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzbl(14, zza);
    }

    public final boolean zzv() throws RemoteException {
        Parcel zzbk = zzbk(12, zza());
        boolean zzh = zzasi.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final boolean zzw() throws RemoteException {
        Parcel zzbk = zzbk(11, zza());
        boolean zzh = zzasi.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
