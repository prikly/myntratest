package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfqo {
    private static zzfqo zza;
    private float zzb = 0.0f;
    private final zzfqh zzc;
    private final zzfqf zzd;
    private zzfqg zze;
    private zzfqi zzf;

    public zzfqo(zzfqh zzfqh, zzfqf zzfqf) {
        this.zzc = zzfqh;
        this.zzd = zzfqf;
    }

    public static zzfqo zzb() {
        if (zza == null) {
            zza = new zzfqo(new zzfqh(), new zzfqf());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zze = new zzfqg(new Handler(), context, new zzfqe(), this, (byte[]) null);
    }

    public final void zzd(float f2) {
        this.zzb = f2;
        if (this.zzf == null) {
            this.zzf = zzfqi.zza();
        }
        for (zzfpx zzg : this.zzf.zzb()) {
            zzg.zzg().zzh(f2);
        }
    }

    public final void zze() {
        zzfqj.zza().zzd(this);
        zzfqj.zza().zzb();
        zzfrk.zzd().zzi();
        this.zze.zza();
    }

    public final void zzf() {
        zzfrk.zzd().zzj();
        zzfqj.zza().zzc();
        this.zze.zzb();
    }
}
