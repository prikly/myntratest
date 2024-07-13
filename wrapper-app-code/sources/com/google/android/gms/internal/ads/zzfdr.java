package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzfdr implements zzesr {
    protected final zzcpj zza;
    private final Context zzb;
    /* access modifiers changed from: private */
    public final Executor zzc;
    /* access modifiers changed from: private */
    public final zzfeh zzd;
    /* access modifiers changed from: private */
    public final zzfga zze;
    private final zzchu zzf;
    private final ViewGroup zzg;
    /* access modifiers changed from: private */
    public final zzfoy zzh;
    private final zzfje zzi;
    /* access modifiers changed from: private */
    public zzgfb zzj;

    protected zzfdr(Context context, Executor executor, zzcpj zzcpj, zzfga zzfga, zzfeh zzfeh, zzfje zzfje, zzchu zzchu) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcpj;
        this.zze = zzfga;
        this.zzd = zzfeh;
        this.zzi = zzfje;
        this.zzf = zzchu;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcpj.zzz();
    }

    /* access modifiers changed from: private */
    public final synchronized zzddv zzm(zzffy zzffy) {
        zzfdq zzfdq = (zzfdq) zzffy;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzhr)).booleanValue()) {
            zzcyi zzcyi = new zzcyi(this.zzg);
            zzddx zzddx = new zzddx();
            zzddx.zzc(this.zzb);
            zzddx.zzf(zzfdq.zza);
            zzddz zzg2 = zzddx.zzg();
            zzdjy zzdjy = new zzdjy();
            zzdjy.zzc(this.zzd, this.zzc);
            zzdjy.zzl(this.zzd, this.zzc);
            return zzc(zzcyi, zzg2, zzdjy.zzn());
        }
        zzfeh zzi2 = zzfeh.zzi(this.zzd);
        zzdjy zzdjy2 = new zzdjy();
        zzdjy2.zzb(zzi2, this.zzc);
        zzdjy2.zzg(zzi2, this.zzc);
        zzdjy2.zzh(zzi2, this.zzc);
        zzdjy2.zzi(zzi2, this.zzc);
        zzdjy2.zzc(zzi2, this.zzc);
        zzdjy2.zzl(zzi2, this.zzc);
        zzdjy2.zzm(zzi2);
        zzcyi zzcyi2 = new zzcyi(this.zzg);
        zzddx zzddx2 = new zzddx();
        zzddx2.zzc(this.zzb);
        zzddx2.zzf(zzfdq.zza);
        return zzc(zzcyi2, zzddx2.zzg(), zzdjy2.zzn());
    }

    public final boolean zza() {
        zzgfb zzgfb = this.zzj;
        return zzgfb != null && !zzgfb.isDone();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056 A[SYNTHETIC, Splitter:B:16:0x0056] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl r8, java.lang.String r9, com.google.android.gms.internal.ads.zzesp r10, com.google.android.gms.internal.ads.zzesq r11) throws android.os.RemoteException {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.gms.internal.ads.zzbkl r10 = com.google.android.gms.internal.ads.zzbkx.zzd     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r10.zze()     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.zzbjb r10 = com.google.android.gms.internal.ads.zzbjj.zzjn     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbjh r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r2.zzb(r10)     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x0025
            r10 = 1
            goto L_0x0026
        L_0x0025:
            r10 = 0
        L_0x0026:
            com.google.android.gms.internal.ads.zzchu r2 = r7.zzf     // Catch:{ all -> 0x00f4 }
            int r2 = r2.zzc     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbjb r3 = com.google.android.gms.internal.ads.zzbjj.zzjo     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbjh r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r3 = r4.zzb(r3)     // Catch:{ all -> 0x00f4 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x00f4 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x00f4 }
            if (r2 < r3) goto L_0x003e
            if (r10 != 0) goto L_0x0043
        L_0x003e:
            java.lang.String r10 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r10)     // Catch:{ all -> 0x00f4 }
        L_0x0043:
            if (r9 != 0) goto L_0x0056
            java.lang.String r8 = "Ad unit ID should not be null for app open ad."
            com.google.android.gms.ads.internal.util.zze.zzg(r8)     // Catch:{ all -> 0x00f4 }
            java.util.concurrent.Executor r8 = r7.zzc     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfdl r9 = new com.google.android.gms.internal.ads.zzfdl     // Catch:{ all -> 0x00f4 }
            r9.<init>(r7)     // Catch:{ all -> 0x00f4 }
            r8.execute(r9)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)
            return r1
        L_0x0056:
            com.google.android.gms.internal.ads.zzgfb r10 = r7.zzj     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x005c
            monitor-exit(r7)
            return r1
        L_0x005c:
            com.google.android.gms.internal.ads.zzbkl r10 = com.google.android.gms.internal.ads.zzbks.zzc     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r10.zze()     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            r1 = 7
            r2 = 0
            if (r10 == 0) goto L_0x0088
            com.google.android.gms.internal.ads.zzfga r10 = r7.zze     // Catch:{ all -> 0x00f4 }
            java.lang.Object r3 = r10.zzd()     // Catch:{ all -> 0x00f4 }
            if (r3 == 0) goto L_0x0088
            java.lang.Object r10 = r10.zzd()     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzcxs r10 = (com.google.android.gms.internal.ads.zzcxs) r10     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfow r10 = r10.zzh()     // Catch:{ all -> 0x00f4 }
            r10.zzh(r1)     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = r8.zzp     // Catch:{ all -> 0x00f4 }
            r10.zzb(r3)     // Catch:{ all -> 0x00f4 }
            r4 = r10
            goto L_0x0089
        L_0x0088:
            r4 = r2
        L_0x0089:
            android.content.Context r10 = r7.zzb     // Catch:{ all -> 0x00f4 }
            boolean r3 = r8.zzf     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfka.zza(r10, r3)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbjb r10 = com.google.android.gms.internal.ads.zzbjj.zzhX     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzbjh r3 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ all -> 0x00f4 }
            java.lang.Object r10 = r3.zzb(r10)     // Catch:{ all -> 0x00f4 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00f4 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x00af
            boolean r10 = r8.zzf     // Catch:{ all -> 0x00f4 }
            if (r10 == 0) goto L_0x00af
            com.google.android.gms.internal.ads.zzcpj r10 = r7.zza     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzece r10 = r10.zzk()     // Catch:{ all -> 0x00f4 }
            r10.zzm(r0)     // Catch:{ all -> 0x00f4 }
        L_0x00af:
            com.google.android.gms.internal.ads.zzfje r10 = r7.zzi     // Catch:{ all -> 0x00f4 }
            r10.zzs(r9)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.ads.internal.client.zzq r9 = com.google.android.gms.ads.internal.client.zzq.zzb()     // Catch:{ all -> 0x00f4 }
            r10.zzr(r9)     // Catch:{ all -> 0x00f4 }
            r10.zzE(r8)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfjg r9 = r10.zzG()     // Catch:{ all -> 0x00f4 }
            android.content.Context r10 = r7.zzb     // Catch:{ all -> 0x00f4 }
            int r3 = com.google.android.gms.internal.ads.zzfov.zzf(r9)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfol r5 = com.google.android.gms.internal.ads.zzfok.zzb(r10, r3, r1, r8)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfdq r6 = new com.google.android.gms.internal.ads.zzfdq     // Catch:{ all -> 0x00f4 }
            r6.<init>(r2)     // Catch:{ all -> 0x00f4 }
            r6.zza = r9     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfga r8 = r7.zze     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfgb r9 = new com.google.android.gms.internal.ads.zzfgb     // Catch:{ all -> 0x00f4 }
            r9.<init>(r6, r2)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfdm r10 = new com.google.android.gms.internal.ads.zzfdm     // Catch:{ all -> 0x00f4 }
            r10.<init>(r7)     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzgfb r8 = r8.zzc(r9, r10, r2)     // Catch:{ all -> 0x00f4 }
            r7.zzj = r8     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzfdo r9 = new com.google.android.gms.internal.ads.zzfdo     // Catch:{ all -> 0x00f4 }
            r1 = r9
            r2 = r7
            r3 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00f4 }
            java.util.concurrent.Executor r10 = r7.zzc     // Catch:{ all -> 0x00f4 }
            com.google.android.gms.internal.ads.zzger.zzr(r8, r9, r10)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)
            return r0
        L_0x00f4:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdr.zzb(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.google.android.gms.internal.ads.zzesp, com.google.android.gms.internal.ads.zzesq):boolean");
    }

    /* access modifiers changed from: protected */
    public abstract zzddv zzc(zzcyi zzcyi, zzddz zzddz, zzdka zzdka);

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk() {
        this.zzd.zza(zzfkg.zzd(6, (String) null, (zze) null));
    }

    public final void zzl(zzw zzw) {
        this.zzi.zzt(zzw);
    }
}
