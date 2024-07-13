package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzesb implements zza, zzasm, zzden, zzdeq, zzdfd, zzdfh, zzdgb, zzdgy, zzdhi, zzdmc {
    final BlockingQueue zza = new ArrayBlockingQueue(((Integer) zzba.zzc().zzb(zzbjj.zzhU)).intValue());
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicBoolean zzg = new AtomicBoolean(true);
    private final AtomicBoolean zzh = new AtomicBoolean(false);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final zzfnt zzj;

    public zzesb(zzfnt zzfnt) {
        this.zzj = zzfnt;
    }

    private final void zzt() {
        if (this.zzh.get() && this.zzi.get()) {
            for (Pair zzers : this.zza) {
                zzffo.zza(this.zzc, new zzers(zzers));
            }
            this.zza.clear();
            this.zzg.set(false);
        }
    }

    public final void onAdClicked() {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zziW)).booleanValue()) {
            zzffo.zza(this.zzb, zzert.zza);
        }
    }

    public final void zza(zze zze2) {
        zzffo.zza(this.zzb, new zzerv(zze2));
        zzffo.zza(this.zzb, new zzerw(zze2));
        zzffo.zza(this.zze, new zzerx(zze2));
        this.zzg.set(false);
        this.zza.clear();
    }

    public final void zzb(zzfix zzfix) {
        this.zzg.set(true);
        this.zzi.set(false);
    }

    public final void zzbG(zzccb zzccb) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzbv(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzg     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0036
            java.util.concurrent.BlockingQueue r0 = r3.zza     // Catch:{ all -> 0x0042 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.offer(r1)     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "The queue for app events is full, dropping the new event."
            com.google.android.gms.ads.internal.util.zze.zze(r0)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.zzfnt r0 = r3.zzj     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = "dae_action"
            com.google.android.gms.internal.ads.zzfns r1 = com.google.android.gms.internal.ads.zzfns.zzb(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "dae_name"
            r1.zza(r2, r4)     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "dae_data"
            r1.zza(r4, r5)     // Catch:{ all -> 0x0042 }
            r0.zzb(r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0034:
            monitor-exit(r3)
            return
        L_0x0036:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzc     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.zzero r1 = new com.google.android.gms.internal.ads.zzero     // Catch:{ all -> 0x0042 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0042 }
            com.google.android.gms.internal.ads.zzffo.zza(r0, r1)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)
            return
        L_0x0042:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesb.zzbv(java.lang.String, java.lang.String):void");
    }

    public final void zzbw() {
    }

    public final void zzbx() {
    }

    public final synchronized zzbh zzc() {
        return (zzbh) this.zzb.get();
    }

    public final synchronized zzcb zzd() {
        return (zzcb) this.zzc.get();
    }

    public final void zze(zzbh zzbh) {
        this.zzb.set(zzbh);
    }

    public final void zzf(zzbk zzbk) {
        this.zze.set(zzbk);
    }

    public final void zzg(zzs zzs) {
        zzffo.zza(this.zzd, new zzerq(zzs));
    }

    public final void zzh(zzdg zzdg) {
        this.zzd.set(zzdg);
    }

    public final void zzi(zzcb zzcb) {
        this.zzc.set(zzcb);
        this.zzh.set(true);
        zzt();
    }

    public final void zzj() {
        zzffo.zza(this.zzb, zzesa.zza);
        zzffo.zza(this.zzf, zzerj.zza);
    }

    public final void zzk(zze zze2) {
        zzffo.zza(this.zzf, new zzerp(zze2));
    }

    public final void zzl() {
        zzffo.zza(this.zzb, zzeri.zza);
    }

    public final void zzm() {
        zzffo.zza(this.zzb, zzerr.zza);
    }

    public final synchronized void zzn() {
        zzffo.zza(this.zzb, zzery.zza);
        zzffo.zza(this.zze, zzerz.zza);
        this.zzi.set(true);
        zzt();
    }

    public final void zzo() {
        zzffo.zza(this.zzb, zzerl.zza);
        zzffo.zza(this.zzf, zzerm.zza);
        zzffo.zza(this.zzf, zzern.zza);
    }

    public final void zzp(zzccr zzccr, String str, String str2) {
    }

    public final void zzq() {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zziW)).booleanValue()) {
            zzffo.zza(this.zzb, zzert.zza);
        }
        zzffo.zza(this.zzf, zzeru.zza);
    }

    public final void zzr() {
        zzffo.zza(this.zzb, zzerk.zza);
    }

    public final void zzs(zzci zzci) {
        this.zzf.set(zzci);
    }
}
