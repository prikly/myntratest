package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjj;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzx extends zzv {
    static final /* synthetic */ WindowInsets zzl(Activity activity, View view, WindowInsets windowInsets) {
        if (zzt.zzo().zzh().zzm() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                zzg zzh = zzt.zzo().zzh();
                for (Rect next : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", new Object[]{Integer.valueOf(next.left), Integer.valueOf(next.top), Integer.valueOf(next.right), Integer.valueOf(next.bottom)});
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    str = str.concat(String.valueOf(format));
                }
                zzh.zzC(str);
            } else {
                zzt.zzo().zzh().zzC(str);
            }
        }
        zzo(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void zzo(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = 1;
        if (true != z) {
            i2 = 2;
        }
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    public final int zzj(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    public final void zzk(Activity activity) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzaZ)).booleanValue() && zzt.zzo().zzh().zzm() == null && !activity.isInMultiWindowMode()) {
            zzo(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new zzw(this, activity));
        }
    }
}
