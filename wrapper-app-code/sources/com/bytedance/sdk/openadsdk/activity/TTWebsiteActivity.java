package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.b;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.common.e;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.q;
import java.util.HashMap;

public class TTWebsiteActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private String f175a = null;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public e f176b;

    public static void a(Context context, n nVar, String str) {
        if (context != null) {
            com.bytedance.sdk.openadsdk.b.e.b(context, nVar, str, "open_policy");
            if (!TextUtils.isEmpty(m.h().s())) {
                String jSONObject = nVar != null ? nVar.ar().toString() : "";
                Intent intent = new Intent(context, TTWebsiteActivity.class);
                intent.putExtra("metaString", jSONObject);
                b.a(context, intent, (b.a) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        final String stringExtra = getIntent().getStringExtra("metaString");
        setContentView(t.f(this, "tt_activity_website"));
        final WebView webView = (WebView) findViewById(t.e(this, "tt_ad_website"));
        final ImageView imageView = (ImageView) findViewById(t.e(this, "tt_titlebar_close"));
        final ProgressBar progressBar = (ProgressBar) findViewById(t.e(this, "tt_titlebar_browser_progress"));
        ((ImageView) findViewById(t.e(this, "tt_titlebar_back"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (webView.canGoBack()) {
                    webView.goBack();
                } else {
                    TTWebsiteActivity.this.finish();
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTWebsiteActivity.this.finish();
            }
        });
        imageView.setVisibility(4);
        imageView.setClickable(false);
        ((TextView) findViewById(t.e(this, "tt_titlebar_title"))).setText(t.a(this, "tt_privacy_title"));
        ((ImageView) findViewById(t.e(this, "tt_titlebar_go_to_webview"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW");
                String url = webView.getUrl();
                if (!TextUtils.isEmpty(url)) {
                    intent.setData(Uri.parse(url));
                    b.a(TTWebsiteActivity.this, intent, (b.a) null);
                }
            }
        });
        ((ImageView) findViewById(t.e(this, "tt_titlebar_debug_info"))).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (TTWebsiteActivity.this.f176b == null) {
                    e unused = TTWebsiteActivity.this.f176b = new e(TTWebsiteActivity.this);
                    TTWebsiteActivity.this.f176b.a(stringExtra);
                    TTWebsiteActivity.this.f176b.setCanceledOnTouchOutside(false);
                }
                TTWebsiteActivity.this.f176b.show();
            }
        });
        if (m.h() != null) {
            this.f175a = m.h().s();
        }
        l.e("TTWebsiteActivity", "mWebsiteUrl=" + this.f175a);
        if (this.f175a != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                webView.getSettings().setMixedContentMode(0);
            }
            try {
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setSavePassword(false);
                webView.getSettings().setAllowFileAccess(false);
            } catch (Throwable unused) {
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
            try {
                webView.loadUrl(this.f175a, hashMap);
            } catch (Throwable unused2) {
                webView.loadUrl(this.f175a);
            }
            webView.setWebChromeClient(new WebChromeClient() {
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (progressBar != null && !TTWebsiteActivity.this.isFinishing()) {
                        if (i == 100) {
                            progressBar.setVisibility(8);
                            if (webView.canGoBack()) {
                                imageView.setVisibility(0);
                                imageView.setClickable(true);
                                return;
                            }
                            imageView.setVisibility(4);
                            imageView.setClickable(false);
                            return;
                        }
                        progressBar.setVisibility(0);
                        progressBar.setProgress(i);
                    }
                }
            });
            webView.setWebViewClient(new SSWebView.a() {
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    l.e("TTWebsiteActivity", "shouldOverrideUrlLoading invoke....view=" + webView + ",request=" + webResourceRequest);
                    if (webView == null || webResourceRequest == null) {
                        return false;
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        webView.loadUrl(webResourceRequest.getUrl().toString());
                        l.e("TTWebsiteActivity", "shouldOverrideUrlLoading invoke....url1=" + webResourceRequest.getUrl().toString());
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.toString());
                    l.e("TTWebsiteActivity", "shouldOverrideUrlLoading invoke....url2=" + webResourceRequest.toString());
                    return true;
                }

                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    l.e("TTWebsiteActivity", "onPageFinished invoke....url=" + str);
                }

                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    l.e("TTWebsiteActivity", "onReceivedHttpError invoke....errorResponse=" + webResourceResponse);
                }

                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    l.e("TTWebsiteActivity", "onReceivedError invoke....onReceivedError=" + webResourceError.getErrorCode());
                }

                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    l.e("TTWebsiteActivity", "onReceivedError invoke....description=" + str + ",failingUrl=" + str2);
                }
            });
            q.a(webView);
            return;
        }
        finish();
    }
}
