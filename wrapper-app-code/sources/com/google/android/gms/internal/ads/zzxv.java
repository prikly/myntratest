package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzxv implements Runnable {
    public final /* synthetic */ zzyd zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zzxv(zzyd zzyd, Exception exc) {
        this.zza = zzyd;
        this.zzb = exc;
    }

    public final void run() {
        this.zza.zzo(this.zzb);
    }
}
