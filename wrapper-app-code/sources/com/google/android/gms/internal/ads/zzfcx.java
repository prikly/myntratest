package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzch;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfcx implements Callable {
    public static final /* synthetic */ zzfcx zza = new zzfcx();

    private /* synthetic */ zzfcx() {
    }

    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) zzba.zzc().zzb(zzbjj.zzI);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) zzba.zzc().zzb(zzbjj.zzJ)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, zzch.zza(str2));
                }
            }
        }
        return new zzfcz(hashMap);
    }
}
