package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzry {
    private static final AtomicLong zzd = new AtomicLong();
    public final zzfc zza;
    public final Uri zzb;
    public final Map zzc;

    public zzry(long j, zzfc zzfc, Uri uri, Map map, long j2, long j3, long j4) {
        this.zza = zzfc;
        this.zzb = uri;
        this.zzc = map;
    }

    public static long zza() {
        return zzd.getAndIncrement();
    }
}
