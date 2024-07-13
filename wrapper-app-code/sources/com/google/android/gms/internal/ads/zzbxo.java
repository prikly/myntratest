package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbxo extends zzasg implements zzbxq {
    zzbxo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public final zzdq zze() throws RemoteException {
        Parcel zzbk = zzbk(5, zza());
        zzdq zzb = zzdp.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    public final zzbye zzf() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        zzbye zzbye = (zzbye) zzasi.zza(zzbk, zzbye.CREATOR);
        zzbk.recycle();
        return zzbye;
    }

    public final zzbye zzg() throws RemoteException {
        Parcel zzbk = zzbk(3, zza());
        zzbye zzbye = (zzbye) zzasi.zza(zzbk, zzbye.CREATOR);
        zzbk.recycle();
        return zzbye;
    }

    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzq zzq, zzbxt zzbxt) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzasi.zze(zza, bundle);
        zzasi.zze(zza, bundle2);
        zzasi.zze(zza, zzq);
        zzasi.zzg(zza, zzbxt);
        zzbl(1, zza);
    }

    public final void zzi(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbxb zzbxb, zzbvz zzbvz) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasi.zze(zza, zzl);
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zzg(zza, zzbxb);
        zzasi.zzg(zza, zzbvz);
        zzbl(23, zza);
    }

    public final void zzj(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbxe zzbxe, zzbvz zzbvz, zzq zzq) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasi.zze(zza, zzl);
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zzg(zza, zzbxe);
        zzasi.zzg(zza, zzbvz);
        zzasi.zze(zza, zzq);
        zzbl(13, zza);
    }

    public final void zzk(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbxe zzbxe, zzbvz zzbvz, zzq zzq) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasi.zze(zza, zzl);
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zzg(zza, zzbxe);
        zzasi.zzg(zza, zzbvz);
        zzasi.zze(zza, zzq);
        zzbl(21, zza);
    }

    public final void zzl(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbxh zzbxh, zzbvz zzbvz) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasi.zze(zza, zzl);
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zzg(zza, zzbxh);
        zzasi.zzg(zza, zzbvz);
        zzbl(14, zza);
    }

    public final void zzm(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbxk zzbxk, zzbvz zzbvz) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasi.zze(zza, zzl);
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zzg(zza, zzbxk);
        zzasi.zzg(zza, zzbvz);
        zzbl(18, zza);
    }

    public final void zzn(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbxk zzbxk, zzbvz zzbvz, zzblz zzblz) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasi.zze(zza, zzl);
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zzg(zza, zzbxk);
        zzasi.zzg(zza, zzbvz);
        zzasi.zze(zza, zzblz);
        zzbl(22, zza);
    }

    public final void zzo(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbxn zzbxn, zzbvz zzbvz) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasi.zze(zza, zzl);
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zzg(zza, zzbxn);
        zzasi.zzg(zza, zzbvz);
        zzbl(20, zza);
    }

    public final void zzp(String str, String str2, zzl zzl, IObjectWrapper iObjectWrapper, zzbxn zzbxn, zzbvz zzbvz) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasi.zze(zza, zzl);
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zzg(zza, zzbxn);
        zzasi.zzg(zza, zzbvz);
        zzbl(16, zza);
    }

    public final void zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(19, zza);
    }

    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(24, zza);
        boolean zzh = zzasi.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(15, zza);
        boolean zzh = zzasi.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(17, zza);
        boolean zzh = zzasi.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
