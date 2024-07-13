package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzesm {
    private final zzesr zza;
    private final String zzb;
    /* access modifiers changed from: private */
    public zzdn zzc;

    public zzesm(zzesr zzesr, String str) {
        this.zza = zzesr;
        this.zzb = str;
    }

    public final synchronized String zza() {
        String str;
        str = null;
        try {
            zzdn zzdn = this.zzc;
            if (zzdn != null) {
                str = zzdn.zzg();
            }
        } catch (RemoteException e2) {
            zze.zzl("#007 Could not call remote method.", e2);
            return null;
        }
        return str;
    }

    public final synchronized String zzb() {
        String str;
        str = null;
        try {
            zzdn zzdn = this.zzc;
            if (zzdn != null) {
                str = zzdn.zzg();
            }
        } catch (RemoteException e2) {
            zze.zzl("#007 Could not call remote method.", e2);
            return null;
        }
        return str;
    }

    public final synchronized void zzd(zzl zzl, int i) throws RemoteException {
        this.zzc = null;
        this.zza.zzb(zzl, this.zzb, new zzess(i), new zzesl(this));
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
