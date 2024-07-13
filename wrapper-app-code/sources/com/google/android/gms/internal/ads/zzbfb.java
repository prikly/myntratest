package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbfb {
    final /* synthetic */ zzbfc zza;
    private final byte[] zzb;
    private int zzc;

    /* synthetic */ zzbfb(zzbfc zzbfc, byte[] bArr, zzbfa zzbfa) {
        this.zza = zzbfc;
        this.zzb = bArr;
    }

    /* access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzbfc zzbfc = this.zza;
            if (zzbfc.zzb) {
                zzbfc.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh((int[]) null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e2) {
            zzcho.zzf("Clearcut log failed", e2);
        }
    }

    public final zzbfb zza(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzjh)).booleanValue()) {
            this.zza.zzc.execute(new zzbez(this));
        } else {
            zzd();
        }
    }
}
