package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdqf extends zzdp {
    private final Object zza = new Object();
    private final zzdq zzb;
    private final zzbwi zzc;

    public zzdqf(zzdq zzdq, zzbwi zzbwi) {
        this.zzb = zzdq;
        this.zzc = zzbwi;
    }

    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    public final float zzf() throws RemoteException {
        zzbwi zzbwi = this.zzc;
        if (zzbwi != null) {
            return zzbwi.zzg();
        }
        return 0.0f;
    }

    public final float zzg() throws RemoteException {
        zzbwi zzbwi = this.zzc;
        if (zzbwi != null) {
            return zzbwi.zzh();
        }
        return 0.0f;
    }

    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    public final zzdt zzi() throws RemoteException {
        synchronized (this.zza) {
            zzdq zzdq = this.zzb;
            if (zzdq == null) {
                return null;
            }
            zzdt zzi = zzdq.zzi();
            return zzi;
        }
    }

    public final void zzj(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzm(zzdt zzdt) throws RemoteException {
        synchronized (this.zza) {
            zzdq zzdq = this.zzb;
            if (zzdq != null) {
                zzdq.zzm(zzdt);
            }
        }
    }

    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
