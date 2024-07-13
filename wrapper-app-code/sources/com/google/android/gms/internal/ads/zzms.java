package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzms {
    final /* synthetic */ zzmt zza;
    /* access modifiers changed from: private */
    public final String zzb;
    /* access modifiers changed from: private */
    public int zzc;
    /* access modifiers changed from: private */
    public long zzd;
    /* access modifiers changed from: private */
    public zzsh zze;
    /* access modifiers changed from: private */
    public boolean zzf;
    /* access modifiers changed from: private */
    public boolean zzg;

    public zzms(zzmt zzmt, String str, int i, zzsh zzsh) {
        this.zza = zzmt;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzsh == null ? -1 : zzsh.zzd;
        if (zzsh != null && zzsh.zzb()) {
            this.zze = zzsh;
        }
    }

    public final void zzg(int i, zzsh zzsh) {
        if (this.zzd == -1 && i == this.zzc && zzsh != null) {
            this.zzd = zzsh.zzd;
        }
    }

    public final boolean zzj(int i, zzsh zzsh) {
        if (zzsh == null) {
            return i == this.zzc;
        }
        zzsh zzsh2 = this.zze;
        return zzsh2 == null ? !zzsh.zzb() && zzsh.zzd == this.zzd : zzsh.zzd == zzsh2.zzd && zzsh.zzb == zzsh2.zzb && zzsh.zzc == zzsh2.zzc;
    }

    public final boolean zzk(zzkn zzkn) {
        zzsh zzsh = zzkn.zzd;
        if (zzsh == null) {
            return this.zzc != zzkn.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        if (zzsh.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        int zza2 = zzkn.zzb.zza(zzsh.zza);
        int zza3 = zzkn.zzb.zza(this.zze.zza);
        zzsh zzsh2 = zzkn.zzd;
        if (zzsh2.zzd < this.zze.zzd || zza2 < zza3) {
            return false;
        }
        if (zza2 > zza3) {
            return true;
        }
        if (zzsh2.zzb()) {
            zzsh zzsh3 = zzkn.zzd;
            int i = zzsh3.zzb;
            int i2 = zzsh3.zzc;
            zzsh zzsh4 = this.zze;
            int i3 = zzsh4.zzb;
            if (i <= i3) {
                return i == i3 && i2 > zzsh4.zzc;
            }
            return true;
        }
        int i4 = zzkn.zzd.zze;
        return i4 == -1 || i4 > this.zze.zzb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 < r8.zzc()) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzl(com.google.android.gms.internal.ads.zzcn r7, com.google.android.gms.internal.ads.zzcn r8) {
        /*
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L_0x0013
            int r7 = r8.zzc()
            if (r0 >= r7) goto L_0x0011
            goto L_0x004a
        L_0x0011:
            r0 = -1
            goto L_0x004a
        L_0x0013:
            com.google.android.gms.internal.ads.zzmt r1 = r6.zza
            com.google.android.gms.internal.ads.zzcm r1 = r1.zzc
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzmt r0 = r6.zza
            com.google.android.gms.internal.ads.zzcm r0 = r0.zzc
            int r0 = r0.zzo
        L_0x0026:
            com.google.android.gms.internal.ads.zzmt r1 = r6.zza
            com.google.android.gms.internal.ads.zzcm r1 = r1.zzc
            int r1 = r1.zzp
            if (r0 > r1) goto L_0x0011
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L_0x0047
            com.google.android.gms.internal.ads.zzmt r7 = r6.zza
            com.google.android.gms.internal.ads.zzck r7 = r7.zzd
            com.google.android.gms.internal.ads.zzck r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzd
            goto L_0x004a
        L_0x0047:
            int r0 = r0 + 1
            goto L_0x0026
        L_0x004a:
            r6.zzc = r0
            if (r0 != r3) goto L_0x004f
            return r2
        L_0x004f:
            com.google.android.gms.internal.ads.zzsh r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L_0x0055
            return r0
        L_0x0055:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L_0x005e
            return r0
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzms.zzl(com.google.android.gms.internal.ads.zzcn, com.google.android.gms.internal.ads.zzcn):boolean");
    }
}
