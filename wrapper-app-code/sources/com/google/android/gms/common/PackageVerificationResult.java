package com.google.android.gms.common;

import com.google.errorprone.annotations.CheckReturnValue;

@CheckReturnValue
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class PackageVerificationResult {
    private final String zza;
    private final boolean zzb;
    private final String zzc;
    private final Throwable zzd;

    private PackageVerificationResult(String str, int i, boolean z, String str2, Throwable th) {
        this.zza = str;
        this.zzb = z;
        this.zzc = str2;
        this.zzd = th;
    }

    public static PackageVerificationResult zza(String str, String str2, Throwable th) {
        return new PackageVerificationResult(str, 1, false, str2, th);
    }

    public static PackageVerificationResult zzd(String str, int i) {
        return new PackageVerificationResult(str, i, true, (String) null, (Throwable) null);
    }

    public final void zzb() {
        if (!this.zzb) {
            String concat = "PackageVerificationRslt: ".concat(String.valueOf(this.zzc));
            Throwable th = this.zzd;
            if (th != null) {
                throw new SecurityException(concat, th);
            }
            throw new SecurityException(concat);
        }
    }

    public final boolean zzc() {
        return this.zzb;
    }
}
