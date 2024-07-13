package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzxp implements zzxo {
    private final WindowManager zza;

    private zzxp(WindowManager windowManager) {
        this.zza = windowManager;
    }

    public static zzxo zzc(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zzxp(windowManager);
        }
        return null;
    }

    public final void zza() {
    }

    public final void zzb(zzxm zzxm) {
        zzxs.zzb(zzxm.zza, this.zza.getDefaultDisplay());
    }
}
