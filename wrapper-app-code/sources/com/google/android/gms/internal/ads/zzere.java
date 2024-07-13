package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbp;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzere extends zzbp {
    final zzfje zza = new zzfje();
    final zzdqp zzb = new zzdqp();
    private final Context zzc;
    private final zzcpj zzd;
    private zzbh zze;

    public zzere(zzcpj zzcpj, Context context, String str) {
        this.zzd = zzcpj;
        this.zza.zzs(str);
        this.zzc = context;
    }

    public final zzbn zze() {
        zzdqr zzg = this.zzb.zzg();
        this.zza.zzB(zzg.zzi());
        this.zza.zzC(zzg.zzh());
        zzfje zzfje = this.zza;
        if (zzfje.zzg() == null) {
            zzfje.zzr(zzq.zzc());
        }
        return new zzerf(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    public final void zzf(zzbnj zzbnj) {
        this.zzb.zza(zzbnj);
    }

    public final void zzg(zzbnm zzbnm) {
        this.zzb.zzb(zzbnm);
    }

    public final void zzh(String str, zzbns zzbns, zzbnp zzbnp) {
        this.zzb.zzc(str, zzbns, zzbnp);
    }

    public final void zzi(zzbsu zzbsu) {
        this.zzb.zzd(zzbsu);
    }

    public final void zzj(zzbnw zzbnw, zzq zzq) {
        this.zzb.zze(zzbnw);
        this.zza.zzr(zzq);
    }

    public final void zzk(zzbnz zzbnz) {
        this.zzb.zzf(zzbnz);
    }

    public final void zzl(zzbh zzbh) {
        this.zze = zzbh;
    }

    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzq(adManagerAdViewOptions);
    }

    public final void zzn(zzbsl zzbsl) {
        this.zza.zzv(zzbsl);
    }

    public final void zzo(zzblz zzblz) {
        this.zza.zzA(zzblz);
    }

    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzD(publisherAdViewOptions);
    }

    public final void zzq(zzcf zzcf) {
        this.zza.zzQ(zzcf);
    }
}
