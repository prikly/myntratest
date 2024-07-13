package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final /* synthetic */ class zzbri implements OnH5AdsEventListener {
    public final /* synthetic */ WebView zza;

    public /* synthetic */ zzbri(WebView webView) {
        this.zza = webView;
    }

    public final void onH5AdsEvent(String str) {
        WebView webView = this.zza;
        int i = zzbrj.zza;
        webView.evaluateJavascript(str, (ValueCallback) null);
    }
}
