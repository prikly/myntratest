package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbd {
    /* access modifiers changed from: private */
    public final List zza = new ArrayList();
    /* access modifiers changed from: private */
    public final List zzb = new ArrayList();
    /* access modifiers changed from: private */
    public final List zzc = new ArrayList();

    public final zzbd zza(String str, double d2, double d3) {
        int i = 0;
        while (i < this.zza.size()) {
            double doubleValue = ((Double) this.zzc.get(i)).doubleValue();
            double doubleValue2 = ((Double) this.zzb.get(i)).doubleValue();
            if (d2 < doubleValue || (doubleValue == d2 && d3 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.zza.add(i, str);
        this.zzc.add(i, Double.valueOf(d2));
        this.zzb.add(i, Double.valueOf(d3));
        return this;
    }

    public final zzbf zzb() {
        return new zzbf(this, (zzbe) null);
    }
}
