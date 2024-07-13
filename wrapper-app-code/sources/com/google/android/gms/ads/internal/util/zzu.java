package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzchh;
import com.unity3d.services.core.request.metrics.MetricCommonTags;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzu extends zzt {
    static final boolean zzf(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    public final boolean zze(Activity activity, Configuration configuration) {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzeo)).booleanValue()) {
            return false;
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzeq)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        zzay.zzb();
        int zzy = zzchh.zzy(activity, configuration.screenHeightDp);
        int zzy2 = zzchh.zzy(activity, configuration.screenWidthDp);
        zzt.zzp();
        DisplayMetrics zzr = zzs.zzr((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = zzr.heightPixels;
        int i2 = zzr.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) zzba.zzc().zzb(zzbjj.zzem)).intValue();
        if (!zzf(i, zzy + dimensionPixelSize, round) || !zzf(i2, zzy2, round)) {
            return true;
        }
        return false;
    }
}
