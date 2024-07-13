package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzqh {
    public final zzqm zza;
    public final MediaFormat zzb;
    public final zzaf zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;

    private zzqh(zzqm zzqm, MediaFormat mediaFormat, zzaf zzaf, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.zza = zzqm;
        this.zzb = mediaFormat;
        this.zzc = zzaf;
        this.zzd = surface;
    }

    public static zzqh zza(zzqm zzqm, MediaFormat mediaFormat, zzaf zzaf, MediaCrypto mediaCrypto) {
        return new zzqh(zzqm, mediaFormat, zzaf, (Surface) null, (MediaCrypto) null, 0);
    }

    public static zzqh zzb(zzqm zzqm, MediaFormat mediaFormat, zzaf zzaf, Surface surface, MediaCrypto mediaCrypto) {
        return new zzqh(zzqm, mediaFormat, zzaf, surface, (MediaCrypto) null, 0);
    }
}
