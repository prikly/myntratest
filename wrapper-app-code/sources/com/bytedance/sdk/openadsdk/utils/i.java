package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.core.w;

/* compiled from: JsBridgeUtils */
public class i {
    public static void a(Uri uri, w wVar) {
        if (wVar != null && wVar.a(uri)) {
            try {
                wVar.b(uri);
            } catch (Exception e2) {
                l.d("WebView", "TTAndroidObj handleUri exception: " + e2);
            }
        }
    }

    public static String a(WebView webView, int i) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news" + " open_news_u_s/" + i;
    }
}
