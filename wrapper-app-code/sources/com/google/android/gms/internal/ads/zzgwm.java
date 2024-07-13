package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgwm implements Comparator {
    zzgwm() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgwv zzgwv = (zzgwv) obj;
        zzgwv zzgwv2 = (zzgwv) obj2;
        zzgwp zzs = zzgwv.iterator();
        zzgwp zzs2 = zzgwv2.iterator();
        while (zzs.hasNext() && zzs2.hasNext()) {
            int compareTo = Integer.valueOf(zzs.zza() & 255).compareTo(Integer.valueOf(zzs2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzgwv.zzd()).compareTo(Integer.valueOf(zzgwv2.zzd()));
    }
}
