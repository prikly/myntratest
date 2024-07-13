package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzcge extends zzash implements zzcgf {
    public zzcge() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzcgf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof zzcgf ? (zzcgf) queryLocalInterface : new zzcgd(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbK(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcgc zzcgc = null;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcgj zzcgj = (zzcgj) zzasi.zza(parcel, zzcgj.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzcgc = queryLocalInterface instanceof zzcgc ? (zzcgc) queryLocalInterface : new zzcga(readStrongBinder);
                }
                zzasi.zzc(parcel);
                zze(asInterface, zzcgj, zzcgc);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasi.zzc(parcel);
                zzj(asInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasi.zzc(parcel);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, (IInterface) null);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasi.zzc(parcel);
                parcel2.writeNoException();
                zzasi.zzg(parcel2, (IInterface) null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcaf zzb = zzcae.zzb(parcel.readStrongBinder());
                zzasi.zzc(parcel);
                zzl(createTypedArrayList, asInterface3, zzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcaf zzb2 = zzcae.zzb(parcel.readStrongBinder());
                zzasi.zzc(parcel);
                zzk(createTypedArrayList2, asInterface4, zzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzasi.zzc(parcel);
                zzf((zzcao) zzasi.zza(parcel, zzcao.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzasi.zzc(parcel);
                zzi(asInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcaf zzb3 = zzcae.zzb(parcel.readStrongBinder());
                zzasi.zzc(parcel);
                zzh(createTypedArrayList3, asInterface6, zzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcaf zzb4 = zzcae.zzb(parcel.readStrongBinder());
                zzasi.zzc(parcel);
                zzg(createTypedArrayList4, asInterface7, zzb4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
