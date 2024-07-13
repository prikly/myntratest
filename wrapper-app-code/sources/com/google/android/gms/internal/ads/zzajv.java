package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzajv {
    private final Executor zza;

    public zzajv(Handler handler) {
        this.zza = new zzajt(this, handler);
    }

    public final void zza(zzake zzake, zzakn zzakn) {
        zzake.zzm("post-error");
        zzakk zza2 = zzakk.zza(zzakn);
        Executor executor = this.zza;
        ((zzajt) executor).zza.post(new zzaju(zzake, zza2, (Runnable) null));
    }

    public final void zzb(zzake zzake, zzakk zzakk, Runnable runnable) {
        zzake.zzq();
        zzake.zzm("post-response");
        Executor executor = this.zza;
        ((zzajt) executor).zza.post(new zzaju(zzake, zzakk, runnable));
    }
}
