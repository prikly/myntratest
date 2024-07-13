package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdve;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzm implements Runnable {
    public final /* synthetic */ zzac zza;
    public final /* synthetic */ zzdve[] zzb;

    public /* synthetic */ zzm(zzac zzac, zzdve[] zzdveArr) {
        this.zza = zzac;
        this.zzb = zzdveArr;
    }

    public final void run() {
        this.zza.zzI(this.zzb);
    }
}
