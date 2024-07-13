package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzecl implements Runnable {
    public final /* synthetic */ zzecm zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzecl(zzecm zzecm, String str) {
        this.zza = zzecm;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzi(this.zzb);
    }
}
