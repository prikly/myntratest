package com.bytedance.sdk.openadsdk.core.widget.a;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.b.n;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.utils.i;

/* compiled from: TTWebChromeClient */
public class c extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1794a = WebChromeClient.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final w f1795b;

    /* renamed from: c  reason: collision with root package name */
    private n f1796c;

    public c(w wVar, n nVar) {
        this.f1795b = wVar;
        this.f1796c = nVar;
    }

    public void onConsoleMessage(String str, int i, String str2) {
        if (!TextUtils.isEmpty(str)) {
            a(str);
        }
        super.onConsoleMessage(str, i, str2);
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !a(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }

    private boolean a(String str) {
        try {
            Uri parse = Uri.parse(str);
            if (!"bytedance".equals(parse.getScheme().toLowerCase())) {
                return false;
            }
            i.a(parse, this.f1795b);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        n nVar = this.f1796c;
        if (nVar != null) {
            nVar.a(webView, i);
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }
}
