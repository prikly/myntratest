package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfab implements zzezm {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzcgo zzg;

    zzfab(zzcgo zzcgo, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2, byte[] bArr) {
        this.zzg = zzcgo;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    public final int zza() {
        return 40;
    }

    public final zzgfb zzb() {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzaO)).booleanValue()) {
            return zzger.zzh(new Exception("Did not ad Ad ID into query param."));
        }
        return zzger.zzf((zzgei) zzger.zzo(zzger.zzm(zzgei.zzv(this.zzg.zza(this.zza, this.zzd)), new zzezz(this), this.zzc), ((Long) zzba.zzc().zzb(zzbjj.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfaa(this), this.zzc);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0061, code lost:
        com.google.android.gms.ads.internal.zzt.zzo().zzu(r0, "AdIdInfoSignalSource.getPaidV1");
        r0 = new com.google.android.gms.internal.ads.zzfvc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbjj.zzcE)).booleanValue() == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbjj.zzcF)).booleanValue() != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1 = com.google.android.gms.internal.ads.zzfvf.zzj(r7.zza);
        r8.getClass();
        r2 = r8.getId();
        r2.getClass();
        r0 = r1.zzi(r2, r7.zza.getPackageName(), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbjj.zzcI)).longValue(), r7.zzf);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzfac zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzfvc r0 = new com.google.android.gms.internal.ads.zzfvc
            r0.<init>()
            boolean r1 = r7.zze
            if (r1 != 0) goto L_0x001b
            com.google.android.gms.internal.ads.zzbjb r1 = com.google.android.gms.internal.ads.zzbjj.zzcE
            com.google.android.gms.internal.ads.zzbjh r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0031
        L_0x001b:
            boolean r1 = r7.zze
            if (r1 == 0) goto L_0x006f
            com.google.android.gms.internal.ads.zzbjb r1 = com.google.android.gms.internal.ads.zzbjj.zzcF
            com.google.android.gms.internal.ads.zzbjh r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x006f
        L_0x0031:
            android.content.Context r0 = r7.zza     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            com.google.android.gms.internal.ads.zzfvf r1 = com.google.android.gms.internal.ads.zzfvf.zzj(r0)     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            r8.getClass()     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            java.lang.String r2 = r8.getId()     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            r2.getClass()     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            android.content.Context r0 = r7.zza     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            java.lang.String r3 = r0.getPackageName()     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjj.zzcI     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            com.google.android.gms.internal.ads.zzbjh r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            java.lang.Object r0 = r4.zzb(r0)     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            long r4 = r0.longValue()     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            boolean r6 = r7.zzf     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            com.google.android.gms.internal.ads.zzfvc r0 = r1.zzi(r2, r3, r4, r6)     // Catch:{ IOException -> 0x0060, IllegalArgumentException -> 0x005e }
            goto L_0x006f
        L_0x005e:
            r0 = move-exception
            goto L_0x0061
        L_0x0060:
            r0 = move-exception
        L_0x0061:
            com.google.android.gms.internal.ads.zzcgx r1 = com.google.android.gms.ads.internal.zzt.zzo()
            java.lang.String r2 = "AdIdInfoSignalSource.getPaidV1"
            r1.zzu(r0, r2)
            com.google.android.gms.internal.ads.zzfvc r0 = new com.google.android.gms.internal.ads.zzfvc
            r0.<init>()
        L_0x006f:
            com.google.android.gms.internal.ads.zzfac r1 = new com.google.android.gms.internal.ads.zzfac
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfab.zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient$Info):com.google.android.gms.internal.ads.zzfac");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfac zzd(Throwable th) {
        String str;
        zzay.zzb();
        ContentResolver contentResolver = this.zza.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        return new zzfac((AdvertisingIdClient.Info) null, str, new zzfvc());
    }
}
