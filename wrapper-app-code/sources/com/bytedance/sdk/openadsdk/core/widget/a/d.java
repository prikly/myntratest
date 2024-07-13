package com.bytedance.sdk.openadsdk.core.widget.a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.b.n;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.utils.i;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTWebViewClient */
public class d extends SSWebView.a {
    private static final HashSet<String> i;

    /* renamed from: a  reason: collision with root package name */
    private boolean f1797a = false;

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f1798b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    protected final w f1799c;

    /* renamed from: d  reason: collision with root package name */
    protected final Context f1800d;

    /* renamed from: e  reason: collision with root package name */
    protected final String f1801e;

    /* renamed from: f  reason: collision with root package name */
    protected n f1802f;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f1803g = true;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f1804h = true;

    public d(Context context, w wVar, String str, n nVar, boolean z) {
        this.f1800d = context;
        this.f1799c = wVar;
        this.f1801e = str;
        this.f1802f = nVar;
        this.f1797a = z;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        n nVar = this.f1802f;
        if (nVar != null) {
            nVar.a(webView, webResourceRequest);
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        l.b("WebChromeClient", "shouldOverrideUrlLoading " + str);
        try {
            Uri parse = Uri.parse(str);
            if ("bytedance".equals(parse.getScheme().toLowerCase())) {
                i.a(parse, this.f1799c);
                return true;
            } else if (a(str)) {
                return true;
            } else {
                if (!o.a(str)) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(parse);
                    intent.addFlags(268435456);
                    this.f1800d.startActivity(intent);
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        } catch (Throwable th) {
            l.b("WebChromeClient", "shouldOverrideUrlLoading", th);
            w wVar = this.f1799c;
            if (wVar != null && wVar.d()) {
                return true;
            }
        }
    }

    public void onPageFinished(WebView webView, String str) {
        if (l.a()) {
            l.a("WebChromeClient", "onPageFinished " + str);
        }
        n nVar = this.f1802f;
        if (nVar != null) {
            nVar.a(webView, str, this.f1797a);
        }
        super.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        n nVar = this.f1802f;
        if (nVar != null) {
            nVar.a(webView, str, bitmap);
        }
        if (this.f1804h) {
            b.a(this.f1800d).a(Build.VERSION.SDK_INT >= 19).b(webView.getSettings().getBuiltInZoomControls()).a(webView);
        }
    }

    public void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        n nVar = this.f1802f;
        if (nVar != null) {
            nVar.a(webView, i2, str, str2, b(str2));
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.f1802f != null && webResourceError != null) {
            Uri url = webResourceRequest.getUrl();
            String str = "";
            String uri = url != null ? url.toString() : str;
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (requestHeaders.containsKey("accept")) {
                str = requestHeaders.get("accept");
            }
            this.f1802f.a(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), uri, str);
        }
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.f1802f != null && webResourceResponse != null) {
            Uri url = webResourceRequest.getUrl();
            String str = "";
            String uri = url != null ? url.toString() : str;
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            if (requestHeaders.containsKey("accept")) {
                str = requestHeaders.get("accept");
            }
            this.f1802f.a(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), uri, str);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.f1802f != null) {
            int i2 = 0;
            String str = "SslError: unknown";
            String str2 = null;
            if (sslError != null) {
                try {
                    i2 = sslError.getPrimaryError();
                    str = "SslError: " + String.valueOf(sslError);
                    str2 = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str3 = str2;
            this.f1802f.a(webView, i2, str, str3, b(str3));
        }
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if ("play.google.com".equals(parse.getHost())) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.setPackage("com.android.vending");
                this.f1800d.startActivity(intent);
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        i = hashSet;
        hashSet.add("png");
        i.add("ico");
        i.add("jpg");
        i.add("gif");
        i.add("svg");
        i.add("jpeg");
    }

    protected static String b(String str) {
        int lastIndexOf;
        String substring;
        if (str == null || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf == str.length() - 1 || (substring = str.substring(lastIndexOf)) == null || !i.contains(substring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/" + substring;
    }
}
