package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfww implements OnCompleteListener {
    public final /* synthetic */ zzfxf zza;
    public final /* synthetic */ TaskCompletionSource zzb;

    public /* synthetic */ zzfww(zzfxf zzfxf, TaskCompletionSource taskCompletionSource) {
        this.zza = zzfxf;
        this.zzb = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        this.zza.zzq(this.zzb, task);
    }
}
