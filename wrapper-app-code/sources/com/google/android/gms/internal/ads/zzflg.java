package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzflg {
    private final HashMap zza = new HashMap();

    public final zzflf zza(zzfkw zzfkw, Context context, zzfko zzfko, zzflm zzflm) {
        zzflf zzflf = (zzflf) this.zza.get(zzfkw);
        if (zzflf != null) {
            return zzflf;
        }
        zzfkt zzfkt = new zzfkt(zzfkz.zza(zzfkw, context));
        zzflf zzflf2 = new zzflf(zzfkt, new zzflo(zzfkt, zzfko, zzflm));
        this.zza.put(zzfkw, zzflf2);
        return zzflf2;
    }
}
