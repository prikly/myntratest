package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzger extends zzget {
    public static zzgeq zza(Iterable iterable) {
        return new zzgeq(false, zzgau.zzl(iterable), (zzgep) null);
    }

    @SafeVarargs
    public static zzgeq zzb(zzgfb... zzgfbArr) {
        return new zzgeq(false, zzgau.zzn(zzgfbArr), (zzgep) null);
    }

    public static zzgeq zzc(Iterable iterable) {
        return new zzgeq(true, zzgau.zzl(iterable), (zzgep) null);
    }

    @SafeVarargs
    public static zzgeq zzd(zzgfb... zzgfbArr) {
        return new zzgeq(true, zzgau.zzn(zzgfbArr), (zzgep) null);
    }

    public static zzgfb zze(Iterable iterable) {
        return new zzgdz(zzgau.zzl(iterable), true);
    }

    public static zzgfb zzf(zzgfb zzgfb, Class cls, zzfxt zzfxt, Executor executor) {
        zzgdc zzgdc = new zzgdc(zzgfb, cls, zzfxt);
        zzgfb.zzc(zzgdc, zzgfi.zzc(executor, zzgdc));
        return zzgdc;
    }

    public static zzgfb zzg(zzgfb zzgfb, Class cls, zzgdy zzgdy, Executor executor) {
        zzgdb zzgdb = new zzgdb(zzgfb, cls, zzgdy);
        zzgfb.zzc(zzgdb, zzgfi.zzc(executor, zzgdb));
        return zzgdb;
    }

    public static zzgfb zzh(Throwable th) {
        if (th != null) {
            return new zzgeu(th);
        }
        throw null;
    }

    public static zzgfb zzi(Object obj) {
        if (obj == null) {
            return zzgev.zza;
        }
        return new zzgev(obj);
    }

    public static zzgfb zzj() {
        return zzgev.zza;
    }

    public static zzgfb zzk(Callable callable, Executor executor) {
        zzgfr zzgfr = new zzgfr(callable);
        executor.execute(zzgfr);
        return zzgfr;
    }

    public static zzgfb zzl(zzgdx zzgdx, Executor executor) {
        zzgfr zzgfr = new zzgfr(zzgdx);
        executor.execute(zzgfr);
        return zzgfr;
    }

    public static zzgfb zzm(zzgfb zzgfb, zzfxt zzfxt, Executor executor) {
        int i = zzgdn.zzc;
        if (zzfxt != null) {
            zzgdm zzgdm = new zzgdm(zzgfb, zzfxt);
            zzgfb.zzc(zzgdm, zzgfi.zzc(executor, zzgdm));
            return zzgdm;
        }
        throw null;
    }

    public static zzgfb zzn(zzgfb zzgfb, zzgdy zzgdy, Executor executor) {
        int i = zzgdn.zzc;
        if (executor != null) {
            zzgdl zzgdl = new zzgdl(zzgfb, zzgdy);
            zzgfb.zzc(zzgdl, zzgfi.zzc(executor, zzgdl));
            return zzgdl;
        }
        throw null;
    }

    public static zzgfb zzo(zzgfb zzgfb, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (zzgfb.isDone()) {
            return zzgfb;
        }
        return zzgfo.zzg(zzgfb, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgft.zza(future);
        }
        throw new IllegalStateException(zzfyt.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgft.zza(future);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof Error) {
                throw new zzgeg((Error) cause);
            }
            throw new zzgfs(cause);
        }
    }

    public static void zzr(zzgfb zzgfb, zzgen zzgen, Executor executor) {
        if (zzgen != null) {
            zzgfb.zzc(new zzgeo(zzgfb, zzgen), executor);
            return;
        }
        throw null;
    }
}
