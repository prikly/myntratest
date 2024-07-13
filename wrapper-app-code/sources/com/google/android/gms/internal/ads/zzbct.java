package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzbct implements ValueCallback {
    public final /* synthetic */ zzbcu zza;
    public final /* synthetic */ zzbcm zzb;
    public final /* synthetic */ WebView zzc;
    public final /* synthetic */ boolean zzd;

    public /* synthetic */ zzbct(zzbcu zzbcu, zzbcm zzbcm, WebView webView, boolean z) {
        this.zza = zzbcu;
        this.zzb = zzbcm;
        this.zzc = webView;
        this.zzd = z;
    }

    public final void onReceiveValue(Object obj) {
        zzbcu zzbcu = this.zza;
        zzbcm zzbcm = this.zzb;
        WebView webView = this.zzc;
        boolean z = this.zzd;
        zzbcu.zze.zzd(zzbcm, webView, (String) obj, z);
    }
}
