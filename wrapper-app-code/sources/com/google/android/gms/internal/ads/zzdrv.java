package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdrv implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ View zza;
    public final /* synthetic */ zzcno zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ WindowManager.LayoutParams zzd;
    public final /* synthetic */ int zze;
    public final /* synthetic */ WindowManager zzf;

    public /* synthetic */ zzdrv(View view, zzcno zzcno, String str, WindowManager.LayoutParams layoutParams, int i, WindowManager windowManager) {
        this.zza = view;
        this.zzb = zzcno;
        this.zzc = str;
        this.zzd = layoutParams;
        this.zze = i;
        this.zzf = windowManager;
    }

    public final void onScrollChanged() {
        View view = this.zza;
        zzcno zzcno = this.zzb;
        String str = this.zzc;
        WindowManager.LayoutParams layoutParams = this.zzd;
        int i = this.zze;
        WindowManager windowManager = this.zzf;
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect) && zzcno.zzH().getWindowToken() != null) {
            if ("1".equals(str) || "2".equals(str)) {
                layoutParams.y = rect.bottom - i;
            } else {
                layoutParams.y = rect.top - i;
            }
            windowManager.updateViewLayout(zzcno.zzH(), layoutParams);
        }
    }
}
