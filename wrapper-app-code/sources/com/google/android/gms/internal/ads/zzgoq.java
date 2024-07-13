package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgoq {
    private final zzgoj zza;
    private final List zzb;
    private final Integer zzc;

    /* synthetic */ zzgoq(zzgoj zzgoj, List list, Integer num, zzgop zzgop) {
        this.zza = zzgoj;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgoq)) {
            return false;
        }
        zzgoq zzgoq = (zzgoq) obj;
        if (this.zza.equals(zzgoq.zza) && this.zzb.equals(zzgoq.zzb)) {
            Integer num = this.zzc;
            Integer num2 = zzgoq.zzc;
            if (num == num2) {
                return true;
            }
            if (num == null || !num.equals(num2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.zza, this.zzb, this.zzc});
    }
}
