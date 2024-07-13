package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzben implements Runnable {
    public final /* synthetic */ zzbeq zza;
    public final /* synthetic */ zzbeh zzb;
    public final /* synthetic */ zzbei zzc;
    public final /* synthetic */ zzcig zzd;

    public /* synthetic */ zzben(zzbeq zzbeq, zzbeh zzbeh, zzbei zzbei, zzcig zzcig) {
        this.zza = zzbeq;
        this.zzb = zzbeh;
        this.zzc = zzbei;
        this.zzd = zzcig;
    }

    public final void run() {
        zzbef zzbef;
        zzbeq zzbeq = this.zza;
        zzbeh zzbeh = this.zzb;
        zzbei zzbei = this.zzc;
        zzcig zzcig = this.zzd;
        try {
            zzbek zzq = zzbeh.zzq();
            if (zzbeh.zzp()) {
                zzbef = zzq.zzg(zzbei);
            } else {
                zzbef = zzq.zzf(zzbei);
            }
            if (!zzbef.zze()) {
                zzcig.zze(new RuntimeException("No entry contents."));
                zzbes.zze(zzbeq.zzc);
                return;
            }
            zzbep zzbep = new zzbep(zzbeq, zzbef.zzc(), 1);
            int read = zzbep.read();
            if (read != -1) {
                zzbep.unread(read);
                zzcig.zzd(zzbeu.zzb(zzbep, zzbef.zzd(), zzbef.zzg(), zzbef.zza(), zzbef.zzf()));
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e2) {
            zze.zzh("Unable to obtain a cache service instance.", e2);
            zzcig.zze(e2);
            zzbes.zze(zzbeq.zzc);
        }
    }
}
