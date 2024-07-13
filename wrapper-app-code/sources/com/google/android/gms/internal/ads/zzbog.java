package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbog extends zzasg implements zzboi {
    zzbog(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    public final void zzA() throws RemoteException {
        zzbl(28, zza());
    }

    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, bundle);
        zzbl(17, zza);
    }

    public final void zzC() throws RemoteException {
        zzbl(27, zza());
    }

    public final void zzD(zzcs zzcs) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzcs);
        zzbl(26, zza);
    }

    public final void zzE(zzdg zzdg) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzdg);
        zzbl(32, zza);
    }

    public final void zzF(zzbof zzbof) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzbof);
        zzbl(21, zza);
    }

    public final boolean zzG() throws RemoteException {
        Parcel zzbk = zzbk(30, zza());
        boolean zzh = zzasi.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final boolean zzH() throws RemoteException {
        Parcel zzbk = zzbk(24, zza());
        boolean zzh = zzasi.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final boolean zzI(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, bundle);
        Parcel zzbk = zzbk(16, zza);
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

    public final Bundle zzf() throws RemoteException {
        Parcel zzbk = zzbk(20, zza());
        Bundle bundle = (Bundle) zzasi.zza(zzbk, Bundle.CREATOR);
        zzbk.recycle();
        return bundle;
    }

    public final zzdn zzg() throws RemoteException {
        Parcel zzbk = zzbk(31, zza());
        zzdn zzb = zzdm.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    public final zzdq zzh() throws RemoteException {
        Parcel zzbk = zzbk(11, zza());
        zzdq zzb = zzdp.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbmd zzi() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 14
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IAttributionInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbmd
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbmd r1 = (com.google.android.gms.internal.ads.zzbmd) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbmb r2 = new com.google.android.gms.internal.ads.zzbmb
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbog.zzi():com.google.android.gms.internal.ads.zzbmd");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbmi zzj() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 29
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbmi
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbmi r1 = (com.google.android.gms.internal.ads.zzbmi) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbmg r2 = new com.google.android.gms.internal.ads.zzbmg
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbog.zzj():com.google.android.gms.internal.ads.zzbmi");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbml zzk() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 5
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbml
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.zzbml r1 = (com.google.android.gms.internal.ads.zzbml) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.zzbmj r2 = new com.google.android.gms.internal.ads.zzbmj
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbog.zzk():com.google.android.gms.internal.ads.zzbml");
    }

    public final IObjectWrapper zzl() throws RemoteException {
        Parcel zzbk = zzbk(19, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    public final IObjectWrapper zzm() throws RemoteException {
        Parcel zzbk = zzbk(18, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    public final String zzn() throws RemoteException {
        Parcel zzbk = zzbk(7, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzo() throws RemoteException {
        Parcel zzbk = zzbk(4, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzp() throws RemoteException {
        Parcel zzbk = zzbk(6, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzq() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzr() throws RemoteException {
        Parcel zzbk = zzbk(12, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzs() throws RemoteException {
        Parcel zzbk = zzbk(10, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final String zzt() throws RemoteException {
        Parcel zzbk = zzbk(9, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    public final List zzu() throws RemoteException {
        Parcel zzbk = zzbk(3, zza());
        ArrayList zzb = zzasi.zzb(zzbk);
        zzbk.recycle();
        return zzb;
    }

    public final List zzv() throws RemoteException {
        Parcel zzbk = zzbk(23, zza());
        ArrayList zzb = zzasi.zzb(zzbk);
        zzbk.recycle();
        return zzb;
    }

    public final void zzw() throws RemoteException {
        zzbl(22, zza());
    }

    public final void zzx() throws RemoteException {
        zzbl(13, zza());
    }

    public final void zzy(zzcw zzcw) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzcw);
        zzbl(25, zza);
    }

    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, bundle);
        zzbl(15, zza);
    }
}
