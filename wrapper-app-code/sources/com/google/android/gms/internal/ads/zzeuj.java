package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzw;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeuj implements zzezl {
    private final zzw zza;
    private final zzchu zzb;
    private final boolean zzc;

    public zzeuj(zzw zzw, zzchu zzchu, boolean z) {
        this.zza = zzw;
        this.zzb = zzchu;
        this.zzc = z;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzc >= ((Integer) zzba.zzc().zzb(zzbjj.zzeI)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzeJ)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzc);
        }
        zzw zzw = this.zza;
        if (zzw != null) {
            int i = zzw.zza;
            if (i == 1) {
                bundle.putString("avo", NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON);
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
