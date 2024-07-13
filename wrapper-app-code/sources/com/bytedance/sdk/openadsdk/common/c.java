package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.e.n;

/* compiled from: LandingPageNewStyleManager */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private n f439a;

    /* renamed from: b  reason: collision with root package name */
    private RelativeLayout f440b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f441c;

    /* renamed from: d  reason: collision with root package name */
    private SSWebView f442d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f443e;

    /* renamed from: f  reason: collision with root package name */
    private final String f444f;

    /* renamed from: g  reason: collision with root package name */
    private f f445g;

    /* renamed from: h  reason: collision with root package name */
    private d f446h;

    public c(Context context, n nVar, String str) {
        this.f441c = context;
        this.f439a = nVar;
        this.f444f = str;
        f();
    }

    private void f() {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.f441c).inflate(t.f(this.f441c, "tt_activity_endcard_landingpage_newstyle"), (ViewGroup) null, false);
        this.f440b = relativeLayout;
        this.f442d = (SSWebView) relativeLayout.findViewById(t.e(this.f441c, "tt_browser_webview"));
        f fVar = new f(this.f441c, (RelativeLayout) this.f440b.findViewById(t.e(this.f441c, "tt_title_bar")), this.f439a);
        this.f445g = fVar;
        this.f443e = fVar.c();
        this.f446h = new d(this.f441c, (LinearLayout) this.f440b.findViewById(t.e(this.f441c, "tt_bottom_bar")), this.f442d, this.f439a, this.f444f);
    }

    public void a() {
        f fVar = this.f445g;
        if (fVar != null) {
            fVar.a();
        }
        d dVar = this.f446h;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void b() {
        f fVar = this.f445g;
        if (fVar != null) {
            fVar.b();
        }
        d dVar = this.f446h;
        if (dVar != null) {
            dVar.b();
        }
    }

    public ImageView c() {
        return this.f443e;
    }

    public SSWebView d() {
        return this.f442d;
    }

    public View e() {
        return this.f440b;
    }

    public void a(WebView webView, int i) {
        f fVar = this.f445g;
        if (fVar != null) {
            fVar.a(webView, i);
        }
        d dVar = this.f446h;
        if (dVar != null) {
            dVar.a(webView);
        }
    }
}
