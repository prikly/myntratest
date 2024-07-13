package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzglu {
    private static final zzglu zza = new zzglu();
    private final AtomicReference zzb = new AtomicReference(new zzgmo(new zzgmi(), (zzgmn) null));

    public static zzglu zzb() {
        return zza;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        return new com.google.android.gms.internal.ads.zzglm(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        throw new com.google.android.gms.internal.ads.zzgmp("Creating a LegacyProtoKey failed", r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzggf zza(com.google.android.gms.internal.ads.zzgmf r2, com.google.android.gms.internal.ads.zzghn r3) {
        /*
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzb     // Catch:{ GeneralSecurityException -> 0x000d }
            java.lang.Object r0 = r0.get()     // Catch:{ GeneralSecurityException -> 0x000d }
            com.google.android.gms.internal.ads.zzgmo r0 = (com.google.android.gms.internal.ads.zzgmo) r0     // Catch:{ GeneralSecurityException -> 0x000d }
            com.google.android.gms.internal.ads.zzggf r2 = r0.zza(r2, r3)     // Catch:{ GeneralSecurityException -> 0x000d }
            return r2
        L_0x000d:
            com.google.android.gms.internal.ads.zzglm r0 = new com.google.android.gms.internal.ads.zzglm     // Catch:{ GeneralSecurityException -> 0x0013 }
            r0.<init>(r2, r3)     // Catch:{ GeneralSecurityException -> 0x0013 }
            return r0
        L_0x0013:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzgmp r3 = new com.google.android.gms.internal.ads.zzgmp
            java.lang.String r0 = "Creating a LegacyProtoKey failed"
            r3.<init>(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzglu.zza(com.google.android.gms.internal.ads.zzgmf, com.google.android.gms.internal.ads.zzghn):com.google.android.gms.internal.ads.zzggf");
    }

    public final synchronized void zzc(zzglb zzglb) throws GeneralSecurityException {
        zzgmi zzgmi = new zzgmi((zzgmo) this.zzb.get());
        zzgmi.zza(zzglb);
        this.zzb.set(new zzgmo(zzgmi, (zzgmn) null));
    }

    public final synchronized void zzd(zzglf zzglf) throws GeneralSecurityException {
        zzgmi zzgmi = new zzgmi((zzgmo) this.zzb.get());
        zzgmi.zzb(zzglf);
        this.zzb.set(new zzgmo(zzgmi, (zzgmn) null));
    }

    public final synchronized void zze(zzgly zzgly) throws GeneralSecurityException {
        zzgmi zzgmi = new zzgmi((zzgmo) this.zzb.get());
        zzgmi.zzc(zzgly);
        this.zzb.set(new zzgmo(zzgmi, (zzgmn) null));
    }

    public final synchronized void zzf(zzgmc zzgmc) throws GeneralSecurityException {
        zzgmi zzgmi = new zzgmi((zzgmo) this.zzb.get());
        zzgmi.zzd(zzgmc);
        this.zzb.set(new zzgmo(zzgmi, (zzgmn) null));
    }
}
