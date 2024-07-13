package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzauv {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ zzauv(MediaCodec.CryptoInfo cryptoInfo, zzauu zzauu) {
        this.zza = cryptoInfo;
    }

    static /* bridge */ /* synthetic */ void zza(zzauv zzauv, int i, int i2) {
        zzauv.zzb.set(0, 0);
        zzauv.zza.setPattern(zzauv.zzb);
    }
}
