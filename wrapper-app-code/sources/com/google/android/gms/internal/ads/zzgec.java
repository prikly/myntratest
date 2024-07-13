package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgec extends zzged {
    final /* synthetic */ zzgee zza;
    private final Callable zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgec(zzgee zzgee, Callable callable, Executor executor) {
        super(zzgee, executor);
        this.zza = zzgee;
        if (callable != null) {
            this.zzc = callable;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzc.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Object obj) {
        this.zza.zzd(obj);
    }
}
