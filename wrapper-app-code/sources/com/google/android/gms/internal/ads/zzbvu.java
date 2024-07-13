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
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbvu extends zzasg implements zzbvw {
    zzbvu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final void zzA(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbvz zzbvz) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zze(zza, zzl);
        zza.writeString(str);
        zzasi.zzg(zza, zzbvz);
        zzbl(28, zza);
    }

    public final void zzB(zzl zzl, String str, String str2) throws RemoteException {
        throw null;
    }

    public final void zzC(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbvz zzbvz) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zze(zza, zzl);
        zza.writeString(str);
        zzasi.zzg(zza, zzbvz);
        zzbl(32, zza);
    }

    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzbl(21, zza);
    }

    public final void zzE() throws RemoteException {
        zzbl(8, zza());
    }

    public final void zzF() throws RemoteException {
        zzbl(9, zza());
    }

    public final void zzG(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzd(zza, z);
        zzbl(25, zza);
    }

    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzbl(39, zza);
    }

    public final void zzI() throws RemoteException {
        zzbl(4, zza());
    }

    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzbl(37, zza);
    }

    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzbl(30, zza);
    }

    public final void zzL() throws RemoteException {
        zzbl(12, zza());
    }

    public final boolean zzM() throws RemoteException {
        Parcel zzbk = zzbk(22, zza());
        boolean zzh = zzasi.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final boolean zzN() throws RemoteException {
        Parcel zzbk = zzbk(13, zza());
        boolean zzh = zzasi.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbwe zzO() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 15
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbwe
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbwe r1 = (com.google.android.gms.internal.ads.zzbwe) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbwe r2 = new com.google.android.gms.internal.ads.zzbwe
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvu.zzO():com.google.android.gms.internal.ads.zzbwe");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbwf zzP() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 16
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbwf
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbwf r1 = (com.google.android.gms.internal.ads.zzbwf) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbwf r2 = new com.google.android.gms.internal.ads.zzbwf
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvu.zzP():com.google.android.gms.internal.ads.zzbwf");
    }

    public final Bundle zze() throws RemoteException {
        throw null;
    }

    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    public final zzdq zzh() throws RemoteException {
        Parcel zzbk = zzbk(26, zza());
        zzdq zzb = zzdp.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    public final zzbnf zzi() throws RemoteException {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbwc zzj() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 36
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbwc
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbwc r1 = (com.google.android.gms.internal.ads.zzbwc) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbwa r2 = new com.google.android.gms.internal.ads.zzbwa
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvu.zzj():com.google.android.gms.internal.ads.zzbwc");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbwi zzk() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 27
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbwi
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbwi r1 = (com.google.android.gms.internal.ads.zzbwi) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbwg r2 = new com.google.android.gms.internal.ads.zzbwg
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbvu.zzk():com.google.android.gms.internal.ads.zzbwi");
    }

    public final zzbye zzl() throws RemoteException {
        Parcel zzbk = zzbk(33, zza());
        zzbye zzbye = (zzbye) zzasi.zza(zzbk, zzbye.CREATOR);
        zzbk.recycle();
        return zzbye;
    }

    public final zzbye zzm() throws RemoteException {
        Parcel zzbk = zzbk(34, zza());
        zzbye zzbye = (zzbye) zzasi.zza(zzbk, zzbye.CREATOR);
        zzbk.recycle();
        return zzbye;
    }

    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    public final void zzo() throws RemoteException {
        zzbl(5, zza());
    }

    public final void zzp(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzcdc zzcdc, String str2) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zze(zza, zzl);
        zza.writeString((String) null);
        zzasi.zzg(zza, zzcdc);
        zza.writeString(str2);
        zzbl(10, zza);
    }

    public final void zzq(IObjectWrapper iObjectWrapper, zzbsd zzbsd, List list) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zzg(zza, zzbsd);
        zza.writeTypedList(list);
        zzbl(31, zza);
    }

    public final void zzr(IObjectWrapper iObjectWrapper, zzcdc zzcdc, List list) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zzg(zza, zzcdc);
        zza.writeStringList(list);
        zzbl(23, zza);
    }

    public final void zzs(zzl zzl, String str) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzl);
        zza.writeString(str);
        zzbl(11, zza);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbvz zzbvz) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zze(zza, zzl);
        zza.writeString(str);
        zzasi.zzg(zza, zzbvz);
        zzbl(38, zza);
    }

    public final void zzu(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, zzbvz zzbvz) throws RemoteException {
        throw null;
    }

    public final void zzv(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbvz zzbvz) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zze(zza, zzq);
        zzasi.zze(zza, zzl);
        zza.writeString(str);
        zza.writeString(str2);
        zzasi.zzg(zza, zzbvz);
        zzbl(6, zza);
    }

    public final void zzw(IObjectWrapper iObjectWrapper, zzq zzq, zzl zzl, String str, String str2, zzbvz zzbvz) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zze(zza, zzq);
        zzasi.zze(zza, zzl);
        zza.writeString(str);
        zza.writeString(str2);
        zzasi.zzg(zza, zzbvz);
        zzbl(35, zza);
    }

    public final void zzx(IObjectWrapper iObjectWrapper, zzl zzl, String str, zzbvz zzbvz) throws RemoteException {
        throw null;
    }

    public final void zzy(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbvz zzbvz) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zze(zza, zzl);
        zza.writeString(str);
        zza.writeString(str2);
        zzasi.zzg(zza, zzbvz);
        zzbl(7, zza);
    }

    public final void zzz(IObjectWrapper iObjectWrapper, zzl zzl, String str, String str2, zzbvz zzbvz, zzblz zzblz, List list) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, iObjectWrapper);
        zzasi.zze(zza, zzl);
        zza.writeString(str);
        zza.writeString(str2);
        zzasi.zzg(zza, zzbvz);
        zzasi.zze(zza, zzblz);
        zza.writeStringList(list);
        zzbl(14, zza);
    }
}
