package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzdzc;
import com.google.android.gms.internal.ads.zzdzm;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zze implements Runnable {
    public final /* synthetic */ zzdzm zza;
    public final /* synthetic */ zzdzc zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ Pair[] zzd;

    public /* synthetic */ zze(zzdzm zzdzm, zzdzc zzdzc, String str, Pair[] pairArr) {
        this.zza = zzdzm;
        this.zzb = zzdzc;
        this.zzc = str;
        this.zzd = pairArr;
    }

    public final void run() {
        zzf.zzd(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
