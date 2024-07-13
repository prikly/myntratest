package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zznl implements Runnable {
    public final /* synthetic */ zznp zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zznl(zznp zznp, Exception exc) {
        this.zza = zznp;
        this.zzb = exc;
    }

    public final void run() {
        this.zza.zzi(this.zzb);
    }
}
