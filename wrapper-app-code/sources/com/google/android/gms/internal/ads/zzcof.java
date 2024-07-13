package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import io.bidmachine.utils.IabUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcof implements zzbqd {
    final /* synthetic */ zzcoh zza;

    zzcof(zzcoh zzcoh) {
        this.zza = zzcoh;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcno zzcno = (zzcno) obj;
        if (map != null) {
            String str = (String) map.get(IabUtils.KEY_HEIGHT);
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.zza) {
                        zzcoh zzcoh = this.zza;
                        if (zzcoh.zzG != parseInt) {
                            zzcoh.zzG = parseInt;
                            this.zza.requestLayout();
                        }
                    }
                } catch (Exception e2) {
                    zze.zzk("Exception occurred while getting webview content height", e2);
                }
            }
        }
    }
}
