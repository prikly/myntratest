package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzasp extends Exception {
    private zzasp(int i, String str, Throwable th, int i2) {
        super((String) null, th);
    }

    public static zzasp zza(Exception exc, int i) {
        return new zzasp(1, (String) null, exc, i);
    }

    public static zzasp zzb(IOException iOException) {
        return new zzasp(0, (String) null, iOException, -1);
    }

    static zzasp zzc(RuntimeException runtimeException) {
        return new zzasp(2, (String) null, runtimeException, -1);
    }
}
