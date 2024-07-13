package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbwg extends zzasg implements zzbwi {
    zzbwg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public final boolean zzA() throws RemoteException {
        Parcel zzbk = zzbk(18, zza());
        boolean zzh = zzasi.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final boolean zzB() throws RemoteException {
        Parcel zzbk = zzbk(17, zza());
        boolean zzh = zzasi.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final double zze() throws RemoteException {
        Parcel zzbk = zzbk(8, zza());
        double readDouble = zzbk.readDouble();
        zzbk.recycle();
        return readDouble;
    }

    public final float zzf() throws RemoteException {
        Parcel zzbk = zzbk(23, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    public final float zzg() throws RemoteException {
        Parcel zzbk = zzbk(25, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    public final float zzh() throws RemoteException {
        Parcel zzbk = zzbk(24, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    public final Bundle zzi() throws RemoteException {
        Parcel zzbk = zzbk(16, zza());
        Bundle bundle = (Bundle) zzasi.zza(zzbk, Bundle.CREATOR);
        zzbk.recycle();
        return bundle;
    }

    public final zzdq zzj() throws RemoteException {
        Parcel zzbk = zzbk(11, zza());
        zzdq zzb = zzdp.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    public final zzbmd zzk() throws RemoteException {
        Parcel zzbk = zzbk(12, zza());
        zzbmd zzj = zzbmc.zzj(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzj;
    }

    public final zzbml zzl() throws RemoteException {
        Parcel zzbk = zzbk(5, zza());
        zzbml zzg = zzbmk.zzg(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzg;
    }

    public final IObjectWrapper zzm() throws RemoteException {
        Parcel zzbk = zzbk(13, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzbk = zzbk(14, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzo() throws RemoteException {
        Parcel zzbk = zzbk(15, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    public final String zzp() throws RemoteException {
        Parcel zzbk = zzbk(7, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzq() throws RemoteException {
        Parcel zzbk = zzbk(4, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzr() throws RemoteException {
        Parcel zzbk = zzbk(6, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzs() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzt() throws RemoteException {
        Parcel zzbk = zzbk(10, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzu() throws RemoteException {
        Parcel zzbk = zzbk(9, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final List zzv() throws RemoteException {
        Parcel zzbk = zzbk(3, zza());
        ArrayList zzb = zzasi.zzb(zzbk);
        zzbk.recycle();
        return zzb;
    }

    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzbl(20, zza);
    }

    public final void zzx() throws RemoteException {
        zzbl(19, zza());
    }

    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zzg(zza, iObjectWrapper2);
        zzasi.zzg(zza, iObjectWrapper3);
        zzbl(21, zza);
    }

    public final void zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzbl(22, zza);
    }
}
