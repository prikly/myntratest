package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzvq extends zzvn {
    private final boolean zze;
    private final zzvf zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r2 <= 2.14748365E9f) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r1 >= 0) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        if (r1 >= 0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005d, code lost:
        if (r1 >= 0.0f) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0065, code lost:
        if (r7 >= 0) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x00af A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzvq(int r5, com.google.android.gms.internal.ads.zzcp r6, int r7, com.google.android.gms.internal.ads.zzvf r8, int r9, int r10, boolean r11) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            r4.zzf = r8
            boolean r5 = r8.zzI
            r6 = 1
            if (r6 == r5) goto L_0x000d
            r5 = 16
            goto L_0x000f
        L_0x000d:
            r5 = 24
        L_0x000f:
            boolean r7 = r8.zzH
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = -1
            r0 = 0
            if (r11 == 0) goto L_0x003b
            com.google.android.gms.internal.ads.zzaf r1 = r4.zzd
            int r2 = r1.zzr
            if (r2 == r10) goto L_0x001f
            int r2 = r8.zzd
        L_0x001f:
            int r2 = r1.zzs
            if (r2 == r10) goto L_0x0025
            int r2 = r8.zze
        L_0x0025:
            float r2 = r1.zzt
            int r3 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0033
            int r3 = r8.zzf
            r3 = 1325400064(0x4f000000, float:2.14748365E9)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x003b
        L_0x0033:
            int r1 = r1.zzi
            if (r1 == r10) goto L_0x0039
            int r1 = r8.zzg
        L_0x0039:
            r1 = 1
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            r4.zze = r1
            if (r11 == 0) goto L_0x0069
            com.google.android.gms.internal.ads.zzaf r11 = r4.zzd
            int r1 = r11.zzr
            if (r1 == r10) goto L_0x004a
            int r2 = r8.zzh
            if (r1 < 0) goto L_0x0069
        L_0x004a:
            int r1 = r11.zzs
            if (r1 == r10) goto L_0x0052
            int r2 = r8.zzi
            if (r1 < 0) goto L_0x0069
        L_0x0052:
            float r1 = r11.zzt
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x005f
            int r7 = r8.zzj
            r7 = 0
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x0069
        L_0x005f:
            int r7 = r11.zzi
            if (r7 == r10) goto L_0x0067
            int r11 = r8.zzk
            if (r7 < 0) goto L_0x0069
        L_0x0067:
            r7 = 1
            goto L_0x006a
        L_0x0069:
            r7 = 0
        L_0x006a:
            r4.zzg = r7
            boolean r7 = com.google.android.gms.internal.ads.zzvr.zzm(r9, r0)
            r4.zzh = r7
            com.google.android.gms.internal.ads.zzaf r7 = r4.zzd
            int r11 = r7.zzi
            r4.zzi = r11
            int r7 = r7.zza()
            r4.zzj = r7
            com.google.android.gms.internal.ads.zzaf r7 = r4.zzd
            int r7 = r7.zzf
            int r7 = r8.zzp
            int r7 = java.lang.Integer.bitCount(r0)
            r4.zzl = r7
            com.google.android.gms.internal.ads.zzaf r7 = r4.zzd
            int r7 = r7.zzf
            r4.zzm = r6
            r7 = 0
        L_0x0091:
            com.google.android.gms.internal.ads.zzgau r11 = r8.zzo
            int r11 = r11.size()
            if (r7 >= r11) goto L_0x00af
            com.google.android.gms.internal.ads.zzaf r11 = r4.zzd
            java.lang.String r11 = r11.zzm
            if (r11 == 0) goto L_0x00ac
            com.google.android.gms.internal.ads.zzgau r1 = r8.zzo
            java.lang.Object r1 = r1.get(r7)
            boolean r11 = r11.equals(r1)
            if (r11 == 0) goto L_0x00ac
            goto L_0x00b2
        L_0x00ac:
            int r7 = r7 + 1
            goto L_0x0091
        L_0x00af:
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x00b2:
            r4.zzk = r7
            r7 = r9 & 384(0x180, float:5.38E-43)
            r8 = 128(0x80, float:1.794E-43)
            if (r7 != r8) goto L_0x00bc
            r7 = 1
            goto L_0x00bd
        L_0x00bc:
            r7 = 0
        L_0x00bd:
            r4.zzo = r7
            r7 = r9 & 64
            r8 = 64
            if (r7 != r8) goto L_0x00c7
            r7 = 1
            goto L_0x00c8
        L_0x00c7:
            r7 = 0
        L_0x00c8:
            r4.zzp = r7
            com.google.android.gms.internal.ads.zzaf r7 = r4.zzd
            java.lang.String r8 = r7.zzm
            r11 = 4
            r1 = 3
            r2 = 2
            if (r8 != 0) goto L_0x00d5
        L_0x00d3:
            r11 = 0
            goto L_0x0122
        L_0x00d5:
            int r3 = r8.hashCode()
            switch(r3) {
                case -1851077871: goto L_0x0105;
                case -1662735862: goto L_0x00fb;
                case -1662541442: goto L_0x00f1;
                case 1331836730: goto L_0x00e7;
                case 1599127257: goto L_0x00dd;
                default: goto L_0x00dc;
            }
        L_0x00dc:
            goto L_0x010f
        L_0x00dd:
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x010f
            r8 = 3
            goto L_0x0110
        L_0x00e7:
            java.lang.String r3 = "video/avc"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x010f
            r8 = 4
            goto L_0x0110
        L_0x00f1:
            java.lang.String r3 = "video/hevc"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x010f
            r8 = 2
            goto L_0x0110
        L_0x00fb:
            java.lang.String r3 = "video/av01"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x010f
            r8 = 1
            goto L_0x0110
        L_0x0105:
            java.lang.String r3 = "video/dolby-vision"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x010f
            r8 = 0
            goto L_0x0110
        L_0x010f:
            r8 = -1
        L_0x0110:
            if (r8 == 0) goto L_0x0121
            if (r8 == r6) goto L_0x0122
            if (r8 == r2) goto L_0x011f
            if (r8 == r1) goto L_0x011d
            if (r8 == r11) goto L_0x011b
            goto L_0x00d3
        L_0x011b:
            r11 = 1
            goto L_0x0122
        L_0x011d:
            r11 = 2
            goto L_0x0122
        L_0x011f:
            r11 = 3
            goto L_0x0122
        L_0x0121:
            r11 = 5
        L_0x0122:
            r4.zzq = r11
            int r8 = r7.zzf
            com.google.android.gms.internal.ads.zzvf r8 = r4.zzf
            boolean r11 = r8.zzQ
            boolean r11 = com.google.android.gms.internal.ads.zzvr.zzm(r9, r11)
            if (r11 != 0) goto L_0x0132
        L_0x0130:
            r6 = 0
            goto L_0x0153
        L_0x0132:
            boolean r11 = r4.zze
            if (r11 != 0) goto L_0x013b
            boolean r1 = r8.zzG
            if (r1 != 0) goto L_0x013b
            goto L_0x0130
        L_0x013b:
            boolean r0 = com.google.android.gms.internal.ads.zzvr.zzm(r9, r0)
            if (r0 == 0) goto L_0x0153
            boolean r0 = r4.zzg
            if (r0 == 0) goto L_0x0153
            if (r11 == 0) goto L_0x0153
            int r7 = r7.zzi
            if (r7 == r10) goto L_0x0153
            boolean r7 = r8.zzA
            boolean r7 = r8.zzz
            r5 = r5 & r9
            if (r5 == 0) goto L_0x0153
            r6 = 2
        L_0x0153:
            r4.zzn = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvq.<init>(int, com.google.android.gms.internal.ads.zzcp, int, com.google.android.gms.internal.ads.zzvf, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzvq zzvq, zzvq zzvq2) {
        zzgcc zzgcc;
        if (!zzvq.zze || !zzvq.zzh) {
            zzgcc = zzvr.zzc.zza();
        } else {
            zzgcc = zzvr.zzc;
        }
        zzgaj zzj2 = zzgaj.zzj();
        Integer valueOf = Integer.valueOf(zzvq.zzi);
        Integer valueOf2 = Integer.valueOf(zzvq2.zzi);
        boolean z = zzvq.zzf.zzz;
        return zzj2.zzc(valueOf, valueOf2, zzvr.zzd).zzc(Integer.valueOf(zzvq.zzj), Integer.valueOf(zzvq2.zzj), zzgcc).zzc(Integer.valueOf(zzvq.zzi), Integer.valueOf(zzvq2.zzi), zzgcc).zza();
    }

    public static /* synthetic */ int zzd(zzvq zzvq, zzvq zzvq2) {
        zzgaj zzb = zzgaj.zzj().zzd(zzvq.zzh, zzvq2.zzh).zzb(zzvq.zzl, zzvq2.zzl);
        boolean z = zzvq.zzm;
        boolean z2 = zzvq2.zzm;
        zzgaj zzc = zzb.zzd(true, true).zzd(zzvq.zze, zzvq2.zze).zzd(zzvq.zzg, zzvq2.zzg).zzc(Integer.valueOf(zzvq.zzk), Integer.valueOf(zzvq2.zzk), zzgcc.zzc().zza());
        boolean z3 = zzvq.zzo;
        zzgaj zzd = zzc.zzd(z3, zzvq2.zzo);
        boolean z4 = zzvq.zzp;
        zzgaj zzd2 = zzd.zzd(z4, zzvq2.zzp);
        if (z3 && z4) {
            zzd2 = zzd2.zzb(zzvq.zzq, zzvq2.zzq);
        }
        return zzd2.zza();
    }

    public final int zzb() {
        return this.zzn;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzvn zzvn) {
        zzvq zzvq = (zzvq) zzvn;
        if (!zzen.zzT(this.zzd.zzm, zzvq.zzd.zzm)) {
            return false;
        }
        boolean z = this.zzf.zzJ;
        return this.zzo == zzvq.zzo && this.zzp == zzvq.zzp;
    }
}
