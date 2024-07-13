package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdgh extends zzdjx implements zzbow {
    private final Bundle zzb = new Bundle();

    public zzdgh(Set set) {
        super(set);
    }

    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzo(zzdgg.zza);
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
