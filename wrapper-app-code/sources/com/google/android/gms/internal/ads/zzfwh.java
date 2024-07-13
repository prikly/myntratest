package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfwh {
    /* access modifiers changed from: private */
    public static final zzfwu zzb = new zzfwu("OverlayDisplayService");
    private static final Intent zzc = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzfxf zza;
    /* access modifiers changed from: private */
    public final String zzd;

    zzfwh(Context context) {
        if (zzfxi.zza(context)) {
            this.zza = new zzfxf(context.getApplicationContext(), zzb, "OverlayDisplayService", zzc, zzfwc.zza, (zzfxa) null, (byte[]) null);
        } else {
            this.zza = null;
        }
        this.zzd = context.getPackageName();
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        if (this.zza != null) {
            zzb.zzd("unbind LMD display overlay service", new Object[0]);
            this.zza.zzr();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzd(zzfvy zzfvy, zzfwm zzfwm) {
        if (this.zza == null) {
            zzb.zzb("error: %s", "Play Store not found.");
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzp(new zzfwe(this, taskCompletionSource, zzfvy, zzfwm, taskCompletionSource), taskCompletionSource);
    }

    /* access modifiers changed from: package-private */
    public final void zze(zzfwj zzfwj, zzfwm zzfwm) {
        if (this.zza == null) {
            zzb.zzb("error: %s", "Play Store not found.");
        } else if (zzfwj.zzg() == null) {
            zzb.zzb("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzfwk zzc2 = zzfwl.zzc();
            zzc2.zzb(8160);
            zzfwm.zza(zzc2.zzc());
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.zza.zzp(new zzfwd(this, taskCompletionSource, zzfwj, zzfwm, taskCompletionSource), taskCompletionSource);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzf(zzfwo zzfwo, zzfwm zzfwm, int i) {
        if (this.zza == null) {
            zzb.zzb("error: %s", "Play Store not found.");
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zza.zzp(new zzfwf(this, taskCompletionSource, zzfwo, i, zzfwm, taskCompletionSource), taskCompletionSource);
    }
}
