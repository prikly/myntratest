package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdbu {
    private final zzeem zza;
    private final zzfjg zzb;
    private final zzfnj zzc;
    private final zzcvc zzd;
    private final zzeoo zze;
    /* access modifiers changed from: private */
    public final zzdjs zzf;
    private zzfix zzg;
    private final zzefr zzh;
    private final zzddt zzi;
    private final Executor zzj;
    private final zzefd zzk;
    private final zzekv zzl;
    private final zzegh zzm;
    private final zzegn zzn;

    zzdbu(zzeem zzeem, zzfjg zzfjg, zzfnj zzfnj, zzcvc zzcvc, zzeoo zzeoo, zzdjs zzdjs, zzfix zzfix, zzefr zzefr, zzddt zzddt, Executor executor, zzefd zzefd, zzekv zzekv, zzegh zzegh, zzegn zzegn) {
        this.zza = zzeem;
        this.zzb = zzfjg;
        this.zzc = zzfnj;
        this.zzd = zzcvc;
        this.zze = zzeoo;
        this.zzf = zzdjs;
        this.zzg = zzfix;
        this.zzh = zzefr;
        this.zzi = zzddt;
        this.zzj = executor;
        this.zzk = zzefd;
        this.zzl = zzekv;
        this.zzm = zzegh;
        this.zzn = zzegn;
    }

    public final zze zza(Throwable th) {
        return zzfkg.zzb(th, this.zzl);
    }

    public final zzdjs zzc() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfix zzd(zzfix zzfix) throws Exception {
        this.zzd.zza(zzfix);
        return zzfix;
    }

    public final zzgfb zze(zzfkz zzfkz) {
        zzfmo zza2 = this.zzc.zzb(zzfnd.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzdbr(this, zzfkz)).zza();
        zzger.zzr(zza2, new zzdbs(this), this.zzj);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzf(zzfkz zzfkz, zzccb zzccb) throws Exception {
        zzccb.zzi = zzfkz;
        return this.zzh.zza(zzccb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzg(zzgfb zzgfb, zzgfb zzgfb2, zzgfb zzgfb3) throws Exception {
        return this.zzn.zzb((zzccb) zzgfb.get(), (JSONObject) zzgfb2.get(), (zzcce) zzgfb3.get());
    }

    public final zzgfb zzh(zzccb zzccb) {
        zzfmo zza2 = this.zzc.zzb(zzfnd.NOTIFY_CACHE_HIT, this.zzh.zzg(zzccb)).zza();
        zzger.zzr(zza2, new zzdbt(this), this.zzj);
        return zza2;
    }

    public final zzgfb zzi(zzgfb zzgfb) {
        zzfna zzf2 = this.zzc.zzb(zzfnd.RENDERER, zzgfb).zze(new zzdbq(this)).zzf(this.zze);
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzeV)).booleanValue()) {
            zzf2 = zzf2.zzi((long) ((Integer) zzba.zzc().zzb(zzbjj.zzeW)).intValue(), TimeUnit.SECONDS);
        }
        return zzf2.zza();
    }

    public final zzgfb zzj() {
        zzl zzl2 = this.zzb.zzd;
        if (zzl2.zzx == null && zzl2.zzs == null) {
            return zzk(this.zzi.zzc());
        }
        zzfnj zzfnj = this.zzc;
        return zzfmt.zzc(this.zza.zza(), zzfnd.PRELOADED_LOADER, zzfnj).zza();
    }

    public final zzgfb zzk(zzgfb zzgfb) {
        if (this.zzg != null) {
            zzfnj zzfnj = this.zzc;
            return zzfmt.zzc(zzger.zzi(this.zzg), zzfnd.SERVER_TRANSACTION, zzfnj).zza();
        }
        zzt.zzc().zzj();
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzjx)).booleanValue() || ((Boolean) zzble.zzb.zze()).booleanValue()) {
            return this.zzc.zzb(zzfnd.SERVER_TRANSACTION, zzgfb).zzf(new zzdbp(this.zzk)).zza();
        }
        zzgfb zzn2 = zzger.zzn(zzgfb, new zzdbl(this.zzm), this.zzj);
        zzfmo zza2 = this.zzc.zzb(zzfnd.BUILD_URL, zzn2).zzf(new zzdbm(this.zzh)).zza();
        return this.zzc.zza(zzfnd.SERVER_TRANSACTION, zzgfb, zzn2, zza2).zza(new zzdbn(this, zzgfb, zzn2, zza2)).zzf(zzdbo.zza).zza();
    }

    public final void zzl(zzfix zzfix) {
        this.zzg = zzfix;
    }
}
