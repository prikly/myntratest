package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzajy extends Thread {
    private final BlockingQueue zza;
    private final zzajx zzb;
    private final zzajo zzc;
    private volatile boolean zzd = false;
    private final zzajv zze;

    public zzajy(BlockingQueue blockingQueue, zzajx zzajx, zzajo zzajo, zzajv zzajv, byte[] bArr) {
        this.zza = blockingQueue;
        this.zzb = zzajx;
        this.zzc = zzajo;
        this.zze = zzajv;
    }

    private void zzb() throws InterruptedException {
        zzake zzake = (zzake) this.zza.take();
        SystemClock.elapsedRealtime();
        zzake.zzt(3);
        try {
            zzake.zzm("network-queue-take");
            zzake.zzw();
            TrafficStats.setThreadStatsTag(zzake.zzc());
            zzaka zza2 = this.zzb.zza(zzake);
            zzake.zzm("network-http-complete");
            if (!zza2.zze || !zzake.zzv()) {
                zzakk zzh = zzake.zzh(zza2);
                zzake.zzm("network-parse-complete");
                if (zzh.zzb != null) {
                    this.zzc.zzd(zzake.zzj(), zzh.zzb);
                    zzake.zzm("network-cache-written");
                }
                zzake.zzq();
                this.zze.zzb(zzake, zzh, (Runnable) null);
                zzake.zzs(zzh);
                zzake.zzt(4);
                return;
            }
            zzake.zzp("not-modified");
            zzake.zzr();
        } catch (zzakn e2) {
            SystemClock.elapsedRealtime();
            this.zze.zza(zzake, e2);
            zzake.zzr();
        } catch (Exception e3) {
            zzakq.zzc(e3, "Unhandled exception %s", e3.toString());
            zzakn zzakn = new zzakn((Throwable) e3);
            SystemClock.elapsedRealtime();
            this.zze.zza(zzake, zzakn);
            zzake.zzr();
        } finally {
            zzake.zzt(4);
        }
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzakq.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
