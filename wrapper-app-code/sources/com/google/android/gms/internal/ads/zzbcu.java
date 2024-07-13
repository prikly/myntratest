package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbcu implements Runnable {
    final ValueCallback zza = new zzbct(this, this.zzb, this.zzc, this.zzd);
    final /* synthetic */ zzbcm zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbcw zze;

    zzbcu(zzbcw zzbcw, zzbcm zzbcm, WebView webView, boolean z) {
        this.zze = zzbcw;
        this.zzb = zzbcm;
        this.zzc = webView;
        this.zzd = z;
    }

    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
