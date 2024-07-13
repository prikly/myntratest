package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzeox extends zzepy {
    private final zzdml zza;

    public zzeox(zzdel zzdel, zzdma zzdma, zzdff zzdff, zzdfu zzdfu, zzdfz zzdfz, zzdfa zzdfa, zzdjh zzdjh, zzdms zzdms, zzdgt zzdgt, zzdml zzdml, zzdjd zzdjd) {
        super(zzdel, zzdma, zzdff, zzdfu, zzdfz, zzdjh, zzdgt, zzdms, zzdjd, zzdfa);
        this.zza = zzdml;
    }

    public final void zzs(zzcdd zzcdd) {
        this.zza.zza(zzcdd);
    }

    public final void zzt(zzcdh zzcdh) throws RemoteException {
        this.zza.zza(new zzcdd(zzcdh.zzf(), zzcdh.zze()));
    }

    public final void zzu() throws RemoteException {
        this.zza.zzb();
    }

    public final void zzv() {
        this.zza.zzb();
    }

    public final void zzy() {
        this.zza.zzc();
    }
}
