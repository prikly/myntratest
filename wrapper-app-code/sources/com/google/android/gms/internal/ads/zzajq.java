package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzajq extends Thread {
    private static final boolean zza = zzakq.zzb;
    private final BlockingQueue zzb;
    /* access modifiers changed from: private */
    public final BlockingQueue zzc;
    private final zzajo zzd;
    private volatile boolean zze = false;
    private final zzakr zzf;
    private final zzajv zzg;

    public zzajq(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzajo zzajo, zzajv zzajv, byte[] bArr) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzajo;
        this.zzg = zzajv;
        this.zzf = new zzakr(this, blockingQueue2, zzajv, (byte[]) null);
    }

    private void zzc() throws InterruptedException {
        zzake zzake = (zzake) this.zzb.take();
        zzake.zzm("cache-queue-take");
        zzake.zzt(1);
        try {
            zzake.zzw();
            zzajn zza2 = this.zzd.zza(zzake.zzj());
            if (zza2 == null) {
                zzake.zzm("cache-miss");
                if (!this.zzf.zzc(zzake)) {
                    this.zzc.put(zzake);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (zza2.zza(currentTimeMillis)) {
                zzake.zzm("cache-hit-expired");
                zzake.zze(zza2);
                if (!this.zzf.zzc(zzake)) {
                    this.zzc.put(zzake);
                }
                zzake.zzt(2);
                return;
            }
            zzake.zzm("cache-hit");
            zzakk zzh = zzake.zzh(new zzaka(zza2.zza, zza2.zzg));
            zzake.zzm("cache-hit-parsed");
            if (!zzh.zzc()) {
                zzake.zzm("cache-parsing-failed");
                this.zzd.zzc(zzake.zzj(), true);
                zzake.zze((zzajn) null);
                if (!this.zzf.zzc(zzake)) {
                    this.zzc.put(zzake);
                }
                zzake.zzt(2);
                return;
            }
            if (zza2.zzf < currentTimeMillis) {
                zzake.zzm("cache-hit-refresh-needed");
                zzake.zze(zza2);
                zzh.zzd = true;
                if (!this.zzf.zzc(zzake)) {
                    this.zzg.zzb(zzake, zzh, new zzajp(this, zzake));
                } else {
                    this.zzg.zzb(zzake, zzh, (Runnable) null);
                }
            } else {
                this.zzg.zzb(zzake, zzh, (Runnable) null);
            }
            zzake.zzt(2);
        } finally {
            zzake.zzt(2);
        }
    }

    public final void run() {
        if (zza) {
            zzakq.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzakq.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
