package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfvh implements OnCompleteListener {
    public final /* synthetic */ zzfvi zza;

    public /* synthetic */ zzfvh(zzfvi zzfvi) {
        this.zza = zzfvi;
    }

    public final void onComplete(Task task) {
        zzfvi zzfvi = this.zza;
        if (task.isCanceled()) {
            zzfvi.cancel(false);
        } else if (task.isSuccessful()) {
            zzfvi.zzd(task.getResult());
        } else {
            Exception exception = task.getException();
            if (exception != null) {
                zzfvi.zze(exception);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
