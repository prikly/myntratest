package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbee {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbea(this);
    /* access modifiers changed from: private */
    public final Object zzc = new Object();
    /* access modifiers changed from: private */
    public zzbeh zzd;
    private Context zze;
    /* access modifiers changed from: private */
    public zzbek zzf;

    static /* bridge */ /* synthetic */ void zzh(zzbee zzbee) {
        synchronized (zzbee.zzc) {
            zzbeh zzbeh = zzbee.zzd;
            if (zzbeh != null) {
                if (zzbeh.isConnected() || zzbee.zzd.isConnecting()) {
                    zzbee.zzd.disconnect();
                }
                zzbee.zzd = null;
                zzbee.zzf = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzl() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zzc
            monitor-enter(r0)
            android.content.Context r1 = r3.zze     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.zzbeh r1 = r3.zzd     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0021
        L_0x000c:
            com.google.android.gms.internal.ads.zzbec r1 = new com.google.android.gms.internal.ads.zzbec     // Catch:{ all -> 0x0023 }
            r1.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.zzbed r2 = new com.google.android.gms.internal.ads.zzbed     // Catch:{ all -> 0x0023 }
            r2.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.zzbeh r1 = r3.zzd(r1, r2)     // Catch:{ all -> 0x0023 }
            r3.zzd = r1     // Catch:{ all -> 0x0023 }
            r1.checkAvailabilityAndConnect()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbee.zzl():void");
    }

    public final long zza(zzbei zzbei) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2;
            }
            if (this.zzd.zzp()) {
                try {
                    long zze2 = this.zzf.zze(zzbei);
                    return zze2;
                } catch (RemoteException e2) {
                    zze.zzh("Unable to call into cache service.", e2);
                    return -2;
                }
            }
        }
    }

    public final zzbef zzb(zzbei zzbei) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                zzbef zzbef = new zzbef();
                return zzbef;
            }
            try {
                if (this.zzd.zzp()) {
                    zzbef zzg = this.zzf.zzg(zzbei);
                    return zzg;
                }
                zzbef zzf2 = this.zzf.zzf(zzbei);
                return zzf2;
            } catch (RemoteException e2) {
                zze.zzh("Unable to call into cache service.", e2);
                return new zzbef();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized zzbeh zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbeh(this.zze, zzt.zzt().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.zzc
            monitor-enter(r0)
            android.content.Context r1 = r2.zze     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.zze = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbjb r3 = com.google.android.gms.internal.ads.zzbjj.zzdI     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbjh r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.zzb(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.zzl()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.zzbjb r3 = com.google.android.gms.internal.ads.zzbjj.zzdH     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbjh r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.zzb(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zzbeb r3 = new com.google.android.gms.internal.ads.zzbeb     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzbcr r1 = com.google.android.gms.ads.internal.zzt.zzb()     // Catch:{ all -> 0x0048 }
            r1.zzc(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbee.zzi(android.content.Context):void");
    }

    public final void zzj() {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzdJ)).booleanValue()) {
            synchronized (this.zzc) {
                zzl();
                ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = zzcib.zzd.schedule(this.zzb, ((Long) zzba.zzc().zzb(zzbjj.zzdK)).longValue(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
