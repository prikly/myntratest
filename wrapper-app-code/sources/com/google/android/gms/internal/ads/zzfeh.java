package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfeh implements zzo, zzdeq, zzdfd, zzdgm, zzdgy, zzdmc, zzffx {
    private final zzfko zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzfeh zzh = null;

    public zzfeh(zzfko zzfko) {
        this.zza = zzfko;
    }

    public static zzfeh zzi(zzfeh zzfeh) {
        zzfeh zzfeh2 = new zzfeh(zzfeh.zza);
        zzfeh2.zzh = zzfeh;
        return zzfeh2;
    }

    public final void zzb() {
        zzfeh zzfeh = this.zzh;
        if (zzfeh != null) {
            zzfeh.zzb();
            return;
        }
        zzffo.zza(this.zzf, zzfea.zza);
        zzffo.zza(this.zzd, zzfeb.zza);
        zzffo.zza(this.zzd, zzfec.zza);
    }

    public final void zzbE() {
        zzfeh zzfeh = this.zzh;
        if (zzfeh != null) {
            zzfeh.zzbE();
        } else {
            zzffo.zza(this.zzf, zzfdx.zza);
        }
    }

    public final void zzbM() {
    }

    public final void zzbN(zzffx zzffx) {
        this.zzh = (zzfeh) zzffx;
    }

    public final void zzbs() {
    }

    public final void zze() {
        zzfeh zzfeh = this.zzh;
        if (zzfeh != null) {
            zzfeh.zze();
        } else {
            zzffo.zza(this.zzf, zzfee.zza);
        }
    }

    public final void zzf(int i) {
        zzfeh zzfeh = this.zzh;
        if (zzfeh != null) {
            zzfeh.zzf(i);
        } else {
            zzffo.zza(this.zzf, new zzfdw(i));
        }
    }

    public final void zzg(zzs zzs) {
        zzfeh zzfeh = this.zzh;
        if (zzfeh != null) {
            zzfeh.zzg(zzs);
        } else {
            zzffo.zza(this.zzg, new zzfdv(zzs));
        }
    }

    public final void zzh() {
        zzfeh zzfeh = this.zzh;
        if (zzfeh != null) {
            zzfeh.zzh();
        } else {
            zzffo.zza(this.zze, zzfeg.zza);
        }
    }

    public final void zzj() {
        zzfeh zzfeh = this.zzh;
        if (zzfeh != null) {
            zzfeh.zzj();
            return;
        }
        this.zza.zza();
        zzffo.zza(this.zzc, zzfdt.zza);
        zzffo.zza(this.zzd, zzfdu.zza);
    }

    public final void zzk(zze zze2) {
        zzfeh zzfeh = this.zzh;
        if (zzfeh != null) {
            zzfeh.zzk(zze2);
        } else {
            zzffo.zza(this.zzd, new zzfed(zze2));
        }
    }

    public final void zzn(zzdgm zzdgm) {
        this.zze.set(zzdgm);
    }

    public final void zzo(zzo zzo) {
        this.zzf.set(zzo);
    }

    public final void zzp(zzdg zzdg) {
        this.zzg.set(zzdg);
    }

    public final void zzq() {
        zzfeh zzfeh = this.zzh;
        if (zzfeh != null) {
            zzfeh.zzq();
        } else {
            zzffo.zza(this.zzd, zzfef.zza);
        }
    }

    public final void zzr() {
    }

    public final void zzs(zzbdt zzbdt) {
        this.zzb.set(zzbdt);
    }

    public final void zzt(zzbdx zzbdx) {
        this.zzd.set(zzbdx);
    }

    public final void zzu(zzbdu zzbdu) {
        this.zzc.set(zzbdu);
    }

    public final void zzl(zzbdq zzbdq) {
        zzfeh zzfeh = this.zzh;
        if (zzfeh != null) {
            zzfeh.zzl(zzbdq);
        } else {
            zzffo.zza(this.zzb, new zzfdz(zzbdq));
        }
    }

    public final void zza(zze zze2) {
        zzfeh zzfeh = this.zzh;
        if (zzfeh != null) {
            zzfeh.zza(zze2);
            return;
        }
        zzffo.zza(this.zzb, new zzfds(zze2));
        zzffo.zza(this.zzb, new zzfdy(zze2));
    }
}
