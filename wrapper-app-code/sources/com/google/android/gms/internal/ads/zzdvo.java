package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdvo extends VideoController.VideoLifecycleCallbacks {
    private final zzdqg zza;

    public zzdvo(zzdqg zzdqg) {
        this.zza = zzdqg;
    }

    private static zzdt zza(zzdqg zzdqg) {
        zzdq zzj = zzdqg.zzj();
        if (zzj == null) {
            return null;
        }
        try {
            return zzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void onVideoEnd() {
        zzdt zza2 = zza(this.zza);
        if (zza2 != null) {
            try {
                zza2.zze();
            } catch (RemoteException e2) {
                zze.zzk("Unable to call onVideoEnd()", e2);
            }
        }
    }

    public final void onVideoPause() {
        zzdt zza2 = zza(this.zza);
        if (zza2 != null) {
            try {
                zza2.zzg();
            } catch (RemoteException e2) {
                zze.zzk("Unable to call onVideoEnd()", e2);
            }
        }
    }

    public final void onVideoStart() {
        zzdt zza2 = zza(this.zza);
        if (zza2 != null) {
            try {
                zza2.zzi();
            } catch (RemoteException e2) {
                zze.zzk("Unable to call onVideoEnd()", e2);
            }
        }
    }
}
