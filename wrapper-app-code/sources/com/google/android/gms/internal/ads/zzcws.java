package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcws implements zzo, zzbbx, zzdfh, zzdfi {
    private final zzcwn zza;
    private final zzcwo zzb;
    private final Set zzc = new HashSet();
    private final zzbvf zzd;
    private final Executor zze;
    private final Clock zzf;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcwr zzh = new zzcwr();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcws(zzbvc zzbvc, zzcwo zzcwo, Executor executor, zzcwn zzcwn, Clock clock) {
        this.zza = zzcwn;
        this.zzd = zzbvc.zza("google.afma.activeView.handleUpdate", zzbuq.zza, zzbuq.zza);
        this.zzb = zzcwo;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzk() {
        for (zzcno zzf2 : this.zzc) {
            this.zza.zzf(zzf2);
        }
        this.zza.zze();
    }

    public final void zzb() {
    }

    public final void zzbE() {
    }

    public final synchronized void zzbM() {
        this.zzh.zzb = false;
        zzg();
    }

    public final synchronized void zzbr(Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    public final synchronized void zzbs() {
        this.zzh.zzb = true;
        zzg();
    }

    public final synchronized void zzbt(Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    public final synchronized void zzbu(Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    public final synchronized void zzc(zzbbw zzbbw) {
        zzcwr zzcwr = this.zzh;
        zzcwr.zza = zzbbw.zzj;
        zzcwr.zzf = zzbbw;
        zzg();
    }

    public final void zze() {
    }

    public final void zzf(int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzg() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.ref.WeakReference r0 = r5.zzj     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x005b
            boolean r0 = r5.zzi     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x0059
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.zzg     // Catch:{ all -> 0x0060 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.zzcwr r0 = r5.zzh     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.common.util.Clock r1 = r5.zzf     // Catch:{ Exception -> 0x0051 }
            long r1 = r1.elapsedRealtime()     // Catch:{ Exception -> 0x0051 }
            r0.zzd = r1     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.zzcwo r0 = r5.zzb     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.zzcwr r1 = r5.zzh     // Catch:{ Exception -> 0x0051 }
            org.json.JSONObject r0 = r0.zzb(r1)     // Catch:{ Exception -> 0x0051 }
            java.util.Set r1 = r5.zzc     // Catch:{ Exception -> 0x0051 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0051 }
        L_0x002d:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0051 }
            if (r2 == 0) goto L_0x0044
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.zzcno r2 = (com.google.android.gms.internal.ads.zzcno) r2     // Catch:{ Exception -> 0x0051 }
            java.util.concurrent.Executor r3 = r5.zze     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.zzcwq r4 = new com.google.android.gms.internal.ads.zzcwq     // Catch:{ Exception -> 0x0051 }
            r4.<init>(r2, r0)     // Catch:{ Exception -> 0x0051 }
            r3.execute(r4)     // Catch:{ Exception -> 0x0051 }
            goto L_0x002d
        L_0x0044:
            com.google.android.gms.internal.ads.zzbvf r1 = r5.zzd     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.zzgfb r0 = r1.zzb(r0)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r1 = "ActiveViewListener.callActiveViewJs"
            com.google.android.gms.internal.ads.zzcie.zzb(r0, r1)     // Catch:{ Exception -> 0x0051 }
            monitor-exit(r5)
            return
        L_0x0051:
            r0 = move-exception
            java.lang.String r1 = "Failed to call ActiveViewJS"
            com.google.android.gms.ads.internal.util.zze.zzb(r1, r0)     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return
        L_0x0059:
            monitor-exit(r5)
            return
        L_0x005b:
            r5.zzj()     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return
        L_0x0060:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcws.zzg():void");
    }

    public final synchronized void zzh(zzcno zzcno) {
        this.zzc.add(zzcno);
        this.zza.zzd(zzcno);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    public final synchronized void zzl() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }
}
