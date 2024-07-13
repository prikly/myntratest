package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdgw extends zzdjx implements zzdfh, zzdgm {
    private final zzfil zzb;
    private final AtomicBoolean zzc = new AtomicBoolean();

    public zzdgw(Set set, zzfil zzfil) {
        super(set);
        this.zzb = zzfil;
    }

    private final void zzb() {
        zzs zzs;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzgY)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzs = this.zzb.zzag) != null && zzs.zza == 3) {
            zzo(new zzdgv(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzdgy zzdgy) throws Exception {
        zzdgy.zzg(this.zzb.zzag);
    }

    public final void zzh() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    public final void zzl() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
