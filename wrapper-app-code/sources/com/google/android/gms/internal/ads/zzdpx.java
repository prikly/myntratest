package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdpx implements Runnable {
    public final /* synthetic */ zzdqb zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzdpx(zzdqb zzdqb, boolean z) {
        this.zza = zzdqb;
        this.zzb = z;
    }

    public final void run() {
        this.zza.zzu(this.zzb);
    }
}
