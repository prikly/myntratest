package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfua {
    final /* synthetic */ zzfub zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfua(zzfub zzfub, byte[] bArr, zzftz zzftz) {
        this.zza = zzfub;
        this.zzb = bArr;
    }

    public final zzfua zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfua zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfub zzfub = this.zza;
            if (zzfub.zzb) {
                zzfub.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh((int[]) null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e2) {
            Log.d("GASS", "Clearcut log failed", e2);
        }
    }
}
