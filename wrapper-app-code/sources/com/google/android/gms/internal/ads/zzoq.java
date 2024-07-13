package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzoq {
    final /* synthetic */ zzos zza;
    private final Handler zzb = new Handler(Looper.myLooper());
    private final AudioTrack.StreamEventCallback zzc;

    public zzoq(zzos zzos) {
        this.zza = zzos;
        this.zzc = new zzop(this, zzos);
    }

    public final void zza(AudioTrack audioTrack) {
        audioTrack.registerStreamEventCallback(new zzoo(this.zzb), this.zzc);
    }

    public final void zzb(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages((Object) null);
    }
}
