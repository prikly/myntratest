package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaju implements Runnable {
    private final zzake zza;
    private final zzakk zzb;
    private final Runnable zzc;

    public zzaju(zzake zzake, zzakk zzakk, Runnable runnable) {
        this.zza = zzake;
        this.zzb = zzakk;
        this.zzc = runnable;
    }

    public final void run() {
        this.zza.zzw();
        zzakk zzakk = this.zzb;
        if (zzakk.zzc()) {
            this.zza.zzo(zzakk.zza);
        } else {
            this.zza.zzn(zzakk.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
