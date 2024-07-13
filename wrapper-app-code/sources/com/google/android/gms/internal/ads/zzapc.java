package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzapc implements zzapf {
    private static zzapc zzb;
    volatile long zza = 0;
    private final Context zzc;
    private final zzfto zzd;
    private final zzftv zze;
    private final zzftx zzf;
    private final zzaqd zzg;
    /* access modifiers changed from: private */
    public final zzfrz zzh;
    private final Executor zzi;
    private final zzftu zzj;
    private final CountDownLatch zzk;
    private final zzaqt zzl;
    private final zzaqk zzm;
    /* access modifiers changed from: private */
    public final Object zzn = new Object();
    /* access modifiers changed from: private */
    public volatile boolean zzo;
    private volatile boolean zzp = false;
    private final int zzq;

    zzapc(Context context, zzfrz zzfrz, zzfto zzfto, zzftv zzftv, zzftx zzftx, zzaqd zzaqd, Executor executor, zzfru zzfru, int i, zzaqt zzaqt, zzaqk zzaqk) {
        this.zzc = context;
        this.zzh = zzfrz;
        this.zzd = zzfto;
        this.zze = zzftv;
        this.zzf = zzftx;
        this.zzg = zzaqd;
        this.zzi = executor;
        this.zzq = i;
        this.zzl = zzaqt;
        this.zzm = zzaqk;
        this.zzp = false;
        this.zzk = new CountDownLatch(1);
        this.zzj = new zzapa(this, zzfru);
    }

    public static synchronized zzapc zza(String str, Context context, boolean z, boolean z2) {
        zzapc zzb2;
        synchronized (zzapc.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzapc zzb(String str, Context context, Executor executor, boolean z, boolean z2) {
        zzapc zzapc;
        Context context2 = context;
        Executor executor2 = executor;
        synchronized (zzapc.class) {
            if (zzb == null) {
                zzfsa zza2 = zzfsb.zza();
                zza2.zza(str);
                zza2.zzc(z);
                zzfsb zzd2 = zza2.zzd();
                zzfrz zza3 = zzfrz.zza(context2, executor2, z2);
                zzapn zzc2 = ((Boolean) zzba.zzc().zzb(zzbjj.zzcS)).booleanValue() ? zzapn.zzc(context) : null;
                zzaqt zzd3 = ((Boolean) zzba.zzc().zzb(zzbjj.zzcT)).booleanValue() ? zzaqt.zzd(context, executor) : null;
                zzaqk zzaqk = ((Boolean) zzba.zzc().zzb(zzbjj.zzcl)).booleanValue() ? new zzaqk() : null;
                zzfss zze2 = zzfss.zze(context2, executor2, zza3, zzd2);
                zzaqc zzaqc = new zzaqc(context2);
                zzaqd zzaqd = new zzaqd(zzd2, zze2, new zzaqr(context2, zzaqc), zzaqc, zzc2, zzd3, zzaqk);
                int zzb2 = zzftb.zzb(context2, zza3);
                zzfru zzfru = new zzfru();
                zzapc zzapc2 = new zzapc(context, zza3, new zzfto(context2, zzb2), new zzftv(context2, zzb2, new zzaoz(zza3), ((Boolean) zzba.zzc().zzb(zzbjj.zzbU)).booleanValue()), new zzftx(context2, zzaqd, zza3, zzfru), zzaqd, executor, zzfru, zzb2, zzd3, zzaqk);
                zzb = zzapc2;
                zzapc2.zzm();
                zzb.zzo();
            }
            zzapc = zzb;
        }
        return zzapc;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r4.zzd().zzj().equals(r5.zzj()) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r12.zzh.zzd(2030, java.lang.System.currentTimeMillis() - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0116, code lost:
        r12 = r12.zzk;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x010a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzapc r12) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1
            com.google.android.gms.internal.ads.zzftn r3 = r12.zzs(r2)
            r4 = 0
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzasf r4 = r3.zza()
            java.lang.String r4 = r4.zzk()
            com.google.android.gms.internal.ads.zzasf r3 = r3.zza()
            java.lang.String r3 = r3.zzj()
            r9 = r3
            r8 = r4
            goto L_0x0021
        L_0x001f:
            r8 = r4
            r9 = r8
        L_0x0021:
            android.content.Context r5 = r12.zzc     // Catch:{ zzgyp -> 0x012a }
            r6 = 1
            int r7 = r12.zzq     // Catch:{ zzgyp -> 0x012a }
            java.lang.String r10 = "1"
            com.google.android.gms.internal.ads.zzfrz r11 = r12.zzh     // Catch:{ zzgyp -> 0x012a }
            com.google.android.gms.internal.ads.zzfts r3 = com.google.android.gms.internal.ads.zzfsj.zza(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ zzgyp -> 0x012a }
            byte[] r4 = r3.zzb     // Catch:{ zzgyp -> 0x012a }
            if (r4 == 0) goto L_0x0119
            int r5 = r4.length     // Catch:{ zzgyp -> 0x012a }
            if (r5 != 0) goto L_0x0037
            goto L_0x0119
        L_0x0037:
            com.google.android.gms.internal.ads.zzgwv r4 = com.google.android.gms.internal.ads.zzgwv.zzv(r4)     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.zzgxp r5 = com.google.android.gms.internal.ads.zzgxp.zza()     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.zzasc r4 = com.google.android.gms.internal.ads.zzasc.zzc(r4, r5)     // Catch:{ NullPointerException -> 0x010a }
            com.google.android.gms.internal.ads.zzasf r5 = r4.zzd()     // Catch:{ zzgyp -> 0x012a }
            java.lang.String r5 = r5.zzk()     // Catch:{ zzgyp -> 0x012a }
            boolean r5 = r5.isEmpty()     // Catch:{ zzgyp -> 0x012a }
            if (r5 != 0) goto L_0x00fb
            com.google.android.gms.internal.ads.zzasf r5 = r4.zzd()     // Catch:{ zzgyp -> 0x012a }
            java.lang.String r5 = r5.zzj()     // Catch:{ zzgyp -> 0x012a }
            boolean r5 = r5.isEmpty()     // Catch:{ zzgyp -> 0x012a }
            if (r5 != 0) goto L_0x00fb
            com.google.android.gms.internal.ads.zzgwv r5 = r4.zze()     // Catch:{ zzgyp -> 0x012a }
            byte[] r5 = r5.zzE()     // Catch:{ zzgyp -> 0x012a }
            int r5 = r5.length     // Catch:{ zzgyp -> 0x012a }
            if (r5 != 0) goto L_0x006c
            goto L_0x00fb
        L_0x006c:
            com.google.android.gms.internal.ads.zzftn r5 = r12.zzs(r2)     // Catch:{ zzgyp -> 0x012a }
            if (r5 != 0) goto L_0x0073
            goto L_0x009b
        L_0x0073:
            com.google.android.gms.internal.ads.zzasf r5 = r5.zza()     // Catch:{ zzgyp -> 0x012a }
            com.google.android.gms.internal.ads.zzasf r6 = r4.zzd()     // Catch:{ zzgyp -> 0x012a }
            java.lang.String r6 = r6.zzk()     // Catch:{ zzgyp -> 0x012a }
            java.lang.String r7 = r5.zzk()     // Catch:{ zzgyp -> 0x012a }
            boolean r6 = r6.equals(r7)     // Catch:{ zzgyp -> 0x012a }
            if (r6 == 0) goto L_0x009b
            com.google.android.gms.internal.ads.zzasf r6 = r4.zzd()     // Catch:{ zzgyp -> 0x012a }
            java.lang.String r6 = r6.zzj()     // Catch:{ zzgyp -> 0x012a }
            java.lang.String r5 = r5.zzj()     // Catch:{ zzgyp -> 0x012a }
            boolean r5 = r6.equals(r5)     // Catch:{ zzgyp -> 0x012a }
            if (r5 != 0) goto L_0x00fb
        L_0x009b:
            com.google.android.gms.internal.ads.zzftu r5 = r12.zzj     // Catch:{ zzgyp -> 0x012a }
            int r3 = r3.zzc     // Catch:{ zzgyp -> 0x012a }
            com.google.android.gms.internal.ads.zzbjb r6 = com.google.android.gms.internal.ads.zzbjj.zzbS     // Catch:{ zzgyp -> 0x012a }
            com.google.android.gms.internal.ads.zzbjh r7 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ zzgyp -> 0x012a }
            java.lang.Object r6 = r7.zzb(r6)     // Catch:{ zzgyp -> 0x012a }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ zzgyp -> 0x012a }
            boolean r6 = r6.booleanValue()     // Catch:{ zzgyp -> 0x012a }
            if (r6 == 0) goto L_0x00c5
            r6 = 3
            if (r3 != r6) goto L_0x00bb
            com.google.android.gms.internal.ads.zzftv r3 = r12.zze     // Catch:{ zzgyp -> 0x012a }
            boolean r3 = r3.zza(r4)     // Catch:{ zzgyp -> 0x012a }
            goto L_0x00cb
        L_0x00bb:
            r6 = 4
            if (r3 != r6) goto L_0x00cd
            com.google.android.gms.internal.ads.zzftv r3 = r12.zze     // Catch:{ zzgyp -> 0x012a }
            boolean r3 = r3.zzb(r4, r5)     // Catch:{ zzgyp -> 0x012a }
            goto L_0x00cb
        L_0x00c5:
            com.google.android.gms.internal.ads.zzfto r3 = r12.zzd     // Catch:{ zzgyp -> 0x012a }
            boolean r3 = r3.zza(r4, r5)     // Catch:{ zzgyp -> 0x012a }
        L_0x00cb:
            if (r3 != 0) goto L_0x00df
        L_0x00cd:
            com.google.android.gms.internal.ads.zzfrz r2 = r12.zzh     // Catch:{ zzgyp -> 0x012a }
            r3 = 4009(0xfa9, float:5.618E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgyp -> 0x012a }
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch:{ zzgyp -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
        L_0x00db:
            r12.countDown()
            return
        L_0x00df:
            com.google.android.gms.internal.ads.zzftn r3 = r12.zzs(r2)     // Catch:{ zzgyp -> 0x012a }
            if (r3 == 0) goto L_0x00f8
            com.google.android.gms.internal.ads.zzftx r4 = r12.zzf     // Catch:{ zzgyp -> 0x012a }
            boolean r3 = r4.zzc(r3)     // Catch:{ zzgyp -> 0x012a }
            if (r3 == 0) goto L_0x00ef
            r12.zzp = r2     // Catch:{ zzgyp -> 0x012a }
        L_0x00ef:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ zzgyp -> 0x012a }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r12.zza = r2     // Catch:{ zzgyp -> 0x012a }
        L_0x00f8:
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00db
        L_0x00fb:
            com.google.android.gms.internal.ads.zzfrz r2 = r12.zzh     // Catch:{ zzgyp -> 0x012a }
            r3 = 5010(0x1392, float:7.02E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgyp -> 0x012a }
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch:{ zzgyp -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00db
        L_0x010a:
            com.google.android.gms.internal.ads.zzfrz r2 = r12.zzh     // Catch:{ zzgyp -> 0x012a }
            r3 = 2030(0x7ee, float:2.845E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgyp -> 0x012a }
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch:{ zzgyp -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00db
        L_0x0119:
            com.google.android.gms.internal.ads.zzfrz r2 = r12.zzh     // Catch:{ zzgyp -> 0x012a }
            r3 = 5009(0x1391, float:7.019E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ zzgyp -> 0x012a }
            long r4 = r4 - r0
            r2.zzd(r3, r4)     // Catch:{ zzgyp -> 0x012a }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00db
        L_0x0128:
            r0 = move-exception
            goto L_0x013a
        L_0x012a:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfrz r3 = r12.zzh     // Catch:{ all -> 0x0128 }
            r4 = 4002(0xfa2, float:5.608E-42)
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0128 }
            long r5 = r5 - r0
            r3.zzc(r4, r5, r2)     // Catch:{ all -> 0x0128 }
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            goto L_0x00db
        L_0x013a:
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            r12.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapc.zzj(com.google.android.gms.internal.ads.zzapc):void");
    }

    private final void zzr() {
        zzaqt zzaqt = this.zzl;
        if (zzaqt != null) {
            zzaqt.zzh();
        }
    }

    private final zzftn zzs(int i) {
        if (!zzftb.zza(this.zzq)) {
            return null;
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzbS)).booleanValue()) {
            return this.zze.zzc(1);
        }
        return this.zzd.zzc(1);
    }

    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, (Activity) null);
    }

    public final String zzf(Context context, String str, View view, Activity activity) {
        zzr();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzcl)).booleanValue()) {
            this.zzm.zzi();
        }
        zzo();
        zzfsc zza2 = this.zzf.zza();
        if (zza2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza3 = zza2.zza(context, (String) null, str, view, activity);
        this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza3, (Map) null);
        return zza3;
    }

    public final String zzg(Context context) {
        zzr();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzcl)).booleanValue()) {
            this.zzm.zzj();
        }
        zzo();
        zzfsc zza2 = this.zzf.zza();
        if (zza2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzc2 = zza2.zzc(context, (String) null);
        this.zzh.zzf(IronSourceConstants.errorCode_biddingDataException, System.currentTimeMillis() - currentTimeMillis, zzc2, (Map) null);
        return zzc2;
    }

    public final String zzh(Context context, View view, Activity activity) {
        zzr();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzcl)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzo();
        zzfsc zza2 = this.zzf.zza();
        if (zza2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb2 = zza2.zzb(context, (String) null, view, activity);
        this.zzh.zzf(IronSourceConstants.errorCode_isReadyException, System.currentTimeMillis() - currentTimeMillis, zzb2, (Map) null);
        return zzb2;
    }

    public final void zzk(MotionEvent motionEvent) {
        zzfsc zza2 = this.zzf.zza();
        if (zza2 != null) {
            try {
                zza2.zzd((String) null, motionEvent);
            } catch (zzftw e2) {
                this.zzh.zzc(e2.zza(), -1, e2);
            }
        }
    }

    public final void zzl(int i, int i2, int i3) {
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzftn zzs = zzs(1);
        if (zzs == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zzc(zzs)) {
            this.zzp = true;
            this.zzk.countDown();
        }
    }

    public final void zzn(View view) {
        this.zzg.zzd(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzo() {
        /*
            r6 = this;
            boolean r0 = r6.zzo
            if (r0 != 0) goto L_0x0042
            java.lang.Object r0 = r6.zzn
            monitor-enter(r0)
            boolean r1 = r6.zzo     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x003d
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003f }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r6.zza     // Catch:{ all -> 0x003f }
            long r1 = r1 - r3
            r3 = 3600(0xe10, double:1.7786E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.zzftx r1 = r6.zzf     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.zzftn r1 = r1.zzb()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.zzd(r3)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
        L_0x002b:
            int r1 = r6.zzq     // Catch:{ all -> 0x003f }
            boolean r1 = com.google.android.gms.internal.ads.zzftb.zza(r1)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            java.util.concurrent.Executor r1 = r6.zzi     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.zzapb r2 = new com.google.android.gms.internal.ads.zzapb     // Catch:{ all -> 0x003f }
            r2.<init>(r6)     // Catch:{ all -> 0x003f }
            r1.execute(r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r1
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapc.zzo():void");
    }

    public final synchronized boolean zzq() {
        return this.zzp;
    }
}
