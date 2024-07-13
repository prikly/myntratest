package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbmg extends zzasg implements zzbmi {
    zzbmg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public final float zze() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    public final float zzf() throws RemoteException {
        Parcel zzbk = zzbk(6, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    public final float zzg() throws RemoteException {
        Parcel zzbk = zzbk(5, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    public final zzdq zzh() throws RemoteException {
        Parcel zzbk = zzbk(7, zza());
        zzdq zzb = zzdp.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    public final IObjectWrapper zzi() throws RemoteException {
        Parcel zzbk = zzbk(4, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzbl(3, zza);
    }

    public final boolean zzk() throws RemoteException {
        Parcel zzbk = zzbk(8, zza());
        boolean zzh = zzasi.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final void zzl(zzbnt zzbnt) throws RemoteException {
        throw null;
    }
}
