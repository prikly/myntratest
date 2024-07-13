package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbpr implements zzbqd {
    zzbpr() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcno zzcno = (zzcno) obj;
        try {
            zzfvf.zzj(zzcno.getContext()).zzk();
            zzfvg.zzi(zzcno.getContext()).zzj();
        } catch (IOException e2) {
            zzt.zzo().zzu(e2, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
