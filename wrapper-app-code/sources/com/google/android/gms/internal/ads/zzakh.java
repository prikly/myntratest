package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzakh {
    private final AtomicInteger zza = new AtomicInteger();
    private final Set zzb = new HashSet();
    private final PriorityBlockingQueue zzc = new PriorityBlockingQueue();
    private final PriorityBlockingQueue zzd = new PriorityBlockingQueue();
    private final zzajo zze;
    private final zzajx zzf;
    private final zzajy[] zzg;
    private zzajq zzh;
    private final List zzi = new ArrayList();
    private final List zzj = new ArrayList();
    private final zzajv zzk;

    public zzakh(zzajo zzajo, zzajx zzajx, int i) {
        zzajv zzajv = new zzajv(new Handler(Looper.getMainLooper()));
        this.zze = zzajo;
        this.zzf = zzajx;
        this.zzg = new zzajy[4];
        this.zzk = zzajv;
    }

    public final zzake zza(zzake zzake) {
        zzake.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzake);
        }
        zzake.zzg(this.zza.incrementAndGet());
        zzake.zzm("add-to-queue");
        zzc(zzake, 0);
        this.zzc.add(zzake);
        return zzake;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzake zzake) {
        synchronized (this.zzb) {
            this.zzb.remove(zzake);
        }
        synchronized (this.zzi) {
            for (zzakg zza2 : this.zzi) {
                zza2.zza();
            }
        }
        zzc(zzake, 5);
    }

    /* access modifiers changed from: package-private */
    public final void zzc(zzake zzake, int i) {
        synchronized (this.zzj) {
            for (zzakf zza2 : this.zzj) {
                zza2.zza();
            }
        }
    }

    public final void zzd() {
        zzajq zzajq = this.zzh;
        if (zzajq != null) {
            zzajq.zzb();
        }
        zzajy[] zzajyArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            zzajy zzajy = zzajyArr[i];
            if (zzajy != null) {
                zzajy.zza();
            }
        }
        zzajq zzajq2 = new zzajq(this.zzc, this.zzd, this.zze, this.zzk, (byte[]) null);
        this.zzh = zzajq2;
        zzajq2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzajy zzajy2 = new zzajy(this.zzd, this.zzf, this.zze, this.zzk, (byte[]) null);
            this.zzg[i2] = zzajy2;
            zzajy2.start();
        }
    }
}
