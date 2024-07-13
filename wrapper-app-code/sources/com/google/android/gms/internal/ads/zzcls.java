package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcls extends zzb {
    final zzcjx zza;
    final zzcma zzb;
    private final String zzc;
    private final String[] zzd;

    zzcls(zzcjx zzcjx, zzcma zzcma, String str, String[] strArr) {
        this.zza = zzcjx;
        this.zzb = zzcma;
        this.zzc = str;
        this.zzd = strArr;
        zzt.zzy().zzb(this);
    }

    public final void zza() {
        try {
            this.zzb.zzr(this.zzc, this.zzd);
        } finally {
            zzs.zza.post(new zzclr(this));
        }
    }

    public final zzgfb zzb() {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzbM)).booleanValue() || !(this.zzb instanceof zzcmj)) {
            return super.zzb();
        }
        return zzcib.zze.zzb(new zzclq(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean zzd() throws Exception {
        return Boolean.valueOf(this.zzb.zzs(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
