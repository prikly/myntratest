package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdce implements zza, zzden, zzdfh, zzdgb, zzdhi, zzdju {
    private final Clock zza;
    private final zzcgq zzb;

    public zzdce(Clock clock, zzcgq zzcgq) {
        this.zza = clock;
        this.zzb = zzcgq;
    }

    public final void onAdClicked() {
        this.zzb.zzd();
    }

    public final void zzb(zzfix zzfix) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    public final void zzbG(zzccb zzccb) {
    }

    public final void zzbw() {
    }

    public final void zzbx() {
    }

    public final String zzc() {
        return this.zzb.zzc();
    }

    public final void zzd() {
    }

    public final void zze(zzbfr zzbfr) {
        this.zzb.zzi();
    }

    public final void zzf(zzbfr zzbfr) {
    }

    public final void zzg(zzl zzl) {
        this.zzb.zzj(zzl);
    }

    public final void zzh(boolean z) {
    }

    public final void zzi(zzbfr zzbfr) {
        this.zzb.zzg();
    }

    public final void zzj() {
        this.zzb.zze();
    }

    public final void zzk(boolean z) {
    }

    public final void zzl() {
        this.zzb.zzf();
    }

    public final void zzm() {
    }

    public final void zzn() {
        this.zzb.zzh(true);
    }

    public final void zzo() {
    }

    public final void zzp(zzccr zzccr, String str, String str2) {
    }
}
