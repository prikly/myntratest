package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzetl implements zzezm {
    private final zzgfc zza;
    private final zzfjg zzb;
    private final zzfjs zzc;

    zzetl(zzgfc zzgfc, zzfjg zzfjg, zzfjs zzfjs) {
        this.zza = zzgfc;
        this.zzb = zzfjg;
        this.zzc = zzfjs;
    }

    public final int zza() {
        return 5;
    }

    public final zzgfb zzb() {
        return this.zza.zzb(new zzetk(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzetm zzc() throws Exception {
        String str = null;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzgE)).booleanValue() && "requester_type_2".equals(zzf.zzb(this.zzb.zzd))) {
            str = zzfjs.zza();
        }
        return new zzetm(str);
    }
}
