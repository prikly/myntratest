package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;
import io.bidmachine.BidMachineFetcher;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzxq implements DisplayManager.DisplayListener, zzxo {
    private final DisplayManager zza;
    private zzxm zzb;

    private zzxq(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    public static zzxo zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(BidMachineFetcher.AD_TYPE_DISPLAY);
        if (displayManager != null) {
            return new zzxq(displayManager);
        }
        return null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        zzxm zzxm = this.zzb;
        if (zzxm != null && i == 0) {
            zzxs.zzb(zzxm.zza, zzd());
        }
    }

    public final void onDisplayRemoved(int i) {
    }

    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    public final void zzb(zzxm zzxm) {
        this.zzb = zzxm;
        this.zza.registerDisplayListener(this, zzen.zzD((Handler.Callback) null));
        zzxs.zzb(zzxm.zza, zzd());
    }
}
