package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzede extends Exception {
    private final int zza;

    public zzede(int i) {
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzede(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzede(int i, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
