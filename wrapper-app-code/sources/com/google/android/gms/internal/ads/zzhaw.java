package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhaw extends RuntimeException {
    public zzhaw(zzgzn zzgzn) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgyp zza() {
        return new zzgyp(getMessage());
    }
}
