package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdka {
    private final Set zza;
    private final Set zzb;
    private final Set zzc;
    private final Set zzd;
    private final Set zze;
    private final Set zzf;
    private final Set zzg;
    private final Set zzh;
    private final Set zzi;
    private final Set zzj;
    private final Set zzk;
    private final Set zzl;
    private final Set zzm;
    private final Set zzn;
    private final zzffx zzo;
    private zzdep zzp;
    private zzeoj zzq;

    /* synthetic */ zzdka(zzdjy zzdjy, zzdjz zzdjz) {
        this.zza = zzdjy.zzc;
        this.zzb = zzdjy.zzd;
        this.zzd = zzdjy.zzf;
        this.zze = zzdjy.zzg;
        this.zzc = zzdjy.zze;
        this.zzf = zzdjy.zzh;
        this.zzg = zzdjy.zza;
        this.zzh = zzdjy.zzi;
        this.zzi = zzdjy.zzl;
        this.zzj = zzdjy.zzj;
        this.zzk = zzdjy.zzk;
        this.zzl = zzdjy.zzm;
        this.zzo = zzdjy.zzo;
        this.zzm = zzdjy.zzn;
        this.zzn = zzdjy.zzb;
    }

    public final zzdep zza(Set set) {
        if (this.zzp == null) {
            this.zzp = new zzdep(set);
        }
        return this.zzp;
    }

    public final zzeoj zzb(Clock clock, zzeok zzeok, zzekv zzekv, zzfpo zzfpo) {
        if (this.zzq == null) {
            this.zzq = new zzeoj(clock, zzeok, zzekv, zzfpo);
        }
        return this.zzq;
    }

    public final zzffx zzc() {
        return this.zzo;
    }

    public final Set zzd() {
        return this.zzm;
    }

    public final Set zze() {
        return this.zza;
    }

    public final Set zzf() {
        return this.zzh;
    }

    public final Set zzg() {
        return this.zzi;
    }

    public final Set zzh() {
        return this.zzd;
    }

    public final Set zzi() {
        return this.zzc;
    }

    public final Set zzj() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final Set zzk() {
        return this.zzg;
    }

    public final Set zzl() {
        return this.zzj;
    }

    public final Set zzm() {
        return this.zze;
    }

    public final Set zzn() {
        return this.zzl;
    }

    public final Set zzo() {
        return this.zzn;
    }

    public final Set zzp() {
        return this.zzk;
    }

    /* access modifiers changed from: package-private */
    public final Set zzq() {
        return this.zzb;
    }
}
