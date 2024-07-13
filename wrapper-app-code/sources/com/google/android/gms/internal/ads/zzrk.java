package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzrk implements zzta {
    private final zzzq zza;
    private zzzj zzb;
    private zzzk zzc;

    public zzrk(zzzq zzzq) {
        this.zza = zzzq;
    }

    public final long zzb() {
        zzzk zzzk = this.zzc;
        if (zzzk != null) {
            return zzzk.zzf();
        }
        return -1;
    }

    public final void zzc() {
        zzzj zzzj = this.zzb;
        if (zzzj instanceof zzaer) {
            ((zzaer) zzzj).zze();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r0.zzf() != r11) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006c, code lost:
        if (r0.zzf() != r11) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006f, code lost:
        r1 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(com.google.android.gms.internal.ads.zzr r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzzm r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzyz r6 = new com.google.android.gms.internal.ads.zzyz
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzzj r8 = r7.zzb
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            com.google.android.gms.internal.ads.zzzq r8 = r7.zza
            com.google.android.gms.internal.ads.zzzj[] r8 = r8.zzb(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0020
            r8 = r8[r13]
            r7.zzb = r8
            goto L_0x007f
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 >= r10) goto L_0x007b
            r1 = r8[r0]
            boolean r2 = r1.zzd(r6)     // Catch:{ EOFException -> 0x0061, all -> 0x004c }
            if (r2 == 0) goto L_0x003f
            r7.zzb = r1     // Catch:{ EOFException -> 0x0061, all -> 0x004c }
            if (r1 != 0) goto L_0x0037
            long r0 = r6.zzf()
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0038
        L_0x0037:
            r13 = 1
        L_0x0038:
            com.google.android.gms.internal.ads.zzdd.zzf(r13)
            r6.zzj()
            goto L_0x007b
        L_0x003f:
            com.google.android.gms.internal.ads.zzzj r1 = r7.zzb
            if (r1 != 0) goto L_0x0071
            long r1 = r6.zzf()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x006f
            goto L_0x0071
        L_0x004c:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzzj r9 = r7.zzb
            if (r9 != 0) goto L_0x0059
            long r9 = r6.zzf()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x005a
        L_0x0059:
            r13 = 1
        L_0x005a:
            com.google.android.gms.internal.ads.zzdd.zzf(r13)
            r6.zzj()
            throw r8
        L_0x0061:
            com.google.android.gms.internal.ads.zzzj r1 = r7.zzb
            if (r1 != 0) goto L_0x0071
            long r1 = r6.zzf()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r1 = 0
            goto L_0x0072
        L_0x0071:
            r1 = 1
        L_0x0072:
            com.google.android.gms.internal.ads.zzdd.zzf(r1)
            r6.zzj()
            int r0 = r0 + 1
            goto L_0x0021
        L_0x007b:
            com.google.android.gms.internal.ads.zzzj r10 = r7.zzb
            if (r10 == 0) goto L_0x0085
        L_0x007f:
            com.google.android.gms.internal.ads.zzzj r8 = r7.zzb
            r8.zzb(r15)
            return
        L_0x0085:
            com.google.android.gms.internal.ads.zzuh r10 = new com.google.android.gms.internal.ads.zzuh
            java.lang.String r8 = com.google.android.gms.internal.ads.zzen.zzK(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrk.zzd(com.google.android.gms.internal.ads.zzr, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzzm):void");
    }

    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    public final int zza(zzaaj zzaaj) throws IOException {
        zzzj zzzj = this.zzb;
        if (zzzj != null) {
            zzzk zzzk = this.zzc;
            if (zzzk != null) {
                return zzzj.zza(zzzk, zzaaj);
            }
            throw null;
        }
        throw null;
    }

    public final void zzf(long j, long j2) {
        zzzj zzzj = this.zzb;
        if (zzzj != null) {
            zzzj.zzc(j, j2);
            return;
        }
        throw null;
    }
}
