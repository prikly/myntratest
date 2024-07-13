package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfjk {
    public static zzq zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfim zzfim = (zzfim) it.next();
            if (zzfim.zzc) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzfim.zza, zzfim.zzb));
            }
        }
        return new zzq(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzfim zzb(List list, zzfim zzfim) {
        return (zzfim) list.get(0);
    }

    public static zzfim zzc(zzq zzq) {
        return zzq.zzi ? new zzfim(-3, 0, true) : new zzfim(zzq.zze, zzq.zzb, false);
    }
}
