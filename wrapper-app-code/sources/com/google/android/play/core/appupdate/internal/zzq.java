package com.google.android.play.core.appupdate.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:app-update@@2.0.0 */
final class zzq extends zzn {
    final /* synthetic */ zzn zza;
    final /* synthetic */ zzx zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzq(zzx zzx, TaskCompletionSource taskCompletionSource, zzn zzn) {
        super(taskCompletionSource);
        this.zzb = zzx;
        this.zza = zzn;
    }

    public final void zza() {
        zzx.zzm(this.zzb, this.zza);
    }
}
