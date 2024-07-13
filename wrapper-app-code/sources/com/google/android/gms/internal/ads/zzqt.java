package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzqt implements Comparator {
    public final /* synthetic */ zzrd zza;

    public /* synthetic */ zzqt(zzrd zzrd) {
        this.zza = zzrd;
    }

    public final int compare(Object obj, Object obj2) {
        zzrd zzrd = this.zza;
        int i = zzre.zza;
        return zzrd.zza(obj2) - zzrd.zza(obj);
    }
}
