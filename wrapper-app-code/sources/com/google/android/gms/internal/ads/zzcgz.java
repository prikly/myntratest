package com.google.android.gms.internal.ads;

import com.appodeal.ads.adapters.admob.BuildConfig;
import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcgz {
    private BigInteger zza = BigInteger.ONE;
    private String zzb = BuildConfig.ADAPTER_VERSION;

    public final synchronized String zza() {
        String bigInteger;
        bigInteger = this.zza.toString();
        this.zza = this.zza.add(BigInteger.ONE);
        this.zzb = bigInteger;
        return bigInteger;
    }

    public final synchronized String zzb() {
        return this.zzb;
    }
}
