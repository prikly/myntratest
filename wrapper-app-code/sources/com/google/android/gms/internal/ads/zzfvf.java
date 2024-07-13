package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfvf extends zzfvd {
    private static zzfvf zzc;

    private zzfvf(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzfvf zzj(Context context) {
        zzfvf zzfvf;
        synchronized (zzfvf.class) {
            if (zzc == null) {
                zzc = new zzfvf(context);
            }
            zzfvf = zzc;
        }
        return zzfvf;
    }

    public final zzfvc zzh(long j, boolean z) throws IOException {
        zzfvc zzb;
        synchronized (zzfvf.class) {
            zzb = zzb((String) null, (String) null, j, z);
        }
        return zzb;
    }

    public final zzfvc zzi(String str, String str2, long j, boolean z) throws IOException {
        zzfvc zzb;
        synchronized (zzfvf.class) {
            zzb = zzb(str, str2, j, z);
        }
        return zzb;
    }

    public final void zzk() throws IOException {
        synchronized (zzfvf.class) {
            zzf(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzfvf.class) {
            zzf(true);
        }
    }
}
