package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdzc;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzi implements Runnable {
    public final /* synthetic */ zzac zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzdzc zzd;

    public /* synthetic */ zzi(zzac zzac, String str, String str2, zzdzc zzdzc) {
        this.zza = zzac;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzdzc;
    }

    public final void run() {
        this.zza.zzJ(this.zzb, this.zzc, this.zzd);
    }
}
