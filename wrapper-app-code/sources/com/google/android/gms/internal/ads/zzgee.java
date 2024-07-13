package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgee extends zzgdq {
    /* access modifiers changed from: private */
    public zzged zza;

    zzgee(zzgap zzgap, boolean z, Executor executor, Callable callable) {
        super(zzgap, z, false);
        this.zza = new zzgec(this, callable, executor);
        zzw();
    }

    /* access modifiers changed from: package-private */
    public final void zzg(int i, Object obj) {
    }

    /* access modifiers changed from: protected */
    public final void zzr() {
        zzged zzged = this.zza;
        if (zzged != null) {
            zzged.zzh();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzv() {
        zzged zzged = this.zza;
        if (zzged != null) {
            zzged.zzf();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzz(int i) {
        super.zzz(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
