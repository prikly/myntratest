package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzerf extends zzbm {
    private final zzesm zza;

    public zzerf(Context context, zzcpj zzcpj, zzfje zzfje, zzdqr zzdqr, zzbh zzbh) {
        zzeso zzeso = new zzeso(zzdqr, zzcpj.zzy());
        zzeso.zze(zzbh);
        this.zza = new zzesm(new zzesy(zzcpj, context, zzeso, zzfje), zzfje.zzI());
    }

    public final synchronized String zze() {
        return this.zza.zza();
    }

    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    public final void zzg(zzl zzl) throws RemoteException {
        this.zza.zzd(zzl, 1);
    }

    public final synchronized void zzh(zzl zzl, int i) throws RemoteException {
        this.zza.zzd(zzl, i);
    }

    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
