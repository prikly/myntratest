package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfho extends zzfrt implements zzden, zzdeq, zzdfd, zzdgb, zzdgy, zzdmc, zzffx {
    private final zzfko zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();

    public zzfho(zzfko zzfko) {
        this.zza = zzfko;
    }

    public final void zza(zze zze2) {
        int i = zze2.zza;
        zzffo.zza(this.zzc, new zzfgu(zze2));
        zzffo.zza(this.zzc, new zzfgv(i));
        zzffo.zza(this.zze, new zzfgw(i));
    }

    public final void zzb(zzfrt zzfrt) {
        this.zzb.set(zzfrt);
    }

    public final void zzbN(zzffx zzffx) {
        throw null;
    }

    public final void zzbw() {
        zzffo.zza(this.zze, zzfgz.zza);
    }

    public final void zzbx() {
        zzffo.zza(this.zze, zzfhd.zza);
    }

    public final void zzc(zzdg zzdg) {
        this.zzh.set(zzdg);
    }

    public final void zzd(zzcdn zzcdn) {
        this.zzd.set(zzcdn);
    }

    public final void zze(zzcdr zzcdr) {
        this.zzc.set(zzcdr);
    }

    @Deprecated
    public final void zzf(zzccx zzccx) {
        this.zze.set(zzccx);
    }

    public final void zzg(zzs zzs) {
        zzffo.zza(this.zzh, new zzfgt(zzs));
    }

    @Deprecated
    public final void zzh(zzccs zzccs) {
        this.zzg.set(zzccs);
    }

    public final void zzi(zzcds zzcds) {
        this.zzf.set(zzcds);
    }

    public final void zzj() {
        this.zza.zza();
        zzffo.zza(this.zzd, zzfha.zza);
        zzffo.zza(this.zze, zzfhb.zza);
    }

    public final void zzk(zze zze2) {
        zzffo.zza(this.zzd, new zzfgx(zze2));
        zzffo.zza(this.zzd, new zzfgy(zze2));
    }

    public final void zzm() {
        zzffo.zza(this.zze, zzfhj.zza);
    }

    public final void zzn() {
        zzffo.zza(this.zzc, zzfhg.zza);
        zzffo.zza(this.zze, zzfhh.zza);
    }

    public final void zzo() {
        zzffo.zza(this.zzd, zzfhc.zza);
        zzffo.zza(this.zze, zzfhe.zza);
        zzffo.zza(this.zzd, zzfhf.zza);
    }

    public final void zzp(zzccr zzccr, String str, String str2) {
        zzffo.zza(this.zzd, new zzfhk(zzccr));
        zzffo.zza(this.zzf, new zzfhl(zzccr, str, str2));
        zzffo.zza(this.zze, new zzfhm(zzccr));
        zzffo.zza(this.zzg, new zzfhn(zzccr, str, str2));
    }

    public final void zzq() {
        zzffo.zza(this.zzd, zzfgs.zza);
    }

    public final void zzr() {
    }

    public final void zzv() {
        zzffo.zza(this.zzb, zzfhi.zza);
    }
}
