package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbah {
    /* access modifiers changed from: private */
    public final ExecutorService zza = zzbay.zzl("Loader:ExtractorMediaPeriod");
    /* access modifiers changed from: private */
    public zzbae zzb;
    /* access modifiers changed from: private */
    public IOException zzc;

    public zzbah(String str) {
    }

    public final long zza(zzbaf zzbaf, zzbad zzbad, int i) {
        Looper myLooper = Looper.myLooper();
        zzbaj.zze(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzbae(this, myLooper, zzbaf, zzbad, i, elapsedRealtime).zzc(0);
        return elapsedRealtime;
    }

    public final void zzf() {
        this.zzb.zza(false);
    }

    public final void zzg(int i) throws IOException {
        IOException iOException = this.zzc;
        if (iOException == null) {
            zzbae zzbae = this.zzb;
            if (zzbae != null) {
                zzbae.zzb(zzbae.zza);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void zzh(Runnable runnable) {
        zzbae zzbae = this.zzb;
        if (zzbae != null) {
            zzbae.zza(true);
        }
        this.zza.execute(runnable);
        this.zza.shutdown();
    }

    public final boolean zzi() {
        return this.zzb != null;
    }
}
