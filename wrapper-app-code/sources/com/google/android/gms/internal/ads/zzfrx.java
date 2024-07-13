package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfrx implements Continuation {
    public static final /* synthetic */ zzfrx zza = new zzfrx();

    private /* synthetic */ zzfrx() {
    }

    public final Object then(Task task) {
        return Boolean.valueOf(task.isSuccessful());
    }
}
