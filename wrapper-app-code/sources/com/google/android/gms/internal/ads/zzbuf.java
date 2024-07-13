package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbuf {
    /* access modifiers changed from: private */
    public final Object zza = new Object();
    private final Context zzb;
    private final String zzc;
    private final zzchu zzd;
    /* access modifiers changed from: private */
    public final zzfoy zze;
    private final zzbb zzf;
    private final zzbb zzg;
    /* access modifiers changed from: private */
    public zzbue zzh;
    /* access modifiers changed from: private */
    public int zzi = 1;

    public zzbuf(Context context, zzchu zzchu, String str, zzbb zzbb, zzbb zzbb2, zzfoy zzfoy) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = zzchu;
        this.zze = zzfoy;
        this.zzf = zzbb;
        this.zzg = zzbb2;
    }

    public final zzbtz zzb(zzapj zzapj) {
        synchronized (this.zza) {
            synchronized (this.zza) {
                zzbue zzbue = this.zzh;
                if (zzbue != null && this.zzi == 0) {
                    zzbue.zzi(new zzbtk(this), zzbtl.zza);
                }
            }
            zzbue zzbue2 = this.zzh;
            if (zzbue2 != null) {
                if (zzbue2.zze() != -1) {
                    int i = this.zzi;
                    if (i == 0) {
                        zzbtz zza2 = this.zzh.zza();
                        return zza2;
                    } else if (i == 1) {
                        this.zzi = 2;
                        zzd((zzapj) null);
                        zzbtz zza3 = this.zzh.zza();
                        return zza3;
                    } else {
                        zzbtz zza4 = this.zzh.zza();
                        return zza4;
                    }
                }
            }
            this.zzi = 2;
            zzbue zzd2 = zzd((zzapj) null);
            this.zzh = zzd2;
            zzbtz zza5 = zzd2.zza();
            return zza5;
        }
    }

    /* access modifiers changed from: protected */
    public final zzbue zzd(zzapj zzapj) {
        zzfol zza2 = zzfok.zza(this.zzb, 6);
        zza2.zzh();
        zzbue zzbue = new zzbue(this.zzg);
        zzcib.zze.execute(new zzbtm(this, (zzapj) null, zzbue));
        zzbue.zzi(new zzbtu(this, zzbue, zza2), new zzbtv(this, zzbue, zza2));
        return zzbue;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzbue r4, com.google.android.gms.internal.ads.zzbta r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            int r1 = r4.zze()     // Catch:{ all -> 0x0028 }
            r2 = -1
            if (r1 == r2) goto L_0x0026
            int r1 = r4.zze()     // Catch:{ all -> 0x0028 }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            r4.zzg()     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.zzgfc r4 = com.google.android.gms.internal.ads.zzcib.zze     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.zzbtp r1 = new com.google.android.gms.internal.ads.zzbtp     // Catch:{ all -> 0x0028 }
            r1.<init>(r5)     // Catch:{ all -> 0x0028 }
            r4.execute(r1)     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.ads.internal.util.zze.zza(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbuf.zzi(com.google.android.gms.internal.ads.zzbue, com.google.android.gms.internal.ads.zzbta):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(zzapj zzapj, zzbue zzbue) {
        try {
            zzbti zzbti = new zzbti(this.zzb, this.zzd, (zzapj) null, (zza) null);
            zzbti.zzk(new zzbto(this, zzbue, zzbti));
            zzbti.zzq("/jsLoaded", new zzbtq(this, zzbue, zzbti));
            zzca zzca = new zzca();
            zzbtr zzbtr = new zzbtr(this, (zzapj) null, zzbti, zzca);
            zzca.zzb(zzbtr);
            zzbti.zzq("/requestReload", zzbtr);
            if (this.zzc.endsWith(".js")) {
                zzbti.zzh(this.zzc);
            } else if (this.zzc.startsWith("<html>")) {
                zzbti.zzf(this.zzc);
            } else {
                zzbti.zzg(this.zzc);
            }
            zzs.zza.postDelayed(new zzbtt(this, zzbue, zzbti), 60000);
        } catch (Throwable th) {
            zze.zzh("Error creating webview.", th);
            zzt.zzo().zzu(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbue.zzg();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzbta zzbta) {
        if (zzbta.zzi()) {
            this.zzi = 1;
        }
    }
}
