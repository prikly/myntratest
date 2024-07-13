package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcib {
    public static final zzgfc zza;
    public static final zzgfc zzb;
    public static final zzgfc zzc;
    public static final ScheduledExecutorService zzd = new zzchw(3, new zzchx("Schedule"));
    public static final zzgfc zze = new zzcia(new zzchy(), (zzchz) null);
    public static final zzgfc zzf = new zzcia(zzgfi.zzb(), (zzchz) null);

    /* JADX WARNING: type inference failed for: r0v11, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: type inference failed for: r0v14, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: type inference failed for: r0v18, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            java.lang.String r1 = "Default"
            if (r0 == 0) goto L_0x0019
            com.google.android.gms.internal.ads.zzfva.zza()
            com.google.android.gms.internal.ads.zzchx r0 = new com.google.android.gms.internal.ads.zzchx
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool(r0)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            goto L_0x0031
        L_0x0019:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue
            r7.<init>()
            com.google.android.gms.internal.ads.zzchx r8 = new com.google.android.gms.internal.ads.zzchx
            r8.<init>(r1)
            r2 = 2
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 10
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7, r8)
        L_0x0031:
            com.google.android.gms.internal.ads.zzcia r1 = new com.google.android.gms.internal.ads.zzcia
            r2 = 0
            r1.<init>(r0, r2)
            zza = r1
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            java.lang.String r1 = "Loader"
            r3 = 1
            if (r0 == 0) goto L_0x0051
            com.google.android.gms.internal.ads.zzfux r0 = com.google.android.gms.internal.ads.zzfva.zza()
            com.google.android.gms.internal.ads.zzchx r4 = new com.google.android.gms.internal.ads.zzchx
            r4.<init>(r1)
            r1 = 5
            java.util.concurrent.ExecutorService r0 = r0.zzc(r1, r4, r3)
            goto L_0x006a
        L_0x0051:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            com.google.android.gms.internal.ads.zzchx r11 = new com.google.android.gms.internal.ads.zzchx
            r11.<init>(r1)
            r5 = 5
            r6 = 5
            r7 = 10
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10, r11)
            r0.allowCoreThreadTimeOut(r3)
        L_0x006a:
            com.google.android.gms.internal.ads.zzcia r1 = new com.google.android.gms.internal.ads.zzcia
            r1.<init>(r0, r2)
            zzb = r1
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            java.lang.String r1 = "Activeview"
            if (r0 == 0) goto L_0x0087
            com.google.android.gms.internal.ads.zzfux r0 = com.google.android.gms.internal.ads.zzfva.zza()
            com.google.android.gms.internal.ads.zzchx r4 = new com.google.android.gms.internal.ads.zzchx
            r4.<init>(r1)
            java.util.concurrent.ExecutorService r0 = r0.zzb(r4, r3)
            goto L_0x00a0
        L_0x0087:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            com.google.android.gms.internal.ads.zzchx r11 = new com.google.android.gms.internal.ads.zzchx
            r11.<init>(r1)
            r5 = 1
            r6 = 1
            r7 = 10
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10, r11)
            r0.allowCoreThreadTimeOut(r3)
        L_0x00a0:
            com.google.android.gms.internal.ads.zzcia r1 = new com.google.android.gms.internal.ads.zzcia
            r1.<init>(r0, r2)
            zzc = r1
            com.google.android.gms.internal.ads.zzchw r0 = new com.google.android.gms.internal.ads.zzchw
            com.google.android.gms.internal.ads.zzchx r1 = new com.google.android.gms.internal.ads.zzchx
            java.lang.String r3 = "Schedule"
            r1.<init>(r3)
            r3 = 3
            r0.<init>(r3, r1)
            zzd = r0
            com.google.android.gms.internal.ads.zzchy r0 = new com.google.android.gms.internal.ads.zzchy
            r0.<init>()
            com.google.android.gms.internal.ads.zzcia r1 = new com.google.android.gms.internal.ads.zzcia
            r1.<init>(r0, r2)
            zze = r1
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.zzgfi.zzb()
            com.google.android.gms.internal.ads.zzcia r1 = new com.google.android.gms.internal.ads.zzcia
            r1.<init>(r0, r2)
            zzf = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcib.<clinit>():void");
    }
}
