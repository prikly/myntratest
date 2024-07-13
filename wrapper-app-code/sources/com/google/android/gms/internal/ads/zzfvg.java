package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfvg extends zzfvd {
    private static zzfvg zzc;

    private zzfvg(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzfvg zzi(Context context) {
        zzfvg zzfvg;
        synchronized (zzfvg.class) {
            if (zzc == null) {
                zzc = new zzfvg(context);
            }
            zzfvg = zzc;
        }
        return zzfvg;
    }

    public final zzfvc zzh(long j, boolean z) throws IOException {
        synchronized (zzfvg.class) {
            if (!zzo()) {
                zzfvc zzfvc = new zzfvc();
                return zzfvc;
            }
            zzfvc zzb = zzb((String) null, (String) null, j, z);
            return zzb;
        }
    }

    public final void zzj() throws IOException {
        synchronized (zzfvg.class) {
            if (zzg(false)) {
                zzf(false);
            }
        }
    }

    public final void zzk() throws IOException {
        this.zzb.zze("paidv2_publisher_option");
    }

    public final void zzl() throws IOException {
        this.zzb.zze("paidv2_user_option");
    }

    public final void zzm(boolean z) throws IOException {
        this.zzb.zzd("paidv2_user_option", Boolean.valueOf(z));
    }

    public final void zzn(boolean z) throws IOException {
        this.zzb.zzd("paidv2_publisher_option", Boolean.valueOf(z));
        if (!z) {
            zzj();
        }
    }

    public final boolean zzo() {
        return this.zzb.zzf("paidv2_publisher_option", true);
    }

    public final boolean zzp() {
        return this.zzb.zzf("paidv2_user_option", true);
    }
}
