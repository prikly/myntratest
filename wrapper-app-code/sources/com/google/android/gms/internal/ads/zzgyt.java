package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzgyt {
    private static final zzgxp zzb = zzgxp.zza;
    protected volatile zzgzn zza;
    private volatile zzgwv zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgyt)) {
            return false;
        }
        zzgyt zzgyt = (zzgyt) obj;
        zzgzn zzgzn = this.zza;
        zzgzn zzgzn2 = zzgyt.zza;
        if (zzgzn == null && zzgzn2 == null) {
            return zzb().equals(zzgyt.zzb());
        }
        if (zzgzn != null && zzgzn2 != null) {
            return zzgzn.equals(zzgzn2);
        }
        if (zzgzn != null) {
            zzgyt.zzc(zzgzn.zzbh());
            return zzgzn.equals(zzgyt.zza);
        }
        zzc(zzgzn2.zzbh());
        return this.zza.equals(zzgzn2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgwr) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzay();
        }
        return 0;
    }

    public final zzgwv zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                zzgwv zzgwv = this.zzc;
                return zzgwv;
            }
            if (this.zza == null) {
                this.zzc = zzgwv.zzb;
            } else {
                this.zzc = this.zza.zzat();
            }
            zzgwv zzgwv2 = this.zzc;
            return zzgwv2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc(com.google.android.gms.internal.ads.zzgzn r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzgzn r0 = r1.zza
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzgzn r0 = r1.zza     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.zza = r2     // Catch:{ zzgyp -> 0x0011 }
            com.google.android.gms.internal.ads.zzgwv r0 = com.google.android.gms.internal.ads.zzgwv.zzb     // Catch:{ zzgyp -> 0x0011 }
            r1.zzc = r0     // Catch:{ zzgyp -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.zza = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.zzgwv r2 = com.google.android.gms.internal.ads.zzgwv.zzb     // Catch:{ all -> 0x001b }
            r1.zzc = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgyt.zzc(com.google.android.gms.internal.ads.zzgzn):void");
    }
}
