package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzsc extends zzui {
    private final boolean zzb;
    private final zzcm zzc;
    private final zzck zzd;
    private zzsa zze;
    private zzrz zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzsc(zzsj zzsj, boolean z) {
        super(zzsj);
        boolean z2;
        if (z) {
            zzsj.zzu();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzcm();
        this.zzd = new zzck();
        zzsj.zzL();
        this.zze = zzsa.zzq(zzsj.zzI());
    }

    private final Object zzJ(Object obj) {
        return (this.zze.zzf == null || !obj.equals(zzsa.zzd)) ? obj : this.zze.zzf;
    }

    private final void zzK(long j) {
        zzrz zzrz = this.zzf;
        int zza = this.zze.zza(zzrz.zza.zza);
        if (zza != -1) {
            zzsa zzsa = this.zze;
            zzck zzck = this.zzd;
            zzsa.zzd(zza, zzck, false);
            long j2 = zzck.zze;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            zzrz.zzs(j);
        }
    }

    public final zzcn zzB() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final zzsh zzC(zzsh zzsh) {
        Object obj = zzsh.zza;
        if (this.zze.zzf != null && this.zze.zzf.equals(obj)) {
            obj = zzsa.zzd;
        }
        return zzsh.zzc(obj);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzD(com.google.android.gms.internal.ads.zzcn r15) {
        /*
            r14 = this;
            boolean r0 = r14.zzh
            r1 = 0
            if (r0 == 0) goto L_0x001b
            com.google.android.gms.internal.ads.zzsa r0 = r14.zze
            com.google.android.gms.internal.ads.zzsa r15 = r0.zzp(r15)
            r14.zze = r15
            com.google.android.gms.internal.ads.zzrz r15 = r14.zzf
            if (r15 == 0) goto L_0x0018
            long r2 = r15.zzn()
            r14.zzK(r2)
        L_0x0018:
            r15 = r1
            goto L_0x009c
        L_0x001b:
            boolean r0 = r15.zzo()
            if (r0 == 0) goto L_0x0037
            boolean r0 = r14.zzi
            if (r0 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzsa r0 = r14.zze
            com.google.android.gms.internal.ads.zzsa r15 = r0.zzp(r15)
            goto L_0x0034
        L_0x002c:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzcm.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzsa.zzd
            com.google.android.gms.internal.ads.zzsa r15 = com.google.android.gms.internal.ads.zzsa.zzr(r15, r0, r2)
        L_0x0034:
            r14.zze = r15
            goto L_0x0018
        L_0x0037:
            com.google.android.gms.internal.ads.zzcm r0 = r14.zzc
            r2 = 0
            r3 = 0
            r15.zze(r2, r0, r3)
            com.google.android.gms.internal.ads.zzcm r0 = r14.zzc
            java.lang.Object r0 = r0.zzc
            com.google.android.gms.internal.ads.zzrz r5 = r14.zzf
            if (r5 == 0) goto L_0x0063
            long r6 = r5.zzq()
            com.google.android.gms.internal.ads.zzsa r8 = r14.zze
            com.google.android.gms.internal.ads.zzsh r5 = r5.zza
            java.lang.Object r5 = r5.zza
            com.google.android.gms.internal.ads.zzck r9 = r14.zzd
            r8.zzn(r5, r9)
            com.google.android.gms.internal.ads.zzsa r5 = r14.zze
            com.google.android.gms.internal.ads.zzcm r8 = r14.zzc
            r5.zze(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0063
            r12 = r6
            goto L_0x0064
        L_0x0063:
            r12 = r3
        L_0x0064:
            com.google.android.gms.internal.ads.zzcm r9 = r14.zzc
            com.google.android.gms.internal.ads.zzck r10 = r14.zzd
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.zzl(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.zzi
            if (r2 == 0) goto L_0x0083
            com.google.android.gms.internal.ads.zzsa r0 = r14.zze
            com.google.android.gms.internal.ads.zzsa r15 = r0.zzp(r15)
            goto L_0x0087
        L_0x0083:
            com.google.android.gms.internal.ads.zzsa r15 = com.google.android.gms.internal.ads.zzsa.zzr(r15, r0, r3)
        L_0x0087:
            r14.zze = r15
            com.google.android.gms.internal.ads.zzrz r15 = r14.zzf
            if (r15 == 0) goto L_0x0018
            r14.zzK(r4)
            com.google.android.gms.internal.ads.zzsh r15 = r15.zza
            java.lang.Object r0 = r15.zza
            java.lang.Object r0 = r14.zzJ(r0)
            com.google.android.gms.internal.ads.zzsh r15 = r15.zzc(r0)
        L_0x009c:
            r0 = 1
            r14.zzi = r0
            r14.zzh = r0
            com.google.android.gms.internal.ads.zzsa r0 = r14.zze
            r14.zzo(r0)
            if (r15 == 0) goto L_0x00b1
            com.google.android.gms.internal.ads.zzrz r0 = r14.zzf
            if (r0 == 0) goto L_0x00b0
            r0.zzr(r15)
            return
        L_0x00b0:
            throw r1
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsc.zzD(com.google.android.gms.internal.ads.zzcn):void");
    }

    public final void zzE() {
        if (!this.zzb) {
            this.zzg = true;
            zzA((Object) null, this.zza);
        }
    }

    public final void zzF(zzsf zzsf) {
        ((zzrz) zzsf).zzt();
        if (zzsf == this.zzf) {
            this.zzf = null;
        }
    }

    /* renamed from: zzG */
    public final zzrz zzH(zzsh zzsh, zzwi zzwi, long j) {
        zzrz zzrz = new zzrz(zzsh, zzwi, j, (byte[]) null);
        zzrz.zzu(this.zza);
        if (this.zzh) {
            zzrz.zzr(zzsh.zzc(zzJ(zzsh.zza)));
        } else {
            this.zzf = zzrz;
            if (!this.zzg) {
                this.zzg = true;
                zzA((Object) null, this.zza);
            }
        }
        return zzrz;
    }

    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    public final void zzy() {
    }
}
