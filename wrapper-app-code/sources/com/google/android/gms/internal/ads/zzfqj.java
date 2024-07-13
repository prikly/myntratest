package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfqj implements Application.ActivityLifecycleCallbacks {
    private static final zzfqj zza = new zzfqj();
    private boolean zzb;
    private boolean zzc;
    private zzfqo zzd;

    private zzfqj() {
    }

    public static zzfqj zza() {
        return zza;
    }

    private final void zze() {
        boolean z = this.zzc;
        for (zzfpx zzg : zzfqi.zza().zzc()) {
            zzfqu zzg2 = zzg.zzg();
            if (zzg2.zzk()) {
                zzfqn.zza().zzb(zzg2.zza(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    private final void zzf(boolean z) {
        if (this.zzc != z) {
            this.zzc = z;
            if (this.zzb) {
                zze();
                if (this.zzd == null) {
                    return;
                }
                if (!z) {
                    zzfrk.zzd().zzi();
                } else {
                    zzfrk.zzd().zzh();
                }
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        zzf(false);
    }

    public final void onActivityStopped(Activity activity) {
        View zzf;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        boolean z = true;
        boolean z2 = true;
        for (zzfpx zzfpx : zzfqi.zza().zzb()) {
            if (zzfpx.zzj() && (zzf = zzfpx.zzf()) != null && zzf.hasWindowFocus()) {
                z2 = false;
            }
        }
        if (i == 100 || !z2) {
            z = false;
        }
        zzf(z);
    }

    public final void zzb() {
        this.zzb = true;
        this.zzc = false;
        zze();
    }

    public final void zzc() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = null;
    }

    public final void zzd(zzfqo zzfqo) {
        this.zzd = zzfqo;
    }
}
