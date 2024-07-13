package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzasi;
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
public final class zzbo extends zzasg implements zzbq {
    zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.zzbn zze() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 1
            android.os.Parcel r0 = r4.zzbk(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.zzbn
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.ads.internal.client.zzbn r1 = (com.google.android.gms.ads.internal.client.zzbn) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.ads.internal.client.zzbl r2 = new com.google.android.gms.ads.internal.client.zzbl
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzbo.zze():com.google.android.gms.ads.internal.client.zzbn");
    }

    public final void zzf(zzbnj zzbnj) throws RemoteException {
        throw null;
    }

    public final void zzg(zzbnm zzbnm) throws RemoteException {
        throw null;
    }

    public final void zzh(String str, zzbns zzbns, zzbnp zzbnp) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzasi.zzg(zza, zzbns);
        zzasi.zzg(zza, zzbnp);
        zzbl(5, zza);
    }

    public final void zzi(zzbsu zzbsu) throws RemoteException {
        throw null;
    }

    public final void zzj(zzbnw zzbnw, zzq zzq) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzbnw);
        zzasi.zze(zza, zzq);
        zzbl(8, zza);
    }

    public final void zzk(zzbnz zzbnz) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzbnz);
        zzbl(10, zza);
    }

    public final void zzl(zzbh zzbh) throws RemoteException {
        Parcel zza = zza();
        zzasi.zzg(zza, zzbh);
        zzbl(2, zza);
    }

    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, adManagerAdViewOptions);
        zzbl(15, zza);
    }

    public final void zzn(zzbsl zzbsl) throws RemoteException {
        throw null;
    }

    public final void zzo(zzblz zzblz) throws RemoteException {
        Parcel zza = zza();
        zzasi.zze(zza, zzblz);
        zzbl(6, zza);
    }

    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    public final void zzq(zzcf zzcf) throws RemoteException {
        throw null;
    }
}
