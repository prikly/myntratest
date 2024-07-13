package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdvs implements Runnable {
    public final /* synthetic */ zzcno zza;

    public /* synthetic */ zzdvs(zzcno zzcno) {
        this.zza = zzcno;
    }

    public final void run() {
        this.zza.destroy();
    }
}
