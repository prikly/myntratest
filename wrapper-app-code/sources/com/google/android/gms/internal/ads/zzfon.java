package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfon implements zzfol {
    private final Context zza;
    /* access modifiers changed from: private */
    public long zzb = 0;
    /* access modifiers changed from: private */
    public long zzc = -1;
    /* access modifiers changed from: private */
    public boolean zzd = false;
    /* access modifiers changed from: private */
    public int zze = 0;
    /* access modifiers changed from: private */
    public String zzf = "";
    /* access modifiers changed from: private */
    public String zzg = "";
    /* access modifiers changed from: private */
    public String zzh = "";
    /* access modifiers changed from: private */
    public String zzi = "";
    /* access modifiers changed from: private */
    public String zzj = "";
    /* access modifiers changed from: private */
    public String zzk = "";
    /* access modifiers changed from: private */
    public String zzl = "";
    private boolean zzm = false;
    private boolean zzn = false;
    /* access modifiers changed from: private */
    public final int zzo;
    /* access modifiers changed from: private */
    public int zzp = 2;
    /* access modifiers changed from: private */
    public int zzq = 2;

    zzfon(Context context, int i) {
        this.zza = context;
        this.zzo = i;
    }

    public final synchronized zzfon zzH(int i) {
        this.zzp = i;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfol zza(zze zze2) {
        zzq(zze2);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfol zzb(zzfiw zzfiw) {
        zzr(zzfiw);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfol zzc(String str) {
        zzs(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfol zzd(String str) {
        zzt(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfol zze(String str) {
        zzu(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfol zzf(boolean z) {
        zzv(z);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfol zzg(Throwable th) {
        zzw(th);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfol zzh() {
        zzx();
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfol zzi() {
        zzy();
        return this;
    }

    public final synchronized boolean zzj() {
        return this.zzn;
    }

    public final boolean zzk() {
        return !TextUtils.isEmpty(this.zzh);
    }

    public final synchronized zzfop zzl() {
        if (this.zzm) {
            return null;
        }
        this.zzm = true;
        if (!this.zzn) {
            zzx();
        }
        if (this.zzc < 0) {
            zzy();
        }
        return new zzfop(this, (zzfoo) null);
    }

    public final /* bridge */ /* synthetic */ zzfol zzm(int i) {
        zzH(i);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzfon zzq(com.google.android.gms.ads.internal.client.zze r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.os.IBinder r3 = r3.zze     // Catch:{ all -> 0x0023 }
            if (r3 != 0) goto L_0x0007
            monitor-exit(r2)
            return r2
        L_0x0007:
            com.google.android.gms.internal.ads.zzdeg r3 = (com.google.android.gms.internal.ads.zzdeg) r3     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r3.zzk()     // Catch:{ all -> 0x0023 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0015
            r2.zzf = r0     // Catch:{ all -> 0x0023 }
        L_0x0015:
            java.lang.String r3 = r3.zzi()     // Catch:{ all -> 0x0023 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            r2.zzg = r3     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r2)
            return r2
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfon.zzq(com.google.android.gms.ads.internal.client.zze):com.google.android.gms.internal.ads.zzfon");
    }

    public final synchronized zzfon zzr(zzfiw zzfiw) {
        if (!TextUtils.isEmpty(zzfiw.zzb.zzb)) {
            this.zzf = zzfiw.zzb.zzb;
        }
        Iterator it = zzfiw.zza.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfil zzfil = (zzfil) it.next();
            if (!TextUtils.isEmpty(zzfil.zzac)) {
                this.zzg = zzfil.zzac;
                break;
            }
        }
        return this;
    }

    public final synchronized zzfon zzs(String str) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzhT)).booleanValue()) {
            this.zzl = str;
        }
        return this;
    }

    public final synchronized zzfon zzt(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfon zzu(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfon zzv(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzfon zzw(Throwable th) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzhT)).booleanValue()) {
            this.zzk = zzcat.zzd(th);
            this.zzj = (String) zzfyr.zzc(zzfxq.zzc(10)).zzd(zzcat.zzc(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfon zzx() {
        this.zze = zzt.zzq().zzm(this.zza);
        Resources resources = this.zza.getResources();
        int i = 2;
        if (resources != null) {
            Configuration configuration = resources.getConfiguration();
            if (configuration != null) {
                i = configuration.orientation == 2 ? 4 : 3;
            }
        }
        this.zzq = i;
        this.zzb = zzt.zzB().elapsedRealtime();
        this.zzn = true;
        return this;
    }

    public final synchronized zzfon zzy() {
        this.zzc = zzt.zzB().elapsedRealtime();
        return this;
    }
}
