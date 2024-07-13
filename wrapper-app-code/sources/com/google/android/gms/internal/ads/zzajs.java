package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzajs {
    private int zza = IronSourceConstants.IS_INSTANCE_NOT_FOUND;
    private int zzb;

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final void zzc(zzakn zzakn) throws zzakn {
        int i = this.zzb + 1;
        this.zzb = i;
        int i2 = this.zza;
        this.zza = i2 + ((int) ((float) i2));
        if (i > 1) {
            throw zzakn;
        }
    }
}
