package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzfvb;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzm implements Callable {
    public final /* synthetic */ WebSettings zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzm(WebSettings webSettings, Context context) {
        this.zza = webSettings;
        this.zzb = context;
    }

    public final Object call() {
        WebSettings webSettings = this.zza;
        Context context = this.zzb;
        zzfvb zzfvb = zzs.zza;
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzaE)).booleanValue()) {
            webSettings.setTextZoom(100);
        }
        webSettings.setAllowContentAccess(false);
        return true;
    }
}
