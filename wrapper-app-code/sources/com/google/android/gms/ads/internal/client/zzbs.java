package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbke;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzccx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbs extends zzasg implements zzbu {
    zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final void zzA() throws RemoteException {
        zzbl(11, zza());
    }

    public final void zzB() throws RemoteException {
        zzbl(6, zza());
    }

    public final void zzC(zzbe zzbe) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzbe);
        zzbl(20, zza);
    }

    public final void zzD(zzbh zzbh) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzbh);
        zzbl(7, zza);
    }

    public final void zzE(zzby zzby) throws RemoteException {
        throw null;
    }

    public final void zzF(zzq zzq) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzq);
        zzbl(13, zza);
    }

    public final void zzG(zzcb zzcb) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzcb);
        zzbl(8, zza);
    }

    public final void zzH(zzbdt zzbdt) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzbdt);
        zzbl(40, zza);
    }

    public final void zzI(zzw zzw) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzw);
        zzbl(39, zza);
    }

    public final void zzJ(zzci zzci) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzci);
        zzbl(45, zza);
    }

    public final void zzK(zzdu zzdu) throws RemoteException {
        throw null;
    }

    public final void zzL(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzd(zza, z);
        zzbl(34, zza);
    }

    public final void zzM(zzbzz zzbzz) throws RemoteException {
        throw null;
    }

    public final void zzN(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzd(zza, z);
        zzbl(22, zza);
    }

    public final void zzO(zzbke zzbke) throws RemoteException {
        throw null;
    }

    public final void zzP(zzdg zzdg) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzdg);
        zzbl(42, zza);
    }

    public final void zzQ(zzcac zzcac, String str) throws RemoteException {
        throw null;
    }

    public final void zzR(String str) throws RemoteException {
        throw null;
    }

    public final void zzS(zzccx zzccx) throws RemoteException {
        throw null;
    }

    public final void zzT(String str) throws RemoteException {
        throw null;
    }

    public final void zzU(zzfl zzfl) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzfl);
        zzbl(29, zza);
    }

    public final void zzW(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzbl(44, zza);
    }

    public final void zzX() throws RemoteException {
        throw null;
    }

    public final boolean zzY() throws RemoteException {
        Parcel zzbk = zzbk(23, zza());
        boolean zzh = zzasi.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final boolean zzZ() throws RemoteException {
        throw null;
    }

    public final boolean zzaa(zzl zzl) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzl);
        Parcel zzbk = zzbk(4, zza);
        boolean zzh = zzasi.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final void zzab(zzcf zzcf) throws RemoteException {
        throw null;
    }

    public final Bundle zzd() throws RemoteException {
        throw null;
    }

    public final zzq zzg() throws RemoteException {
        Parcel zzbk = zzbk(12, zza());
        zzq zzq = (zzq) zzasi.zza(zzbk, zzq.CREATOR);
        zzbk.recycle();
        return zzq;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbh zzi() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 33
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzbh
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzbh r1 = (com.google.android.gms.ads.internal.client.zzbh) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzbf r2 = new com.google.android.gms.ads.internal.client.zzbf
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbs.zzi():com.google.android.gms.ads.internal.client.zzbh");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzcb zzj() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 32
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzcb
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzcb r1 = (com.google.android.gms.ads.internal.client.zzcb) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzbz r2 = new com.google.android.gms.ads.internal.client.zzbz
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbs.zzj():com.google.android.gms.ads.internal.client.zzcb");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzdn zzk() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 41
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzdn
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzdn r1 = (com.google.android.gms.ads.internal.client.zzdn) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzdl r2 = new com.google.android.gms.ads.internal.client.zzdl
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbs.zzk():com.google.android.gms.ads.internal.client.zzdn");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzdq zzl() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 26
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoController"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzdq
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.zzdq r1 = (com.google.android.gms.ads.internal.client.zzdq) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.zzdo r2 = new com.google.android.gms.ads.internal.client.zzdo
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbs.zzl():com.google.android.gms.ads.internal.client.zzdq");
    }

    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzbk = zzbk(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    public final String zzr() throws RemoteException {
        Parcel zzbk = zzbk(31, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzs() throws RemoteException {
        throw null;
    }

    public final String zzt() throws RemoteException {
        throw null;
    }

    public final void zzx() throws RemoteException {
        zzbl(2, zza());
    }

    public final void zzy(zzl zzl, zzbk zzbk) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzl);
        zzasi.zzg(zza, zzbk);
        zzbl(43, zza);
    }

    public final void zzz() throws RemoteException {
        zzbl(5, zza());
    }
}
