package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaqs implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzaqt zza;

    zzaqs(zzaqt zzaqt) {
        this.zza = zzaqt;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        zzaqt zzaqt = this.zza;
        if (zzaqt.zzc > 0 && currentTimeMillis >= zzaqt.zzc) {
            zzaqt.zzd = currentTimeMillis - zzaqt.zzc;
        }
        this.zza.zze = false;
    }
}
