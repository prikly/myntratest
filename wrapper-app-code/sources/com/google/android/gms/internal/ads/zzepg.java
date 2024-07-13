package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzepg implements zzdoe {
    private final Context zza;
    private final zzdwp zzb;
    private final zzfjg zzc;
    private final zzchu zzd;
    private final zzfil zze;
    private final zzgfb zzf;
    private final zzcno zzg;
    private final zzbqf zzh;
    private final boolean zzi;

    zzepg(Context context, zzdwp zzdwp, zzfjg zzfjg, zzchu zzchu, zzfil zzfil, zzgfb zzgfb, zzcno zzcno, zzbqf zzbqf, boolean z) {
        this.zza = context;
        this.zzb = zzdwp;
        this.zzc = zzfjg;
        this.zzd = zzchu;
        this.zze = zzfil;
        this.zzf = zzgfb;
        this.zzg = zzcno;
        this.zzh = zzbqf;
        this.zzi = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(boolean r22, android.content.Context r23, com.google.android.gms.internal.ads.zzdfa r24) {
        /*
            r21 = this;
            r1 = r21
            com.google.android.gms.internal.ads.zzgfb r0 = r1.zzf
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzger.zzq(r0)
            com.google.android.gms.internal.ads.zzdvu r0 = (com.google.android.gms.internal.ads.zzdvu) r0
            com.google.android.gms.internal.ads.zzfil r2 = r1.zze     // Catch:{ zzcnz -> 0x00fc }
            com.google.android.gms.internal.ads.zzcno r3 = r1.zzg     // Catch:{ zzcnz -> 0x00fc }
            boolean r3 = r3.zzaD()     // Catch:{ zzcnz -> 0x00fc }
            r4 = 1
            if (r3 != 0) goto L_0x0019
            com.google.android.gms.internal.ads.zzcno r2 = r1.zzg     // Catch:{ zzcnz -> 0x00fc }
        L_0x0017:
            r11 = r2
            goto L_0x007e
        L_0x0019:
            com.google.android.gms.internal.ads.zzbjb r3 = com.google.android.gms.internal.ads.zzbjj.zzaG     // Catch:{ zzcnz -> 0x00fc }
            com.google.android.gms.internal.ads.zzbjh r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ zzcnz -> 0x00fc }
            java.lang.Object r3 = r5.zzb(r3)     // Catch:{ zzcnz -> 0x00fc }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ zzcnz -> 0x00fc }
            boolean r3 = r3.booleanValue()     // Catch:{ zzcnz -> 0x00fc }
            if (r3 != 0) goto L_0x002e
            com.google.android.gms.internal.ads.zzcno r2 = r1.zzg     // Catch:{ zzcnz -> 0x00fc }
            goto L_0x0017
        L_0x002e:
            com.google.android.gms.internal.ads.zzdwp r3 = r1.zzb     // Catch:{ zzcnz -> 0x00fc }
            com.google.android.gms.internal.ads.zzfjg r5 = r1.zzc     // Catch:{ zzcnz -> 0x00fc }
            com.google.android.gms.ads.internal.client.zzq r5 = r5.zze     // Catch:{ zzcnz -> 0x00fc }
            r6 = 0
            com.google.android.gms.internal.ads.zzcno r3 = r3.zza(r5, r6, r6)     // Catch:{ zzcnz -> 0x00fc }
            com.google.android.gms.internal.ads.zzdml r5 = r0.zzg()     // Catch:{ zzcnz -> 0x00fc }
            com.google.android.gms.internal.ads.zzbqt.zzb(r3, r5)     // Catch:{ zzcnz -> 0x00fc }
            com.google.android.gms.internal.ads.zzdwt r5 = new com.google.android.gms.internal.ads.zzdwt     // Catch:{ zzcnz -> 0x00fc }
            r5.<init>()     // Catch:{ zzcnz -> 0x00fc }
            android.content.Context r7 = r1.zza     // Catch:{ zzcnz -> 0x00fc }
            r8 = r3
            android.view.View r8 = (android.view.View) r8     // Catch:{ zzcnz -> 0x00fc }
            r5.zza(r7, r8)     // Catch:{ zzcnz -> 0x00fc }
            com.google.android.gms.internal.ads.zzdwo r7 = r0.zzl()     // Catch:{ zzcnz -> 0x00fc }
            boolean r8 = r1.zzi     // Catch:{ zzcnz -> 0x00fc }
            if (r8 == 0) goto L_0x0058
            com.google.android.gms.internal.ads.zzbqf r8 = r1.zzh     // Catch:{ zzcnz -> 0x00fc }
            goto L_0x0059
        L_0x0058:
            r8 = r6
        L_0x0059:
            r7.zzi(r3, r4, r8)     // Catch:{ zzcnz -> 0x00fc }
            com.google.android.gms.internal.ads.zzcpb r7 = r3.zzP()     // Catch:{ zzcnz -> 0x00fc }
            com.google.android.gms.internal.ads.zzepe r8 = new com.google.android.gms.internal.ads.zzepe     // Catch:{ zzcnz -> 0x00fc }
            r8.<init>(r5, r3)     // Catch:{ zzcnz -> 0x00fc }
            r7.zzA(r8)     // Catch:{ zzcnz -> 0x00fc }
            com.google.android.gms.internal.ads.zzcpb r5 = r3.zzP()     // Catch:{ zzcnz -> 0x00fc }
            com.google.android.gms.internal.ads.zzepf r7 = new com.google.android.gms.internal.ads.zzepf     // Catch:{ zzcnz -> 0x00fc }
            r7.<init>(r3)     // Catch:{ zzcnz -> 0x00fc }
            r5.zzG(r7)     // Catch:{ zzcnz -> 0x00fc }
            com.google.android.gms.internal.ads.zzfiq r2 = r2.zzt     // Catch:{ zzcnz -> 0x00fc }
            java.lang.String r5 = r2.zzb     // Catch:{ zzcnz -> 0x00fc }
            java.lang.String r2 = r2.zza     // Catch:{ zzcnz -> 0x00fc }
            r3.zzad(r5, r2, r6)     // Catch:{ zzcnz -> 0x00fc }
            r11 = r3
        L_0x007e:
            r11.zzap(r4)
            com.google.android.gms.ads.internal.zzj r2 = new com.google.android.gms.ads.internal.zzj
            boolean r3 = r1.zzi
            r5 = 0
            if (r3 == 0) goto L_0x0090
            com.google.android.gms.internal.ads.zzbqf r3 = r1.zzh
            boolean r3 = r3.zze(r5)
            r13 = r3
            goto L_0x0091
        L_0x0090:
            r13 = 0
        L_0x0091:
            com.google.android.gms.ads.internal.zzt.zzp()
            android.content.Context r3 = r1.zza
            boolean r14 = com.google.android.gms.ads.internal.util.zzs.zzE(r3)
            boolean r3 = r1.zzi
            if (r3 == 0) goto L_0x00a6
            com.google.android.gms.internal.ads.zzbqf r5 = r1.zzh
            boolean r5 = r5.zzd()
            r15 = r5
            goto L_0x00a7
        L_0x00a6:
            r15 = 0
        L_0x00a7:
            if (r3 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.zzbqf r3 = r1.zzh
            float r3 = r3.zza()
            r16 = r3
            goto L_0x00b5
        L_0x00b2:
            r3 = 0
            r16 = 0
        L_0x00b5:
            com.google.android.gms.internal.ads.zzfil r3 = r1.zze
            r17 = -1
            boolean r5 = r3.zzP
            boolean r3 = r3.zzQ
            r12 = r2
            r18 = r22
            r19 = r5
            r20 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r24 == 0) goto L_0x00cc
            r24.zzf()
        L_0x00cc:
            com.google.android.gms.ads.internal.zzt.zzi()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = new com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel
            com.google.android.gms.internal.ads.zzdnt r9 = r0.zzj()
            com.google.android.gms.internal.ads.zzfil r0 = r1.zze
            int r12 = r0.zzR
            com.google.android.gms.internal.ads.zzchu r13 = r1.zzd
            java.lang.String r14 = r0.zzC
            com.google.android.gms.internal.ads.zzfiq r0 = r0.zzt
            r8 = 0
            r10 = 0
            java.lang.String r5 = r0.zzb
            java.lang.String r0 = r0.zza
            com.google.android.gms.internal.ads.zzfjg r6 = r1.zzc
            java.lang.String r6 = r6.zzf
            r7 = r3
            r15 = r2
            r16 = r5
            r17 = r0
            r18 = r6
            r19 = r24
            r7.<init>((com.google.android.gms.ads.internal.client.zza) r8, (com.google.android.gms.ads.internal.overlay.zzo) r9, (com.google.android.gms.ads.internal.overlay.zzz) r10, (com.google.android.gms.internal.ads.zzcno) r11, (int) r12, (com.google.android.gms.internal.ads.zzchu) r13, (java.lang.String) r14, (com.google.android.gms.ads.internal.zzj) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (com.google.android.gms.internal.ads.zzdfa) r19)
            r0 = r23
            com.google.android.gms.ads.internal.overlay.zzm.zza(r0, r3, r4)
            return
        L_0x00fc:
            r0 = move-exception
            java.lang.String r2 = ""
            com.google.android.gms.internal.ads.zzcho.zzh(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzepg.zza(boolean, android.content.Context, com.google.android.gms.internal.ads.zzdfa):void");
    }
}
