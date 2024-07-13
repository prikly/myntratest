package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
abstract class zzgdq extends zzgdw {
    private static final Logger zza = Logger.getLogger(zzgdq.class.getName());
    private zzgap zzb;
    private final boolean zzc;
    private final boolean zze;

    zzgdq(zzgap zzgap, boolean z, boolean z2) {
        super(zzgap.size());
        if (zzgap != null) {
            this.zzb = zzgap;
            this.zzc = z;
            this.zze = z2;
            return;
        }
        throw null;
    }

    private final void zzH(int i, Future future) {
        try {
            zzg(i, zzger.zzp(future));
        } catch (ExecutionException e2) {
            zzJ(e2.getCause());
        } catch (Error | RuntimeException e3) {
            zzJ(e3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzI */
    public final void zzy(zzgap zzgap) {
        int zzB = zzB();
        int i = 0;
        zzfye.zzi(zzB >= 0, "Less than 0 remaining futures");
        if (zzB == 0) {
            if (zzgap != null) {
                zzgct zze2 = zzgap.iterator();
                while (zze2.hasNext()) {
                    Future future = (Future) zze2.next();
                    if (!future.isCancelled()) {
                        zzH(i, future);
                    }
                    i++;
                }
            }
            zzG();
            zzv();
            zzz(2);
        }
    }

    private final void zzJ(Throwable th) {
        if (th == null) {
            throw null;
        } else if (this.zzc && !zze(th) && zzL(zzD(), th)) {
            zzK(th);
        } else if (th instanceof Error) {
            zzK(th);
        }
    }

    private static void zzK(Throwable th) {
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean zzL(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        zzgap zzgap = this.zzb;
        if (zzgap != null) {
            return "futures=".concat(zzgap.toString());
        }
        return super.zza();
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzgap zzgap = this.zzb;
        boolean z = true;
        zzz(1);
        boolean isCancelled = isCancelled();
        if (zzgap == null) {
            z = false;
        }
        if (z && isCancelled) {
            boolean zzu = zzu();
            zzgct zze2 = zzgap.iterator();
            while (zze2.hasNext()) {
                ((Future) zze2.next()).cancel(zzu);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzf(Set set) {
        if (set == null) {
            throw null;
        } else if (!isCancelled()) {
            Throwable zzm = zzm();
            zzm.getClass();
            zzL(set, zzm);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void zzg(int i, Object obj);

    /* access modifiers changed from: package-private */
    public abstract void zzv();

    /* access modifiers changed from: package-private */
    public final void zzw() {
        zzgap zzgap = this.zzb;
        zzgap.getClass();
        if (zzgap.isEmpty()) {
            zzv();
        } else if (this.zzc) {
            zzgct zze2 = this.zzb.iterator();
            int i = 0;
            while (zze2.hasNext()) {
                zzgfb zzgfb = (zzgfb) zze2.next();
                zzgfb.zzc(new zzgdo(this, zzgfb, i), zzgef.INSTANCE);
                i++;
            }
        } else {
            zzgdp zzgdp = new zzgdp(this, this.zze ? this.zzb : null);
            zzgct zze3 = this.zzb.iterator();
            while (zze3.hasNext()) {
                ((zzgfb) zze3.next()).zzc(zzgdp, zzgef.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzx(zzgfb zzgfb, int i) {
        try {
            if (zzgfb.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzH(i, zzgfb);
            }
        } finally {
            zzy((zzgap) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void zzz(int i) {
        this.zzb = null;
    }
}
