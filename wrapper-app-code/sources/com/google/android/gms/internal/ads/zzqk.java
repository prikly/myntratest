package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzqk extends zzgg {
    public final zzqm zza;
    public final String zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzqk(Throwable th, zzqm zzqm) {
        super("Decoder failed: ".concat(String.valueOf(zzqm == null ? null : zzqm.zza)), th);
        String str = null;
        this.zza = zzqm;
        if (zzen.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzb = str;
    }
}
