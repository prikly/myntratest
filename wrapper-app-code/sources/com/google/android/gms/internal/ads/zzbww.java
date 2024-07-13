package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbww extends zzbvy {
    private final Adapter zza;
    private final zzcdc zzb;

    zzbww(Adapter adapter, zzcdc zzcdc) {
        this.zza = adapter;
        this.zzb = zzcdc;
    }

    public final void zze() throws RemoteException {
        zzcdc zzcdc = this.zzb;
        if (zzcdc != null) {
            zzcdc.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzf() throws RemoteException {
        zzcdc zzcdc = this.zzb;
        if (zzcdc != null) {
            zzcdc.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzg(int i) throws RemoteException {
        zzcdc zzcdc = this.zzb;
        if (zzcdc != null) {
            zzcdc.zzg(ObjectWrapper.wrap(this.zza), i);
        }
    }

    public final void zzh(zze zze) throws RemoteException {
    }

    public final void zzi(int i, String str) throws RemoteException {
    }

    public final void zzj(int i) throws RemoteException {
    }

    public final void zzk(zze zze) {
    }

    public final void zzl(String str) {
    }

    public final void zzm() throws RemoteException {
    }

    public final void zzn() throws RemoteException {
    }

    public final void zzo() throws RemoteException {
        zzcdc zzcdc = this.zzb;
        if (zzcdc != null) {
            zzcdc.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzp() throws RemoteException {
        zzcdc zzcdc = this.zzb;
        if (zzcdc != null) {
            zzcdc.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzq(String str, String str2) throws RemoteException {
    }

    public final void zzr(zzbnf zzbnf, String str) throws RemoteException {
    }

    public final void zzs(zzcdd zzcdd) throws RemoteException {
    }

    public final void zzt(zzcdh zzcdh) throws RemoteException {
        zzcdc zzcdc = this.zzb;
        if (zzcdc != null) {
            zzcdc.zzm(ObjectWrapper.wrap(this.zza), new zzcdd(zzcdh.zzf(), zzcdh.zze()));
        }
    }

    public final void zzu() throws RemoteException {
        zzcdc zzcdc = this.zzb;
        if (zzcdc != null) {
            zzcdc.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzv() throws RemoteException {
    }

    public final void zzw() throws RemoteException {
    }

    public final void zzx() throws RemoteException {
    }

    public final void zzy() throws RemoteException {
        zzcdc zzcdc = this.zzb;
        if (zzcdc != null) {
            zzcdc.zzo(ObjectWrapper.wrap(this.zza));
        }
    }
}
