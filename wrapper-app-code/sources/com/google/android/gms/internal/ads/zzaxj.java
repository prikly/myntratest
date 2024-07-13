package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.unity3d.services.core.device.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaxj implements zzaxh {
    private zzaxj() {
    }

    /* synthetic */ zzaxj(zzaxi zzaxi) {
    }

    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    public final MediaCodecInfo zzb(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public final boolean zzc(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return MimeTypes.VIDEO_H264.equals(str);
    }

    public final boolean zzd() {
        return false;
    }
}
