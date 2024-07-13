package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import io.bidmachine.BidMachineFetcher;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzxf {
    public static boolean zza(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(BidMachineFetcher.AD_TYPE_DISPLAY);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr()) {
            return false;
        }
        for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }
}
