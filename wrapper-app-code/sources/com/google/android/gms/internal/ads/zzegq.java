package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzegq extends zzegw {
    private zzcbj zzh;

    zzegq(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = zzt.zzt().zzb();
        this.zzg = scheduledExecutorService;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onConnected(android.os.Bundle r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r4 = r3.zzc     // Catch:{ all -> 0x0039 }
            if (r4 != 0) goto L_0x0037
            r4 = 1
            r3.zzc = r4     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.ads.zzcbe r0 = r3.zzd     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            com.google.android.gms.internal.ads.zzcbr r0 = r0.zzp()     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            com.google.android.gms.internal.ads.zzcbj r1 = r3.zzh     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            com.google.android.gms.internal.ads.zzegv r2 = new com.google.android.gms.internal.ads.zzegv     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            r2.<init>(r3)     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            r0.zze(r1, r2)     // Catch:{ RemoteException -> 0x002b, all -> 0x001a }
            monitor-exit(r3)
            return
        L_0x001a:
            r4 = move-exception
            com.google.android.gms.internal.ads.zzcgx r0 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = "RemoteAdsServiceProxyClientTask.onConnected"
            r0.zzu(r4, r1)     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.ads.zzcig r0 = r3.zza     // Catch:{ all -> 0x0039 }
            r0.zze(r4)     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)
            return
        L_0x002b:
            com.google.android.gms.internal.ads.zzcig r0 = r3.zza     // Catch:{ all -> 0x0039 }
            com.google.android.gms.internal.ads.zzefg r1 = new com.google.android.gms.internal.ads.zzefg     // Catch:{ all -> 0x0039 }
            r1.<init>(r4)     // Catch:{ all -> 0x0039 }
            r0.zze(r1)     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)
            return
        L_0x0037:
            monitor-exit(r3)
            return
        L_0x0039:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegq.onConnected(android.os.Bundle):void");
    }

    public final synchronized zzgfb zza(zzcbj zzcbj, long j) {
        if (this.zzb) {
            return zzger.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzcbj;
        zzb();
        zzgfb zzo = zzger.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        zzo.zzc(new zzegp(this), zzcib.zzf);
        return zzo;
    }
}
