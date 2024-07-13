package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfpo {
    private final Context zza;
    private final Executor zzb;
    private final zzcht zzc;
    private final zzfoy zzd;

    zzfpo(Context context, Executor executor, zzcht zzcht, zzfoy zzfoy) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcht;
        this.zzd = zzfoy;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(String str, zzfow zzfow) {
        zzfol zza2 = zzfok.zza(this.zza, 14);
        zza2.zzh();
        zza2.zzf(this.zzc.zza(str));
        if (zzfow == null) {
            this.zzd.zzb(zza2.zzl());
            return;
        }
        zzfow.zza(zza2);
        zzfow.zzg();
    }

    public final void zzc(String str, zzfow zzfow) {
        if (!zzfoy.zza() || !((Boolean) zzbks.zzd.zze()).booleanValue()) {
            this.zzb.execute(new zzfpm(this, str));
        } else {
            this.zzb.execute(new zzfpn(this, str, zzfow));
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), (zzfow) null);
        }
    }
}
