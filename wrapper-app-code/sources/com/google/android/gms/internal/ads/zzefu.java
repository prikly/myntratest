package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzefu implements zzgdy {
    public static final /* synthetic */ zzefu zza = new zzefu();

    private /* synthetic */ zzefu() {
    }

    public final zzgfb zza(Object obj) {
        ExecutionException executionException = (ExecutionException) obj;
        Throwable cause = executionException.getCause();
        Throwable th = executionException;
        if (cause != null) {
            th = executionException.getCause();
        }
        return zzger.zzh(th);
    }
}
