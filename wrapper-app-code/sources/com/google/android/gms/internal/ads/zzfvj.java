package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfvj {
    public static zzgfb zza(Task task) {
        zzfvi zzfvi = new zzfvi(task);
        task.addOnCompleteListener(zzgfi.zzb(), new zzfvh(zzfvi));
        return zzfvi;
    }
}
