package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
final class zze implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzf zzb;

    zze(zzf zzf, Task task) {
        this.zzb = zzf;
        this.zza = task;
    }

    public final void run() {
        try {
            Task task = (Task) this.zzb.zzb.then(this.zza);
            if (task == null) {
                this.zzb.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            task.addOnSuccessListener(TaskExecutors.zza, this.zzb);
            task.addOnFailureListener(TaskExecutors.zza, (OnFailureListener) this.zzb);
            task.addOnCanceledListener(TaskExecutors.zza, (OnCanceledListener) this.zzb);
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.zzb.zzc.zza((Exception) e2.getCause());
            } else {
                this.zzb.zzc.zza(e2);
            }
        } catch (Exception e3) {
            this.zzb.zzc.zza(e3);
        }
    }
}
