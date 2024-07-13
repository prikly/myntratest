package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.ironsource.sdk.utils.b;
import java.util.List;

public class OpenUrlActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private static final int f9085a = SDKUtils.generateViewId();

    /* renamed from: b  reason: collision with root package name */
    private static final int f9086b = SDKUtils.generateViewId();

    /* renamed from: c  reason: collision with root package name */
    private WebView f9087c = null;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public x f9088d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public ProgressBar f9089e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9090f;

    /* renamed from: g  reason: collision with root package name */
    private RelativeLayout f9091g;

    /* renamed from: h  reason: collision with root package name */
    private String f9092h;
    /* access modifiers changed from: private */
    public Handler i = new Handler();
    /* access modifiers changed from: private */
    public boolean j = false;
    /* access modifiers changed from: private */
    public final Runnable k = new Runnable() {
        public final void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.j));
        }
    };

    class a extends WebViewClient {
        private a() {
        }

        /* synthetic */ a(OpenUrlActivity openUrlActivity, byte b2) {
            this();
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.f9089e.setVisibility(4);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.f9089e.setVisibility(0);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e("OpenUrlActivity", "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            List<String> b2 = b.a().b();
            if (!b2.isEmpty()) {
                for (String contains : b2) {
                    if (str.contains(contains)) {
                        try {
                            OpenUrlActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            OpenUrlActivity.this.f9088d.i();
                        } catch (Exception e2) {
                            StringBuilder sb = new StringBuilder();
                            if (e2 instanceof ActivityNotFoundException) {
                                sb.append("no activity to handle url");
                            } else {
                                sb.append("activity failed to open with unspecified reason");
                            }
                            if (OpenUrlActivity.this.f9088d != null) {
                                x d2 = OpenUrlActivity.this.f9088d;
                                String sb2 = sb.toString();
                                if (TextUtils.isEmpty(str)) {
                                    str = "unknown url";
                                }
                                d2.b(x.b("failedToStartStoreActivity", x.a("errMsg", TextUtils.isEmpty(sb2) ? "activity failed to open with unspecified reason" : sb2, "url", str, (String) null, (String) null, (String) null, (String) null, (String) null, false)));
                            }
                        }
                        OpenUrlActivity.this.finish();
                        return true;
                    }
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public void finish() {
        x xVar;
        if (this.f9090f && (xVar = this.f9088d) != null) {
            xVar.e("secondaryClose");
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f9087c.stopLoading();
        this.f9087c.clearHistory();
        try {
            this.f9087c.loadUrl(str);
        } catch (Throwable th) {
            Logger.e("OpenUrlActivity", "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    public void onBackPressed() {
        if (this.f9087c.canGoBack()) {
            this.f9087c.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i("OpenUrlActivity", "onCreate()");
        try {
            this.f9088d = (x) com.ironsource.sdk.d.b.a((Context) this).f9426a.f9133a;
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            Bundle extras = getIntent().getExtras();
            this.f9092h = extras.getString(x.f9294c);
            this.f9090f = extras.getBoolean(x.f9295d);
            boolean booleanExtra = getIntent().getBooleanExtra("immersive", false);
            this.j = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                    public final void onSystemUiVisibilityChange(int i) {
                        if ((i & 4098) == 0) {
                            OpenUrlActivity.this.i.removeCallbacks(OpenUrlActivity.this.k);
                            OpenUrlActivity.this.i.postDelayed(OpenUrlActivity.this.k, 500);
                        }
                    }
                });
                runOnUiThread(this.k);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f9091g = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e2) {
            e2.printStackTrace();
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.f9087c;
        if (webView != null) {
            webView.destroy();
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (this.j && (i2 == 25 || i2 == 24)) {
            this.i.postDelayed(this.k, 500);
        }
        return super.onKeyDown(i2, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        ViewGroup viewGroup;
        super.onPause();
        x xVar = this.f9088d;
        if (xVar != null) {
            xVar.a(false, "secondary");
            if (this.f9091g != null && (viewGroup = (ViewGroup) this.f9087c.getParent()) != null) {
                if (viewGroup.findViewById(f9085a) != null) {
                    viewGroup.removeView(this.f9087c);
                }
                if (viewGroup.findViewById(f9086b) != null) {
                    viewGroup.removeView(this.f9089e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f9087c == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f9087c = webView;
            webView.setId(f9085a);
            this.f9087c.getSettings().setJavaScriptEnabled(true);
            this.f9087c.setWebViewClient(new a(this, (byte) 0));
            loadUrl(this.f9092h);
        }
        if (findViewById(f9085a) == null) {
            this.f9091g.addView(this.f9087c, new RelativeLayout.LayoutParams(-1, -1));
        }
        if (this.f9089e == null) {
            this.f9089e = Build.VERSION.SDK_INT >= 11 ? new ProgressBar(new ContextThemeWrapper(this, 16973939)) : new ProgressBar(this);
            this.f9089e.setId(f9086b);
        }
        if (findViewById(f9086b) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.f9089e.setLayoutParams(layoutParams);
            this.f9089e.setVisibility(4);
            this.f9091g.addView(this.f9089e);
        }
        x xVar = this.f9088d;
        if (xVar != null) {
            xVar.a(true, "secondary");
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.j && z) {
            runOnUiThread(this.k);
        }
    }
}
