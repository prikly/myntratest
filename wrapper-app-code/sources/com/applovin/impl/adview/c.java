package com.applovin.impl.adview;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;

class c extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    private final v f14141a;

    /* renamed from: b  reason: collision with root package name */
    private final b f14142b;

    public c(b bVar, n nVar) {
        this.f14141a = nVar.D();
        this.f14142b = bVar;
    }

    public void onConsoleMessage(String str, int i, String str2) {
        if (v.a()) {
            v vVar = this.f14141a;
            vVar.d("AdWebView", "console.log[" + i + "] :" + str);
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message();
        if (!v.a()) {
            return true;
        }
        this.f14141a.b("AdWebView", str);
        return true;
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!v.a()) {
            return true;
        }
        v vVar = this.f14141a;
        vVar.d("AdWebView", "Alert attempted: " + str2);
        return true;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (!v.a()) {
            return true;
        }
        v vVar = this.f14141a;
        vVar.d("AdWebView", "JS onBeforeUnload attempted: " + str2);
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!v.a()) {
            return true;
        }
        v vVar = this.f14141a;
        vVar.d("AdWebView", "JS confirm attempted: " + str2);
        return true;
    }

    public void onProgressChanged(WebView webView, int i) {
        b bVar;
        if (i == 100 && (bVar = this.f14142b) != null) {
            bVar.a(webView);
        }
    }
}
