package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfry implements Continuation {
    public final /* synthetic */ zzalx zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzfry(zzalx zzalx, int i) {
        this.zza = zzalx;
        this.zzb = i;
    }

    public final Object then(Task task) {
        zzalx zzalx = this.zza;
        int i = this.zzb;
        int i2 = zzfrz.zza;
        if (!task.isSuccessful()) {
            return false;
        }
        zzfua zza2 = ((zzfub) task.getResult()).zza(((zzamb) zzalx.zzak()).zzaw());
        zza2.zza(i);
        zza2.zzc();
        return true;
    }
}
