package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeyb implements zzezm {
    private final Context zza;
    private final zzgfc zzb;
    private final zzfjg zzc;

    zzeyb(Context context, zzgfc zzgfc, zzfjg zzfjg) {
        this.zza = context;
        this.zzb = zzgfc;
        this.zzc = zzfjg;
    }

    public final int zza() {
        return 53;
    }

    public final zzgfb zzb() {
        return this.zzb.zzb(new zzeya(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0054, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbjj.zzcz)).booleanValue() != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        r1 = com.google.android.gms.internal.ads.zzfvf.zzj(r0).zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbjj.zzcI)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008c, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbjj.zzcy)).booleanValue() == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a0, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbjj.zzcA)).booleanValue() != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a2, code lost:
        r0 = com.google.android.gms.internal.ads.zzfvg.zzi(r0);
        r2 = r0.zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbjj.zzcJ)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
        r3 = r0.zzo();
        r6 = r0.zzp();
        r4 = r2;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbjj.zzcx)).booleanValue() == false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeyc zzc() throws java.lang.Exception {
        /*
            r8 = this;
            android.content.Context r0 = r8.zza     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.internal.ads.zzfjg r1 = r8.zzc     // Catch:{ IOException -> 0x00dd }
            boolean r7 = r1.zzb()     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.internal.ads.zzfvc r1 = new com.google.android.gms.internal.ads.zzfvc     // Catch:{ IOException -> 0x00dd }
            r1.<init>()     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.internal.ads.zzfvc r2 = new com.google.android.gms.internal.ads.zzfvc     // Catch:{ IOException -> 0x00dd }
            r2.<init>()     // Catch:{ IOException -> 0x00dd }
            r3 = 1
            if (r7 == 0) goto L_0x002e
            com.google.android.gms.internal.ads.zzbjb r4 = com.google.android.gms.internal.ads.zzbjj.zzcB     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.internal.ads.zzbjh r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ IOException -> 0x00dd }
            java.lang.Object r4 = r5.zzb(r4)     // Catch:{ IOException -> 0x00dd }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IOException -> 0x00dd }
            boolean r4 = r4.booleanValue()     // Catch:{ IOException -> 0x00dd }
            if (r4 != 0) goto L_0x002e
            com.google.android.gms.internal.ads.zzeyc r0 = new com.google.android.gms.internal.ads.zzeyc     // Catch:{ IOException -> 0x00dd }
            r0.<init>(r3)     // Catch:{ IOException -> 0x00dd }
            goto L_0x00dc
        L_0x002e:
            if (r7 != 0) goto L_0x0042
            com.google.android.gms.internal.ads.zzbjb r4 = com.google.android.gms.internal.ads.zzbjj.zzcx     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.internal.ads.zzbjh r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ IOException -> 0x00dd }
            java.lang.Object r4 = r5.zzb(r4)     // Catch:{ IOException -> 0x00dd }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IOException -> 0x00dd }
            boolean r4 = r4.booleanValue()     // Catch:{ IOException -> 0x00dd }
            if (r4 != 0) goto L_0x0056
        L_0x0042:
            if (r7 == 0) goto L_0x007a
            com.google.android.gms.internal.ads.zzbjb r4 = com.google.android.gms.internal.ads.zzbjj.zzcz     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.internal.ads.zzbjh r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ IOException -> 0x00dd }
            java.lang.Object r4 = r5.zzb(r4)     // Catch:{ IOException -> 0x00dd }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IOException -> 0x00dd }
            boolean r4 = r4.booleanValue()     // Catch:{ IOException -> 0x00dd }
            if (r4 == 0) goto L_0x007a
        L_0x0056:
            com.google.android.gms.internal.ads.zzfvf r1 = com.google.android.gms.internal.ads.zzfvf.zzj(r0)     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.internal.ads.zzbjb r4 = com.google.android.gms.internal.ads.zzbjj.zzcI     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.internal.ads.zzbjh r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ IOException -> 0x00dd }
            java.lang.Object r4 = r5.zzb(r4)     // Catch:{ IOException -> 0x00dd }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ IOException -> 0x00dd }
            long r4 = r4.longValue()     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.internal.ads.zzcgx r6 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.ads.internal.util.zzg r6 = r6.zzh()     // Catch:{ IOException -> 0x00dd }
            boolean r6 = r6.zzP()     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.internal.ads.zzfvc r1 = r1.zzh(r4, r6)     // Catch:{ IOException -> 0x00dd }
        L_0x007a:
            if (r7 != 0) goto L_0x008e
            com.google.android.gms.internal.ads.zzbjb r4 = com.google.android.gms.internal.ads.zzbjj.zzcy     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.internal.ads.zzbjh r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ IOException -> 0x00dd }
            java.lang.Object r4 = r5.zzb(r4)     // Catch:{ IOException -> 0x00dd }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IOException -> 0x00dd }
            boolean r4 = r4.booleanValue()     // Catch:{ IOException -> 0x00dd }
            if (r4 != 0) goto L_0x00a2
        L_0x008e:
            if (r7 == 0) goto L_0x00d2
            com.google.android.gms.internal.ads.zzbjb r4 = com.google.android.gms.internal.ads.zzbjj.zzcA     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.internal.ads.zzbjh r5 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ IOException -> 0x00dd }
            java.lang.Object r4 = r5.zzb(r4)     // Catch:{ IOException -> 0x00dd }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IOException -> 0x00dd }
            boolean r4 = r4.booleanValue()     // Catch:{ IOException -> 0x00dd }
            if (r4 == 0) goto L_0x00d2
        L_0x00a2:
            com.google.android.gms.internal.ads.zzfvg r0 = com.google.android.gms.internal.ads.zzfvg.zzi(r0)     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.internal.ads.zzbjb r2 = com.google.android.gms.internal.ads.zzbjj.zzcJ     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.internal.ads.zzbjh r3 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ IOException -> 0x00dd }
            java.lang.Object r2 = r3.zzb(r2)     // Catch:{ IOException -> 0x00dd }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ IOException -> 0x00dd }
            long r2 = r2.longValue()     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.internal.ads.zzcgx r4 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.ads.internal.util.zzg r4 = r4.zzh()     // Catch:{ IOException -> 0x00dd }
            boolean r4 = r4.zzP()     // Catch:{ IOException -> 0x00dd }
            com.google.android.gms.internal.ads.zzfvc r2 = r0.zzh(r2, r4)     // Catch:{ IOException -> 0x00dd }
            boolean r3 = r0.zzo()     // Catch:{ IOException -> 0x00dd }
            boolean r0 = r0.zzp()     // Catch:{ IOException -> 0x00dd }
            r6 = r0
            r4 = r2
            r5 = r3
            goto L_0x00d5
        L_0x00d2:
            r4 = r2
            r5 = 1
            r6 = 1
        L_0x00d5:
            com.google.android.gms.internal.ads.zzeyc r0 = new com.google.android.gms.internal.ads.zzeyc     // Catch:{ IOException -> 0x00dd }
            r2 = r0
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x00dd }
        L_0x00dc:
            return r0
        L_0x00dd:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzcgx r1 = com.google.android.gms.ads.internal.zzt.zzo()
            java.lang.String r2 = "PerAppIdSignal"
            r1.zzu(r0, r2)
            com.google.android.gms.internal.ads.zzeyc r0 = new com.google.android.gms.internal.ads.zzeyc
            com.google.android.gms.internal.ads.zzfjg r1 = r8.zzc
            boolean r1 = r1.zzb()
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeyb.zzc():com.google.android.gms.internal.ads.zzeyc");
    }
}
