package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public abstract class zzib {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    private static volatile zzhz zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzid zzh = new zzid(zzht.zza, (byte[]) null);
    private static final AtomicInteger zzi = new AtomicInteger();
    final zzhy zza;
    final String zzb;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private final boolean zzm;

    /* synthetic */ zzib(zzhy zzhy, String str, Object obj, boolean z, zzia zzia) {
        if (zzhy.zzb != null) {
            this.zza = zzhy;
            this.zzb = str;
            this.zzj = obj;
            this.zzm = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static void zzd() {
        zzi.incrementAndGet();
    }

    public static void zze(Context context) {
        if (zze == null) {
            synchronized (zzd) {
                if (zze == null) {
                    synchronized (zzd) {
                        zzhz zzhz = zze;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzhz == null || zzhz.zza() != context) {
                            zzhf.zze();
                            zzic.zzc();
                            zzhn.zze();
                            zze = new zzhc(context, zzim.zza(new zzhs(context)));
                            zzi.incrementAndGet();
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Object zza(Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        r2 = r2.zzb(zzc());
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzb() {
        /*
            r6 = this;
            boolean r0 = r6.zzm
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = r6.zzb
            if (r0 == 0) goto L_0x0009
            goto L_0x0011
        L_0x0009:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "flagName must not be null"
            r0.<init>(r1)
            throw r0
        L_0x0011:
            java.util.concurrent.atomic.AtomicInteger r0 = zzi
            int r0 = r0.get()
            int r1 = r6.zzk
            if (r1 >= r0) goto L_0x00e2
            monitor-enter(r6)
            int r1 = r6.zzk     // Catch:{ all -> 0x00df }
            if (r1 >= r0) goto L_0x00dd
            com.google.android.gms.internal.measurement.zzhz r1 = zze     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x00d7
            com.google.android.gms.internal.measurement.zzhy r2 = r6.zza     // Catch:{ all -> 0x00df }
            boolean r3 = r2.zzf     // Catch:{ all -> 0x00df }
            android.net.Uri r2 = r2.zzb     // Catch:{ all -> 0x00df }
            r3 = 0
            if (r2 == 0) goto L_0x0056
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x00df }
            com.google.android.gms.internal.measurement.zzhy r4 = r6.zza     // Catch:{ all -> 0x00df }
            android.net.Uri r4 = r4.zzb     // Catch:{ all -> 0x00df }
            boolean r2 = com.google.android.gms.internal.measurement.zzhp.zza(r2, r4)     // Catch:{ all -> 0x00df }
            if (r2 == 0) goto L_0x0054
            com.google.android.gms.internal.measurement.zzhy r2 = r6.zza     // Catch:{ all -> 0x00df }
            boolean r2 = r2.zzh     // Catch:{ all -> 0x00df }
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x00df }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x00df }
            com.google.android.gms.internal.measurement.zzhy r4 = r6.zza     // Catch:{ all -> 0x00df }
            android.net.Uri r4 = r4.zzb     // Catch:{ all -> 0x00df }
            com.google.android.gms.internal.measurement.zzhr r5 = com.google.android.gms.internal.measurement.zzhr.zza     // Catch:{ all -> 0x00df }
            com.google.android.gms.internal.measurement.zzhf r2 = com.google.android.gms.internal.measurement.zzhf.zza(r2, r4, r5)     // Catch:{ all -> 0x00df }
            goto L_0x0064
        L_0x0054:
            r2 = r3
            goto L_0x0064
        L_0x0056:
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x00df }
            com.google.android.gms.internal.measurement.zzhy r4 = r6.zza     // Catch:{ all -> 0x00df }
            java.lang.String r4 = r4.zza     // Catch:{ all -> 0x00df }
            com.google.android.gms.internal.measurement.zzhr r4 = com.google.android.gms.internal.measurement.zzhr.zza     // Catch:{ all -> 0x00df }
            com.google.android.gms.internal.measurement.zzic r2 = com.google.android.gms.internal.measurement.zzic.zza(r2, r3, r4)     // Catch:{ all -> 0x00df }
        L_0x0064:
            if (r2 == 0) goto L_0x0075
            java.lang.String r4 = r6.zzc()     // Catch:{ all -> 0x00df }
            java.lang.Object r2 = r2.zzb(r4)     // Catch:{ all -> 0x00df }
            if (r2 == 0) goto L_0x0075
            java.lang.Object r2 = r6.zza(r2)     // Catch:{ all -> 0x00df }
            goto L_0x0076
        L_0x0075:
            r2 = r3
        L_0x0076:
            if (r2 == 0) goto L_0x0079
            goto L_0x00a5
        L_0x0079:
            com.google.android.gms.internal.measurement.zzhy r2 = r6.zza     // Catch:{ all -> 0x00df }
            boolean r4 = r2.zze     // Catch:{ all -> 0x00df }
            if (r4 != 0) goto L_0x00a0
            com.google.android.gms.internal.measurement.zzif r2 = r2.zzi     // Catch:{ all -> 0x00df }
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x00df }
            com.google.android.gms.internal.measurement.zzhn r2 = com.google.android.gms.internal.measurement.zzhn.zza(r2)     // Catch:{ all -> 0x00df }
            com.google.android.gms.internal.measurement.zzhy r4 = r6.zza     // Catch:{ all -> 0x00df }
            boolean r5 = r4.zze     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x0091
            r4 = r3
            goto L_0x0095
        L_0x0091:
            java.lang.String r4 = r4.zzc     // Catch:{ all -> 0x00df }
            java.lang.String r4 = r6.zzb     // Catch:{ all -> 0x00df }
        L_0x0095:
            java.lang.String r2 = r2.zzb(r4)     // Catch:{ all -> 0x00df }
            if (r2 == 0) goto L_0x00a0
            java.lang.Object r2 = r6.zza(r2)     // Catch:{ all -> 0x00df }
            goto L_0x00a1
        L_0x00a0:
            r2 = r3
        L_0x00a1:
            if (r2 != 0) goto L_0x00a5
            java.lang.Object r2 = r6.zzj     // Catch:{ all -> 0x00df }
        L_0x00a5:
            com.google.android.gms.internal.measurement.zzii r1 = r1.zzb()     // Catch:{ all -> 0x00df }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x00df }
            com.google.android.gms.internal.measurement.zzig r1 = (com.google.android.gms.internal.measurement.zzig) r1     // Catch:{ all -> 0x00df }
            boolean r4 = r1.zzb()     // Catch:{ all -> 0x00df }
            if (r4 == 0) goto L_0x00d2
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x00df }
            com.google.android.gms.internal.measurement.zzhh r1 = (com.google.android.gms.internal.measurement.zzhh) r1     // Catch:{ all -> 0x00df }
            com.google.android.gms.internal.measurement.zzhy r2 = r6.zza     // Catch:{ all -> 0x00df }
            android.net.Uri r4 = r2.zzb     // Catch:{ all -> 0x00df }
            java.lang.String r5 = r2.zza     // Catch:{ all -> 0x00df }
            java.lang.String r2 = r2.zzd     // Catch:{ all -> 0x00df }
            java.lang.String r5 = r6.zzb     // Catch:{ all -> 0x00df }
            java.lang.String r1 = r1.zza(r4, r3, r2, r5)     // Catch:{ all -> 0x00df }
            if (r1 != 0) goto L_0x00ce
            java.lang.Object r2 = r6.zzj     // Catch:{ all -> 0x00df }
            goto L_0x00d2
        L_0x00ce:
            java.lang.Object r2 = r6.zza(r1)     // Catch:{ all -> 0x00df }
        L_0x00d2:
            r6.zzl = r2     // Catch:{ all -> 0x00df }
            r6.zzk = r0     // Catch:{ all -> 0x00df }
            goto L_0x00dd
        L_0x00d7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00df }
            r0.<init>(r2)     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00df }
        L_0x00dd:
            monitor-exit(r6)     // Catch:{ all -> 0x00df }
            goto L_0x00e2
        L_0x00df:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00df }
            throw r0
        L_0x00e2:
            java.lang.Object r0 = r6.zzl
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzib.zzb():java.lang.Object");
    }

    public final String zzc() {
        String str = this.zza.zzd;
        return this.zzb;
    }
}
