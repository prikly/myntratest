package com.google.android.gms.ads.nonagon.signalgeneration;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzo implements Runnable {
    public final /* synthetic */ zzac zza;
    public final /* synthetic */ WebView zzb;

    public /* synthetic */ zzo(zzac zzac, WebView webView) {
        this.zza = zzac;
        this.zzb = webView;
    }

    public final void run() {
        this.zza.zzH(this.zzb);
    }
}
