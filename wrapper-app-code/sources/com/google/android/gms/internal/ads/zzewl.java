package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzf;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzewl implements zzezm {
    private final zzgfc zza;
    private final zzfjg zzb;

    zzewl(zzgfc zzgfc, zzfjg zzfjg) {
        this.zza = zzgfc;
        this.zzb = zzfjg;
    }

    public final int zza() {
        return 21;
    }

    public final zzgfb zzb() {
        return this.zza.zzb(new zzewk(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzewm zzc() throws Exception {
        return new zzewm("requester_type_2".equals(zzf.zzb(this.zzb.zzd)));
    }
}
