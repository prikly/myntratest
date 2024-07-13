package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzbrz;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbvt;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzcm extends zzasg implements zzco {
    zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final float zze() throws RemoteException {
        Parcel zzbk = zzbk(7, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    public final String zzf() throws RemoteException {
        Parcel zzbk = zzbk(9, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final List zzg() throws RemoteException {
        Parcel zzbk = zzbk(13, zza());
        ArrayList<zzbrz> createTypedArrayList = zzbk.createTypedArrayList(zzbrz.CREATOR);
        zzbk.recycle();
        return createTypedArrayList;
    }

    public final void zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(10, zza);
    }

    public final void zzi() throws RemoteException {
        zzbl(15, zza());
    }

    public final void zzj(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzd(zza, z);
        zzbl(17, zza);
    }

    public final void zzk() throws RemoteException {
        zzbl(1, zza());
    }

    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString((String) null);
        zzasi.zzg(zza, iObjectWrapper);
        zzbl(6, zza);
    }

    public final void zzm(zzda zzda) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzda);
        zzbl(16, zza);
    }

    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzbl(5, zza);
    }

    public final void zzo(zzbvt zzbvt) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzbvt);
        zzbl(11, zza);
    }

    public final void zzp(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzd(zza, z);
        zzbl(4, zza);
    }

    public final void zzq(float f2) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f2);
        zzbl(2, zza);
    }

    public final void zzr(String str) throws RemoteException {
        throw null;
    }

    public final void zzs(zzbsg zzbsg) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzbsg);
        zzbl(12, zza);
    }

    public final void zzt(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(18, zza);
    }

    public final void zzu(zzff zzff) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzff);
        zzbl(14, zza);
    }

    public final boolean zzv() throws RemoteException {
        Parcel zzbk = zzbk(8, zza());
        boolean zzh = zzasi.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
