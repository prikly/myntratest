package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
abstract class zzgdn extends zzgeh implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    zzgfb zza;
    Object zzb;

    zzgdn(zzgfb zzgfb, Object obj) {
        if (zzgfb != null) {
            this.zza = zzgfb;
            if (obj != null) {
                this.zzb = obj;
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void run() {
        zzgfb zzgfb = this.zza;
        Object obj = this.zzb;
        boolean z = true;
        boolean isCancelled = isCancelled() | (zzgfb == null);
        if (obj != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.zza = null;
            if (zzgfb.isCancelled()) {
                zzt(zzgfb);
                return;
            }
            try {
                try {
                    Object zzf = zzf(obj, zzger.zzp(zzgfb));
                    this.zzb = null;
                    zzg(zzf);
                } catch (Throwable th) {
                    this.zzb = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e2) {
                zze(e2.getCause());
            } catch (RuntimeException e3) {
                zze(e3);
            } catch (Error e4) {
                zze(e4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        String str;
        zzgfb zzgfb = this.zza;
        Object obj = this.zzb;
        String zza2 = super.zza();
        if (zzgfb != null) {
            str = "inputFuture=[" + zzgfb.toString() + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj.toString() + "]";
        } else if (zza2 != null) {
            return str.concat(zza2);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    /* access modifiers changed from: package-private */
    public abstract Object zzf(Object obj, Object obj2) throws Exception;

    /* access modifiers changed from: package-private */
    public abstract void zzg(Object obj);
}
