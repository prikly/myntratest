package com.bytedance.sdk.openadsdk.common;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.b;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import org.json.JSONObject;

/* compiled from: TTBottomNewStyleManager */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f447a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final SSWebView f448b;

    /* renamed from: c  reason: collision with root package name */
    private final n f449c;

    /* renamed from: d  reason: collision with root package name */
    private final String f450d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Context f451e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f452f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f453g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f454h;
    private ImageView i;

    public d(Context context, LinearLayout linearLayout, SSWebView sSWebView, n nVar, String str) {
        this.f451e = context;
        this.f447a = linearLayout;
        this.f448b = sSWebView;
        this.f449c = nVar;
        this.f450d = str;
        c();
    }

    private void c() {
        this.f452f = (ImageView) this.f447a.findViewById(t.e(this.f451e, "tt_bottom_bar_back"));
        this.f453g = (ImageView) this.f447a.findViewById(t.e(this.f451e, "tt_bottom_bar_forward"));
        this.f454h = (ImageView) this.f447a.findViewById(t.e(this.f451e, "tt_bottom_bar_refresh"));
        this.i = (ImageView) this.f447a.findViewById(t.e(this.f451e, "tt_bottom_bar_go_to_browser"));
        this.f452f.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (d.this.f448b != null && d.this.f448b.e()) {
                    d.this.a("backward");
                    d.this.f448b.f();
                }
            }
        });
        this.f453g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (d.this.f448b != null && d.this.f448b.g()) {
                    d.this.a("forward");
                    d.this.f448b.h();
                }
            }
        });
        this.f454h.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (d.this.f448b != null) {
                    d.this.b("refresh");
                    d.this.f448b.d();
                }
            }
        });
        this.i.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (d.this.f448b != null) {
                    d.this.b("external_btn_click");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = d.this.f448b.getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        intent.setData(Uri.parse(url));
                        b.a(d.this.f451e, intent, (b.a) null);
                    }
                }
            }
        });
        this.f447a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        this.f452f.setClickable(false);
        this.f453g.setClickable(false);
        this.f452f.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
        this.f453g.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
    }

    public void a(WebView webView) {
        try {
            if (this.f452f != null) {
                if (webView.canGoBack()) {
                    this.f452f.setClickable(true);
                    this.f452f.clearColorFilter();
                } else {
                    this.f452f.setClickable(false);
                    this.f452f.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.f453g == null) {
                return;
            }
            if (webView.canGoForward()) {
                this.f453g.setClickable(true);
                this.f453g.clearColorFilter();
                return;
            }
            this.f453g.setClickable(false);
            this.f453g.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
        } catch (Throwable unused) {
        }
    }

    public void a() {
        if (this.f447a.getAlpha() == 0.0f) {
            ObjectAnimator.ofFloat(this.f447a, "alpha", new float[]{0.0f, 1.0f}).setDuration(300).start();
        }
    }

    public void b() {
        if (this.f447a.getAlpha() == 1.0f) {
            ObjectAnimator.ofFloat(this.f447a, "alpha", new float[]{1.0f, 0.0f}).setDuration(300).start();
        }
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!(this.f448b.getWebView() == null || (copyBackForwardList = this.f448b.getWebView().copyBackForwardList()) == null)) {
                int currentIndex = copyBackForwardList.getCurrentIndex();
                String url = copyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.f448b.getUrl();
                }
                String str2 = "";
                if (str.equals("backward")) {
                    str2 = copyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl();
                }
                int i2 = 1;
                if (str.equals("forward")) {
                    str2 = copyBackForwardList.getItemAtIndex(currentIndex + 1).getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("next_url", str2);
                if (copyBackForwardList.getCurrentIndex() != 0) {
                    i2 = 0;
                }
                jSONObject2.putOpt("first_page", Integer.valueOf(i2));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        e.c(m.a(), this.f449c, this.f450d, str, jSONObject);
    }

    /* access modifiers changed from: private */
    public void b(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!(this.f448b.getWebView() == null || (copyBackForwardList = this.f448b.getWebView().copyBackForwardList()) == null)) {
                String url = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex()).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.f448b.getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("url", url);
                jSONObject2.putOpt("first_page", Integer.valueOf(copyBackForwardList.getCurrentIndex() == 0 ? 1 : 0));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        e.c(m.a(), this.f449c, this.f450d, str, jSONObject);
    }
}
