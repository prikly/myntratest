package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzffg implements zzfga {
    private final zzfga zza;
    private final zzfga zzb;
    private final zzflo zzc;
    private final String zzd;
    private zzddw zze;
    private final Executor zzf;

    public zzffg(zzfga zzfga, zzfga zzfga2, zzflo zzflo, String str, Executor executor) {
        this.zza = zzfga;
        this.zzb = zzfga2;
        this.zzc = zzflo;
        this.zzd = str;
        this.zzf = executor;
    }

    private final zzgfb zzg(zzflb zzflb, zzfgb zzfgb) {
        zzddw zzddw = zzflb.zza;
        this.zze = zzddw;
        if (zzflb.zzc != null) {
            if (zzddw.zzf() != null) {
                zzflb.zzc.zzo().zzbN(zzflb.zza.zzf());
            }
            return zzger.zzi(zzflb.zzc);
        }
        zzddw.zzb().zzl(zzflb.zzb);
        return ((zzffq) this.zza).zzb(zzfgb, (zzffz) null, zzflb.zza);
    }

    /* renamed from: zza */
    public final synchronized zzddw zzd() {
        return this.zze;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzb(zzfgb zzfgb, zzfff zzfff, zzffz zzffz, zzddw zzddw, zzffl zzffl) throws Exception {
        if (zzffl != null) {
            zzfff zzfff2 = new zzfff(zzfff.zza, zzfff.zzb, zzfff.zzc, zzfff.zzd, zzfff.zze, zzfff.zzf, zzffl.zza);
            if (zzffl.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzfff2);
                return zzg(zzffl.zzc, zzfgb);
            }
            zzgfb zza2 = this.zzc.zza(zzfff2);
            if (zza2 != null) {
                this.zze = null;
                return zzger.zzn(zza2, new zzffc(this), this.zzf);
            }
            this.zzc.zze(zzfff2);
            zzfgb = new zzfgb(zzfgb.zzb, zzffl.zzb);
        }
        zzgfb zzb2 = ((zzffq) this.zza).zzb(zzfgb, zzffz, zzddw);
        this.zze = zzddw;
        return zzb2;
    }

    public final /* bridge */ /* synthetic */ zzgfb zzc(zzfgb zzfgb, zzffz zzffz, Object obj) {
        return zzf(zzfgb, zzffz, (zzddw) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zze(zzfll zzfll) throws Exception {
        zzfln zzfln;
        if (zzfll == null || zzfll.zza == null || (zzfln = zzfll.zzb) == null) {
            throw new zzede(1, "Empty prefetch");
        }
        zzbfl zza2 = zzbfr.zza();
        zzbfj zza3 = zzbfk.zza();
        zza3.zzd(2);
        zza3.zzb(zzbfo.zzd());
        zza2.zza(zza3);
        zzfll.zza.zza.zzb().zzc().zzi((zzbfr) zza2.zzak());
        return zzg(zzfll.zza, ((zzfff) zzfln).zzb);
    }

    public final synchronized zzgfb zzf(zzfgb zzfgb, zzffz zzffz, zzddw zzddw) {
        zzfgb zzfgb2 = zzfgb;
        zzffz zzffz2 = zzffz;
        synchronized (this) {
            zzddv zza2 = zzffz2.zza(zzfgb2.zzb);
            zza2.zza(new zzffh(this.zzd));
            zzddw zzddw2 = (zzddw) zza2.zzh();
            zzddw2.zzg();
            zzddw2.zzg();
            zzl zzl = zzddw2.zzg().zzd;
            if (zzl.zzs == null) {
                if (zzl.zzx == null) {
                    zzfjg zzg = zzddw2.zzg();
                    zzffz zzffz3 = zzffz;
                    zzfgb zzfgb3 = zzfgb;
                    zzgfb zzn = zzger.zzn(zzgei.zzv(((zzffm) this.zzb).zzb(zzfgb2, zzffz2, zzddw2)), new zzffd(this, zzfgb, new zzfff(zzffz3, zzfgb3, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, (zzflc) null), zzffz, zzddw2), this.zzf);
                    return zzn;
                }
            }
            this.zze = zzddw2;
            zzgfb zzb2 = ((zzffq) this.zza).zzb(zzfgb2, zzffz2, zzddw2);
            return zzb2;
        }
    }
}
