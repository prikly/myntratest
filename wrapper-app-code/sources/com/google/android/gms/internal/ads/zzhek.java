package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzhek {
    final LinkedHashMap zza;

    zzhek(int i) {
        this.zza = zzhem.zzb(i);
    }

    /* access modifiers changed from: package-private */
    public final zzhek zza(Object obj, zzhfc zzhfc) {
        LinkedHashMap linkedHashMap = this.zza;
        zzhex.zza(obj, "key");
        zzhex.zza(zzhfc, IronSourceConstants.EVENTS_PROVIDER);
        linkedHashMap.put(obj, zzhfc);
        return this;
    }
}
