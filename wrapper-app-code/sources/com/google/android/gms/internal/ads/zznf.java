package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zznf implements Runnable {
    public final /* synthetic */ zznp zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zznf(zznp zznp, Exception exc) {
        this.zza = zznp;
        this.zzb = exc;
    }

    public final void run() {
        this.zza.zzh(this.zzb);
    }
}
