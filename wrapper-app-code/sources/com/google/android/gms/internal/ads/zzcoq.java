package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcoq extends zzcor {
    public zzcoq(zzcno zzcno, zzbew zzbew, boolean z) {
        super(zzcno, zzbew, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzN(webView, str, (Map) null);
    }
}
