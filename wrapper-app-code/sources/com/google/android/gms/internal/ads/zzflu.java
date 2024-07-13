package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzflu {
    private final zzfln zza;
    private final zzgfb zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzflu(zzfks zzfks, zzflm zzflm, zzfln zzfln) {
        this.zza = zzfln;
        this.zzb = zzger.zzg(zzger.zzn(zzflm.zza(zzfln), new zzfls(this, zzflm, zzfks, zzfln), zzfln.zzb()), Exception.class, new zzflt(this, zzflm), zzfln.zzb());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzgfb zza(com.google.android.gms.internal.ads.zzfln r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.zzd     // Catch:{ all -> 0x0035 }
            r1 = 0
            if (r0 != 0) goto L_0x0033
            boolean r0 = r2.zzc     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x000b
            goto L_0x0033
        L_0x000b:
            com.google.android.gms.internal.ads.zzfln r0 = r2.zza     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzflc r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzflc r0 = r3.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzfln r0 = r2.zza     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzflc r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzflc r3 = r3.zza()     // Catch:{ all -> 0x0035 }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x0035 }
            if (r3 != 0) goto L_0x002a
            goto L_0x0031
        L_0x002a:
            r3 = 1
            r2.zzc = r3     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.zzgfb r3 = r2.zzb     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            return r3
        L_0x0031:
            monitor-exit(r2)
            return r1
        L_0x0033:
            monitor-exit(r2)
            return r1
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzflu.zza(com.google.android.gms.internal.ads.zzfln):com.google.android.gms.internal.ads.zzgfb");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzb(zzflm zzflm, zzfks zzfks, zzfln zzfln, zzflb zzflb) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzflm.zzb(zzflb);
            if (!this.zzc) {
                zzfks.zzd(zzfln.zza(), zzflb);
                zzgfb zzi = zzger.zzi((Object) null);
                return zzi;
            }
            zzgfb zzi2 = zzger.zzi(new zzfll(zzflb, zzfln));
            return zzi2;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzc(zzflm zzflm, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzgen zzgen) {
        zzger.zzr(zzger.zzn(this.zzb, zzflr.zza, this.zza.zzb()), zzgen, this.zza.zzb());
    }
}
