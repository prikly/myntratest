package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzahb implements zzahd {
    private final zzef zza = new zzef(new byte[18]);
    private final String zzb;
    private String zzc;
    private zzaaq zzd;
    private int zze = 0;
    private int zzf;
    private int zzg;
    private long zzh;
    private zzaf zzi;
    private int zzj;
    private long zzk = -9223372036854775807L;

    public zzahb(String str) {
        this.zzb = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0009 A[EDGE_INSN: B:58:0x0009->B:52:0x0009 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzef r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.android.gms.internal.ads.zzaaq r2 = r0.zzd
            com.google.android.gms.internal.ads.zzdd.zzb(r2)
        L_0x0009:
            int r2 = r18.zza()
            if (r2 <= 0) goto L_0x0191
            int r2 = r0.zze
            r3 = 8
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            r8 = 4
            if (r2 == 0) goto L_0x013f
            if (r2 == r7) goto L_0x0054
            int r2 = r18.zza()
            int r3 = r0.zzj
            int r4 = r0.zzf
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            com.google.android.gms.internal.ads.zzaaq r3 = r0.zzd
            r3.zzq(r1, r2)
            int r3 = r0.zzf
            int r3 = r3 + r2
            r0.zzf = r3
            int r11 = r0.zzj
            if (r3 != r11) goto L_0x0009
            long r8 = r0.zzk
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0051
            com.google.android.gms.internal.ads.zzaaq r7 = r0.zzd
            r10 = 1
            r12 = 0
            r13 = 0
            r7.zzs(r8, r10, r11, r12, r13)
            long r2 = r0.zzk
            long r4 = r0.zzh
            long r2 = r2 + r4
            r0.zzk = r2
        L_0x0051:
            r0.zze = r6
            goto L_0x0009
        L_0x0054:
            com.google.android.gms.internal.ads.zzef r2 = r0.zza
            byte[] r2 = r2.zzH()
            int r9 = r18.zza()
            int r10 = r0.zzf
            r11 = 18
            int r10 = 18 - r10
            int r9 = java.lang.Math.min(r9, r10)
            int r10 = r0.zzf
            r1.zzB(r2, r10, r9)
            int r2 = r0.zzf
            int r2 = r2 + r9
            r0.zzf = r2
            if (r2 != r11) goto L_0x0009
            com.google.android.gms.internal.ads.zzef r2 = r0.zza
            byte[] r2 = r2.zzH()
            com.google.android.gms.internal.ads.zzaf r9 = r0.zzi
            if (r9 != 0) goto L_0x008e
            java.lang.String r9 = r0.zzc
            java.lang.String r10 = r0.zzb
            r12 = 0
            com.google.android.gms.internal.ads.zzaf r9 = com.google.android.gms.internal.ads.zzzg.zza(r2, r9, r10, r12)
            r0.zzi = r9
            com.google.android.gms.internal.ads.zzaaq r10 = r0.zzd
            r10.zzk(r9)
        L_0x008e:
            int r9 = com.google.android.gms.internal.ads.zzzg.zza
            byte r9 = r2[r6]
            r10 = 31
            r12 = -1
            r13 = -2
            r14 = 5
            r15 = 6
            r16 = 7
            if (r9 == r13) goto L_0x00d6
            if (r9 == r12) goto L_0x00c0
            if (r9 == r10) goto L_0x00ae
            byte r3 = r2[r14]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r2[r15]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r8
            r3 = r3 | r4
            byte r4 = r2[r16]
            goto L_0x00e3
        L_0x00ae:
            byte r9 = r2[r15]
            r4 = r4 & r9
            int r4 = r4 << 12
            byte r9 = r2[r16]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << r8
            r4 = r4 | r9
            byte r3 = r2[r3]
            r3 = r3 & 60
            int r3 = r3 >> r5
            r3 = r3 | r4
            goto L_0x00d3
        L_0x00c0:
            byte r3 = r2[r16]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r2[r15]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r8
            r3 = r3 | r4
            r4 = 9
            byte r4 = r2[r4]
            r4 = r4 & 60
            int r4 = r4 >> r5
            r3 = r3 | r4
        L_0x00d3:
            int r3 = r3 + r7
            r4 = 1
            goto L_0x00e9
        L_0x00d6:
            byte r3 = r2[r8]
            r3 = r3 & r4
            int r3 = r3 << 12
            byte r4 = r2[r16]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r8
            r3 = r3 | r4
            byte r4 = r2[r15]
        L_0x00e3:
            r4 = r4 & 240(0xf0, float:3.36E-43)
            int r4 = r4 >> r8
            r3 = r3 | r4
            int r3 = r3 + r7
            r4 = 0
        L_0x00e9:
            if (r4 == 0) goto L_0x00ef
            int r3 = r3 * 16
            int r3 = r3 / 14
        L_0x00ef:
            r0.zzj = r3
            byte r3 = r2[r6]
            if (r3 == r13) goto L_0x0112
            if (r3 == r12) goto L_0x0108
            if (r3 == r10) goto L_0x0100
            byte r3 = r2[r8]
            r3 = r3 & r7
            int r3 = r3 << r15
            byte r2 = r2[r14]
            goto L_0x0118
        L_0x0100:
            byte r3 = r2[r14]
            r3 = r3 & 7
            int r3 = r3 << r8
            byte r2 = r2[r15]
            goto L_0x010f
        L_0x0108:
            byte r3 = r2[r8]
            r3 = r3 & 7
            int r3 = r3 << r8
            byte r2 = r2[r16]
        L_0x010f:
            r2 = r2 & 60
            goto L_0x011a
        L_0x0112:
            byte r3 = r2[r14]
            r3 = r3 & r7
            int r3 = r3 << r15
            byte r2 = r2[r8]
        L_0x0118:
            r2 = r2 & 252(0xfc, float:3.53E-43)
        L_0x011a:
            int r2 = r2 >> r5
            r2 = r2 | r3
            int r2 = r2 + r7
            int r2 = r2 * 32
            long r2 = (long) r2
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r7
            com.google.android.gms.internal.ads.zzaf r4 = r0.zzi
            int r4 = r4.zzA
            long r7 = (long) r4
            long r2 = r2 / r7
            int r3 = (int) r2
            long r2 = (long) r3
            r0.zzh = r2
            com.google.android.gms.internal.ads.zzef r2 = r0.zza
            r2.zzF(r6)
            com.google.android.gms.internal.ads.zzaaq r2 = r0.zzd
            com.google.android.gms.internal.ads.zzef r3 = r0.zza
            r2.zzq(r3, r11)
            r0.zze = r5
            goto L_0x0009
        L_0x013f:
            int r2 = r18.zza()
            if (r2 <= 0) goto L_0x0009
            int r2 = r0.zzg
            int r2 = r2 << r3
            r0.zzg = r2
            int r9 = r18.zzk()
            r2 = r2 | r9
            r0.zzg = r2
            int r9 = com.google.android.gms.internal.ads.zzzg.zza
            r9 = 2147385345(0x7ffe8001, float:NaN)
            if (r2 == r9) goto L_0x0167
            r9 = -25230976(0xfffffffffe7f0180, float:-8.474023E37)
            if (r2 == r9) goto L_0x0167
            r9 = 536864768(0x1fffe800, float:1.0838051E-19)
            if (r2 == r9) goto L_0x0167
            r9 = -14745368(0xffffffffff1f00e8, float:-2.1135196E38)
            if (r2 != r9) goto L_0x013f
        L_0x0167:
            com.google.android.gms.internal.ads.zzef r2 = r0.zza
            byte[] r2 = r2.zzH()
            int r3 = r0.zzg
            int r9 = r3 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r2[r6] = r9
            int r9 = r3 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r2[r7] = r9
            int r9 = r3 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r2[r5] = r9
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2[r4] = r3
            r0.zzf = r8
            r0.zzg = r6
            r0.zze = r7
            goto L_0x0009
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahb.zza(com.google.android.gms.internal.ads.zzef):void");
    }

    public final void zzb(zzzm zzzm, zzaip zzaip) {
        zzaip.zzc();
        this.zzc = zzaip.zzb();
        this.zzd = zzzm.zzv(zzaip.zza(), 1);
    }

    public final void zzc() {
    }

    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
    }

    public final void zze() {
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
    }
}
